import com.mojang.serialization.MapCodec;

public class dnl extends dgv implements dnx {
   public static final MapCodec<dnl> a = b(dnl::new);
   private static final int f = 1;
   private static final eyx g;
   private static final eyx h;
   private static final eyx i = dgv.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final eyx j = eyu.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final dva c = duq.aW;
   public static final dur d = duq.C;
   public static final dur e = duq.b;

   @Override
   public MapCodec<dnl> a() {
      return a;
   }

   protected dnl(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(c, Integer.valueOf(7)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      if (!$$3.a($$0.b().r())) {
         return $$0.c(e) ? h : g;
      } else {
         return eyu.b();
      }
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2) {
      return eyu.b();
   }

   @Override
   protected boolean a(dua $$0, cyw $$1) {
      return $$1.n().a(this.r());
   }

   @Override
   public dua a(cyw $$0) {
      je $$1 = $$0.a();
      dds $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.o().b(d, Boolean.valueOf($$2.b_($$1).a() == eqc.c)).b(c, Integer.valueOf($$3)).b(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void b(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      if (!$$1.B) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eqc.c, eqc.c.a($$3));
      }

      if (!$$3.w_()) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, azk $$3) {
      int $$4 = a($$1, $$2);
      dua $$5 = $$0.b(c, Integer.valueOf($$4)).b(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            cjy.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected eyx b(dua $$0, dcx $$1, je $$2, eyj $$3) {
      if ($$3.a(eyu.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : eyu.a();
      }
   }

   @Override
   protected eqb b_(dua $$0) {
      return $$0.c(d) ? eqc.c.a(false) : super.b_($$0);
   }

   private boolean a(dcx $$0, je $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.e()).a(this);
   }

   public static int a(dcx $$0, je $$1) {
      je.a $$2 = $$1.k().c(jj.a);
      dua $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(dgx.nS)) {
         $$4 = $$3.c(c);
      } else if ($$3.c($$0, $$2, jj.b)) {
         return 0;
      }

      for (jj $$5 : jj.c.a) {
         dua $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(dgx.nS)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      eyx $$0 = dgv.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      eyx $$1 = dgv.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      eyx $$2 = dgv.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      eyx $$3 = dgv.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      eyx $$4 = dgv.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = eyu.a($$0, $$1, $$2, $$3, $$4);
      eyx $$5 = dgv.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      eyx $$6 = dgv.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      eyx $$7 = dgv.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      eyx $$8 = dgv.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = eyu.a(dnl.i, g, $$6, $$5, $$8, $$7);
   }
}
