import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record ang(List<ang.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<ang> d = RecordCodecBuilder.create($$0 -> $$0.group(ang.a.c.listOf().fieldOf("entries").forGetter(ang::a)).apply($$0, ang::new));
   public static final anu<ang> a = anu.a("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(ang.a::b).toList();
   }

   public List<ang.a> a() {
      return this.b;
   }

   public static record a(asq<Integer> a, String b) {
      static final Codec<ang.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(asq.a(Codec.INT).fieldOf("formats").forGetter(ang.a::a), asg.<String>a(Codec.STRING, ang::a).fieldOf("directory").forGetter(ang.a::b))
               .apply($$0, ang.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
