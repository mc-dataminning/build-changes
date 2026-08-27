import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bwi extends but implements bkg<bve> {
   public static final cmi bT = cmi.a(cjk.qc);
   protected static final ImmutableList<bto<? extends btn<? super bwi>>> bU = ImmutableList.of(bto.c, bto.f, bto.t, bto.r, bto.u);
   protected static final ImmutableList<bsj<?>> bW = ImmutableList.of(
      bsj.n, bsj.g, bsj.h, bsj.m, bsj.E, bsj.t, bsj.r, bsj.R, bsj.S, bsj.o, bsj.N, bsj.O, new bsj[]{bsj.Q, bsj.x, bsj.y, bsj.B, bsj.W, bsj.X, bsj.Y, bsj.Z}
   );
   private static final aeg<bve> cc = aej.a(bwi.class, aei.x);
   private static final aeg<OptionalInt> cd = aej.a(bwi.class, aei.u);
   private static final int ce = 5;
   public static final String bX = "variant";
   public final bio bY = new bio();
   public final bio bZ = new bio();
   public final bio ca = new bio();
   public final bio cb = new bio();

   public bwi(biw<? extends but> $$0, cpx $$1) {
      super($$0, $$1);
      this.bK = new bwi.a(this);
      this.a(eaz.j, 4.0F);
      this.a(eaz.e, -1.0F);
      this.bL = new bpi(this, 85, 10, 0.02F, 0.1F, true);
      this.t(1.0F);
   }

   @Override
   protected bki.b<bwi> dO() {
      return bki.a(bW, bU);
   }

   @Override
   protected bki<?> a(Dynamic<?> $$0) {
      return bwj.a(this.dO().a($$0));
   }

   @Override
   public bki<bwi> dN() {
      return (bki<bwi>)super.dN();
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(cc, bve.a);
      this.an.a(cd, OptionalInt.empty());
   }

   @Override
   public void s() {
      this.an.b(cd, OptionalInt.empty());
   }

   public Optional<bis> t() {
      return this.an.b(cd).stream().mapToObj(this.dL()::a).filter(Objects::nonNull).findFirst();
   }

   @Override
   public void a(bis $$0) {
      this.an.b(cd, OptionalInt.of($$0.ah()));
   }

   @Override
   public int fG() {
      return 35;
   }

   @Override
   public int Z() {
      return 5;
   }

   public bve y() {
      return this.an.b(cc);
   }

   public void a(bve $$0) {
      this.an.b(cc, $$0);
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      $$0.a("variant", jd.ak.b(this.y()).toString());
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      bve $$1 = jd.ak.a(aey.a($$0.l("variant")));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   @Override
   public boolean dQ() {
      return true;
   }

   @Override
   protected void X() {
      this.dL().ad().a("frogBrain");
      this.dN().a((aks)this.dL(), this);
      this.dL().ad().c();
      this.dL().ad().a("frogActivityUpdate");
      bwj.a(this);
      this.dL().ad().c();
      super.X();
   }

   @Override
   public void l() {
      if (this.dL().w_()) {
         this.cb.a(this.ba() && !this.aQ.c(), this.ah);
      }

      super.l();
   }

   @Override
   public void a(aeg<?> $$0) {
      if (as.equals($$0)) {
         bju $$1 = this.an();
         if ($$1 == bju.g) {
            this.bY.a(this.ah);
         } else {
            this.bY.a();
         }

         if ($$1 == bju.i) {
            this.bZ.a(this.ah);
         } else {
            this.bZ.a();
         }

         if ($$1 == bju.j) {
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
   public bin a(aks $$0, bin $$1) {
      bwi $$2 = biw.O.a((cpx)$$0);
      if ($$2 != null) {
         bwj.a($$2, $$0.D_());
      }

      return $$2;
   }

   @Override
   public boolean m_() {
      return false;
   }

   @Override
   public void a(boolean $$0) {
   }

   @Override
   public void a(aks $$0, but $$1) {
      this.a($$0, $$1, null);
      this.dN().a(bsj.X, asz.a);
   }

   @Override
   public bkb a(cqm $$0, bgy $$1, bjm $$2, @Nullable bkb $$3, @Nullable qy $$4) {
      hg<cqv> $$5 = $$0.s(this.dl());
      if ($$5.a(apt.ah)) {
         this.a(bve.c);
      } else if ($$5.a(apt.ai)) {
         this.a(bve.b);
      } else {
         this.a(bve.a);
      }

      bwj.a(this, $$0.D_());
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static bkn.a gd() {
      return bjk.A().a(bko.d, 1.0).a(bko.a, 10.0).a(bko.f, 10.0);
   }

   @Nullable
   @Override
   protected ape w() {
      return apf.iE;
   }

   @Nullable
   @Override
   protected ape d(bhq $$0) {
      return apf.iH;
   }

   @Nullable
   @Override
   protected ape l_() {
      return apf.iF;
   }

   @Override
   protected void b(gw $$0, dfl $$1) {
      this.a(apf.iK, 0.15F, 1.0F);
   }

   @Override
   public boolean cy() {
      return false;
   }

   @Override
   protected void W() {
      super.W();
      abd.a(this);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 5;
   }

   @Override
   public void h(ehp $$0) {
      if (this.cW() && this.aX()) {
         this.a(this.fe(), $$0);
         this.a(bjo.a, this.do());
         this.f(this.do().a(0.9));
      } else {
         super.h($$0);
      }
   }

   public static boolean j(bji $$0) {
      if ($$0 instanceof bzt $$1 && $$1.ge() != 1) {
         return false;
      }

      return $$0.ag().a(apx.k);
   }

   @Override
   protected bsr b(cpx $$0) {
      return new bwi.c(this, $$0);
   }

   @Override
   protected Vector3f a(bis $$0, bit $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.125F * $$2, -0.25F * $$2);
   }

   @Override
   public boolean m(cjh $$0) {
      return bT.a($$0);
   }

   public static boolean c(biw<? extends but> $$0, cpy $$1, bjm $$2, gw $$3, ase $$4) {
      return $$1.a_($$3.d()).a(apu.bY) && a($$1, $$3);
   }

   class a extends bpf {
      a(bjk $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return bwi.this.t().isEmpty();
      }
   }

   static class b extends eax {
      private final gw.a l = new gw.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public ebb a() {
         return !this.b.aX() ? super.a() : this.c(new gw(ary.a(this.b.cG().a), ary.a(this.b.cG().b), ary.a(this.b.cG().c)));
      }

      @Override
      public eaz a(cpd $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         dfl $$4 = $$0.a_(this.l);
         return $$4.a(apu.bK) ? eaz.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends bso {
      c(bwi $$0, cpx $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(eaz $$0) {
         return $$0 != eaz.k && super.b($$0);
      }

      @Override
      protected ebf a(int $$0) {
         this.o = new bwi.b(true);
         this.o.a(true);
         return new ebf(this.o, $$0);
      }
   }
}
