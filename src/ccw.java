import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class ccw extends cbe implements bqo<cbp> {
   public static final ctm bX = ctm.a(cqp.qP);
   protected static final ImmutableList<bzz<? extends bzy<? super ccw>>> bY = ImmutableList.of(bzz.c, bzz.f, bzz.v, bzz.s, bzz.w);
   protected static final ImmutableList<bys<?>> ca = ImmutableList.of(
      bys.n, bys.g, bys.h, bys.m, bys.E, bys.t, bys.r, bys.S, bys.T, bys.o, bys.O, bys.P, new bys[]{bys.R, bys.x, bys.y, bys.B, bys.X, bys.Y, bys.Z, bys.aa}
   );
   private static final aim<cbp> cg = aiq.a(ccw.class, aio.x);
   private static final aim<OptionalInt> ch = aiq.a(ccw.class, aio.u);
   private static final int ci = 5;
   public static final String cb = "variant";
   public final bot cc = new bot();
   public final bot cd = new bot();
   public final bot ce = new bot();
   public final bot cf = new bot();

   public ccw(bpd<? extends cbe> $$0, cxb $$1) {
      super($$0, $$1);
      this.bN = new ccw.a(this);
      this.a(ejg.j, 4.0F);
      this.a(ejg.e, -1.0F);
      this.bO = new bvr(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected bqq.b<ccw> dQ() {
      return bqq.a(ca, bY);
   }

   @Override
   protected bqq<?> a(Dynamic<?> $$0) {
      return ccx.a(this.dQ().a($$0));
   }

   @Override
   public bqq<ccw> dP() {
      return (bqq<ccw>)super.dP();
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(cg, cbp.a);
      $$0.a(ch, OptionalInt.empty());
   }

   @Override
   public void r() {
      this.an.a(ch, OptionalInt.empty());
   }

   public Optional<box> s() {
      return this.an.a(ch).stream().mapToObj(this.dM()::a).filter(Objects::nonNull).findFirst();
   }

   @Override
   public void b(box $$0) {
      this.an.a(ch, OptionalInt.of($$0.aj()));
   }

   @Override
   public int fN() {
      return 35;
   }

   @Override
   public int aa() {
      return 5;
   }

   public cbp y() {
      return this.an.a(cg);
   }

   public void a(cbp $$0) {
      this.an.a(cg, $$0);
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("variant", ki.al.b(this.y()).toString());
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      cbp $$1 = ki.al.a(ajh.a($$0.l("variant")));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   @Override
   protected void Y() {
      this.dM().ae().a("frogBrain");
      this.dP().a((apf)this.dM(), this);
      this.dM().ae().c();
      this.dM().ae().a("frogActivityUpdate");
      ccx.a(this);
      this.dM().ae().c();
      super.Y();
   }

   @Override
   public void l() {
      if (this.dM().x_()) {
         this.cf.a(this.bf() && !this.aT.c(), this.ah);
      }

      super.l();
   }

   @Override
   public void a(aim<?> $$0) {
      if (as.equals($$0)) {
         bqa $$1 = this.ap();
         if ($$1 == bqa.g) {
            this.cc.a(this.ah);
         } else {
            this.cc.a();
         }

         if ($$1 == bqa.i) {
            this.cd.a(this.ah);
         } else {
            this.cd.a();
         }

         if ($$1 == bqa.j) {
            this.ce.a(this.ah);
         } else {
            this.ce.a();
         }
      }

      super.a($$0);
   }

   @Override
   protected void x(float $$0) {
      float $$1;
      if (this.cc.c()) {
         $$1 = 0.0F;
      } else {
         $$1 = Math.min($$0 * 25.0F, 1.0F);
      }

      this.aT.a($$1, 0.4F);
   }

   @Nullable
   @Override
   public bos a(apf $$0, bos $$1) {
      ccw $$2 = bpd.S.a((cxb)$$0);
      if ($$2 != null) {
         ccx.a($$2, $$0.E_());
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
   public void a(apf $$0, cbe $$1) {
      this.a($$0, $$1, null);
      this.dP().a(bys.Y, axy.a);
   }

   @Override
   public bqh a(cxq $$0, bnb $$1, bpt $$2, @Nullable bqh $$3) {
      il<cya> $$4 = $$0.t(this.dm());
      if ($$4.a(aum.ai)) {
         this.a(cbp.c);
      } else if ($$4.a(aum.aj)) {
         this.a(cbp.b);
      } else {
         this.a(cbp.a);
      }

      ccx.a(this, $$0.E_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static bqv.a gn() {
      return bpr.A().a(bqw.r, 1.0).a(bqw.q, 10.0).a(bqw.c, 10.0).a(bqw.v, 1.0);
   }

   @Nullable
   @Override
   protected atx v() {
      return aty.jE;
   }

   @Nullable
   @Override
   protected atx d(bnw $$0) {
      return aty.jH;
   }

   @Nullable
   @Override
   protected atx n_() {
      return aty.jF;
   }

   @Override
   protected void b(ib $$0, dnb $$1) {
      this.a(aty.jK, 0.15F, 1.0F);
   }

   @Override
   public boolean cz() {
      return false;
   }

   @Override
   protected void X() {
      super.X();
      aew.a(this);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 5;
   }

   @Override
   public void a(ept $$0) {
      if (this.cX() && this.bc()) {
         this.a(this.fk(), $$0);
         this.a(bpu.a, this.dp());
         this.g(this.dp().a(0.9));
      } else {
         super.a($$0);
      }
   }

   public static boolean j(bpp $$0) {
      if ($$0 instanceof cgj $$1 && $$1.go() != 1) {
         return false;
      }

      return $$0.ai().a(auq.n);
   }

   @Override
   protected bza b(cxb $$0) {
      return new ccw.c(this, $$0);
   }

   @Override
   public boolean o(cqm $$0) {
      return bX.a($$0);
   }

   public static boolean c(bpd<? extends cbe> $$0, cxc $$1, bpt $$2, ib $$3, axd $$4) {
      return $$1.a_($$3.d()).a(aun.ca) && a($$1, $$3);
   }

   class a extends bvo {
      a(bpr $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return ccw.this.s().isEmpty();
      }
   }

   static class b extends eiy {
      private final ib.a l = new ib.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public ejb a() {
         return !this.b.bc() ? super.a() : this.c(new ib(aww.a(this.b.cH().a), aww.a(this.b.cH().b), aww.a(this.b.cH().c)));
      }

      @Override
      public ejg a(cwh $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         dnb $$4 = $$0.a_(this.l);
         return $$4.a(aun.bL) ? ejg.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends byx {
      c(ccw $$0, cxb $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(ejg $$0) {
         return $$0 != ejg.k && super.b($$0);
      }

      @Override
      protected ejf a(int $$0) {
         this.o = new ccw.b(true);
         this.o.a(true);
         return new ejf(this.o, $$0);
      }
   }
}
