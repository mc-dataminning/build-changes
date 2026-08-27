import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record aqo(List<aqo.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<aqo> d = RecordCodecBuilder.create($$0 -> $$0.group(aqo.a.c.listOf().fieldOf("entries").forGetter(aqo::a)).apply($$0, aqo::new));
   public static final arc<aqo> a = arc.a("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(aqo.a::b).toList();
   }

   public List<aqo.a> a() {
      return this.b;
   }

   public static record a(awa<Integer> a, String b) {
      static final Codec<aqo.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(awa.a(Codec.INT).fieldOf("formats").forGetter(aqo.a::a), avq.<String>a(Codec.STRING, aqo::a).fieldOf("directory").forGetter(aqo.a::b))
               .apply($$0, aqo.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
