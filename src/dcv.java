import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dcv(List<ddy> d) {
   public static final Codec<dcv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ddy.d.listOf().optionalFieldOf("death_effects", List.of()).forGetter(dcv::a)).apply($$0, dcv::new)
   );
   public static final ze<wp, dcv> b = ze.a(ddy.e.a(zc.a()), dcv::a, dcv::new);
   public static final dcv c = new dcv(List.of(new ddx(), new ddw(List.of(new bwi(bwk.j, 900, 1), new bwi(bwk.v, 100, 1), new bwi(bwk.l, 800, 0)))));

   public void a(dak $$0, byf $$1) {
      for (ddy $$2 : this.d) {
         $$2.a($$1.dV(), $$0, $$1);
      }
   }

   public List<ddy> a() {
      return this.d;
   }
}
