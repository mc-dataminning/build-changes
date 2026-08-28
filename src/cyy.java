import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cyy(List<czy> d) {
   public static final Codec<cyy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(czy.d.listOf().optionalFieldOf("death_effects", List.of()).forGetter(cyy::a)).apply($$0, cyy::new)
   );
   public static final zh<wu, cyy> b = zh.a(czy.e.a(zf.a()), cyy::a, cyy::new);
   public static final cyy c = new cyy(List.of(new czx(), new czw(List.of(new btq(bts.j, 900, 1), new btq(bts.v, 100, 1), new btq(bts.l, 800, 0)))));

   public void a(cwm $$0, bvh $$1) {
      for (czy $$2 : this.d) {
         $$2.a($$1.dV(), $$0, $$1);
      }
   }

   public List<czy> a() {
      return this.d;
   }
}
