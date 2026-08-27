import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class bta extends brl implements bgy<brw> {
   public static final ciz bT = ciz.a(cgc.qc);
   protected static final ImmutableList<bqg<? extends bqf<? super bta>>> bU = ImmutableList.of(bqg.c, bqg.f, bqg.t, bqg.r, bqg.u);
   protected static final ImmutableList<bpb<?>> bW = ImmutableList.of(
      bpb.n, bpb.g, bpb.h, bpb.m, bpb.E, bpb.t, bpb.r, bpb.R, bpb.S, bpb.o, bpb.N, bpb.O, new bpb[]{bpb.Q, bpb.x, bpb.y, bpb.B, bpb.W, bpb.X, bpb.Y, bpb.Z}
   );
   private static final aby<brw> cc = acb.a(bta.class, aca.x);
   private static final aby<OptionalInt> cd = acb.a(bta.class, aca.u);
   private static final int ce = 5;
   public static final String bX = "variant";
   public final bff bY = new bff();
   public final bff bZ = new bff();
   public final bff ca = new bff();
   public final bff cb = new bff();

   public bta(bfn<? extends brl> $$0, cmm $$1) {
      super($$0, $$1);
      this.bK = new bta.a(this);
      this.a(dxp.j, 4.0F);
      this.a(dxp.e, -1.0F);
      this.bL = new bma(this, 85, 10, 0.02F, 0.1F, true);
      this.r(1.0F);
   }

   @Override
   protected bha.b<bta> dL() {
      return bha.a(bW, bU);
   }

   @Override
   protected bha<?> a(Dynamic<?> $$0) {
      return btb.a(this.dL().a($$0));
   }

   @Override
   public bha<bta> dK() {
      return (bha<bta>)super.dK();
   }

   @Override
   protected void a_() {
      super.a_();
      this.am.a(cc, brw.a);
      this.am.a(cd, OptionalInt.empty());
   }

   @Override
   public void q() {
      this.am.b(cd, OptionalInt.empty());
   }

   public Optional<bfj> r() {
      return this.am.b(cd).stream().mapToObj(this.dI()::a).filter(Objects::nonNull).findFirst();
   }

   @Override
   public void a(bfj $$0) {
      this.am.b(cd, OptionalInt.of($$0.af()));
   }

   @Override
   public int fD() {
      return 35;
   }

   @Override
   public int fC() {
      return 5;
   }

   public brw w() {
      return this.am.b(cc);
   }

   public void a(brw $$0) {
      this.am.b(cc, $$0);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("variant", jb.ak.b(this.w()).toString());
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      brw $$1 = jb.ak.a(acq.a($$0.l("variant")));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   @Override
   public boolean dN() {
      return true;
   }

   @Override
   protected void W() {
      this.dI().ad().a("frogBrain");
      this.dK().a((aif)this.dI(), this);
      this.dI().ad().c();
      this.dI().ad().a("frogActivityUpdate");
      btb.a(this);
      this.dI().ad().c();
      super.W();
   }

   @Override
   public void l() {
      if (this.dI().r_()) {
         this.cb.a(this.aY() && !this.aR.c(), this.ag);
      }

      super.l();
   }

   @Override
   public void a(aby<?> $$0) {
      if (ar.equals($$0)) {
         bgl $$1 = this.al();
         if ($$1 == bgl.g) {
            this.bY.a(this.ag);
         } else {
            this.bY.a();
         }

         if ($$1 == bgl.i) {
            this.bZ.a(this.ag);
         } else {
            this.bZ.a();
         }

         if ($$1 == bgl.j) {
            this.ca.a(this.ag);
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

      this.aR.a($$1, 0.4F);
   }

   @Nullable
   @Override
   public bfe a(aif $$0, bfe $$1) {
      bta $$2 = bfn.O.a((cmm)$$0);
      if ($$2 != null) {
         btb.a($$2, $$0.y_());
      }

      return $$2;
   }

   @Override
   public boolean h_() {
      return false;
   }

   @Override
   public void a(boolean $$0) {
   }

   @Override
   public void a(aif $$0, brl $$1) {
      this.a($$0, $$1, null);
      this.dK().a(bpb.X, apz.a);
   }

   @Override
   public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
      he<cnk> $$5 = $$0.s(this.di());
      if ($$5.a(amv.ah)) {
         this.a(brw.c);
      } else if ($$5.a(amv.ai)) {
         this.a(brw.b);
      } else {
         this.a(brw.a);
      }

      btb.a(this, $$0.y_());
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static bhf.a fY() {
      return bgb.y().a(bhg.d, 1.0).a(bhg.a, 10.0).a(bhg.f, 10.0);
   }

   @Nullable
   @Override
   protected amg s() {
      return amh.iE;
   }

   @Nullable
   @Override
   protected amg d(ben $$0) {
      return amh.iH;
   }

   @Nullable
   @Override
   protected amg g_() {
      return amh.iF;
   }

   @Override
   protected void b(gu $$0, dcb $$1) {
      this.a(amh.iK, 0.15F, 1.0F);
   }

   @Override
   public boolean cw() {
      return false;
   }

   @Override
   protected void V() {
      super.V();
      za.a(this);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 5;
   }

   @Override
   public void h(eei $$0) {
      if (this.cU() && this.aV()) {
         this.a(this.fa(), $$0);
         this.a(bgf.a, this.dl());
         this.f(this.dl().a(0.9));
      } else {
         super.h($$0);
      }
   }

   public static boolean l(bfz $$0) {
      if ($$0 instanceof bwl $$1 && $$1.ga() != 1) {
         return false;
      }

      return $$0.ae().a(amz.k);
   }

   @Override
   protected bpj b(cmm $$0) {
      return new bta.c(this, $$0);
   }

   @Override
   public boolean m(cfz $$0) {
      return bT.a($$0);
   }

   public static boolean c(bfn<? extends brl> $$0, cmn $$1, bgd $$2, gu $$3, apf $$4) {
      return $$1.a_($$3.d()).a(amw.bW) && a($$1, $$3);
   }

   class a extends blx {
      a(bgb $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return bta.this.r().isEmpty();
      }
   }

   static class b extends dxn {
      private final gu.a l = new gu.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public dxr a() {
         return !this.b.aV() ? super.a() : this.c(new gu(apa.a(this.b.cE().a), apa.a(this.b.cE().b), apa.a(this.b.cE().c)));
      }

      @Override
      public dxp a(cls $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         dcb $$4 = $$0.a_(this.l);
         return $$4.a(amw.bI) ? dxp.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends bpg {
      c(bta $$0, cmm $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(dxp $$0) {
         return $$0 != dxp.k && super.b($$0);
      }

      @Override
      protected dxv a(int $$0) {
         this.o = new bta.b(true);
         this.o.a(true);
         return new dxv(this.o, $$0);
      }
   }
}
