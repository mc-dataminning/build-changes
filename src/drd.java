import com.mojang.serialization.MapCodec;

public class drd extends dkl implements drp {
   public static final MapCodec<drd> a = b(drd::new);
   private static final int f = 1;
   private static final fcr g;
   private static final fcr h;
   private static final fcr i = dkl.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final fcr j = fco.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final dyt c = dyk.aX;
   public static final dyl d = dyk.D;
   public static final dyl e = dyk.b;

   @Override
   public MapCodec<drd> a() {
      return a;
   }

   protected drd(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(7)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      if (!$$3.a($$0.b().j())) {
         return $$0.c(e) ? h : g;
      } else {
         return fco.b();
      }
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2) {
      return fco.b();
   }

   @Override
   protected boolean a(dxu $$0, dbf $$1) {
      return $$1.n().a(this.j());
   }

   @Override
   public dxu a(dbf $$0) {
      jh $$1 = $$0.a();
      dhh $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.m().b(d, Boolean.valueOf($$2.b_($$1).a() == etx.c)).b(c, Integer.valueOf($$3)).b(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void b(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      if (!$$1.C) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      if (!$$1.B_()) {
         $$2.a($$3, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(dxu $$0, ash $$1, jh $$2, bam $$3) {
      int $$4 = a($$1, $$2);
      dxu $$5 = $$0.b(c, Integer.valueOf($$4)).b(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            clz.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   protected boolean a(dxu $$0, dhk $$1, jh $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected fcr b(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      if ($$3.a(fco.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : fco.a();
      }
   }

   @Override
   protected etw b_(dxu $$0) {
      return $$0.c(d) ? etx.c.a(false) : super.b_($$0);
   }

   private boolean a(dgm $$0, jh $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.e()).a(this);
   }

   public static int a(dgm $$0, jh $$1) {
      jh.a $$2 = $$1.k().c(jm.a);
      dxu $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(dkn.on)) {
         $$4 = $$3.c(c);
      } else if ($$3.c($$0, $$2, jm.b)) {
         return 0;
      }

      for (jm $$5 : jm.c.a) {
         dxu $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(dkn.on)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      fcr $$0 = dkl.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      fcr $$1 = dkl.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      fcr $$2 = dkl.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      fcr $$3 = dkl.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      fcr $$4 = dkl.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = fco.a($$0, $$1, $$2, $$3, $$4);
      fcr $$5 = dkl.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      fcr $$6 = dkl.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      fcr $$7 = dkl.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      fcr $$8 = dkl.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = fco.a(drd.i, g, $$6, $$5, $$8, $$7);
   }
}
