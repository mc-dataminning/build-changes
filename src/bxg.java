import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bxg extends bww implements bmj<bxg.v> {
   private static final afs<Integer> bX = afv.a(bxg.class, afu.b);
   private static final afs<Byte> bY = afv.a(bxg.class, afu.a);
   private static final int bZ = 1;
   public static final int bT = 4;
   public static final int bU = 8;
   public static final int bW = 16;
   private static final int ca = 32;
   private static final int cb = 64;
   private static final int cc = 128;
   private static final afs<Optional<UUID>> cd = afv.a(bxg.class, afu.q);
   private static final afs<Optional<UUID>> ce = afv.a(bxg.class, afu.q);
   static final Predicate<cas> cf = $$0 -> !$$0.z() && $$0.bx();
   private static final Predicate<bkv> cg = $$0 -> !($$0 instanceof bll $$1) ? false : $$1.ek() != null && $$1.el() < $$1.ah + 600;
   static final Predicate<bkv> ch = $$0 -> $$0 instanceof bxb || $$0 instanceof bxq;
   private static final Predicate<bkv> ci = $$0 -> !$$0.bV() && bky.e.test($$0);
   private static final int cj = 600;
   private bsg ck;
   private bsg cl;
   private bsg cm;
   private float cn;
   private float co;
   float cp;
   float cq;
   private int cr;

   public bxg(bkz<? extends bxg> $$0, csf $$1) {
      super($$0, $$1);
      this.bK = new bxg.k();
      this.bL = new bxg.m();
      this.a(edi.p, 0.0F);
      this.a(edi.q, 0.0F);
      this.s(true);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(cd, Optional.empty());
      this.an.a(ce, Optional.empty());
      this.an.a(bX, 0);
      this.an.a(bY, (byte)0);
   }

   @Override
   protected void B() {
      this.ck = new btz<>(this, bww.class, 10, false, false, $$0 -> $$0 instanceof bxb || $$0 instanceof bxq);
      this.cl = new btz<>(this, bxx.class, 10, false, false, bxx.bU);
      this.cm = new btz<>(this, bwt.class, 20, false, false, $$0 -> $$0 instanceof bwv);
      this.bO.a(0, new bxg.g());
      this.bO.a(0, new brv(this, this.dN()));
      this.bO.a(1, new bxg.b());
      this.bO.a(2, new bxg.n(2.2));
      this.bO.a(3, new bxg.e(1.0));
      this.bO.a(4, new brn<>(this, cdz.class, 16.0F, 1.6, 1.4, $$0 -> ci.test($$0) && !this.c($$0.cw()) && !this.gr()));
      this.bO.a(4, new brn<>(this, bxz.class, 8.0F, 1.6, 1.4, $$0 -> !((bxz)$$0).u() && !this.gr()));
      this.bO.a(4, new brn<>(this, bxo.class, 8.0F, 1.6, 1.4, $$0 -> !this.gr()));
      this.bO.a(5, new bxg.u());
      this.bO.a(6, new bxg.o());
      this.bO.a(6, new bxg.s(1.25));
      this.bO.a(7, new bxg.l(1.2F, true));
      this.bO.a(7, new bxg.t());
      this.bO.a(8, new bxg.h(this, 1.25));
      this.bO.a(9, new bxg.q(32, 200));
      this.bO.a(10, new bxg.f(1.2F, 12, 1));
      this.bO.a(10, new bsm(this, 0.4F));
      this.bO.a(11, new btt(this, 1.0));
      this.bO.a(11, new bxg.p());
      this.bO.a(12, new bxg.j(this, cdz.class, 24.0F));
      this.bO.a(13, new bxg.r());
      this.bP.a(3, new bxg.a(bll.class, false, false, $$0 -> cg.test($$0) && !this.c($$0.cw())));
   }

   @Override
   public aqu d(clo $$0) {
      return aqv.iw;
   }

   @Override
   public void d_() {
      if (!this.dN().B && this.bx() && this.cZ()) {
         this.cr++;
         clo $$0 = this.c(bla.a);
         if (this.l($$0)) {
            if (this.cr > 600) {
               clo $$1 = $$0.a(this.dN(), this);
               if (!$$1.b()) {
                  this.a(bla.a, $$1);
               }

               this.cr = 0;
            } else if (this.cr > 560 && this.ag.i() < 0.1F) {
               this.a(this.d($$0), 1.0F, 1.0F);
               this.dN().a(this, (byte)45);
            }
         }

         bll $$2 = this.q();
         if ($$2 == null || !$$2.bx()) {
            this.y(false);
            this.z(false);
         }
      }

      if (this.fE() || this.eZ()) {
         this.bj = false;
         this.bk = 0.0F;
         this.bm = 0.0F;
      }

      super.d_();
      if (this.gr() && this.ag.i() < 0.05F) {
         this.a(aqv.is, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean eZ() {
      return this.ex();
   }

   private boolean l(clo $$0) {
      return $$0.d().u() && this.q() == null && this.aC() && !this.fE();
   }

   @Override
   protected void a(atw $$0, biz $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         clo $$3;
         if ($$2 < 0.05F) {
            $$3 = new clo(clr.ow);
         } else if ($$2 < 0.2F) {
            $$3 = new clo(clr.qO);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new clo(clr.uv) : new clo(clr.uw);
         } else if ($$2 < 0.6F) {
            $$3 = new clo(clr.pt);
         } else if ($$2 < 0.8F) {
            $$3 = new clo(clr.qA);
         } else {
            $$3 = new clo(clr.pq);
         }

         this.a(bla.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         clo $$1 = this.c(bla.a);
         if (!$$1.b()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               ejz $$3 = new ejz(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dF() * (float) (Math.PI / 180.0))
                  .b(-this.dD() * (float) (Math.PI / 180.0));
               this.dN().a(new js(jw.O, $$1), this.ds() + this.bF().c / 2.0, this.du(), this.dy() + this.bF().e / 2.0, $$3.c, $$3.d + 0.05, $$3.e);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static bmq.a u() {
      return bln.C().a(bmr.m, 0.3F).a(bmr.l, 10.0).a(bmr.g, 32.0).a(bmr.c, 2.0);
   }

   @Nullable
   public bxg b(ami $$0, bkq $$1) {
      bxg $$2 = bkz.N.a((csf)$$0);
      if ($$2 != null) {
         $$2.a(this.ag.h() ? this.w() : ((bxg)$$1).w());
      }

      return $$2;
   }

   public static boolean c(bkz<bxg> $$0, csg $$1, blp $$2, hx $$3, atw $$4) {
      return $$1.a_($$3.d()).a(ark.bW) && a($$1, $$3);
   }

   @Nullable
   @Override
   public bme a(csu $$0, biz $$1, blp $$2, @Nullable bme $$3, @Nullable sd $$4) {
      ig<ctd> $$5 = $$0.s(this.dn());
      bxg.v $$6 = bxg.v.a($$5);
      boolean $$7 = false;
      if ($$3 instanceof bxg.i $$8) {
         $$6 = $$8.a;
         if ($$8.a() >= 2) {
            $$7 = true;
         }
      } else {
         $$3 = new bxg.i($$6);
      }

      this.a($$6);
      if ($$7) {
         this.c_(-24000);
      }

      if ($$0 instanceof ami) {
         this.gp();
      }

      this.a($$0.F_(), $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void gp() {
      if (this.w() == bxg.v.a) {
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
   protected void a(cdz $$0, bja $$1, clo $$2) {
      if (this.m($$2)) {
         this.a(this.d($$2), 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   @Override
   protected float b(blx $$0, bkw $$1) {
      return this.o_() ? $$1.b * 0.85F : 0.4F;
   }

   public bxg.v w() {
      return bxg.v.a(this.an.b(bX));
   }

   public void a(bxg.v $$0) {
      this.an.b(bX, $$0.a());
   }

   List<UUID> gq() {
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
   public void b(sd $$0) {
      super.b($$0);
      List<UUID> $$1 = this.gq();
      sj $$2 = new sj();

      for (UUID $$3 : $$1) {
         if ($$3 != null) {
            $$2.add(ss.a($$3));
         }
      }

      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fE());
      $$0.a("Type", this.w().c());
      $$0.a("Sitting", this.A());
      $$0.a("Crouching", this.bX());
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);

      for (ta $$2 : $$0.c("Trusted", 11)) {
         this.b(ss.a($$2));
      }

      this.C($$0.q("Sleeping"));
      this.a(bxg.v.a($$0.l("Type")));
      this.w($$0.q("Sitting"));
      this.y($$0.q("Crouching"));
      if (this.dN() instanceof ami) {
         this.gp();
      }
   }

   public boolean A() {
      return this.t(1);
   }

   public void w(boolean $$0) {
      this.d(1, $$0);
   }

   public boolean gf() {
      return this.t(64);
   }

   void A(boolean $$0) {
      this.d(64, $$0);
   }

   boolean gr() {
      return this.t(128);
   }

   void B(boolean $$0) {
      this.d(128, $$0);
   }

   @Override
   public boolean fE() {
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
   public boolean f(clo $$0) {
      bla $$1 = bln.h($$0);
      return !this.c($$1).b() ? false : $$1 == bla.a && super.f($$0);
   }

   @Override
   public boolean j(clo $$0) {
      clj $$1 = $$0.d();
      clo $$2 = this.c(bla.a);
      return $$2.b() || this.cr > 0 && $$1.u() && !$$2.d().u();
   }

   private void n(clo $$0) {
      if (!$$0.b() && !this.dN().B) {
         cas $$1 = new cas(this.dN(), this.ds() + this.bF().c, this.du() + 1.0, this.dy() + this.bF().e, $$0);
         $$1.b(40);
         $$1.a(this);
         this.a(aqv.iB, 1.0F, 1.0F);
         this.dN().b($$1);
      }
   }

   private void o(clo $$0) {
      cas $$1 = new cas(this.dN(), this.ds(), this.du(), this.dy(), $$0);
      this.dN().b($$1);
   }

   @Override
   protected void b(cas $$0) {
      clo $$1 = $$0.q();
      if (this.j($$1)) {
         int $$2 = $$1.L();
         if ($$2 > 1) {
            this.o($$1.a($$2 - 1));
         }

         this.n(this.c(bla.a));
         this.a($$0);
         this.a(bla.a, $$1.a(1));
         this.e(bla.a);
         this.a($$0, $$1.L());
         $$0.am();
         this.cr = 0;
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.cZ()) {
         boolean $$0 = this.aZ();
         if ($$0 || this.q() != null || this.dN().Z()) {
            this.gs();
         }

         if ($$0 || this.fE()) {
            this.w(false);
         }

         if (this.gf() && this.dN().z.i() < 0.2F) {
            hx $$1 = this.dn();
            dhn $$2 = this.dN().a_($$1);
            this.dN().c(2001, $$1, cvf.i($$2));
         }
      }

      this.co = this.cn;
      if (this.go()) {
         this.cn = this.cn + (1.0F - this.cn) * 0.4F;
      } else {
         this.cn = this.cn + (0.0F - this.cn) * 0.4F;
      }

      this.cq = this.cp;
      if (this.bX()) {
         this.cp += 0.2F;
         if (this.cp > 3.0F) {
            this.cp = 3.0F;
         }
      } else {
         this.cp = 0.0F;
      }
   }

   @Override
   public boolean m(clo $$0) {
      return $$0.a(ars.X);
   }

   @Override
   protected void a(cdz $$0, bln $$1) {
      ((bxg)$$1).b($$0.cw());
   }

   public boolean gl() {
      return this.t(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gm() {
      return this.bj;
   }

   public boolean gn() {
      return this.cp == 3.0F;
   }

   public void y(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   public boolean bX() {
      return this.t(4);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean go() {
      return this.t(8);
   }

   public float E(float $$0) {
      return atq.i($$0, this.co, this.cn) * 0.11F * (float) Math.PI;
   }

   public float F(float $$0) {
      return atq.i($$0, this.cq, this.cp);
   }

   @Override
   public void h(@Nullable bll $$0) {
      if (this.gr() && $$0 == null) {
         this.B(false);
      }

      super.h($$0);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return atq.f(($$0 - 5.0F) * $$1);
   }

   void gs() {
      this.C(false);
   }

   void gt() {
      this.z(false);
      this.y(false);
      this.w(false);
      this.C(false);
      this.B(false);
      this.A(false);
   }

   boolean gu() {
      return !this.fE() && !this.A() && !this.gf();
   }

   @Override
   public void R() {
      aqu $$0 = this.y();
      if ($$0 == aqv.iy) {
         this.a($$0, 2.0F, this.eY());
      } else {
         super.R();
      }
   }

   @Nullable
   @Override
   protected aqu y() {
      if (this.fE()) {
         return aqv.iz;
      } else {
         if (!this.dN().O() && this.ag.i() < 0.1F) {
            List<cdz> $$0 = this.dN().a(cdz.class, this.cH().c(16.0, 16.0, 16.0), bky.f);
            if ($$0.isEmpty()) {
               return aqv.iy;
            }
         }

         return aqv.it;
      }
   }

   @Nullable
   @Override
   protected aqu d(bjt $$0) {
      return aqv.ix;
   }

   @Nullable
   @Override
   protected aqu n_() {
      return aqv.iv;
   }

   boolean c(UUID $$0) {
      return this.gq().contains($$0);
   }

   @Override
   protected void g(bjt $$0) {
      clo $$1 = this.c(bla.a);
      if (!$$1.b()) {
         this.b($$1);
         this.a(bla.a, clo.b);
      }

      super.g($$0);
   }

   @Override
   protected Vector3f a(bkv $$0, bkw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + -0.0625F * $$2, -0.25F * $$2);
   }

   public static boolean a(bxg $$0, bll $$1) {
      double $$2 = $$1.dy() - $$0.dy();
      double $$3 = $$1.ds() - $$0.ds();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dN().a_(hx.a($$0.ds() + $$8, $$0.du() + (double)$$9, $$0.dy() + $$7)).r()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public ejz cJ() {
      return new ejz(0.0, (double)(0.55F * this.cI()), (double)(this.dh() * 0.4F));
   }

   class a extends btz<bll> {
      @Nullable
      private bll j;
      @Nullable
      private bll k;
      private int l;

      public a(Class<bll> $$0, boolean $$1, boolean $$2, @Nullable Predicate<bll> $$3) {
         super(bxg.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean a() {
         if (this.b > 0 && this.e.eh().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : bxg.this.gq()) {
               if ($$0 != null && bxg.this.dN() instanceof ami && ((ami)bxg.this.dN()).a($$0) instanceof bll $$2) {
                  this.k = $$2;
                  this.j = $$2.ei();
                  int $$3 = $$2.ej();
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
            this.l = this.k.ej();
         }

         bxg.this.a(aqv.is, 1.0F, 1.0F);
         bxg.this.B(true);
         bxg.this.gs();
         super.c();
      }
   }

   class b extends bsg {
      int a;

      public b() {
         this.a(EnumSet.of(bsg.a.b, bsg.a.c, bsg.a.a));
      }

      @Override
      public boolean a() {
         return bxg.this.gf();
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
         bxg.this.A(false);
      }

      @Override
      public void e() {
         this.a--;
      }
   }

   public class c implements Predicate<bll> {
      public boolean a(bll $$0) {
         if ($$0 instanceof bxg) {
            return false;
         } else if ($$0 instanceof bxb || $$0 instanceof bxq || $$0 instanceof cbn) {
            return true;
         } else if ($$0 instanceof bmg) {
            return !((bmg)$$0).u();
         } else if (!($$0 instanceof cdz) || !$$0.P_() && !((cdz)$$0).f()) {
            return bxg.this.c($$0.cw()) ? false : !$$0.fE() && !$$0.bV();
         } else {
            return false;
         }
      }
   }

   abstract class d extends bsg {
      private final bvx b = bvx.a().a(12.0).d().a(bxg.this.new c());

      protected boolean h() {
         hx $$0 = hx.a(bxg.this.ds(), bxg.this.cH().e, bxg.this.dy());
         return !bxg.this.dN().g($$0) && bxg.this.h($$0) >= 0.0F;
      }

      protected boolean i() {
         return !bxg.this.dN().a(bll.class, this.b, bxg.this, bxg.this.cH().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends brs {
      public e(double $$0) {
         super(bxg.this, $$0);
      }

      @Override
      public void c() {
         ((bxg)this.a).gt();
         ((bxg)this.c).gt();
         super.c();
      }

      @Override
      protected void g() {
         ami $$0 = (ami)this.b;
         bxg $$1 = (bxg)this.a.a($$0, (bkq)this.c);
         if ($$1 != null) {
            amj $$2 = this.a.gi();
            amj $$3 = this.c.gi();
            amj $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.cw());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.cw());
            }

            if ($$4 != null) {
               $$4.a(arf.P);
               al.o.a($$4, this.a, this.c, $$1);
            }

            this.a.c_(6000);
            this.c.c_(6000);
            this.a.gk();
            this.c.gk();
            $$1.c_(-24000);
            $$1.b(this.a.ds(), this.a.du(), this.a.dy(), 0.0F, 0.0F);
            $$0.a_($$1);
            this.b.a(this.a, (byte)18);
            if (this.b.Y().b(csb.f)) {
               this.b.b(new blb(this.b, this.a.ds(), this.a.du(), this.a.dy(), this.a.eh().a(7) + 1));
            }
         }
      }
   }

   public class f extends bst {
      private static final int i = 40;
      protected int g;

      public f(double $$1, int $$2, int $$3) {
         super(bxg.this, $$1, $$2, $$3);
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
      protected boolean a(csi $$0, hx $$1) {
         dhn $$2 = $$0.a_($$1);
         return $$2.a(cvh.oi) && $$2.c(ddh.c) >= 2 || cwb.h_($$2);
      }

      @Override
      public void e() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && bxg.this.ag.i() < 0.05F) {
            bxg.this.a(aqv.iA, 1.0F, 1.0F);
         }

         super.e();
      }

      protected void o() {
         if (bxg.this.dN().Y().b(csb.c)) {
            dhn $$0 = bxg.this.dN().a_(this.e);
            if ($$0.a(cvh.oi)) {
               this.b($$0);
            } else if (cwb.h_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dhn $$0) {
         cwb.a(bxg.this, $$0, bxg.this.dN(), this.e);
      }

      private void b(dhn $$0) {
         int $$1 = $$0.c(ddh.c);
         $$0.a(ddh.c, Integer.valueOf(1));
         int $$2 = 1 + bxg.this.dN().z.a(2) + ($$1 == 3 ? 1 : 0);
         clo $$3 = bxg.this.c(bla.a);
         if ($$3.b()) {
            bxg.this.a(bla.a, new clo(clr.wh));
            $$2--;
         }

         if ($$2 > 0) {
            cvf.a(bxg.this.dN(), this.e, new clo(clr.wh, $$2));
         }

         bxg.this.a(aqv.ya, 1.0F, 1.0F);
         bxg.this.dN().a(this.e, $$0.a(ddh.c, Integer.valueOf(1)), 2);
         bxg.this.dN().a(dlx.c, this.e, dlx.a.a(bxg.this));
      }

      @Override
      public boolean a() {
         return !bxg.this.fE() && super.a();
      }

      @Override
      public void c() {
         this.g = 0;
         bxg.this.w(false);
         super.c();
      }
   }

   class g extends bsa {
      public g() {
         super(bxg.this);
      }

      @Override
      public void c() {
         super.c();
         bxg.this.gt();
      }

      @Override
      public boolean a() {
         return bxg.this.aZ() && bxg.this.b(arp.a) > 0.25 || bxg.this.bn();
      }
   }

   class h extends bsf {
      private final bxg e;

      public h(bxg $$0, double $$1) {
         super($$0, $$1);
         this.e = $$0;
      }

      @Override
      public boolean a() {
         return !this.e.gr() && super.a();
      }

      @Override
      public boolean b() {
         return !this.e.gr() && super.b();
      }

      @Override
      public void c() {
         this.e.gt();
         super.c();
      }
   }

   public static class i extends bkq.a {
      public final bxg.v a;

      public i(bxg.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends bso {
      public j(bln $$0, Class<? extends bll> $$1, float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && !bxg.this.gf() && !bxg.this.go();
      }

      @Override
      public boolean b() {
         return super.b() && !bxg.this.gf() && !bxg.this.go();
      }
   }

   public class k extends bri {
      public k() {
         super(bxg.this);
      }

      @Override
      public void a() {
         if (!bxg.this.fE()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !bxg.this.gl() && !bxg.this.bX() && !bxg.this.go() && !bxg.this.gf();
      }
   }

   class l extends bsq {
      public l(double $$0, boolean $$1) {
         super(bxg.this, $$0, $$1);
      }

      @Override
      protected void a(bll $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            bxg.this.a(aqv.iu, 1.0F, 1.0F);
         }
      }

      @Override
      public void c() {
         bxg.this.z(false);
         super.c();
      }

      @Override
      public boolean a() {
         return !bxg.this.A() && !bxg.this.fE() && !bxg.this.bX() && !bxg.this.gf() && super.a();
      }
   }

   class m extends brj {
      public m() {
         super(bxg.this);
      }

      @Override
      public void a() {
         if (bxg.this.gu()) {
            super.a();
         }
      }
   }

   class n extends bsz {
      public n(double $$0) {
         super(bxg.this, $$0);
      }

      @Override
      public boolean h() {
         return !bxg.this.gr() && super.h();
      }
   }

   public class o extends bsk {
      @Override
      public boolean a() {
         if (!bxg.this.gn()) {
            return false;
         } else {
            bll $$0 = bxg.this.q();
            if ($$0 != null && $$0.bx()) {
               if ($$0.cF() != $$0.cE()) {
                  return false;
               } else {
                  boolean $$1 = bxg.a(bxg.this, $$0);
                  if (!$$1) {
                     bxg.this.N().a($$0, 0);
                     bxg.this.y(false);
                     bxg.this.z(false);
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
         bll $$0 = bxg.this.q();
         if ($$0 != null && $$0.bx()) {
            double $$1 = bxg.this.dq().d;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(bxg.this.dF()) < 15.0F) || !bxg.this.aC()) && !bxg.this.gf();
         } else {
            return false;
         }
      }

      @Override
      public boolean S_() {
         return false;
      }

      @Override
      public void c() {
         bxg.this.r(true);
         bxg.this.x(true);
         bxg.this.z(false);
         bll $$0 = bxg.this.q();
         if ($$0 != null) {
            bxg.this.I().a($$0, 60.0F, 30.0F);
            ejz $$1 = new ejz($$0.ds() - bxg.this.ds(), $$0.du() - bxg.this.du(), $$0.dy() - bxg.this.dy()).d();
            bxg.this.g(bxg.this.dq().b($$1.c * 0.8, 0.9, $$1.e * 0.8));
         }

         bxg.this.N().n();
      }

      @Override
      public void d() {
         bxg.this.y(false);
         bxg.this.cp = 0.0F;
         bxg.this.cq = 0.0F;
         bxg.this.z(false);
         bxg.this.x(false);
      }

      @Override
      public void e() {
         bll $$0 = bxg.this.q();
         if ($$0 != null) {
            bxg.this.I().a($$0, 60.0F, 30.0F);
         }

         if (!bxg.this.gf()) {
            ejz $$1 = bxg.this.dq();
            if ($$1.d * $$1.d < 0.03F && bxg.this.dF() != 0.0F) {
               bxg.this.s(atq.j(0.2F, bxg.this.dF(), 0.0F));
            } else {
               double $$2 = $$1.h();
               double $$3 = Math.signum(-$$1.d) * Math.acos($$2 / $$1.f()) * 180.0F / (float)Math.PI;
               bxg.this.s((float)$$3);
            }
         }

         if ($$0 != null && bxg.this.e((bkv)$$0) <= 2.0F) {
            bxg.this.C($$0);
         } else if (bxg.this.dF() > 0.0F && bxg.this.aC() && (float)bxg.this.dq().d != 0.0F && bxg.this.dN().a_(bxg.this.dn()).a(cvh.dN)) {
            bxg.this.s(60.0F);
            bxg.this.h(null);
            bxg.this.A(true);
         }
      }
   }

   class p extends bsg {
      public p() {
         this.a(EnumSet.of(bsg.a.a));
      }

      @Override
      public boolean a() {
         if (!bxg.this.c(bla.a).b()) {
            return false;
         } else if (bxg.this.q() != null || bxg.this.ei() != null) {
            return false;
         } else if (!bxg.this.gu()) {
            return false;
         } else if (bxg.this.eh().a(b(10)) != 0) {
            return false;
         } else {
            List<cas> $$0 = bxg.this.dN().a(cas.class, bxg.this.cH().c(8.0, 8.0, 8.0), bxg.cf);
            return !$$0.isEmpty() && bxg.this.c(bla.a).b();
         }
      }

      @Override
      public void e() {
         List<cas> $$0 = bxg.this.dN().a(cas.class, bxg.this.cH().c(8.0, 8.0, 8.0), bxg.cf);
         clo $$1 = bxg.this.c(bla.a);
         if ($$1.b() && !$$0.isEmpty()) {
            bxg.this.N().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void c() {
         List<cas> $$0 = bxg.this.dN().a(cas.class, bxg.this.cH().c(8.0, 8.0, 8.0), bxg.cf);
         if (!$$0.isEmpty()) {
            bxg.this.N().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends btm {
      public q(int $$0, int $$1) {
         super(bxg.this, $$1);
      }

      @Override
      public void c() {
         bxg.this.gt();
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
         return !bxg.this.fE() && !bxg.this.A() && !bxg.this.gr() && bxg.this.q() == null;
      }
   }

   class r extends bxg.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(bsg.a.a, bsg.a.b));
      }

      @Override
      public boolean a() {
         return bxg.this.ei() == null
            && bxg.this.eh().i() < 0.02F
            && !bxg.this.fE()
            && bxg.this.q() == null
            && bxg.this.N().l()
            && !this.i()
            && !bxg.this.gl()
            && !bxg.this.bX();
      }

      @Override
      public boolean b() {
         return this.f > 0;
      }

      @Override
      public void c() {
         this.k();
         this.f = 2 + bxg.this.eh().a(3);
         bxg.this.w(true);
         bxg.this.N().n();
      }

      @Override
      public void d() {
         bxg.this.w(false);
      }

      @Override
      public void e() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         bxg.this.I().a(bxg.this.ds() + this.c, bxg.this.dw(), bxg.this.dy() + this.d, (float)bxg.this.ab(), (float)bxg.this.aa());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * bxg.this.eh().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + bxg.this.eh().a(20));
      }
   }

   class s extends brz {
      private int c = b(100);

      public s(double $$0) {
         super(bxg.this, $$0);
      }

      @Override
      public boolean a() {
         if (!bxg.this.fE() && this.a.q() == null) {
            if (bxg.this.dN().Z() && bxg.this.dN().g(this.a.dn())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               hx $$0 = this.a.dn();
               return bxg.this.dN().O() && bxg.this.dN().g($$0) && !((ami)bxg.this.dN()).b($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void c() {
         bxg.this.gt();
         super.c();
      }
   }

   class t extends bxg.d {
      private static final int c = b(140);
      private int d = bxg.this.ag.a(c);

      public t() {
         this.a(EnumSet.of(bsg.a.a, bsg.a.b, bsg.a.c));
      }

      @Override
      public boolean a() {
         return bxg.this.bk == 0.0F && bxg.this.bl == 0.0F && bxg.this.bm == 0.0F ? this.k() || bxg.this.fE() : false;
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
            return bxg.this.dN().O() && this.h() && !this.i() && !bxg.this.aA;
         }
      }

      @Override
      public void d() {
         this.d = bxg.this.ag.a(c);
         bxg.this.gt();
      }

      @Override
      public void c() {
         bxg.this.w(false);
         bxg.this.y(false);
         bxg.this.z(false);
         bxg.this.r(false);
         bxg.this.C(true);
         bxg.this.N().n();
         bxg.this.K().a(bxg.this.ds(), bxg.this.du(), bxg.this.dy(), 0.0);
      }
   }

   class u extends bsg {
      public u() {
         this.a(EnumSet.of(bsg.a.a, bsg.a.b));
      }

      @Override
      public boolean a() {
         if (bxg.this.fE()) {
            return false;
         } else {
            bll $$0 = bxg.this.q();
            return $$0 != null && $$0.bx() && bxg.ch.test($$0) && bxg.this.f($$0) > 36.0 && !bxg.this.bX() && !bxg.this.go() && !bxg.this.bj;
         }
      }

      @Override
      public void c() {
         bxg.this.w(false);
         bxg.this.A(false);
      }

      @Override
      public void d() {
         bll $$0 = bxg.this.q();
         if ($$0 != null && bxg.a(bxg.this, $$0)) {
            bxg.this.z(true);
            bxg.this.y(true);
            bxg.this.N().n();
            bxg.this.I().a($$0, (float)bxg.this.ab(), (float)bxg.this.aa());
         } else {
            bxg.this.z(false);
            bxg.this.y(false);
         }
      }

      @Override
      public void e() {
         bll $$0 = bxg.this.q();
         if ($$0 != null) {
            bxg.this.I().a($$0, (float)bxg.this.ab(), (float)bxg.this.aa());
            if (bxg.this.f($$0) <= 36.0) {
               bxg.this.z(true);
               bxg.this.y(true);
               bxg.this.N().n();
            } else {
               bxg.this.N().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements auk {
      a(0, "red"),
      b(1, "snow");

      public static final auk.a<bxg.v> c = auk.a(bxg.v::values);
      private static final IntFunction<bxg.v> d = asj.a(bxg.v::a, values(), asj.a.a);
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

      public static bxg.v a(String $$0) {
         return c.a($$0, a);
      }

      public static bxg.v a(int $$0) {
         return d.apply($$0);
      }

      public static bxg.v a(ig<ctd> $$0) {
         return $$0.a(arj.aq) ? b : a;
      }
   }
}
