import javax.annotation.Nullable;

public class cgk extends cgi implements btn<cgr> {
   private static final ajy<Integer> ch = akc.a(cgk.class, aka.b);
   private static final bry ci = bsb.ad.n().a(brx.a().a(brw.a, 0.0F, bsb.ad.l() + 0.125F, 0.0F)).a(0.5F);

   public cgk(bsb<? extends cgk> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ayt $$0) {
      this.f(btv.q).a((double)a($$0::a));
      this.f(btv.r).a(b($$0::j));
      this.f(btv.m).a(a($$0::j));
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(ch, 0);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("Variant", this.gy());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.y($$0.h("Variant"));
   }

   private void y(int $$0) {
      this.as.a(ch, $$0);
   }

   private int gy() {
      return this.as.a(ch);
   }

   private void a(cgr $$0, cgm $$1) {
      this.y($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public cgr r() {
      return cgr.a(this.gy() & 0xFF);
   }

   public void a(cgr $$0) {
      this.y($$0.a() & 0xFF | this.gy() & -256);
   }

   public cgm t() {
      return cgm.a((this.gy() & 0xFF00) >> 8);
   }

   @Override
   public void a(bpt $$0) {
      cuh $$1 = this.fZ();
      super.a($$0);
      cuh $$2 = this.fZ();
      if (this.am > 20 && this.l($$2) && $$1 != $$2) {
         this.a(avo.mY, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(dnd $$0) {
      super.a($$0);
      if (this.al.a(10) == 0) {
         this.a(avo.mZ, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected avn u() {
      return avo.mW;
   }

   @Override
   protected avn n_() {
      return avo.na;
   }

   @Nullable
   @Override
   protected avn gF() {
      return avo.nb;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.nd;
   }

   @Override
   protected avn gW() {
      return avo.mX;
   }

   @Override
   public bqa b(cly $$0, bpz $$1) {
      boolean $$2 = !this.o_() && this.gN() && $$0.ga();
      if (!this.bX() && !$$2) {
         cuh $$3 = $$0.b($$1);
         if (!$$3.d()) {
            if (this.o($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gN()) {
               this.hd();
               return bqa.a(this.dU().C);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(cee $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cgj) && !($$0 instanceof cgk) ? false : this.hf() && ((cgi)$$0).hf();
      }
   }

   @Nullable
   @Override
   public brp a(aqt $$0, brp $$1) {
      if ($$1 instanceof cgj) {
         cgn $$2 = bsb.au.a((dca)$$0);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         cgk $$3 = (cgk)$$1;
         cgk $$4 = bsb.ad.a((dca)$$0);
         if ($$4 != null) {
            int $$5 = this.al.a(9);
            cgr $$6;
            if ($$5 < 4) {
               $$6 = this.r();
            } else if ($$5 < 8) {
               $$6 = $$3.r();
            } else {
               $$6 = ad.a(cgr.values(), this.al);
            }

            int $$9 = this.al.a(5);
            cgm $$10;
            if ($$9 < 2) {
               $$10 = this.t();
            } else if ($$9 < 4) {
               $$10 = $$3.t();
            } else {
               $$10 = ad.a(cgm.values(), this.al);
            }

            $$4.a($$6, $$10);
            this.a($$1, $$4);
         }

         return $$4;
      }
   }

   @Override
   public boolean ga() {
      return true;
   }

   @Override
   public boolean l(cuh $$0) {
      if ($$0.f() instanceof crs $$1 && $$1.d() == crs.a.a) {
         return true;
      }

      return false;
   }

   @Nullable
   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      ayt $$4 = $$0.F_();
      cgr $$5;
      if ($$3 instanceof cgk.a) {
         $$5 = ((cgk.a)$$3).a;
      } else {
         $$5 = ad.a(cgr.values(), $$4);
         $$3 = new cgk.a($$5);
      }

      this.a($$5, ad.a(cgm.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bry e(bsz $$0) {
      return this.o_() ? ci : super.e($$0);
   }

   public static class a extends brp.a {
      public final cgr a;

      public a(cgr $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
