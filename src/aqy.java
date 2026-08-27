import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record aqy(List<aqy.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<aqy> d = RecordCodecBuilder.create($$0 -> $$0.group(aqy.a.c.listOf().fieldOf("entries").forGetter(aqy::a)).apply($$0, aqy::new));
   public static final aro<aqy> a = aro.a("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(aqy.a::b).toList();
   }

   public List<aqy.a> a() {
      return this.b;
   }

   public static record a(awo<Integer> a, String b) {
      static final Codec<aqy.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(awo.a(Codec.INT).fieldOf("formats").forGetter(aqy.a::a), awe.<String>b(Codec.STRING, aqy::a).fieldOf("directory").forGetter(aqy.a::b))
               .apply($$0, aqy.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
