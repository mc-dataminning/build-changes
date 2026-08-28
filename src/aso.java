import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record aso(List<aso.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<aso> d = RecordCodecBuilder.create($$0 -> $$0.group(aso.a.c.listOf().fieldOf("entries").forGetter(aso::a)).apply($$0, aso::new));
   public static final ate<aso> a = ate.a("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(aso.a::b).toList();
   }

   public List<aso.a> a() {
      return this.b;
   }

   public static record a(ayg<Integer> a, String b) {
      static final Codec<aso.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(ayg.a(Codec.INT).fieldOf("formats").forGetter(aso.a::a), Codec.STRING.validate(aso::a).fieldOf("directory").forGetter(aso.a::b))
               .apply($$0, aso.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
