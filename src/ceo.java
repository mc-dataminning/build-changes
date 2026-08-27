import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ceo extends cee implements bto<ceo.v> {
   private static final ajr<Integer> cc = ajv.a(ceo.class, ajt.b);
   private static final ajr<Byte> cd = ajv.a(ceo.class, ajt.a);
   private static final int ce = 1;
   public static final int bY = 4;
   public static final int bZ = 8;
   public static final int cb = 16;
   private static final int cf = 32;
   private static final int cg = 64;
   private static final int ch = 128;
   private static final ajr<Optional<UUID>> ci = ajv.a(ceo.class, ajt.r);
   private static final ajr<Optional<UUID>> cj = ajv.a(ceo.class, ajt.r);
   static final Predicate<cig> ck = $$0 -> !$$0.y() && $$0.bD();
   private static final Predicate<bru> cl = $$0 -> !($$0 instanceof bso $$1) ? false : $$1.eo() != null && $$1.ep() < $$1.ai + 600;
   static final Predicate<bru> cm = $$0 -> $$0 instanceof cej || $$0 instanceof cey;
   private static final Predicate<bru> cn = $$0 -> !$$0.bY() && brz.e.test($$0);
   private static final int co = 600;
   private static final brx cp = bsa.Q.n().a(0.5F).b(0.2975F);
   private bzm cq;
   private bzm cr;
   private bzm cs;
   private float ct;
   private float cu;
   float cv;
   float cw;
   private int cx;

   public ceo(bsa<? extends ceo> $$0, dax $$1) {
      super($$0, $$1);
      this.bO = new ceo.k();
      this.bP = new ceo.m();
      this.a(enl.p, 0.0F);
      this.a(enl.q, 0.0F);
      this.a_(true);
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(ci, Optional.empty());
      $$0.a(cj, Optional.empty());
      $$0.a(cc, 0);
      $$0.a(cd, (byte)0);
   }

   @Override
   protected void z() {
      this.cq = new cbf<>(this, cee.class, 10, false, false, $$0 -> $$0 instanceof cej || $$0 instanceof cey);
      this.cr = new cbf<>(this, cff.class, 10, false, false, cff.bY);
      this.cs = new cbf<>(this, ceb.class, 20, false, false, $$0 -> $$0 instanceof ced);
      this.bS.a(0, new ceo.g());
      this.bS.a(0, new bzb(this, this.dP()));
      this.bS.a(1, new ceo.b());
      this.bS.a(2, new ceo.n(2.2));
      this.bS.a(3, new ceo.e(1.0));
      this.bS.a(4, new byt<>(this, clw.class, 16.0F, 1.6, 1.4, $$0 -> cn.test($$0) && !this.c($$0.cz()) && !this.gB()));
      this.bS.a(4, new byt<>(this, cfh.class, 8.0F, 1.6, 1.4, $$0 -> !((cfh)$$0).s() && !this.gB()));
      this.bS.a(4, new byt<>(this, cew.class, 8.0F, 1.6, 1.4, $$0 -> !this.gB()));
      this.bS.a(5, new ceo.u());
      this.bS.a(6, new ceo.o());
      this.bS.a(6, new ceo.s(1.25));
      this.bS.a(7, new ceo.l(1.2F, true));
      this.bS.a(7, new ceo.t());
      this.bS.a(8, new ceo.h(this, 1.25));
      this.bS.a(9, new ceo.q(32, 200));
      this.bS.a(10, new ceo.f(1.2F, 12, 1));
      this.bS.a(10, new bzs(this, 0.4F));
      this.bS.a(11, new caz(this, 1.0));
      this.bS.a(11, new ceo.p());
      this.bS.a(12, new ceo.j(this, clw.class, 24.0F));
      this.bS.a(13, new ceo.r());
      this.bT.a(3, new ceo.a(bso.class, false, false, $$0 -> cl.test($$0) && !this.c($$0.cz())));
   }

   @Override
   public avg d(cto $$0) {
      return avh.jj;
   }

   @Override
   public void n_() {
      if (!this.dP().B && this.bD() && this.db()) {
         this.cx++;
         cto $$0 = this.a(bsb.a);
         if (this.n($$0)) {
            if (this.cx > 600) {
               cto $$1 = $$0.a(this.dP(), this);
               if (!$$1.e()) {
                  this.a(bsb.a, $$1);
               }

               this.cx = 0;
            } else if (this.cx > 560 && this.ah.i() < 0.1F) {
               this.a(this.d($$0), 1.0F, 1.0F);
               this.dP().a(this, (byte)45);
            }
         }

         bso $$2 = this.p();
         if ($$2 == null || !$$2.bD()) {
            this.y(false);
            this.z(false);
         }
      }

      if (this.fL() || this.fg()) {
         this.bo = false;
         this.bp = 0.0F;
         this.br = 0.0F;
      }

      super.n_();
      if (this.gB() && this.ah.i() < 0.05F) {
         this.a(avh.jf, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean fg() {
      return this.eB();
   }

   private boolean n(cto $$0) {
      return $$0.b(kb.u) && this.p() == null && this.aE() && !this.fL();
   }

   @Override
   protected void a(ayk $$0, bps $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cto $$3;
         if ($$2 < 0.05F) {
            $$3 = new cto(ctr.oz);
         } else if ($$2 < 0.2F) {
            $$3 = new cto(ctr.qR);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cto(ctr.uD) : new cto(ctr.uE);
         } else if ($$2 < 0.6F) {
            $$3 = new cto(ctr.pw);
         } else if ($$2 < 0.8F) {
            $$3 = new cto(ctr.qD);
         } else {
            $$3 = new cto(ctr.pt);
         }

         this.a(bsb.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cto $$1 = this.a(bsb.a);
         if (!$$1.e()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               euk $$3 = new euk(((double)this.ah.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dH() * (float) (Math.PI / 180.0))
                  .b(-this.dF() * (float) (Math.PI / 180.0));
               this.dP().a(new ku(ky.S, $$1), this.du() + this.bL().c / 2.0, this.dw(), this.dA() + this.bL().e / 2.0, $$3.c, $$3.d + 0.05, $$3.e);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static btv.a s() {
      return bsq.A().a(btw.r, 0.3F).a(btw.q, 10.0).a(btw.k, 32.0).a(btw.c, 2.0);
   }

   @Nullable
   public ceo b(aqm $$0, bro $$1) {
      ceo $$2 = bsa.Q.a((dax)$$0);
      if ($$2 != null) {
         $$2.a(this.ah.h() ? this.u() : ((ceo)$$1).u());
      }

      return $$2;
   }

   public static boolean c(bsa<ceo> $$0, day $$1, bss $$2, io $$3, ayk $$4) {
      return $$1.a_($$3.d()).a(avw.ce) && a($$1, $$3);
   }

   @Nullable
   @Override
   public bth a(dbm $$0, bps $$1, bss $$2, @Nullable bth $$3) {
      ix<dbw> $$4 = $$0.t(this.dp());
      ceo.v $$5 = ceo.v.a($$4);
      boolean $$6 = false;
      if ($$3 instanceof ceo.i $$7) {
         $$5 = $$7.a;
         if ($$7.a() >= 2) {
            $$6 = true;
         }
      } else {
         $$3 = new ceo.i($$5);
      }

      this.a($$5);
      if ($$6) {
         this.c_(-24000);
      }

      if ($$0 instanceof aqm) {
         this.gz();
      }

      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   private void gz() {
      if (this.u() == ceo.v.a) {
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
   protected void a(clw $$0, bpt $$1, cto $$2) {
      if (this.o($$2)) {
         this.a(this.d($$2), 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   @Override
   public brx e(bta $$0) {
      return this.p_() ? cp : super.e($$0);
   }

   public ceo.v u() {
      return ceo.v.a(this.ao.a(cc));
   }

   public void a(ceo.v $$0) {
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
      this.a(ceo.v.a($$0.l("Type")));
      this.w($$0.q("Sitting"));
      this.y($$0.q("Crouching"));
      if (this.dP() instanceof aqm) {
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
   public boolean f(cto $$0) {
      bsb $$1 = bsq.h($$0);
      return !this.a($$1).e() ? false : $$1 == bsb.a && super.f($$0);
   }

   @Override
   public boolean j(cto $$0) {
      cto $$1 = this.a(bsb.a);
      return $$1.e() || this.cx > 0 && $$0.b(kb.u) && !$$1.b(kb.u);
   }

   private void p(cto $$0) {
      if (!$$0.e() && !this.dP().B) {
         cig $$1 = new cig(this.dP(), this.du() + this.bL().c, this.dw() + 1.0, this.dA() + this.bL().e, $$0);
         $$1.b(40);
         $$1.b(this);
         this.a(avh.jo, 1.0F, 1.0F);
         this.dP().b($$1);
      }
   }

   private void q(cto $$0) {
      cig $$1 = new cig(this.dP(), this.du(), this.dw(), this.dA(), $$0);
      this.dP().b($$1);
   }

   @Override
   protected void b(cig $$0) {
      cto $$1 = $$0.p();
      if (this.j($$1)) {
         int $$2 = $$1.I();
         if ($$2 > 1) {
            this.q($$1.a($$2 - 1));
         }

         this.p(this.a(bsb.a));
         this.a($$0);
         this.a(bsb.a, $$1.a(1));
         this.f(bsb.a);
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
            drb $$2 = this.dP().a_($$1);
            this.dP().c(2001, $$1, ddy.i($$2));
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
   public boolean o(cto $$0) {
      return $$0.a(awe.Z);
   }

   @Override
   protected void a(clw $$0, bsq $$1) {
      ((ceo)$$1).b($$0.cz());
   }

   public boolean gv() {
      return this.u(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gw() {
      return this.bo;
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
      return ayd.i($$0, this.cu, this.ct) * 0.11F * (float) Math.PI;
   }

   public float H(float $$0) {
      return ayd.i($$0, this.cw, this.cv);
   }

   @Override
   public void h(@Nullable bso $$0) {
      if (this.gB() && $$0 == null) {
         this.B(false);
      }

      super.h($$0);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return ayd.f(($$0 - 5.0F) * $$1);
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
      avg $$0 = this.v();
      if ($$0 == avh.jl) {
         this.a($$0, 2.0F, this.ff());
      } else {
         super.P();
      }
   }

   @Nullable
   @Override
   protected avg v() {
      if (this.fL()) {
         return avh.jm;
      } else {
         if (!this.dP().Q() && this.ah.i() < 0.1F) {
            List<clw> $$0 = this.dP().a(clw.class, this.cK().c(16.0, 16.0, 16.0), brz.f);
            if ($$0.isEmpty()) {
               return avh.jl;
            }
         }

         return avh.jg;
      }
   }

   @Nullable
   @Override
   protected avg d(bqn $$0) {
      return avh.jk;
   }

   @Nullable
   @Override
   protected avg o_() {
      return avh.ji;
   }

   boolean c(UUID $$0) {
      return this.gA().contains($$0);
   }

   @Override
   protected void g(bqn $$0) {
      cto $$1 = this.a(bsb.a);
      if (!$$1.e()) {
         this.b($$1);
         this.a(bsb.a, cto.i);
      }

      super.g($$0);
   }

   public static boolean a(ceo $$0, bso $$1) {
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
   public euk cM() {
      return new euk(0.0, (double)(0.55F * this.cL()), (double)(this.dj() * 0.4F));
   }

   class a extends cbf<bso> {
      @Nullable
      private bso j;
      @Nullable
      private bso k;
      private int l;

      public a(Class<bso> $$0, boolean $$1, boolean $$2, @Nullable Predicate<bso> $$3) {
         super(ceo.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean a() {
         if (this.b > 0 && this.e.el().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : ceo.this.gA()) {
               if ($$0 != null && ceo.this.dP() instanceof aqm && ((aqm)ceo.this.dP()).a($$0) instanceof bso $$2) {
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

         ceo.this.a(avh.jf, 1.0F, 1.0F);
         ceo.this.B(true);
         ceo.this.gC();
         super.c();
      }
   }

   class b extends bzm {
      int a;

      public b() {
         this.a(EnumSet.of(bzm.a.b, bzm.a.c, bzm.a.a));
      }

      @Override
      public boolean a() {
         return ceo.this.gp();
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
         ceo.this.A(false);
      }

      @Override
      public void e() {
         this.a--;
      }
   }

   public class c implements Predicate<bso> {
      public boolean a(bso $$0) {
         if ($$0 instanceof ceo) {
            return false;
         } else if ($$0 instanceof cej || $$0 instanceof cey || $$0 instanceof cjc) {
            return true;
         } else if ($$0 instanceof btl) {
            return !((btl)$$0).s();
         } else if (!($$0 instanceof clw) || !$$0.N_() && !((clw)$$0).f()) {
            return ceo.this.c($$0.cz()) ? false : !$$0.fL() && !$$0.bY();
         } else {
            return false;
         }
      }
   }

   abstract class d extends bzm {
      private final cdf b = cdf.a().a(12.0).d().a(ceo.this.new c());

      protected boolean h() {
         io $$0 = io.a(ceo.this.du(), ceo.this.cK().e, ceo.this.dA());
         return !ceo.this.dP().h($$0) && ceo.this.d($$0) >= 0.0F;
      }

      protected boolean i() {
         return !ceo.this.dP().a(bso.class, this.b, ceo.this, ceo.this.cK().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends byy {
      public e(double $$0) {
         super(ceo.this, $$0);
      }

      @Override
      public void c() {
         ((ceo)this.a).gD();
         ((ceo)this.c).gD();
         super.c();
      }

      @Override
      protected void g() {
         aqm $$0 = (aqm)this.b;
         ceo $$1 = (ceo)this.a.a($$0, (bro)this.c);
         if ($$1 != null) {
            aqn $$2 = this.a.gs();
            aqn $$3 = this.c.gs();
            aqn $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.cz());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.cz());
            }

            if ($$4 != null) {
               $$4.a(avr.P);
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
            if (this.b.aa().b(dat.f)) {
               this.b.b(new bse(this.b, this.a.du(), this.a.dw(), this.a.dA(), this.a.el().a(7) + 1));
            }
         }
      }
   }

   public class f extends bzz {
      private static final int i = 40;
      protected int g;

      public f(double $$1, int $$2, int $$3) {
         super(ceo.this, $$1, $$2, $$3);
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
      protected boolean a(dba $$0, io $$1) {
         drb $$2 = $$0.a_($$1);
         return $$2.a(dea.oi) && $$2.c(dmb.c) >= 2 || deu.h_($$2);
      }

      @Override
      public void e() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && ceo.this.ah.i() < 0.05F) {
            ceo.this.a(avh.jn, 1.0F, 1.0F);
         }

         super.e();
      }

      protected void o() {
         if (ceo.this.dP().aa().b(dat.c)) {
            drb $$0 = ceo.this.dP().a_(this.e);
            if ($$0.a(dea.oi)) {
               this.b($$0);
            } else if (deu.h_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(drb $$0) {
         deu.a(ceo.this, $$0, ceo.this.dP(), this.e);
      }

      private void b(drb $$0) {
         int $$1 = $$0.c(dmb.c);
         $$0.a(dmb.c, Integer.valueOf(1));
         int $$2 = 1 + ceo.this.dP().z.a(2) + ($$1 == 3 ? 1 : 0);
         cto $$3 = ceo.this.a(bsb.a);
         if ($$3.e()) {
            ceo.this.a(bsb.a, new cto(ctr.wr));
            $$2--;
         }

         if ($$2 > 0) {
            ddy.a(ceo.this.dP(), this.e, new cto(ctr.wr, $$2));
         }

         ceo.this.a(avh.zp, 1.0F, 1.0F);
         ceo.this.dP().a(this.e, $$0.a(dmb.c, Integer.valueOf(1)), 2);
         ceo.this.dP().a(dvu.c, this.e, dvu.a.a(ceo.this));
      }

      @Override
      public boolean a() {
         return !ceo.this.fL() && super.a();
      }

      @Override
      public void c() {
         this.g = 0;
         ceo.this.w(false);
         super.c();
      }
   }

   class g extends bzg {
      public g() {
         super(ceo.this);
      }

      @Override
      public void c() {
         super.c();
         ceo.this.gD();
      }

      @Override
      public boolean a() {
         return ceo.this.be() && ceo.this.b(awb.a) > 0.25 || ceo.this.bs();
      }
   }

   class h extends bzl {
      private final ceo e;

      public h(ceo $$0, double $$1) {
         super($$0, $$1);
         this.e = $$0;
      }

      @Override
      public boolean a() {
         return !this.e.gB() && super.a();
      }

      @Override
      public boolean b() {
         return !this.e.gB() && super.b();
      }

      @Override
      public void c() {
         this.e.gD();
         super.c();
      }
   }

   public static class i extends bro.a {
      public final ceo.v a;

      public i(ceo.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends bzu {
      public j(bsq $$0, Class<? extends bso> $$1, float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && !ceo.this.gp() && !ceo.this.gy();
      }

      @Override
      public boolean b() {
         return super.b() && !ceo.this.gp() && !ceo.this.gy();
      }
   }

   public class k extends byo {
      public k() {
         super(ceo.this);
      }

      @Override
      public void a() {
         if (!ceo.this.fL()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !ceo.this.gv() && !ceo.this.ca() && !ceo.this.gy() && !ceo.this.gp();
      }
   }

   class l extends bzw {
      public l(double $$0, boolean $$1) {
         super(ceo.this, $$0, $$1);
      }

      @Override
      protected void a(bso $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            ceo.this.a(avh.jh, 1.0F, 1.0F);
         }
      }

      @Override
      public void c() {
         ceo.this.z(false);
         super.c();
      }

      @Override
      public boolean a() {
         return !ceo.this.y() && !ceo.this.fL() && !ceo.this.ca() && !ceo.this.gp() && super.a();
      }
   }

   class m extends byp {
      public m() {
         super(ceo.this);
      }

      @Override
      public void a() {
         if (ceo.this.gE()) {
            super.a();
         }
      }
   }

   class n extends caf {
      public n(double $$0) {
         super(ceo.this, $$0);
      }

      @Override
      public boolean h() {
         return !ceo.this.gB() && super.h();
      }
   }

   public class o extends bzq {
      @Override
      public boolean a() {
         if (!ceo.this.gx()) {
            return false;
         } else {
            bso $$0 = ceo.this.p();
            if ($$0 != null && $$0.bD()) {
               if ($$0.cI() != $$0.cH()) {
                  return false;
               } else {
                  boolean $$1 = ceo.a(ceo.this, $$0);
                  if (!$$1) {
                     ceo.this.K().a($$0, 0);
                     ceo.this.y(false);
                     ceo.this.z(false);
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
         bso $$0 = ceo.this.p();
         if ($$0 != null && $$0.bD()) {
            double $$1 = ceo.this.ds().d;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(ceo.this.dH()) < 15.0F) || !ceo.this.aE()) && !ceo.this.gp();
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
         ceo.this.s(true);
         ceo.this.x(true);
         ceo.this.z(false);
         bso $$0 = ceo.this.p();
         if ($$0 != null) {
            ceo.this.G().a($$0, 60.0F, 30.0F);
            euk $$1 = new euk($$0.du() - ceo.this.du(), $$0.dw() - ceo.this.dw(), $$0.dA() - ceo.this.dA()).d();
            ceo.this.g(ceo.this.ds().b($$1.c * 0.8, 0.9, $$1.e * 0.8));
         }

         ceo.this.K().n();
      }

      @Override
      public void d() {
         ceo.this.y(false);
         ceo.this.cv = 0.0F;
         ceo.this.cw = 0.0F;
         ceo.this.z(false);
         ceo.this.x(false);
      }

      @Override
      public void e() {
         bso $$0 = ceo.this.p();
         if ($$0 != null) {
            ceo.this.G().a($$0, 60.0F, 30.0F);
         }

         if (!ceo.this.gp()) {
            euk $$1 = ceo.this.ds();
            if ($$1.d * $$1.d < 0.03F && ceo.this.dH() != 0.0F) {
               ceo.this.s(ayd.j(0.2F, ceo.this.dH(), 0.0F));
            } else {
               double $$2 = $$1.h();
               double $$3 = Math.signum(-$$1.d) * Math.acos($$2 / $$1.f()) * 180.0F / (float)Math.PI;
               ceo.this.s((float)$$3);
            }
         }

         if ($$0 != null && ceo.this.f($$0) <= 2.0F) {
            ceo.this.C($$0);
         } else if (ceo.this.dH() > 0.0F && ceo.this.aE() && (float)ceo.this.ds().d != 0.0F && ceo.this.dP().a_(ceo.this.dp()).a(dea.dN)) {
            ceo.this.s(60.0F);
            ceo.this.h(null);
            ceo.this.A(true);
         }
      }
   }

   class p extends bzm {
      public p() {
         this.a(EnumSet.of(bzm.a.a));
      }

      @Override
      public boolean a() {
         if (!ceo.this.a(bsb.a).e()) {
            return false;
         } else if (ceo.this.p() != null || ceo.this.em() != null) {
            return false;
         } else if (!ceo.this.gE()) {
            return false;
         } else if (ceo.this.el().a(b(10)) != 0) {
            return false;
         } else {
            List<cig> $$0 = ceo.this.dP().a(cig.class, ceo.this.cK().c(8.0, 8.0, 8.0), ceo.ck);
            return !$$0.isEmpty() && ceo.this.a(bsb.a).e();
         }
      }

      @Override
      public void e() {
         List<cig> $$0 = ceo.this.dP().a(cig.class, ceo.this.cK().c(8.0, 8.0, 8.0), ceo.ck);
         cto $$1 = ceo.this.a(bsb.a);
         if ($$1.e() && !$$0.isEmpty()) {
            ceo.this.K().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void c() {
         List<cig> $$0 = ceo.this.dP().a(cig.class, ceo.this.cK().c(8.0, 8.0, 8.0), ceo.ck);
         if (!$$0.isEmpty()) {
            ceo.this.K().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends cas {
      public q(int $$0, int $$1) {
         super(ceo.this, $$1);
      }

      @Override
      public void c() {
         ceo.this.gD();
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
         return !ceo.this.fL() && !ceo.this.y() && !ceo.this.gB() && ceo.this.p() == null;
      }
   }

   class r extends ceo.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(bzm.a.a, bzm.a.b));
      }

      @Override
      public boolean a() {
         return ceo.this.em() == null
            && ceo.this.el().i() < 0.02F
            && !ceo.this.fL()
            && ceo.this.p() == null
            && ceo.this.K().l()
            && !this.i()
            && !ceo.this.gv()
            && !ceo.this.ca();
      }

      @Override
      public boolean b() {
         return this.f > 0;
      }

      @Override
      public void c() {
         this.k();
         this.f = 2 + ceo.this.el().a(3);
         ceo.this.w(true);
         ceo.this.K().n();
      }

      @Override
      public void d() {
         ceo.this.w(false);
      }

      @Override
      public void e() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         ceo.this.G().a(ceo.this.du() + this.c, ceo.this.dy(), ceo.this.dA() + this.d, (float)ceo.this.aa(), (float)ceo.this.Z());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * ceo.this.el().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + ceo.this.el().a(20));
      }
   }

   class s extends bzf {
      private int c = b(100);

      public s(double $$0) {
         super(ceo.this, $$0);
      }

      @Override
      public boolean a() {
         if (!ceo.this.fL() && this.a.p() == null) {
            if (ceo.this.dP().ab() && ceo.this.dP().h(this.a.dp())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               io $$0 = this.a.dp();
               return ceo.this.dP().Q() && ceo.this.dP().h($$0) && !((aqm)ceo.this.dP()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void c() {
         ceo.this.gD();
         super.c();
      }
   }

   class t extends ceo.d {
      private static final int c = b(140);
      private int d = ceo.this.ah.a(c);

      public t() {
         this.a(EnumSet.of(bzm.a.a, bzm.a.b, bzm.a.c));
      }

      @Override
      public boolean a() {
         return ceo.this.bp == 0.0F && ceo.this.bq == 0.0F && ceo.this.br == 0.0F ? this.k() || ceo.this.fL() : false;
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
            return ceo.this.dP().Q() && this.h() && !this.i() && !ceo.this.aB;
         }
      }

      @Override
      public void d() {
         this.d = ceo.this.ah.a(c);
         ceo.this.gD();
      }

      @Override
      public void c() {
         ceo.this.w(false);
         ceo.this.y(false);
         ceo.this.z(false);
         ceo.this.s(false);
         ceo.this.C(true);
         ceo.this.K().n();
         ceo.this.H().a(ceo.this.du(), ceo.this.dw(), ceo.this.dA(), 0.0);
      }
   }

   class u extends bzm {
      public u() {
         this.a(EnumSet.of(bzm.a.a, bzm.a.b));
      }

      @Override
      public boolean a() {
         if (ceo.this.fL()) {
            return false;
         } else {
            bso $$0 = ceo.this.p();
            return $$0 != null && $$0.bD() && ceo.cm.test($$0) && ceo.this.g($$0) > 36.0 && !ceo.this.ca() && !ceo.this.gy() && !ceo.this.bo;
         }
      }

      @Override
      public void c() {
         ceo.this.w(false);
         ceo.this.A(false);
      }

      @Override
      public void d() {
         bso $$0 = ceo.this.p();
         if ($$0 != null && ceo.a(ceo.this, $$0)) {
            ceo.this.z(true);
            ceo.this.y(true);
            ceo.this.K().n();
            ceo.this.G().a($$0, (float)ceo.this.aa(), (float)ceo.this.Z());
         } else {
            ceo.this.z(false);
            ceo.this.y(false);
         }
      }

      @Override
      public void e() {
         bso $$0 = ceo.this.p();
         if ($$0 != null) {
            ceo.this.G().a($$0, (float)ceo.this.aa(), (float)ceo.this.Z());
            if (ceo.this.g($$0) <= 36.0) {
               ceo.this.z(true);
               ceo.this.y(true);
               ceo.this.K().n();
            } else {
               ceo.this.K().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements ayx {
      a(0, "red"),
      b(1, "snow");

      public static final ayx.a<ceo.v> c = ayx.a(ceo.v::values);
      private static final IntFunction<ceo.v> d = awv.a(ceo.v::a, values(), awv.a.a);
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

      public static ceo.v a(String $$0) {
         return c.a($$0, a);
      }

      public static ceo.v a(int $$0) {
         return d.apply($$0);
      }

      public static ceo.v a(ix<dbw> $$0) {
         return $$0.a(avv.ar) ? b : a;
      }
   }
}
