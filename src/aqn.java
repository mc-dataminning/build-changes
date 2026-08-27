import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record aqn(List<aqn.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<aqn> d = RecordCodecBuilder.create($$0 -> $$0.group(aqn.a.c.listOf().fieldOf("entries").forGetter(aqn::a)).apply($$0, aqn::new));
   public static final arb<aqn> a = arb.a("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(aqn.a::b).toList();
   }

   public List<aqn.a> a() {
      return this.b;
   }

   public static record a(avz<Integer> a, String b) {
      static final Codec<aqn.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(avz.a(Codec.INT).fieldOf("formats").forGetter(aqn.a::a), avp.<String>a(Codec.STRING, aqn::a).fieldOf("directory").forGetter(aqn.a::b))
               .apply($$0, aqn.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
