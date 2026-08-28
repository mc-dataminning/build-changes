import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record atr(List<atr.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<atr> d = RecordCodecBuilder.create($$0 -> $$0.group(atr.a.c.listOf().fieldOf("entries").forGetter(atr::a)).apply($$0, atr::new));
   public static final aug<atr> a = new aug<>("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(atr.a::b).toList();
   }

   public List<atr.a> a() {
      return this.b;
   }

   public static record a(azi<Integer> a, String b) {
      static final Codec<atr.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(azi.a(Codec.INT).fieldOf("formats").forGetter(atr.a::a), Codec.STRING.validate(atr::a).fieldOf("directory").forGetter(atr.a::b))
               .apply($$0, atr.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
