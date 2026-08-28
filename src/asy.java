import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record asy(List<asy.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<asy> d = RecordCodecBuilder.create($$0 -> $$0.group(asy.a.c.listOf().fieldOf("entries").forGetter(asy::a)).apply($$0, asy::new));
   public static final ato<asy> a = ato.a("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(asy.a::b).toList();
   }

   public List<asy.a> a() {
      return this.b;
   }

   public static record a(ayq<Integer> a, String b) {
      static final Codec<asy.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(ayq.a(Codec.INT).fieldOf("formats").forGetter(asy.a::a), Codec.STRING.validate(asy::a).fieldOf("directory").forGetter(asy.a::b))
               .apply($$0, asy.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
