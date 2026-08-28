import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dab(List<dbb> d) {
   public static final Codec<dab> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dbb.d.listOf().optionalFieldOf("death_effects", List.of()).forGetter(dab::a)).apply($$0, dab::new)
   );
   public static final zt<xg, dab> b = zt.a(dbb.e.a(zr.a()), dab::a, dab::new);
   public static final dab c = new dab(List.of(new dba(), new daz(List.of(new bup(bur.j, 900, 1), new bup(bur.v, 100, 1), new bup(bur.l, 800, 0)))));

   public void a(cxp $$0, bwg $$1) {
      for (dbb $$2 : this.d) {
         $$2.a($$1.dW(), $$0, $$1);
      }
   }

   public List<dbb> a() {
      return this.d;
   }
}
