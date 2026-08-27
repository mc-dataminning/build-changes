import java.util.UUID;
import javax.annotation.Nullable;

public class bzz extends bzx implements bnj<cag> {
   private static final UUID bT = UUID.fromString("556E1665-8B10-40C8-8F9D-CF9B1667F295");
   private static final agm<Integer> bU = agp.a(bzz.class, ago.b);

   public bzz(blz<? extends bzz> $$0, ctp $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(auv $$0) {
      this.a(bnr.l).a((double)a($$0::a));
      this.a(bnr.m).a(b($$0::j));
      this.a(bnr.h).a(a($$0::j));
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bU, 0);
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("Variant", this.gm());
      if (!this.cp.a(1).b()) {
         $$0.a("ArmorItem", this.cp.a(1).b(new sn()));
      }
   }

   public cmy u() {
      return this.c(bma.e);
   }

   private void n(cmy $$0) {
      this.a(bma.e, $$0);
      this.a(bma.e, 0.0F);
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.w($$0.h("Variant"));
      if ($$0.b("ArmorItem", 10)) {
         cmy $$1 = cmy.a($$0.p("ArmorItem"));
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

   private void a(cag $$0, cab $$1) {
      this.w($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public cag w() {
      return cag.a(this.gm() & 0xFF);
   }

   public void a(cag $$0) {
      this.w($$0.a() & 0xFF | this.gm() & -256);
   }

   public cab ge() {
      return cab.a((this.gm() & 0xFF00) >> 8);
   }

   @Override
   protected void gB() {
      if (!this.dM().B) {
         super.gB();
         this.o(this.cp.a(1));
         this.a(bma.e, 0.0F);
      }
   }

   private void o(cmy $$0) {
      this.n($$0);
      if (!this.dM().B) {
         this.a(bnr.a).b(bT);
         if (this.l($$0)) {
            int $$1 = ((cmo)$$0.d()).i();
            if ($$1 != 0) {
               this.a(bnr.a).b(new bnp(bT, "Horse armor bonus", (double)$$1, bnp.a.a));
            }
         }
      }
   }

   @Override
   public void a(bju $$0) {
      cmy $$1 = this.u();
      super.a($$0);
      cmy $$2 = this.u();
      if (this.ah > 20 && this.l($$2) && $$1 != $$2) {
         this.a(ars.lU, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(dec $$0) {
      super.a($$0);
      if (this.ag.a(10) == 0) {
         this.a(ars.lV, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected arr y() {
      return ars.lS;
   }

   @Override
   protected arr n_() {
      return ars.lW;
   }

   @Nullable
   @Override
   protected arr gl() {
      return ars.lX;
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.lZ;
   }

   @Override
   protected arr gD() {
      return ars.lT;
   }

   @Override
   public bkb b(cfi $$0, bka $$1) {
      boolean $$2 = !this.o_() && this.gt() && $$0.fI();
      if (!this.bP() && !$$2) {
         cmy $$3 = $$0.b($$1);
         if (!$$3.b()) {
            if (this.m($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gt()) {
               this.gK();
               return bkb.a(this.dM().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(bxy $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof bzy) && !($$0 instanceof bzz) ? false : this.gM() && ((bzx)$$0).gM();
      }
   }

   @Nullable
   @Override
   public blq a(and $$0, blq $$1) {
      if ($$1 instanceof bzy) {
         cac $$2 = blz.aq.a((ctp)$$0);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         bzz $$3 = (bzz)$$1;
         bzz $$4 = blz.Z.a((ctp)$$0);
         if ($$4 != null) {
            int $$5 = this.ag.a(9);
            cag $$6;
            if ($$5 < 4) {
               $$6 = this.w();
            } else if ($$5 < 8) {
               $$6 = $$3.w();
            } else {
               $$6 = ac.a(cag.values(), this.ag);
            }

            int $$9 = this.ag.a(5);
            cab $$10;
            if ($$9 < 2) {
               $$10 = this.ge();
            } else if ($$9 < 4) {
               $$10 = $$3.ge();
            } else {
               $$10 = ac.a(cab.values(), this.ag);
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
   public boolean l(cmy $$0) {
      return $$0.d() instanceof cmo;
   }

   @Nullable
   @Override
   public bne a(cue $$0, bjz $$1, bmp $$2, @Nullable bne $$3, @Nullable sn $$4) {
      auv $$5 = $$0.F_();
      cag $$6;
      if ($$3 instanceof bzz.a) {
         $$6 = ((bzz.a)$$3).a;
      } else {
         $$6 = ac.a(cag.values(), $$5);
         $$3 = new bzz.a($$6);
      }

      this.a($$6, ac.a(cab.values(), $$5));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static class a extends blq.a {
      public final cag a;

      public a(cag $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
