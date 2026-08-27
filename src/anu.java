import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record anu(List<anu.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<anu> d = RecordCodecBuilder.create($$0 -> $$0.group(anu.a.c.listOf().fieldOf("entries").forGetter(anu::a)).apply($$0, anu::new));
   public static final aoi<anu> a = aoi.a("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(anu.a::b).toList();
   }

   public List<anu.a> a() {
      return this.b;
   }

   public static record a(ate<Integer> a, String b) {
      static final Codec<anu.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(ate.a(Codec.INT).fieldOf("formats").forGetter(anu.a::a), asu.<String>a(Codec.STRING, anu::a).fieldOf("directory").forGetter(anu.a::b))
               .apply($$0, anu.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
