import javax.annotation.Nullable;

public class cjb extends ciz implements bwe<cji> {
   private static final ako<Integer> bY = aks.a(cjb.class, akq.b);
   private static final bul bZ = bup.ab.n().a(buk.a().a(buj.a, 0.0F, bup.ab.m() + 0.125F, 0.0F)).a(0.5F);

   public cjb(bup<? extends cjb> $$0, dff $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(azv $$0) {
      this.g(bwm.s).a((double)a($$0::a));
      this.g(bwm.v).a(b($$0::j));
      this.g(bwm.o).a(a($$0::j));
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(bY, 0);
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("Variant", this.y());
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      this.x($$0.h("Variant"));
   }

   private void x(int $$0) {
      this.am.a(bY, $$0);
   }

   private int y() {
      return this.am.a(bY);
   }

   private void a(cji $$0, cjd $$1) {
      this.x($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public cji q() {
      return cji.a(this.y() & 0xFF);
   }

   public void a(cji $$0) {
      this.x($$0.a() & 0xFF | this.y() & -256);
   }

   public cjd t() {
      return cjd.a((this.y() & 0xFF00) >> 8);
   }

   @Override
   public void a(bsa $$0) {
      cwf $$1 = this.ak();
      super.a($$0);
      cwf $$2 = this.ak();
      if (this.ag > 20 && this.a($$2, buq.g) && $$1 != $$2) {
         this.a(awo.mH, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(dpw $$0) {
      super.a($$0);
      if (this.af.a(10) == 0) {
         this.a(awo.mI, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected awn w() {
      return awo.mF;
   }

   @Override
   protected awn o_() {
      return awo.mJ;
   }

   @Nullable
   @Override
   protected awn gx() {
      return awo.mK;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.mM;
   }

   @Override
   protected awn gW() {
      return awo.mG;
   }

   @Override
   public bsh b(cor $$0, bsg $$1) {
      boolean $$2 = !this.p_() && this.gM() && $$0.gb();
      if (!this.cc() && !$$2) {
         cwf $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.l($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gM()) {
               this.hd();
               return bsh.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(cgv $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cja) && !($$0 instanceof cjb) ? false : this.hf() && ((ciz)$$0).hf();
      }
   }

   @Nullable
   @Override
   public btz a(arq $$0, btz $$1) {
      if ($$1 instanceof cja) {
         cje $$2 = bup.at.a($$0, buo.e);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         cjb $$3 = (cjb)$$1;
         cjb $$4 = bup.ab.a($$0, buo.e);
         if ($$4 != null) {
            int $$5 = this.af.a(9);
            cji $$6;
            if ($$5 < 4) {
               $$6 = this.q();
            } else if ($$5 < 8) {
               $$6 = $$3.q();
            } else {
               $$6 = ae.a(cji.values(), this.af);
            }

            int $$9 = this.af.a(5);
            cjd $$10;
            if ($$9 < 2) {
               $$10 = this.t();
            } else if ($$9 < 4) {
               $$10 = $$3.t();
            } else {
               $$10 = ae.a(cjd.values(), this.af);
            }

            $$4.a($$6, $$10);
            this.a($$1, $$4);
         }

         return $$4;
      }
   }

   @Override
   public boolean e(buq $$0) {
      return true;
   }

   @Nullable
   @Override
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      azv $$4 = $$0.E_();
      cji $$5;
      if ($$3 instanceof cjb.a) {
         $$5 = ((cjb.a)$$3).a;
      } else {
         $$5 = ae.a(cji.values(), $$4);
         $$3 = new cjb.a($$5);
      }

      this.a($$5, ae.a(cjd.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bul e(bvq $$0) {
      return this.p_() ? bZ : super.e($$0);
   }

   public static class a extends btz.a {
      public final cji a;

      public a(cji $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
