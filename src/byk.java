import java.util.UUID;
import javax.annotation.Nullable;

public class byk extends byi implements blw<byr> {
   private static final UUID bT = UUID.fromString("556E1665-8B10-40C8-8F9D-CF9B1667F295");
   private static final afm<Integer> bU = afp.a(byk.class, afo.b);

   public byk(bkm<? extends byk> $$0, crs $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ato $$0) {
      this.a(bme.l).a((double)a($$0::a));
      this.a(bme.m).a(b($$0::j));
      this.a(bme.h).a(a($$0::j));
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(bU, 0);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("Variant", this.gm());
      if (!this.cp.a(1).b()) {
         $$0.a("ArmorItem", this.cp.a(1).b(new rz()));
      }
   }

   public clb s() {
      return this.c(bkn.e);
   }

   private void n(clb $$0) {
      this.a(bkn.e, $$0);
      this.a(bkn.e, 0.0F);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.w($$0.h("Variant"));
      if ($$0.b("ArmorItem", 10)) {
         clb $$1 = clb.a($$0.p("ArmorItem"));
         if (!$$1.b() && this.l($$1)) {
            this.cp.a(1, $$1);
         }
      }

      this.gB();
   }

   private void w(int $$0) {
      this.an.b(bU, $$0);
   }

   private int gm() {
      return this.an.b(bU);
   }

   private void a(byr $$0, bym $$1) {
      this.w($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public byr t() {
      return byr.a(this.gm() & 0xFF);
   }

   public void a(byr $$0) {
      this.w($$0.a() & 0xFF | this.gm() & -256);
   }

   public bym ge() {
      return bym.a((this.gm() & 0xFF00) >> 8);
   }

   @Override
   protected void gB() {
      if (!this.dL().B) {
         super.gB();
         this.o(this.cp.a(1));
         this.a(bkn.e, 0.0F);
      }
   }

   private void o(clb $$0) {
      this.n($$0);
      if (!this.dL().B) {
         this.a(bme.a).b(bT);
         if (this.l($$0)) {
            int $$1 = ((ckr)$$0.d()).i();
            if ($$1 != 0) {
               this.a(bme.a).b(new bmc(bT, "Horse armor bonus", (double)$$1, bmc.a.a));
            }
         }
      }
   }

   @Override
   public void a(bij $$0) {
      clb $$1 = this.s();
      super.a($$0);
      clb $$2 = this.s();
      if (this.ah > 20 && this.l($$2) && $$1 != $$2) {
         this.a(aqn.lk, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(dcf $$0) {
      super.a($$0);
      if (this.ag.a(10) == 0) {
         this.a(aqn.ll, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected aqm w() {
      return aqn.li;
   }

   @Override
   protected aqm m_() {
      return aqn.lm;
   }

   @Nullable
   @Override
   protected aqm gl() {
      return aqn.ln;
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.lp;
   }

   @Override
   protected aqm gD() {
      return aqn.lj;
   }

   @Override
   public biq b(cdm $$0, bip $$1) {
      boolean $$2 = !this.n_() && this.gt() && $$0.fI();
      if (!this.bO() && !$$2) {
         clb $$3 = $$0.b($$1);
         if (!$$3.b()) {
            if (this.m($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gt()) {
               this.gK();
               return biq.a(this.dL().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(bwj $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof byj) && !($$0 instanceof byk) ? false : this.gM() && ((byi)$$0).gM();
      }
   }

   @Nullable
   @Override
   public bkd a(ama $$0, bkd $$1) {
      if ($$1 instanceof byj) {
         byn $$2 = bkm.ap.a((crs)$$0);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         byk $$3 = (byk)$$1;
         byk $$4 = bkm.Y.a((crs)$$0);
         if ($$4 != null) {
            int $$5 = this.ag.a(9);
            byr $$6;
            if ($$5 < 4) {
               $$6 = this.t();
            } else if ($$5 < 8) {
               $$6 = $$3.t();
            } else {
               $$6 = ac.a(byr.values(), this.ag);
            }

            int $$9 = this.ag.a(5);
            bym $$10;
            if ($$9 < 2) {
               $$10 = this.ge();
            } else if ($$9 < 4) {
               $$10 = $$3.ge();
            } else {
               $$10 = ac.a(bym.values(), this.ag);
            }

            $$4.a($$6, $$10);
            this.a($$1, $$4);
         }

         return $$4;
      }
   }

   @Override
   public boolean gN() {
      return true;
   }

   @Override
   public boolean l(clb $$0) {
      return $$0.d() instanceof ckr;
   }

   @Nullable
   @Override
   public blr a(csh $$0, bio $$1, blc $$2, @Nullable blr $$3, @Nullable rz $$4) {
      ato $$5 = $$0.E_();
      byr $$6;
      if ($$3 instanceof byk.a) {
         $$6 = ((byk.a)$$3).a;
      } else {
         $$6 = ac.a(byr.values(), $$5);
         $$3 = new byk.a($$6);
      }

      this.a($$6, ac.a(bym.values(), $$5));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static class a extends bkd.a {
      public final byr a;

      public a(byr $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
