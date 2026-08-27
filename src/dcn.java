import com.mojang.serialization.MapCodec;

public class dcn extends cvz implements dcz {
   public static final MapCodec<dcn> a = b(dcn::new);
   private static final int f = 1;
   private static final elu g;
   private static final elu h;
   private static final elu i = cvz.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final elu j = elr.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final djp c = djf.aW;
   public static final djg d = djf.C;
   public static final djg e = djf.b;

   @Override
   public MapCodec<dcn> a() {
      return a;
   }

   protected dcn(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(7)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      if (!$$3.a($$0.b().k())) {
         return $$0.c(e) ? h : g;
      } else {
         return elr.b();
      }
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2) {
      return elr.b();
   }

   @Override
   public boolean a(dip $$0, coq $$1) {
      return $$1.n().a(this.k());
   }

   @Override
   public dip a(coq $$0) {
      hv $$1 = $$0.a();
      csy $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.o().a(d, Boolean.valueOf($$2.b_($$1).a() == eea.c)).a(c, Integer.valueOf($$3)).a(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   public void b(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      if (!$$1.B) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eea.c, eea.c.a($$3));
      }

      if (!$$3.y_()) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      int $$4 = a($$1, $$2);
      dip $$5 = $$0.a(c, Integer.valueOf($$4)).a(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            cbd.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   public elu b(dip $$0, cse $$1, hv $$2, elg $$3) {
      if ($$3.a(elr.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : elr.a();
      }
   }

   @Override
   public edz c_(dip $$0) {
      return $$0.c(d) ? eea.c.a(false) : super.c_($$0);
   }

   private boolean a(cse $$0, hv $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.d()).a(this);
   }

   public static int a(cse $$0, hv $$1) {
      hv.a $$2 = $$1.j().c(ia.a);
      dip $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(cwb.nS)) {
         $$4 = $$3.c(c);
      } else if ($$3.d($$0, $$2, ia.b)) {
         return 0;
      }

      for (ia $$5 : ia.c.a) {
         dip $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(cwb.nS)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      elu $$0 = cvz.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      elu $$1 = cvz.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      elu $$2 = cvz.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      elu $$3 = cvz.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      elu $$4 = cvz.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = elr.a($$0, $$1, $$2, $$3, $$4);
      elu $$5 = cvz.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      elu $$6 = cvz.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      elu $$7 = cvz.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      elu $$8 = cvz.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = elr.a(dcn.i, g, $$6, $$5, $$8, $$7);
   }
}
