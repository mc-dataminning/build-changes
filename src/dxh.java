import java.util.Optional;
import javax.annotation.Nullable;

public abstract class dxh extends dxc {
   public static final float e = 0.44444445F;

   @Override
   public dxd d() {
      return dxf.d;
   }

   @Override
   public dxd e() {
      return dxf.e;
   }

   @Override
   public cfu a() {
      return cgc.pM;
   }

   @Override
   public void a(cmm $$0, gu $$1, dxe $$2, apf $$3) {
      gu $$4 = $$1.c();
      if ($$0.a_($$4).i() && !$$0.a_($$4).i($$0, $$4)) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(iv.T, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, amh.mp, ami.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), amh.mn, ami.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void b(cmm $$0, gu $$1, dxe $$2, apf $$3) {
      if ($$0.X().b(cmi.b)) {
         int $$4 = $$3.a(3);
         if ($$4 > 0) {
            gu $$5 = $$1;

            for (int $$6 = 0; $$6 < $$4; $$6++) {
               $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
               if (!$$0.o($$5)) {
                  return;
               }

               dcb $$7 = $$0.a_($$5);
               if ($$7.i()) {
                  if (this.a((cmp)$$0, $$5)) {
                     $$0.b($$5, cpb.a($$0, $$5));
                     return;
                  }
               } else if ($$7.d()) {
                  return;
               }
            }
         } else {
            for (int $$8 = 0; $$8 < 3; $$8++) {
               gu $$9 = $$1.b($$3.a(3) - 1, 0, $$3.a(3) - 1);
               if (!$$0.o($$9)) {
                  return;
               }

               if ($$0.t($$9.c()) && this.b($$0, $$9)) {
                  $$0.b($$9.c(), cpb.a($$0, $$9));
               }
            }
         }
      }
   }

   private boolean a(cmp $$0, gu $$1) {
      for (ha $$2 : ha.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(cmp $$0, gu $$1) {
      return $$1.v() >= $$0.C_() && $$1.v() < $$0.aj() && !$$0.A($$1) ? false : $$0.a_($$1).j();
   }

   @Nullable
   @Override
   public it h() {
      return iv.j;
   }

   @Override
   protected void a(cmn $$0, gu $$1, dcb $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(cmp $$0) {
      return $$0.x_().i() ? 4 : 2;
   }

   @Override
   public dcb b(dxe $$0) {
      return cpo.H.n().a(cua.a, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(dxd $$0) {
      return $$0 == dxf.e || $$0 == dxf.d;
   }

   @Override
   public int c(cmp $$0) {
      return $$0.x_().i() ? 1 : 2;
   }

   @Override
   public boolean a(dxe $$0, cls $$1, gu $$2, dxd $$3, ha $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(anb.a);
   }

   @Override
   public int a(cmp $$0) {
      return $$0.x_().i() ? 10 : 30;
   }

   @Override
   public int a(cmm $$0, gu $$1, dxe $$2, dxe $$3) {
      int $$4 = this.a((cmp)$$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a((cls)$$0, $$1) > $$2.a((cls)$$0, $$1) && $$0.y_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(cmn $$0, gu $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(cmm $$0) {
      return $$0.X().b(cmi.R);
   }

   @Override
   protected void a(cmn $$0, gu $$1, dcb $$2, ha $$3, dxe $$4) {
      if ($$3 == ha.a) {
         dxe $$5 = $$0.b_($$1);
         if (this.a(anb.b) && $$5.a(anb.a)) {
            if ($$2.b() instanceof cua) {
               $$0.a($$1, cpo.b.n(), 3);
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
   public Optional<amg> j() {
      return Optional.of(amh.cE);
   }

   public static class a extends dxh {
      @Override
      protected void a(dcc.a<dxd, dxe> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(dxe $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(dxe $$0) {
         return false;
      }
   }

   public static class b extends dxh {
      @Override
      public int d(dxe $$0) {
         return 8;
      }

      @Override
      public boolean c(dxe $$0) {
         return true;
      }
   }
}
