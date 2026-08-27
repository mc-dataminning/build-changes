import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record alx(List<alx.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<alx> d = RecordCodecBuilder.create($$0 -> $$0.group(alx.a.c.listOf().fieldOf("entries").forGetter(alx::a)).apply($$0, alx::new));
   public static final aml<alx> a = aml.a("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(alx.a::b).toList();
   }

   public List<alx.a> a() {
      return this.b;
   }

   public static record a(arh<Integer> a, String b) {
      static final Codec<alx.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(arh.a(Codec.INT).fieldOf("formats").forGetter(alx.a::a), aqw.<String>a(Codec.STRING, alx::a).fieldOf("directory").forGetter(alx.a::b))
               .apply($$0, alx.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
