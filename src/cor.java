import com.google.common.base.MoreObjects;
import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public abstract class cor extends btr implements bvl {
   @Nullable
   private UUID b;
   @Nullable
   private btr c;
   private boolean d;
   private boolean e;
   @Nullable
   private btr f;

   cor(bty<? extends cor> $$0, dej $$1) {
      super($$0, $$1);
   }

   public void c(@Nullable btr $$0) {
      if ($$0 != null) {
         this.b = $$0.cD();
         this.c = $$0;
      }
   }

   @Nullable
   @Override
   public btr s() {
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
   protected btr b(UUID $$0) {
      return this.dS() instanceof arj $$1 ? $$1.a($$0) : null;
   }

   public btr F() {
      return (btr)MoreObjects.firstNonNull(this.s(), this);
   }

   @Override
   protected void b(ug $$0) {
      if (this.b != null) {
         $$0.a("Owner", this.b);
      }

      if (this.d) {
         $$0.a("LeftOwner", true);
      }

      $$0.a("HasBeenShot", this.e);
   }

   protected boolean e(btr $$0) {
      return $$0.cD().equals(this.b);
   }

   @Override
   protected void a(ug $$0) {
      if ($$0.b("Owner")) {
         this.b = $$0.a("Owner");
         this.c = null;
      }

      this.d = $$0.q("LeftOwner");
      this.e = $$0.q("HasBeenShot");
   }

   @Override
   public void x(btr $$0) {
      super.x($$0);
      if ($$0 instanceof cor $$1) {
         this.c = $$1.c;
      }
   }

   @Override
   public void l() {
      if (!this.e) {
         this.a(dzp.K, this.s());
         this.e = true;
      }

      if (!this.d) {
         this.d = this.o();
      }

      super.l();
   }

   private boolean o() {
      btr $$0 = this.s();
      if ($$0 != null) {
         eyr $$1 = this.cO().b(this.dv()).g(1.0);
         return $$0.dd().cY().filter(btw.h).noneMatch($$1x -> $$1.c($$1x.cO()));
      } else {
         return true;
      }
   }

   public eyw d(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return new eyw($$0, $$1, $$2)
         .d()
         .b(this.af.a(0.0, 0.0172275 * (double)$$4), this.af.a(0.0, 0.0172275 * (double)$$4), this.af.a(0.0, 0.0172275 * (double)$$4))
         .c((double)$$3);
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      eyw $$5 = this.d($$0, $$1, $$2, $$3, $$4);
      this.h($$5);
      this.as = true;
      double $$6 = $$5.i();
      this.v((float)(azf.d($$5.d, $$5.f) * 180.0F / (float)Math.PI));
      this.w((float)(azf.d($$5.e, $$6) * 180.0F / (float)Math.PI));
      this.O = this.dI();
      this.P = this.dK();
   }

   public void a(btr $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -azf.a($$2 * (float) (Math.PI / 180.0)) * azf.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -azf.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = azf.b($$2 * (float) (Math.PI / 180.0)) * azf.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      eyw $$9 = $$0.ai();
      this.h(this.dv().b($$9.d, $$0.aH() ? 0.0 : $$9.e, $$9.f));
   }

   public static <T extends cor> T a(cor.a<T> $$0, arj $$1, cvs $$2, bun $$3, float $$4, float $$5, float $$6) {
      return a($$0.create($$1, $$3, $$2), $$1, $$2, $$4x -> $$4x.a($$3, $$3.dK(), $$3.dI(), $$4, $$5, $$6));
   }

   public static <T extends cor> T a(cor.a<T> $$0, arj $$1, cvs $$2, bun $$3, double $$4, double $$5, double $$6, float $$7, float $$8) {
      return a($$0.create($$1, $$3, $$2), $$1, $$2, $$5x -> $$5x.c($$4, $$5, $$6, $$7, $$8));
   }

   public static <T extends cor> T a(T $$0, arj $$1, cvs $$2, double $$3, double $$4, double $$5, float $$6, float $$7) {
      return a($$0, $$1, $$2, $$6x -> $$0.c($$3, $$4, $$5, $$6, $$7));
   }

   public static <T extends cor> T a(T $$0, arj $$1, cvs $$2) {
      return a($$0, $$1, $$2, $$0x -> {
      });
   }

   public static <T extends cor> T a(T $$0, arj $$1, cvs $$2, Consumer<T> $$3) {
      $$3.accept($$0);
      $$1.b($$0);
      $$0.a($$1, $$2);
      return $$0;
   }

   public void a(arj $$0, cvs $$1) {
      dbp.a($$0, $$1, this, $$0x -> {
      });
      if (this instanceof coe $$2) {
         cvs $$3 = $$2.dW();
         if ($$3 != null && !$$3.f() && !$$1.h().equals($$3.h())) {
            dbp.a($$0, $$3, this, $$2::b);
         }
      }
   }

   protected cos b(eyu $$0) {
      if ($$0.d() == eyu.a.c) {
         eyt $$1 = (eyt)$$0;
         btr $$2 = $$1.a();
         cos $$3 = $$2.a(this);
         if ($$3 != cos.a) {
            if ($$2 != this.f && this.a($$3, $$2, this.s(), false)) {
               this.f = $$2;
            }

            return $$3;
         }
      } else if (this.D() && $$0 instanceof eys $$4 && $$4.f()) {
         cos $$5 = cos.b;
         if (this.a($$5, null, this.s(), false)) {
            this.h(this.dv().c(0.2));
            return $$5;
         }
      }

      this.a($$0);
      return cos.a;
   }

   protected boolean D() {
      return false;
   }

   public boolean a(cos $$0, @Nullable btr $$1, @Nullable btr $$2, boolean $$3) {
      if (!this.dS().B) {
         $$0.deflect(this, $$1, this.af);
         this.c($$2);
         this.b($$1, $$3);
      }

      return true;
   }

   protected void b(@Nullable btr $$0, boolean $$1) {
   }

   protected void b(cvn $$0) {
   }

   protected void a(eyu $$0) {
      eyu.a $$1 = $$0.d();
      if ($$1 == eyu.a.c) {
         eyt $$2 = (eyt)$$0;
         btr $$3 = $$2.a();
         if ($$3.ao().a(awz.H) && $$3 instanceof cor $$4) {
            $$4.a(cos.c, this.s(), this.s(), true);
         }

         this.a($$2);
         this.dS().a(dzp.J, $$0.g(), dzp.a.a(this, null));
      } else if ($$1 == eyu.a.b) {
         eys $$5 = (eys)$$0;
         this.a($$5);
         jf $$6 = $$5.b();
         this.dS().a(dzp.J, $$6, dzp.a.a(this, this.dS().a_($$6)));
      }
   }

   protected void a(eyt $$0) {
   }

   protected void a(eys $$0) {
      dus $$1 = this.dS().a_($$0.b());
      $$1.a(this.dS(), $$1, $$0, this);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.n($$0, $$1, $$2);
      if (this.P == 0.0F && this.O == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.w((float)(azf.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.v((float)(azf.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.P = this.dK();
         this.O = this.dI();
         this.b(this.dx(), this.dz(), this.dD(), this.dI(), this.dK());
      }
   }

   protected boolean b(btr $$0) {
      if (!$$0.bD()) {
         return false;
      } else {
         btr $$1 = this.s();
         return $$1 == null || this.d || !$$1.z($$0);
      }
   }

   protected void G() {
      eyw $$0 = this.dv();
      double $$1 = $$0.i();
      this.w(e(this.P, (float)(azf.d($$0.e, $$1) * 180.0F / (float)Math.PI)));
      this.v(e(this.O, (float)(azf.d($$0.d, $$0.f) * 180.0F / (float)Math.PI)));
   }

   protected static float e(float $$0, float $$1) {
      while ($$1 - $$0 < -180.0F) {
         $$0 -= 360.0F;
      }

      while ($$1 - $$0 >= 180.0F) {
         $$0 += 360.0F;
      }

      return azf.h(0.2F, $$0, $$1);
   }

   @Override
   public zl<aca> a(ari $$0) {
      btr $$1 = this.s();
      return new acb(this, $$0, $$1 == null ? 0 : $$1.ap());
   }

   @Override
   public void a(acb $$0) {
      super.a($$0);
      btr $$1 = this.dS().a($$0.p());
      if ($$1 != null) {
         this.c($$1);
      }
   }

   @Override
   public boolean a(dej $$0, jf $$1) {
      btr $$2 = this.s();
      return $$2 instanceof cnx ? $$2.a($$0, $$1) : $$2 == null || $$0.ac().b(def.c);
   }

   public boolean b(dej $$0) {
      return this.ao().a(awz.g) && $$0.ac().b(def.g);
   }

   @Override
   public boolean bE() {
      return this.ao().a(awz.H);
   }

   @Override
   public float bP() {
      return this.bE() ? 1.0F : 0.0F;
   }

   public DoubleDoubleImmutablePair a_(bun $$0, bsj $$1) {
      double $$2 = this.dv().d;
      double $$3 = this.dv().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }

   @Override
   public int bU() {
      return 2;
   }

   @FunctionalInterface
   public interface a<T extends cor> {
      T create(arj var1, bun var2, cvs var3);
   }
}
