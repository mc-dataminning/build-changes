import javax.annotation.Nullable;

public class cgk extends cgi implements bto<cgr> {
   private static final ajr<Integer> bY = ajv.a(cgk.class, ajt.b);
   private static final brx bZ = bsa.ab.n().a(brw.a().a(brv.a, 0.0F, bsa.ab.m() + 0.125F, 0.0F)).a(0.5F);

   public cgk(bsa<? extends cgk> $$0, dax $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ayk $$0) {
      this.f(btw.q).a((double)a($$0::a));
      this.f(btw.r).a(b($$0::j));
      this.f(btw.m).a(a($$0::j));
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(bY, 0);
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("Variant", this.gp());
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.x($$0.h("Variant"));
   }

   private void x(int $$0) {
      this.ao.a(bY, $$0);
   }

   private int gp() {
      return this.ao.a(bY);
   }

   private void a(cgr $$0, cgm $$1) {
      this.x($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public cgr s() {
      return cgr.a(this.gp() & 0xFF);
   }

   public void a(cgr $$0) {
      this.x($$0.a() & 0xFF | this.gp() & -256);
   }

   public cgm u() {
      return cgm.a((this.gp() & 0xFF00) >> 8);
   }

   @Override
   public void a(bpn $$0) {
      cto $$1 = this.fQ();
      super.a($$0);
      cto $$2 = this.fQ();
      if (this.ai > 20 && this.l($$2) && $$1 != $$2) {
         this.a(avh.mI, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(dll $$0) {
      super.a($$0);
      if (this.ah.a(10) == 0) {
         this.a(avh.mJ, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected avg v() {
      return avh.mG;
   }

   @Override
   protected avg o_() {
      return avh.mK;
   }

   @Nullable
   @Override
   protected avg gw() {
      return avh.mL;
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.mN;
   }

   @Override
   protected avg gN() {
      return avh.mH;
   }

   @Override
   public bpu b(clw $$0, bpt $$1) {
      boolean $$2 = !this.p_() && this.gE() && $$0.fR();
      if (!this.bS() && !$$2) {
         cto $$3 = $$0.b($$1);
         if (!$$3.e()) {
            if (this.o($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gE()) {
               this.gU();
               return bpu.a(this.dP().B);
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
         return !($$0 instanceof cgj) && !($$0 instanceof cgk) ? false : this.gW() && ((cgi)$$0).gW();
      }
   }

   @Nullable
   @Override
   public bro a(aqm $$0, bro $$1) {
      if ($$1 instanceof cgj) {
         cgn $$2 = bsa.at.a((dax)$$0);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         cgk $$3 = (cgk)$$1;
         cgk $$4 = bsa.ab.a((dax)$$0);
         if ($$4 != null) {
            int $$5 = this.ah.a(9);
            cgr $$6;
            if ($$5 < 4) {
               $$6 = this.s();
            } else if ($$5 < 8) {
               $$6 = $$3.s();
            } else {
               $$6 = ac.a(cgr.values(), this.ah);
            }

            int $$9 = this.ah.a(5);
            cgm $$10;
            if ($$9 < 2) {
               $$10 = this.u();
            } else if ($$9 < 4) {
               $$10 = $$3.u();
            } else {
               $$10 = ac.a(cgm.values(), this.ah);
            }

            $$4.a($$6, $$10);
            this.a($$1, $$4);
         }

         return $$4;
      }
   }

   @Override
   public boolean fR() {
      return true;
   }

   @Override
   public boolean l(cto $$0) {
      if ($$0.g() instanceof crc $$1 && $$1.d() == crc.a.a) {
         return true;
      }

      return false;
   }

   @Nullable
   @Override
   public bth a(dbm $$0, bps $$1, bss $$2, @Nullable bth $$3) {
      ayk $$4 = $$0.E_();
      cgr $$5;
      if ($$3 instanceof cgk.a) {
         $$5 = ((cgk.a)$$3).a;
      } else {
         $$5 = ac.a(cgr.values(), $$4);
         $$3 = new cgk.a($$5);
      }

      this.a($$5, ac.a(cgm.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public brx e(bta $$0) {
      return this.p_() ? bZ : super.e($$0);
   }

   public static class a extends bro.a {
      public final cgr a;

      public a(cgr $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
