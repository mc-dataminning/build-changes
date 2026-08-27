import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record amh(List<amh.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<amh> d = RecordCodecBuilder.create($$0 -> $$0.group(amh.a.c.listOf().fieldOf("entries").forGetter(amh::a)).apply($$0, amh::new));
   public static final amv<amh> a = amv.a("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(amh.a::b).toList();
   }

   public List<amh.a> a() {
      return this.b;
   }

   public static record a(arq<Integer> a, String b) {
      static final Codec<amh.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(arq.a(Codec.INT).fieldOf("formats").forGetter(amh.a::a), arg.<String>a(Codec.STRING, amh::a).fieldOf("directory").forGetter(amh.a::b))
               .apply($$0, amh.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
