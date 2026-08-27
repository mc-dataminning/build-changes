import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cce extends cam implements bpw<cax> {
   public static final csp bV = csp.a(cpt.qP);
   protected static final ImmutableList<bzh<? extends bzg<? super cce>>> bW = ImmutableList.of(bzh.c, bzh.f, bzh.v, bzh.s, bzh.w);
   protected static final ImmutableList<bya<?>> bY = ImmutableList.of(
      bya.n, bya.g, bya.h, bya.m, bya.E, bya.t, bya.r, bya.S, bya.T, bya.o, bya.O, bya.P, new bya[]{bya.R, bya.x, bya.y, bya.B, bya.X, bya.Y, bya.Z, bya.aa}
   );
   private static final aii<cax> ce = ail.a(cce.class, aik.x);
   private static final aii<OptionalInt> cf = ail.a(cce.class, aik.u);
   private static final int cg = 5;
   public static final String bZ = "variant";
   public final bob ca = new bob();
   public final bob cb = new bob();
   public final bob cc = new bob();
   public final bob cd = new bob();

   public cce(bol<? extends cam> $$0, cwe $$1) {
      super($$0, $$1);
      this.bL = new cce.a(this);
      this.a(eic.j, 4.0F);
      this.a(eic.e, -1.0F);
      this.bM = new buz(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected bpy.b<cce> dN() {
      return bpy.a(bY, bW);
   }

   @Override
   protected bpy<?> a(Dynamic<?> $$0) {
      return ccf.a(this.dN().a($$0));
   }

   @Override
   public bpy<cce> dM() {
      return (bpy<cce>)super.dM();
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(ce, cax.a);
      this.am.a(cf, OptionalInt.empty());
   }

   @Override
   public void u() {
      this.am.b(cf, OptionalInt.empty());
   }

   public Optional<bof> w() {
      return this.am.b(cf).stream().mapToObj(this.dJ()::a).filter(Objects::nonNull).findFirst();
   }

   @Override
   public void a(bof $$0) {
      this.am.b(cf, OptionalInt.of($$0.aj()));
   }

   @Override
   public int fL() {
      return 35;
   }

   @Override
   public int fJ() {
      return 5;
   }

   public cax A() {
      return this.am.b(ce);
   }

   public void a(cax $$0) {
      this.am.b(ce, $$0);
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("variant", kh.al.b(this.A()).toString());
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      cax $$1 = kh.al.a(ajc.a($$0.l("variant")));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   @Override
   protected void aa() {
      this.dJ().ae().a("frogBrain");
      this.dM().a((apa)this.dJ(), this);
      this.dJ().ae().c();
      this.dJ().ae().a("frogActivityUpdate");
      ccf.a(this);
      this.dJ().ae().c();
      super.aa();
   }

   @Override
   public void l() {
      if (this.dJ().y_()) {
         this.cd.a(this.bc() && !this.aR.c(), this.ag);
      }

      super.l();
   }

   @Override
   public void a(aii<?> $$0) {
      if (ar.equals($$0)) {
         bpi $$1 = this.ap();
         if ($$1 == bpi.g) {
            this.ca.a(this.ag);
         } else {
            this.ca.a();
         }

         if ($$1 == bpi.i) {
            this.cb.a(this.ag);
         } else {
            this.cb.a();
         }

         if ($$1 == bpi.j) {
            this.cc.a(this.ag);
         } else {
            this.cc.a();
         }
      }

      super.a($$0);
   }

   @Override
   protected void v(float $$0) {
      float $$1;
      if (this.ca.c()) {
         $$1 = 0.0F;
      } else {
         $$1 = Math.min($$0 * 25.0F, 1.0F);
      }

      this.aR.a($$1, 0.4F);
   }

   @Nullable
   @Override
   public boa a(apa $$0, boa $$1) {
      cce $$2 = bol.Q.a((cwe)$$0);
      if ($$2 != null) {
         ccf.a($$2, $$0.F_());
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
   public void a(apa $$0, cam $$1) {
      this.a($$0, $$1, null);
      this.dM().a(bya.Y, axo.a);
   }

   @Override
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      il<cxd> $$4 = $$0.t(this.dj());
      if ($$4.a(aud.ai)) {
         this.a(cax.c);
      } else if ($$4.a(aud.aj)) {
         this.a(cax.b);
      } else {
         this.a(cax.a);
      }

      ccf.a(this, $$0.F_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static bqd.a gl() {
      return boz.C().a(bqe.o, 1.0).a(bqe.n, 10.0).a(bqe.c, 10.0).a(bqe.r, 1.0);
   }

   @Nullable
   @Override
   protected ato y() {
      return atp.jx;
   }

   @Nullable
   @Override
   protected ato d(bne $$0) {
      return atp.jA;
   }

   @Nullable
   @Override
   protected ato n_() {
      return atp.jy;
   }

   @Override
   protected void b(ib $$0, dme $$1) {
      this.a(atp.jD, 0.15F, 1.0F);
   }

   @Override
   public boolean cw() {
      return false;
   }

   @Override
   protected void Z() {
      super.Z();
      aes.a(this);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 5;
   }

   @Override
   public void a(eov $$0) {
      if (this.cU() && this.aZ()) {
         this.a(this.fh(), $$0);
         this.a(bpc.a, this.dm());
         this.g(this.dm().a(0.9));
      } else {
         super.a($$0);
      }
   }

   public static boolean j(box $$0) {
      if ($$0 instanceof cfp $$1 && $$1.gm() != 1) {
         return false;
      }

      return $$0.ai().a(auh.n);
   }

   @Override
   protected byi b(cwe $$0) {
      return new cce.c(this, $$0);
   }

   @Override
   public boolean o(cpq $$0) {
      return bV.a($$0);
   }

   public static boolean c(bol<? extends cam> $$0, cwf $$1, bpb $$2, ib $$3, awt $$4) {
      return $$1.a_($$3.d()).a(aue.bZ) && a($$1, $$3);
   }

   class a extends buw {
      a(boz $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return cce.this.w().isEmpty();
      }
   }

   static class b extends eia {
      private final ib.a l = new ib.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public eie a() {
         return !this.b.aZ() ? super.a() : this.c(new ib(awm.a(this.b.cE().a), awm.a(this.b.cE().b), awm.a(this.b.cE().c)));
      }

      @Override
      public eic a(cvk $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         dme $$4 = $$0.a_(this.l);
         return $$4.a(aue.bK) ? eic.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends byf {
      c(cce $$0, cwe $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(eic $$0) {
         return $$0 != eic.k && super.b($$0);
      }

      @Override
      protected eii a(int $$0) {
         this.o = new cce.b(true);
         this.o.a(true);
         return new eii(this.o, $$0);
      }
   }
}
