import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record aro(List<aro.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<aro> d = RecordCodecBuilder.create($$0 -> $$0.group(aro.a.c.listOf().fieldOf("entries").forGetter(aro::a)).apply($$0, aro::new));
   public static final ase<aro> a = ase.a("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(aro.a::b).toList();
   }

   public List<aro.a> a() {
      return this.b;
   }

   public static record a(axe<Integer> a, String b) {
      static final Codec<aro.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(axe.a(Codec.INT).fieldOf("formats").forGetter(aro.a::a), awu.<String>b(Codec.STRING, aro::a).fieldOf("directory").forGetter(aro.a::b))
               .apply($$0, aro.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
