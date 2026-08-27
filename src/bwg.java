import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bwg extends bur implements bke<bvc> {
   public static final cmg bT = cmg.a(cji.qc);
   protected static final ImmutableList<btm<? extends btl<? super bwg>>> bU = ImmutableList.of(btm.c, btm.f, btm.t, btm.r, btm.u);
   protected static final ImmutableList<bsh<?>> bW = ImmutableList.of(
      bsh.n, bsh.g, bsh.h, bsh.m, bsh.E, bsh.t, bsh.r, bsh.R, bsh.S, bsh.o, bsh.N, bsh.O, new bsh[]{bsh.Q, bsh.x, bsh.y, bsh.B, bsh.W, bsh.X, bsh.Y, bsh.Z}
   );
   private static final aef<bvc> cc = aei.a(bwg.class, aeh.x);
   private static final aef<OptionalInt> cd = aei.a(bwg.class, aeh.u);
   private static final int ce = 5;
   public static final String bX = "variant";
   public final bim bY = new bim();
   public final bim bZ = new bim();
   public final bim ca = new bim();
   public final bim cb = new bim();

   public bwg(biu<? extends bur> $$0, cpv $$1) {
      super($$0, $$1);
      this.bK = new bwg.a(this);
      this.a(eax.j, 4.0F);
      this.a(eax.e, -1.0F);
      this.bL = new bpg(this, 85, 10, 0.02F, 0.1F, true);
      this.t(1.0F);
   }

   @Override
   protected bkg.b<bwg> dO() {
      return bkg.a(bW, bU);
   }

   @Override
   protected bkg<?> a(Dynamic<?> $$0) {
      return bwh.a(this.dO().a($$0));
   }

   @Override
   public bkg<bwg> dN() {
      return (bkg<bwg>)super.dN();
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(cc, bvc.a);
      this.an.a(cd, OptionalInt.empty());
   }

   @Override
   public void s() {
      this.an.b(cd, OptionalInt.empty());
   }

   public Optional<biq> t() {
      return this.an.b(cd).stream().mapToObj(this.dL()::a).filter(Objects::nonNull).findFirst();
   }

   @Override
   public void a(biq $$0) {
      this.an.b(cd, OptionalInt.of($$0.ai()));
   }

   @Override
   public int fG() {
      return 35;
   }

   @Override
   public int aa() {
      return 5;
   }

   public bvc y() {
      return this.an.b(cc);
   }

   public void a(bvc $$0) {
      this.an.b(cc, $$0);
   }

   @Override
   public void b(qx $$0) {
      super.b($$0);
      $$0.a("variant", jd.ak.b(this.y()).toString());
   }

   @Override
   public void a(qx $$0) {
      super.a($$0);
      bvc $$1 = jd.ak.a(aex.a($$0.l("variant")));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   @Override
   public boolean dQ() {
      return true;
   }

   @Override
   protected void Y() {
      this.dL().ad().a("frogBrain");
      this.dN().a((akr)this.dL(), this);
      this.dL().ad().c();
      this.dL().ad().a("frogActivityUpdate");
      bwh.a(this);
      this.dL().ad().c();
      super.Y();
   }

   @Override
   public void l() {
      if (this.dL().w_()) {
         this.cb.a(this.bb() && !this.aQ.c(), this.ah);
      }

      super.l();
   }

   @Override
   public void a(aef<?> $$0) {
      if (as.equals($$0)) {
         bjs $$1 = this.ao();
         if ($$1 == bjs.g) {
            this.bY.a(this.ah);
         } else {
            this.bY.a();
         }

         if ($$1 == bjs.i) {
            this.bZ.a(this.ah);
         } else {
            this.bZ.a();
         }

         if ($$1 == bjs.j) {
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
   public bil a(akr $$0, bil $$1) {
      bwg $$2 = biu.O.a((cpv)$$0);
      if ($$2 != null) {
         bwh.a($$2, $$0.D_());
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
   public void a(akr $$0, bur $$1) {
      this.a($$0, $$1, null);
      this.dN().a(bsh.X, asx.a);
   }

   @Override
   public bjz a(cqk $$0, bgw $$1, bjk $$2, @Nullable bjz $$3, @Nullable qx $$4) {
      hg<cqt> $$5 = $$0.s(this.dl());
      if ($$5.a(aps.ah)) {
         this.a(bvc.c);
      } else if ($$5.a(aps.ai)) {
         this.a(bvc.b);
      } else {
         this.a(bvc.a);
      }

      bwh.a(this, $$0.D_());
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static bkl.a gd() {
      return bji.A().a(bkm.d, 1.0).a(bkm.a, 10.0).a(bkm.f, 10.0);
   }

   @Nullable
   @Override
   protected apd w() {
      return ape.iE;
   }

   @Nullable
   @Override
   protected apd d(bho $$0) {
      return ape.iH;
   }

   @Nullable
   @Override
   protected apd l_() {
      return ape.iF;
   }

   @Override
   protected void b(gw $$0, dfj $$1) {
      this.a(ape.iK, 0.15F, 1.0F);
   }

   @Override
   public boolean cz() {
      return false;
   }

   @Override
   protected void X() {
      super.X();
      abc.a(this);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 5;
   }

   @Override
   public void h(ehn $$0) {
      if (this.cX() && this.aY()) {
         this.a(this.fe(), $$0);
         this.a(bjm.a, this.do());
         this.f(this.do().a(0.9));
      } else {
         super.h($$0);
      }
   }

   public static boolean j(bjg $$0) {
      if ($$0 instanceof bzr $$1 && $$1.ge() != 1) {
         return false;
      }

      return $$0.ah().a(apw.k);
   }

   @Override
   protected bsp b(cpv $$0) {
      return new bwg.c(this, $$0);
   }

   @Override
   protected Vector3f a(biq $$0, bir $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.125F * $$2, -0.25F * $$2);
   }

   @Override
   public boolean m(cjf $$0) {
      return bT.a($$0);
   }

   public static boolean c(biu<? extends bur> $$0, cpw $$1, bjk $$2, gw $$3, asc $$4) {
      return $$1.a_($$3.d()).a(apt.bY) && a($$1, $$3);
   }

   class a extends bpd {
      a(bji $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return bwg.this.t().isEmpty();
      }
   }

   static class b extends eav {
      private final gw.a l = new gw.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public eaz a() {
         return !this.b.aY() ? super.a() : this.c(new gw(arx.a(this.b.cH().a), arx.a(this.b.cH().b), arx.a(this.b.cH().c)));
      }

      @Override
      public eax a(cpb $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         dfj $$4 = $$0.a_(this.l);
         return $$4.a(apt.bK) ? eax.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends bsm {
      c(bwg $$0, cpv $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(eax $$0) {
         return $$0 != eax.k && super.b($$0);
      }

      @Override
      protected ebd a(int $$0) {
         this.o = new bwg.b(true);
         this.o.a(true);
         return new ebd(this.o, $$0);
      }
   }
}
