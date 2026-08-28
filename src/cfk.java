import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfk extends cfa implements buk<cfk.v> {
   private static final akg<Integer> cc = akk.a(cfk.class, aki.b);
   private static final akg<Byte> cd = akk.a(cfk.class, aki.a);
   private static final int ce = 1;
   public static final int bY = 4;
   public static final int bZ = 8;
   public static final int cb = 16;
   private static final int cf = 32;
   private static final int cg = 64;
   private static final int ch = 128;
   private static final akg<Optional<UUID>> ci = akk.a(cfk.class, aki.r);
   private static final akg<Optional<UUID>> cj = akk.a(cfk.class, aki.r);
   static final Predicate<cjc> ck = $$0 -> !$$0.y() && $$0.bD();
   private static final Predicate<bsp> cl = $$0 -> !($$0 instanceof btk $$1) ? false : $$1.eo() != null && $$1.ep() < $$1.ai + 600;
   static final Predicate<bsp> cm = $$0 -> $$0 instanceof cff || $$0 instanceof cfu;
   private static final Predicate<bsp> cn = $$0 -> !$$0.bY() && bsu.e.test($$0);
   private static final int co = 600;
   private static final bss cp = bsv.Q.n().a(0.5F).b(0.2975F);
   private cai cq;
   private cai cr;
   private cai cs;
   private float ct;
   private float cu;
   float cv;
   float cw;
   private int cx;

   public cfk(bsv<? extends cfk> $$0, dbt $$1) {
      super($$0, $$1);
      this.bO = new cfk.k();
      this.bP = new cfk.m();
      this.a(eoh.p, 0.0F);
      this.a(eoh.q, 0.0F);
      this.a_(true);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(ci, Optional.empty());
      $$0.a(cj, Optional.empty());
      $$0.a(cc, 0);
      $$0.a(cd, (byte)0);
   }

   @Override
   protected void z() {
      this.cq = new ccb<>(this, cfa.class, 10, false, false, $$0 -> $$0 instanceof cff || $$0 instanceof cfu);
      this.cr = new ccb<>(this, cgb.class, 10, false, false, cgb.bY);
      this.cs = new ccb<>(this, cex.class, 20, false, false, $$0 -> $$0 instanceof cez);
      this.bS.a(0, new cfk.g());
      this.bS.a(0, new bzx(this, this.dP()));
      this.bS.a(1, new cfk.b());
      this.bS.a(2, new cfk.n(2.2));
      this.bS.a(3, new cfk.e(1.0));
      this.bS.a(4, new bzp<>(this, cms.class, 16.0F, 1.6, 1.4, $$0 -> cn.test($$0) && !this.c($$0.cz()) && !this.gC()));
      this.bS.a(4, new bzp<>(this, cgd.class, 8.0F, 1.6, 1.4, $$0 -> !((cgd)$$0).s() && !this.gC()));
      this.bS.a(4, new bzp<>(this, cfs.class, 8.0F, 1.6, 1.4, $$0 -> !this.gC()));
      this.bS.a(5, new cfk.u());
      this.bS.a(6, new cfk.o());
      this.bS.a(6, new cfk.s(1.25));
      this.bS.a(7, new cfk.l(1.2F, true));
      this.bS.a(7, new cfk.t());
      this.bS.a(8, new cfk.h(this, 1.25));
      this.bS.a(9, new cfk.q(32, 200));
      this.bS.a(10, new cfk.f(1.2F, 12, 1));
      this.bS.a(10, new cao(this, 0.4F));
      this.bS.a(11, new cbv(this, 1.0));
      this.bS.a(11, new cfk.p());
      this.bS.a(12, new cfk.j(this, cms.class, 24.0F));
      this.bS.a(13, new cfk.r());
      this.bT.a(3, new cfk.a(btk.class, false, false, $$0 -> cl.test($$0) && !this.c($$0.cz())));
   }

   @Override
   public avv d(cuk $$0) {
      return avw.jj;
   }

   @Override
   public void n_() {
      if (!this.dP().B && this.bD() && this.db()) {
         this.cx++;
         cuk $$0 = this.a(bsw.a);
         if (this.n($$0)) {
            if (this.cx > 600) {
               cuk $$1 = $$0.a(this.dP(), this);
               if (!$$1.e()) {
                  this.a(bsw.a, $$1);
               }

               this.cx = 0;
            } else if (this.cx > 560 && this.ah.i() < 0.1F) {
               this.a(this.d($$0), 1.0F, 1.0F);
               this.dP().a(this, (byte)45);
            }
         }

         btk $$2 = this.p();
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
         this.a(avw.jf, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean fg() {
      return this.eB();
   }

   private boolean n(cuk $$0) {
      return $$0.b(km.u) && this.p() == null && this.aE() && !this.fL();
   }

   @Override
   protected void a(azc $$0, bqn $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cuk $$3;
         if ($$2 < 0.05F) {
            $$3 = new cuk(cun.oz);
         } else if ($$2 < 0.2F) {
            $$3 = new cuk(cun.qR);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cuk(cun.uD) : new cuk(cun.uE);
         } else if ($$2 < 0.6F) {
            $$3 = new cuk(cun.pw);
         } else if ($$2 < 0.8F) {
            $$3 = new cuk(cun.qD);
         } else {
            $$3 = new cuk(cun.pt);
         }

         this.a(bsw.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cuk $$1 = this.a(bsw.a);
         if (!$$1.e()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               evm $$3 = new evm(((double)this.ah.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dH() * (float) (Math.PI / 180.0))
                  .b(-this.dF() * (float) (Math.PI / 180.0));
               this.dP().a(new lf(lj.S, $$1), this.du() + this.bL().c / 2.0, this.dw(), this.dA() + this.bL().e / 2.0, $$3.c, $$3.d + 0.05, $$3.e);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static bur.a s() {
      return btm.A().a(bus.r, 0.3F).a(bus.q, 10.0).a(bus.k, 32.0).a(bus.c, 2.0);
   }

   @Nullable
   public cfk b(arb $$0, bsj $$1) {
      cfk $$2 = bsv.Q.a((dbt)$$0);
      if ($$2 != null) {
         $$2.a(this.ah.h() ? this.u() : ((cfk)$$1).u());
      }

      return $$2;
   }

   public static boolean c(bsv<cfk> $$0, dbu $$1, bto $$2, iz $$3, azc $$4) {
      return $$1.a_($$3.d()).a(awl.ce) && a($$1, $$3);
   }

   @Nullable
   @Override
   public bud a(dci $$0, bqn $$1, bto $$2, @Nullable bud $$3) {
      ji<dcs> $$4 = $$0.t(this.dp());
      cfk.v $$5 = cfk.v.a($$4);
      boolean $$6 = false;
      if ($$3 instanceof cfk.i $$7) {
         $$5 = $$7.a;
         if ($$7.a() >= 2) {
            $$6 = true;
         }
      } else {
         $$3 = new cfk.i($$5);
      }

      this.a($$5);
      if ($$6) {
         this.c_(-24000);
      }

      if ($$0 instanceof arb) {
         this.gA();
      }

      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   private void gA() {
      if (this.u() == cfk.v.a) {
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
   protected void a(cms $$0, bqo $$1, cuk $$2) {
      if (this.o($$2)) {
         this.a(this.d($$2), 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   @Override
   public bss e(btw $$0) {
      return this.p_() ? cp : super.e($$0);
   }

   public cfk.v u() {
      return cfk.v.a(this.ao.a(cc));
   }

   public void a(cfk.v $$0) {
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
      this.a(cfk.v.a($$0.l("Type")));
      this.w($$0.q("Sitting"));
      this.y($$0.q("Crouching"));
      if (this.dP() instanceof arb) {
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
   public boolean f(cuk $$0) {
      bsw $$1 = btm.h($$0);
      return !this.a($$1).e() ? false : $$1 == bsw.a && super.f($$0);
   }

   @Override
   public boolean j(cuk $$0) {
      cuk $$1 = this.a(bsw.a);
      return $$1.e() || this.cx > 0 && $$0.b(km.u) && !$$1.b(km.u);
   }

   private void p(cuk $$0) {
      if (!$$0.e() && !this.dP().B) {
         cjc $$1 = new cjc(this.dP(), this.du() + this.bL().c, this.dw() + 1.0, this.dA() + this.bL().e, $$0);
         $$1.b(40);
         $$1.b(this);
         this.a(avw.jo, 1.0F, 1.0F);
         this.dP().b($$1);
      }
   }

   private void q(cuk $$0) {
      cjc $$1 = new cjc(this.dP(), this.du(), this.dw(), this.dA(), $$0);
      this.dP().b($$1);
   }

   @Override
   protected void b(cjc $$0) {
      cuk $$1 = $$0.p();
      if (this.j($$1)) {
         int $$2 = $$1.I();
         if ($$2 > 1) {
            this.q($$1.a($$2 - 1));
         }

         this.p(this.a(bsw.a));
         this.a($$0);
         this.a(bsw.a, $$1.a(1));
         this.f(bsw.a);
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
            drx $$2 = this.dP().a_($$1);
            this.dP().c(2001, $$1, deu.i($$2));
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
   public boolean o(cuk $$0) {
      return $$0.a(awu.Z);
   }

   @Override
   protected void a(cms $$0, btm $$1) {
      ((cfk)$$1).b($$0.cz());
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
      return ayu.i($$0, this.cu, this.ct) * 0.11F * (float) Math.PI;
   }

   public float H(float $$0) {
      return ayu.i($$0, this.cw, this.cv);
   }

   @Override
   public void h(@Nullable btk $$0) {
      if (this.gC() && $$0 == null) {
         this.B(false);
      }

      super.h($$0);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return ayu.f(($$0 - 5.0F) * $$1);
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
      avv $$0 = this.v();
      if ($$0 == avw.jl) {
         this.a($$0, 2.0F, this.ff());
      } else {
         super.Q();
      }
   }

   @Nullable
   @Override
   protected avv v() {
      if (this.fL()) {
         return avw.jm;
      } else {
         if (!this.dP().R() && this.ah.i() < 0.1F) {
            List<cms> $$0 = this.dP().a(cms.class, this.cK().c(16.0, 16.0, 16.0), bsu.f);
            if ($$0.isEmpty()) {
               return avw.jl;
            }
         }

         return avw.jg;
      }
   }

   @Nullable
   @Override
   protected avv d(bri $$0) {
      return avw.jk;
   }

   @Nullable
   @Override
   protected avv o_() {
      return avw.ji;
   }

   boolean c(UUID $$0) {
      return this.gB().contains($$0);
   }

   @Override
   protected void g(bri $$0) {
      cuk $$1 = this.a(bsw.a);
      if (!$$1.e()) {
         this.b($$1);
         this.a(bsw.a, cuk.l);
      }

      super.g($$0);
   }

   public static boolean a(cfk $$0, btk $$1) {
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
   public evm cM() {
      return new evm(0.0, (double)(0.55F * this.cL()), (double)(this.dj() * 0.4F));
   }

   class a extends ccb<btk> {
      @Nullable
      private btk j;
      @Nullable
      private btk k;
      private int l;

      public a(final Class<btk> $$0, final boolean $$1, final boolean $$2, @Nullable final Predicate<btk> $$3) {
         super(cfk.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean a() {
         if (this.b > 0 && this.e.el().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : cfk.this.gB()) {
               if ($$0 != null && cfk.this.dP() instanceof arb && ((arb)cfk.this.dP()).a($$0) instanceof btk $$2) {
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

         cfk.this.a(avw.jf, 1.0F, 1.0F);
         cfk.this.B(true);
         cfk.this.gD();
         super.c();
      }
   }

   class b extends cai {
      int a;

      public b() {
         this.a(EnumSet.of(cai.a.b, cai.a.c, cai.a.a));
      }

      @Override
      public boolean a() {
         return cfk.this.gq();
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
         cfk.this.A(false);
      }

      @Override
      public void e() {
         this.a--;
      }
   }

   public class c implements Predicate<btk> {
      public boolean a(btk $$0) {
         if ($$0 instanceof cfk) {
            return false;
         } else if ($$0 instanceof cff || $$0 instanceof cfu || $$0 instanceof cjy) {
            return true;
         } else if ($$0 instanceof buh) {
            return !((buh)$$0).s();
         } else if (!($$0 instanceof cms) || !$$0.N_() && !((cms)$$0).f()) {
            return cfk.this.c($$0.cz()) ? false : !$$0.fL() && !$$0.bY();
         } else {
            return false;
         }
      }
   }

   abstract class d extends cai {
      private final ceb b = ceb.a().a(12.0).d().a(cfk.this.new c());

      protected boolean h() {
         iz $$0 = iz.a(cfk.this.du(), cfk.this.cK().e, cfk.this.dA());
         return !cfk.this.dP().h($$0) && cfk.this.d($$0) >= 0.0F;
      }

      protected boolean i() {
         return !cfk.this.dP().a(btk.class, this.b, cfk.this, cfk.this.cK().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends bzu {
      public e(final double $$0) {
         super(cfk.this, $$0);
      }

      @Override
      public void c() {
         ((cfk)this.a).gE();
         ((cfk)this.c).gE();
         super.c();
      }

      @Override
      protected void g() {
         arb $$0 = (arb)this.b;
         cfk $$1 = (cfk)this.a.a($$0, (bsj)this.c);
         if ($$1 != null) {
            arc $$2 = this.a.gt();
            arc $$3 = this.c.gt();
            arc $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.cz());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.cz());
            }

            if ($$4 != null) {
               $$4.a(awg.P);
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
            if (this.b.ab().b(dbp.f)) {
               this.b.b(new bta(this.b, this.a.du(), this.a.dw(), this.a.dA(), this.a.el().a(7) + 1));
            }
         }
      }
   }

   public class f extends cav {
      private static final int i = 40;
      protected int g;

      public f(final double $$1, final int $$2, final int $$3) {
         super(cfk.this, $$1, $$2, $$3);
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
      protected boolean a(dbw $$0, iz $$1) {
         drx $$2 = $$0.a_($$1);
         return $$2.a(dew.oi) && $$2.c(dmx.c) >= 2 || dfq.h_($$2);
      }

      @Override
      public void e() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && cfk.this.ah.i() < 0.05F) {
            cfk.this.a(avw.jn, 1.0F, 1.0F);
         }

         super.e();
      }

      protected void o() {
         if (cfk.this.dP().ab().b(dbp.c)) {
            drx $$0 = cfk.this.dP().a_(this.e);
            if ($$0.a(dew.oi)) {
               this.b($$0);
            } else if (dfq.h_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(drx $$0) {
         dfq.a(cfk.this, $$0, cfk.this.dP(), this.e);
      }

      private void b(drx $$0) {
         int $$1 = $$0.c(dmx.c);
         $$0.a(dmx.c, Integer.valueOf(1));
         int $$2 = 1 + cfk.this.dP().z.a(2) + ($$1 == 3 ? 1 : 0);
         cuk $$3 = cfk.this.a(bsw.a);
         if ($$3.e()) {
            cfk.this.a(bsw.a, new cuk(cun.wr));
            $$2--;
         }

         if ($$2 > 0) {
            deu.a(cfk.this.dP(), this.e, new cuk(cun.wr, $$2));
         }

         cfk.this.a(avw.zp, 1.0F, 1.0F);
         cfk.this.dP().a(this.e, $$0.a(dmx.c, Integer.valueOf(1)), 2);
         cfk.this.dP().a(dwq.c, this.e, dwq.a.a(cfk.this));
      }

      @Override
      public boolean a() {
         return !cfk.this.fL() && super.a();
      }

      @Override
      public void c() {
         this.g = 0;
         cfk.this.w(false);
         super.c();
      }
   }

   class g extends cac {
      public g() {
         super(cfk.this);
      }

      @Override
      public void c() {
         super.c();
         cfk.this.gE();
      }

      @Override
      public boolean a() {
         return cfk.this.be() && cfk.this.b(awr.a) > 0.25 || cfk.this.bs();
      }
   }

   class h extends cah {
      private final cfk d;

      public h(final cfk $$0, final double $$1) {
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

   public static class i extends bsj.a {
      public final cfk.v a;

      public i(cfk.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends caq {
      public j(final btm $$0, final Class<? extends btk> $$1, final float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && !cfk.this.gq() && !cfk.this.gz();
      }

      @Override
      public boolean b() {
         return super.b() && !cfk.this.gq() && !cfk.this.gz();
      }
   }

   public class k extends bzk {
      public k() {
         super(cfk.this);
      }

      @Override
      public void a() {
         if (!cfk.this.fL()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cfk.this.gw() && !cfk.this.ca() && !cfk.this.gz() && !cfk.this.gq();
      }
   }

   class l extends cas {
      public l(final double $$0, final boolean $$1) {
         super(cfk.this, $$0, $$1);
      }

      @Override
      protected void a(btk $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            cfk.this.a(avw.jh, 1.0F, 1.0F);
         }
      }

      @Override
      public void c() {
         cfk.this.z(false);
         super.c();
      }

      @Override
      public boolean a() {
         return !cfk.this.y() && !cfk.this.fL() && !cfk.this.ca() && !cfk.this.gq() && super.a();
      }
   }

   class m extends bzl {
      public m() {
         super(cfk.this);
      }

      @Override
      public void a() {
         if (cfk.this.gF()) {
            super.a();
         }
      }
   }

   class n extends cbb {
      public n(final double $$0) {
         super(cfk.this, $$0);
      }

      @Override
      public boolean h() {
         return !cfk.this.gC() && super.h();
      }
   }

   public class o extends cam {
      @Override
      public boolean a() {
         if (!cfk.this.gy()) {
            return false;
         } else {
            btk $$0 = cfk.this.p();
            if ($$0 != null && $$0.bD()) {
               if ($$0.cI() != $$0.cH()) {
                  return false;
               } else {
                  boolean $$1 = cfk.a(cfk.this, $$0);
                  if (!$$1) {
                     cfk.this.K().a($$0, 0);
                     cfk.this.y(false);
                     cfk.this.z(false);
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
         btk $$0 = cfk.this.p();
         if ($$0 != null && $$0.bD()) {
            double $$1 = cfk.this.ds().d;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(cfk.this.dH()) < 15.0F) || !cfk.this.aE()) && !cfk.this.gq();
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
         cfk.this.s(true);
         cfk.this.x(true);
         cfk.this.z(false);
         btk $$0 = cfk.this.p();
         if ($$0 != null) {
            cfk.this.G().a($$0, 60.0F, 30.0F);
            evm $$1 = new evm($$0.du() - cfk.this.du(), $$0.dw() - cfk.this.dw(), $$0.dA() - cfk.this.dA()).d();
            cfk.this.h(cfk.this.ds().b($$1.c * 0.8, 0.9, $$1.e * 0.8));
         }

         cfk.this.K().n();
      }

      @Override
      public void d() {
         cfk.this.y(false);
         cfk.this.cv = 0.0F;
         cfk.this.cw = 0.0F;
         cfk.this.z(false);
         cfk.this.x(false);
      }

      @Override
      public void e() {
         btk $$0 = cfk.this.p();
         if ($$0 != null) {
            cfk.this.G().a($$0, 60.0F, 30.0F);
         }

         if (!cfk.this.gq()) {
            evm $$1 = cfk.this.ds();
            if ($$1.d * $$1.d < 0.03F && cfk.this.dH() != 0.0F) {
               cfk.this.s(ayu.j(0.2F, cfk.this.dH(), 0.0F));
            } else {
               double $$2 = $$1.h();
               double $$3 = Math.signum(-$$1.d) * Math.acos($$2 / $$1.f()) * 180.0F / (float)Math.PI;
               cfk.this.s((float)$$3);
            }
         }

         if ($$0 != null && cfk.this.f($$0) <= 2.0F) {
            cfk.this.C($$0);
         } else if (cfk.this.dH() > 0.0F && cfk.this.aE() && (float)cfk.this.ds().d != 0.0F && cfk.this.dP().a_(cfk.this.dp()).a(dew.dN)) {
            cfk.this.s(60.0F);
            cfk.this.h(null);
            cfk.this.A(true);
         }
      }
   }

   class p extends cai {
      public p() {
         this.a(EnumSet.of(cai.a.a));
      }

      @Override
      public boolean a() {
         if (!cfk.this.a(bsw.a).e()) {
            return false;
         } else if (cfk.this.p() != null || cfk.this.em() != null) {
            return false;
         } else if (!cfk.this.gF()) {
            return false;
         } else if (cfk.this.el().a(b(10)) != 0) {
            return false;
         } else {
            List<cjc> $$0 = cfk.this.dP().a(cjc.class, cfk.this.cK().c(8.0, 8.0, 8.0), cfk.ck);
            return !$$0.isEmpty() && cfk.this.a(bsw.a).e();
         }
      }

      @Override
      public void e() {
         List<cjc> $$0 = cfk.this.dP().a(cjc.class, cfk.this.cK().c(8.0, 8.0, 8.0), cfk.ck);
         cuk $$1 = cfk.this.a(bsw.a);
         if ($$1.e() && !$$0.isEmpty()) {
            cfk.this.K().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void c() {
         List<cjc> $$0 = cfk.this.dP().a(cjc.class, cfk.this.cK().c(8.0, 8.0, 8.0), cfk.ck);
         if (!$$0.isEmpty()) {
            cfk.this.K().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends cbo {
      public q(final int $$0, final int $$1) {
         super(cfk.this, $$1);
      }

      @Override
      public void c() {
         cfk.this.gE();
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
         return !cfk.this.fL() && !cfk.this.y() && !cfk.this.gC() && cfk.this.p() == null;
      }
   }

   class r extends cfk.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(cai.a.a, cai.a.b));
      }

      @Override
      public boolean a() {
         return cfk.this.em() == null
            && cfk.this.el().i() < 0.02F
            && !cfk.this.fL()
            && cfk.this.p() == null
            && cfk.this.K().l()
            && !this.i()
            && !cfk.this.gw()
            && !cfk.this.ca();
      }

      @Override
      public boolean b() {
         return this.f > 0;
      }

      @Override
      public void c() {
         this.k();
         this.f = 2 + cfk.this.el().a(3);
         cfk.this.w(true);
         cfk.this.K().n();
      }

      @Override
      public void d() {
         cfk.this.w(false);
      }

      @Override
      public void e() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         cfk.this.G().a(cfk.this.du() + this.c, cfk.this.dy(), cfk.this.dA() + this.d, (float)cfk.this.ab(), (float)cfk.this.aa());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * cfk.this.el().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + cfk.this.el().a(20));
      }
   }

   class s extends cab {
      private int c = b(100);

      public s(final double $$0) {
         super(cfk.this, $$0);
      }

      @Override
      public boolean a() {
         if (!cfk.this.fL() && this.a.p() == null) {
            if (cfk.this.dP().ac() && cfk.this.dP().h(this.a.dp())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               iz $$0 = this.a.dp();
               return cfk.this.dP().R() && cfk.this.dP().h($$0) && !((arb)cfk.this.dP()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void c() {
         cfk.this.gE();
         super.c();
      }
   }

   class t extends cfk.d {
      private static final int c = b(140);
      private int d = cfk.this.ah.a(c);

      public t() {
         this.a(EnumSet.of(cai.a.a, cai.a.b, cai.a.c));
      }

      @Override
      public boolean a() {
         return cfk.this.bo == 0.0F && cfk.this.bp == 0.0F && cfk.this.bq == 0.0F ? this.k() || cfk.this.fL() : false;
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
            return cfk.this.dP().R() && this.h() && !this.i() && !cfk.this.aB;
         }
      }

      @Override
      public void d() {
         this.d = cfk.this.ah.a(c);
         cfk.this.gE();
      }

      @Override
      public void c() {
         cfk.this.w(false);
         cfk.this.y(false);
         cfk.this.z(false);
         cfk.this.s(false);
         cfk.this.C(true);
         cfk.this.K().n();
         cfk.this.H().a(cfk.this.du(), cfk.this.dw(), cfk.this.dA(), 0.0);
      }
   }

   class u extends cai {
      public u() {
         this.a(EnumSet.of(cai.a.a, cai.a.b));
      }

      @Override
      public boolean a() {
         if (cfk.this.fL()) {
            return false;
         } else {
            btk $$0 = cfk.this.p();
            return $$0 != null && $$0.bD() && cfk.cm.test($$0) && cfk.this.g($$0) > 36.0 && !cfk.this.ca() && !cfk.this.gz() && !cfk.this.bn;
         }
      }

      @Override
      public void c() {
         cfk.this.w(false);
         cfk.this.A(false);
      }

      @Override
      public void d() {
         btk $$0 = cfk.this.p();
         if ($$0 != null && cfk.a(cfk.this, $$0)) {
            cfk.this.z(true);
            cfk.this.y(true);
            cfk.this.K().n();
            cfk.this.G().a($$0, (float)cfk.this.ab(), (float)cfk.this.aa());
         } else {
            cfk.this.z(false);
            cfk.this.y(false);
         }
      }

      @Override
      public void e() {
         btk $$0 = cfk.this.p();
         if ($$0 != null) {
            cfk.this.G().a($$0, (float)cfk.this.ab(), (float)cfk.this.aa());
            if (cfk.this.g($$0) <= 36.0) {
               cfk.this.z(true);
               cfk.this.y(true);
               cfk.this.K().n();
            } else {
               cfk.this.K().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements azp {
      a(0, "red"),
      b(1, "snow");

      public static final azp.a<cfk.v> c = azp.a(cfk.v::values);
      private static final IntFunction<cfk.v> d = axl.a(cfk.v::a, values(), axl.a.a);
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

      public static cfk.v a(String $$0) {
         return c.a($$0, a);
      }

      public static cfk.v a(int $$0) {
         return d.apply($$0);
      }

      public static cfk.v a(ji<dcs> $$0) {
         return $$0.a(awk.ar) ? b : a;
      }
   }
}
