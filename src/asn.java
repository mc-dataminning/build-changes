import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record asn(List<asn.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<asn> d = RecordCodecBuilder.create($$0 -> $$0.group(asn.a.c.listOf().fieldOf("entries").forGetter(asn::a)).apply($$0, asn::new));
   public static final atd<asn> a = atd.a("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(asn.a::b).toList();
   }

   public List<asn.a> a() {
      return this.b;
   }

   public static record a(ayf<Integer> a, String b) {
      static final Codec<asn.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(ayf.a(Codec.INT).fieldOf("formats").forGetter(asn.a::a), Codec.STRING.validate(asn::a).fieldOf("directory").forGetter(asn.a::b))
               .apply($$0, asn.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
