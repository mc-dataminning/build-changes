import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bus extends bui implements bjv<bus.v> {
   private static final adx<Integer> bX = aea.a(bus.class, adz.b);
   private static final adx<Byte> bY = aea.a(bus.class, adz.a);
   private static final int bZ = 1;
   public static final int bT = 4;
   public static final int bU = 8;
   public static final int bW = 16;
   private static final int ca = 32;
   private static final int cb = 64;
   private static final int cc = 128;
   private static final adx<Optional<UUID>> cd = aea.a(bus.class, adz.q);
   private static final adx<Optional<UUID>> ce = aea.a(bus.class, adz.q);
   static final Predicate<bye> cf = $$0 -> !$$0.r() && $$0.bv();
   private static final Predicate<big> cg = $$0 -> !($$0 instanceof biw $$1) ? false : $$1.eh() != null && $$1.ei() < $$1.ah + 600;
   static final Predicate<big> ch = $$0 -> $$0 instanceof bun || $$0 instanceof bvc;
   private static final Predicate<big> ci = $$0 -> !$$0.bU() && bij.e.test($$0);
   private static final int cj = 600;
   private bps ck;
   private bps cl;
   private bps cm;
   private float cn;
   private float co;
   float cp;
   float cq;
   private int cr;

   public bus(bik<? extends bus> $$0, cpk $$1) {
      super($$0, $$1);
      this.bK = new bus.k();
      this.bL = new bus.m();
      this.a(eam.p, 0.0F);
      this.a(eam.q, 0.0F);
      this.s(true);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(cd, Optional.empty());
      this.an.a(ce, Optional.empty());
      this.an.a(bX, 0);
      this.an.a(bY, (byte)0);
   }

   @Override
   protected void w() {
      this.ck = new brl<>(this, bui.class, 10, false, false, $$0 -> $$0 instanceof bun || $$0 instanceof bvc);
      this.cl = new brl<>(this, bvj.class, 10, false, false, bvj.bU);
      this.cm = new brl<>(this, buf.class, 20, false, false, $$0 -> $$0 instanceof buh);
      this.bO.a(0, new bus.g());
      this.bO.a(0, new bph(this, this.dK()));
      this.bO.a(1, new bus.b());
      this.bO.a(2, new bus.n(2.2));
      this.bO.a(3, new bus.e(1.0));
      this.bO.a(4, new boz<>(this, cbl.class, 16.0F, 1.6, 1.4, $$0 -> ci.test($$0) && !this.c($$0.cv()) && !this.gl()));
      this.bO.a(4, new boz<>(this, bvl.class, 8.0F, 1.6, 1.4, $$0 -> !((bvl)$$0).p() && !this.gl()));
      this.bO.a(4, new boz<>(this, bva.class, 8.0F, 1.6, 1.4, $$0 -> !this.gl()));
      this.bO.a(5, new bus.u());
      this.bO.a(6, new bus.o());
      this.bO.a(6, new bus.s(1.25));
      this.bO.a(7, new bus.l(1.2F, true));
      this.bO.a(7, new bus.t());
      this.bO.a(8, new bus.h(this, 1.25));
      this.bO.a(9, new bus.q(32, 200));
      this.bO.a(10, new bus.f(1.2F, 12, 1));
      this.bO.a(10, new bpy(this, 0.4F));
      this.bO.a(11, new brf(this, 1.0));
      this.bO.a(11, new bus.p());
      this.bO.a(12, new bus.j(this, cbl.class, 24.0F));
      this.bO.a(13, new bus.r());
      this.bP.a(3, new bus.a(biw.class, false, false, $$0 -> cg.test($$0) && !this.c($$0.cv())));
   }

   @Override
   public aot d(ciw $$0) {
      return aou.ic;
   }

   @Override
   public void b_() {
      if (!this.dK().B && this.bv() && this.cX()) {
         this.cr++;
         ciw $$0 = this.c(bil.a);
         if (this.l($$0)) {
            if (this.cr > 600) {
               ciw $$1 = $$0.a(this.dK(), this);
               if (!$$1.b()) {
                  this.a(bil.a, $$1);
               }

               this.cr = 0;
            } else if (this.cr > 560 && this.ag.i() < 0.1F) {
               this.a(this.d($$0), 1.0F, 1.0F);
               this.dK().a(this, (byte)45);
            }
         }

         biw $$2 = this.j();
         if ($$2 == null || !$$2.bv()) {
            this.y(false);
            this.z(false);
         }
      }

      if (this.fB() || this.eW()) {
         this.bj = false;
         this.bk = 0.0F;
         this.bm = 0.0F;
      }

      super.b_();
      if (this.gl() && this.ag.i() < 0.05F) {
         this.a(aou.hY, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean eW() {
      return this.eu();
   }

   private boolean l(ciw $$0) {
      return $$0.d().u() && this.j() == null && this.aA() && !this.fB();
   }

   @Override
   protected void a(art $$0, bgm $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         ciw $$3;
         if ($$2 < 0.05F) {
            $$3 = new ciw(ciz.nL);
         } else if ($$2 < 0.2F) {
            $$3 = new ciw(ciz.qd);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new ciw(ciz.tJ) : new ciw(ciz.tK);
         } else if ($$2 < 0.6F) {
            $$3 = new ciw(ciz.oI);
         } else if ($$2 < 0.8F) {
            $$3 = new ciw(ciz.pP);
         } else {
            $$3 = new ciw(ciz.oF);
         }

         this.a(bil.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         ciw $$1 = this.c(bil.a);
         if (!$$1.b()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               ehf $$3 = new ehf(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dC() * (float) (Math.PI / 180.0))
                  .b(-this.dA() * (float) (Math.PI / 180.0));
               this.dK().a(new is(iw.O, $$1), this.dp() + this.bE().c / 2.0, this.dr(), this.dv() + this.bE().e / 2.0, $$3.c, $$3.d + 0.05, $$3.e);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static bkc.a p() {
      return biy.x().a(bkd.d, 0.3F).a(bkd.a, 10.0).a(bkd.b, 32.0).a(bkd.f, 2.0);
   }

   @Nullable
   public bus b(aki $$0, bib $$1) {
      bus $$2 = bik.N.a((cpk)$$0);
      if ($$2 != null) {
         $$2.a(this.ag.h() ? this.q() : ((bus)$$1).q());
      }

      return $$2;
   }

   public static boolean c(bik<bus> $$0, cpl $$1, bja $$2, gv $$3, art $$4) {
      return $$1.a_($$3.d()).a(apj.bW) && a($$1, $$3);
   }

   @Nullable
   @Override
   public bjq a(cpz $$0, bgm $$1, bja $$2, @Nullable bjq $$3, @Nullable qs $$4) {
      hf<cqi> $$5 = $$0.s(this.dk());
      bus.v $$6 = bus.v.a($$5);
      boolean $$7 = false;
      if ($$3 instanceof bus.i $$8) {
         $$6 = $$8.a;
         if ($$8.a() >= 2) {
            $$7 = true;
         }
      } else {
         $$3 = new bus.i($$6);
      }

      this.a($$6);
      if ($$7) {
         this.c_(-24000);
      }

      if ($$0 instanceof aki) {
         this.gj();
      }

      this.a($$0.y_(), $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void gj() {
      if (this.q() == bus.v.a) {
         this.bP.a(4, this.ck);
         this.bP.a(4, this.cl);
         this.bP.a(6, this.cm);
      } else {
         this.bP.a(4, this.cm);
         this.bP.a(6, this.ck);
         this.bP.a(6, this.cl);
      }
   }

   @Override
   protected void a(cbl $$0, bgn $$1, ciw $$2) {
      if (this.m($$2)) {
         this.a(this.d($$2), 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   @Override
   protected float b(bji $$0, bih $$1) {
      return this.i_() ? $$1.b * 0.85F : 0.4F;
   }

   public bus.v q() {
      return bus.v.a(this.an.b(bX));
   }

   public void a(bus.v $$0) {
      this.an.b(bX, $$0.a());
   }

   List<UUID> gk() {
      List<UUID> $$0 = Lists.newArrayList();
      $$0.add(this.an.b(cd).orElse(null));
      $$0.add(this.an.b(ce).orElse(null));
      return $$0;
   }

   void b(@Nullable UUID $$0) {
      if (this.an.b(cd).isPresent()) {
         this.an.b(ce, Optional.ofNullable($$0));
      } else {
         this.an.b(cd, Optional.ofNullable($$0));
      }
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      List<UUID> $$1 = this.gk();
      qy $$2 = new qy();

      for (UUID $$3 : $$1) {
         if ($$3 != null) {
            $$2.add(re.a($$3));
         }
      }

      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fB());
      $$0.a("Type", this.q().c());
      $$0.a("Sitting", this.t());
      $$0.a("Crouching", this.bW());
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      qy $$1 = $$0.c("Trusted", 11);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.b(re.a($$1.k($$2)));
      }

      this.C($$0.q("Sleeping"));
      this.a(bus.v.a($$0.l("Type")));
      this.w($$0.q("Sitting"));
      this.y($$0.q("Crouching"));
      if (this.dK() instanceof aki) {
         this.gj();
      }
   }

   public boolean t() {
      return this.t(1);
   }

   public void w(boolean $$0) {
      this.d(1, $$0);
   }

   public boolean fZ() {
      return this.t(64);
   }

   void A(boolean $$0) {
      this.d(64, $$0);
   }

   boolean gl() {
      return this.t(128);
   }

   void B(boolean $$0) {
      this.d(128, $$0);
   }

   @Override
   public boolean fB() {
      return this.t(32);
   }

   void C(boolean $$0) {
      this.d(32, $$0);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.an.b(bY, (byte)(this.an.b(bY) | $$0));
      } else {
         this.an.b(bY, (byte)(this.an.b(bY) & ~$$0));
      }
   }

   private boolean t(int $$0) {
      return (this.an.b(bY) & $$0) != 0;
   }

   @Override
   public boolean f(ciw $$0) {
      bil $$1 = biy.h($$0);
      return !this.c($$1).b() ? false : $$1 == bil.a && super.f($$0);
   }

   @Override
   public boolean j(ciw $$0) {
      cir $$1 = $$0.d();
      ciw $$2 = this.c(bil.a);
      return $$2.b() || this.cr > 0 && $$1.u() && !$$2.d().u();
   }

   private void n(ciw $$0) {
      if (!$$0.b() && !this.dK().B) {
         bye $$1 = new bye(this.dK(), this.dp() + this.bE().c, this.dr() + 1.0, this.dv() + this.bE().e, $$0);
         $$1.b(40);
         $$1.c(this.cv());
         this.a(aou.ih, 1.0F, 1.0F);
         this.dK().b($$1);
      }
   }

   private void o(ciw $$0) {
      bye $$1 = new bye(this.dK(), this.dp(), this.dr(), this.dv(), $$0);
      this.dK().b($$1);
   }

   @Override
   protected void b(bye $$0) {
      ciw $$1 = $$0.j();
      if (this.j($$1)) {
         int $$2 = $$1.L();
         if ($$2 > 1) {
            this.o($$1.a($$2 - 1));
         }

         this.n(this.c(bil.a));
         this.a($$0);
         this.a(bil.a, $$1.a(1));
         this.e(bil.a);
         this.a($$0, $$1.L());
         $$0.ak();
         this.cr = 0;
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.cX()) {
         boolean $$0 = this.aX();
         if ($$0 || this.j() != null || this.dK().Y()) {
            this.gm();
         }

         if ($$0 || this.fB()) {
            this.w(false);
         }

         if (this.fZ() && this.dK().z.i() < 0.2F) {
            gv $$1 = this.dk();
            dey $$2 = this.dK().a_($$1);
            this.dK().c(2001, $$1, csk.i($$2));
         }
      }

      this.co = this.cn;
      if (this.gi()) {
         this.cn = this.cn + (1.0F - this.cn) * 0.4F;
      } else {
         this.cn = this.cn + (0.0F - this.cn) * 0.4F;
      }

      this.cq = this.cp;
      if (this.bW()) {
         this.cp += 0.2F;
         if (this.cp > 3.0F) {
            this.cp = 3.0F;
         }
      } else {
         this.cp = 0.0F;
      }
   }

   @Override
   public boolean m(ciw $$0) {
      return $$0.a(apr.X);
   }

   @Override
   protected void a(cbl $$0, biy $$1) {
      ((bus)$$1).b($$0.cv());
   }

   public boolean gf() {
      return this.t(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gg() {
      return this.bj;
   }

   public boolean gh() {
      return this.cp == 3.0F;
   }

   public void y(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   public boolean bW() {
      return this.t(4);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean gi() {
      return this.t(8);
   }

   public float E(float $$0) {
      return aro.i($$0, this.co, this.cn) * 0.11F * (float) Math.PI;
   }

   public float F(float $$0) {
      return aro.i($$0, this.cq, this.cp);
   }

   @Override
   public void h(@Nullable biw $$0) {
      if (this.gl() && $$0 == null) {
         this.B(false);
      }

      super.h($$0);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return aro.f(($$0 - 5.0F) * $$1);
   }

   void gm() {
      this.C(false);
   }

   void gn() {
      this.z(false);
      this.y(false);
      this.w(false);
      this.C(false);
      this.B(false);
      this.A(false);
   }

   boolean go() {
      return !this.fB() && !this.t() && !this.fZ();
   }

   @Override
   public void M() {
      aot $$0 = this.r();
      if ($$0 == aou.ie) {
         this.a($$0, 2.0F, this.eV());
      } else {
         super.M();
      }
   }

   @Nullable
   @Override
   protected aot r() {
      if (this.fB()) {
         return aou.if;
      } else {
         if (!this.dK().N() && this.ag.i() < 0.1F) {
            List<cbl> $$0 = this.dK().a(cbl.class, this.cG().c(16.0, 16.0, 16.0), bij.f);
            if ($$0.isEmpty()) {
               return aou.ie;
            }
         }

         return aou.hZ;
      }
   }

   @Nullable
   @Override
   protected aot d(bhe $$0) {
      return aou.id;
   }

   @Nullable
   @Override
   protected aot h_() {
      return aou.ib;
   }

   boolean c(UUID $$0) {
      return this.gk().contains($$0);
   }

   @Override
   protected void g(bhe $$0) {
      ciw $$1 = this.c(bil.a);
      if (!$$1.b()) {
         this.b($$1);
         this.a(bil.a, ciw.b);
      }

      super.g($$0);
   }

   @Override
   protected Vector3f a(big $$0, bih $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + -0.0625F * $$2, -0.25F * $$2);
   }

   public static boolean a(bus $$0, biw $$1) {
      double $$2 = $$1.dv() - $$0.dv();
      double $$3 = $$1.dp() - $$0.dp();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dK().a_(gv.a($$0.dp() + $$8, $$0.dr() + (double)$$9, $$0.dv() + $$7)).r()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public ehf cI() {
      return new ehf(0.0, (double)(0.55F * this.cH()), (double)(this.df() * 0.4F));
   }

   class a extends brl<biw> {
      @Nullable
      private biw j;
      @Nullable
      private biw k;
      private int l;

      public a(Class<biw> $$0, boolean $$1, boolean $$2, @Nullable Predicate<biw> $$3) {
         super(bus.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean a() {
         if (this.b > 0 && this.e.ee().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : bus.this.gk()) {
               if ($$0 != null && bus.this.dK() instanceof aki && ((aki)bus.this.dK()).a($$0) instanceof biw $$2) {
                  this.k = $$2;
                  this.j = $$2.ef();
                  int $$3 = $$2.eg();
                  return $$3 != this.l && this.a(this.j, this.d);
               }
            }

            return false;
         }
      }

      @Override
      public void c() {
         this.a(this.j);
         this.c = this.j;
         if (this.k != null) {
            this.l = this.k.eg();
         }

         bus.this.a(aou.hY, 1.0F, 1.0F);
         bus.this.B(true);
         bus.this.gm();
         super.c();
      }
   }

   class b extends bps {
      int a;

      public b() {
         this.a(EnumSet.of(bps.a.b, bps.a.c, bps.a.a));
      }

      @Override
      public boolean a() {
         return bus.this.fZ();
      }

      @Override
      public boolean b() {
         return this.a() && this.a > 0;
      }

      @Override
      public void c() {
         this.a = this.a(40);
      }

      @Override
      public void d() {
         bus.this.A(false);
      }

      @Override
      public void e() {
         this.a--;
      }
   }

   public class c implements Predicate<biw> {
      public boolean a(biw $$0) {
         if ($$0 instanceof bus) {
            return false;
         } else if ($$0 instanceof bun || $$0 instanceof bvc || $$0 instanceof byz) {
            return true;
         } else if ($$0 instanceof bjs) {
            return !((bjs)$$0).p();
         } else if (!($$0 instanceof cbl) || !$$0.G_() && !((cbl)$$0).f()) {
            return bus.this.c($$0.cv()) ? false : !$$0.fB() && !$$0.bU();
         } else {
            return false;
         }
      }
   }

   abstract class d extends bps {
      private final btj b = btj.a().a(12.0).d().a(bus.this.new c());

      protected boolean h() {
         gv $$0 = gv.a(bus.this.dp(), bus.this.cG().e, bus.this.dv());
         return !bus.this.dK().g($$0) && bus.this.h($$0) >= 0.0F;
      }

      protected boolean i() {
         return !bus.this.dK().a(biw.class, this.b, bus.this, bus.this.cG().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends bpe {
      public e(double $$0) {
         super(bus.this, $$0);
      }

      @Override
      public void c() {
         ((bus)this.a).gn();
         ((bus)this.c).gn();
         super.c();
      }

      @Override
      protected void g() {
         aki $$0 = (aki)this.b;
         bus $$1 = (bus)this.a.a($$0, (bib)this.c);
         if ($$1 != null) {
            akj $$2 = this.a.gc();
            akj $$3 = this.c.gc();
            akj $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.cv());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.cv());
            }

            if ($$4 != null) {
               $$4.a(ape.P);
               ai.o.a($$4, this.a, this.c, $$1);
            }

            this.a.c_(6000);
            this.c.c_(6000);
            this.a.ge();
            this.c.ge();
            $$1.c_(-24000);
            $$1.b(this.a.dp(), this.a.dr(), this.a.dv(), 0.0F, 0.0F);
            $$0.a_($$1);
            this.b.a(this.a, (byte)18);
            if (this.b.X().b(cpg.f)) {
               this.b.b(new bim(this.b, this.a.dp(), this.a.dr(), this.a.dv(), this.a.ee().a(7) + 1));
            }
         }
      }
   }

   public class f extends bqf {
      private static final int i = 40;
      protected int g;

      public f(double $$1, int $$2, int $$3) {
         super(bus.this, $$1, $$2, $$3);
      }

      @Override
      public double i() {
         return 2.0;
      }

      @Override
      public boolean l() {
         return this.d % 100 == 0;
      }

      @Override
      protected boolean a(cpn $$0, gv $$1) {
         dey $$2 = $$0.a_($$1);
         return $$2.a(csl.oi) && $$2.c(dao.b) >= 2 || ctf.h_($$2);
      }

      @Override
      public void e() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && bus.this.ag.i() < 0.05F) {
            bus.this.a(aou.ig, 1.0F, 1.0F);
         }

         super.e();
      }

      protected void o() {
         if (bus.this.dK().X().b(cpg.c)) {
            dey $$0 = bus.this.dK().a_(this.e);
            if ($$0.a(csl.oi)) {
               this.b($$0);
            } else if (ctf.h_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dey $$0) {
         ctf.a(bus.this, $$0, bus.this.dK(), this.e);
      }

      private void b(dey $$0) {
         int $$1 = $$0.c(dao.b);
         $$0.a(dao.b, Integer.valueOf(1));
         int $$2 = 1 + bus.this.dK().z.a(2) + ($$1 == 3 ? 1 : 0);
         ciw $$3 = bus.this.c(bil.a);
         if ($$3.b()) {
            bus.this.a(bil.a, new ciw(ciz.vv));
            $$2--;
         }

         if ($$2 > 0) {
            csk.a(bus.this.dK(), this.e, new ciw(ciz.vv, $$2));
         }

         bus.this.a(aou.xA, 1.0F, 1.0F);
         bus.this.dK().a(this.e, $$0.a(dao.b, Integer.valueOf(1)), 2);
      }

      @Override
      public boolean a() {
         return !bus.this.fB() && super.a();
      }

      @Override
      public void c() {
         this.g = 0;
         bus.this.w(false);
         super.c();
      }
   }

   class g extends bpm {
      public g() {
         super(bus.this);
      }

      @Override
      public void c() {
         super.c();
         bus.this.gn();
      }

      @Override
      public boolean a() {
         return bus.this.aX() && bus.this.b(apo.a) > 0.25 || bus.this.bl();
      }
   }

   class h extends bpr {
      private final bus e;

      public h(bus $$0, double $$1) {
         super($$0, $$1);
         this.e = $$0;
      }

      @Override
      public boolean a() {
         return !this.e.gl() && super.a();
      }

      @Override
      public boolean b() {
         return !this.e.gl() && super.b();
      }

      @Override
      public void c() {
         this.e.gn();
         super.c();
      }
   }

   public static class i extends bib.a {
      public final bus.v a;

      public i(bus.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends bqa {
      public j(biy $$0, Class<? extends biw> $$1, float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && !bus.this.fZ() && !bus.this.gi();
      }

      @Override
      public boolean b() {
         return super.b() && !bus.this.fZ() && !bus.this.gi();
      }
   }

   public class k extends bou {
      public k() {
         super(bus.this);
      }

      @Override
      public void a() {
         if (!bus.this.fB()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !bus.this.gf() && !bus.this.bW() && !bus.this.gi() && !bus.this.fZ();
      }
   }

   class l extends bqc {
      public l(double $$0, boolean $$1) {
         super(bus.this, $$0, $$1);
      }

      @Override
      protected void a(biw $$0, double $$1) {
         double $$2 = this.a($$0);
         if ($$1 <= $$2 && this.i()) {
            this.h();
            this.a.C($$0);
            bus.this.a(aou.ia, 1.0F, 1.0F);
         }
      }

      @Override
      public void c() {
         bus.this.z(false);
         super.c();
      }

      @Override
      public boolean a() {
         return !bus.this.t() && !bus.this.fB() && !bus.this.bW() && !bus.this.fZ() && super.a();
      }
   }

   class m extends bov {
      public m() {
         super(bus.this);
      }

      @Override
      public void a() {
         if (bus.this.go()) {
            super.a();
         }
      }
   }

   class n extends bql {
      public n(double $$0) {
         super(bus.this, $$0);
      }

      @Override
      public boolean h() {
         return !bus.this.gl() && super.h();
      }
   }

   public class o extends bpw {
      @Override
      public boolean a() {
         if (!bus.this.gh()) {
            return false;
         } else {
            biw $$0 = bus.this.j();
            if ($$0 != null && $$0.bv()) {
               if ($$0.cE() != $$0.cD()) {
                  return false;
               } else {
                  boolean $$1 = bus.a(bus.this, $$0);
                  if (!$$1) {
                     bus.this.H().a($$0, 0);
                     bus.this.y(false);
                     bus.this.z(false);
                  }

                  return $$1;
               }
            } else {
               return false;
            }
         }
      }

      @Override
      public boolean b() {
         biw $$0 = bus.this.j();
         if ($$0 != null && $$0.bv()) {
            double $$1 = bus.this.dn().d;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(bus.this.dC()) < 15.0F) || !bus.this.aA()) && !bus.this.fZ();
         } else {
            return false;
         }
      }

      @Override
      public boolean J_() {
         return false;
      }

      @Override
      public void c() {
         bus.this.r(true);
         bus.this.x(true);
         bus.this.z(false);
         biw $$0 = bus.this.j();
         if ($$0 != null) {
            bus.this.D().a($$0, 60.0F, 30.0F);
            ehf $$1 = new ehf($$0.dp() - bus.this.dp(), $$0.dr() - bus.this.dr(), $$0.dv() - bus.this.dv()).d();
            bus.this.f(bus.this.dn().b($$1.c * 0.8, 0.9, $$1.e * 0.8));
         }

         bus.this.H().n();
      }

      @Override
      public void d() {
         bus.this.y(false);
         bus.this.cp = 0.0F;
         bus.this.cq = 0.0F;
         bus.this.z(false);
         bus.this.x(false);
      }

      @Override
      public void e() {
         biw $$0 = bus.this.j();
         if ($$0 != null) {
            bus.this.D().a($$0, 60.0F, 30.0F);
         }

         if (!bus.this.fZ()) {
            ehf $$1 = bus.this.dn();
            if ($$1.d * $$1.d < 0.03F && bus.this.dC() != 0.0F) {
               bus.this.s(aro.j(0.2F, bus.this.dC(), 0.0F));
            } else {
               double $$2 = $$1.h();
               double $$3 = Math.signum(-$$1.d) * Math.acos($$2 / $$1.f()) * 180.0F / (float)Math.PI;
               bus.this.s((float)$$3);
            }
         }

         if ($$0 != null && bus.this.e((big)$$0) <= 2.0F) {
            bus.this.C($$0);
         } else if (bus.this.dC() > 0.0F && bus.this.aA() && (float)bus.this.dn().d != 0.0F && bus.this.dK().a_(bus.this.dk()).a(csl.dN)) {
            bus.this.s(60.0F);
            bus.this.h(null);
            bus.this.A(true);
         }
      }
   }

   class p extends bps {
      public p() {
         this.a(EnumSet.of(bps.a.a));
      }

      @Override
      public boolean a() {
         if (!bus.this.c(bil.a).b()) {
            return false;
         } else if (bus.this.j() != null || bus.this.ef() != null) {
            return false;
         } else if (!bus.this.go()) {
            return false;
         } else if (bus.this.ee().a(b(10)) != 0) {
            return false;
         } else {
            List<bye> $$0 = bus.this.dK().a(bye.class, bus.this.cG().c(8.0, 8.0, 8.0), bus.cf);
            return !$$0.isEmpty() && bus.this.c(bil.a).b();
         }
      }

      @Override
      public void e() {
         List<bye> $$0 = bus.this.dK().a(bye.class, bus.this.cG().c(8.0, 8.0, 8.0), bus.cf);
         ciw $$1 = bus.this.c(bil.a);
         if ($$1.b() && !$$0.isEmpty()) {
            bus.this.H().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void c() {
         List<bye> $$0 = bus.this.dK().a(bye.class, bus.this.cG().c(8.0, 8.0, 8.0), bus.cf);
         if (!$$0.isEmpty()) {
            bus.this.H().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends bqy {
      public q(int $$0, int $$1) {
         super(bus.this, $$1);
      }

      @Override
      public void c() {
         bus.this.gn();
         super.c();
      }

      @Override
      public boolean a() {
         return super.a() && this.h();
      }

      @Override
      public boolean b() {
         return super.b() && this.h();
      }

      private boolean h() {
         return !bus.this.fB() && !bus.this.t() && !bus.this.gl() && bus.this.j() == null;
      }
   }

   class r extends bus.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(bps.a.a, bps.a.b));
      }

      @Override
      public boolean a() {
         return bus.this.ef() == null
            && bus.this.ee().i() < 0.02F
            && !bus.this.fB()
            && bus.this.j() == null
            && bus.this.H().l()
            && !this.i()
            && !bus.this.gf()
            && !bus.this.bW();
      }

      @Override
      public boolean b() {
         return this.f > 0;
      }

      @Override
      public void c() {
         this.k();
         this.f = 2 + bus.this.ee().a(3);
         bus.this.w(true);
         bus.this.H().n();
      }

      @Override
      public void d() {
         bus.this.w(false);
      }

      @Override
      public void e() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         bus.this.D().a(bus.this.dp() + this.c, bus.this.dt(), bus.this.dv() + this.d, (float)bus.this.X(), (float)bus.this.W());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * bus.this.ee().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + bus.this.ee().a(20));
      }
   }

   class s extends bpl {
      private int c = b(100);

      public s(double $$0) {
         super(bus.this, $$0);
      }

      @Override
      public boolean a() {
         if (!bus.this.fB() && this.a.j() == null) {
            if (bus.this.dK().Y() && bus.this.dK().g(this.a.dk())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               gv $$0 = this.a.dk();
               return bus.this.dK().N() && bus.this.dK().g($$0) && !((aki)bus.this.dK()).b($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void c() {
         bus.this.gn();
         super.c();
      }
   }

   class t extends bus.d {
      private static final int c = b(140);
      private int d = bus.this.ag.a(c);

      public t() {
         this.a(EnumSet.of(bps.a.a, bps.a.b, bps.a.c));
      }

      @Override
      public boolean a() {
         return bus.this.bk == 0.0F && bus.this.bl == 0.0F && bus.this.bm == 0.0F ? this.k() || bus.this.fB() : false;
      }

      @Override
      public boolean b() {
         return this.k();
      }

      private boolean k() {
         if (this.d > 0) {
            this.d--;
            return false;
         } else {
            return bus.this.dK().N() && this.h() && !this.i() && !bus.this.aA;
         }
      }

      @Override
      public void d() {
         this.d = bus.this.ag.a(c);
         bus.this.gn();
      }

      @Override
      public void c() {
         bus.this.w(false);
         bus.this.y(false);
         bus.this.z(false);
         bus.this.r(false);
         bus.this.C(true);
         bus.this.H().n();
         bus.this.E().a(bus.this.dp(), bus.this.dr(), bus.this.dv(), 0.0);
      }
   }

   class u extends bps {
      public u() {
         this.a(EnumSet.of(bps.a.a, bps.a.b));
      }

      @Override
      public boolean a() {
         if (bus.this.fB()) {
            return false;
         } else {
            biw $$0 = bus.this.j();
            return $$0 != null && $$0.bv() && bus.ch.test($$0) && bus.this.f($$0) > 36.0 && !bus.this.bW() && !bus.this.gi() && !bus.this.bj;
         }
      }

      @Override
      public void c() {
         bus.this.w(false);
         bus.this.A(false);
      }

      @Override
      public void d() {
         biw $$0 = bus.this.j();
         if ($$0 != null && bus.a(bus.this, $$0)) {
            bus.this.z(true);
            bus.this.y(true);
            bus.this.H().n();
            bus.this.D().a($$0, (float)bus.this.X(), (float)bus.this.W());
         } else {
            bus.this.z(false);
            bus.this.y(false);
         }
      }

      @Override
      public void e() {
         biw $$0 = bus.this.j();
         if ($$0 != null) {
            bus.this.D().a($$0, (float)bus.this.X(), (float)bus.this.W());
            if (bus.this.f($$0) <= 36.0) {
               bus.this.z(true);
               bus.this.y(true);
               bus.this.H().n();
            } else {
               bus.this.H().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements asf {
      a(0, "red"),
      b(1, "snow");

      public static final asf.a<bus.v> c = asf.a(bus.v::values);
      private static final IntFunction<bus.v> d = aqi.a(bus.v::a, values(), aqi.a.a);
      private final int e;
      private final String f;

      private v(int $$0, String $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }

      public int a() {
         return this.e;
      }

      public static bus.v a(String $$0) {
         return c.a($$0, a);
      }

      public static bus.v a(int $$0) {
         return d.apply($$0);
      }

      public static bus.v a(hf<cqi> $$0) {
         return $$0.a(api.aq) ? b : a;
      }
   }
}
