import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record alz(List<alz.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<alz> d = RecordCodecBuilder.create($$0 -> $$0.group(alz.a.c.listOf().fieldOf("entries").forGetter(alz::a)).apply($$0, alz::new));
   public static final amn<alz> a = amn.a("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(alz.a::b).toList();
   }

   public List<alz.a> a() {
      return this.b;
   }

   public static record a(ari<Integer> a, String b) {
      static final Codec<alz.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(ari.a(Codec.INT).fieldOf("formats").forGetter(alz.a::a), aqy.<String>a(Codec.STRING, alz::a).fieldOf("directory").forGetter(alz.a::b))
               .apply($$0, alz.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
