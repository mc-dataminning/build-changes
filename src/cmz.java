import com.google.common.base.MoreObjects;
import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cmz extends bsd implements btx {
   @Nullable
   private UUID b;
   @Nullable
   private bsd c;
   private boolean d;
   private boolean e;
   @Nullable
   private bsd f;

   cmz(bsj<? extends cmz> $$0, dcd $$1) {
      super($$0, $$1);
   }

   public void c(@Nullable bsd $$0) {
      if ($$0 != null) {
         this.b = $$0.cz();
         this.c = $$0;
      }
   }

   @Nullable
   @Override
   public bsd s() {
      if (this.c != null && !this.c.dK()) {
         return this.c;
      } else if (this.b != null && this.dP() instanceof aqk $$0) {
         this.c = $$0.a(this.b);
         return this.c;
      } else {
         return null;
      }
   }

   public bsd I() {
      return (bsd)MoreObjects.firstNonNull(this.s(), this);
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

   protected boolean e(bsd $$0) {
      return $$0.cz().equals(this.b);
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
   public void w(bsd $$0) {
      super.w($$0);
      if ($$0 instanceof cmz $$1) {
         this.c = $$1.c;
      }
   }

   @Override
   public void l() {
      if (!this.e) {
         this.a(dxa.K, this.s());
         this.e = true;
      }

      if (!this.d) {
         this.d = this.u();
      }

      super.l();
   }

   private boolean u() {
      bsd $$0 = this.s();
      if ($$0 != null) {
         for (bsd $$1 : this.dP().a(this, this.cK().b(this.ds()).g(1.0), $$0x -> !$$0x.N_() && $$0x.bz())) {
            if ($$1.cZ() == $$0.cZ()) {
               return false;
            }
         }
      }

      return true;
   }

   public evz d(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return new evz($$0, $$1, $$2)
         .d()
         .b(this.ah.a(0.0, 0.0172275 * (double)$$4), this.ah.a(0.0, 0.0172275 * (double)$$4), this.ah.a(0.0, 0.0172275 * (double)$$4))
         .a((double)$$3);
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      evz $$5 = this.d($$0, $$1, $$2, $$3, $$4);
      this.h($$5);
      double $$6 = $$5.h();
      this.s((float)(aye.d($$5.c, $$5.e) * 180.0F / (float)Math.PI));
      this.t((float)(aye.d($$5.d, $$6) * 180.0F / (float)Math.PI));
      this.O = this.dF();
      this.P = this.dH();
   }

   public void a(bsd $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -aye.a($$2 * (float) (Math.PI / 180.0)) * aye.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -aye.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = aye.b($$2 * (float) (Math.PI / 180.0)) * aye.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      evz $$9 = $$0.ds();
      this.h(this.ds().b($$9.c, $$0.aE() ? 0.0 : $$9.d, $$9.e));
   }

   protected cna b(evx $$0) {
      if ($$0.c() == evx.a.c) {
         evw $$1 = (evw)$$0;
         bsd $$2 = $$1.a();
         cna $$3 = $$2.a(this);
         if ($$3 != cna.a) {
            if ($$2 != this.f) {
               this.f = $$2;
               this.a($$3, $$2, this.s(), false);
            }

            return $$3;
         }
      }

      this.a($$0);
      return cna.a;
   }

   public void a(cna $$0, @Nullable bsd $$1, @Nullable bsd $$2, boolean $$3) {
      if (!this.dP().B) {
         $$0.deflect(this, $$1, this.ah);
         this.c($$2);
         this.b($$1, $$3);
      }
   }

   protected void b(@Nullable bsd $$0, boolean $$1) {
   }

   protected void a(evx $$0) {
      evx.a $$1 = $$0.c();
      if ($$1 == evx.a.c) {
         evw $$2 = (evw)$$0;
         bsd $$3 = $$2.a();
         if ($$3.ak().a(avy.H) && $$3 instanceof cmz $$4) {
            $$4.a(cna.c, this.s(), this.s(), true);
         }

         this.a($$2);
         this.dP().a(dxa.J, $$0.e(), dxa.a.a(this, null));
      } else if ($$1 == evx.a.b) {
         evv $$5 = (evv)$$0;
         this.a($$5);
         ja $$6 = $$5.a();
         this.dP().a(dxa.J, $$6, dxa.a.a(this, this.dP().a_($$6)));
      }
   }

   protected void a(evw $$0) {
   }

   protected void a(evv $$0) {
      dsh $$1 = this.dP().a_($$0.a());
      $$1.a(this.dP(), $$1, $$0, this);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      if (this.P == 0.0F && this.O == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.t((float)(aye.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.s((float)(aye.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.P = this.dH();
         this.O = this.dF();
         this.b(this.du(), this.dw(), this.dA(), this.dF(), this.dH());
      }
   }

   protected boolean b(bsd $$0) {
      if (!$$0.by()) {
         return false;
      } else {
         bsd $$1 = this.s();
         return $$1 == null || this.d || !$$1.y($$0);
      }
   }

   protected void J() {
      evz $$0 = this.ds();
      double $$1 = $$0.h();
      this.t(d(this.P, (float)(aye.d($$0.d, $$1) * 180.0F / (float)Math.PI)));
      this.s(d(this.O, (float)(aye.d($$0.c, $$0.e) * 180.0F / (float)Math.PI)));
   }

   protected static float d(float $$0, float $$1) {
      while ($$1 - $$0 < -180.0F) {
         $$0 -= 360.0F;
      }

      while ($$1 - $$0 >= 180.0F) {
         $$0 += 360.0F;
      }

      return aye.i(0.2F, $$0, $$1);
   }

   @Override
   public zb<abn> dl() {
      bsd $$0 = this.s();
      return new abo(this, $$0 == null ? 0 : $$0.al());
   }

   @Override
   public void a(abo $$0) {
      super.a($$0);
      bsd $$1 = this.dP().a($$0.p());
      if ($$1 != null) {
         this.c($$1);
      }
   }

   @Override
   public boolean a(dcd $$0, ja $$1) {
      bsd $$2 = this.s();
      return $$2 instanceof cmh ? $$2.a($$0, $$1) : $$2 == null || $$0.ab().b(dbz.c);
   }

   public boolean b(dcd $$0) {
      return this.ak().a(avy.g) && $$0.ab().b(dbz.g);
   }

   @Override
   public boolean bz() {
      return this.ak().a(avy.H);
   }

   @Override
   public float bK() {
      return this.bz() ? 1.0F : 0.0F;
   }

   public DoubleDoubleImmutablePair a_(bsy $$0, bqw $$1) {
      double $$2 = this.ds().c;
      double $$3 = this.ds().e;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
