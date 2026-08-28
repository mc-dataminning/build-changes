import com.mojang.serialization.MapCodec;

public class dre extends dkm implements drq {
   public static final MapCodec<dre> a = b(dre::new);
   private static final int f = 1;
   private static final fcs g;
   private static final fcs h;
   private static final fcs i = dkm.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final fcs j = fcp.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final dyu c = dyl.aX;
   public static final dym d = dyl.D;
   public static final dym e = dyl.b;

   @Override
   public MapCodec<dre> a() {
      return a;
   }

   protected dre(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(7)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      if (!$$3.a($$0.b().j())) {
         return $$0.c(e) ? h : g;
      } else {
         return fcp.b();
      }
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2) {
      return fcp.b();
   }

   @Override
   protected boolean a(dxv $$0, dbg $$1) {
      return $$1.n().a(this.j());
   }

   @Override
   public dxv a(dbg $$0) {
      jh $$1 = $$0.a();
      dhi $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.m().b(d, Boolean.valueOf($$2.b_($$1).a() == ety.c)).b(c, Integer.valueOf($$3)).b(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void b(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      if (!$$1.C) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, ety.c, ety.c.a($$1));
      }

      if (!$$1.B_()) {
         $$2.a($$3, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, bam $$3) {
      int $$4 = a($$1, $$2);
      dxv $$5 = $$0.b(c, Integer.valueOf($$4)).b(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            cma.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected fcs b(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      if ($$3.a(fcp.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : fcp.a();
      }
   }

   @Override
   protected etx b_(dxv $$0) {
      return $$0.c(d) ? ety.c.a(false) : super.b_($$0);
   }

   private boolean a(dgn $$0, jh $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.e()).a(this);
   }

   public static int a(dgn $$0, jh $$1) {
      jh.a $$2 = $$1.k().c(jm.a);
      dxv $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(dko.on)) {
         $$4 = $$3.c(c);
      } else if ($$3.c($$0, $$2, jm.b)) {
         return 0;
      }

      for (jm $$5 : jm.c.a) {
         dxv $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(dko.on)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      fcs $$0 = dkm.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      fcs $$1 = dkm.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      fcs $$2 = dkm.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      fcs $$3 = dkm.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      fcs $$4 = dkm.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = fcp.a($$0, $$1, $$2, $$3, $$4);
      fcs $$5 = dkm.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      fcs $$6 = dkm.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      fcs $$7 = dkm.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      fcs $$8 = dkm.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = fcp.a(dre.i, g, $$6, $$5, $$8, $$7);
   }
}
