import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record aov(List<aov.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<aov> d = RecordCodecBuilder.create($$0 -> $$0.group(aov.a.c.listOf().fieldOf("entries").forGetter(aov::a)).apply($$0, aov::new));
   public static final apj<aov> a = apj.a("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(aov.a::b).toList();
   }

   public List<aov.a> a() {
      return this.b;
   }

   public static record a(aug<Integer> a, String b) {
      static final Codec<aov.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(aug.a(Codec.INT).fieldOf("formats").forGetter(aov.a::a), atw.<String>a(Codec.STRING, aov::a).fieldOf("directory").forGetter(aov.a::b))
               .apply($$0, aov.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
