import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfr extends cfh implements bur<cfr.v> {
   private static final akk<Integer> cc = ako.a(cfr.class, akm.b);
   private static final akk<Byte> cd = ako.a(cfr.class, akm.a);
   private static final int ce = 1;
   public static final int bY = 4;
   public static final int bZ = 8;
   public static final int cb = 16;
   private static final int cf = 32;
   private static final int cg = 64;
   private static final int ch = 128;
   private static final akk<Optional<UUID>> ci = ako.a(cfr.class, akm.r);
   private static final akk<Optional<UUID>> cj = ako.a(cfr.class, akm.r);
   static final Predicate<cjj> ck = $$0 -> !$$0.y() && $$0.bD();
   private static final Predicate<bsw> cl = $$0 -> !($$0 instanceof btr $$1) ? false : $$1.eo() != null && $$1.ep() < $$1.ai + 600;
   static final Predicate<bsw> cm = $$0 -> $$0 instanceof cfm || $$0 instanceof cgb;
   private static final Predicate<bsw> cn = $$0 -> !$$0.bY() && btb.e.test($$0);
   private static final int co = 600;
   private static final bsz cp = btc.Q.n().a(0.5F).b(0.2975F);
   private cap cq;
   private cap cr;
   private cap cs;
   private float ct;
   private float cu;
   float cv;
   float cw;
   private int cx;

   public cfr(btc<? extends cfr> $$0, dca $$1) {
      super($$0, $$1);
      this.bO = new cfr.k();
      this.bP = new cfr.m();
      this.a(eoo.p, 0.0F);
      this.a(eoo.q, 0.0F);
      this.a_(true);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(ci, Optional.empty());
      $$0.a(cj, Optional.empty());
      $$0.a(cc, 0);
      $$0.a(cd, (byte)0);
   }

   @Override
   protected void z() {
      this.cq = new cci<>(this, cfh.class, 10, false, false, $$0 -> $$0 instanceof cfm || $$0 instanceof cgb);
      this.cr = new cci<>(this, cgi.class, 10, false, false, cgi.bY);
      this.cs = new cci<>(this, cfe.class, 20, false, false, $$0 -> $$0 instanceof cfg);
      this.bS.a(0, new cfr.g());
      this.bS.a(0, new cae(this, this.dP()));
      this.bS.a(1, new cfr.b());
      this.bS.a(2, new cfr.n(2.2));
      this.bS.a(3, new cfr.e(1.0));
      this.bS.a(4, new bzw<>(this, cmz.class, 16.0F, 1.6, 1.4, $$0 -> cn.test($$0) && !this.c($$0.cz()) && !this.gC()));
      this.bS.a(4, new bzw<>(this, cgk.class, 8.0F, 1.6, 1.4, $$0 -> !((cgk)$$0).s() && !this.gC()));
      this.bS.a(4, new bzw<>(this, cfz.class, 8.0F, 1.6, 1.4, $$0 -> !this.gC()));
      this.bS.a(5, new cfr.u());
      this.bS.a(6, new cfr.o());
      this.bS.a(6, new cfr.s(1.25));
      this.bS.a(7, new cfr.l(1.2F, true));
      this.bS.a(7, new cfr.t());
      this.bS.a(8, new cfr.h(this, 1.25));
      this.bS.a(9, new cfr.q(32, 200));
      this.bS.a(10, new cfr.f(1.2F, 12, 1));
      this.bS.a(10, new cav(this, 0.4F));
      this.bS.a(11, new ccc(this, 1.0));
      this.bS.a(11, new cfr.p());
      this.bS.a(12, new cfr.j(this, cmz.class, 24.0F));
      this.bS.a(13, new cfr.r());
      this.bT.a(3, new cfr.a(btr.class, false, false, $$0 -> cl.test($$0) && !this.c($$0.cz())));
   }

   @Override
   public avz d(cur $$0) {
      return awa.jj;
   }

   @Override
   public void n_() {
      if (!this.dP().B && this.bD() && this.db()) {
         this.cx++;
         cur $$0 = this.a(btd.a);
         if (this.n($$0)) {
            if (this.cx > 600) {
               cur $$1 = $$0.a(this.dP(), this);
               if (!$$1.e()) {
                  this.a(btd.a, $$1);
               }

               this.cx = 0;
            } else if (this.cx > 560 && this.ah.i() < 0.1F) {
               this.a(this.d($$0), 1.0F, 1.0F);
               this.dP().a(this, (byte)45);
            }
         }

         btr $$2 = this.p();
         if ($$2 == null || !$$2.bD()) {
            this.y(false);
            this.z(false);
         }
      }

      if (this.fL() || this.fg()) {
         this.bn = false;
         this.bo = 0.0F;
         this.bq = 0.0F;
      }

      super.n_();
      if (this.gC() && this.ah.i() < 0.05F) {
         this.a(awa.jf, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean fg() {
      return this.eB();
   }

   private boolean n(cur $$0) {
      return $$0.b(km.v) && this.p() == null && this.aE() && !this.fL();
   }

   @Override
   protected void a(azh $$0, bqu $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cur $$3;
         if ($$2 < 0.05F) {
            $$3 = new cur(cuu.oz);
         } else if ($$2 < 0.2F) {
            $$3 = new cur(cuu.qR);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cur(cuu.uD) : new cur(cuu.uE);
         } else if ($$2 < 0.6F) {
            $$3 = new cur(cuu.pw);
         } else if ($$2 < 0.8F) {
            $$3 = new cur(cuu.qD);
         } else {
            $$3 = new cur(cuu.pt);
         }

         this.a(btd.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cur $$1 = this.a(btd.a);
         if (!$$1.e()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               evt $$3 = new evt(((double)this.ah.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dH() * (float) (Math.PI / 180.0))
                  .b(-this.dF() * (float) (Math.PI / 180.0));
               this.dP().a(new le(li.S, $$1), this.du() + this.bL().c / 2.0, this.dw(), this.dA() + this.bL().e / 2.0, $$3.c, $$3.d + 0.05, $$3.e);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static buy.a s() {
      return btt.A().a(buz.r, 0.3F).a(buz.q, 10.0).a(buz.k, 32.0).a(buz.c, 2.0).a(buz.s, 5.0);
   }

   @Nullable
   public cfr b(arf $$0, bsq $$1) {
      cfr $$2 = btc.Q.a((dca)$$0);
      if ($$2 != null) {
         $$2.a(this.ah.h() ? this.u() : ((cfr)$$1).u());
      }

      return $$2;
   }

   public static boolean c(btc<cfr> $$0, dcb $$1, btv $$2, iz $$3, azh $$4) {
      return $$1.a_($$3.d()).a(awp.ce) && a($$1, $$3);
   }

   @Nullable
   @Override
   public buk a(dcp $$0, bqu $$1, btv $$2, @Nullable buk $$3) {
      ji<dcz> $$4 = $$0.t(this.dp());
      cfr.v $$5 = cfr.v.a($$4);
      boolean $$6 = false;
      if ($$3 instanceof cfr.i $$7) {
         $$5 = $$7.a;
         if ($$7.a() >= 2) {
            $$6 = true;
         }
      } else {
         $$3 = new cfr.i($$5);
      }

      this.a($$5);
      if ($$6) {
         this.c_(-24000);
      }

      if ($$0 instanceof arf) {
         this.gA();
      }

      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   private void gA() {
      if (this.u() == cfr.v.a) {
         this.bT.a(4, this.cq);
         this.bT.a(4, this.cr);
         this.bT.a(6, this.cs);
      } else {
         this.bT.a(4, this.cs);
         this.bT.a(6, this.cq);
         this.bT.a(6, this.cr);
      }
   }

   @Override
   protected void a(cmz $$0, bqv $$1, cur $$2) {
      if (this.o($$2)) {
         this.a(this.d($$2), 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   @Override
   public bsz e(bud $$0) {
      return this.p_() ? cp : super.e($$0);
   }

   public cfr.v u() {
      return cfr.v.a(this.ao.a(cc));
   }

   public void a(cfr.v $$0) {
      this.ao.a(cc, $$0.a());
   }

   List<UUID> gB() {
      List<UUID> $$0 = Lists.newArrayList();
      $$0.add(this.ao.a(ci).orElse(null));
      $$0.add(this.ao.a(cj).orElse(null));
      return $$0;
   }

   void b(@Nullable UUID $$0) {
      if (this.ao.a(ci).isPresent()) {
         this.ao.a(cj, Optional.ofNullable($$0));
      } else {
         this.ao.a(ci, Optional.ofNullable($$0));
      }
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      List<UUID> $$1 = this.gB();
      uy $$2 = new uy();

      for (UUID $$3 : $$1) {
         if ($$3 != null) {
            $$2.add(vh.a($$3));
         }
      }

      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fL());
      $$0.a("Type", this.u().c());
      $$0.a("Sitting", this.y());
      $$0.a("Crouching", this.ca());
   }

   @Override
   public void a(us $$0) {
      super.a($$0);

      for (vp $$2 : $$0.c("Trusted", 11)) {
         this.b(vh.a($$2));
      }

      this.C($$0.q("Sleeping"));
      this.a(cfr.v.a($$0.l("Type")));
      this.w($$0.q("Sitting"));
      this.y($$0.q("Crouching"));
      if (this.dP() instanceof arf) {
         this.gA();
      }
   }

   public boolean y() {
      return this.u(1);
   }

   public void w(boolean $$0) {
      this.d(1, $$0);
   }

   public boolean gq() {
      return this.u(64);
   }

   void A(boolean $$0) {
      this.d(64, $$0);
   }

   boolean gC() {
      return this.u(128);
   }

   void B(boolean $$0) {
      this.d(128, $$0);
   }

   @Override
   public boolean fL() {
      return this.u(32);
   }

   void C(boolean $$0) {
      this.d(32, $$0);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.ao.a(cd, (byte)(this.ao.a(cd) | $$0));
      } else {
         this.ao.a(cd, (byte)(this.ao.a(cd) & ~$$0));
      }
   }

   private boolean u(int $$0) {
      return (this.ao.a(cd) & $$0) != 0;
   }

   @Override
   public boolean f(cur $$0) {
      btd $$1 = btt.h($$0);
      return !this.a($$1).e() ? false : $$1 == btd.a && super.f($$0);
   }

   @Override
   public boolean j(cur $$0) {
      cur $$1 = this.a(btd.a);
      return $$1.e() || this.cx > 0 && $$0.b(km.v) && !$$1.b(km.v);
   }

   private void p(cur $$0) {
      if (!$$0.e() && !this.dP().B) {
         cjj $$1 = new cjj(this.dP(), this.du() + this.bL().c, this.dw() + 1.0, this.dA() + this.bL().e, $$0);
         $$1.b(40);
         $$1.b(this);
         this.a(awa.jo, 1.0F, 1.0F);
         this.dP().b($$1);
      }
   }

   private void q(cur $$0) {
      cjj $$1 = new cjj(this.dP(), this.du(), this.dw(), this.dA(), $$0);
      this.dP().b($$1);
   }

   @Override
   protected void b(cjj $$0) {
      cur $$1 = $$0.p();
      if (this.j($$1)) {
         int $$2 = $$1.I();
         if ($$2 > 1) {
            this.q($$1.a($$2 - 1));
         }

         this.p(this.a(btd.a));
         this.a($$0);
         this.a(btd.a, $$1.a(1));
         this.f(btd.a);
         this.a($$0, $$1.I());
         $$0.ao();
         this.cx = 0;
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.db()) {
         boolean $$0 = this.be();
         if ($$0 || this.p() != null || this.dP().ac()) {
            this.gD();
         }

         if ($$0 || this.fL()) {
            this.w(false);
         }

         if (this.gq() && this.dP().z.i() < 0.2F) {
            iz $$1 = this.dp();
            dse $$2 = this.dP().a_($$1);
            this.dP().c(2001, $$1, dfb.i($$2));
         }
      }

      this.cu = this.ct;
      if (this.gz()) {
         this.ct = this.ct + (1.0F - this.ct) * 0.4F;
      } else {
         this.ct = this.ct + (0.0F - this.ct) * 0.4F;
      }

      this.cw = this.cv;
      if (this.ca()) {
         this.cv += 0.2F;
         if (this.cv > 3.0F) {
            this.cv = 3.0F;
         }
      } else {
         this.cv = 0.0F;
      }
   }

   @Override
   public boolean o(cur $$0) {
      return $$0.a(awy.Z);
   }

   @Override
   protected void a(cmz $$0, btt $$1) {
      ((cfr)$$1).b($$0.cz());
   }

   public boolean gw() {
      return this.u(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gx() {
      return this.bn;
   }

   public boolean gy() {
      return this.cv == 3.0F;
   }

   public void y(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   public boolean ca() {
      return this.u(4);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean gz() {
      return this.u(8);
   }

   public float G(float $$0) {
      return ayz.i($$0, this.cu, this.ct) * 0.11F * (float) Math.PI;
   }

   public float H(float $$0) {
      return ayz.i($$0, this.cw, this.cv);
   }

   @Override
   public void h(@Nullable btr $$0) {
      if (this.gC() && $$0 == null) {
         this.B(false);
      }

      super.h($$0);
   }

   void gD() {
      this.C(false);
   }

   void gE() {
      this.z(false);
      this.y(false);
      this.w(false);
      this.C(false);
      this.B(false);
      this.A(false);
   }

   boolean gF() {
      return !this.fL() && !this.y() && !this.gq();
   }

   @Override
   public void Q() {
      avz $$0 = this.v();
      if ($$0 == awa.jl) {
         this.a($$0, 2.0F, this.ff());
      } else {
         super.Q();
      }
   }

   @Nullable
   @Override
   protected avz v() {
      if (this.fL()) {
         return awa.jm;
      } else {
         if (!this.dP().R() && this.ah.i() < 0.1F) {
            List<cmz> $$0 = this.dP().a(cmz.class, this.cK().c(16.0, 16.0, 16.0), btb.f);
            if ($$0.isEmpty()) {
               return awa.jl;
            }
         }

         return awa.jg;
      }
   }

   @Nullable
   @Override
   protected avz d(brp $$0) {
      return awa.jk;
   }

   @Nullable
   @Override
   protected avz o_() {
      return awa.ji;
   }

   boolean c(UUID $$0) {
      return this.gB().contains($$0);
   }

   @Override
   protected void g(brp $$0) {
      cur $$1 = this.a(btd.a);
      if (!$$1.e()) {
         this.b($$1);
         this.a(btd.a, cur.l);
      }

      super.g($$0);
   }

   public static boolean a(cfr $$0, btr $$1) {
      double $$2 = $$1.dA() - $$0.dA();
      double $$3 = $$1.du() - $$0.du();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dP().a_(iz.a($$0.du() + $$8, $$0.dw() + (double)$$9, $$0.dA() + $$7)).r()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public evt cM() {
      return new evt(0.0, (double)(0.55F * this.cL()), (double)(this.dj() * 0.4F));
   }

   class a extends cci<btr> {
      @Nullable
      private btr j;
      @Nullable
      private btr k;
      private int l;

      public a(final Class<btr> $$0, final boolean $$1, final boolean $$2, @Nullable final Predicate<btr> $$3) {
         super(cfr.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean a() {
         if (this.b > 0 && this.e.el().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : cfr.this.gB()) {
               if ($$0 != null && cfr.this.dP() instanceof arf && ((arf)cfr.this.dP()).a($$0) instanceof btr $$2) {
                  this.k = $$2;
                  this.j = $$2.em();
                  int $$3 = $$2.en();
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
            this.l = this.k.en();
         }

         cfr.this.a(awa.jf, 1.0F, 1.0F);
         cfr.this.B(true);
         cfr.this.gD();
         super.c();
      }
   }

   class b extends cap {
      int a;

      public b() {
         this.a(EnumSet.of(cap.a.b, cap.a.c, cap.a.a));
      }

      @Override
      public boolean a() {
         return cfr.this.gq();
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
         cfr.this.A(false);
      }

      @Override
      public void e() {
         this.a--;
      }
   }

   public class c implements Predicate<btr> {
      public boolean a(btr $$0) {
         if ($$0 instanceof cfr) {
            return false;
         } else if ($$0 instanceof cfm || $$0 instanceof cgb || $$0 instanceof ckf) {
            return true;
         } else if ($$0 instanceof buo) {
            return !((buo)$$0).s();
         } else if (!($$0 instanceof cmz) || !$$0.N_() && !((cmz)$$0).f()) {
            return cfr.this.c($$0.cz()) ? false : !$$0.fL() && !$$0.bY();
         } else {
            return false;
         }
      }
   }

   abstract class d extends cap {
      private final cei b = cei.a().a(12.0).d().a(cfr.this.new c());

      protected boolean h() {
         iz $$0 = iz.a(cfr.this.du(), cfr.this.cK().e, cfr.this.dA());
         return !cfr.this.dP().h($$0) && cfr.this.d($$0) >= 0.0F;
      }

      protected boolean i() {
         return !cfr.this.dP().a(btr.class, this.b, cfr.this, cfr.this.cK().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends cab {
      public e(final double $$0) {
         super(cfr.this, $$0);
      }

      @Override
      public void c() {
         ((cfr)this.a).gE();
         ((cfr)this.c).gE();
         super.c();
      }

      @Override
      protected void g() {
         arf $$0 = (arf)this.b;
         cfr $$1 = (cfr)this.a.a($$0, (bsq)this.c);
         if ($$1 != null) {
            arg $$2 = this.a.gt();
            arg $$3 = this.c.gt();
            arg $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.cz());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.cz());
            }

            if ($$4 != null) {
               $$4.a(awk.P);
               am.p.a($$4, this.a, this.c, $$1);
            }

            this.a.c_(6000);
            this.c.c_(6000);
            this.a.gv();
            this.c.gv();
            $$1.c_(-24000);
            $$1.b(this.a.du(), this.a.dw(), this.a.dA(), 0.0F, 0.0F);
            $$0.a_($$1);
            this.b.a(this.a, (byte)18);
            if (this.b.ab().b(dbw.f)) {
               this.b.b(new bth(this.b, this.a.du(), this.a.dw(), this.a.dA(), this.a.el().a(7) + 1));
            }
         }
      }
   }

   public class f extends cbc {
      private static final int i = 40;
      protected int g;

      public f(final double $$1, final int $$2, final int $$3) {
         super(cfr.this, $$1, $$2, $$3);
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
      protected boolean a(dcd $$0, iz $$1) {
         dse $$2 = $$0.a_($$1);
         return $$2.a(dfd.oi) && $$2.c(dne.c) >= 2 || dfx.h_($$2);
      }

      @Override
      public void e() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && cfr.this.ah.i() < 0.05F) {
            cfr.this.a(awa.jn, 1.0F, 1.0F);
         }

         super.e();
      }

      protected void o() {
         if (cfr.this.dP().ab().b(dbw.c)) {
            dse $$0 = cfr.this.dP().a_(this.e);
            if ($$0.a(dfd.oi)) {
               this.b($$0);
            } else if (dfx.h_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dse $$0) {
         dfx.a(cfr.this, $$0, cfr.this.dP(), this.e);
      }

      private void b(dse $$0) {
         int $$1 = $$0.c(dne.c);
         $$0.a(dne.c, Integer.valueOf(1));
         int $$2 = 1 + cfr.this.dP().z.a(2) + ($$1 == 3 ? 1 : 0);
         cur $$3 = cfr.this.a(btd.a);
         if ($$3.e()) {
            cfr.this.a(btd.a, new cur(cuu.wr));
            $$2--;
         }

         if ($$2 > 0) {
            dfb.a(cfr.this.dP(), this.e, new cur(cuu.wr, $$2));
         }

         cfr.this.a(awa.zp, 1.0F, 1.0F);
         cfr.this.dP().a(this.e, $$0.a(dne.c, Integer.valueOf(1)), 2);
         cfr.this.dP().a(dwx.c, this.e, dwx.a.a(cfr.this));
      }

      @Override
      public boolean a() {
         return !cfr.this.fL() && super.a();
      }

      @Override
      public void c() {
         this.g = 0;
         cfr.this.w(false);
         super.c();
      }
   }

   class g extends caj {
      public g() {
         super(cfr.this);
      }

      @Override
      public void c() {
         super.c();
         cfr.this.gE();
      }

      @Override
      public boolean a() {
         return cfr.this.be() && cfr.this.b(awv.a) > 0.25 || cfr.this.bs();
      }
   }

   class h extends cao {
      private final cfr d;

      public h(final cfr $$0, final double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean a() {
         return !this.d.gC() && super.a();
      }

      @Override
      public boolean b() {
         return !this.d.gC() && super.b();
      }

      @Override
      public void c() {
         this.d.gE();
         super.c();
      }
   }

   public static class i extends bsq.a {
      public final cfr.v a;

      public i(cfr.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends cax {
      public j(final btt $$0, final Class<? extends btr> $$1, final float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && !cfr.this.gq() && !cfr.this.gz();
      }

      @Override
      public boolean b() {
         return super.b() && !cfr.this.gq() && !cfr.this.gz();
      }
   }

   public class k extends bzr {
      public k() {
         super(cfr.this);
      }

      @Override
      public void a() {
         if (!cfr.this.fL()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cfr.this.gw() && !cfr.this.ca() && !cfr.this.gz() && !cfr.this.gq();
      }
   }

   class l extends caz {
      public l(final double $$0, final boolean $$1) {
         super(cfr.this, $$0, $$1);
      }

      @Override
      protected void a(btr $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            cfr.this.a(awa.jh, 1.0F, 1.0F);
         }
      }

      @Override
      public void c() {
         cfr.this.z(false);
         super.c();
      }

      @Override
      public boolean a() {
         return !cfr.this.y() && !cfr.this.fL() && !cfr.this.ca() && !cfr.this.gq() && super.a();
      }
   }

   class m extends bzs {
      public m() {
         super(cfr.this);
      }

      @Override
      public void a() {
         if (cfr.this.gF()) {
            super.a();
         }
      }
   }

   class n extends cbi {
      public n(final double $$0) {
         super(cfr.this, $$0);
      }

      @Override
      public boolean h() {
         return !cfr.this.gC() && super.h();
      }
   }

   public class o extends cat {
      @Override
      public boolean a() {
         if (!cfr.this.gy()) {
            return false;
         } else {
            btr $$0 = cfr.this.p();
            if ($$0 != null && $$0.bD()) {
               if ($$0.cI() != $$0.cH()) {
                  return false;
               } else {
                  boolean $$1 = cfr.a(cfr.this, $$0);
                  if (!$$1) {
                     cfr.this.K().a($$0, 0);
                     cfr.this.y(false);
                     cfr.this.z(false);
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
         btr $$0 = cfr.this.p();
         if ($$0 != null && $$0.bD()) {
            double $$1 = cfr.this.ds().d;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(cfr.this.dH()) < 15.0F) || !cfr.this.aE()) && !cfr.this.gq();
         } else {
            return false;
         }
      }

      @Override
      public boolean Q_() {
         return false;
      }

      @Override
      public void c() {
         cfr.this.s(true);
         cfr.this.x(true);
         cfr.this.z(false);
         btr $$0 = cfr.this.p();
         if ($$0 != null) {
            cfr.this.G().a($$0, 60.0F, 30.0F);
            evt $$1 = new evt($$0.du() - cfr.this.du(), $$0.dw() - cfr.this.dw(), $$0.dA() - cfr.this.dA()).d();
            cfr.this.h(cfr.this.ds().b($$1.c * 0.8, 0.9, $$1.e * 0.8));
         }

         cfr.this.K().n();
      }

      @Override
      public void d() {
         cfr.this.y(false);
         cfr.this.cv = 0.0F;
         cfr.this.cw = 0.0F;
         cfr.this.z(false);
         cfr.this.x(false);
      }

      @Override
      public void e() {
         btr $$0 = cfr.this.p();
         if ($$0 != null) {
            cfr.this.G().a($$0, 60.0F, 30.0F);
         }

         if (!cfr.this.gq()) {
            evt $$1 = cfr.this.ds();
            if ($$1.d * $$1.d < 0.03F && cfr.this.dH() != 0.0F) {
               cfr.this.s(ayz.j(0.2F, cfr.this.dH(), 0.0F));
            } else {
               double $$2 = $$1.h();
               double $$3 = Math.signum(-$$1.d) * Math.acos($$2 / $$1.f()) * 180.0F / (float)Math.PI;
               cfr.this.s((float)$$3);
            }
         }

         if ($$0 != null && cfr.this.f($$0) <= 2.0F) {
            cfr.this.C($$0);
         } else if (cfr.this.dH() > 0.0F && cfr.this.aE() && (float)cfr.this.ds().d != 0.0F && cfr.this.dP().a_(cfr.this.dp()).a(dfd.dN)) {
            cfr.this.s(60.0F);
            cfr.this.h(null);
            cfr.this.A(true);
         }
      }
   }

   class p extends cap {
      public p() {
         this.a(EnumSet.of(cap.a.a));
      }

      @Override
      public boolean a() {
         if (!cfr.this.a(btd.a).e()) {
            return false;
         } else if (cfr.this.p() != null || cfr.this.em() != null) {
            return false;
         } else if (!cfr.this.gF()) {
            return false;
         } else if (cfr.this.el().a(b(10)) != 0) {
            return false;
         } else {
            List<cjj> $$0 = cfr.this.dP().a(cjj.class, cfr.this.cK().c(8.0, 8.0, 8.0), cfr.ck);
            return !$$0.isEmpty() && cfr.this.a(btd.a).e();
         }
      }

      @Override
      public void e() {
         List<cjj> $$0 = cfr.this.dP().a(cjj.class, cfr.this.cK().c(8.0, 8.0, 8.0), cfr.ck);
         cur $$1 = cfr.this.a(btd.a);
         if ($$1.e() && !$$0.isEmpty()) {
            cfr.this.K().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void c() {
         List<cjj> $$0 = cfr.this.dP().a(cjj.class, cfr.this.cK().c(8.0, 8.0, 8.0), cfr.ck);
         if (!$$0.isEmpty()) {
            cfr.this.K().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends cbv {
      public q(final int $$0, final int $$1) {
         super(cfr.this, $$1);
      }

      @Override
      public void c() {
         cfr.this.gE();
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
         return !cfr.this.fL() && !cfr.this.y() && !cfr.this.gC() && cfr.this.p() == null;
      }
   }

   class r extends cfr.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(cap.a.a, cap.a.b));
      }

      @Override
      public boolean a() {
         return cfr.this.em() == null
            && cfr.this.el().i() < 0.02F
            && !cfr.this.fL()
            && cfr.this.p() == null
            && cfr.this.K().l()
            && !this.i()
            && !cfr.this.gw()
            && !cfr.this.ca();
      }

      @Override
      public boolean b() {
         return this.f > 0;
      }

      @Override
      public void c() {
         this.k();
         this.f = 2 + cfr.this.el().a(3);
         cfr.this.w(true);
         cfr.this.K().n();
      }

      @Override
      public void d() {
         cfr.this.w(false);
      }

      @Override
      public void e() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         cfr.this.G().a(cfr.this.du() + this.c, cfr.this.dy(), cfr.this.dA() + this.d, (float)cfr.this.ab(), (float)cfr.this.aa());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * cfr.this.el().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + cfr.this.el().a(20));
      }
   }

   class s extends cai {
      private int c = b(100);

      public s(final double $$0) {
         super(cfr.this, $$0);
      }

      @Override
      public boolean a() {
         if (!cfr.this.fL() && this.a.p() == null) {
            if (cfr.this.dP().ac() && cfr.this.dP().h(this.a.dp())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               iz $$0 = this.a.dp();
               return cfr.this.dP().R() && cfr.this.dP().h($$0) && !((arf)cfr.this.dP()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void c() {
         cfr.this.gE();
         super.c();
      }
   }

   class t extends cfr.d {
      private static final int c = b(140);
      private int d = cfr.this.ah.a(c);

      public t() {
         this.a(EnumSet.of(cap.a.a, cap.a.b, cap.a.c));
      }

      @Override
      public boolean a() {
         return cfr.this.bo == 0.0F && cfr.this.bp == 0.0F && cfr.this.bq == 0.0F ? this.k() || cfr.this.fL() : false;
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
            return cfr.this.dP().R() && this.h() && !this.i() && !cfr.this.aB;
         }
      }

      @Override
      public void d() {
         this.d = cfr.this.ah.a(c);
         cfr.this.gE();
      }

      @Override
      public void c() {
         cfr.this.w(false);
         cfr.this.y(false);
         cfr.this.z(false);
         cfr.this.s(false);
         cfr.this.C(true);
         cfr.this.K().n();
         cfr.this.H().a(cfr.this.du(), cfr.this.dw(), cfr.this.dA(), 0.0);
      }
   }

   class u extends cap {
      public u() {
         this.a(EnumSet.of(cap.a.a, cap.a.b));
      }

      @Override
      public boolean a() {
         if (cfr.this.fL()) {
            return false;
         } else {
            btr $$0 = cfr.this.p();
            return $$0 != null && $$0.bD() && cfr.cm.test($$0) && cfr.this.g($$0) > 36.0 && !cfr.this.ca() && !cfr.this.gz() && !cfr.this.bn;
         }
      }

      @Override
      public void c() {
         cfr.this.w(false);
         cfr.this.A(false);
      }

      @Override
      public void d() {
         btr $$0 = cfr.this.p();
         if ($$0 != null && cfr.a(cfr.this, $$0)) {
            cfr.this.z(true);
            cfr.this.y(true);
            cfr.this.K().n();
            cfr.this.G().a($$0, (float)cfr.this.ab(), (float)cfr.this.aa());
         } else {
            cfr.this.z(false);
            cfr.this.y(false);
         }
      }

      @Override
      public void e() {
         btr $$0 = cfr.this.p();
         if ($$0 != null) {
            cfr.this.G().a($$0, (float)cfr.this.ab(), (float)cfr.this.aa());
            if (cfr.this.g($$0) <= 36.0) {
               cfr.this.z(true);
               cfr.this.y(true);
               cfr.this.K().n();
            } else {
               cfr.this.K().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements azu {
      a(0, "red"),
      b(1, "snow");

      public static final azu.a<cfr.v> c = azu.a(cfr.v::values);
      private static final IntFunction<cfr.v> d = axp.a(cfr.v::a, values(), axp.a.a);
      private final int e;
      private final String f;

      private v(final int $$0, final String $$1) {
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

      public static cfr.v a(String $$0) {
         return c.a($$0, a);
      }

      public static cfr.v a(int $$0) {
         return d.apply($$0);
      }

      public static cfr.v a(ji<dcz> $$0) {
         return $$0.a(awo.ar) ? b : a;
      }
   }
}
