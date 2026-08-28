import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cis extends cgy implements bwh<jr<chj>> {
   protected static final ImmutableList<cfs<? extends cfr<? super cis>>> bY = ImmutableList.of(cfs.c, cfs.f, cfs.v, cfs.s, cfs.w);
   protected static final ImmutableList<cel<?>> bZ = ImmutableList.of(
      cel.n, cel.g, cel.h, cel.m, cel.E, cel.t, cel.r, cel.S, cel.T, cel.o, cel.O, cel.P, new cel[]{cel.R, cel.x, cel.y, cel.B, cel.X, cel.Y, cel.Z, cel.aa}
   );
   private static final ajy<jr<chj>> cg = akc.a(cis.class, aka.z);
   private static final ajy<OptionalInt> ch = akc.a(cis.class, aka.v);
   private static final int ci = 5;
   public static final String ca = "variant";
   private static final aku<chj> cj = chj.b;
   public final bud cc = new bud();
   public final bud cd = new bud();
   public final bud ce = new bud();
   public final bud cf = new bud();

   public cis(bus<? extends cgy> $$0, dgi $$1) {
      super($$0, $$1);
      this.bO = new cis.a(this);
      this.a(etq.j, 4.0F);
      this.a(etq.e, -1.0F);
      this.bP = new cbk(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected bwj.b<cis> ec() {
      return bwj.a(bZ, bY);
   }

   @Override
   protected bwj<?> a(Dynamic<?> $$0) {
      return cit.a(this.ec().a($$0));
   }

   @Override
   public bwj<cis> eb() {
      return (bwj<cis>)super.eb();
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

   public Optional<bul> t() {
      return this.al.a(ch).stream().mapToObj(this.dV()::a).filter(Objects::nonNull).findFirst();
   }

   public void b(bul $$0) {
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

   public jr<chj> x() {
      return this.al.a(cg);
   }

   public void j(jr<chj> $$0) {
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
      bot $$1 = bos.a();
      $$1.a("frogBrain");
      this.eb().a($$0, this);
      $$1.c();
      $$1.a("frogActivityUpdate");
      cit.a(this);
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
         bvt $$1 = this.aw();
         if ($$1 == bvt.g) {
            this.cc.a(this.af);
         } else {
            this.cc.a();
         }

         if ($$1 == bvt.i) {
            this.cd.a(this.af);
         } else {
            this.cd.a();
         }

         if ($$1 == bvt.j) {
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
   public buc a(ard $$0, buc $$1) {
      cis $$2 = bus.ab.a($$0, bur.e);
      if ($$2 != null) {
         cit.a($$2, $$0.H_());
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
   public void a(ard $$0, cgy $$1) {
      this.a($$0, $$1, null);
      this.eb().a(cel.Y, baf.a);
   }

   @Override
   public bwa a(dgz $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      jr<dhk> $$4 = $$0.t(this.dv());
      if ($$4.a(awo.ai)) {
         this.j(mb.aj.b(chj.d));
      } else if ($$4.a(awo.aj)) {
         this.j(mb.aj.b(chj.c));
      } else {
         this.j(mb.aj.b(cj));
      }

      cit.a(this, $$0.H_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static bwo.a gs() {
      return cgy.gx().a(bwp.v, 1.0).a(bwp.s, 10.0).a(bwp.c, 10.0).a(bwp.B, 1.0);
   }

   @Nullable
   @Override
   protected avz u() {
      return awa.kl;
   }

   @Nullable
   @Override
   protected avz e(btb $$0) {
      return awa.ko;
   }

   @Nullable
   @Override
   protected avz o_() {
      return awa.km;
   }

   @Override
   protected void b(ji $$0, dwx $$1) {
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
   public void a_(fba $$0) {
      if (this.dh() && this.bj()) {
         this.a(this.fp(), $$0);
         this.a(bvl.a, this.dy());
         this.i(this.dy().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   public static boolean j(bvh $$0) {
      if ($$0 instanceof cmh $$1 && $$1.gs() != 1) {
         return false;
      }

      return $$0.aq().a(awt.n);
   }

   @Override
   protected cet b(dgi $$0) {
      return new cis.c(this, $$0);
   }

   @Nullable
   @Override
   public bvh O_() {
      return this.R();
   }

   @Override
   public boolean j(cwp $$0) {
      return $$0.a(awy.ao);
   }

   public static boolean c(bus<? extends cgy> $$0, dgj $$1, bur $$2, ji $$3, azh $$4) {
      return $$1.a_($$3.e()).a(awp.ci) && a($$1, $$3);
   }

   class a extends cbh {
      a(final bvj $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return cis.this.t().isEmpty();
      }
   }

   static class b extends eti {
      private final ji.a a = new ji.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public etl a() {
         return !this.c.bj() ? super.a() : this.c(new ji(ayz.a(this.c.cR().a), ayz.a(this.c.cR().b), ayz.a(this.c.cR().c)));
      }

      @Override
      public etq a(ets $$0, int $$1, int $$2, int $$3) {
         this.a.d($$1, $$2 - 1, $$3);
         dwx $$4 = $$0.a(this.a);
         return $$4.a(awp.bT) ? etq.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends ceq {
      c(cis $$0, dgi $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(etq $$0) {
         return $$0 != etq.k && super.b($$0);
      }

      @Override
      protected etp a(int $$0) {
         this.o = new cis.b(true);
         return new etp(this.o, $$0);
      }
   }
}
