import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.stream.Stream;
import org.joml.Quaternionf;

public class frp extends fsi<cde> {
   private final Map<cde.b, Pair<aep, ffc<cde>>> a;

   public frp(fsj.a $$0, boolean $$1) {
      super($$0);
      this.d = 0.8F;
      this.a = Stream.of(cde.b.values()).collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$2 -> Pair.of(new aep(a($$2, $$1)), this.a($$0, $$2, $$1))));
   }

   private ffc<cde> a(fsj.a $$0, cde.b $$1, boolean $$2) {
      fhh $$3 = $$2 ? fhi.d($$1) : fhi.c($$1);
      fhj $$4 = $$0.a($$3);
      if ($$1 == cde.b.i) {
         return (ffc<cde>)($$2 ? new fdx($$4) : new ffw($$4));
      } else {
         return (ffc<cde>)($$2 ? new fdw($$4) : new fds($$4));
      }
   }

   private static String a(cde.b $$0, boolean $$1) {
      return $$1 ? "textures/entity/chest_boat/" + $$0.a() + ".png" : "textures/entity/boat/" + $$0.a() + ".png";
   }

   public void a(cde $$0, float $$1, float $$2, elh $$3, fng $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.375F, 0.0F);
      $$3.a(a.d.rotationDegrees(180.0F - $$1));
      float $$6 = (float)$$0.s() - $$2;
      float $$7 = $$0.r() - $$2;
      if ($$7 < 0.0F) {
         $$7 = 0.0F;
      }

      if ($$6 > 0.0F) {
         $$3.a(a.b.rotationDegrees(aro.a($$6) * $$6 * $$7 / 10.0F * (float)$$0.t()));
      }

      float $$8 = $$0.b($$2);
      if (!aro.a($$8, 0.0F)) {
         $$3.a(new Quaternionf().setAngleAxis($$0.b($$2) * (float) (Math.PI / 180.0), 1.0F, 0.0F, 1.0F));
      }

      Pair<aep, ffc<cde>> $$9 = this.a.get($$0.v());
      aep $$10 = (aep)$$9.getFirst();
      ffc<cde> $$11 = (ffc<cde>)$$9.getSecond();
      $$3.b(-1.0F, -1.0F, 1.0F);
      $$3.a(a.d.rotationDegrees(90.0F));
      $$11.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      ell $$12 = $$4.getBuffer($$11.a($$10));
      $$11.a($$3, $$12, $$5, fxx.d, 1.0F, 1.0F, 1.0F, 1.0F);
      if (!$$0.bc()) {
         ell $$13 = $$4.getBuffer(fno.j());
         if ($$11 instanceof fgx $$14) {
            $$14.c().a($$3, $$13, $$5, fxx.d);
         }
      }

      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aep a(cde $$0) {
      return (aep)this.a.get($$0.v()).getFirst();
   }
}
