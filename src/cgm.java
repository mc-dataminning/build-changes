import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cgm extends ces implements buc<jj<cfd>> {
   protected static final ImmutableList<cdn<? extends cdm<? super cgm>>> ca = ImmutableList.of(cdn.c, cdn.f, cdn.v, cdn.s, cdn.w);
   protected static final ImmutableList<ccg<?>> cb = ImmutableList.of(
      ccg.n, ccg.g, ccg.h, ccg.m, ccg.E, ccg.t, ccg.r, ccg.S, ccg.T, ccg.o, ccg.O, ccg.P, new ccg[]{ccg.R, ccg.x, ccg.y, ccg.B, ccg.X, ccg.Y, ccg.Z, ccg.aa}
   );
   private static final ajp<jj<cfd>> ci = ajt.a(cgm.class, ajr.z);
   private static final ajp<OptionalInt> cj = ajt.a(cgm.class, ajr.v);
   private static final int ck = 5;
   public static final String cd = "variant";
   private static final akj<cfd> cl = cfd.b;
   public final bsc ce = new bsc();
   public final bsc cf = new bsc();
   public final bsc cg = new bsc();
   public final bsc ch = new bsc();

   public cgm(bsn<? extends ces> $$0, dcg $$1) {
      super($$0, $$1);
      this.bQ = new cgm.a(this);
      this.a(epa.j, 4.0F);
      this.a(epa.e, -1.0F);
      this.bR = new bzf(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected bue.b<cgm> dW() {
      return bue.a(cb, ca);
   }

   @Override
   protected bue<?> a(Dynamic<?> $$0) {
      return cgn.a(this.dW().a($$0));
   }

   @Override
   public bue<cgm> dV() {
      return (bue<cgm>)super.dV();
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(ci, lq.aj.g(cl));
      $$0.a(cj, OptionalInt.empty());
   }

   @Override
   public void s() {
      this.ao.a(cj, OptionalInt.empty());
   }

   public Optional<bsh> t() {
      return this.ao.a(cj).stream().mapToObj(this.dR()::a).filter(Objects::nonNull).findFirst();
   }

   @Override
   public void b(bsh $$0) {
      this.ao.a(cj, OptionalInt.of($$0.an()));
   }

   @Override
   public int ae() {
      return 35;
   }

   @Override
   public int ab() {
      return 5;
   }

   public jj<cfd> x() {
      return this.ao.a(ci);
   }

   @Override
   public void i(jj<cfd> $$0) {
      this.ao.a(ci, $$0);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("variant", this.x().e().orElse(cl).a().toString());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      Optional.ofNullable(akk.a($$0.l("variant"))).map($$0x -> akj.a(lr.F, $$0x)).flatMap(lq.aj::b).ifPresent(this::i);
   }

   @Override
   protected void Z() {
      this.dR().ag().a("frogBrain");
      this.dV().a((aqm)this.dR(), this);
      this.dR().ag().c();
      this.dR().ag().a("frogActivityUpdate");
      cgn.a(this);
      this.dR().ag().c();
      super.Z();
   }

   @Override
   public void l() {
      if (this.dR().x_()) {
         this.ch.a(this.bj() && !this.aV.c(), this.ai);
      }

      super.l();
   }

   @Override
   public void a(ajp<?> $$0) {
      if (at.equals($$0)) {
         bto $$1 = this.at();
         if ($$1 == bto.g) {
            this.ce.a(this.ai);
         } else {
            this.ce.a();
         }

         if ($$1 == bto.i) {
            this.cf.a(this.ai);
         } else {
            this.cf.a();
         }

         if ($$1 == bto.j) {
            this.cg.a(this.ai);
         } else {
            this.cg.a();
         }
      }

      super.a($$0);
   }

   @Override
   protected void y(float $$0) {
      float $$1;
      if (this.ce.c()) {
         $$1 = 0.0F;
      } else {
         $$1 = Math.min($$0 * 25.0F, 1.0F);
      }

      this.aV.a($$1, 0.4F);
   }

   @Nullable
   @Override
   public bsb a(aqm $$0, bsb $$1) {
      cgm $$2 = bsn.R.a((dcg)$$0);
      if ($$2 != null) {
         cgn.a($$2, $$0.E_());
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
   public void a(aqm $$0, ces $$1) {
      this.a($$0, $$1, null);
      this.dV().a(ccg.Y, azk.a);
   }

   @Override
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
      jj<ddg> $$4 = $$0.t(this.dr());
      if ($$4.a(avv.ai)) {
         this.i(lq.aj.g(cfd.d));
      } else if ($$4.a(avv.aj)) {
         this.i(lq.aj.g(cfd.c));
      } else {
         this.i(lq.aj.g(cl));
      }

      cgn.a(this, $$0.E_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static buj.a gn() {
      return bte.A().a(buk.v, 1.0).a(buk.s, 10.0).a(buk.c, 10.0).a(buk.B, 1.0);
   }

   @Nullable
   @Override
   protected avg v() {
      return avh.jL;
   }

   @Nullable
   @Override
   protected avg d(bra $$0) {
      return avh.jO;
   }

   @Nullable
   @Override
   protected avg n_() {
      return avh.jM;
   }

   @Override
   protected void b(ja $$0, dsl $$1) {
      this.a(avh.jR, 0.15F, 1.0F);
   }

   @Override
   public boolean cE() {
      return false;
   }

   @Override
   protected void Y() {
      super.Y();
      afy.a(this);
   }

   @Override
   protected int e(float $$0, float $$1) {
      return super.e($$0, $$1) - 5;
   }

   @Override
   public void a(ewh $$0) {
      if (this.dc() && this.bg()) {
         this.a(this.fl(), $$0);
         this.a(bth.a, this.du());
         this.j(this.du().a(0.9));
      } else {
         super.a($$0);
      }
   }

   public static boolean j(btc $$0) {
      if ($$0 instanceof cka $$1 && $$1.go() != 1) {
         return false;
      }

      return $$0.am().a(awa.n);
   }

   @Override
   protected cco b(dcg $$0) {
      return new cgm.c(this, $$0);
   }

   @Nullable
   @Override
   public btc p() {
      return this.N();
   }

   @Override
   public boolean o(cud $$0) {
      return $$0.a(awf.al);
   }

   public static boolean c(bsn<? extends ces> $$0, dch $$1, btg $$2, ja $$3, ayo $$4) {
      return $$1.a_($$3.d()).a(avw.cg) && a($$1, $$3);
   }

   class a extends bzc {
      a(final bte $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return cgm.this.t().isEmpty();
      }
   }

   static class b extends eos {
      private final ja.a l = new ja.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public eov a() {
         return !this.b.bg() ? super.a() : this.c(new ja(ayg.a(this.b.cM().a), ayg.a(this.b.cM().b), ayg.a(this.b.cM().c)));
      }

      @Override
      public epa a(epc $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         dsl $$4 = $$0.a(this.l);
         return $$4.a(avw.bR) ? epa.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends ccl {
      c(cgm $$0, dcg $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(epa $$0) {
         return $$0 != epa.k && super.b($$0);
      }

      @Override
      protected eoz a(int $$0) {
         this.o = new cgm.b(true);
         this.o.a(true);
         return new eoz(this.o, $$0);
      }
   }
}
