import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cit extends cgz implements bwi<jr<chk>> {
   protected static final ImmutableList<cft<? extends cfs<? super cit>>> bY = ImmutableList.of(cft.c, cft.f, cft.v, cft.s, cft.w);
   protected static final ImmutableList<cem<?>> bZ = ImmutableList.of(
      cem.n, cem.g, cem.h, cem.m, cem.E, cem.t, cem.r, cem.S, cem.T, cem.o, cem.O, cem.P, new cem[]{cem.R, cem.x, cem.y, cem.B, cem.X, cem.Y, cem.Z, cem.aa}
   );
   private static final ajy<jr<chk>> cg = akc.a(cit.class, aka.z);
   private static final ajy<OptionalInt> ch = akc.a(cit.class, aka.v);
   private static final int ci = 5;
   public static final String ca = "variant";
   private static final aku<chk> cj = chk.b;
   public final bue cc = new bue();
   public final bue cd = new bue();
   public final bue ce = new bue();
   public final bue cf = new bue();

   public cit(but<? extends cgz> $$0, dgj $$1) {
      super($$0, $$1);
      this.bO = new cit.a(this);
      this.a(etr.j, 4.0F);
      this.a(etr.e, -1.0F);
      this.bP = new cbl(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected bwk.b<cit> ec() {
      return bwk.a(bZ, bY);
   }

   @Override
   protected bwk<?> a(Dynamic<?> $$0) {
      return ciu.a(this.ec().a($$0));
   }

   @Override
   public bwk<cit> eb() {
      return (bwk<cit>)super.eb();
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(cg, mb.aj.b(cj));
      $$0.a(ch, OptionalInt.empty());
   }

   public void p() {
      this.al.a(ch, OptionalInt.empty());
   }

   public Optional<bum> t() {
      return this.al.a(ch).stream().mapToObj(this.dV()::a).filter(Objects::nonNull).findFirst();
   }

   public void b(bum $$0) {
      this.al.a(ch, OptionalInt.of($$0.ar()));
   }

   @Override
   public int ai() {
      return 35;
   }

   @Override
   public int af() {
      return 5;
   }

   public jr<chk> x() {
      return this.al.a(cg);
   }

   public void j(jr<chk> $$0) {
      this.al.a(cg, $$0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("variant", this.x().e().orElse(cj).a().toString());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      Optional.ofNullable(akv.c($$0.l("variant"))).map($$0x -> aku.a(mc.F, $$0x)).flatMap(mb.aj::a).ifPresent(this::j);
   }

   @Override
   protected void a(ard $$0) {
      bou $$1 = bot.a();
      $$1.a("frogBrain");
      this.eb().a($$0, this);
      $$1.c();
      $$1.a("frogActivityUpdate");
      ciu.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public void h() {
      if (this.dV().B_()) {
         this.cf.a(this.bm() && !this.aT.d(), this.af);
      }

      super.h();
   }

   @Override
   public void a(ajy<?> $$0) {
      if (aq.equals($$0)) {
         bvu $$1 = this.aw();
         if ($$1 == bvu.g) {
            this.cc.a(this.af);
         } else {
            this.cc.a();
         }

         if ($$1 == bvu.i) {
            this.cd.a(this.af);
         } else {
            this.cd.a();
         }

         if ($$1 == bvu.j) {
            this.ce.a(this.af);
         } else {
            this.ce.a();
         }
      }

      super.a($$0);
   }

   @Override
   protected void B(float $$0) {
      float $$1;
      if (this.cc.b()) {
         $$1 = 0.0F;
      } else {
         $$1 = Math.min($$0 * 25.0F, 1.0F);
      }

      this.aT.a($$1, 0.4F, this.e_() ? 3.0F : 1.0F);
   }

   @Override
   public void gy() {
      this.dV().a(null, this, awa.kn, awb.g, 2.0F, 1.0F);
   }

   @Nullable
   @Override
   public bud a(ard $$0, bud $$1) {
      cit $$2 = but.ab.a($$0, bus.e);
      if ($$2 != null) {
         ciu.a($$2, $$0.H_());
      }

      return $$2;
   }

   @Override
   public boolean e_() {
      return false;
   }

   @Override
   public void a(boolean $$0) {
   }

   @Override
   public void a(ard $$0, cgz $$1) {
      this.a($$0, $$1, null);
      this.eb().a(cem.Y, baf.a);
   }

   @Override
   public bwb a(dha $$0, bsj $$1, bus $$2, @Nullable bwb $$3) {
      jr<dhl> $$4 = $$0.t(this.dv());
      if ($$4.a(awo.ai)) {
         this.j(mb.aj.b(chk.d));
      } else if ($$4.a(awo.aj)) {
         this.j(mb.aj.b(chk.c));
      } else {
         this.j(mb.aj.b(cj));
      }

      ciu.a(this, $$0.H_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static bwp.a gs() {
      return cgz.gx().a(bwq.v, 1.0).a(bwq.s, 10.0).a(bwq.c, 10.0).a(bwq.B, 1.0);
   }

   @Nullable
   @Override
   protected avz u() {
      return awa.kl;
   }

   @Nullable
   @Override
   protected avz e(btc $$0) {
      return awa.ko;
   }

   @Nullable
   @Override
   protected avz o_() {
      return awa.km;
   }

   @Override
   protected void b(ji $$0, dwy $$1) {
      this.a(awa.kr, 0.15F, 1.0F);
   }

   @Override
   public boolean cJ() {
      return false;
   }

   @Override
   protected void ac() {
      super.ac();
      agd.a(this);
   }

   @Override
   protected int f(float $$0, float $$1) {
      return super.f($$0, $$1) - 5;
   }

   @Override
   public void a_(fbb $$0) {
      if (this.dh() && this.bj()) {
         this.a(this.fp(), $$0);
         this.a(bvm.a, this.dy());
         this.i(this.dy().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   public static boolean j(bvi $$0) {
      if ($$0 instanceof cmi $$1 && $$1.gs() != 1) {
         return false;
      }

      return $$0.aq().a(awt.n);
   }

   @Override
   protected ceu b(dgj $$0) {
      return new cit.c(this, $$0);
   }

   @Nullable
   @Override
   public bvi O_() {
      return this.R();
   }

   @Override
   public boolean j(cwq $$0) {
      return $$0.a(awy.ao);
   }

   public static boolean c(but<? extends cgz> $$0, dgk $$1, bus $$2, ji $$3, azh $$4) {
      return $$1.a_($$3.e()).a(awp.ci) && a($$1, $$3);
   }

   class a extends cbi {
      a(final bvk $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return cit.this.t().isEmpty();
      }
   }

   static class b extends etj {
      private final ji.a a = new ji.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public etm a() {
         return !this.c.bj() ? super.a() : this.c(new ji(ayz.a(this.c.cR().a), ayz.a(this.c.cR().b), ayz.a(this.c.cR().c)));
      }

      @Override
      public etr a(ett $$0, int $$1, int $$2, int $$3) {
         this.a.d($$1, $$2 - 1, $$3);
         dwy $$4 = $$0.a(this.a);
         return $$4.a(awp.bT) ? etr.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends cer {
      c(cit $$0, dgj $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(etr $$0) {
         return $$0 != etr.k && super.b($$0);
      }

      @Override
      protected etq a(int $$0) {
         this.o = new cit.b(true);
         return new etq(this.o, $$0);
      }
   }
}
