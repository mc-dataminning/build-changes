import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record atk(List<atk.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<atk> d = RecordCodecBuilder.create($$0 -> $$0.group(atk.a.c.listOf().fieldOf("entries").forGetter(atk::a)).apply($$0, atk::new));
   public static final atz<atk> a = new atz<>("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(atk.a::b).toList();
   }

   public List<atk.a> a() {
      return this.b;
   }

   public static record a(azc<Integer> a, String b) {
      static final Codec<atk.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(azc.a(Codec.INT).fieldOf("formats").forGetter(atk.a::a), Codec.STRING.validate(atk::a).fieldOf("directory").forGetter(atk.a::b))
               .apply($$0, atk.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
