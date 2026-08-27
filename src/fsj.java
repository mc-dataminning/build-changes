import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.stream.Stream;
import org.joml.Quaternionf;

public class fsj extends ftc<cdt> {
   private final Map<cdt.b, Pair<aez, ffq<cdt>>> a;

   public fsj(ftd.a $$0, boolean $$1) {
      super($$0);
      this.d = 0.8F;
      this.a = Stream.of(cdt.b.values()).collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$2 -> Pair.of(new aez(a($$2, $$1)), this.a($$0, $$2, $$1))));
   }

   private ffq<cdt> a(ftd.a $$0, cdt.b $$1, boolean $$2) {
      fhv $$3 = $$2 ? fhw.d($$1) : fhw.c($$1);
      fhx $$4 = $$0.a($$3);
      if ($$1 == cdt.b.i) {
         return (ffq<cdt>)($$2 ? new fel($$4) : new fgk($$4));
      } else {
         return (ffq<cdt>)($$2 ? new fek($$4) : new feg($$4));
      }
   }

   private static String a(cdt.b $$0, boolean $$1) {
      return $$1 ? "textures/entity/chest_boat/" + $$0.a() + ".png" : "textures/entity/boat/" + $$0.a() + ".png";
   }

   public void a(cdt $$0, float $$1, float $$2, elj $$3, foa $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.375F, 0.0F);
      $$3.a(a.d.rotationDegrees(180.0F - $$1));
      float $$6 = (float)$$0.y() - $$2;
      float $$7 = $$0.x() - $$2;
      if ($$7 < 0.0F) {
         $$7 = 0.0F;
      }

      if ($$6 > 0.0F) {
         $$3.a(a.b.rotationDegrees(asb.a($$6) * $$6 * $$7 / 10.0F * (float)$$0.z()));
      }

      float $$8 = $$0.b($$2);
      if (!asb.a($$8, 0.0F)) {
         $$3.a(new Quaternionf().setAngleAxis($$0.b($$2) * (float) (Math.PI / 180.0), 1.0F, 0.0F, 1.0F));
      }

      Pair<aez, ffq<cdt>> $$9 = this.a.get($$0.A());
      aez $$10 = (aez)$$9.getFirst();
      ffq<cdt> $$11 = (ffq<cdt>)$$9.getSecond();
      $$3.b(-1.0F, -1.0F, 1.0F);
      $$3.a(a.d.rotationDegrees(90.0F));
      $$11.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      eln $$12 = $$4.getBuffer($$11.a($$10));
      $$11.a($$3, $$12, $$5, fyr.d, 1.0F, 1.0F, 1.0F, 1.0F);
      if (!$$0.bc()) {
         eln $$13 = $$4.getBuffer(foi.j());
         if ($$11 instanceof fhl $$14) {
            $$14.c().a($$3, $$13, $$5, fyr.d);
         }
      }

      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aez a(cdt $$0) {
      return (aez)this.a.get($$0.A()).getFirst();
   }
}
