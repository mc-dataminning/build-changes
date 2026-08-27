import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cbp extends bzx implements bph<cai> {
   public static final csc bT = csc.a(cpg.qP);
   protected static final ImmutableList<bys<? extends byr<? super cbp>>> bU = ImmutableList.of(bys.c, bys.f, bys.v, bys.s, bys.w);
   protected static final ImmutableList<bxl<?>> bW = ImmutableList.of(
      bxl.n, bxl.g, bxl.h, bxl.m, bxl.E, bxl.t, bxl.r, bxl.S, bxl.T, bxl.o, bxl.O, bxl.P, new bxl[]{bxl.R, bxl.x, bxl.y, bxl.B, bxl.X, bxl.Y, bxl.Z, bxl.aa}
   );
   private static final aie<cai> cc = aih.a(cbp.class, aig.x);
   private static final aie<OptionalInt> cd = aih.a(cbp.class, aig.u);
   private static final int ce = 5;
   public static final String bX = "variant";
   public final bnm bY = new bnm();
   public final bnm bZ = new bnm();
   public final bnm ca = new bnm();
   public final bnm cb = new bnm();

   public cbp(bnw<? extends bzx> $$0, cvr $$1) {
      super($$0, $$1);
      this.bK = new cbp.a(this);
      this.a(ehh.j, 4.0F);
      this.a(ehh.e, -1.0F);
      this.bL = new buk(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected bpj.b<cbp> dP() {
      return bpj.a(bW, bU);
   }

   @Override
   protected bpj<?> a(Dynamic<?> $$0) {
      return cbq.a(this.dP().a($$0));
   }

   @Override
   public bpj<cbp> dO() {
      return (bpj<cbp>)super.dO();
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(cc, cai.a);
      this.am.a(cd, OptionalInt.empty());
   }

   @Override
   public void u() {
      this.am.b(cd, OptionalInt.empty());
   }

   public Optional<bnq> w() {
      return this.am.b(cd).stream().mapToObj(this.dM()::a).filter(Objects::nonNull).findFirst();
   }

   @Override
   public void a(bnq $$0) {
      this.am.b(cd, OptionalInt.of($$0.aj()));
   }

   @Override
   public int fJ() {
      return 35;
   }

   @Override
   public int fH() {
      return 5;
   }

   public cai A() {
      return this.am.b(cc);
   }

   public void a(cai $$0) {
      this.am.b(cc, $$0);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("variant", kf.al.b(this.A()).toString());
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      cai $$1 = kf.al.a(aiy.a($$0.l("variant")));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   @Override
   protected void aa() {
      this.dM().ae().a("frogBrain");
      this.dO().a((aow)this.dM(), this);
      this.dM().ae().c();
      this.dM().ae().a("frogActivityUpdate");
      cbq.a(this);
      this.dM().ae().c();
      super.aa();
   }

   @Override
   public void l() {
      if (this.dM().y_()) {
         this.cb.a(this.bc() && !this.aQ.c(), this.ag);
      }

      super.l();
   }

   @Override
   public void a(aie<?> $$0) {
      if (ar.equals($$0)) {
         bot $$1 = this.ap();
         if ($$1 == bot.g) {
            this.bY.a(this.ag);
         } else {
            this.bY.a();
         }

         if ($$1 == bot.i) {
            this.bZ.a(this.ag);
         } else {
            this.bZ.a();
         }

         if ($$1 == bot.j) {
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

      this.aQ.a($$1, 0.4F);
   }

   @Nullable
   @Override
   public bnl a(aow $$0, bnl $$1) {
      cbp $$2 = bnw.Q.a((cvr)$$0);
      if ($$2 != null) {
         cbq.a($$2, $$0.F_());
      }

      return $$2;
   }

   @Override
   public boolean o_() {
      return false;
   }

   @Override
   public void a(boolean $$0) {
   }

   @Override
   public void a(aow $$0, bzx $$1) {
      this.a($$0, $$1, null);
      this.dO().a(bxl.Y, axk.a);
   }

   @Override
   public bpa a(cwg $$0, blu $$1, bom $$2, @Nullable bpa $$3, @Nullable sw $$4) {
      ij<cwq> $$5 = $$0.t(this.dm());
      if ($$5.a(atz.ai)) {
         this.a(cai.c);
      } else if ($$5.a(atz.aj)) {
         this.a(cai.b);
      } else {
         this.a(cai.a);
      }

      cbq.a(this, $$0.F_());
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static bpo.a gg() {
      return bok.C().a(bpp.o, 1.0).a(bpp.n, 10.0).a(bpp.c, 10.0).a(bpp.r, 1.0);
   }

   @Nullable
   @Override
   protected atk y() {
      return atl.jx;
   }

   @Nullable
   @Override
   protected atk d(bmp $$0) {
      return atl.jA;
   }

   @Nullable
   @Override
   protected atk n_() {
      return atl.jy;
   }

   @Override
   protected void b(hz $$0, dlj $$1) {
      this.a(atl.jD, 0.15F, 1.0F);
   }

   @Override
   public boolean cz() {
      return false;
   }

   @Override
   protected void Z() {
      super.Z();
      aep.a(this);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 5;
   }

   @Override
   public void a(enz $$0) {
      if (this.cX() && this.aZ()) {
         this.a(this.ff(), $$0);
         this.a(bon.a, this.dp());
         this.g(this.dp().a(0.9));
      } else {
         super.a($$0);
      }
   }

   public static boolean j(boi $$0) {
      if ($$0 instanceof cfa $$1 && $$1.gh() != 1) {
         return false;
      }

      return $$0.ai().a(aud.n);
   }

   @Override
   protected bxt b(cvr $$0) {
      return new cbp.c(this, $$0);
   }

   @Override
   public boolean m(cpd $$0) {
      return bT.a($$0);
   }

   public static boolean c(bnw<? extends bzx> $$0, cvs $$1, bom $$2, hz $$3, awp $$4) {
      return $$1.a_($$3.d()).a(aua.bZ) && a($$1, $$3);
   }

   class a extends buh {
      a(bok $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return cbp.this.w().isEmpty();
      }
   }

   static class b extends ehf {
      private final hz.a l = new hz.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public ehj a() {
         return !this.b.aZ() ? super.a() : this.c(new hz(awi.a(this.b.cH().a), awi.a(this.b.cH().b), awi.a(this.b.cH().c)));
      }

      @Override
      public ehh a(cux $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         dlj $$4 = $$0.a_(this.l);
         return $$4.a(aua.bK) ? ehh.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends bxq {
      c(cbp $$0, cvr $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(ehh $$0) {
         return $$0 != ehh.k && super.b($$0);
      }

      @Override
      protected ehn a(int $$0) {
         this.o = new cbp.b(true);
         this.o.a(true);
         return new ehn(this.o, $$0);
      }
   }
}
