import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfp extends cff implements bup<cfp.v> {
   private static final akk<Integer> cc = ako.a(cfp.class, akm.b);
   private static final akk<Byte> cd = ako.a(cfp.class, akm.a);
   private static final int ce = 1;
   public static final int bY = 4;
   public static final int bZ = 8;
   public static final int cb = 16;
   private static final int cf = 32;
   private static final int cg = 64;
   private static final int ch = 128;
   private static final akk<Optional<UUID>> ci = ako.a(cfp.class, akm.r);
   private static final akk<Optional<UUID>> cj = ako.a(cfp.class, akm.r);
   static final Predicate<cjh> ck = $$0 -> !$$0.y() && $$0.bD();
   private static final Predicate<bsu> cl = $$0 -> !($$0 instanceof btp $$1) ? false : $$1.eo() != null && $$1.ep() < $$1.ai + 600;
   static final Predicate<bsu> cm = $$0 -> $$0 instanceof cfk || $$0 instanceof cfz;
   private static final Predicate<bsu> cn = $$0 -> !$$0.bY() && bsz.e.test($$0);
   private static final int co = 600;
   private static final bsx cp = bta.Q.n().a(0.5F).b(0.2975F);
   private can cq;
   private can cr;
   private can cs;
   private float ct;
   private float cu;
   float cv;
   float cw;
   private int cx;

   public cfp(bta<? extends cfp> $$0, dby $$1) {
      super($$0, $$1);
      this.bO = new cfp.k();
      this.bP = new cfp.m();
      this.a(eom.p, 0.0F);
      this.a(eom.q, 0.0F);
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
      this.cq = new ccg<>(this, cff.class, 10, false, false, $$0 -> $$0 instanceof cfk || $$0 instanceof cfz);
      this.cr = new ccg<>(this, cgg.class, 10, false, false, cgg.bY);
      this.cs = new ccg<>(this, cfc.class, 20, false, false, $$0 -> $$0 instanceof cfe);
      this.bS.a(0, new cfp.g());
      this.bS.a(0, new cac(this, this.dP()));
      this.bS.a(1, new cfp.b());
      this.bS.a(2, new cfp.n(2.2));
      this.bS.a(3, new cfp.e(1.0));
      this.bS.a(4, new bzu<>(this, cmx.class, 16.0F, 1.6, 1.4, $$0 -> cn.test($$0) && !this.c($$0.cz()) && !this.gC()));
      this.bS.a(4, new bzu<>(this, cgi.class, 8.0F, 1.6, 1.4, $$0 -> !((cgi)$$0).s() && !this.gC()));
      this.bS.a(4, new bzu<>(this, cfx.class, 8.0F, 1.6, 1.4, $$0 -> !this.gC()));
      this.bS.a(5, new cfp.u());
      this.bS.a(6, new cfp.o());
      this.bS.a(6, new cfp.s(1.25));
      this.bS.a(7, new cfp.l(1.2F, true));
      this.bS.a(7, new cfp.t());
      this.bS.a(8, new cfp.h(this, 1.25));
      this.bS.a(9, new cfp.q(32, 200));
      this.bS.a(10, new cfp.f(1.2F, 12, 1));
      this.bS.a(10, new cat(this, 0.4F));
      this.bS.a(11, new cca(this, 1.0));
      this.bS.a(11, new cfp.p());
      this.bS.a(12, new cfp.j(this, cmx.class, 24.0F));
      this.bS.a(13, new cfp.r());
      this.bT.a(3, new cfp.a(btp.class, false, false, $$0 -> cl.test($$0) && !this.c($$0.cz())));
   }

   @Override
   public avz d(cup $$0) {
      return awa.jj;
   }

   @Override
   public void n_() {
      if (!this.dP().B && this.bD() && this.db()) {
         this.cx++;
         cup $$0 = this.a(btb.a);
         if (this.n($$0)) {
            if (this.cx > 600) {
               cup $$1 = $$0.a(this.dP(), this);
               if (!$$1.e()) {
                  this.a(btb.a, $$1);
               }

               this.cx = 0;
            } else if (this.cx > 560 && this.ah.i() < 0.1F) {
               this.a(this.d($$0), 1.0F, 1.0F);
               this.dP().a(this, (byte)45);
            }
         }

         btp $$2 = this.p();
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

   private boolean n(cup $$0) {
      return $$0.b(km.v) && this.p() == null && this.aE() && !this.fL();
   }

   @Override
   protected void a(azh $$0, bqs $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cup $$3;
         if ($$2 < 0.05F) {
            $$3 = new cup(cus.oz);
         } else if ($$2 < 0.2F) {
            $$3 = new cup(cus.qR);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cup(cus.uD) : new cup(cus.uE);
         } else if ($$2 < 0.6F) {
            $$3 = new cup(cus.pw);
         } else if ($$2 < 0.8F) {
            $$3 = new cup(cus.qD);
         } else {
            $$3 = new cup(cus.pt);
         }

         this.a(btb.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cup $$1 = this.a(btb.a);
         if (!$$1.e()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               evr $$3 = new evr(((double)this.ah.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dH() * (float) (Math.PI / 180.0))
                  .b(-this.dF() * (float) (Math.PI / 180.0));
               this.dP().a(new le(li.S, $$1), this.du() + this.bL().c / 2.0, this.dw(), this.dA() + this.bL().e / 2.0, $$3.c, $$3.d + 0.05, $$3.e);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static buw.a s() {
      return btr.A().a(bux.r, 0.3F).a(bux.q, 10.0).a(bux.k, 32.0).a(bux.c, 2.0).a(bux.s, 5.0);
   }

   @Nullable
   public cfp b(arf $$0, bso $$1) {
      cfp $$2 = bta.Q.a((dby)$$0);
      if ($$2 != null) {
         $$2.a(this.ah.h() ? this.u() : ((cfp)$$1).u());
      }

      return $$2;
   }

   public static boolean c(bta<cfp> $$0, dbz $$1, btt $$2, iz $$3, azh $$4) {
      return $$1.a_($$3.d()).a(awp.ce) && a($$1, $$3);
   }

   @Nullable
   @Override
   public bui a(dcn $$0, bqs $$1, btt $$2, @Nullable bui $$3) {
      ji<dcx> $$4 = $$0.t(this.dp());
      cfp.v $$5 = cfp.v.a($$4);
      boolean $$6 = false;
      if ($$3 instanceof cfp.i $$7) {
         $$5 = $$7.a;
         if ($$7.a() >= 2) {
            $$6 = true;
         }
      } else {
         $$3 = new cfp.i($$5);
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
      if (this.u() == cfp.v.a) {
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
   protected void a(cmx $$0, bqt $$1, cup $$2) {
      if (this.o($$2)) {
         this.a(this.d($$2), 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   @Override
   public bsx e(bub $$0) {
      return this.p_() ? cp : super.e($$0);
   }

   public cfp.v u() {
      return cfp.v.a(this.ao.a(cc));
   }

   public void a(cfp.v $$0) {
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
      this.a(cfp.v.a($$0.l("Type")));
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
   public boolean f(cup $$0) {
      btb $$1 = btr.h($$0);
      return !this.a($$1).e() ? false : $$1 == btb.a && super.f($$0);
   }

   @Override
   public boolean j(cup $$0) {
      cup $$1 = this.a(btb.a);
      return $$1.e() || this.cx > 0 && $$0.b(km.v) && !$$1.b(km.v);
   }

   private void p(cup $$0) {
      if (!$$0.e() && !this.dP().B) {
         cjh $$1 = new cjh(this.dP(), this.du() + this.bL().c, this.dw() + 1.0, this.dA() + this.bL().e, $$0);
         $$1.b(40);
         $$1.b(this);
         this.a(awa.jo, 1.0F, 1.0F);
         this.dP().b($$1);
      }
   }

   private void q(cup $$0) {
      cjh $$1 = new cjh(this.dP(), this.du(), this.dw(), this.dA(), $$0);
      this.dP().b($$1);
   }

   @Override
   protected void b(cjh $$0) {
      cup $$1 = $$0.p();
      if (this.j($$1)) {
         int $$2 = $$1.I();
         if ($$2 > 1) {
            this.q($$1.a($$2 - 1));
         }

         this.p(this.a(btb.a));
         this.a($$0);
         this.a(btb.a, $$1.a(1));
         this.f(btb.a);
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
            dsc $$2 = this.dP().a_($$1);
            this.dP().c(2001, $$1, dez.i($$2));
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
   public boolean o(cup $$0) {
      return $$0.a(awy.Z);
   }

   @Override
   protected void a(cmx $$0, btr $$1) {
      ((cfp)$$1).b($$0.cz());
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
   public void h(@Nullable btp $$0) {
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
            List<cmx> $$0 = this.dP().a(cmx.class, this.cK().c(16.0, 16.0, 16.0), bsz.f);
            if ($$0.isEmpty()) {
               return awa.jl;
            }
         }

         return awa.jg;
      }
   }

   @Nullable
   @Override
   protected avz d(brn $$0) {
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
   protected void g(brn $$0) {
      cup $$1 = this.a(btb.a);
      if (!$$1.e()) {
         this.b($$1);
         this.a(btb.a, cup.l);
      }

      super.g($$0);
   }

   public static boolean a(cfp $$0, btp $$1) {
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
   public evr cM() {
      return new evr(0.0, (double)(0.55F * this.cL()), (double)(this.dj() * 0.4F));
   }

   class a extends ccg<btp> {
      @Nullable
      private btp j;
      @Nullable
      private btp k;
      private int l;

      public a(final Class<btp> $$0, final boolean $$1, final boolean $$2, @Nullable final Predicate<btp> $$3) {
         super(cfp.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean a() {
         if (this.b > 0 && this.e.el().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : cfp.this.gB()) {
               if ($$0 != null && cfp.this.dP() instanceof arf && ((arf)cfp.this.dP()).a($$0) instanceof btp $$2) {
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

         cfp.this.a(awa.jf, 1.0F, 1.0F);
         cfp.this.B(true);
         cfp.this.gD();
         super.c();
      }
   }

   class b extends can {
      int a;

      public b() {
         this.a(EnumSet.of(can.a.b, can.a.c, can.a.a));
      }

      @Override
      public boolean a() {
         return cfp.this.gq();
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
         cfp.this.A(false);
      }

      @Override
      public void e() {
         this.a--;
      }
   }

   public class c implements Predicate<btp> {
      public boolean a(btp $$0) {
         if ($$0 instanceof cfp) {
            return false;
         } else if ($$0 instanceof cfk || $$0 instanceof cfz || $$0 instanceof ckd) {
            return true;
         } else if ($$0 instanceof bum) {
            return !((bum)$$0).s();
         } else if (!($$0 instanceof cmx) || !$$0.N_() && !((cmx)$$0).f()) {
            return cfp.this.c($$0.cz()) ? false : !$$0.fL() && !$$0.bY();
         } else {
            return false;
         }
      }
   }

   abstract class d extends can {
      private final ceg b = ceg.a().a(12.0).d().a(cfp.this.new c());

      protected boolean h() {
         iz $$0 = iz.a(cfp.this.du(), cfp.this.cK().e, cfp.this.dA());
         return !cfp.this.dP().h($$0) && cfp.this.d($$0) >= 0.0F;
      }

      protected boolean i() {
         return !cfp.this.dP().a(btp.class, this.b, cfp.this, cfp.this.cK().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends bzz {
      public e(final double $$0) {
         super(cfp.this, $$0);
      }

      @Override
      public void c() {
         ((cfp)this.a).gE();
         ((cfp)this.c).gE();
         super.c();
      }

      @Override
      protected void g() {
         arf $$0 = (arf)this.b;
         cfp $$1 = (cfp)this.a.a($$0, (bso)this.c);
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
            if (this.b.ab().b(dbu.f)) {
               this.b.b(new btf(this.b, this.a.du(), this.a.dw(), this.a.dA(), this.a.el().a(7) + 1));
            }
         }
      }
   }

   public class f extends cba {
      private static final int i = 40;
      protected int g;

      public f(final double $$1, final int $$2, final int $$3) {
         super(cfp.this, $$1, $$2, $$3);
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
      protected boolean a(dcb $$0, iz $$1) {
         dsc $$2 = $$0.a_($$1);
         return $$2.a(dfb.oi) && $$2.c(dnc.c) >= 2 || dfv.h_($$2);
      }

      @Override
      public void e() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && cfp.this.ah.i() < 0.05F) {
            cfp.this.a(awa.jn, 1.0F, 1.0F);
         }

         super.e();
      }

      protected void o() {
         if (cfp.this.dP().ab().b(dbu.c)) {
            dsc $$0 = cfp.this.dP().a_(this.e);
            if ($$0.a(dfb.oi)) {
               this.b($$0);
            } else if (dfv.h_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dsc $$0) {
         dfv.a(cfp.this, $$0, cfp.this.dP(), this.e);
      }

      private void b(dsc $$0) {
         int $$1 = $$0.c(dnc.c);
         $$0.a(dnc.c, Integer.valueOf(1));
         int $$2 = 1 + cfp.this.dP().z.a(2) + ($$1 == 3 ? 1 : 0);
         cup $$3 = cfp.this.a(btb.a);
         if ($$3.e()) {
            cfp.this.a(btb.a, new cup(cus.wr));
            $$2--;
         }

         if ($$2 > 0) {
            dez.a(cfp.this.dP(), this.e, new cup(cus.wr, $$2));
         }

         cfp.this.a(awa.zp, 1.0F, 1.0F);
         cfp.this.dP().a(this.e, $$0.a(dnc.c, Integer.valueOf(1)), 2);
         cfp.this.dP().a(dwv.c, this.e, dwv.a.a(cfp.this));
      }

      @Override
      public boolean a() {
         return !cfp.this.fL() && super.a();
      }

      @Override
      public void c() {
         this.g = 0;
         cfp.this.w(false);
         super.c();
      }
   }

   class g extends cah {
      public g() {
         super(cfp.this);
      }

      @Override
      public void c() {
         super.c();
         cfp.this.gE();
      }

      @Override
      public boolean a() {
         return cfp.this.be() && cfp.this.b(awv.a) > 0.25 || cfp.this.bs();
      }
   }

   class h extends cam {
      private final cfp d;

      public h(final cfp $$0, final double $$1) {
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

   public static class i extends bso.a {
      public final cfp.v a;

      public i(cfp.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends cav {
      public j(final btr $$0, final Class<? extends btp> $$1, final float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && !cfp.this.gq() && !cfp.this.gz();
      }

      @Override
      public boolean b() {
         return super.b() && !cfp.this.gq() && !cfp.this.gz();
      }
   }

   public class k extends bzp {
      public k() {
         super(cfp.this);
      }

      @Override
      public void a() {
         if (!cfp.this.fL()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cfp.this.gw() && !cfp.this.ca() && !cfp.this.gz() && !cfp.this.gq();
      }
   }

   class l extends cax {
      public l(final double $$0, final boolean $$1) {
         super(cfp.this, $$0, $$1);
      }

      @Override
      protected void a(btp $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            cfp.this.a(awa.jh, 1.0F, 1.0F);
         }
      }

      @Override
      public void c() {
         cfp.this.z(false);
         super.c();
      }

      @Override
      public boolean a() {
         return !cfp.this.y() && !cfp.this.fL() && !cfp.this.ca() && !cfp.this.gq() && super.a();
      }
   }

   class m extends bzq {
      public m() {
         super(cfp.this);
      }

      @Override
      public void a() {
         if (cfp.this.gF()) {
            super.a();
         }
      }
   }

   class n extends cbg {
      public n(final double $$0) {
         super(cfp.this, $$0);
      }

      @Override
      public boolean h() {
         return !cfp.this.gC() && super.h();
      }
   }

   public class o extends car {
      @Override
      public boolean a() {
         if (!cfp.this.gy()) {
            return false;
         } else {
            btp $$0 = cfp.this.p();
            if ($$0 != null && $$0.bD()) {
               if ($$0.cI() != $$0.cH()) {
                  return false;
               } else {
                  boolean $$1 = cfp.a(cfp.this, $$0);
                  if (!$$1) {
                     cfp.this.K().a($$0, 0);
                     cfp.this.y(false);
                     cfp.this.z(false);
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
         btp $$0 = cfp.this.p();
         if ($$0 != null && $$0.bD()) {
            double $$1 = cfp.this.ds().d;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(cfp.this.dH()) < 15.0F) || !cfp.this.aE()) && !cfp.this.gq();
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
         cfp.this.s(true);
         cfp.this.x(true);
         cfp.this.z(false);
         btp $$0 = cfp.this.p();
         if ($$0 != null) {
            cfp.this.G().a($$0, 60.0F, 30.0F);
            evr $$1 = new evr($$0.du() - cfp.this.du(), $$0.dw() - cfp.this.dw(), $$0.dA() - cfp.this.dA()).d();
            cfp.this.h(cfp.this.ds().b($$1.c * 0.8, 0.9, $$1.e * 0.8));
         }

         cfp.this.K().n();
      }

      @Override
      public void d() {
         cfp.this.y(false);
         cfp.this.cv = 0.0F;
         cfp.this.cw = 0.0F;
         cfp.this.z(false);
         cfp.this.x(false);
      }

      @Override
      public void e() {
         btp $$0 = cfp.this.p();
         if ($$0 != null) {
            cfp.this.G().a($$0, 60.0F, 30.0F);
         }

         if (!cfp.this.gq()) {
            evr $$1 = cfp.this.ds();
            if ($$1.d * $$1.d < 0.03F && cfp.this.dH() != 0.0F) {
               cfp.this.s(ayz.j(0.2F, cfp.this.dH(), 0.0F));
            } else {
               double $$2 = $$1.h();
               double $$3 = Math.signum(-$$1.d) * Math.acos($$2 / $$1.f()) * 180.0F / (float)Math.PI;
               cfp.this.s((float)$$3);
            }
         }

         if ($$0 != null && cfp.this.f($$0) <= 2.0F) {
            cfp.this.C($$0);
         } else if (cfp.this.dH() > 0.0F && cfp.this.aE() && (float)cfp.this.ds().d != 0.0F && cfp.this.dP().a_(cfp.this.dp()).a(dfb.dN)) {
            cfp.this.s(60.0F);
            cfp.this.h(null);
            cfp.this.A(true);
         }
      }
   }

   class p extends can {
      public p() {
         this.a(EnumSet.of(can.a.a));
      }

      @Override
      public boolean a() {
         if (!cfp.this.a(btb.a).e()) {
            return false;
         } else if (cfp.this.p() != null || cfp.this.em() != null) {
            return false;
         } else if (!cfp.this.gF()) {
            return false;
         } else if (cfp.this.el().a(b(10)) != 0) {
            return false;
         } else {
            List<cjh> $$0 = cfp.this.dP().a(cjh.class, cfp.this.cK().c(8.0, 8.0, 8.0), cfp.ck);
            return !$$0.isEmpty() && cfp.this.a(btb.a).e();
         }
      }

      @Override
      public void e() {
         List<cjh> $$0 = cfp.this.dP().a(cjh.class, cfp.this.cK().c(8.0, 8.0, 8.0), cfp.ck);
         cup $$1 = cfp.this.a(btb.a);
         if ($$1.e() && !$$0.isEmpty()) {
            cfp.this.K().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void c() {
         List<cjh> $$0 = cfp.this.dP().a(cjh.class, cfp.this.cK().c(8.0, 8.0, 8.0), cfp.ck);
         if (!$$0.isEmpty()) {
            cfp.this.K().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends cbt {
      public q(final int $$0, final int $$1) {
         super(cfp.this, $$1);
      }

      @Override
      public void c() {
         cfp.this.gE();
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
         return !cfp.this.fL() && !cfp.this.y() && !cfp.this.gC() && cfp.this.p() == null;
      }
   }

   class r extends cfp.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(can.a.a, can.a.b));
      }

      @Override
      public boolean a() {
         return cfp.this.em() == null
            && cfp.this.el().i() < 0.02F
            && !cfp.this.fL()
            && cfp.this.p() == null
            && cfp.this.K().l()
            && !this.i()
            && !cfp.this.gw()
            && !cfp.this.ca();
      }

      @Override
      public boolean b() {
         return this.f > 0;
      }

      @Override
      public void c() {
         this.k();
         this.f = 2 + cfp.this.el().a(3);
         cfp.this.w(true);
         cfp.this.K().n();
      }

      @Override
      public void d() {
         cfp.this.w(false);
      }

      @Override
      public void e() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         cfp.this.G().a(cfp.this.du() + this.c, cfp.this.dy(), cfp.this.dA() + this.d, (float)cfp.this.ab(), (float)cfp.this.aa());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * cfp.this.el().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + cfp.this.el().a(20));
      }
   }

   class s extends cag {
      private int c = b(100);

      public s(final double $$0) {
         super(cfp.this, $$0);
      }

      @Override
      public boolean a() {
         if (!cfp.this.fL() && this.a.p() == null) {
            if (cfp.this.dP().ac() && cfp.this.dP().h(this.a.dp())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               iz $$0 = this.a.dp();
               return cfp.this.dP().R() && cfp.this.dP().h($$0) && !((arf)cfp.this.dP()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void c() {
         cfp.this.gE();
         super.c();
      }
   }

   class t extends cfp.d {
      private static final int c = b(140);
      private int d = cfp.this.ah.a(c);

      public t() {
         this.a(EnumSet.of(can.a.a, can.a.b, can.a.c));
      }

      @Override
      public boolean a() {
         return cfp.this.bo == 0.0F && cfp.this.bp == 0.0F && cfp.this.bq == 0.0F ? this.k() || cfp.this.fL() : false;
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
            return cfp.this.dP().R() && this.h() && !this.i() && !cfp.this.aB;
         }
      }

      @Override
      public void d() {
         this.d = cfp.this.ah.a(c);
         cfp.this.gE();
      }

      @Override
      public void c() {
         cfp.this.w(false);
         cfp.this.y(false);
         cfp.this.z(false);
         cfp.this.s(false);
         cfp.this.C(true);
         cfp.this.K().n();
         cfp.this.H().a(cfp.this.du(), cfp.this.dw(), cfp.this.dA(), 0.0);
      }
   }

   class u extends can {
      public u() {
         this.a(EnumSet.of(can.a.a, can.a.b));
      }

      @Override
      public boolean a() {
         if (cfp.this.fL()) {
            return false;
         } else {
            btp $$0 = cfp.this.p();
            return $$0 != null && $$0.bD() && cfp.cm.test($$0) && cfp.this.g($$0) > 36.0 && !cfp.this.ca() && !cfp.this.gz() && !cfp.this.bn;
         }
      }

      @Override
      public void c() {
         cfp.this.w(false);
         cfp.this.A(false);
      }

      @Override
      public void d() {
         btp $$0 = cfp.this.p();
         if ($$0 != null && cfp.a(cfp.this, $$0)) {
            cfp.this.z(true);
            cfp.this.y(true);
            cfp.this.K().n();
            cfp.this.G().a($$0, (float)cfp.this.ab(), (float)cfp.this.aa());
         } else {
            cfp.this.z(false);
            cfp.this.y(false);
         }
      }

      @Override
      public void e() {
         btp $$0 = cfp.this.p();
         if ($$0 != null) {
            cfp.this.G().a($$0, (float)cfp.this.ab(), (float)cfp.this.aa());
            if (cfp.this.g($$0) <= 36.0) {
               cfp.this.z(true);
               cfp.this.y(true);
               cfp.this.K().n();
            } else {
               cfp.this.K().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements azu {
      a(0, "red"),
      b(1, "snow");

      public static final azu.a<cfp.v> c = azu.a(cfp.v::values);
      private static final IntFunction<cfp.v> d = axp.a(cfp.v::a, values(), axp.a.a);
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

      public static cfp.v a(String $$0) {
         return c.a($$0, a);
      }

      public static cfp.v a(int $$0) {
         return d.apply($$0);
      }

      public static cfp.v a(ji<dcx> $$0) {
         return $$0.a(awo.ar) ? b : a;
      }
   }
}
