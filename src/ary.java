import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record ary(List<ary.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<ary> d = RecordCodecBuilder.create($$0 -> $$0.group(ary.a.c.listOf().fieldOf("entries").forGetter(ary::a)).apply($$0, ary::new));
   public static final aso<ary> a = aso.a("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(ary.a::b).toList();
   }

   public List<ary.a> a() {
      return this.b;
   }

   public static record a(axo<Integer> a, String b) {
      static final Codec<ary.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(axo.a(Codec.INT).fieldOf("formats").forGetter(ary.a::a), axe.<String>b(Codec.STRING, ary::a).fieldOf("directory").forGetter(ary.a::b))
               .apply($$0, ary.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
