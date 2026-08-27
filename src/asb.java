import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record asb(List<asb.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<asb> d = RecordCodecBuilder.create($$0 -> $$0.group(asb.a.c.listOf().fieldOf("entries").forGetter(asb::a)).apply($$0, asb::new));
   public static final asr<asb> a = asr.a("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(asb.a::b).toList();
   }

   public List<asb.a> a() {
      return this.b;
   }

   public static record a(axr<Integer> a, String b) {
      static final Codec<asb.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(axr.a(Codec.INT).fieldOf("formats").forGetter(asb.a::a), axh.<String>b(Codec.STRING, asb::a).fieldOf("directory").forGetter(asb.a::b))
               .apply($$0, asb.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
