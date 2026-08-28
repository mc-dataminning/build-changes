import com.google.common.base.MoreObjects;
import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public abstract class cpk extends bui implements bwd {
   @Nullable
   private UUID b;
   @Nullable
   private bui c;
   private boolean d;
   private boolean e;
   @Nullable
   private bui f;

   cpk(bup<? extends cpk> $$0, dff $$1) {
      super($$0, $$1);
   }

   public void c(@Nullable bui $$0) {
      if ($$0 != null) {
         this.b = $$0.cI();
         this.c = $$0;
      }
   }

   @Nullable
   @Override
   public bui s() {
      if (this.c != null && !this.c.dT()) {
         return this.c;
      } else if (this.b != null) {
         this.c = this.b(this.b);
         return this.c;
      } else {
         return null;
      }
   }

   @Nullable
   protected bui b(UUID $$0) {
      return this.dY() instanceof arq $$1 ? $$1.a($$0) : null;
   }

   public bui E() {
      return (bui)MoreObjects.firstNonNull(this.s(), this);
   }

   @Override
   protected void b(un $$0) {
      if (this.b != null) {
         $$0.a("Owner", this.b);
      }

      if (this.d) {
         $$0.a("LeftOwner", true);
      }

      $$0.a("HasBeenShot", this.e);
   }

   protected boolean e(bui $$0) {
      return $$0.cI().equals(this.b);
   }

   @Override
   protected void a(un $$0) {
      if ($$0.b("Owner")) {
         this.c($$0.a("Owner"));
      }

      this.d = $$0.q("LeftOwner");
      this.e = $$0.q("HasBeenShot");
   }

   protected void c(UUID $$0) {
      if (this.b != $$0) {
         this.b = $$0;
         this.c = this.b($$0);
      }
   }

   @Override
   public void x(bui $$0) {
      super.x($$0);
      if ($$0 instanceof cpk $$1) {
         this.b = $$1.b;
         this.c = $$1.c;
      }
   }

   @Override
   public void l() {
      if (!this.e) {
         this.a(eak.K, this.s());
         this.e = true;
      }

      if (!this.d) {
         this.d = this.o();
      }

      super.l();
   }

   private boolean o() {
      bui $$0 = this.s();
      if ($$0 != null) {
         ezm $$1 = this.cT().b(this.dB()).g(1.0);
         return $$0.di().dd().filter(bun.h).noneMatch($$1x -> $$1.c($$1x.cT()));
      } else {
         return true;
      }
   }

   public ezr d(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return new ezr($$0, $$1, $$2)
         .d()
         .b(this.af.a(0.0, 0.0172275 * (double)$$4), this.af.a(0.0, 0.0172275 * (double)$$4), this.af.a(0.0, 0.0172275 * (double)$$4))
         .c((double)$$3);
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      ezr $$5 = this.d($$0, $$1, $$2, $$3, $$4);
      this.h($$5);
      this.as = true;
      double $$6 = $$5.i();
      this.v((float)(azn.d($$5.d, $$5.f) * 180.0F / (float)Math.PI));
      this.w((float)(azn.d($$5.e, $$6) * 180.0F / (float)Math.PI));
      this.O = this.dO();
      this.P = this.dQ();
   }

   public void a(bui $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -azn.a($$2 * (float) (Math.PI / 180.0)) * azn.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -azn.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = azn.b($$2 * (float) (Math.PI / 180.0)) * azn.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      ezr $$9 = $$0.ai();
      this.h(this.dB().b($$9.d, $$0.aL() ? 0.0 : $$9.e, $$9.f));
   }

   public static <T extends cpk> T a(cpk.a<T> $$0, arq $$1, cwf $$2, bve $$3, float $$4, float $$5, float $$6) {
      return a($$0.create($$1, $$3, $$2), $$1, $$2, $$4x -> $$4x.a($$3, $$3.dQ(), $$3.dO(), $$4, $$5, $$6));
   }

   public static <T extends cpk> T a(cpk.a<T> $$0, arq $$1, cwf $$2, bve $$3, double $$4, double $$5, double $$6, float $$7, float $$8) {
      return a($$0.create($$1, $$3, $$2), $$1, $$2, $$5x -> $$5x.c($$4, $$5, $$6, $$7, $$8));
   }

   public static <T extends cpk> T a(T $$0, arq $$1, cwf $$2, double $$3, double $$4, double $$5, float $$6, float $$7) {
      return a($$0, $$1, $$2, $$6x -> $$0.c($$3, $$4, $$5, $$6, $$7));
   }

   public static <T extends cpk> T a(T $$0, arq $$1, cwf $$2) {
      return a($$0, $$1, $$2, $$0x -> {
      });
   }

   public static <T extends cpk> T a(T $$0, arq $$1, cwf $$2, Consumer<T> $$3) {
      $$3.accept($$0);
      $$1.b($$0);
      $$0.a($$1, $$2);
      return $$0;
   }

   public void a(arq $$0, cwf $$1) {
      dby.a($$0, $$1, this, $$0x -> {
      });
      if (this instanceof coy $$2) {
         cwf $$3 = $$2.ec();
         if ($$3 != null && !$$3.f() && !$$1.h().equals($$3.h())) {
            dby.a($$0, $$3, this, $$2::b);
         }
      }
   }

   protected cpl b(ezp $$0) {
      if ($$0.d() == ezp.a.c) {
         ezo $$1 = (ezo)$$0;
         bui $$2 = $$1.a();
         cpl $$3 = $$2.a(this);
         if ($$3 != cpl.a) {
            if ($$2 != this.f && this.a($$3, $$2, this.s(), false)) {
               this.f = $$2;
            }

            return $$3;
         }
      } else if (this.C() && $$0 instanceof ezn $$4 && $$4.f()) {
         cpl $$5 = cpl.b;
         if (this.a($$5, null, this.s(), false)) {
            this.h(this.dB().c(0.2));
            return $$5;
         }
      }

      this.a($$0);
      return cpl.a;
   }

   protected boolean C() {
      return false;
   }

   public boolean a(cpl $$0, @Nullable bui $$1, @Nullable bui $$2, boolean $$3) {
      $$0.deflect(this, $$1, this.af);
      if (!this.dY().C) {
         this.c($$2);
         this.b($$1, $$3);
      }

      return true;
   }

   protected void b(@Nullable bui $$0, boolean $$1) {
   }

   protected void b(cwb $$0) {
   }

   protected void a(ezp $$0) {
      ezp.a $$1 = $$0.d();
      if ($$1 == ezp.a.c) {
         ezo $$2 = (ezo)$$0;
         bui $$3 = $$2.a();
         if ($$3.ar().a(axh.H) && $$3 instanceof cpk $$4) {
            $$4.a(cpl.c, this.s(), this.s(), true);
         }

         this.a($$2);
         this.dY().a(eak.J, $$0.g(), eak.a.a(this, null));
      } else if ($$1 == ezp.a.b) {
         ezn $$5 = (ezn)$$0;
         this.a($$5);
         jh $$6 = $$5.b();
         this.dY().a(eak.J, $$6, eak.a.a(this, this.dY().a_($$6)));
      }
   }

   protected void a(ezo $$0) {
   }

   protected void a(ezn $$0) {
      dvo $$1 = this.dY().a_($$0.b());
      $$1.a(this.dY(), $$1, $$0, this);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.n($$0, $$1, $$2);
      if (this.P == 0.0F && this.O == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.w((float)(azn.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.v((float)(azn.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.P = this.dQ();
         this.O = this.dO();
         this.b(this.dD(), this.dF(), this.dJ(), this.dO(), this.dQ());
      }
   }

   protected boolean b(bui $$0) {
      if (!$$0.bI()) {
         return false;
      } else {
         bui $$1 = this.s();
         return $$1 == null || this.d || !$$1.z($$0);
      }
   }

   protected void F() {
      ezr $$0 = this.dB();
      double $$1 = $$0.i();
      this.w(e(this.P, (float)(azn.d($$0.e, $$1) * 180.0F / (float)Math.PI)));
      this.v(e(this.O, (float)(azn.d($$0.d, $$0.f) * 180.0F / (float)Math.PI)));
   }

   protected static float e(float $$0, float $$1) {
      while ($$1 - $$0 < -180.0F) {
         $$0 -= 360.0F;
      }

      while ($$1 - $$0 >= 180.0F) {
         $$0 += 360.0F;
      }

      return azn.h(0.2F, $$0, $$1);
   }

   @Override
   public zs<ach> a(arp $$0) {
      bui $$1 = this.s();
      return new aci(this, $$0, $$1 == null ? 0 : $$1.as());
   }

   @Override
   public void a(aci $$0) {
      super.a($$0);
      bui $$1 = this.dY().a($$0.p());
      if ($$1 != null) {
         this.c($$1);
      }
   }

   @Override
   public boolean a(dff $$0, jh $$1) {
      bui $$2 = this.s();
      return $$2 instanceof cor ? $$2.a($$0, $$1) : $$2 == null || $$0.ac().b(dfb.c);
   }

   public boolean b(dff $$0) {
      return this.ar().a(axh.g) && $$0.ac().b(dfb.g);
   }

   @Override
   public boolean bJ() {
      return this.ar().a(axh.H);
   }

   @Override
   public float bU() {
      return this.bJ() ? 1.0F : 0.0F;
   }

   public DoubleDoubleImmutablePair a_(bve $$0, bsy $$1) {
      double $$2 = this.dB().d;
      double $$3 = this.dB().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }

   @Override
   public int bZ() {
      return 2;
   }

   @FunctionalInterface
   public interface a<T extends cpk> {
      T create(arq var1, bve var2, cwf var3);
   }
}
