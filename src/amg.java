import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record amg(List<amg.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<amg> d = RecordCodecBuilder.create($$0 -> $$0.group(amg.a.c.listOf().fieldOf("entries").forGetter(amg::a)).apply($$0, amg::new));
   public static final amu<amg> a = amu.a("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(amg.a::b).toList();
   }

   public List<amg.a> a() {
      return this.b;
   }

   public static record a(arp<Integer> a, String b) {
      static final Codec<amg.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(arp.a(Codec.INT).fieldOf("formats").forGetter(amg.a::a), arf.<String>a(Codec.STRING, amg::a).fieldOf("directory").forGetter(amg.a::b))
               .apply($$0, amg.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
