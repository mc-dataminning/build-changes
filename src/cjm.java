import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cjm extends chp implements bwy<jr<cia>> {
   protected static final ImmutableList<cgj<? extends cgi<? super cjm>>> bF = ImmutableList.of(cgj.c, cgj.f, cgj.v, cgj.s, cgj.w);
   protected static final ImmutableList<cfc<?>> bG = ImmutableList.of(
      cfc.n, cfc.g, cfc.h, cfc.m, cfc.E, cfc.t, cfc.r, cfc.S, cfc.T, cfc.o, cfc.O, cfc.P, new cfc[]{cfc.R, cfc.x, cfc.y, cfc.B, cfc.X, cfc.Y, cfc.Z, cfc.aa}
   );
   private static final ajx<jr<cia>> bN = akb.a(cjm.class, ajz.z);
   private static final ajx<OptionalInt> bO = akb.a(cjm.class, ajz.v);
   private static final int bP = 5;
   public static final String bH = "variant";
   private static final akt<cia> bQ = cia.b;
   public final bur bJ = new bur();
   public final bur bK = new bur();
   public final bur bL = new bur();
   public final bur bM = new bur();

   public cjm(bvi<? extends chp> $$0, dgz $$1) {
      super($$0, $$1);
      this.by = new cjm.a(this);
      this.a(eun.j, 4.0F);
      this.a(eun.e, -1.0F);
      this.bz = new ccb(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected bxa.b<cjm> eb() {
      return bxa.a(bG, bF);
   }

   @Override
   protected bxa<?> a(Dynamic<?> $$0) {
      return cjn.a(this.eb().a($$0));
   }

   @Override
   public bxa<cjm> ea() {
      return (bxa<cjm>)super.ea();
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bN, mb.aj.b(bQ));
      $$0.a(bO, OptionalInt.empty());
   }

   @Override
   public void q() {
      this.al.a(bO, OptionalInt.empty());
   }

   public Optional<bva> t() {
      return this.al.a(bO).stream().mapToObj(this.dU()::a).filter(Objects::nonNull).findFirst();
   }

   public void b(bva $$0) {
      this.al.a(bO, OptionalInt.of($$0.ar()));
   }

   @Override
   public int ag() {
      return 35;
   }

   @Override
   public int ad() {
      return 5;
   }

   public jr<cia> x() {
      return this.al.a(bN);
   }

   public void j(jr<cia> $$0) {
      this.al.a(bN, $$0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("variant", this.x().e().orElse(bQ).a().toString());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      Optional.ofNullable(aku.c($$0.l("variant"))).map($$0x -> akt.a(mc.F, $$0x)).flatMap(mb.aj::a).ifPresent(this::j);
   }

   @Override
   protected void a(ard $$0) {
      bpj $$1 = bpi.a();
      $$1.a("frogBrain");
      this.ea().a($$0, this);
      $$1.c();
      $$1.a("frogActivityUpdate");
      cjn.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public void h() {
      if (this.dU().w_()) {
         this.bM.a(this.bj() && !this.aT.d(), this.af);
      }

      super.h();
   }

   @Override
   public void a(ajx<?> $$0) {
      if (aq.equals($$0)) {
         bwk $$1 = this.aw();
         if ($$1 == bwk.g) {
            this.bJ.a(this.af);
         } else {
            this.bJ.a();
         }

         if ($$1 == bwk.i) {
            this.bK.a(this.af);
         } else {
            this.bK.a();
         }

         if ($$1 == bwk.j) {
            this.bL.a(this.af);
         } else {
            this.bL.a();
         }
      }

      super.a($$0);
   }

   @Override
   protected void B(float $$0) {
      float $$1;
      if (this.bJ.b()) {
         $$1 = 0.0F;
      } else {
         $$1 = Math.min($$0 * 25.0F, 1.0F);
      }

      this.aT.a($$1, 0.4F, this.n_() ? 3.0F : 1.0F);
   }

   @Override
   public void gy() {
      this.dU().a(null, this, awa.kn, awb.g, 2.0F, 1.0F);
   }

   @Nullable
   @Override
   public buq a(ard $$0, buq $$1) {
      cjm $$2 = bvi.ab.a($$0, bvh.e);
      if ($$2 != null) {
         cjn.a($$2, $$0.C_());
      }

      return $$2;
   }

   @Override
   public boolean n_() {
      return false;
   }

   @Override
   public void a(boolean $$0) {
   }

   @Override
   public void a(ard $$0, chp $$1) {
      this.a($$0, $$1, null);
      this.ea().a(cfc.Y, baf.a);
   }

   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      jr<dic> $$4 = $$0.t(this.du());
      if ($$4.a(awo.ai)) {
         this.j(mb.aj.b(cia.d));
      } else if ($$4.a(awo.aj)) {
         this.j(mb.aj.b(cia.c));
      } else {
         this.j(mb.aj.b(bQ));
      }

      cjn.a(this, $$0.C_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static bxf.a gs() {
      return chp.gx().a(bxg.v, 1.0).a(bxg.s, 10.0).a(bxg.c, 10.0).a(bxg.B, 1.0);
   }

   @Nullable
   @Override
   protected avz u() {
      return awa.kl;
   }

   @Nullable
   @Override
   protected avz e(btp $$0) {
      return awa.ko;
   }

   @Nullable
   @Override
   protected avz l_() {
      return awa.km;
   }

   @Override
   protected void b(ji $$0, dxq $$1) {
      this.a(awa.kr, 0.15F, 1.0F);
   }

   @Override
   public boolean cI() {
      return false;
   }

   @Override
   protected void ab() {
      super.ab();
      agc.a(this);
   }

   @Override
   protected int f(float $$0, float $$1) {
      return super.f($$0, $$1) - 5;
   }

   @Override
   public void a_(fbx $$0) {
      if (this.bj()) {
         this.a(this.fq(), $$0);
         this.a(bwc.a, this.dx());
         this.i(this.dx().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   public static boolean j(bvy $$0) {
      if ($$0 instanceof cnb $$1 && $$1.gq() != 1) {
         return false;
      }

      return $$0.aq().a(awt.n);
   }

   @Override
   protected cfk b(dgz $$0) {
      return new cjm.c(this, $$0);
   }

   @Nullable
   @Override
   public bvy f() {
      return this.Q();
   }

   @Override
   public boolean j(cxh $$0) {
      return $$0.a(awy.ao);
   }

   public static boolean c(bvi<? extends chp> $$0, dha $$1, bvh $$2, ji $$3, azh $$4) {
      return $$1.a_($$3.e()).a(awp.cj) && a($$1, $$3);
   }

   class a extends cby {
      a(final bwa $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return cjm.this.t().isEmpty();
      }
   }

   static class b extends euf {
      private final ji.a a = new ji.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public eui a() {
         return !this.c.bj() ? super.a() : this.c(new ji(ayz.a(this.c.cQ().a), ayz.a(this.c.cQ().b), ayz.a(this.c.cQ().c)));
      }

      @Override
      public eun a(eup $$0, int $$1, int $$2, int $$3) {
         this.a.d($$1, $$2 - 1, $$3);
         dxq $$4 = $$0.a(this.a);
         return $$4.a(awp.bU) ? eun.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends cfh {
      c(cjm $$0, dgz $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(eun $$0) {
         return $$0 != eun.k && super.b($$0);
      }

      @Override
      protected eum a(int $$0) {
         this.o = new cjm.b(true);
         return new eum(this.o, $$0);
      }
   }
}
