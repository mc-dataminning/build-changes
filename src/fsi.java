import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.stream.Stream;
import org.joml.Quaternionf;

public class fsi extends ftb<cdi> {
   private final Map<cdi.b, Pair<aeu, ffq<cdi>>> a;

   public fsi(ftc.a $$0, boolean $$1) {
      super($$0);
      this.d = 0.8F;
      this.a = Stream.of(cdi.b.values()).collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$2 -> Pair.of(new aeu(a($$2, $$1)), this.a($$0, $$2, $$1))));
   }

   private ffq<cdi> a(ftc.a $$0, cdi.b $$1, boolean $$2) {
      fhv $$3 = $$2 ? fhw.d($$1) : fhw.c($$1);
      fhx $$4 = $$0.a($$3);
      if ($$1 == cdi.b.i) {
         return (ffq<cdi>)($$2 ? new fel($$4) : new fgk($$4));
      } else {
         return (ffq<cdi>)($$2 ? new fek($$4) : new feg($$4));
      }
   }

   private static String a(cdi.b $$0, boolean $$1) {
      return $$1 ? "textures/entity/chest_boat/" + $$0.a() + ".png" : "textures/entity/boat/" + $$0.a() + ".png";
   }

   public void a(cdi $$0, float $$1, float $$2, elk $$3, fnz $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.375F, 0.0F);
      $$3.a(a.d.rotationDegrees(180.0F - $$1));
      float $$6 = (float)$$0.s() - $$2;
      float $$7 = $$0.r() - $$2;
      if ($$7 < 0.0F) {
         $$7 = 0.0F;
      }

      if ($$6 > 0.0F) {
         $$3.a(a.b.rotationDegrees(ars.a($$6) * $$6 * $$7 / 10.0F * (float)$$0.t()));
      }

      float $$8 = $$0.b($$2);
      if (!ars.a($$8, 0.0F)) {
         $$3.a(new Quaternionf().setAngleAxis($$0.b($$2) * (float) (Math.PI / 180.0), 1.0F, 0.0F, 1.0F));
      }

      Pair<aeu, ffq<cdi>> $$9 = this.a.get($$0.v());
      aeu $$10 = (aeu)$$9.getFirst();
      ffq<cdi> $$11 = (ffq<cdi>)$$9.getSecond();
      $$3.b(-1.0F, -1.0F, 1.0F);
      $$3.a(a.d.rotationDegrees(90.0F));
      $$11.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      elo $$12 = $$4.getBuffer($$11.a($$10));
      $$11.a($$3, $$12, $$5, fyq.d, 1.0F, 1.0F, 1.0F, 1.0F);
      if (!$$0.bc()) {
         elo $$13 = $$4.getBuffer(foh.j());
         if ($$11 instanceof fhl $$14) {
            $$14.c().a($$3, $$13, $$5, fyq.d);
         }
      }

      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aeu a(cdi $$0) {
      return (aeu)this.a.get($$0.v()).getFirst();
   }
}
