import javax.annotation.Nullable;

public class cis extends ciq implements bvv<ciz> {
   private static final akk<Integer> bY = ako.a(cis.class, akm.b);
   private static final buc bZ = bug.ab.n().a(bub.a().a(bua.a, 0.0F, bug.ab.m() + 0.125F, 0.0F)).a(0.5F);

   public cis(bug<? extends cis> $$0, dev $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(azr $$0) {
      this.g(bwd.s).a((double)a($$0::a));
      this.g(bwd.v).a(b($$0::j));
      this.g(bwd.o).a(a($$0::j));
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(bY, 0);
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("Variant", this.y());
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      this.x($$0.h("Variant"));
   }

   private void x(int $$0) {
      this.am.a(bY, $$0);
   }

   private int y() {
      return this.am.a(bY);
   }

   private void a(ciz $$0, ciu $$1) {
      this.x($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public ciz q() {
      return ciz.a(this.y() & 0xFF);
   }

   public void a(ciz $$0) {
      this.x($$0.a() & 0xFF | this.y() & -256);
   }

   public ciu t() {
      return ciu.a((this.y() & 0xFF00) >> 8);
   }

   @Override
   public void a(brr $$0) {
      cvx $$1 = this.ak();
      super.a($$0);
      cvx $$2 = this.ak();
      if (this.ag > 20 && this.a($$2, buh.g) && $$1 != $$2) {
         this.a(awk.mH, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(dpl $$0) {
      super.a($$0);
      if (this.af.a(10) == 0) {
         this.a(awk.mI, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected awj w() {
      return awk.mF;
   }

   @Override
   protected awj o_() {
      return awk.mJ;
   }

   @Nullable
   @Override
   protected awj gx() {
      return awk.mK;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.mM;
   }

   @Override
   protected awj gW() {
      return awk.mG;
   }

   @Override
   public bry b(coh $$0, brx $$1) {
      boolean $$2 = !this.p_() && this.gM() && $$0.ga();
      if (!this.cb() && !$$2) {
         cvx $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.l($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gM()) {
               this.hd();
               return bry.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(cgm $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cir) && !($$0 instanceof cis) ? false : this.hf() && ((ciq)$$0).hf();
      }
   }

   @Nullable
   @Override
   public btq a(arm $$0, btq $$1) {
      if ($$1 instanceof cir) {
         civ $$2 = bug.at.a($$0, buf.e);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         cis $$3 = (cis)$$1;
         cis $$4 = bug.ab.a($$0, buf.e);
         if ($$4 != null) {
            int $$5 = this.af.a(9);
            ciz $$6;
            if ($$5 < 4) {
               $$6 = this.q();
            } else if ($$5 < 8) {
               $$6 = $$3.q();
            } else {
               $$6 = ad.a(ciz.values(), this.af);
            }

            int $$9 = this.af.a(5);
            ciu $$10;
            if ($$9 < 2) {
               $$10 = this.t();
            } else if ($$9 < 4) {
               $$10 = $$3.t();
            } else {
               $$10 = ad.a(ciu.values(), this.af);
            }

            $$4.a($$6, $$10);
            this.a($$1, $$4);
         }

         return $$4;
      }
   }

   @Override
   public boolean e(buh $$0) {
      return true;
   }

   @Nullable
   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      azr $$4 = $$0.E_();
      ciz $$5;
      if ($$3 instanceof cis.a) {
         $$5 = ((cis.a)$$3).a;
      } else {
         $$5 = ad.a(ciz.values(), $$4);
         $$3 = new cis.a($$5);
      }

      this.a($$5, ad.a(ciu.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public buc e(bvh $$0) {
      return this.p_() ? bZ : super.e($$0);
   }

   public static class a extends btq.a {
      public final ciz a;

      public a(ciz $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
