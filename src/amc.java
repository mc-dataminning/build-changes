import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record amc(List<amc.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<amc> d = RecordCodecBuilder.create($$0 -> $$0.group(amc.a.c.listOf().fieldOf("entries").forGetter(amc::a)).apply($$0, amc::new));
   public static final amq<amc> a = amq.a("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(amc.a::b).toList();
   }

   public List<amc.a> a() {
      return this.b;
   }

   public static record a(arl<Integer> a, String b) {
      static final Codec<amc.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(arl.a(Codec.INT).fieldOf("formats").forGetter(amc.a::a), arb.<String>a(Codec.STRING, amc::a).fieldOf("directory").forGetter(amc.a::b))
               .apply($$0, amc.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
