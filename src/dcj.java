import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dcj(List<ddm> d) {
   public static final Codec<dcj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ddm.d.listOf().optionalFieldOf("death_effects", List.of()).forGetter(dcj::a)).apply($$0, dcj::new)
   );
   public static final yy<wl, dcj> b = yy.a(ddm.e.a(yw.a()), dcj::a, dcj::new);
   public static final dcj c = new dcj(List.of(new ddl(), new ddk(List.of(new bvx(bvz.j, 900, 1), new bvx(bvz.v, 100, 1), new bvx(bvz.l, 800, 0)))));

   public void a(czy $$0, bxu $$1) {
      for (ddm $$2 : this.d) {
         $$2.a($$1.dV(), $$0, $$1);
      }
   }

   public List<ddm> a() {
      return this.d;
   }
}
