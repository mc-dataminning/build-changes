import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record asv(List<asv.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<asv> d = RecordCodecBuilder.create($$0 -> $$0.group(asv.a.c.listOf().fieldOf("entries").forGetter(asv::a)).apply($$0, asv::new));
   public static final atl<asv> a = atl.a("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(asv.a::b).toList();
   }

   public List<asv.a> a() {
      return this.b;
   }

   public static record a(aym<Integer> a, String b) {
      static final Codec<asv.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(aym.a(Codec.INT).fieldOf("formats").forGetter(asv.a::a), Codec.STRING.validate(asv::a).fieldOf("directory").forGetter(asv.a::b))
               .apply($$0, asv.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
