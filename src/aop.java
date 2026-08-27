import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record aop(List<aop.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<aop> d = RecordCodecBuilder.create($$0 -> $$0.group(aop.a.c.listOf().fieldOf("entries").forGetter(aop::a)).apply($$0, aop::new));
   public static final apd<aop> a = apd.a("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(aop.a::b).toList();
   }

   public List<aop.a> a() {
      return this.b;
   }

   public static record a(aua<Integer> a, String b) {
      static final Codec<aop.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(aua.a(Codec.INT).fieldOf("formats").forGetter(aop.a::a), atq.<String>a(Codec.STRING, aop::a).fieldOf("directory").forGetter(aop.a::b))
               .apply($$0, aop.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
