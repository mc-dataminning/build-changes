import java.util.UUID;
import javax.annotation.Nullable;

public class bxv extends bxt implements blh<byc> {
   private static final UUID bT = UUID.fromString("556E1665-8B10-40C8-8F9D-CF9B1667F295");
   private static final afc<Integer> bU = aff.a(bxv.class, afe.b);

   public bxv(bjx<? extends bxv> $$0, cqz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ate $$0) {
      this.a(blp.l).a((double)a($$0::a));
      this.a(blp.m).a(b($$0::j));
      this.a(blp.h).a(a($$0::j));
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(bU, 0);
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      $$0.a("Variant", this.gm());
      if (!this.cp.a(1).b()) {
         $$0.a("ArmorItem", this.cp.a(1).b(new rt()));
      }
   }

   public ckj s() {
      return this.c(bjy.e);
   }

   private void n(ckj $$0) {
      this.a(bjy.e, $$0);
      this.a(bjy.e, 0.0F);
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      this.w($$0.h("Variant"));
      if ($$0.b("ArmorItem", 10)) {
         ckj $$1 = ckj.a($$0.p("ArmorItem"));
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

   private void a(byc $$0, bxx $$1) {
      this.w($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public byc t() {
      return byc.a(this.gm() & 0xFF);
   }

   public void a(byc $$0) {
      this.w($$0.a() & 0xFF | this.gm() & -256);
   }

   public bxx ge() {
      return bxx.a((this.gm() & 0xFF00) >> 8);
   }

   @Override
   protected void gB() {
      if (!this.dL().B) {
         super.gB();
         this.o(this.cp.a(1));
         this.a(bjy.e, 0.0F);
      }
   }

   private void o(ckj $$0) {
      this.n($$0);
      if (!this.dL().B) {
         this.a(blp.a).b(bT);
         if (this.l($$0)) {
            int $$1 = ((cjz)$$0.d()).i();
            if ($$1 != 0) {
               this.a(blp.a).b(new bln(bT, "Horse armor bonus", (double)$$1, bln.a.a));
            }
         }
      }
   }

   @Override
   public void a(bhu $$0) {
      ckj $$1 = this.s();
      super.a($$0);
      ckj $$2 = this.s();
      if (this.ah > 20 && this.l($$2) && $$1 != $$2) {
         this.a(aqd.li, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(dbl $$0) {
      super.a($$0);
      if (this.ag.a(10) == 0) {
         this.a(aqd.lj, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected aqc w() {
      return aqd.lg;
   }

   @Override
   protected aqc m_() {
      return aqd.lk;
   }

   @Nullable
   @Override
   protected aqc gl() {
      return aqd.ll;
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.ln;
   }

   @Override
   protected aqc gD() {
      return aqd.lh;
   }

   @Override
   public bib b(ccx $$0, bia $$1) {
      boolean $$2 = !this.n_() && this.gt() && $$0.fI();
      if (!this.bO() && !$$2) {
         ckj $$3 = $$0.b($$1);
         if (!$$3.b()) {
            if (this.m($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gt()) {
               this.gK();
               return bib.a(this.dL().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(bvu $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof bxu) && !($$0 instanceof bxv) ? false : this.gM() && ((bxt)$$0).gM();
      }
   }

   @Nullable
   @Override
   public bjo a(alq $$0, bjo $$1) {
      if ($$1 instanceof bxu) {
         bxy $$2 = bjx.ap.a((cqz)$$0);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         bxv $$3 = (bxv)$$1;
         bxv $$4 = bjx.Y.a((cqz)$$0);
         if ($$4 != null) {
            int $$5 = this.ag.a(9);
            byc $$6;
            if ($$5 < 4) {
               $$6 = this.t();
            } else if ($$5 < 8) {
               $$6 = $$3.t();
            } else {
               $$6 = ac.a(byc.values(), this.ag);
            }

            int $$9 = this.ag.a(5);
            bxx $$10;
            if ($$9 < 2) {
               $$10 = this.ge();
            } else if ($$9 < 4) {
               $$10 = $$3.ge();
            } else {
               $$10 = ac.a(bxx.values(), this.ag);
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
   public boolean l(ckj $$0) {
      return $$0.d() instanceof cjz;
   }

   @Nullable
   @Override
   public blc a(cro $$0, bhz $$1, bkn $$2, @Nullable blc $$3, @Nullable rt $$4) {
      ate $$5 = $$0.E_();
      byc $$6;
      if ($$3 instanceof bxv.a) {
         $$6 = ((bxv.a)$$3).a;
      } else {
         $$6 = ac.a(byc.values(), $$5);
         $$3 = new bxv.a($$6);
      }

      this.a($$6, ac.a(bxx.values(), $$5));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static class a extends bjo.a {
      public final byc a;

      public a(byc $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
