import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record atj(List<atj.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<atj> d = RecordCodecBuilder.create($$0 -> $$0.group(atj.a.c.listOf().fieldOf("entries").forGetter(atj::a)).apply($$0, atj::new));
   public static final atz<atj> a = atz.a("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(atj.a::b).toList();
   }

   public List<atj.a> a() {
      return this.b;
   }

   public static record a(azb<Integer> a, String b) {
      static final Codec<atj.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(azb.a(Codec.INT).fieldOf("formats").forGetter(atj.a::a), Codec.STRING.validate(atj::a).fieldOf("directory").forGetter(atj.a::b))
               .apply($$0, atj.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
