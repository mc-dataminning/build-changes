import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record czb(List<dab> d) {
   public static final Codec<czb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dab.d.listOf().optionalFieldOf("death_effects", List.of()).forGetter(czb::a)).apply($$0, czb::new)
   );
   public static final yn<wa, czb> b = yn.a(dab.e.a(yl.a()), czb::a, czb::new);
   public static final czb c = new czb(List.of(new daa(), new czz(List.of(new btq(bts.j, 900, 1), new btq(bts.v, 100, 1), new btq(bts.l, 800, 0)))));

   public void a(cwp $$0, bvh $$1) {
      for (dab $$2 : this.d) {
         $$2.a($$1.dV(), $$0, $$1);
      }
   }

   public List<dab> a() {
      return this.d;
   }
}
