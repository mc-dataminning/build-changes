import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class ckj extends cjr implements cjj, ckx {
   private static final ajp<Boolean> d = ajt.a(ckj.class, ajr.k);
   private static final int e = 40;
   private static final int ca = 1;
   private static final float cb = 0.6F;
   private static final int cc = 6;
   private static final float cd = 0.5F;
   private static final int ce = 40;
   private static final int cf = 15;
   private static final int cg = 200;
   private static final float ch = 0.3F;
   private static final float ci = 0.4F;
   private int cj;
   protected static final ImmutableList<? extends cdn<? extends cdm<? super ckj>>> b = ImmutableList.of(cdn.c, cdn.d);
   protected static final ImmutableList<? extends ccg<?>> c = ImmutableList.of(ccg.g, ccg.h, ccg.k, ccg.l, ccg.n, ccg.m, ccg.E, ccg.t, ccg.o, ccg.p);

   public ckj(bsn<? extends ckj> $$0, dcg $$1) {
      super($$0, $$1);
      this.bP = 5;
   }

   @Override
   protected bue.b<ckj> dW() {
      return bue.a(c, b);
   }

   @Override
   protected bue<?> a(Dynamic<?> $$0) {
      bue<ckj> $$1 = this.dW().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(coa.a));
      $$1.b(coa.b);
      $$1.f();
      return $$1;
   }

   private static void a(bue<ckj> $$0) {
      $$0.a(coa.a, 0, ImmutableList.of(new bwb(45, 90), new bwf()));
   }

   private static void b(bue<ckj> $$0) {
      $$0.a(
         coa.b,
         10,
         ImmutableList.of(
            bxh.a(ckj::gp),
            bwv.a(8.0F, bps.a(30, 60)),
            new bws(ImmutableList.of(Pair.of(bwn.a(0.4F), 2), Pair.of(bxc.a(0.4F, 3), 2), Pair.of(new bvf(30, 60), 1)))
         )
      );
   }

   private static void c(bue<ckj> $$0) {
      $$0.a(coa.k, 10, ImmutableList.of(bxa.a(1.0F), byi.a(ckj::t, bwc.a(40)), byi.a(ckj::o_, bwc.a(15)), bxk.a()), ccg.o);
   }

   private Optional<? extends btc> gp() {
      return this.dV().c(ccg.h).orElse(cci.a()).a(this::j);
   }

   private boolean j(btc $$0) {
      bsn<?> $$1 = $$0.am();
      return $$1 != bsn.bt && $$1 != bsn.x && cdm.c(this, $$0);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   @Override
   public void a(ajp<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.i_();
      }
   }

   public static buj.a s() {
      return cjr.gt().a(buk.s, 40.0).a(buk.v, 0.3F).a(buk.p, 0.6F).a(buk.d, 1.0).a(buk.c, 6.0);
   }

   public boolean t() {
      return !this.o_();
   }

   @Override
   public boolean D(bsh $$0) {
      if (!($$0 instanceof btc)) {
         return false;
      } else {
         this.cj = 10;
         this.dR().a(this, (byte)4);
         this.b(avh.Do);
         return ckx.a(this, (btc)$$0);
      }
   }

   @Override
   public boolean a(cml $$0) {
      return !this.fZ();
   }

   @Override
   protected void e(btc $$0) {
      if (!this.o_()) {
         ckx.b(this, $$0);
      }
   }

   @Override
   public boolean a(bra $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dR().B) {
         return false;
      } else if ($$2 && $$0.d() instanceof btc) {
         btc $$3 = (btc)$$0.d();
         if (this.c($$3) && !bux.a(this, $$3, 4.0)) {
            this.k($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void k(btc $$0) {
      this.bG.b(ccg.E);
      this.bG.a(ccg.o, $$0, 200L);
   }

   @Override
   public bue<ckj> dV() {
      return (bue<ckj>)super.dV();
   }

   protected void x() {
      coa $$0 = this.bG.g().orElse(null);
      this.bG.a(ImmutableList.of(coa.k, coa.b));
      coa $$1 = this.bG.g().orElse(null);
      if ($$1 == coa.k && $$0 != coa.k) {
         this.go();
      }

      this.v(this.bG.a(ccg.o));
   }

   @Override
   protected void Z() {
      this.dR().ag().a("zoglinBrain");
      this.dV().a((aqm)this.dR(), this);
      this.dR().ag().c();
      this.x();
   }

   @Override
   public void a(boolean $$0) {
      this.ar().a(d, $$0);
      if (!this.dR().B && $$0) {
         this.f(buk.c).a(0.5);
      }
   }

   @Override
   public boolean o_() {
      return this.ar().a(d);
   }

   @Override
   public void m_() {
      if (this.cj > 0) {
         this.cj--;
      }

      super.m_();
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cj = 10;
         this.b(avh.Do);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gn() {
      return this.cj;
   }

   @Override
   protected avg v() {
      if (this.dR().B) {
         return null;
      } else {
         return this.bG.a(ccg.o) ? avh.Dn : avh.Dm;
      }
   }

   @Override
   protected avg d(bra $$0) {
      return avh.Dq;
   }

   @Override
   protected avg n_() {
      return avh.Dp;
   }

   @Override
   protected void b(ja $$0, dsl $$1) {
      this.a(avh.Dr, 0.15F, 1.0F);
   }

   protected void go() {
      this.b(avh.Dn);
   }

   @Nullable
   @Override
   public btc p() {
      return this.N();
   }

   @Override
   protected void Y() {
      super.Y();
      afy.a(this);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      if (this.o_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
