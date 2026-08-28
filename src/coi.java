import com.google.common.base.MoreObjects;
import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public abstract class coi extends btj implements bvd {
   @Nullable
   private UUID b;
   @Nullable
   private btj c;
   private boolean d;
   private boolean e;
   @Nullable
   private btj f;

   coi(btq<? extends coi> $$0, dds $$1) {
      super($$0, $$1);
   }

   public void c(@Nullable btj $$0) {
      if ($$0 != null) {
         this.b = $$0.cD();
         this.c = $$0;
      }
   }

   @Nullable
   @Override
   public btj s() {
      if (this.c != null && !this.c.dN()) {
         return this.c;
      } else if (this.b != null) {
         this.c = this.b(this.b);
         return this.c;
      } else {
         return null;
      }
   }

   @Nullable
   protected btj b(UUID $$0) {
      return this.dS() instanceof arg $$1 ? $$1.a($$0) : null;
   }

   public btj E() {
      return (btj)MoreObjects.firstNonNull(this.s(), this);
   }

   @Override
   protected void b(uf $$0) {
      if (this.b != null) {
         $$0.a("Owner", this.b);
      }

      if (this.d) {
         $$0.a("LeftOwner", true);
      }

      $$0.a("HasBeenShot", this.e);
   }

   protected boolean e(btj $$0) {
      return $$0.cD().equals(this.b);
   }

   @Override
   protected void a(uf $$0) {
      if ($$0.b("Owner")) {
         this.b = $$0.a("Owner");
         this.c = null;
      }

      this.d = $$0.q("LeftOwner");
      this.e = $$0.q("HasBeenShot");
   }

   @Override
   public void x(btj $$0) {
      super.x($$0);
      if ($$0 instanceof coi $$1) {
         this.c = $$1.c;
      }
   }

   @Override
   public void l() {
      if (!this.e) {
         this.a(dyx.K, this.s());
         this.e = true;
      }

      if (!this.d) {
         this.d = this.o();
      }

      super.l();
   }

   private boolean o() {
      btj $$0 = this.s();
      if ($$0 != null) {
         exz $$1 = this.cO().b(this.dv()).g(1.0);
         return $$0.dd().cY().filter(bto.h).noneMatch($$1x -> $$1.c($$1x.cO()));
      } else {
         return true;
      }
   }

   public eye d(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return new eye($$0, $$1, $$2)
         .d()
         .b(this.af.a(0.0, 0.0172275 * (double)$$4), this.af.a(0.0, 0.0172275 * (double)$$4), this.af.a(0.0, 0.0172275 * (double)$$4))
         .c((double)$$3);
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      eye $$5 = this.d($$0, $$1, $$2, $$3, $$4);
      this.h($$5);
      this.as = true;
      double $$6 = $$5.i();
      this.v((float)(azc.d($$5.d, $$5.f) * 180.0F / (float)Math.PI));
      this.w((float)(azc.d($$5.e, $$6) * 180.0F / (float)Math.PI));
      this.O = this.dI();
      this.P = this.dK();
   }

   public void a(btj $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -azc.a($$2 * (float) (Math.PI / 180.0)) * azc.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -azc.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = azc.b($$2 * (float) (Math.PI / 180.0)) * azc.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      eye $$9 = $$0.ai();
      this.h(this.dv().b($$9.d, $$0.aH() ? 0.0 : $$9.e, $$9.f));
   }

   public static <T extends coi> T a(coi.a<T> $$0, arg $$1, cvl $$2, buf $$3, float $$4, float $$5, float $$6) {
      return a($$0.create($$1, $$3, $$2), $$1, $$2, $$4x -> $$4x.a($$3, $$3.dK(), $$3.dI(), $$4, $$5, $$6));
   }

   public static <T extends coi> T a(coi.a<T> $$0, arg $$1, cvl $$2, buf $$3, double $$4, double $$5, double $$6, float $$7, float $$8) {
      return a($$0.create($$1, $$3, $$2), $$1, $$2, $$5x -> $$5x.c($$4, $$5, $$6, $$7, $$8));
   }

   public static <T extends coi> T a(T $$0, arg $$1, cvl $$2, double $$3, double $$4, double $$5, float $$6, float $$7) {
      return a($$0, $$1, $$2, $$6x -> $$0.c($$3, $$4, $$5, $$6, $$7));
   }

   public static <T extends coi> T a(T $$0, arg $$1, cvl $$2) {
      return a($$0, $$1, $$2, $$0x -> {
      });
   }

   public static <T extends coi> T a(T $$0, arg $$1, cvl $$2, Consumer<T> $$3) {
      $$3.accept($$0);
      $$1.b($$0);
      $$0.a($$1, $$2);
      return $$0;
   }

   public void a(arg $$0, cvl $$1) {
      day.a($$0, $$1, this, $$0x -> {
      });
      if (this instanceof cnw $$2) {
         cvl $$3 = $$2.dW();
         if ($$3 != null && !$$3.f() && !$$1.h().equals($$3.h())) {
            day.a($$0, $$3, this, $$2::b);
         }
      }
   }

   protected coj b(eyc $$0) {
      if ($$0.c() == eyc.a.c) {
         eyb $$1 = (eyb)$$0;
         btj $$2 = $$1.a();
         coj $$3 = $$2.a(this);
         if ($$3 != coj.a) {
            if ($$2 != this.f && this.a($$3, $$2, this.s(), false)) {
               this.f = $$2;
            }

            return $$3;
         }
      }

      this.a($$0);
      return coj.a;
   }

   public boolean a(coj $$0, @Nullable btj $$1, @Nullable btj $$2, boolean $$3) {
      if (!this.dS().B) {
         $$0.deflect(this, $$1, this.af);
         this.c($$2);
         this.b($$1, $$3);
      }

      return true;
   }

   protected void b(@Nullable btj $$0, boolean $$1) {
   }

   protected void b(cvg $$0) {
   }

   protected void a(eyc $$0) {
      eyc.a $$1 = $$0.c();
      if ($$1 == eyc.a.c) {
         eyb $$2 = (eyb)$$0;
         btj $$3 = $$2.a();
         if ($$3.ao().a(aww.H) && $$3 instanceof coi $$4) {
            $$4.a(coj.c, this.s(), this.s(), true);
         }

         this.a($$2);
         this.dS().a(dyx.J, $$0.e(), dyx.a.a(this, null));
      } else if ($$1 == eyc.a.b) {
         eya $$5 = (eya)$$0;
         this.a($$5);
         je $$6 = $$5.a();
         this.dS().a(dyx.J, $$6, dyx.a.a(this, this.dS().a_($$6)));
      }
   }

   protected void a(eyb $$0) {
   }

   protected void a(eya $$0) {
      dua $$1 = this.dS().a_($$0.a());
      $$1.a(this.dS(), $$1, $$0, this);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.n($$0, $$1, $$2);
      if (this.P == 0.0F && this.O == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.w((float)(azc.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.v((float)(azc.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.P = this.dK();
         this.O = this.dI();
         this.b(this.dx(), this.dz(), this.dD(), this.dI(), this.dK());
      }
   }

   protected boolean b(btj $$0) {
      if (!$$0.bD()) {
         return false;
      } else {
         btj $$1 = this.s();
         return $$1 == null || this.d || !$$1.z($$0);
      }
   }

   protected void F() {
      eye $$0 = this.dv();
      double $$1 = $$0.i();
      this.w(e(this.P, (float)(azc.d($$0.e, $$1) * 180.0F / (float)Math.PI)));
      this.v(e(this.O, (float)(azc.d($$0.d, $$0.f) * 180.0F / (float)Math.PI)));
   }

   protected static float e(float $$0, float $$1) {
      while ($$1 - $$0 < -180.0F) {
         $$0 -= 360.0F;
      }

      while ($$1 - $$0 >= 180.0F) {
         $$0 += 360.0F;
      }

      return azc.h(0.2F, $$0, $$1);
   }

   @Override
   public zk<abz> a(arf $$0) {
      btj $$1 = this.s();
      return new aca(this, $$0, $$1 == null ? 0 : $$1.ap());
   }

   @Override
   public void a(aca $$0) {
      super.a($$0);
      btj $$1 = this.dS().a($$0.p());
      if ($$1 != null) {
         this.c($$1);
      }
   }

   @Override
   public boolean a(dds $$0, je $$1) {
      btj $$2 = this.s();
      return $$2 instanceof cnp ? $$2.a($$0, $$1) : $$2 == null || $$0.ac().b(ddo.c);
   }

   public boolean b(dds $$0) {
      return this.ao().a(aww.g) && $$0.ac().b(ddo.g);
   }

   @Override
   public boolean bE() {
      return this.ao().a(aww.H);
   }

   @Override
   public float bP() {
      return this.bE() ? 1.0F : 0.0F;
   }

   public DoubleDoubleImmutablePair a_(buf $$0, bsb $$1) {
      double $$2 = this.dv().d;
      double $$3 = this.dv().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }

   @Override
   public int bU() {
      return 2;
   }

   @FunctionalInterface
   public interface a<T extends coi> {
      T create(arg var1, buf var2, cvl var3);
   }
}
