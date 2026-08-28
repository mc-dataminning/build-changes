import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfn extends cfd implements bun<cfn.v> {
   private static final akj<Integer> cc = akn.a(cfn.class, akl.b);
   private static final akj<Byte> cd = akn.a(cfn.class, akl.a);
   private static final int ce = 1;
   public static final int bY = 4;
   public static final int bZ = 8;
   public static final int cb = 16;
   private static final int cf = 32;
   private static final int cg = 64;
   private static final int ch = 128;
   private static final akj<Optional<UUID>> ci = akn.a(cfn.class, akl.r);
   private static final akj<Optional<UUID>> cj = akn.a(cfn.class, akl.r);
   static final Predicate<cjf> ck = $$0 -> !$$0.y() && $$0.bD();
   private static final Predicate<bss> cl = $$0 -> !($$0 instanceof btn $$1) ? false : $$1.eo() != null && $$1.ep() < $$1.ai + 600;
   static final Predicate<bss> cm = $$0 -> $$0 instanceof cfi || $$0 instanceof cfx;
   private static final Predicate<bss> cn = $$0 -> !$$0.bY() && bsx.e.test($$0);
   private static final int co = 600;
   private static final bsv cp = bsy.Q.n().a(0.5F).b(0.2975F);
   private cal cq;
   private cal cr;
   private cal cs;
   private float ct;
   private float cu;
   float cv;
   float cw;
   private int cx;

   public cfn(bsy<? extends cfn> $$0, dbw $$1) {
      super($$0, $$1);
      this.bO = new cfn.k();
      this.bP = new cfn.m();
      this.a(eok.p, 0.0F);
      this.a(eok.q, 0.0F);
      this.a_(true);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(ci, Optional.empty());
      $$0.a(cj, Optional.empty());
      $$0.a(cc, 0);
      $$0.a(cd, (byte)0);
   }

   @Override
   protected void z() {
      this.cq = new cce<>(this, cfd.class, 10, false, false, $$0 -> $$0 instanceof cfi || $$0 instanceof cfx);
      this.cr = new cce<>(this, cge.class, 10, false, false, cge.bY);
      this.cs = new cce<>(this, cfa.class, 20, false, false, $$0 -> $$0 instanceof cfc);
      this.bS.a(0, new cfn.g());
      this.bS.a(0, new caa(this, this.dP()));
      this.bS.a(1, new cfn.b());
      this.bS.a(2, new cfn.n(2.2));
      this.bS.a(3, new cfn.e(1.0));
      this.bS.a(4, new bzs<>(this, cmv.class, 16.0F, 1.6, 1.4, $$0 -> cn.test($$0) && !this.c($$0.cz()) && !this.gC()));
      this.bS.a(4, new bzs<>(this, cgg.class, 8.0F, 1.6, 1.4, $$0 -> !((cgg)$$0).s() && !this.gC()));
      this.bS.a(4, new bzs<>(this, cfv.class, 8.0F, 1.6, 1.4, $$0 -> !this.gC()));
      this.bS.a(5, new cfn.u());
      this.bS.a(6, new cfn.o());
      this.bS.a(6, new cfn.s(1.25));
      this.bS.a(7, new cfn.l(1.2F, true));
      this.bS.a(7, new cfn.t());
      this.bS.a(8, new cfn.h(this, 1.25));
      this.bS.a(9, new cfn.q(32, 200));
      this.bS.a(10, new cfn.f(1.2F, 12, 1));
      this.bS.a(10, new car(this, 0.4F));
      this.bS.a(11, new cby(this, 1.0));
      this.bS.a(11, new cfn.p());
      this.bS.a(12, new cfn.j(this, cmv.class, 24.0F));
      this.bS.a(13, new cfn.r());
      this.bT.a(3, new cfn.a(btn.class, false, false, $$0 -> cl.test($$0) && !this.c($$0.cz())));
   }

   @Override
   public avy d(cun $$0) {
      return avz.jj;
   }

   @Override
   public void n_() {
      if (!this.dP().B && this.bD() && this.db()) {
         this.cx++;
         cun $$0 = this.a(bsz.a);
         if (this.n($$0)) {
            if (this.cx > 600) {
               cun $$1 = $$0.a(this.dP(), this);
               if (!$$1.e()) {
                  this.a(bsz.a, $$1);
               }

               this.cx = 0;
            } else if (this.cx > 560 && this.ah.i() < 0.1F) {
               this.a(this.d($$0), 1.0F, 1.0F);
               this.dP().a(this, (byte)45);
            }
         }

         btn $$2 = this.p();
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
         this.a(avz.jf, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean fg() {
      return this.eB();
   }

   private boolean n(cun $$0) {
      return $$0.b(km.u) && this.p() == null && this.aE() && !this.fL();
   }

   @Override
   protected void a(azf $$0, bqq $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cun $$3;
         if ($$2 < 0.05F) {
            $$3 = new cun(cuq.oz);
         } else if ($$2 < 0.2F) {
            $$3 = new cun(cuq.qR);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cun(cuq.uD) : new cun(cuq.uE);
         } else if ($$2 < 0.6F) {
            $$3 = new cun(cuq.pw);
         } else if ($$2 < 0.8F) {
            $$3 = new cun(cuq.qD);
         } else {
            $$3 = new cun(cuq.pt);
         }

         this.a(bsz.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cun $$1 = this.a(bsz.a);
         if (!$$1.e()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               evp $$3 = new evp(((double)this.ah.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dH() * (float) (Math.PI / 180.0))
                  .b(-this.dF() * (float) (Math.PI / 180.0));
               this.dP().a(new le(li.S, $$1), this.du() + this.bL().c / 2.0, this.dw(), this.dA() + this.bL().e / 2.0, $$3.c, $$3.d + 0.05, $$3.e);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static buu.a s() {
      return btp.A().a(buv.r, 0.3F).a(buv.q, 10.0).a(buv.k, 32.0).a(buv.c, 2.0).a(buv.s, 5.0);
   }

   @Nullable
   public cfn b(are $$0, bsm $$1) {
      cfn $$2 = bsy.Q.a((dbw)$$0);
      if ($$2 != null) {
         $$2.a(this.ah.h() ? this.u() : ((cfn)$$1).u());
      }

      return $$2;
   }

   public static boolean c(bsy<cfn> $$0, dbx $$1, btr $$2, iz $$3, azf $$4) {
      return $$1.a_($$3.d()).a(awo.ce) && a($$1, $$3);
   }

   @Nullable
   @Override
   public bug a(dcl $$0, bqq $$1, btr $$2, @Nullable bug $$3) {
      ji<dcv> $$4 = $$0.t(this.dp());
      cfn.v $$5 = cfn.v.a($$4);
      boolean $$6 = false;
      if ($$3 instanceof cfn.i $$7) {
         $$5 = $$7.a;
         if ($$7.a() >= 2) {
            $$6 = true;
         }
      } else {
         $$3 = new cfn.i($$5);
      }

      this.a($$5);
      if ($$6) {
         this.c_(-24000);
      }

      if ($$0 instanceof are) {
         this.gA();
      }

      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   private void gA() {
      if (this.u() == cfn.v.a) {
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
   protected void a(cmv $$0, bqr $$1, cun $$2) {
      if (this.o($$2)) {
         this.a(this.d($$2), 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   @Override
   public bsv e(btz $$0) {
      return this.p_() ? cp : super.e($$0);
   }

   public cfn.v u() {
      return cfn.v.a(this.ao.a(cc));
   }

   public void a(cfn.v $$0) {
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
   public void b(ur $$0) {
      super.b($$0);
      List<UUID> $$1 = this.gB();
      ux $$2 = new ux();

      for (UUID $$3 : $$1) {
         if ($$3 != null) {
            $$2.add(vg.a($$3));
         }
      }

      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fL());
      $$0.a("Type", this.u().c());
      $$0.a("Sitting", this.y());
      $$0.a("Crouching", this.ca());
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);

      for (vo $$2 : $$0.c("Trusted", 11)) {
         this.b(vg.a($$2));
      }

      this.C($$0.q("Sleeping"));
      this.a(cfn.v.a($$0.l("Type")));
      this.w($$0.q("Sitting"));
      this.y($$0.q("Crouching"));
      if (this.dP() instanceof are) {
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
   public boolean f(cun $$0) {
      bsz $$1 = btp.h($$0);
      return !this.a($$1).e() ? false : $$1 == bsz.a && super.f($$0);
   }

   @Override
   public boolean j(cun $$0) {
      cun $$1 = this.a(bsz.a);
      return $$1.e() || this.cx > 0 && $$0.b(km.u) && !$$1.b(km.u);
   }

   private void p(cun $$0) {
      if (!$$0.e() && !this.dP().B) {
         cjf $$1 = new cjf(this.dP(), this.du() + this.bL().c, this.dw() + 1.0, this.dA() + this.bL().e, $$0);
         $$1.b(40);
         $$1.b(this);
         this.a(avz.jo, 1.0F, 1.0F);
         this.dP().b($$1);
      }
   }

   private void q(cun $$0) {
      cjf $$1 = new cjf(this.dP(), this.du(), this.dw(), this.dA(), $$0);
      this.dP().b($$1);
   }

   @Override
   protected void b(cjf $$0) {
      cun $$1 = $$0.p();
      if (this.j($$1)) {
         int $$2 = $$1.I();
         if ($$2 > 1) {
            this.q($$1.a($$2 - 1));
         }

         this.p(this.a(bsz.a));
         this.a($$0);
         this.a(bsz.a, $$1.a(1));
         this.f(bsz.a);
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
            dsa $$2 = this.dP().a_($$1);
            this.dP().c(2001, $$1, dex.i($$2));
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
   public boolean o(cun $$0) {
      return $$0.a(awx.Z);
   }

   @Override
   protected void a(cmv $$0, btp $$1) {
      ((cfn)$$1).b($$0.cz());
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
      return ayx.i($$0, this.cu, this.ct) * 0.11F * (float) Math.PI;
   }

   public float H(float $$0) {
      return ayx.i($$0, this.cw, this.cv);
   }

   @Override
   public void h(@Nullable btn $$0) {
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
      avy $$0 = this.v();
      if ($$0 == avz.jl) {
         this.a($$0, 2.0F, this.ff());
      } else {
         super.Q();
      }
   }

   @Nullable
   @Override
   protected avy v() {
      if (this.fL()) {
         return avz.jm;
      } else {
         if (!this.dP().R() && this.ah.i() < 0.1F) {
            List<cmv> $$0 = this.dP().a(cmv.class, this.cK().c(16.0, 16.0, 16.0), bsx.f);
            if ($$0.isEmpty()) {
               return avz.jl;
            }
         }

         return avz.jg;
      }
   }

   @Nullable
   @Override
   protected avy d(brl $$0) {
      return avz.jk;
   }

   @Nullable
   @Override
   protected avy o_() {
      return avz.ji;
   }

   boolean c(UUID $$0) {
      return this.gB().contains($$0);
   }

   @Override
   protected void g(brl $$0) {
      cun $$1 = this.a(bsz.a);
      if (!$$1.e()) {
         this.b($$1);
         this.a(bsz.a, cun.l);
      }

      super.g($$0);
   }

   public static boolean a(cfn $$0, btn $$1) {
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
   public evp cM() {
      return new evp(0.0, (double)(0.55F * this.cL()), (double)(this.dj() * 0.4F));
   }

   class a extends cce<btn> {
      @Nullable
      private btn j;
      @Nullable
      private btn k;
      private int l;

      public a(final Class<btn> $$0, final boolean $$1, final boolean $$2, @Nullable final Predicate<btn> $$3) {
         super(cfn.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean a() {
         if (this.b > 0 && this.e.el().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : cfn.this.gB()) {
               if ($$0 != null && cfn.this.dP() instanceof are && ((are)cfn.this.dP()).a($$0) instanceof btn $$2) {
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

         cfn.this.a(avz.jf, 1.0F, 1.0F);
         cfn.this.B(true);
         cfn.this.gD();
         super.c();
      }
   }

   class b extends cal {
      int a;

      public b() {
         this.a(EnumSet.of(cal.a.b, cal.a.c, cal.a.a));
      }

      @Override
      public boolean a() {
         return cfn.this.gq();
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
         cfn.this.A(false);
      }

      @Override
      public void e() {
         this.a--;
      }
   }

   public class c implements Predicate<btn> {
      public boolean a(btn $$0) {
         if ($$0 instanceof cfn) {
            return false;
         } else if ($$0 instanceof cfi || $$0 instanceof cfx || $$0 instanceof ckb) {
            return true;
         } else if ($$0 instanceof buk) {
            return !((buk)$$0).s();
         } else if (!($$0 instanceof cmv) || !$$0.N_() && !((cmv)$$0).f()) {
            return cfn.this.c($$0.cz()) ? false : !$$0.fL() && !$$0.bY();
         } else {
            return false;
         }
      }
   }

   abstract class d extends cal {
      private final cee b = cee.a().a(12.0).d().a(cfn.this.new c());

      protected boolean h() {
         iz $$0 = iz.a(cfn.this.du(), cfn.this.cK().e, cfn.this.dA());
         return !cfn.this.dP().h($$0) && cfn.this.d($$0) >= 0.0F;
      }

      protected boolean i() {
         return !cfn.this.dP().a(btn.class, this.b, cfn.this, cfn.this.cK().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends bzx {
      public e(final double $$0) {
         super(cfn.this, $$0);
      }

      @Override
      public void c() {
         ((cfn)this.a).gE();
         ((cfn)this.c).gE();
         super.c();
      }

      @Override
      protected void g() {
         are $$0 = (are)this.b;
         cfn $$1 = (cfn)this.a.a($$0, (bsm)this.c);
         if ($$1 != null) {
            arf $$2 = this.a.gt();
            arf $$3 = this.c.gt();
            arf $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.cz());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.cz());
            }

            if ($$4 != null) {
               $$4.a(awj.P);
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
            if (this.b.ab().b(dbs.f)) {
               this.b.b(new btd(this.b, this.a.du(), this.a.dw(), this.a.dA(), this.a.el().a(7) + 1));
            }
         }
      }
   }

   public class f extends cay {
      private static final int i = 40;
      protected int g;

      public f(final double $$1, final int $$2, final int $$3) {
         super(cfn.this, $$1, $$2, $$3);
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
      protected boolean a(dbz $$0, iz $$1) {
         dsa $$2 = $$0.a_($$1);
         return $$2.a(dez.oi) && $$2.c(dna.c) >= 2 || dft.h_($$2);
      }

      @Override
      public void e() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && cfn.this.ah.i() < 0.05F) {
            cfn.this.a(avz.jn, 1.0F, 1.0F);
         }

         super.e();
      }

      protected void o() {
         if (cfn.this.dP().ab().b(dbs.c)) {
            dsa $$0 = cfn.this.dP().a_(this.e);
            if ($$0.a(dez.oi)) {
               this.b($$0);
            } else if (dft.h_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dsa $$0) {
         dft.a(cfn.this, $$0, cfn.this.dP(), this.e);
      }

      private void b(dsa $$0) {
         int $$1 = $$0.c(dna.c);
         $$0.a(dna.c, Integer.valueOf(1));
         int $$2 = 1 + cfn.this.dP().z.a(2) + ($$1 == 3 ? 1 : 0);
         cun $$3 = cfn.this.a(bsz.a);
         if ($$3.e()) {
            cfn.this.a(bsz.a, new cun(cuq.wr));
            $$2--;
         }

         if ($$2 > 0) {
            dex.a(cfn.this.dP(), this.e, new cun(cuq.wr, $$2));
         }

         cfn.this.a(avz.zp, 1.0F, 1.0F);
         cfn.this.dP().a(this.e, $$0.a(dna.c, Integer.valueOf(1)), 2);
         cfn.this.dP().a(dwt.c, this.e, dwt.a.a(cfn.this));
      }

      @Override
      public boolean a() {
         return !cfn.this.fL() && super.a();
      }

      @Override
      public void c() {
         this.g = 0;
         cfn.this.w(false);
         super.c();
      }
   }

   class g extends caf {
      public g() {
         super(cfn.this);
      }

      @Override
      public void c() {
         super.c();
         cfn.this.gE();
      }

      @Override
      public boolean a() {
         return cfn.this.be() && cfn.this.b(awu.a) > 0.25 || cfn.this.bs();
      }
   }

   class h extends cak {
      private final cfn d;

      public h(final cfn $$0, final double $$1) {
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

   public static class i extends bsm.a {
      public final cfn.v a;

      public i(cfn.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends cat {
      public j(final btp $$0, final Class<? extends btn> $$1, final float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && !cfn.this.gq() && !cfn.this.gz();
      }

      @Override
      public boolean b() {
         return super.b() && !cfn.this.gq() && !cfn.this.gz();
      }
   }

   public class k extends bzn {
      public k() {
         super(cfn.this);
      }

      @Override
      public void a() {
         if (!cfn.this.fL()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cfn.this.gw() && !cfn.this.ca() && !cfn.this.gz() && !cfn.this.gq();
      }
   }

   class l extends cav {
      public l(final double $$0, final boolean $$1) {
         super(cfn.this, $$0, $$1);
      }

      @Override
      protected void a(btn $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            cfn.this.a(avz.jh, 1.0F, 1.0F);
         }
      }

      @Override
      public void c() {
         cfn.this.z(false);
         super.c();
      }

      @Override
      public boolean a() {
         return !cfn.this.y() && !cfn.this.fL() && !cfn.this.ca() && !cfn.this.gq() && super.a();
      }
   }

   class m extends bzo {
      public m() {
         super(cfn.this);
      }

      @Override
      public void a() {
         if (cfn.this.gF()) {
            super.a();
         }
      }
   }

   class n extends cbe {
      public n(final double $$0) {
         super(cfn.this, $$0);
      }

      @Override
      public boolean h() {
         return !cfn.this.gC() && super.h();
      }
   }

   public class o extends cap {
      @Override
      public boolean a() {
         if (!cfn.this.gy()) {
            return false;
         } else {
            btn $$0 = cfn.this.p();
            if ($$0 != null && $$0.bD()) {
               if ($$0.cI() != $$0.cH()) {
                  return false;
               } else {
                  boolean $$1 = cfn.a(cfn.this, $$0);
                  if (!$$1) {
                     cfn.this.K().a($$0, 0);
                     cfn.this.y(false);
                     cfn.this.z(false);
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
         btn $$0 = cfn.this.p();
         if ($$0 != null && $$0.bD()) {
            double $$1 = cfn.this.ds().d;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(cfn.this.dH()) < 15.0F) || !cfn.this.aE()) && !cfn.this.gq();
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
         cfn.this.s(true);
         cfn.this.x(true);
         cfn.this.z(false);
         btn $$0 = cfn.this.p();
         if ($$0 != null) {
            cfn.this.G().a($$0, 60.0F, 30.0F);
            evp $$1 = new evp($$0.du() - cfn.this.du(), $$0.dw() - cfn.this.dw(), $$0.dA() - cfn.this.dA()).d();
            cfn.this.h(cfn.this.ds().b($$1.c * 0.8, 0.9, $$1.e * 0.8));
         }

         cfn.this.K().n();
      }

      @Override
      public void d() {
         cfn.this.y(false);
         cfn.this.cv = 0.0F;
         cfn.this.cw = 0.0F;
         cfn.this.z(false);
         cfn.this.x(false);
      }

      @Override
      public void e() {
         btn $$0 = cfn.this.p();
         if ($$0 != null) {
            cfn.this.G().a($$0, 60.0F, 30.0F);
         }

         if (!cfn.this.gq()) {
            evp $$1 = cfn.this.ds();
            if ($$1.d * $$1.d < 0.03F && cfn.this.dH() != 0.0F) {
               cfn.this.s(ayx.j(0.2F, cfn.this.dH(), 0.0F));
            } else {
               double $$2 = $$1.h();
               double $$3 = Math.signum(-$$1.d) * Math.acos($$2 / $$1.f()) * 180.0F / (float)Math.PI;
               cfn.this.s((float)$$3);
            }
         }

         if ($$0 != null && cfn.this.f($$0) <= 2.0F) {
            cfn.this.C($$0);
         } else if (cfn.this.dH() > 0.0F && cfn.this.aE() && (float)cfn.this.ds().d != 0.0F && cfn.this.dP().a_(cfn.this.dp()).a(dez.dN)) {
            cfn.this.s(60.0F);
            cfn.this.h(null);
            cfn.this.A(true);
         }
      }
   }

   class p extends cal {
      public p() {
         this.a(EnumSet.of(cal.a.a));
      }

      @Override
      public boolean a() {
         if (!cfn.this.a(bsz.a).e()) {
            return false;
         } else if (cfn.this.p() != null || cfn.this.em() != null) {
            return false;
         } else if (!cfn.this.gF()) {
            return false;
         } else if (cfn.this.el().a(b(10)) != 0) {
            return false;
         } else {
            List<cjf> $$0 = cfn.this.dP().a(cjf.class, cfn.this.cK().c(8.0, 8.0, 8.0), cfn.ck);
            return !$$0.isEmpty() && cfn.this.a(bsz.a).e();
         }
      }

      @Override
      public void e() {
         List<cjf> $$0 = cfn.this.dP().a(cjf.class, cfn.this.cK().c(8.0, 8.0, 8.0), cfn.ck);
         cun $$1 = cfn.this.a(bsz.a);
         if ($$1.e() && !$$0.isEmpty()) {
            cfn.this.K().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void c() {
         List<cjf> $$0 = cfn.this.dP().a(cjf.class, cfn.this.cK().c(8.0, 8.0, 8.0), cfn.ck);
         if (!$$0.isEmpty()) {
            cfn.this.K().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends cbr {
      public q(final int $$0, final int $$1) {
         super(cfn.this, $$1);
      }

      @Override
      public void c() {
         cfn.this.gE();
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
         return !cfn.this.fL() && !cfn.this.y() && !cfn.this.gC() && cfn.this.p() == null;
      }
   }

   class r extends cfn.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(cal.a.a, cal.a.b));
      }

      @Override
      public boolean a() {
         return cfn.this.em() == null
            && cfn.this.el().i() < 0.02F
            && !cfn.this.fL()
            && cfn.this.p() == null
            && cfn.this.K().l()
            && !this.i()
            && !cfn.this.gw()
            && !cfn.this.ca();
      }

      @Override
      public boolean b() {
         return this.f > 0;
      }

      @Override
      public void c() {
         this.k();
         this.f = 2 + cfn.this.el().a(3);
         cfn.this.w(true);
         cfn.this.K().n();
      }

      @Override
      public void d() {
         cfn.this.w(false);
      }

      @Override
      public void e() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         cfn.this.G().a(cfn.this.du() + this.c, cfn.this.dy(), cfn.this.dA() + this.d, (float)cfn.this.ab(), (float)cfn.this.aa());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * cfn.this.el().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + cfn.this.el().a(20));
      }
   }

   class s extends cae {
      private int c = b(100);

      public s(final double $$0) {
         super(cfn.this, $$0);
      }

      @Override
      public boolean a() {
         if (!cfn.this.fL() && this.a.p() == null) {
            if (cfn.this.dP().ac() && cfn.this.dP().h(this.a.dp())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               iz $$0 = this.a.dp();
               return cfn.this.dP().R() && cfn.this.dP().h($$0) && !((are)cfn.this.dP()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void c() {
         cfn.this.gE();
         super.c();
      }
   }

   class t extends cfn.d {
      private static final int c = b(140);
      private int d = cfn.this.ah.a(c);

      public t() {
         this.a(EnumSet.of(cal.a.a, cal.a.b, cal.a.c));
      }

      @Override
      public boolean a() {
         return cfn.this.bo == 0.0F && cfn.this.bp == 0.0F && cfn.this.bq == 0.0F ? this.k() || cfn.this.fL() : false;
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
            return cfn.this.dP().R() && this.h() && !this.i() && !cfn.this.aB;
         }
      }

      @Override
      public void d() {
         this.d = cfn.this.ah.a(c);
         cfn.this.gE();
      }

      @Override
      public void c() {
         cfn.this.w(false);
         cfn.this.y(false);
         cfn.this.z(false);
         cfn.this.s(false);
         cfn.this.C(true);
         cfn.this.K().n();
         cfn.this.H().a(cfn.this.du(), cfn.this.dw(), cfn.this.dA(), 0.0);
      }
   }

   class u extends cal {
      public u() {
         this.a(EnumSet.of(cal.a.a, cal.a.b));
      }

      @Override
      public boolean a() {
         if (cfn.this.fL()) {
            return false;
         } else {
            btn $$0 = cfn.this.p();
            return $$0 != null && $$0.bD() && cfn.cm.test($$0) && cfn.this.g($$0) > 36.0 && !cfn.this.ca() && !cfn.this.gz() && !cfn.this.bn;
         }
      }

      @Override
      public void c() {
         cfn.this.w(false);
         cfn.this.A(false);
      }

      @Override
      public void d() {
         btn $$0 = cfn.this.p();
         if ($$0 != null && cfn.a(cfn.this, $$0)) {
            cfn.this.z(true);
            cfn.this.y(true);
            cfn.this.K().n();
            cfn.this.G().a($$0, (float)cfn.this.ab(), (float)cfn.this.aa());
         } else {
            cfn.this.z(false);
            cfn.this.y(false);
         }
      }

      @Override
      public void e() {
         btn $$0 = cfn.this.p();
         if ($$0 != null) {
            cfn.this.G().a($$0, (float)cfn.this.ab(), (float)cfn.this.aa());
            if (cfn.this.g($$0) <= 36.0) {
               cfn.this.z(true);
               cfn.this.y(true);
               cfn.this.K().n();
            } else {
               cfn.this.K().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements azs {
      a(0, "red"),
      b(1, "snow");

      public static final azs.a<cfn.v> c = azs.a(cfn.v::values);
      private static final IntFunction<cfn.v> d = axo.a(cfn.v::a, values(), axo.a.a);
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

      public static cfn.v a(String $$0) {
         return c.a($$0, a);
      }

      public static cfn.v a(int $$0) {
         return d.apply($$0);
      }

      public static cfn.v a(ji<dcv> $$0) {
         return $$0.a(awn.ar) ? b : a;
      }
   }
}
