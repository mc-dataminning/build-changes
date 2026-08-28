import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cza(List<daa> d) {
   public static final Codec<cza> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(daa.d.listOf().optionalFieldOf("death_effects", List.of()).forGetter(cza::a)).apply($$0, cza::new)
   );
   public static final yn<wa, cza> b = yn.a(daa.e.a(yl.a()), cza::a, cza::new);
   public static final cza c = new cza(List.of(new czz(), new czy(List.of(new btp(btr.j, 900, 1), new btp(btr.v, 100, 1), new btp(btr.l, 800, 0)))));

   public void a(cwo $$0, bvg $$1) {
      for (daa $$2 : this.d) {
         $$2.a($$1.dV(), $$0, $$1);
      }
   }

   public List<daa> a() {
      return this.d;
   }
}
