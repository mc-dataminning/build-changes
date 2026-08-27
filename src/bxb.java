import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bxb extends bwr implements bme<bxb.v> {
   private static final afo<Integer> bX = afr.a(bxb.class, afq.b);
   private static final afo<Byte> bY = afr.a(bxb.class, afq.a);
   private static final int bZ = 1;
   public static final int bT = 4;
   public static final int bU = 8;
   public static final int bW = 16;
   private static final int ca = 32;
   private static final int cb = 64;
   private static final int cc = 128;
   private static final afo<Optional<UUID>> cd = afr.a(bxb.class, afq.q);
   private static final afo<Optional<UUID>> ce = afr.a(bxb.class, afq.q);
   static final Predicate<can> cf = $$0 -> !$$0.z() && $$0.bx();
   private static final Predicate<bkq> cg = $$0 -> !($$0 instanceof blg $$1) ? false : $$1.ek() != null && $$1.el() < $$1.ah + 600;
   static final Predicate<bkq> ch = $$0 -> $$0 instanceof bww || $$0 instanceof bxl;
   private static final Predicate<bkq> ci = $$0 -> !$$0.bV() && bkt.e.test($$0);
   private static final int cj = 600;
   private bsb ck;
   private bsb cl;
   private bsb cm;
   private float cn;
   private float co;
   float cp;
   float cq;
   private int cr;

   public bxb(bku<? extends bxb> $$0, csa $$1) {
      super($$0, $$1);
      this.bK = new bxb.k();
      this.bL = new bxb.m();
      this.a(edd.p, 0.0F);
      this.a(edd.q, 0.0F);
      this.s(true);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(cd, Optional.empty());
      this.an.a(ce, Optional.empty());
      this.an.a(bX, 0);
      this.an.a(bY, (byte)0);
   }

   @Override
   protected void B() {
      this.ck = new btu<>(this, bwr.class, 10, false, false, $$0 -> $$0 instanceof bww || $$0 instanceof bxl);
      this.cl = new btu<>(this, bxs.class, 10, false, false, bxs.bU);
      this.cm = new btu<>(this, bwo.class, 20, false, false, $$0 -> $$0 instanceof bwq);
      this.bO.a(0, new bxb.g());
      this.bO.a(0, new brq(this, this.dN()));
      this.bO.a(1, new bxb.b());
      this.bO.a(2, new bxb.n(2.2));
      this.bO.a(3, new bxb.e(1.0));
      this.bO.a(4, new bri<>(this, cdu.class, 16.0F, 1.6, 1.4, $$0 -> ci.test($$0) && !this.c($$0.cw()) && !this.gr()));
      this.bO.a(4, new bri<>(this, bxu.class, 8.0F, 1.6, 1.4, $$0 -> !((bxu)$$0).u() && !this.gr()));
      this.bO.a(4, new bri<>(this, bxj.class, 8.0F, 1.6, 1.4, $$0 -> !this.gr()));
      this.bO.a(5, new bxb.u());
      this.bO.a(6, new bxb.o());
      this.bO.a(6, new bxb.s(1.25));
      this.bO.a(7, new bxb.l(1.2F, true));
      this.bO.a(7, new bxb.t());
      this.bO.a(8, new bxb.h(this, 1.25));
      this.bO.a(9, new bxb.q(32, 200));
      this.bO.a(10, new bxb.f(1.2F, 12, 1));
      this.bO.a(10, new bsh(this, 0.4F));
      this.bO.a(11, new bto(this, 1.0));
      this.bO.a(11, new bxb.p());
      this.bO.a(12, new bxb.j(this, cdu.class, 24.0F));
      this.bO.a(13, new bxb.r());
      this.bP.a(3, new bxb.a(blg.class, false, false, $$0 -> cg.test($$0) && !this.c($$0.cw())));
   }

   @Override
   public aqq d(clj $$0) {
      return aqr.iw;
   }

   @Override
   public void c_() {
      if (!this.dN().B && this.bx() && this.cZ()) {
         this.cr++;
         clj $$0 = this.c(bkv.a);
         if (this.l($$0)) {
            if (this.cr > 600) {
               clj $$1 = $$0.a(this.dN(), this);
               if (!$$1.b()) {
                  this.a(bkv.a, $$1);
               }

               this.cr = 0;
            } else if (this.cr > 560 && this.ag.i() < 0.1F) {
               this.a(this.d($$0), 1.0F, 1.0F);
               this.dN().a(this, (byte)45);
            }
         }

         blg $$2 = this.q();
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

      super.c_();
      if (this.gr() && this.ag.i() < 0.05F) {
         this.a(aqr.is, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean eZ() {
      return this.ex();
   }

   private boolean l(clj $$0) {
      return $$0.d().u() && this.q() == null && this.aC() && !this.fE();
   }

   @Override
   protected void a(ats $$0, biv $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         clj $$3;
         if ($$2 < 0.05F) {
            $$3 = new clj(clm.ow);
         } else if ($$2 < 0.2F) {
            $$3 = new clj(clm.qO);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new clj(clm.uv) : new clj(clm.uw);
         } else if ($$2 < 0.6F) {
            $$3 = new clj(clm.pt);
         } else if ($$2 < 0.8F) {
            $$3 = new clj(clm.qA);
         } else {
            $$3 = new clj(clm.pq);
         }

         this.a(bkv.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         clj $$1 = this.c(bkv.a);
         if (!$$1.b()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               eju $$3 = new eju(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dF() * (float) (Math.PI / 180.0))
                  .b(-this.dD() * (float) (Math.PI / 180.0));
               this.dN().a(new jo(js.O, $$1), this.ds() + this.bF().c / 2.0, this.du(), this.dy() + this.bF().e / 2.0, $$3.c, $$3.d + 0.05, $$3.e);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static bml.a u() {
      return bli.C().a(bmm.m, 0.3F).a(bmm.l, 10.0).a(bmm.g, 32.0).a(bmm.c, 2.0);
   }

   @Nullable
   public bxb b(ame $$0, bkl $$1) {
      bxb $$2 = bku.N.a((csa)$$0);
      if ($$2 != null) {
         $$2.a(this.ag.h() ? this.w() : ((bxb)$$1).w());
      }

      return $$2;
   }

   public static boolean c(bku<bxb> $$0, csb $$1, blk $$2, ht $$3, ats $$4) {
      return $$1.a_($$3.d()).a(arg.bW) && a($$1, $$3);
   }

   @Nullable
   @Override
   public blz a(csp $$0, biv $$1, blk $$2, @Nullable blz $$3, @Nullable rz $$4) {
      ib<csy> $$5 = $$0.s(this.dn());
      bxb.v $$6 = bxb.v.a($$5);
      boolean $$7 = false;
      if ($$3 instanceof bxb.i $$8) {
         $$6 = $$8.a;
         if ($$8.a() >= 2) {
            $$7 = true;
         }
      } else {
         $$3 = new bxb.i($$6);
      }

      this.a($$6);
      if ($$7) {
         this.c_(-24000);
      }

      if ($$0 instanceof ame) {
         this.gp();
      }

      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void gp() {
      if (this.w() == bxb.v.a) {
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
   protected void a(cdu $$0, biw $$1, clj $$2) {
      if (this.m($$2)) {
         this.a(this.d($$2), 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   @Override
   protected float b(bls $$0, bkr $$1) {
      return this.n_() ? $$1.b * 0.85F : 0.4F;
   }

   public bxb.v w() {
      return bxb.v.a(this.an.b(bX));
   }

   public void a(bxb.v $$0) {
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
   public void b(rz $$0) {
      super.b($$0);
      List<UUID> $$1 = this.gq();
      sf $$2 = new sf();

      for (UUID $$3 : $$1) {
         if ($$3 != null) {
            $$2.add(so.a($$3));
         }
      }

      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fE());
      $$0.a("Type", this.w().c());
      $$0.a("Sitting", this.A());
      $$0.a("Crouching", this.bX());
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);

      for (sw $$2 : $$0.c("Trusted", 11)) {
         this.b(so.a($$2));
      }

      this.C($$0.q("Sleeping"));
      this.a(bxb.v.a($$0.l("Type")));
      this.w($$0.q("Sitting"));
      this.y($$0.q("Crouching"));
      if (this.dN() instanceof ame) {
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
   public boolean f(clj $$0) {
      bkv $$1 = bli.h($$0);
      return !this.c($$1).b() ? false : $$1 == bkv.a && super.f($$0);
   }

   @Override
   public boolean j(clj $$0) {
      cle $$1 = $$0.d();
      clj $$2 = this.c(bkv.a);
      return $$2.b() || this.cr > 0 && $$1.u() && !$$2.d().u();
   }

   private void n(clj $$0) {
      if (!$$0.b() && !this.dN().B) {
         can $$1 = new can(this.dN(), this.ds() + this.bF().c, this.du() + 1.0, this.dy() + this.bF().e, $$0);
         $$1.b(40);
         $$1.a(this);
         this.a(aqr.iB, 1.0F, 1.0F);
         this.dN().b($$1);
      }
   }

   private void o(clj $$0) {
      can $$1 = new can(this.dN(), this.ds(), this.du(), this.dy(), $$0);
      this.dN().b($$1);
   }

   @Override
   protected void b(can $$0) {
      clj $$1 = $$0.q();
      if (this.j($$1)) {
         int $$2 = $$1.L();
         if ($$2 > 1) {
            this.o($$1.a($$2 - 1));
         }

         this.n(this.c(bkv.a));
         this.a($$0);
         this.a(bkv.a, $$1.a(1));
         this.e(bkv.a);
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
            ht $$1 = this.dn();
            dhi $$2 = this.dN().a_($$1);
            this.dN().c(2001, $$1, cva.i($$2));
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
   public boolean m(clj $$0) {
      return $$0.a(aro.X);
   }

   @Override
   protected void a(cdu $$0, bli $$1) {
      ((bxb)$$1).b($$0.cw());
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
      return atm.i($$0, this.co, this.cn) * 0.11F * (float) Math.PI;
   }

   public float F(float $$0) {
      return atm.i($$0, this.cq, this.cp);
   }

   @Override
   public void h(@Nullable blg $$0) {
      if (this.gr() && $$0 == null) {
         this.B(false);
      }

      super.h($$0);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return atm.f(($$0 - 5.0F) * $$1);
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
      aqq $$0 = this.y();
      if ($$0 == aqr.iy) {
         this.a($$0, 2.0F, this.eY());
      } else {
         super.R();
      }
   }

   @Nullable
   @Override
   protected aqq y() {
      if (this.fE()) {
         return aqr.iz;
      } else {
         if (!this.dN().O() && this.ag.i() < 0.1F) {
            List<cdu> $$0 = this.dN().a(cdu.class, this.cH().c(16.0, 16.0, 16.0), bkt.f);
            if ($$0.isEmpty()) {
               return aqr.iy;
            }
         }

         return aqr.it;
      }
   }

   @Nullable
   @Override
   protected aqq d(bjo $$0) {
      return aqr.ix;
   }

   @Nullable
   @Override
   protected aqq m_() {
      return aqr.iv;
   }

   boolean c(UUID $$0) {
      return this.gq().contains($$0);
   }

   @Override
   protected void g(bjo $$0) {
      clj $$1 = this.c(bkv.a);
      if (!$$1.b()) {
         this.b($$1);
         this.a(bkv.a, clj.b);
      }

      super.g($$0);
   }

   @Override
   protected Vector3f a(bkq $$0, bkr $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + -0.0625F * $$2, -0.25F * $$2);
   }

   public static boolean a(bxb $$0, blg $$1) {
      double $$2 = $$1.dy() - $$0.dy();
      double $$3 = $$1.ds() - $$0.ds();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dN().a_(ht.a($$0.ds() + $$8, $$0.du() + (double)$$9, $$0.dy() + $$7)).r()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public eju cJ() {
      return new eju(0.0, (double)(0.55F * this.cI()), (double)(this.dh() * 0.4F));
   }

   class a extends btu<blg> {
      @Nullable
      private blg j;
      @Nullable
      private blg k;
      private int l;

      public a(Class<blg> $$0, boolean $$1, boolean $$2, @Nullable Predicate<blg> $$3) {
         super(bxb.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean a() {
         if (this.b > 0 && this.e.eh().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : bxb.this.gq()) {
               if ($$0 != null && bxb.this.dN() instanceof ame && ((ame)bxb.this.dN()).a($$0) instanceof blg $$2) {
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

         bxb.this.a(aqr.is, 1.0F, 1.0F);
         bxb.this.B(true);
         bxb.this.gs();
         super.c();
      }
   }

   class b extends bsb {
      int a;

      public b() {
         this.a(EnumSet.of(bsb.a.b, bsb.a.c, bsb.a.a));
      }

      @Override
      public boolean a() {
         return bxb.this.gf();
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
         bxb.this.A(false);
      }

      @Override
      public void e() {
         this.a--;
      }
   }

   public class c implements Predicate<blg> {
      public boolean a(blg $$0) {
         if ($$0 instanceof bxb) {
            return false;
         } else if ($$0 instanceof bww || $$0 instanceof bxl || $$0 instanceof cbi) {
            return true;
         } else if ($$0 instanceof bmb) {
            return !((bmb)$$0).u();
         } else if (!($$0 instanceof cdu) || !$$0.O_() && !((cdu)$$0).f()) {
            return bxb.this.c($$0.cw()) ? false : !$$0.fE() && !$$0.bV();
         } else {
            return false;
         }
      }
   }

   abstract class d extends bsb {
      private final bvs b = bvs.a().a(12.0).d().a(bxb.this.new c());

      protected boolean h() {
         ht $$0 = ht.a(bxb.this.ds(), bxb.this.cH().e, bxb.this.dy());
         return !bxb.this.dN().g($$0) && bxb.this.h($$0) >= 0.0F;
      }

      protected boolean i() {
         return !bxb.this.dN().a(blg.class, this.b, bxb.this, bxb.this.cH().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends brn {
      public e(double $$0) {
         super(bxb.this, $$0);
      }

      @Override
      public void c() {
         ((bxb)this.a).gt();
         ((bxb)this.c).gt();
         super.c();
      }

      @Override
      protected void g() {
         ame $$0 = (ame)this.b;
         bxb $$1 = (bxb)this.a.a($$0, (bkl)this.c);
         if ($$1 != null) {
            amf $$2 = this.a.gi();
            amf $$3 = this.c.gi();
            amf $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.cw());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.cw());
            }

            if ($$4 != null) {
               $$4.a(arb.P);
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
            if (this.b.Y().b(crw.f)) {
               this.b.b(new bkw(this.b, this.a.ds(), this.a.du(), this.a.dy(), this.a.eh().a(7) + 1));
            }
         }
      }
   }

   public class f extends bso {
      private static final int i = 40;
      protected int g;

      public f(double $$1, int $$2, int $$3) {
         super(bxb.this, $$1, $$2, $$3);
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
      protected boolean a(csd $$0, ht $$1) {
         dhi $$2 = $$0.a_($$1);
         return $$2.a(cvc.oi) && $$2.c(ddc.c) >= 2 || cvw.h_($$2);
      }

      @Override
      public void e() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && bxb.this.ag.i() < 0.05F) {
            bxb.this.a(aqr.iA, 1.0F, 1.0F);
         }

         super.e();
      }

      protected void o() {
         if (bxb.this.dN().Y().b(crw.c)) {
            dhi $$0 = bxb.this.dN().a_(this.e);
            if ($$0.a(cvc.oi)) {
               this.b($$0);
            } else if (cvw.h_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dhi $$0) {
         cvw.a(bxb.this, $$0, bxb.this.dN(), this.e);
      }

      private void b(dhi $$0) {
         int $$1 = $$0.c(ddc.c);
         $$0.a(ddc.c, Integer.valueOf(1));
         int $$2 = 1 + bxb.this.dN().z.a(2) + ($$1 == 3 ? 1 : 0);
         clj $$3 = bxb.this.c(bkv.a);
         if ($$3.b()) {
            bxb.this.a(bkv.a, new clj(clm.wh));
            $$2--;
         }

         if ($$2 > 0) {
            cva.a(bxb.this.dN(), this.e, new clj(clm.wh, $$2));
         }

         bxb.this.a(aqr.ya, 1.0F, 1.0F);
         bxb.this.dN().a(this.e, $$0.a(ddc.c, Integer.valueOf(1)), 2);
         bxb.this.dN().a(dls.c, this.e, dls.a.a(bxb.this));
      }

      @Override
      public boolean a() {
         return !bxb.this.fE() && super.a();
      }

      @Override
      public void c() {
         this.g = 0;
         bxb.this.w(false);
         super.c();
      }
   }

   class g extends brv {
      public g() {
         super(bxb.this);
      }

      @Override
      public void c() {
         super.c();
         bxb.this.gt();
      }

      @Override
      public boolean a() {
         return bxb.this.aZ() && bxb.this.b(arl.a) > 0.25 || bxb.this.bn();
      }
   }

   class h extends bsa {
      private final bxb e;

      public h(bxb $$0, double $$1) {
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

   public static class i extends bkl.a {
      public final bxb.v a;

      public i(bxb.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends bsj {
      public j(bli $$0, Class<? extends blg> $$1, float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && !bxb.this.gf() && !bxb.this.go();
      }

      @Override
      public boolean b() {
         return super.b() && !bxb.this.gf() && !bxb.this.go();
      }
   }

   public class k extends brd {
      public k() {
         super(bxb.this);
      }

      @Override
      public void a() {
         if (!bxb.this.fE()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !bxb.this.gl() && !bxb.this.bX() && !bxb.this.go() && !bxb.this.gf();
      }
   }

   class l extends bsl {
      public l(double $$0, boolean $$1) {
         super(bxb.this, $$0, $$1);
      }

      @Override
      protected void a(blg $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            bxb.this.a(aqr.iu, 1.0F, 1.0F);
         }
      }

      @Override
      public void c() {
         bxb.this.z(false);
         super.c();
      }

      @Override
      public boolean a() {
         return !bxb.this.A() && !bxb.this.fE() && !bxb.this.bX() && !bxb.this.gf() && super.a();
      }
   }

   class m extends bre {
      public m() {
         super(bxb.this);
      }

      @Override
      public void a() {
         if (bxb.this.gu()) {
            super.a();
         }
      }
   }

   class n extends bsu {
      public n(double $$0) {
         super(bxb.this, $$0);
      }

      @Override
      public boolean h() {
         return !bxb.this.gr() && super.h();
      }
   }

   public class o extends bsf {
      @Override
      public boolean a() {
         if (!bxb.this.gn()) {
            return false;
         } else {
            blg $$0 = bxb.this.q();
            if ($$0 != null && $$0.bx()) {
               if ($$0.cF() != $$0.cE()) {
                  return false;
               } else {
                  boolean $$1 = bxb.a(bxb.this, $$0);
                  if (!$$1) {
                     bxb.this.N().a($$0, 0);
                     bxb.this.y(false);
                     bxb.this.z(false);
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
         blg $$0 = bxb.this.q();
         if ($$0 != null && $$0.bx()) {
            double $$1 = bxb.this.dq().d;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(bxb.this.dF()) < 15.0F) || !bxb.this.aC()) && !bxb.this.gf();
         } else {
            return false;
         }
      }

      @Override
      public boolean R_() {
         return false;
      }

      @Override
      public void c() {
         bxb.this.r(true);
         bxb.this.x(true);
         bxb.this.z(false);
         blg $$0 = bxb.this.q();
         if ($$0 != null) {
            bxb.this.I().a($$0, 60.0F, 30.0F);
            eju $$1 = new eju($$0.ds() - bxb.this.ds(), $$0.du() - bxb.this.du(), $$0.dy() - bxb.this.dy()).d();
            bxb.this.g(bxb.this.dq().b($$1.c * 0.8, 0.9, $$1.e * 0.8));
         }

         bxb.this.N().n();
      }

      @Override
      public void d() {
         bxb.this.y(false);
         bxb.this.cp = 0.0F;
         bxb.this.cq = 0.0F;
         bxb.this.z(false);
         bxb.this.x(false);
      }

      @Override
      public void e() {
         blg $$0 = bxb.this.q();
         if ($$0 != null) {
            bxb.this.I().a($$0, 60.0F, 30.0F);
         }

         if (!bxb.this.gf()) {
            eju $$1 = bxb.this.dq();
            if ($$1.d * $$1.d < 0.03F && bxb.this.dF() != 0.0F) {
               bxb.this.s(atm.j(0.2F, bxb.this.dF(), 0.0F));
            } else {
               double $$2 = $$1.h();
               double $$3 = Math.signum(-$$1.d) * Math.acos($$2 / $$1.f()) * 180.0F / (float)Math.PI;
               bxb.this.s((float)$$3);
            }
         }

         if ($$0 != null && bxb.this.e((bkq)$$0) <= 2.0F) {
            bxb.this.C($$0);
         } else if (bxb.this.dF() > 0.0F && bxb.this.aC() && (float)bxb.this.dq().d != 0.0F && bxb.this.dN().a_(bxb.this.dn()).a(cvc.dN)) {
            bxb.this.s(60.0F);
            bxb.this.h(null);
            bxb.this.A(true);
         }
      }
   }

   class p extends bsb {
      public p() {
         this.a(EnumSet.of(bsb.a.a));
      }

      @Override
      public boolean a() {
         if (!bxb.this.c(bkv.a).b()) {
            return false;
         } else if (bxb.this.q() != null || bxb.this.ei() != null) {
            return false;
         } else if (!bxb.this.gu()) {
            return false;
         } else if (bxb.this.eh().a(b(10)) != 0) {
            return false;
         } else {
            List<can> $$0 = bxb.this.dN().a(can.class, bxb.this.cH().c(8.0, 8.0, 8.0), bxb.cf);
            return !$$0.isEmpty() && bxb.this.c(bkv.a).b();
         }
      }

      @Override
      public void e() {
         List<can> $$0 = bxb.this.dN().a(can.class, bxb.this.cH().c(8.0, 8.0, 8.0), bxb.cf);
         clj $$1 = bxb.this.c(bkv.a);
         if ($$1.b() && !$$0.isEmpty()) {
            bxb.this.N().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void c() {
         List<can> $$0 = bxb.this.dN().a(can.class, bxb.this.cH().c(8.0, 8.0, 8.0), bxb.cf);
         if (!$$0.isEmpty()) {
            bxb.this.N().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends bth {
      public q(int $$0, int $$1) {
         super(bxb.this, $$1);
      }

      @Override
      public void c() {
         bxb.this.gt();
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
         return !bxb.this.fE() && !bxb.this.A() && !bxb.this.gr() && bxb.this.q() == null;
      }
   }

   class r extends bxb.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(bsb.a.a, bsb.a.b));
      }

      @Override
      public boolean a() {
         return bxb.this.ei() == null
            && bxb.this.eh().i() < 0.02F
            && !bxb.this.fE()
            && bxb.this.q() == null
            && bxb.this.N().l()
            && !this.i()
            && !bxb.this.gl()
            && !bxb.this.bX();
      }

      @Override
      public boolean b() {
         return this.f > 0;
      }

      @Override
      public void c() {
         this.k();
         this.f = 2 + bxb.this.eh().a(3);
         bxb.this.w(true);
         bxb.this.N().n();
      }

      @Override
      public void d() {
         bxb.this.w(false);
      }

      @Override
      public void e() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         bxb.this.I().a(bxb.this.ds() + this.c, bxb.this.dw(), bxb.this.dy() + this.d, (float)bxb.this.ab(), (float)bxb.this.aa());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * bxb.this.eh().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + bxb.this.eh().a(20));
      }
   }

   class s extends bru {
      private int c = b(100);

      public s(double $$0) {
         super(bxb.this, $$0);
      }

      @Override
      public boolean a() {
         if (!bxb.this.fE() && this.a.q() == null) {
            if (bxb.this.dN().Z() && bxb.this.dN().g(this.a.dn())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               ht $$0 = this.a.dn();
               return bxb.this.dN().O() && bxb.this.dN().g($$0) && !((ame)bxb.this.dN()).b($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void c() {
         bxb.this.gt();
         super.c();
      }
   }

   class t extends bxb.d {
      private static final int c = b(140);
      private int d = bxb.this.ag.a(c);

      public t() {
         this.a(EnumSet.of(bsb.a.a, bsb.a.b, bsb.a.c));
      }

      @Override
      public boolean a() {
         return bxb.this.bk == 0.0F && bxb.this.bl == 0.0F && bxb.this.bm == 0.0F ? this.k() || bxb.this.fE() : false;
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
            return bxb.this.dN().O() && this.h() && !this.i() && !bxb.this.aA;
         }
      }

      @Override
      public void d() {
         this.d = bxb.this.ag.a(c);
         bxb.this.gt();
      }

      @Override
      public void c() {
         bxb.this.w(false);
         bxb.this.y(false);
         bxb.this.z(false);
         bxb.this.r(false);
         bxb.this.C(true);
         bxb.this.N().n();
         bxb.this.K().a(bxb.this.ds(), bxb.this.du(), bxb.this.dy(), 0.0);
      }
   }

   class u extends bsb {
      public u() {
         this.a(EnumSet.of(bsb.a.a, bsb.a.b));
      }

      @Override
      public boolean a() {
         if (bxb.this.fE()) {
            return false;
         } else {
            blg $$0 = bxb.this.q();
            return $$0 != null && $$0.bx() && bxb.ch.test($$0) && bxb.this.f($$0) > 36.0 && !bxb.this.bX() && !bxb.this.go() && !bxb.this.bj;
         }
      }

      @Override
      public void c() {
         bxb.this.w(false);
         bxb.this.A(false);
      }

      @Override
      public void d() {
         blg $$0 = bxb.this.q();
         if ($$0 != null && bxb.a(bxb.this, $$0)) {
            bxb.this.z(true);
            bxb.this.y(true);
            bxb.this.N().n();
            bxb.this.I().a($$0, (float)bxb.this.ab(), (float)bxb.this.aa());
         } else {
            bxb.this.z(false);
            bxb.this.y(false);
         }
      }

      @Override
      public void e() {
         blg $$0 = bxb.this.q();
         if ($$0 != null) {
            bxb.this.I().a($$0, (float)bxb.this.ab(), (float)bxb.this.aa());
            if (bxb.this.f($$0) <= 36.0) {
               bxb.this.z(true);
               bxb.this.y(true);
               bxb.this.N().n();
            } else {
               bxb.this.N().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements aug {
      a(0, "red"),
      b(1, "snow");

      public static final aug.a<bxb.v> c = aug.a(bxb.v::values);
      private static final IntFunction<bxb.v> d = asf.a(bxb.v::a, values(), asf.a.a);
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

      public static bxb.v a(String $$0) {
         return c.a($$0, a);
      }

      public static bxb.v a(int $$0) {
         return d.apply($$0);
      }

      public static bxb.v a(ib<csy> $$0) {
         return $$0.a(arf.aq) ? b : a;
      }
   }
}
