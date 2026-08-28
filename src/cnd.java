import com.google.common.base.MoreObjects;
import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cnd extends bsh implements bub {
   @Nullable
   private UUID b;
   @Nullable
   private bsh c;
   private boolean d;
   private boolean e;
   @Nullable
   private bsh f;

   cnd(bsn<? extends cnd> $$0, dcg $$1) {
      super($$0, $$1);
   }

   public void c(@Nullable bsh $$0) {
      if ($$0 != null) {
         this.b = $$0.cB();
         this.c = $$0;
      }
   }

   @Nullable
   @Override
   public bsh s() {
      if (this.c != null && !this.c.dM()) {
         return this.c;
      } else if (this.b != null && this.dR() instanceof aqm $$0) {
         this.c = $$0.a(this.b);
         return this.c;
      } else {
         return null;
      }
   }

   public bsh I() {
      return (bsh)MoreObjects.firstNonNull(this.s(), this);
   }

   @Override
   protected void b(tx $$0) {
      if (this.b != null) {
         $$0.a("Owner", this.b);
      }

      if (this.d) {
         $$0.a("LeftOwner", true);
      }

      $$0.a("HasBeenShot", this.e);
   }

   protected boolean e(bsh $$0) {
      return $$0.cB().equals(this.b);
   }

   @Override
   protected void a(tx $$0) {
      if ($$0.b("Owner")) {
         this.b = $$0.a("Owner");
         this.c = null;
      }

      this.d = $$0.q("LeftOwner");
      this.e = $$0.q("HasBeenShot");
   }

   @Override
   public void w(bsh $$0) {
      super.w($$0);
      if ($$0 instanceof cnd $$1) {
         this.c = $$1.c;
      }
   }

   @Override
   public void l() {
      if (!this.e) {
         this.a(dxh.K, this.s());
         this.e = true;
      }

      if (!this.d) {
         this.d = this.t();
      }

      super.l();
   }

   private boolean t() {
      bsh $$0 = this.s();
      if ($$0 != null) {
         for (bsh $$1 : this.dR().a(this, this.cM().b(this.du()).g(1.0), $$0x -> !$$0x.N_() && $$0x.bB())) {
            if ($$1.db() == $$0.db()) {
               return false;
            }
         }
      }

      return true;
   }

   public ewh d(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return new ewh($$0, $$1, $$2)
         .d()
         .b(this.ah.a(0.0, 0.0172275 * (double)$$4), this.ah.a(0.0, 0.0172275 * (double)$$4), this.ah.a(0.0, 0.0172275 * (double)$$4))
         .a((double)$$3);
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      ewh $$5 = this.d($$0, $$1, $$2, $$3, $$4);
      this.j($$5);
      this.av = true;
      double $$6 = $$5.h();
      this.s((float)(ayg.d($$5.c, $$5.e) * 180.0F / (float)Math.PI));
      this.t((float)(ayg.d($$5.d, $$6) * 180.0F / (float)Math.PI));
      this.O = this.dH();
      this.P = this.dJ();
   }

   public void a(bsh $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -ayg.a($$2 * (float) (Math.PI / 180.0)) * ayg.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -ayg.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = ayg.b($$2 * (float) (Math.PI / 180.0)) * ayg.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      ewh $$9 = $$0.ag();
      this.j(this.du().b($$9.c, $$0.aG() ? 0.0 : $$9.d, $$9.e));
   }

   protected cne b(ewf $$0) {
      if ($$0.c() == ewf.a.c) {
         ewe $$1 = (ewe)$$0;
         bsh $$2 = $$1.a();
         cne $$3 = $$2.a(this);
         if ($$3 != cne.a) {
            if ($$2 != this.f) {
               this.f = $$2;
               this.a($$3, $$2, this.s(), false);
            }

            return $$3;
         }
      }

      this.a($$0);
      return cne.a;
   }

   public void a(cne $$0, @Nullable bsh $$1, @Nullable bsh $$2, boolean $$3) {
      if (!this.dR().B) {
         $$0.deflect(this, $$1, this.ah);
         this.c($$2);
         this.b($$1, $$3);
      }
   }

   protected void b(@Nullable bsh $$0, boolean $$1) {
   }

   protected void a(ewf $$0) {
      ewf.a $$1 = $$0.c();
      if ($$1 == ewf.a.c) {
         ewe $$2 = (ewe)$$0;
         bsh $$3 = $$2.a();
         if ($$3.am().a(awa.H) && $$3 instanceof cnd $$4) {
            $$4.a(cne.c, this.s(), this.s(), true);
         }

         this.a($$2);
         this.dR().a(dxh.J, $$0.e(), dxh.a.a(this, null));
      } else if ($$1 == ewf.a.b) {
         ewd $$5 = (ewd)$$0;
         this.a($$5);
         ja $$6 = $$5.a();
         this.dR().a(dxh.J, $$6, dxh.a.a(this, this.dR().a_($$6)));
      }
   }

   protected void a(ewe $$0) {
   }

   protected void a(ewd $$0) {
      dsl $$1 = this.dR().a_($$0.a());
      $$1.a(this.dR(), $$1, $$0, this);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      if (this.P == 0.0F && this.O == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.t((float)(ayg.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.s((float)(ayg.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.P = this.dJ();
         this.O = this.dH();
         this.b(this.dw(), this.dy(), this.dC(), this.dH(), this.dJ());
      }
   }

   protected boolean b(bsh $$0) {
      if (!$$0.bA()) {
         return false;
      } else {
         bsh $$1 = this.s();
         return $$1 == null || this.d || !$$1.y($$0);
      }
   }

   protected void J() {
      ewh $$0 = this.du();
      double $$1 = $$0.h();
      this.t(e(this.P, (float)(ayg.d($$0.d, $$1) * 180.0F / (float)Math.PI)));
      this.s(e(this.O, (float)(ayg.d($$0.c, $$0.e) * 180.0F / (float)Math.PI)));
   }

   protected static float e(float $$0, float $$1) {
      while ($$1 - $$0 < -180.0F) {
         $$0 -= 360.0F;
      }

      while ($$1 - $$0 >= 180.0F) {
         $$0 += 360.0F;
      }

      return ayg.i(0.2F, $$0, $$1);
   }

   @Override
   public zb<abn> dn() {
      bsh $$0 = this.s();
      return new abo(this, $$0 == null ? 0 : $$0.an());
   }

   @Override
   public void a(abo $$0) {
      super.a($$0);
      bsh $$1 = this.dR().a($$0.p());
      if ($$1 != null) {
         this.c($$1);
      }
   }

   @Override
   public boolean a(dcg $$0, ja $$1) {
      bsh $$2 = this.s();
      return $$2 instanceof cml ? $$2.a($$0, $$1) : $$2 == null || $$0.ab().b(dcc.c);
   }

   public boolean b(dcg $$0) {
      return this.am().a(awa.g) && $$0.ab().b(dcc.g);
   }

   @Override
   public boolean bB() {
      return this.am().a(awa.H);
   }

   @Override
   public float bM() {
      return this.bB() ? 1.0F : 0.0F;
   }

   public DoubleDoubleImmutablePair a_(btc $$0, bra $$1) {
      double $$2 = this.du().c;
      double $$3 = this.du().e;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
