import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cir extends cgx implements bwg<jr<chi>> {
   protected static final ImmutableList<cfr<? extends cfq<? super cir>>> bY = ImmutableList.of(cfr.c, cfr.f, cfr.v, cfr.s, cfr.w);
   protected static final ImmutableList<cek<?>> bZ = ImmutableList.of(
      cek.n, cek.g, cek.h, cek.m, cek.E, cek.t, cek.r, cek.S, cek.T, cek.o, cek.O, cek.P, new cek[]{cek.R, cek.x, cek.y, cek.B, cek.X, cek.Y, cek.Z, cek.aa}
   );
   private static final ajy<jr<chi>> cg = akc.a(cir.class, aka.z);
   private static final ajy<OptionalInt> ch = akc.a(cir.class, aka.v);
   private static final int ci = 5;
   public static final String ca = "variant";
   private static final aku<chi> cj = chi.b;
   public final buc cc = new buc();
   public final buc cd = new buc();
   public final buc ce = new buc();
   public final buc cf = new buc();

   public cir(bur<? extends cgx> $$0, dgh $$1) {
      super($$0, $$1);
      this.bO = new cir.a(this);
      this.a(etp.j, 4.0F);
      this.a(etp.e, -1.0F);
      this.bP = new cbj(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected bwi.b<cir> ec() {
      return bwi.a(bZ, bY);
   }

   @Override
   protected bwi<?> a(Dynamic<?> $$0) {
      return cis.a(this.ec().a($$0));
   }

   @Override
   public bwi<cir> eb() {
      return (bwi<cir>)super.eb();
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

   public Optional<buk> t() {
      return this.al.a(ch).stream().mapToObj(this.dV()::a).filter(Objects::nonNull).findFirst();
   }

   public void b(buk $$0) {
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

   public jr<chi> x() {
      return this.al.a(cg);
   }

   public void j(jr<chi> $$0) {
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
      bos $$1 = bor.a();
      $$1.a("frogBrain");
      this.eb().a($$0, this);
      $$1.c();
      $$1.a("frogActivityUpdate");
      cis.a(this);
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
         bvs $$1 = this.aw();
         if ($$1 == bvs.g) {
            this.cc.a(this.af);
         } else {
            this.cc.a();
         }

         if ($$1 == bvs.i) {
            this.cd.a(this.af);
         } else {
            this.cd.a();
         }

         if ($$1 == bvs.j) {
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
   public bub a(ard $$0, bub $$1) {
      cir $$2 = bur.ab.a($$0, buq.e);
      if ($$2 != null) {
         cis.a($$2, $$0.H_());
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
   public void a(ard $$0, cgx $$1) {
      this.a($$0, $$1, null);
      this.eb().a(cek.Y, baf.a);
   }

   @Override
   public bvz a(dgy $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      jr<dhj> $$4 = $$0.t(this.dv());
      if ($$4.a(awo.ai)) {
         this.j(mb.aj.b(chi.d));
      } else if ($$4.a(awo.aj)) {
         this.j(mb.aj.b(chi.c));
      } else {
         this.j(mb.aj.b(cj));
      }

      cis.a(this, $$0.H_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static bwn.a gs() {
      return cgx.gx().a(bwo.v, 1.0).a(bwo.s, 10.0).a(bwo.c, 10.0).a(bwo.B, 1.0);
   }

   @Nullable
   @Override
   protected avz u() {
      return awa.kl;
   }

   @Nullable
   @Override
   protected avz e(bta $$0) {
      return awa.ko;
   }

   @Nullable
   @Override
   protected avz o_() {
      return awa.km;
   }

   @Override
   protected void b(ji $$0, dww $$1) {
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
   public void a_(faz $$0) {
      if (this.dh() && this.bj()) {
         this.a(this.fp(), $$0);
         this.a(bvk.a, this.dy());
         this.i(this.dy().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   public static boolean j(bvg $$0) {
      if ($$0 instanceof cmg $$1 && $$1.gs() != 1) {
         return false;
      }

      return $$0.aq().a(awt.n);
   }

   @Override
   protected ces b(dgh $$0) {
      return new cir.c(this, $$0);
   }

   @Nullable
   @Override
   public bvg O_() {
      return this.R();
   }

   @Override
   public boolean j(cwo $$0) {
      return $$0.a(awy.ao);
   }

   public static boolean c(bur<? extends cgx> $$0, dgi $$1, buq $$2, ji $$3, azh $$4) {
      return $$1.a_($$3.e()).a(awp.ci) && a($$1, $$3);
   }

   class a extends cbg {
      a(final bvi $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return cir.this.t().isEmpty();
      }
   }

   static class b extends eth {
      private final ji.a a = new ji.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public etk a() {
         return !this.c.bj() ? super.a() : this.c(new ji(ayz.a(this.c.cR().a), ayz.a(this.c.cR().b), ayz.a(this.c.cR().c)));
      }

      @Override
      public etp a(etr $$0, int $$1, int $$2, int $$3) {
         this.a.d($$1, $$2 - 1, $$3);
         dww $$4 = $$0.a(this.a);
         return $$4.a(awp.bT) ? etp.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends cep {
      c(cir $$0, dgh $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(etp $$0) {
         return $$0 != etp.k && super.b($$0);
      }

      @Override
      protected eto a(int $$0) {
         this.o = new cir.b(true);
         return new eto(this.o, $$0);
      }
   }
}
