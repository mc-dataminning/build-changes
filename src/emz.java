import java.util.Optional;
import javax.annotation.Nullable;

public abstract class emz extends emu {
   public static final float e = 0.44444445F;

   @Override
   public emv d() {
      return emx.d;
   }

   @Override
   public emv e() {
      return emx.e;
   }

   @Override
   public ctl a() {
      return ctt.qA;
   }

   @Override
   public void a(daz $$0, io $$1, emw $$2, aym $$3) {
      io $$4 = $$1.c();
      if ($$0.a_($$4).i() && !$$0.a_($$4).i($$0, $$4)) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(ky.Y, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, avi.nR, avj.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), avi.nP, avj.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void b(daz $$0, io $$1, emw $$2, aym $$3) {
      if ($$0.aa().b(dav.b)) {
         int $$4 = $$3.a(3);
         if ($$4 > 0) {
            io $$5 = $$1;

            for (int $$6 = 0; $$6 < $$4; $$6++) {
               $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
               if (!$$0.p($$5)) {
                  return;
               }

               drd $$7 = $$0.a_($$5);
               if ($$7.i()) {
                  if (this.a((dbc)$$0, $$5)) {
                     $$0.b($$5, ddn.a($$0, $$5));
                     return;
                  }
               } else if ($$7.d()) {
                  return;
               }
            }
         } else {
            for (int $$8 = 0; $$8 < 3; $$8++) {
               io $$9 = $$1.b($$3.a(3) - 1, 0, $$3.a(3) - 1);
               if (!$$0.p($$9)) {
                  return;
               }

               if ($$0.u($$9.c()) && this.b($$0, $$9)) {
                  $$0.b($$9.c(), ddn.a($$0, $$9));
               }
            }
         }
      }
   }

   private boolean a(dbc $$0, io $$1) {
      for (it $$2 : it.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(dbc $$0, io $$1) {
      return $$1.v() >= $$0.I_() && $$1.v() < $$0.al() && !$$0.B($$1) ? false : $$0.a_($$1).j();
   }

   @Nullable
   @Override
   public kw h() {
      return ky.i;
   }

   @Override
   protected void a(dba $$0, io $$1, drd $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(dbc $$0) {
      return $$0.D_().i() ? 4 : 2;
   }

   @Override
   public drd b(emw $$0) {
      return dec.H.n().a(diq.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(emv $$0) {
      return $$0 == emx.e || $$0 == emx.d;
   }

   @Override
   public int c(dbc $$0) {
      return $$0.D_().i() ? 1 : 2;
   }

   @Override
   public boolean a(emw $$0, daf $$1, io $$2, emv $$3, it $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(awc.a);
   }

   @Override
   public int a(dbc $$0) {
      return $$0.D_().i() ? 10 : 30;
   }

   @Override
   public int a(daz $$0, io $$1, emw $$2, emw $$3) {
      int $$4 = this.a((dbc)$$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a((daf)$$0, $$1) > $$2.a((daf)$$0, $$1) && $$0.E_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(dba $$0, io $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(daz $$0) {
      return $$0.aa().b(dav.V);
   }

   @Override
   protected void a(dba $$0, io $$1, drd $$2, it $$3, emw $$4) {
      if ($$3 == it.a) {
         emw $$5 = $$0.b_($$1);
         if (this.a(awc.b) && $$5.a(awc.a)) {
            if ($$2.b() instanceof diq) {
               $$0.a($$1, dec.b.n(), 3);
            }

            this.a($$0, $$1);
            return;
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean i() {
      return true;
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<avh> j() {
      return Optional.of(avi.dl);
   }

   public static class a extends emz {
      @Override
      protected void a(dre.a<emv, emw> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(emw $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(emw $$0) {
         return false;
      }
   }

   public static class b extends emz {
      @Override
      public int d(emw $$0) {
         return 8;
      }

      @Override
      public boolean c(emw $$0) {
         return true;
      }
   }
}
