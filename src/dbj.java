import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dbj(List<dcm> d) {
   public static final Codec<dbj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dcm.d.listOf().optionalFieldOf("death_effects", List.of()).forGetter(dbj::a)).apply($$0, dbj::new)
   );
   public static final yw<wj, dbj> b = yw.a(dcm.e.a(yu.a()), dbj::a, dbj::new);
   public static final dbj c = new dbj(List.of(new dcl(), new dck(List.of(new bvh(bvj.j, 900, 1), new bvh(bvj.v, 100, 1), new bvh(bvj.l, 800, 0)))));

   public void a(cyy $$0, bxc $$1) {
      for (dcm $$2 : this.d) {
         $$2.a($$1.dV(), $$0, $$1);
      }
   }

   public List<dcm> a() {
      return this.d;
   }
}
