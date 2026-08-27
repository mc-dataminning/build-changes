import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czc extends dcy {
   public static final MapCodec<czc> a = b(czc::new);
   public static final dnv b = ddx.aE;
   private static final eqm c = dac.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final eqm d = dac.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final eqm e = dac.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final eqm f = dac.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final eqm g = dac.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final eqm h = dac.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final eqm i = dac.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final eqm j = eqj.a(c, d, e, f);
   private static final eqm k = eqj.a(c, g, h, i);
   private static final vu l = vu.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<czc> a() {
      return a;
   }

   public czc(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.c));
   }

   @Override
   public dnb a(csu $$0) {
      return this.o().a(b, $$0.g().h());
   }

   @Override
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      if ($$1.B) {
         return bnd.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(aui.aC);
         return bnd.b;
      }
   }

   @Nullable
   @Override
   protected bnh b(dnb $$0, cxb $$1, ib $$2) {
      return new bnn(($$2x, $$3, $$4) -> new cls($$2x, $$3, cmb.a($$1, $$2)), l);
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      ih $$4 = $$0.c(b);
      return $$4.o() == ih.a.a ? j : k;
   }

   @Override
   protected void a(cfd $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(cxb $$0, ib $$1, dnb $$2, dnb $$3, cfd $$4) {
      if (!$$4.aU()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(cxb $$0, ib $$1, cfd $$2) {
      if (!$$2.aU()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bnw a(box $$0) {
      return $$0.dN().b($$0);
   }

   @Nullable
   public static dnb e(dnb $$0) {
      if ($$0.a(dae.gS)) {
         return dae.gT.o().a(b, $$0.c(b));
      } else {
         return $$0.a(dae.gT) ? dae.gU.o().a(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return false;
   }

   @Override
   public int b(dnb $$0, cwh $$1, ib $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
