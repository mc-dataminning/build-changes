import java.util.UUID;
import javax.annotation.Nullable;

public class bwk extends bwi implements bjw<bwr> {
   private static final UUID bT = UUID.fromString("556E1665-8B10-40C8-8F9D-CF9B1667F295");
   private static final adz<Integer> bU = aec.a(bwk.class, aeb.b);

   public bwk(bim<? extends bwk> $$0, cpl $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(aru $$0) {
      this.a(bke.a).a((double)a($$0::a));
      this.a(bke.d).a(b($$0::j));
      this.a(bke.n).a(a($$0::j));
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bU, 0);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("Variant", this.gi());
      if (!this.cp.a(1).b()) {
         $$0.a("ArmorItem", this.cp.a(1).b(new qr()));
      }
   }

   public cix p() {
      return this.c(bin.e);
   }

   private void n(cix $$0) {
      this.a(bin.e, $$0);
      this.a(bin.e, 0.0F);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.w($$0.h("Variant"));
      if ($$0.b("ArmorItem", 10)) {
         cix $$1 = cix.a($$0.p("ArmorItem"));
         if (!$$1.b() && this.l($$1)) {
            this.cp.a(1, $$1);
         }
      }

      this.gx();
   }

   private void w(int $$0) {
      this.an.b(bU, $$0);
   }

   private int gi() {
      return this.an.b(bU);
   }

   private void a(bwr $$0, bwm $$1) {
      this.w($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public bwr q() {
      return bwr.a(this.gi() & 0xFF);
   }

   public void a(bwr $$0) {
      this.w($$0.a() & 0xFF | this.gi() & -256);
   }

   public bwm ga() {
      return bwm.a((this.gi() & 0xFF00) >> 8);
   }

   @Override
   protected void gx() {
      if (!this.dK().B) {
         super.gx();
         this.o(this.cp.a(1));
         this.a(bin.e, 0.0F);
      }
   }

   private void o(cix $$0) {
      this.n($$0);
      if (!this.dK().B) {
         this.a(bke.i).b(bT);
         if (this.l($$0)) {
            int $$1 = ((cin)$$0.d()).i();
            if ($$1 != 0) {
               this.a(bke.i).b(new bkc(bT, "Horse armor bonus", (double)$$1, bkc.a.a));
            }
         }
      }
   }

   @Override
   public void a(bgj $$0) {
      cix $$1 = this.p();
      super.a($$0);
      cix $$2 = this.p();
      if (this.ah > 20 && this.l($$2) && $$1 != $$2) {
         this.a(aow.lg, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(czy $$0) {
      super.a($$0);
      if (this.ag.a(10) == 0) {
         this.a(aow.lh, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected aov r() {
      return aow.le;
   }

   @Override
   protected aov h_() {
      return aow.li;
   }

   @Nullable
   @Override
   protected aov gh() {
      return aow.lj;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.ll;
   }

   @Override
   protected aov gz() {
      return aow.lf;
   }

   @Override
   public bgq b(cbm $$0, bgp $$1) {
      boolean $$2 = !this.i_() && this.gp() && $$0.fG();
      if (!this.bO() && !$$2) {
         cix $$3 = $$0.b($$1);
         if (!$$3.b()) {
            if (this.m($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gp()) {
               this.gG();
               return bgq.a(this.dK().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(buj $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof bwj) && !($$0 instanceof bwk) ? false : this.gI() && ((bwi)$$0).gI();
      }
   }

   @Nullable
   @Override
   public bid a(akk $$0, bid $$1) {
      if ($$1 instanceof bwj) {
         bwn $$2 = bim.ap.a((cpl)$$0);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         bwk $$3 = (bwk)$$1;
         bwk $$4 = bim.Y.a((cpl)$$0);
         if ($$4 != null) {
            int $$5 = this.ag.a(9);
            bwr $$6;
            if ($$5 < 4) {
               $$6 = this.q();
            } else if ($$5 < 8) {
               $$6 = $$3.q();
            } else {
               $$6 = ac.a(bwr.values(), this.ag);
            }

            int $$9 = this.ag.a(5);
            bwm $$10;
            if ($$9 < 2) {
               $$10 = this.ga();
            } else if ($$9 < 4) {
               $$10 = $$3.ga();
            } else {
               $$10 = ac.a(bwm.values(), this.ag);
            }

            $$4.a($$6, $$10);
            this.a($$1, $$4);
         }

         return $$4;
      }
   }

   @Override
   public boolean gJ() {
      return true;
   }

   @Override
   public boolean l(cix $$0) {
      return $$0.d() instanceof cin;
   }

   @Nullable
   @Override
   public bjr a(cqa $$0, bgo $$1, bjc $$2, @Nullable bjr $$3, @Nullable qr $$4) {
      aru $$5 = $$0.y_();
      bwr $$6;
      if ($$3 instanceof bwk.a) {
         $$6 = ((bwk.a)$$3).a;
      } else {
         $$6 = ac.a(bwr.values(), $$5);
         $$3 = new bwk.a($$6);
      }

      this.a($$6, ac.a(bwm.values(), $$5));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static class a extends bid.a {
      public final bwr a;

      public a(bwr $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
