import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class ccv extends cbd implements bqn<cbo> {
   public static final ctk bX = ctk.a(cqn.qP);
   protected static final ImmutableList<bzy<? extends bzx<? super ccv>>> bY = ImmutableList.of(bzy.c, bzy.f, bzy.v, bzy.s, bzy.w);
   protected static final ImmutableList<byr<?>> ca = ImmutableList.of(
      byr.n, byr.g, byr.h, byr.m, byr.E, byr.t, byr.r, byr.S, byr.T, byr.o, byr.O, byr.P, new byr[]{byr.R, byr.x, byr.y, byr.B, byr.X, byr.Y, byr.Z, byr.aa}
   );
   private static final aim<cbo> cg = aiq.a(ccv.class, aio.x);
   private static final aim<OptionalInt> ch = aiq.a(ccv.class, aio.u);
   private static final int ci = 5;
   public static final String cb = "variant";
   public final bos cc = new bos();
   public final bos cd = new bos();
   public final bos ce = new bos();
   public final bos cf = new bos();

   public ccv(bpc<? extends cbd> $$0, cwz $$1) {
      super($$0, $$1);
      this.bN = new ccv.a(this);
      this.a(eiy.j, 4.0F);
      this.a(eiy.e, -1.0F);
      this.bO = new bvq(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected bqp.b<ccv> dQ() {
      return bqp.a(ca, bY);
   }

   @Override
   protected bqp<?> a(Dynamic<?> $$0) {
      return ccw.a(this.dQ().a($$0));
   }

   @Override
   public bqp<ccv> dP() {
      return (bqp<ccv>)super.dP();
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(cg, cbo.a);
      $$0.a(ch, OptionalInt.empty());
   }

   @Override
   public void r() {
      this.an.a(ch, OptionalInt.empty());
   }

   public Optional<bow> s() {
      return this.an.a(ch).stream().mapToObj(this.dM()::a).filter(Objects::nonNull).findFirst();
   }

   @Override
   public void b(bow $$0) {
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

   public cbo y() {
      return this.an.a(cg);
   }

   public void a(cbo $$0) {
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
      cbo $$1 = ki.al.a(ajh.a($$0.l("variant")));
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
      ccw.a(this);
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
         bpz $$1 = this.ap();
         if ($$1 == bpz.g) {
            this.cc.a(this.ah);
         } else {
            this.cc.a();
         }

         if ($$1 == bpz.i) {
            this.cd.a(this.ah);
         } else {
            this.cd.a();
         }

         if ($$1 == bpz.j) {
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
   public bor a(apf $$0, bor $$1) {
      ccv $$2 = bpc.R.a((cwz)$$0);
      if ($$2 != null) {
         ccw.a($$2, $$0.E_());
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
   public void a(apf $$0, cbd $$1) {
      this.a($$0, $$1, null);
      this.dP().a(byr.Y, axy.a);
   }

   @Override
   public bqg a(cxo $$0, bna $$1, bps $$2, @Nullable bqg $$3) {
      il<cxy> $$4 = $$0.t(this.dm());
      if ($$4.a(aum.ai)) {
         this.a(cbo.c);
      } else if ($$4.a(aum.aj)) {
         this.a(cbo.b);
      } else {
         this.a(cbo.a);
      }

      ccw.a(this, $$0.E_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static bqu.a gn() {
      return bpq.A().a(bqv.r, 1.0).a(bqv.q, 10.0).a(bqv.c, 10.0).a(bqv.v, 1.0);
   }

   @Nullable
   @Override
   protected atx v() {
      return aty.jA;
   }

   @Nullable
   @Override
   protected atx d(bnv $$0) {
      return aty.jD;
   }

   @Nullable
   @Override
   protected atx n_() {
      return aty.jB;
   }

   @Override
   protected void b(ib $$0, dmz $$1) {
      this.a(aty.jG, 0.15F, 1.0F);
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
   public void a(epr $$0) {
      if (this.cX() && this.bc()) {
         this.a(this.fk(), $$0);
         this.a(bpt.a, this.dp());
         this.g(this.dp().a(0.9));
      } else {
         super.a($$0);
      }
   }

   public static boolean j(bpo $$0) {
      if ($$0 instanceof cgh $$1 && $$1.go() != 1) {
         return false;
      }

      return $$0.ai().a(auq.n);
   }

   @Override
   protected byz b(cwz $$0) {
      return new ccv.c(this, $$0);
   }

   @Override
   public boolean o(cqk $$0) {
      return bX.a($$0);
   }

   public static boolean c(bpc<? extends cbd> $$0, cxa $$1, bps $$2, ib $$3, axd $$4) {
      return $$1.a_($$3.d()).a(aun.ca) && a($$1, $$3);
   }

   class a extends bvn {
      a(bpq $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return ccv.this.s().isEmpty();
      }
   }

   static class b extends eiw {
      private final ib.a l = new ib.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public eja a() {
         return !this.b.bc() ? super.a() : this.c(new ib(aww.a(this.b.cH().a), aww.a(this.b.cH().b), aww.a(this.b.cH().c)));
      }

      @Override
      public eiy a(cwf $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         dmz $$4 = $$0.a_(this.l);
         return $$4.a(aun.bL) ? eiy.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends byw {
      c(ccv $$0, cwz $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(eiy $$0) {
         return $$0 != eiy.k && super.b($$0);
      }

      @Override
      protected eje a(int $$0) {
         this.o = new ccv.b(true);
         this.o.a(true);
         return new eje(this.o, $$0);
      }
   }
}
