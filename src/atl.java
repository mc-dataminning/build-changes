import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record atl(List<atl.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<atl> d = RecordCodecBuilder.create($$0 -> $$0.group(atl.a.c.listOf().fieldOf("entries").forGetter(atl::a)).apply($$0, atl::new));
   public static final aua<atl> a = new aua<>("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(atl.a::b).toList();
   }

   public List<atl.a> a() {
      return this.b;
   }

   public static record a(azc<Integer> a, String b) {
      static final Codec<atl.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(azc.a(Codec.INT).fieldOf("formats").forGetter(atl.a::a), Codec.STRING.validate(atl::a).fieldOf("directory").forGetter(atl.a::b))
               .apply($$0, atl.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
