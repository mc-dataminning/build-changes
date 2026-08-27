import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record aqs(List<aqs.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<aqs> d = RecordCodecBuilder.create($$0 -> $$0.group(aqs.a.c.listOf().fieldOf("entries").forGetter(aqs::a)).apply($$0, aqs::new));
   public static final arg<aqs> a = arg.a("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(aqs.a::b).toList();
   }

   public List<aqs.a> a() {
      return this.b;
   }

   public static record a(awe<Integer> a, String b) {
      static final Codec<aqs.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(awe.a(Codec.INT).fieldOf("formats").forGetter(aqs.a::a), avu.<String>a(Codec.STRING, aqs::a).fieldOf("directory").forGetter(aqs.a::b))
               .apply($$0, aqs.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
