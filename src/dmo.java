import com.mojang.serialization.MapCodec;

public class dmo extends dfy implements dna {
   public static final MapCodec<dmo> a = b(dmo::new);
   private static final int f = 1;
   private static final ext g;
   private static final ext h;
   private static final ext i = dfy.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final ext j = exq.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final duc c = dts.aW;
   public static final dtt d = dts.C;
   public static final dtt e = dts.b;

   @Override
   public MapCodec<dmo> a() {
      return a;
   }

   protected dmo(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(7)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      if (!$$3.a($$0.b().r())) {
         return $$0.c(e) ? h : g;
      } else {
         return exq.b();
      }
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2) {
      return exq.b();
   }

   @Override
   protected boolean a(dtc $$0, cyd $$1) {
      return $$1.n().a(this.r());
   }

   @Override
   public dtc a(cyd $$0) {
      jd $$1 = $$0.a();
      dcw $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.o().a(d, Boolean.valueOf($$2.b_($$1).a() == epd.c)).a(c, Integer.valueOf($$3)).a(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void b(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      if (!$$1.B) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, epd.c, epd.c.a($$3));
      }

      if (!$$3.x_()) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      int $$4 = a($$1, $$2);
      dtc $$5 = $$0.a(c, Integer.valueOf($$4)).a(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            cjg.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected ext b(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      if ($$3.a(exq.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : exq.a();
      }
   }

   @Override
   protected epc b_(dtc $$0) {
      return $$0.c(d) ? epd.c.a(false) : super.b_($$0);
   }

   private boolean a(dcc $$0, jd $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.e()).a(this);
   }

   public static int a(dcc $$0, jd $$1) {
      jd.a $$2 = $$1.k().c(ji.a);
      dtc $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(dga.nS)) {
         $$4 = $$3.c(c);
      } else if ($$3.d($$0, $$2, ji.b)) {
         return 0;
      }

      for (ji $$5 : ji.c.a) {
         dtc $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(dga.nS)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      ext $$0 = dfy.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      ext $$1 = dfy.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      ext $$2 = dfy.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      ext $$3 = dfy.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      ext $$4 = dfy.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = exq.a($$0, $$1, $$2, $$3, $$4);
      ext $$5 = dfy.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      ext $$6 = dfy.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      ext $$7 = dfy.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      ext $$8 = dfy.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = exq.a(dmo.i, g, $$6, $$5, $$8, $$7);
   }
}
