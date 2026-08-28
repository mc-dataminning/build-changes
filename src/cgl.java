import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cgl extends cer implements bub<jj<cfc>> {
   protected static final ImmutableList<cdm<? extends cdl<? super cgl>>> ca = ImmutableList.of(cdm.c, cdm.f, cdm.v, cdm.s, cdm.w);
   protected static final ImmutableList<ccf<?>> cb = ImmutableList.of(
      ccf.n, ccf.g, ccf.h, ccf.m, ccf.E, ccf.t, ccf.r, ccf.S, ccf.T, ccf.o, ccf.O, ccf.P, new ccf[]{ccf.R, ccf.x, ccf.y, ccf.B, ccf.X, ccf.Y, ccf.Z, ccf.aa}
   );
   private static final ajp<jj<cfc>> ci = ajt.a(cgl.class, ajr.z);
   private static final ajp<OptionalInt> cj = ajt.a(cgl.class, ajr.v);
   private static final int ck = 5;
   public static final String cd = "variant";
   private static final akj<cfc> cl = cfc.a;
   public final bsb ce = new bsb();
   public final bsb cf = new bsb();
   public final bsb cg = new bsb();
   public final bsb ch = new bsb();

   public cgl(bsm<? extends cer> $$0, dcf $$1) {
      super($$0, $$1);
      this.bQ = new cgl.a(this);
      this.a(eoy.j, 4.0F);
      this.a(eoy.e, -1.0F);
      this.bR = new bze(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected bud.b<cgl> dV() {
      return bud.a(cb, ca);
   }

   @Override
   protected bud<?> a(Dynamic<?> $$0) {
      return cgm.a(this.dV().a($$0));
   }

   @Override
   public bud<cgl> dU() {
      return (bud<cgl>)super.dU();
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

   public Optional<bsg> u() {
      return this.ao.a(cj).stream().mapToObj(this.dQ()::a).filter(Objects::nonNull).findFirst();
   }

   @Override
   public void b(bsg $$0) {
      this.ao.a(cj, OptionalInt.of($$0.am()));
   }

   @Override
   public int ae() {
      return 35;
   }

   @Override
   public int ab() {
      return 5;
   }

   public jj<cfc> y() {
      return this.ao.a(ci);
   }

   @Override
   public void i(jj<cfc> $$0) {
      this.ao.a(ci, $$0);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("variant", this.y().e().orElse(cl).a().toString());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      Optional.ofNullable(akk.a($$0.l("variant"))).map($$0x -> akj.a(lr.F, $$0x)).flatMap(lq.aj::b).ifPresent(this::i);
   }

   @Override
   protected void Z() {
      this.dQ().ag().a("frogBrain");
      this.dU().a((aqm)this.dQ(), this);
      this.dQ().ag().c();
      this.dQ().ag().a("frogActivityUpdate");
      cgm.a(this);
      this.dQ().ag().c();
      super.Z();
   }

   @Override
   public void l() {
      if (this.dQ().x_()) {
         this.ch.a(this.bi() && !this.aU.c(), this.ai);
      }

      super.l();
   }

   @Override
   public void a(ajp<?> $$0) {
      if (at.equals($$0)) {
         btn $$1 = this.as();
         if ($$1 == btn.g) {
            this.ce.a(this.ai);
         } else {
            this.ce.a();
         }

         if ($$1 == btn.i) {
            this.cf.a(this.ai);
         } else {
            this.cf.a();
         }

         if ($$1 == btn.j) {
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

      this.aU.a($$1, 0.4F);
   }

   @Nullable
   @Override
   public bsa a(aqm $$0, bsa $$1) {
      cgl $$2 = bsm.R.a((dcf)$$0);
      if ($$2 != null) {
         cgm.a($$2, $$0.E_());
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
   public void a(aqm $$0, cer $$1) {
      this.a($$0, $$1, null);
      this.dU().a(ccf.Y, azk.a);
   }

   @Override
   public btu a(dcu $$0, bqe $$1, btf $$2, @Nullable btu $$3) {
      jj<ddf> $$4 = $$0.t(this.dq());
      if ($$4.a(avv.ai)) {
         this.i(lq.aj.g(cfc.c));
      } else if ($$4.a(avv.aj)) {
         this.i(lq.aj.g(cfc.b));
      } else {
         this.i(lq.aj.g(cl));
      }

      cgm.a(this, $$0.E_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static bui.a go() {
      return btd.A().a(buj.v, 1.0).a(buj.s, 10.0).a(buj.c, 10.0).a(buj.B, 1.0);
   }

   @Nullable
   @Override
   protected avg v() {
      return avh.jL;
   }

   @Nullable
   @Override
   protected avg d(bqz $$0) {
      return avh.jO;
   }

   @Nullable
   @Override
   protected avg o_() {
      return avh.jM;
   }

   @Override
   protected void b(ja $$0, dsk $$1) {
      this.a(avh.jR, 0.15F, 1.0F);
   }

   @Override
   public boolean cD() {
      return false;
   }

   @Override
   protected void Y() {
      super.Y();
      afy.a(this);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 5;
   }

   @Override
   public void a(ewf $$0) {
      if (this.db() && this.bf()) {
         this.a(this.fk(), $$0);
         this.a(btg.a, this.dt());
         this.i(this.dt().a(0.9));
      } else {
         super.a($$0);
      }
   }

   public static boolean j(btb $$0) {
      if ($$0 instanceof cjz $$1 && $$1.gp() != 1) {
         return false;
      }

      return $$0.al().a(awa.n);
   }

   @Override
   protected ccn b(dcf $$0) {
      return new cgl.c(this, $$0);
   }

   @Nullable
   @Override
   public btb p() {
      return this.N();
   }

   @Override
   public boolean o(cuc $$0) {
      return $$0.a(awf.al);
   }

   public static boolean c(bsm<? extends cer> $$0, dcg $$1, btf $$2, ja $$3, ayo $$4) {
      return $$1.a_($$3.d()).a(avw.cg) && a($$1, $$3);
   }

   class a extends bzb {
      a(final btd $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return cgl.this.u().isEmpty();
      }
   }

   static class b extends eoq {
      private final ja.a l = new ja.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public eot a() {
         return !this.b.bf() ? super.a() : this.c(new ja(ayg.a(this.b.cL().a), ayg.a(this.b.cL().b), ayg.a(this.b.cL().c)));
      }

      @Override
      public eoy a(epa $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         dsk $$4 = $$0.a(this.l);
         return $$4.a(avw.bR) ? eoy.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends cck {
      c(cgl $$0, dcf $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(eoy $$0) {
         return $$0 != eoy.k && super.b($$0);
      }

      @Override
      protected eox a(int $$0) {
         this.o = new cgl.b(true);
         this.o.a(true);
         return new eox(this.o, $$0);
      }
   }
}
