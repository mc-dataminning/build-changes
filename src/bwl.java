import java.util.UUID;
import javax.annotation.Nullable;

public class bwl extends bwj implements bjx<bws> {
   private static final UUID bT = UUID.fromString("556E1665-8B10-40C8-8F9D-CF9B1667F295");
   private static final adz<Integer> bU = aec.a(bwl.class, aeb.b);

   public bwl(bim<? extends bwl> $$0, cpm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(aru $$0) {
      this.a(bkf.a).a((double)a($$0::a));
      this.a(bkf.d).a(b($$0::j));
      this.a(bkf.n).a(a($$0::j));
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bU, 0);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("Variant", this.gh());
      if (!this.cp.a(1).b()) {
         $$0.a("ArmorItem", this.cp.a(1).b(new qr()));
      }
   }

   public ciy p() {
      return this.c(bin.e);
   }

   private void n(ciy $$0) {
      this.a(bin.e, $$0);
      this.a(bin.e, 0.0F);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.w($$0.h("Variant"));
      if ($$0.b("ArmorItem", 10)) {
         ciy $$1 = ciy.a($$0.p("ArmorItem"));
         if (!$$1.b() && this.l($$1)) {
            this.cp.a(1, $$1);
         }
      }

      this.gw();
   }

   private void w(int $$0) {
      this.an.b(bU, $$0);
   }

   private int gh() {
      return this.an.b(bU);
   }

   private void a(bws $$0, bwn $$1) {
      this.w($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public bws q() {
      return bws.a(this.gh() & 0xFF);
   }

   public void a(bws $$0) {
      this.w($$0.a() & 0xFF | this.gh() & -256);
   }

   public bwn fZ() {
      return bwn.a((this.gh() & 0xFF00) >> 8);
   }

   @Override
   protected void gw() {
      if (!this.dK().B) {
         super.gw();
         this.o(this.cp.a(1));
         this.a(bin.e, 0.0F);
      }
   }

   private void o(ciy $$0) {
      this.n($$0);
      if (!this.dK().B) {
         this.a(bkf.i).b(bT);
         if (this.l($$0)) {
            int $$1 = ((cio)$$0.d()).i();
            if ($$1 != 0) {
               this.a(bkf.i).b(new bkd(bT, "Horse armor bonus", (double)$$1, bkd.a.a));
            }
         }
      }
   }

   @Override
   public void a(bgj $$0) {
      ciy $$1 = this.p();
      super.a($$0);
      ciy $$2 = this.p();
      if (this.ah > 20 && this.l($$2) && $$1 != $$2) {
         this.a(aow.lg, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(czz $$0) {
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
   protected aov gg() {
      return aow.lj;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.ll;
   }

   @Override
   protected aov gy() {
      return aow.lf;
   }

   @Override
   public bgq b(cbn $$0, bgp $$1) {
      boolean $$2 = !this.i_() && this.go() && $$0.fG();
      if (!this.bO() && !$$2) {
         ciy $$3 = $$0.b($$1);
         if (!$$3.b()) {
            if (this.m($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.go()) {
               this.gF();
               return bgq.a(this.dK().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(buk $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof bwk) && !($$0 instanceof bwl) ? false : this.gH() && ((bwj)$$0).gH();
      }
   }

   @Nullable
   @Override
   public bid a(akk $$0, bid $$1) {
      if ($$1 instanceof bwk) {
         bwo $$2 = bim.ap.a((cpm)$$0);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         bwl $$3 = (bwl)$$1;
         bwl $$4 = bim.Y.a((cpm)$$0);
         if ($$4 != null) {
            int $$5 = this.ag.a(9);
            bws $$6;
            if ($$5 < 4) {
               $$6 = this.q();
            } else if ($$5 < 8) {
               $$6 = $$3.q();
            } else {
               $$6 = ac.a(bws.values(), this.ag);
            }

            int $$9 = this.ag.a(5);
            bwn $$10;
            if ($$9 < 2) {
               $$10 = this.fZ();
            } else if ($$9 < 4) {
               $$10 = $$3.fZ();
            } else {
               $$10 = ac.a(bwn.values(), this.ag);
            }

            $$4.a($$6, $$10);
            this.a($$1, $$4);
         }

         return $$4;
      }
   }

   @Override
   public boolean gI() {
      return true;
   }

   @Override
   public boolean l(ciy $$0) {
      return $$0.d() instanceof cio;
   }

   @Nullable
   @Override
   public bjs a(cqb $$0, bgo $$1, bjc $$2, @Nullable bjs $$3, @Nullable qr $$4) {
      aru $$5 = $$0.y_();
      bws $$6;
      if ($$3 instanceof bwl.a) {
         $$6 = ((bwl.a)$$3).a;
      } else {
         $$6 = ac.a(bws.values(), $$5);
         $$3 = new bwl.a($$6);
      }

      this.a($$6, ac.a(bwn.values(), $$5));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static class a extends bid.a {
      public final bws a;

      public a(bws $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
