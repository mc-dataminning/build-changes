import java.util.UUID;
import javax.annotation.Nullable;

public class bwn extends bwl implements bjz<bwu> {
   private static final UUID bT = UUID.fromString("556E1665-8B10-40C8-8F9D-CF9B1667F295");
   private static final aec<Integer> bU = aef.a(bwn.class, aee.b);

   public bwn(bip<? extends bwn> $$0, cpq $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(arx $$0) {
      this.a(bkh.a).a((double)a($$0::a));
      this.a(bkh.d).a(b($$0::j));
      this.a(bkh.n).a(a($$0::j));
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bU, 0);
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      $$0.a("Variant", this.gi());
      if (!this.cp.a(1).b()) {
         $$0.a("ArmorItem", this.cp.a(1).b(new qu()));
      }
   }

   public cja p() {
      return this.c(biq.e);
   }

   private void n(cja $$0) {
      this.a(biq.e, $$0);
      this.a(biq.e, 0.0F);
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.w($$0.h("Variant"));
      if ($$0.b("ArmorItem", 10)) {
         cja $$1 = cja.a($$0.p("ArmorItem"));
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

   private void a(bwu $$0, bwp $$1) {
      this.w($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public bwu q() {
      return bwu.a(this.gi() & 0xFF);
   }

   public void a(bwu $$0) {
      this.w($$0.a() & 0xFF | this.gi() & -256);
   }

   public bwp ga() {
      return bwp.a((this.gi() & 0xFF00) >> 8);
   }

   @Override
   protected void gx() {
      if (!this.dK().B) {
         super.gx();
         this.o(this.cp.a(1));
         this.a(biq.e, 0.0F);
      }
   }

   private void o(cja $$0) {
      this.n($$0);
      if (!this.dK().B) {
         this.a(bkh.i).b(bT);
         if (this.l($$0)) {
            int $$1 = ((ciq)$$0.d()).i();
            if ($$1 != 0) {
               this.a(bkh.i).b(new bkf(bT, "Horse armor bonus", (double)$$1, bkf.a.a));
            }
         }
      }
   }

   @Override
   public void a(bgm $$0) {
      cja $$1 = this.p();
      super.a($$0);
      cja $$2 = this.p();
      if (this.ah > 20 && this.l($$2) && $$1 != $$2) {
         this.a(aoz.lg, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(dad $$0) {
      super.a($$0);
      if (this.ag.a(10) == 0) {
         this.a(aoz.lh, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected aoy r() {
      return aoz.le;
   }

   @Override
   protected aoy h_() {
      return aoz.li;
   }

   @Nullable
   @Override
   protected aoy gh() {
      return aoz.lj;
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.ll;
   }

   @Override
   protected aoy gz() {
      return aoz.lf;
   }

   @Override
   public bgt b(cbp $$0, bgs $$1) {
      boolean $$2 = !this.i_() && this.gp() && $$0.fG();
      if (!this.bO() && !$$2) {
         cja $$3 = $$0.b($$1);
         if (!$$3.b()) {
            if (this.m($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gp()) {
               this.gG();
               return bgt.a(this.dK().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(bum $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof bwm) && !($$0 instanceof bwn) ? false : this.gI() && ((bwl)$$0).gI();
      }
   }

   @Nullable
   @Override
   public big a(akn $$0, big $$1) {
      if ($$1 instanceof bwm) {
         bwq $$2 = bip.ap.a((cpq)$$0);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         bwn $$3 = (bwn)$$1;
         bwn $$4 = bip.Y.a((cpq)$$0);
         if ($$4 != null) {
            int $$5 = this.ag.a(9);
            bwu $$6;
            if ($$5 < 4) {
               $$6 = this.q();
            } else if ($$5 < 8) {
               $$6 = $$3.q();
            } else {
               $$6 = ac.a(bwu.values(), this.ag);
            }

            int $$9 = this.ag.a(5);
            bwp $$10;
            if ($$9 < 2) {
               $$10 = this.ga();
            } else if ($$9 < 4) {
               $$10 = $$3.ga();
            } else {
               $$10 = ac.a(bwp.values(), this.ag);
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
   public boolean l(cja $$0) {
      return $$0.d() instanceof ciq;
   }

   @Nullable
   @Override
   public bju a(cqf $$0, bgr $$1, bjf $$2, @Nullable bju $$3, @Nullable qu $$4) {
      arx $$5 = $$0.y_();
      bwu $$6;
      if ($$3 instanceof bwn.a) {
         $$6 = ((bwn.a)$$3).a;
      } else {
         $$6 = ac.a(bwu.values(), $$5);
         $$3 = new bwn.a($$6);
      }

      this.a($$6, ac.a(bwp.values(), $$5));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static class a extends big.a {
      public final bwu a;

      public a(bwu $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
