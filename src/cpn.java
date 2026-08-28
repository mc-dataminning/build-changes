import com.google.common.base.MoreObjects;
import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public abstract class cpn extends bul implements bwg {
   @Nullable
   private UUID a;
   @Nullable
   private bul b;
   private boolean c;
   private boolean d;
   @Nullable
   private bul e;

   cpn(bus<? extends cpn> $$0, dfm $$1) {
      super($$0, $$1);
   }

   public void c(@Nullable bul $$0) {
      if ($$0 != null) {
         this.a = $$0.cG();
         this.b = $$0;
      }
   }

   @Nullable
   @Override
   public bul p() {
      if (this.b != null && !this.b.dQ()) {
         return this.b;
      } else if (this.a != null) {
         this.b = this.b(this.a);
         return this.b;
      } else {
         return null;
      }
   }

   @Nullable
   protected bul b(UUID $$0) {
      return this.dV() instanceof arp $$1 ? $$1.a($$0) : null;
   }

   public bul B() {
      return (bul)MoreObjects.firstNonNull(this.p(), this);
   }

   @Override
   protected void b(ul $$0) {
      if (this.a != null) {
         $$0.a("Owner", this.a);
      }

      if (this.c) {
         $$0.a("LeftOwner", true);
      }

      $$0.a("HasBeenShot", this.d);
   }

   protected boolean e(bul $$0) {
      return $$0.cG().equals(this.a);
   }

   @Override
   protected void a(ul $$0) {
      if ($$0.b("Owner")) {
         this.c($$0.a("Owner"));
      }

      this.c = $$0.q("LeftOwner");
      this.d = $$0.q("HasBeenShot");
   }

   protected void c(UUID $$0) {
      if (this.a != $$0) {
         this.a = $$0;
         this.b = this.b($$0);
      }
   }

   @Override
   public void x(bul $$0) {
      super.x($$0);
      if ($$0 instanceof cpn $$1) {
         this.a = $$1.a;
         this.b = $$1.b;
      }
   }

   @Override
   public void h() {
      if (!this.d) {
         this.a(ear.K, this.p());
         this.d = true;
      }

      if (!this.c) {
         this.c = this.l();
      }

      super.h();
   }

   private boolean l() {
      bul $$0 = this.p();
      if ($$0 != null) {
         ezt $$1 = this.cR().b(this.dy()).g(1.0);
         return $$0.dg().db().filter(buq.h).noneMatch($$1x -> $$1.c($$1x.cR()));
      } else {
         return true;
      }
   }

   public ezy d(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return new ezy($$0, $$1, $$2)
         .d()
         .b(this.ae.a(0.0, 0.0172275 * (double)$$4), this.ae.a(0.0, 0.0172275 * (double)$$4), this.ae.a(0.0, 0.0172275 * (double)$$4))
         .c((double)$$3);
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      ezy $$5 = this.d($$0, $$1, $$2, $$3, $$4);
      this.h($$5);
      this.ar = true;
      double $$6 = $$5.i();
      this.v((float)(azm.d($$5.d, $$5.f) * 180.0F / (float)Math.PI));
      this.w((float)(azm.d($$5.e, $$6) * 180.0F / (float)Math.PI));
      this.N = this.dL();
      this.O = this.dN();
   }

   public void a(bul $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -azm.a($$2 * (float) (Math.PI / 180.0)) * azm.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -azm.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = azm.b($$2 * (float) (Math.PI / 180.0)) * azm.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      ezy $$9 = $$0.ah();
      this.h(this.dy().b($$9.d, $$0.aJ() ? 0.0 : $$9.e, $$9.f));
   }

   public static <T extends cpn> T a(cpn.a<T> $$0, arp $$1, cwm $$2, bvh $$3, float $$4, float $$5, float $$6) {
      return a($$0.create($$1, $$3, $$2), $$1, $$2, $$4x -> $$4x.a($$3, $$3.dN(), $$3.dL(), $$4, $$5, $$6));
   }

   public static <T extends cpn> T a(cpn.a<T> $$0, arp $$1, cwm $$2, bvh $$3, double $$4, double $$5, double $$6, float $$7, float $$8) {
      return a($$0.create($$1, $$3, $$2), $$1, $$2, $$5x -> $$5x.c($$4, $$5, $$6, $$7, $$8));
   }

   public static <T extends cpn> T a(T $$0, arp $$1, cwm $$2, double $$3, double $$4, double $$5, float $$6, float $$7) {
      return a($$0, $$1, $$2, $$6x -> $$0.c($$3, $$4, $$5, $$6, $$7));
   }

   public static <T extends cpn> T a(T $$0, arp $$1, cwm $$2) {
      return a($$0, $$1, $$2, $$0x -> {
      });
   }

   public static <T extends cpn> T a(T $$0, arp $$1, cwm $$2, Consumer<T> $$3) {
      $$3.accept($$0);
      $$1.b($$0);
      $$0.b($$1, $$2);
      return $$0;
   }

   public void b(arp $$0, cwm $$1) {
      dcf.a($$0, $$1, this, $$0x -> {
      });
      if (this instanceof cpb $$2) {
         cwm $$3 = $$2.dZ();
         if ($$3 != null && !$$3.f() && !$$1.h().equals($$3.h())) {
            dcf.a($$0, $$3, this, $$2::b);
         }
      }
   }

   protected cpo b(ezw $$0) {
      if ($$0.d() == ezw.a.c) {
         ezv $$1 = (ezv)$$0;
         bul $$2 = $$1.a();
         cpo $$3 = $$2.a(this);
         if ($$3 != cpo.a) {
            if ($$2 != this.e && this.a($$3, $$2, this.p(), false)) {
               this.e = $$2;
            }

            return $$3;
         }
      } else if (this.z() && $$0 instanceof ezu $$4 && $$4.f()) {
         cpo $$5 = cpo.b;
         if (this.a($$5, null, this.p(), false)) {
            this.h(this.dy().c(0.2));
            return $$5;
         }
      }

      this.a($$0);
      return cpo.a;
   }

   protected boolean z() {
      return false;
   }

   public boolean a(cpo $$0, @Nullable bul $$1, @Nullable bul $$2, boolean $$3) {
      $$0.deflect(this, $$1, this.ae);
      if (!this.dV().C) {
         this.c($$2);
         this.b($$1, $$3);
      }

      return true;
   }

   protected void b(@Nullable bul $$0, boolean $$1) {
   }

   protected void b(cwi $$0) {
   }

   protected void a(ezw $$0) {
      ezw.a $$1 = $$0.d();
      if ($$1 == ezw.a.c) {
         ezv $$2 = (ezv)$$0;
         bul $$3 = $$2.a();
         if ($$3.aq().a(axg.H) && $$3 instanceof cpn $$4) {
            $$4.a(cpo.c, this.p(), this.p(), true);
         }

         this.a($$2);
         this.dV().a(ear.J, $$0.g(), ear.a.a(this, null));
      } else if ($$1 == ezw.a.b) {
         ezu $$5 = (ezu)$$0;
         this.a($$5);
         jh $$6 = $$5.b();
         this.dV().a(ear.J, $$6, ear.a.a(this, this.dV().a_($$6)));
      }
   }

   protected void a(ezv $$0) {
   }

   protected void a(ezu $$0) {
      dvv $$1 = this.dV().a_($$0.b());
      $$1.a(this.dV(), $$1, $$0, this);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.n($$0, $$1, $$2);
      if (this.O == 0.0F && this.N == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.w((float)(azm.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.v((float)(azm.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.O = this.dN();
         this.N = this.dL();
         this.b(this.dA(), this.dC(), this.dG(), this.dL(), this.dN());
      }
   }

   protected boolean b(bul $$0) {
      if (!$$0.bG()) {
         return false;
      } else {
         bul $$1 = this.p();
         return $$1 == null || this.c || !$$1.z($$0);
      }
   }

   protected void C() {
      ezy $$0 = this.dy();
      double $$1 = $$0.i();
      this.w(e(this.O, (float)(azm.d($$0.e, $$1) * 180.0F / (float)Math.PI)));
      this.v(e(this.N, (float)(azm.d($$0.d, $$0.f) * 180.0F / (float)Math.PI)));
   }

   protected static float e(float $$0, float $$1) {
      while ($$1 - $$0 < -180.0F) {
         $$0 -= 360.0F;
      }

      while ($$1 - $$0 >= 180.0F) {
         $$0 += 360.0F;
      }

      return azm.h(0.2F, $$0, $$1);
   }

   @Override
   public zq<acf> a(arn $$0) {
      bul $$1 = this.p();
      return new acg(this, $$0, $$1 == null ? 0 : $$1.ar());
   }

   @Override
   public void a(acg $$0) {
      super.a($$0);
      bul $$1 = this.dV().a($$0.p());
      if ($$1 != null) {
         this.c($$1);
      }
   }

   @Override
   public boolean c(arp $$0, jh $$1) {
      bul $$2 = this.p();
      return $$2 instanceof cou ? $$2.c($$0, $$1) : $$2 == null || $$0.N().b(dfi.c);
   }

   public boolean a(arp $$0) {
      return this.aq().a(axg.g) && $$0.N().b(dfi.g);
   }

   @Override
   public boolean bH() {
      return this.aq().a(axg.H);
   }

   @Override
   public float bS() {
      return this.bH() ? 1.0F : 0.0F;
   }

   public DoubleDoubleImmutablePair a_(bvh $$0, btb $$1) {
      double $$2 = this.dy().d;
      double $$3 = this.dy().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }

   @Override
   public int bX() {
      return 2;
   }

   @Override
   public boolean a(arp $$0, btb $$1, float $$2) {
      if (!this.d($$1)) {
         this.bD();
      }

      return false;
   }

   @FunctionalInterface
   public interface a<T extends cpn> {
      T create(arp var1, bvh var2, cwm var3);
   }
}
