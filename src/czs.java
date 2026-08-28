import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record czs(List<das> d) {
   public static final Codec<czs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(das.d.listOf().optionalFieldOf("death_effects", List.of()).forGetter(czs::a)).apply($$0, czs::new)
   );
   public static final zi<wv, czs> b = zi.a(das.e.a(zg.a()), czs::a, czs::new);
   public static final czs c = new czs(List.of(new dar(), new daq(List.of(new bug(bui.j, 900, 1), new bug(bui.v, 100, 1), new bug(bui.l, 800, 0)))));

   public void a(cxg $$0, bvx $$1) {
      for (das $$2 : this.d) {
         $$2.a($$1.dW(), $$0, $$1);
      }
   }

   public List<das> a() {
      return this.d;
   }
}
