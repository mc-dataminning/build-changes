import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bvz extends buk implements bjx<buv> {
   public static final cly bT = cly.a(cjb.qc);
   protected static final ImmutableList<btf<? extends bte<? super bvz>>> bU = ImmutableList.of(btf.c, btf.f, btf.t, btf.r, btf.u);
   protected static final ImmutableList<bsa<?>> bW = ImmutableList.of(
      bsa.n, bsa.g, bsa.h, bsa.m, bsa.E, bsa.t, bsa.r, bsa.R, bsa.S, bsa.o, bsa.N, bsa.O, new bsa[]{bsa.Q, bsa.x, bsa.y, bsa.B, bsa.W, bsa.X, bsa.Y, bsa.Z}
   );
   private static final adz<buv> cc = aec.a(bvz.class, aeb.x);
   private static final adz<OptionalInt> cd = aec.a(bvz.class, aeb.u);
   private static final int ce = 5;
   public static final String bX = "variant";
   public final bie bY = new bie();
   public final bie bZ = new bie();
   public final bie ca = new bie();
   public final bie cb = new bie();

   public bvz(bim<? extends buk> $$0, cpm $$1) {
      super($$0, $$1);
      this.bK = new bvz.a(this);
      this.a(eao.j, 4.0F);
      this.a(eao.e, -1.0F);
      this.bL = new boz(this, 85, 10, 0.02F, 0.1F, true);
      this.t(1.0F);
   }

   @Override
   protected bjz.b<bvz> dN() {
      return bjz.a(bW, bU);
   }

   @Override
   protected bjz<?> a(Dynamic<?> $$0) {
      return bwa.a(this.dN().a($$0));
   }

   @Override
   public bjz<bvz> dM() {
      return (bjz<bvz>)super.dM();
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(cc, buv.a);
      this.an.a(cd, OptionalInt.empty());
   }

   @Override
   public void p() {
      this.an.b(cd, OptionalInt.empty());
   }

   public Optional<bii> q() {
      return this.an.b(cd).stream().mapToObj(this.dK()::a).filter(Objects::nonNull).findFirst();
   }

   @Override
   public void a(bii $$0) {
      this.an.b(cd, OptionalInt.of($$0.ah()));
   }

   @Override
   public int Y() {
      return 35;
   }

   @Override
   public int X() {
      return 5;
   }

   public buv t() {
      return this.an.b(cc);
   }

   public void a(buv $$0) {
      this.an.b(cc, $$0);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("variant", jb.ak.b(this.t()).toString());
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      buv $$1 = jb.ak.a(aer.a($$0.l("variant")));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   @Override
   public boolean dP() {
      return true;
   }

   @Override
   protected void V() {
      this.dK().ad().a("frogBrain");
      this.dM().a((akk)this.dK(), this);
      this.dK().ad().c();
      this.dK().ad().a("frogActivityUpdate");
      bwa.a(this);
      this.dK().ad().c();
      super.V();
   }

   @Override
   public void l() {
      if (this.dK().r_()) {
         this.cb.a(this.ba() && !this.aQ.c(), this.ah);
      }

      super.l();
   }

   @Override
   public void a(adz<?> $$0) {
      if (as.equals($$0)) {
         bjk $$1 = this.an();
         if ($$1 == bjk.g) {
            this.bY.a(this.ah);
         } else {
            this.bY.a();
         }

         if ($$1 == bjk.i) {
            this.bZ.a(this.ah);
         } else {
            this.bZ.a();
         }

         if ($$1 == bjk.j) {
            this.ca.a(this.ah);
         } else {
            this.ca.a();
         }
      }

      super.a($$0);
   }

   @Override
   protected void v(float $$0) {
      float $$1;
      if (this.bY.c()) {
         $$1 = 0.0F;
      } else {
         $$1 = Math.min($$0 * 25.0F, 1.0F);
      }

      this.aQ.a($$1, 0.4F);
   }

   @Nullable
   @Override
   public bid a(akk $$0, bid $$1) {
      bvz $$2 = bim.O.a((cpm)$$0);
      if ($$2 != null) {
         bwa.a($$2, $$0.y_());
      }

      return $$2;
   }

   @Override
   public boolean i_() {
      return false;
   }

   @Override
   public void a(boolean $$0) {
   }

   @Override
   public void a(akk $$0, buk $$1) {
      this.a($$0, $$1, null);
      this.dM().a(bsa.X, asp.a);
   }

   @Override
   public bjs a(cqb $$0, bgo $$1, bjc $$2, @Nullable bjs $$3, @Nullable qr $$4) {
      he<cqk> $$5 = $$0.s(this.dk());
      if ($$5.a(apk.ah)) {
         this.a(buv.c);
      } else if ($$5.a(apk.ai)) {
         this.a(buv.b);
      } else {
         this.a(buv.a);
      }

      bwa.a(this, $$0.y_());
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static bke.a fZ() {
      return bja.x().a(bkf.d, 1.0).a(bkf.a, 10.0).a(bkf.f, 10.0);
   }

   @Nullable
   @Override
   protected aov r() {
      return aow.iE;
   }

   @Nullable
   @Override
   protected aov d(bhg $$0) {
      return aow.iH;
   }

   @Nullable
   @Override
   protected aov h_() {
      return aow.iF;
   }

   @Override
   protected void b(gu $$0, dfa $$1) {
      this.a(aow.iK, 0.15F, 1.0F);
   }

   @Override
   public boolean cy() {
      return false;
   }

   @Override
   protected void T() {
      super.T();
      aav.a(this);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 5;
   }

   @Override
   public void h(ehe $$0) {
      if (this.cW() && this.aX()) {
         this.a(this.fd(), $$0);
         this.a(bje.a, this.dn());
         this.f(this.dn().a(0.9));
      } else {
         super.h($$0);
      }
   }

   public static boolean l(biy $$0) {
      if ($$0 instanceof bzk $$1 && $$1.ga() != 1) {
         return false;
      }

      return $$0.ag().a(apo.k);
   }

   @Override
   protected bsi b(cpm $$0) {
      return new bvz.c(this, $$0);
   }

   @Override
   protected Vector3f a(bii $$0, bij $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.125F * $$2, -0.25F * $$2);
   }

   @Override
   public boolean m(ciy $$0) {
      return bT.a($$0);
   }

   public static boolean c(bim<? extends buk> $$0, cpn $$1, bjc $$2, gu $$3, aru $$4) {
      return $$1.a_($$3.d()).a(apl.bY) && a($$1, $$3);
   }

   class a extends bow {
      a(bja $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return bvz.this.q().isEmpty();
      }
   }

   static class b extends eam {
      private final gu.a l = new gu.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public eaq a() {
         return !this.b.aX() ? super.a() : this.c(new gu(arp.a(this.b.cG().a), arp.a(this.b.cG().b), arp.a(this.b.cG().c)));
      }

      @Override
      public eao a(cos $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         dfa $$4 = $$0.a_(this.l);
         return $$4.a(apl.bK) ? eao.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends bsf {
      c(bvz $$0, cpm $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(eao $$0) {
         return $$0 != eao.k && super.b($$0);
      }

      @Override
      protected eau a(int $$0) {
         this.o = new bvz.b(true);
         this.o.a(true);
         return new eau(this.o, $$0);
      }
   }
}
