import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cdv extends ccd implements brn<cco> {
   public static final cvg bX = cvg.a(crm.qP);
   protected static final ImmutableList<cay<? extends cax<? super cdv>>> bY = ImmutableList.of(cay.c, cay.f, cay.v, cay.s, cay.w);
   protected static final ImmutableList<bzr<?>> ca = ImmutableList.of(
      bzr.n, bzr.g, bzr.h, bzr.m, bzr.E, bzr.t, bzr.r, bzr.S, bzr.T, bzr.o, bzr.O, bzr.P, new bzr[]{bzr.R, bzr.x, bzr.y, bzr.B, bzr.X, bzr.Y, bzr.Z, bzr.aa}
   );
   private static final aiy<cco> cg = ajc.a(cdv.class, aja.x);
   private static final aiy<OptionalInt> ch = ajc.a(cdv.class, aja.u);
   private static final int ci = 5;
   public static final String cb = "variant";
   public final bpq cc = new bpq();
   public final bpq cd = new bpq();
   public final bpq ce = new bpq();
   public final bpq cf = new bpq();

   public cdv(bqb<? extends ccd> $$0, cyx $$1) {
      super($$0, $$1);
      this.bN = new cdv.a(this);
      this.a(elj.j, 4.0F);
      this.a(elj.e, -1.0F);
      this.bO = new bwq(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected brp.b<cdv> dQ() {
      return brp.a(ca, bY);
   }

   @Override
   protected brp<?> a(Dynamic<?> $$0) {
      return cdw.a(this.dQ().a($$0));
   }

   @Override
   public brp<cdv> dP() {
      return (brp<cdv>)super.dP();
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(cg, cco.a);
      $$0.a(ch, OptionalInt.empty());
   }

   @Override
   public void r() {
      this.an.a(ch, OptionalInt.empty());
   }

   public Optional<bpv> u() {
      return this.an.a(ch).stream().mapToObj(this.dM()::a).filter(Objects::nonNull).findFirst();
   }

   @Override
   public void b(bpv $$0) {
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

   public cco y() {
      return this.an.a(cg);
   }

   public void a(cco $$0) {
      this.an.a(cg, $$0);
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      $$0.a("variant", kr.al.b(this.y()).toString());
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      cco $$1 = kr.al.a(ajt.a($$0.l("variant")));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   @Override
   protected void Y() {
      this.dM().af().a("frogBrain");
      this.dP().a((aps)this.dM(), this);
      this.dM().af().c();
      this.dM().af().a("frogActivityUpdate");
      cdw.a(this);
      this.dM().af().c();
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
   public void a(aiy<?> $$0) {
      if (as.equals($$0)) {
         bqz $$1 = this.ap();
         if ($$1 == bqz.g) {
            this.cc.a(this.ah);
         } else {
            this.cc.a();
         }

         if ($$1 == bqz.i) {
            this.cd.a(this.ah);
         } else {
            this.cd.a();
         }

         if ($$1 == bqz.j) {
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
   public bpp a(aps $$0, bpp $$1) {
      cdv $$2 = bqb.R.a((cyx)$$0);
      if ($$2 != null) {
         cdw.a($$2, $$0.E_());
      }

      return $$2;
   }

   @Override
   public boolean p_() {
      return false;
   }

   @Override
   public void a(boolean $$0) {
   }

   @Override
   public void a(aps $$0, ccd $$1) {
      this.a($$0, $$1, null);
      this.dP().a(bzr.Y, aym.a);
   }

   @Override
   public brg a(czm $$0, bny $$1, bqs $$2, @Nullable brg $$3) {
      il<czw> $$4 = $$0.t(this.dm());
      if ($$4.a(avb.ai)) {
         this.a(cco.c);
      } else if ($$4.a(avb.aj)) {
         this.a(cco.b);
      } else {
         this.a(cco.a);
      }

      cdw.a(this, $$0.E_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static bru.a gn() {
      return bqq.A().a(brv.r, 1.0).a(brv.q, 10.0).a(brv.c, 10.0).a(brv.v, 1.0);
   }

   @Nullable
   @Override
   protected aul v() {
      return aum.jG;
   }

   @Nullable
   @Override
   protected aul d(bot $$0) {
      return aum.jJ;
   }

   @Nullable
   @Override
   protected aul o_() {
      return aum.jH;
   }

   @Override
   protected void b(ib $$0, doz $$1) {
      this.a(aum.jM, 0.15F, 1.0F);
   }

   @Override
   public boolean cz() {
      return false;
   }

   @Override
   protected void X() {
      super.X();
      afi.a(this);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 5;
   }

   @Override
   public void a(esa $$0) {
      if (this.cX() && this.bc()) {
         this.a(this.fk(), $$0);
         this.a(bqt.a, this.dp());
         this.g(this.dp().a(0.9));
      } else {
         super.a($$0);
      }
   }

   public static boolean j(bqo $$0) {
      if ($$0 instanceof chi $$1 && $$1.go() != 1) {
         return false;
      }

      return $$0.ai().a(avf.n);
   }

   @Override
   protected bzz b(cyx $$0) {
      return new cdv.c(this, $$0);
   }

   @Override
   public boolean o(crj $$0) {
      return bX.a($$0);
   }

   public static boolean c(bqb<? extends ccd> $$0, cyy $$1, bqs $$2, ib $$3, axr $$4) {
      return $$1.a_($$3.d()).a(avc.ca) && a($$1, $$3);
   }

   class a extends bwn {
      a(bqq $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return cdv.this.u().isEmpty();
      }
   }

   static class b extends elb {
      private final ib.a l = new ib.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public ele a() {
         return !this.b.bc() ? super.a() : this.c(new ib(axk.a(this.b.cH().a), axk.a(this.b.cH().b), axk.a(this.b.cH().c)));
      }

      @Override
      public elj a(ell $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         doz $$4 = $$0.a(this.l);
         return $$4.a(avc.bL) ? elj.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends bzw {
      c(cdv $$0, cyx $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(elj $$0) {
         return $$0 != elj.k && super.b($$0);
      }

      @Override
      protected eli a(int $$0) {
         this.o = new cdv.b(true);
         this.o.a(true);
         return new eli(this.o, $$0);
      }
   }
}
