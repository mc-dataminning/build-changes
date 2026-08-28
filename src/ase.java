import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record ase(List<ase.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<ase> d = RecordCodecBuilder.create($$0 -> $$0.group(ase.a.c.listOf().fieldOf("entries").forGetter(ase::a)).apply($$0, ase::new));
   public static final asu<ase> a = asu.a("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(ase.a::b).toList();
   }

   public List<ase.a> a() {
      return this.b;
   }

   public static record a(axw<Integer> a, String b) {
      static final Codec<ase.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(axw.a(Codec.INT).fieldOf("formats").forGetter(ase.a::a), Codec.STRING.validate(ase::a).fieldOf("directory").forGetter(ase.a::b))
               .apply($$0, ase.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
