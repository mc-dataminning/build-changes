import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ceq extends ceg implements btq<ceq.v> {
   private static final ajs<Integer> cc = ajw.a(ceq.class, aju.b);
   private static final ajs<Byte> cd = ajw.a(ceq.class, aju.a);
   private static final int ce = 1;
   public static final int bY = 4;
   public static final int bZ = 8;
   public static final int cb = 16;
   private static final int cf = 32;
   private static final int cg = 64;
   private static final int ch = 128;
   private static final ajs<Optional<UUID>> ci = ajw.a(ceq.class, aju.r);
   private static final ajs<Optional<UUID>> cj = ajw.a(ceq.class, aju.r);
   static final Predicate<cii> ck = $$0 -> !$$0.y() && $$0.bD();
   private static final Predicate<brw> cl = $$0 -> !($$0 instanceof bsq $$1) ? false : $$1.eo() != null && $$1.ep() < $$1.ai + 600;
   static final Predicate<brw> cm = $$0 -> $$0 instanceof cel || $$0 instanceof cfa;
   private static final Predicate<brw> cn = $$0 -> !$$0.bY() && bsb.e.test($$0);
   private static final int co = 600;
   private static final brz cp = bsc.Q.n().a(0.5F).b(0.2975F);
   private bzo cq;
   private bzo cr;
   private bzo cs;
   private float ct;
   private float cu;
   float cv;
   float cw;
   private int cx;

   public ceq(bsc<? extends ceq> $$0, daz $$1) {
      super($$0, $$1);
      this.bO = new ceq.k();
      this.bP = new ceq.m();
      this.a(enn.p, 0.0F);
      this.a(enn.q, 0.0F);
      this.a_(true);
   }

   @Override
   protected void a(ajw.a $$0) {
      super.a($$0);
      $$0.a(ci, Optional.empty());
      $$0.a(cj, Optional.empty());
      $$0.a(cc, 0);
      $$0.a(cd, (byte)0);
   }

   @Override
   protected void z() {
      this.cq = new cbh<>(this, ceg.class, 10, false, false, $$0 -> $$0 instanceof cel || $$0 instanceof cfa);
      this.cr = new cbh<>(this, cfh.class, 10, false, false, cfh.bY);
      this.cs = new cbh<>(this, ced.class, 20, false, false, $$0 -> $$0 instanceof cef);
      this.bS.a(0, new ceq.g());
      this.bS.a(0, new bzd(this, this.dP()));
      this.bS.a(1, new ceq.b());
      this.bS.a(2, new ceq.n(2.2));
      this.bS.a(3, new ceq.e(1.0));
      this.bS.a(4, new byv<>(this, cly.class, 16.0F, 1.6, 1.4, $$0 -> cn.test($$0) && !this.c($$0.cz()) && !this.gB()));
      this.bS.a(4, new byv<>(this, cfj.class, 8.0F, 1.6, 1.4, $$0 -> !((cfj)$$0).s() && !this.gB()));
      this.bS.a(4, new byv<>(this, cey.class, 8.0F, 1.6, 1.4, $$0 -> !this.gB()));
      this.bS.a(5, new ceq.u());
      this.bS.a(6, new ceq.o());
      this.bS.a(6, new ceq.s(1.25));
      this.bS.a(7, new ceq.l(1.2F, true));
      this.bS.a(7, new ceq.t());
      this.bS.a(8, new ceq.h(this, 1.25));
      this.bS.a(9, new ceq.q(32, 200));
      this.bS.a(10, new ceq.f(1.2F, 12, 1));
      this.bS.a(10, new bzu(this, 0.4F));
      this.bS.a(11, new cbb(this, 1.0));
      this.bS.a(11, new ceq.p());
      this.bS.a(12, new ceq.j(this, cly.class, 24.0F));
      this.bS.a(13, new ceq.r());
      this.bT.a(3, new ceq.a(bsq.class, false, false, $$0 -> cl.test($$0) && !this.c($$0.cz())));
   }

   @Override
   public avh d(ctq $$0) {
      return avi.jj;
   }

   @Override
   public void n_() {
      if (!this.dP().B && this.bD() && this.db()) {
         this.cx++;
         ctq $$0 = this.a(bsd.a);
         if (this.n($$0)) {
            if (this.cx > 600) {
               ctq $$1 = $$0.a(this.dP(), this);
               if (!$$1.e()) {
                  this.a(bsd.a, $$1);
               }

               this.cx = 0;
            } else if (this.cx > 560 && this.ah.i() < 0.1F) {
               this.a(this.d($$0), 1.0F, 1.0F);
               this.dP().a(this, (byte)45);
            }
         }

         bsq $$2 = this.p();
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
      if (this.gB() && this.ah.i() < 0.05F) {
         this.a(avi.jf, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean fg() {
      return this.eB();
   }

   private boolean n(ctq $$0) {
      return $$0.b(kb.u) && this.p() == null && this.aE() && !this.fL();
   }

   @Override
   protected void a(aym $$0, bpu $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         ctq $$3;
         if ($$2 < 0.05F) {
            $$3 = new ctq(ctt.oz);
         } else if ($$2 < 0.2F) {
            $$3 = new ctq(ctt.qR);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new ctq(ctt.uD) : new ctq(ctt.uE);
         } else if ($$2 < 0.6F) {
            $$3 = new ctq(ctt.pw);
         } else if ($$2 < 0.8F) {
            $$3 = new ctq(ctt.qD);
         } else {
            $$3 = new ctq(ctt.pt);
         }

         this.a(bsd.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         ctq $$1 = this.a(bsd.a);
         if (!$$1.e()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               eum $$3 = new eum(((double)this.ah.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dH() * (float) (Math.PI / 180.0))
                  .b(-this.dF() * (float) (Math.PI / 180.0));
               this.dP().a(new ku(ky.S, $$1), this.du() + this.bL().c / 2.0, this.dw(), this.dA() + this.bL().e / 2.0, $$3.c, $$3.d + 0.05, $$3.e);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static btx.a s() {
      return bss.A().a(bty.r, 0.3F).a(bty.q, 10.0).a(bty.k, 32.0).a(bty.c, 2.0);
   }

   @Nullable
   public ceq b(aqn $$0, brq $$1) {
      ceq $$2 = bsc.Q.a((daz)$$0);
      if ($$2 != null) {
         $$2.a(this.ah.h() ? this.u() : ((ceq)$$1).u());
      }

      return $$2;
   }

   public static boolean c(bsc<ceq> $$0, dba $$1, bsu $$2, io $$3, aym $$4) {
      return $$1.a_($$3.d()).a(avx.ce) && a($$1, $$3);
   }

   @Nullable
   @Override
   public btj a(dbo $$0, bpu $$1, bsu $$2, @Nullable btj $$3) {
      ix<dby> $$4 = $$0.t(this.dp());
      ceq.v $$5 = ceq.v.a($$4);
      boolean $$6 = false;
      if ($$3 instanceof ceq.i $$7) {
         $$5 = $$7.a;
         if ($$7.a() >= 2) {
            $$6 = true;
         }
      } else {
         $$3 = new ceq.i($$5);
      }

      this.a($$5);
      if ($$6) {
         this.c_(-24000);
      }

      if ($$0 instanceof aqn) {
         this.gz();
      }

      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   private void gz() {
      if (this.u() == ceq.v.a) {
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
   protected void a(cly $$0, bpv $$1, ctq $$2) {
      if (this.o($$2)) {
         this.a(this.d($$2), 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   @Override
   public brz e(btc $$0) {
      return this.p_() ? cp : super.e($$0);
   }

   public ceq.v u() {
      return ceq.v.a(this.ao.a(cc));
   }

   public void a(ceq.v $$0) {
      this.ao.a(cc, $$0.a());
   }

   List<UUID> gA() {
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
   public void b(ud $$0) {
      super.b($$0);
      List<UUID> $$1 = this.gA();
      uj $$2 = new uj();

      for (UUID $$3 : $$1) {
         if ($$3 != null) {
            $$2.add(us.a($$3));
         }
      }

      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fL());
      $$0.a("Type", this.u().c());
      $$0.a("Sitting", this.y());
      $$0.a("Crouching", this.ca());
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);

      for (va $$2 : $$0.c("Trusted", 11)) {
         this.b(us.a($$2));
      }

      this.C($$0.q("Sleeping"));
      this.a(ceq.v.a($$0.l("Type")));
      this.w($$0.q("Sitting"));
      this.y($$0.q("Crouching"));
      if (this.dP() instanceof aqn) {
         this.gz();
      }
   }

   public boolean y() {
      return this.u(1);
   }

   public void w(boolean $$0) {
      this.d(1, $$0);
   }

   public boolean gp() {
      return this.u(64);
   }

   void A(boolean $$0) {
      this.d(64, $$0);
   }

   boolean gB() {
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
   public boolean f(ctq $$0) {
      bsd $$1 = bss.h($$0);
      return !this.a($$1).e() ? false : $$1 == bsd.a && super.f($$0);
   }

   @Override
   public boolean j(ctq $$0) {
      ctq $$1 = this.a(bsd.a);
      return $$1.e() || this.cx > 0 && $$0.b(kb.u) && !$$1.b(kb.u);
   }

   private void p(ctq $$0) {
      if (!$$0.e() && !this.dP().B) {
         cii $$1 = new cii(this.dP(), this.du() + this.bL().c, this.dw() + 1.0, this.dA() + this.bL().e, $$0);
         $$1.b(40);
         $$1.b(this);
         this.a(avi.jo, 1.0F, 1.0F);
         this.dP().b($$1);
      }
   }

   private void q(ctq $$0) {
      cii $$1 = new cii(this.dP(), this.du(), this.dw(), this.dA(), $$0);
      this.dP().b($$1);
   }

   @Override
   protected void b(cii $$0) {
      ctq $$1 = $$0.p();
      if (this.j($$1)) {
         int $$2 = $$1.I();
         if ($$2 > 1) {
            this.q($$1.a($$2 - 1));
         }

         this.p(this.a(bsd.a));
         this.a($$0);
         this.a(bsd.a, $$1.a(1));
         this.f(bsd.a);
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
         if ($$0 || this.p() != null || this.dP().ab()) {
            this.gC();
         }

         if ($$0 || this.fL()) {
            this.w(false);
         }

         if (this.gp() && this.dP().z.i() < 0.2F) {
            io $$1 = this.dp();
            drd $$2 = this.dP().a_($$1);
            this.dP().c(2001, $$1, dea.i($$2));
         }
      }

      this.cu = this.ct;
      if (this.gy()) {
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
   public boolean o(ctq $$0) {
      return $$0.a(awf.Z);
   }

   @Override
   protected void a(cly $$0, bss $$1) {
      ((ceq)$$1).b($$0.cz());
   }

   public boolean gv() {
      return this.u(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gw() {
      return this.bn;
   }

   public boolean gx() {
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

   public boolean gy() {
      return this.u(8);
   }

   public float G(float $$0) {
      return ayf.i($$0, this.cu, this.ct) * 0.11F * (float) Math.PI;
   }

   public float H(float $$0) {
      return ayf.i($$0, this.cw, this.cv);
   }

   @Override
   public void h(@Nullable bsq $$0) {
      if (this.gB() && $$0 == null) {
         this.B(false);
      }

      super.h($$0);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return ayf.f(($$0 - 5.0F) * $$1);
   }

   void gC() {
      this.C(false);
   }

   void gD() {
      this.z(false);
      this.y(false);
      this.w(false);
      this.C(false);
      this.B(false);
      this.A(false);
   }

   boolean gE() {
      return !this.fL() && !this.y() && !this.gp();
   }

   @Override
   public void P() {
      avh $$0 = this.v();
      if ($$0 == avi.jl) {
         this.a($$0, 2.0F, this.ff());
      } else {
         super.P();
      }
   }

   @Nullable
   @Override
   protected avh v() {
      if (this.fL()) {
         return avi.jm;
      } else {
         if (!this.dP().Q() && this.ah.i() < 0.1F) {
            List<cly> $$0 = this.dP().a(cly.class, this.cK().c(16.0, 16.0, 16.0), bsb.f);
            if ($$0.isEmpty()) {
               return avi.jl;
            }
         }

         return avi.jg;
      }
   }

   @Nullable
   @Override
   protected avh d(bqp $$0) {
      return avi.jk;
   }

   @Nullable
   @Override
   protected avh o_() {
      return avi.ji;
   }

   boolean c(UUID $$0) {
      return this.gA().contains($$0);
   }

   @Override
   protected void g(bqp $$0) {
      ctq $$1 = this.a(bsd.a);
      if (!$$1.e()) {
         this.b($$1);
         this.a(bsd.a, ctq.i);
      }

      super.g($$0);
   }

   public static boolean a(ceq $$0, bsq $$1) {
      double $$2 = $$1.dA() - $$0.dA();
      double $$3 = $$1.du() - $$0.du();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dP().a_(io.a($$0.du() + $$8, $$0.dw() + (double)$$9, $$0.dA() + $$7)).r()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public eum cM() {
      return new eum(0.0, (double)(0.55F * this.cL()), (double)(this.dj() * 0.4F));
   }

   class a extends cbh<bsq> {
      @Nullable
      private bsq j;
      @Nullable
      private bsq k;
      private int l;

      public a(Class<bsq> $$0, boolean $$1, boolean $$2, @Nullable Predicate<bsq> $$3) {
         super(ceq.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean a() {
         if (this.b > 0 && this.e.el().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : ceq.this.gA()) {
               if ($$0 != null && ceq.this.dP() instanceof aqn && ((aqn)ceq.this.dP()).a($$0) instanceof bsq $$2) {
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

         ceq.this.a(avi.jf, 1.0F, 1.0F);
         ceq.this.B(true);
         ceq.this.gC();
         super.c();
      }
   }

   class b extends bzo {
      int a;

      public b() {
         this.a(EnumSet.of(bzo.a.b, bzo.a.c, bzo.a.a));
      }

      @Override
      public boolean a() {
         return ceq.this.gp();
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
         ceq.this.A(false);
      }

      @Override
      public void e() {
         this.a--;
      }
   }

   public class c implements Predicate<bsq> {
      public boolean a(bsq $$0) {
         if ($$0 instanceof ceq) {
            return false;
         } else if ($$0 instanceof cel || $$0 instanceof cfa || $$0 instanceof cje) {
            return true;
         } else if ($$0 instanceof btn) {
            return !((btn)$$0).s();
         } else if (!($$0 instanceof cly) || !$$0.N_() && !((cly)$$0).f()) {
            return ceq.this.c($$0.cz()) ? false : !$$0.fL() && !$$0.bY();
         } else {
            return false;
         }
      }
   }

   abstract class d extends bzo {
      private final cdh b = cdh.a().a(12.0).d().a(ceq.this.new c());

      protected boolean h() {
         io $$0 = io.a(ceq.this.du(), ceq.this.cK().e, ceq.this.dA());
         return !ceq.this.dP().h($$0) && ceq.this.d($$0) >= 0.0F;
      }

      protected boolean i() {
         return !ceq.this.dP().a(bsq.class, this.b, ceq.this, ceq.this.cK().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends bza {
      public e(double $$0) {
         super(ceq.this, $$0);
      }

      @Override
      public void c() {
         ((ceq)this.a).gD();
         ((ceq)this.c).gD();
         super.c();
      }

      @Override
      protected void g() {
         aqn $$0 = (aqn)this.b;
         ceq $$1 = (ceq)this.a.a($$0, (brq)this.c);
         if ($$1 != null) {
            aqo $$2 = this.a.gs();
            aqo $$3 = this.c.gs();
            aqo $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.cz());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.cz());
            }

            if ($$4 != null) {
               $$4.a(avs.P);
               am.p.a($$4, this.a, this.c, $$1);
            }

            this.a.c_(6000);
            this.c.c_(6000);
            this.a.gu();
            this.c.gu();
            $$1.c_(-24000);
            $$1.b(this.a.du(), this.a.dw(), this.a.dA(), 0.0F, 0.0F);
            $$0.a_($$1);
            this.b.a(this.a, (byte)18);
            if (this.b.aa().b(dav.f)) {
               this.b.b(new bsg(this.b, this.a.du(), this.a.dw(), this.a.dA(), this.a.el().a(7) + 1));
            }
         }
      }
   }

   public class f extends cab {
      private static final int i = 40;
      protected int g;

      public f(double $$1, int $$2, int $$3) {
         super(ceq.this, $$1, $$2, $$3);
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
      protected boolean a(dbc $$0, io $$1) {
         drd $$2 = $$0.a_($$1);
         return $$2.a(dec.oi) && $$2.c(dmd.c) >= 2 || dew.h_($$2);
      }

      @Override
      public void e() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && ceq.this.ah.i() < 0.05F) {
            ceq.this.a(avi.jn, 1.0F, 1.0F);
         }

         super.e();
      }

      protected void o() {
         if (ceq.this.dP().aa().b(dav.c)) {
            drd $$0 = ceq.this.dP().a_(this.e);
            if ($$0.a(dec.oi)) {
               this.b($$0);
            } else if (dew.h_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(drd $$0) {
         dew.a(ceq.this, $$0, ceq.this.dP(), this.e);
      }

      private void b(drd $$0) {
         int $$1 = $$0.c(dmd.c);
         $$0.a(dmd.c, Integer.valueOf(1));
         int $$2 = 1 + ceq.this.dP().z.a(2) + ($$1 == 3 ? 1 : 0);
         ctq $$3 = ceq.this.a(bsd.a);
         if ($$3.e()) {
            ceq.this.a(bsd.a, new ctq(ctt.wr));
            $$2--;
         }

         if ($$2 > 0) {
            dea.a(ceq.this.dP(), this.e, new ctq(ctt.wr, $$2));
         }

         ceq.this.a(avi.zp, 1.0F, 1.0F);
         ceq.this.dP().a(this.e, $$0.a(dmd.c, Integer.valueOf(1)), 2);
         ceq.this.dP().a(dvw.c, this.e, dvw.a.a(ceq.this));
      }

      @Override
      public boolean a() {
         return !ceq.this.fL() && super.a();
      }

      @Override
      public void c() {
         this.g = 0;
         ceq.this.w(false);
         super.c();
      }
   }

   class g extends bzi {
      public g() {
         super(ceq.this);
      }

      @Override
      public void c() {
         super.c();
         ceq.this.gD();
      }

      @Override
      public boolean a() {
         return ceq.this.be() && ceq.this.b(awc.a) > 0.25 || ceq.this.bs();
      }
   }

   class h extends bzn {
      private final ceq d;

      public h(ceq $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean a() {
         return !this.d.gB() && super.a();
      }

      @Override
      public boolean b() {
         return !this.d.gB() && super.b();
      }

      @Override
      public void c() {
         this.d.gD();
         super.c();
      }
   }

   public static class i extends brq.a {
      public final ceq.v a;

      public i(ceq.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends bzw {
      public j(bss $$0, Class<? extends bsq> $$1, float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && !ceq.this.gp() && !ceq.this.gy();
      }

      @Override
      public boolean b() {
         return super.b() && !ceq.this.gp() && !ceq.this.gy();
      }
   }

   public class k extends byq {
      public k() {
         super(ceq.this);
      }

      @Override
      public void a() {
         if (!ceq.this.fL()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !ceq.this.gv() && !ceq.this.ca() && !ceq.this.gy() && !ceq.this.gp();
      }
   }

   class l extends bzy {
      public l(double $$0, boolean $$1) {
         super(ceq.this, $$0, $$1);
      }

      @Override
      protected void a(bsq $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            ceq.this.a(avi.jh, 1.0F, 1.0F);
         }
      }

      @Override
      public void c() {
         ceq.this.z(false);
         super.c();
      }

      @Override
      public boolean a() {
         return !ceq.this.y() && !ceq.this.fL() && !ceq.this.ca() && !ceq.this.gp() && super.a();
      }
   }

   class m extends byr {
      public m() {
         super(ceq.this);
      }

      @Override
      public void a() {
         if (ceq.this.gE()) {
            super.a();
         }
      }
   }

   class n extends cah {
      public n(double $$0) {
         super(ceq.this, $$0);
      }

      @Override
      public boolean h() {
         return !ceq.this.gB() && super.h();
      }
   }

   public class o extends bzs {
      @Override
      public boolean a() {
         if (!ceq.this.gx()) {
            return false;
         } else {
            bsq $$0 = ceq.this.p();
            if ($$0 != null && $$0.bD()) {
               if ($$0.cI() != $$0.cH()) {
                  return false;
               } else {
                  boolean $$1 = ceq.a(ceq.this, $$0);
                  if (!$$1) {
                     ceq.this.K().a($$0, 0);
                     ceq.this.y(false);
                     ceq.this.z(false);
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
         bsq $$0 = ceq.this.p();
         if ($$0 != null && $$0.bD()) {
            double $$1 = ceq.this.ds().d;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(ceq.this.dH()) < 15.0F) || !ceq.this.aE()) && !ceq.this.gp();
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
         ceq.this.s(true);
         ceq.this.x(true);
         ceq.this.z(false);
         bsq $$0 = ceq.this.p();
         if ($$0 != null) {
            ceq.this.G().a($$0, 60.0F, 30.0F);
            eum $$1 = new eum($$0.du() - ceq.this.du(), $$0.dw() - ceq.this.dw(), $$0.dA() - ceq.this.dA()).d();
            ceq.this.g(ceq.this.ds().b($$1.c * 0.8, 0.9, $$1.e * 0.8));
         }

         ceq.this.K().n();
      }

      @Override
      public void d() {
         ceq.this.y(false);
         ceq.this.cv = 0.0F;
         ceq.this.cw = 0.0F;
         ceq.this.z(false);
         ceq.this.x(false);
      }

      @Override
      public void e() {
         bsq $$0 = ceq.this.p();
         if ($$0 != null) {
            ceq.this.G().a($$0, 60.0F, 30.0F);
         }

         if (!ceq.this.gp()) {
            eum $$1 = ceq.this.ds();
            if ($$1.d * $$1.d < 0.03F && ceq.this.dH() != 0.0F) {
               ceq.this.s(ayf.j(0.2F, ceq.this.dH(), 0.0F));
            } else {
               double $$2 = $$1.h();
               double $$3 = Math.signum(-$$1.d) * Math.acos($$2 / $$1.f()) * 180.0F / (float)Math.PI;
               ceq.this.s((float)$$3);
            }
         }

         if ($$0 != null && ceq.this.f($$0) <= 2.0F) {
            ceq.this.C($$0);
         } else if (ceq.this.dH() > 0.0F && ceq.this.aE() && (float)ceq.this.ds().d != 0.0F && ceq.this.dP().a_(ceq.this.dp()).a(dec.dN)) {
            ceq.this.s(60.0F);
            ceq.this.h(null);
            ceq.this.A(true);
         }
      }
   }

   class p extends bzo {
      public p() {
         this.a(EnumSet.of(bzo.a.a));
      }

      @Override
      public boolean a() {
         if (!ceq.this.a(bsd.a).e()) {
            return false;
         } else if (ceq.this.p() != null || ceq.this.em() != null) {
            return false;
         } else if (!ceq.this.gE()) {
            return false;
         } else if (ceq.this.el().a(b(10)) != 0) {
            return false;
         } else {
            List<cii> $$0 = ceq.this.dP().a(cii.class, ceq.this.cK().c(8.0, 8.0, 8.0), ceq.ck);
            return !$$0.isEmpty() && ceq.this.a(bsd.a).e();
         }
      }

      @Override
      public void e() {
         List<cii> $$0 = ceq.this.dP().a(cii.class, ceq.this.cK().c(8.0, 8.0, 8.0), ceq.ck);
         ctq $$1 = ceq.this.a(bsd.a);
         if ($$1.e() && !$$0.isEmpty()) {
            ceq.this.K().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void c() {
         List<cii> $$0 = ceq.this.dP().a(cii.class, ceq.this.cK().c(8.0, 8.0, 8.0), ceq.ck);
         if (!$$0.isEmpty()) {
            ceq.this.K().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends cau {
      public q(int $$0, int $$1) {
         super(ceq.this, $$1);
      }

      @Override
      public void c() {
         ceq.this.gD();
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
         return !ceq.this.fL() && !ceq.this.y() && !ceq.this.gB() && ceq.this.p() == null;
      }
   }

   class r extends ceq.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(bzo.a.a, bzo.a.b));
      }

      @Override
      public boolean a() {
         return ceq.this.em() == null
            && ceq.this.el().i() < 0.02F
            && !ceq.this.fL()
            && ceq.this.p() == null
            && ceq.this.K().l()
            && !this.i()
            && !ceq.this.gv()
            && !ceq.this.ca();
      }

      @Override
      public boolean b() {
         return this.f > 0;
      }

      @Override
      public void c() {
         this.k();
         this.f = 2 + ceq.this.el().a(3);
         ceq.this.w(true);
         ceq.this.K().n();
      }

      @Override
      public void d() {
         ceq.this.w(false);
      }

      @Override
      public void e() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         ceq.this.G().a(ceq.this.du() + this.c, ceq.this.dy(), ceq.this.dA() + this.d, (float)ceq.this.aa(), (float)ceq.this.Z());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * ceq.this.el().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + ceq.this.el().a(20));
      }
   }

   class s extends bzh {
      private int c = b(100);

      public s(double $$0) {
         super(ceq.this, $$0);
      }

      @Override
      public boolean a() {
         if (!ceq.this.fL() && this.a.p() == null) {
            if (ceq.this.dP().ab() && ceq.this.dP().h(this.a.dp())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               io $$0 = this.a.dp();
               return ceq.this.dP().Q() && ceq.this.dP().h($$0) && !((aqn)ceq.this.dP()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void c() {
         ceq.this.gD();
         super.c();
      }
   }

   class t extends ceq.d {
      private static final int c = b(140);
      private int d = ceq.this.ah.a(c);

      public t() {
         this.a(EnumSet.of(bzo.a.a, bzo.a.b, bzo.a.c));
      }

      @Override
      public boolean a() {
         return ceq.this.bo == 0.0F && ceq.this.bp == 0.0F && ceq.this.bq == 0.0F ? this.k() || ceq.this.fL() : false;
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
            return ceq.this.dP().Q() && this.h() && !this.i() && !ceq.this.aB;
         }
      }

      @Override
      public void d() {
         this.d = ceq.this.ah.a(c);
         ceq.this.gD();
      }

      @Override
      public void c() {
         ceq.this.w(false);
         ceq.this.y(false);
         ceq.this.z(false);
         ceq.this.s(false);
         ceq.this.C(true);
         ceq.this.K().n();
         ceq.this.H().a(ceq.this.du(), ceq.this.dw(), ceq.this.dA(), 0.0);
      }
   }

   class u extends bzo {
      public u() {
         this.a(EnumSet.of(bzo.a.a, bzo.a.b));
      }

      @Override
      public boolean a() {
         if (ceq.this.fL()) {
            return false;
         } else {
            bsq $$0 = ceq.this.p();
            return $$0 != null && $$0.bD() && ceq.cm.test($$0) && ceq.this.g($$0) > 36.0 && !ceq.this.ca() && !ceq.this.gy() && !ceq.this.bn;
         }
      }

      @Override
      public void c() {
         ceq.this.w(false);
         ceq.this.A(false);
      }

      @Override
      public void d() {
         bsq $$0 = ceq.this.p();
         if ($$0 != null && ceq.a(ceq.this, $$0)) {
            ceq.this.z(true);
            ceq.this.y(true);
            ceq.this.K().n();
            ceq.this.G().a($$0, (float)ceq.this.aa(), (float)ceq.this.Z());
         } else {
            ceq.this.z(false);
            ceq.this.y(false);
         }
      }

      @Override
      public void e() {
         bsq $$0 = ceq.this.p();
         if ($$0 != null) {
            ceq.this.G().a($$0, (float)ceq.this.aa(), (float)ceq.this.Z());
            if (ceq.this.g($$0) <= 36.0) {
               ceq.this.z(true);
               ceq.this.y(true);
               ceq.this.K().n();
            } else {
               ceq.this.K().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements ayz {
      a(0, "red"),
      b(1, "snow");

      public static final ayz.a<ceq.v> c = ayz.a(ceq.v::values);
      private static final IntFunction<ceq.v> d = aww.a(ceq.v::a, values(), aww.a.a);
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

      public static ceq.v a(String $$0) {
         return c.a($$0, a);
      }

      public static ceq.v a(int $$0) {
         return d.apply($$0);
      }

      public static ceq.v a(ix<dby> $$0) {
         return $$0.a(avw.ar) ? b : a;
      }
   }
}
