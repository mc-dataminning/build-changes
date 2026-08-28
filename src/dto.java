import com.mojang.serialization.MapCodec;

public class dto extends dmr implements duc {
   public static final MapCodec<dto> a = b(dto::new);
   private static final int f = 1;
   private static final ffw g = fft.a(dmr.b(16.0, 14.0, 16.0), fft.c(dmr.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0)).values().stream().reduce(fft.a(), fft::a));
   private static final ffw h = dmr.b(16.0, 0.0, 2.0);
   private static final ffw i = fft.a(g, h, fft.c(dmr.a(16.0, 0.0, 2.0, 0.0, 2.0)).values().stream().reduce(fft.a(), fft::a));
   private static final ffw D = fft.b().a(0.0, -1.0, 0.0).d();
   public static final int b = 7;
   public static final ebt c = ebj.aZ;
   public static final ebk d = ebj.I;
   public static final ebk e = ebj.d;

   @Override
   public MapCodec<dto> a() {
      return a;
   }

   protected dto(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(7)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      if (!$$3.a($$0.b().h())) {
         return $$0.c(e) ? i : g;
      } else {
         return fft.b();
      }
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2) {
      return fft.b();
   }

   @Override
   protected boolean a(eat $$0, ddg $$1) {
      return $$1.n().a(this.h());
   }

   @Override
   public eat a(ddg $$0) {
      iv $$1 = $$0.a();
      djm $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.m().b(d, Boolean.valueOf($$2.b_($$1).a() == exb.c)).b(c, Integer.valueOf($$3)).b(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, eat $$3, boolean $$4) {
      if (!$$1.C) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, exb.c, exb.c.a($$1));
      }

      if (!$$1.w_()) {
         $$2.a($$3, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, azv $$3) {
      int $$4 = a($$1, $$2);
      eat $$5 = $$0.b(c, Integer.valueOf($$4)).b(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            cnq.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected ffw b(eat $$0, diq $$1, iv $$2, ffh $$3) {
      if ($$3.c()) {
         return fft.a();
      } else if ($$3.a(fft.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(D, $$2, true) ? h : fft.a();
      }
   }

   @Override
   protected exa b_(eat $$0) {
      return $$0.c(d) ? exb.c.a(false) : super.b_($$0);
   }

   private boolean a(diq $$0, iv $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.e()).a(this);
   }

   public static int a(diq $$0, iv $$1) {
      iv.a $$2 = $$1.k().c(jb.a);
      eat $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(dmt.oy)) {
         $$4 = $$3.c(c);
      } else if ($$3.c($$0, $$2, jb.b)) {
         return 0;
      }

      for (jb $$5 : jb.c.a) {
         eat $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(dmt.oy)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }
}
