import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dbo(List<dcr> d) {
   public static final Codec<dbo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dcr.d.listOf().optionalFieldOf("death_effects", List.of()).forGetter(dbo::a)).apply($$0, dbo::new)
   );
   public static final yw<wj, dbo> b = yw.a(dcr.e.a(yu.a()), dbo::a, dbo::new);
   public static final dbo c = new dbo(List.of(new dcq(), new dcp(List.of(new bvj(bvl.j, 900, 1), new bvj(bvl.v, 100, 1), new bvj(bvl.l, 800, 0)))));

   public void a(czd $$0, bxe $$1) {
      for (dcr $$2 : this.d) {
         $$2.a($$1.dV(), $$0, $$1);
      }
   }

   public List<dcr> a() {
      return this.d;
   }
}
