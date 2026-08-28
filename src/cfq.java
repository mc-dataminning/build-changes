import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfq extends cfg implements buq<cfq.v> {
   private static final akk<Integer> cc = ako.a(cfq.class, akm.b);
   private static final akk<Byte> cd = ako.a(cfq.class, akm.a);
   private static final int ce = 1;
   public static final int bY = 4;
   public static final int bZ = 8;
   public static final int cb = 16;
   private static final int cf = 32;
   private static final int cg = 64;
   private static final int ch = 128;
   private static final akk<Optional<UUID>> ci = ako.a(cfq.class, akm.r);
   private static final akk<Optional<UUID>> cj = ako.a(cfq.class, akm.r);
   static final Predicate<cji> ck = $$0 -> !$$0.y() && $$0.bD();
   private static final Predicate<bsv> cl = $$0 -> !($$0 instanceof btq $$1) ? false : $$1.eo() != null && $$1.ep() < $$1.ai + 600;
   static final Predicate<bsv> cm = $$0 -> $$0 instanceof cfl || $$0 instanceof cga;
   private static final Predicate<bsv> cn = $$0 -> !$$0.bY() && bta.e.test($$0);
   private static final int co = 600;
   private static final bsy cp = btb.Q.n().a(0.5F).b(0.2975F);
   private cao cq;
   private cao cr;
   private cao cs;
   private float ct;
   private float cu;
   float cv;
   float cw;
   private int cx;

   public cfq(btb<? extends cfq> $$0, dbz $$1) {
      super($$0, $$1);
      this.bO = new cfq.k();
      this.bP = new cfq.m();
      this.a(eon.p, 0.0F);
      this.a(eon.q, 0.0F);
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
      this.cq = new cch<>(this, cfg.class, 10, false, false, $$0 -> $$0 instanceof cfl || $$0 instanceof cga);
      this.cr = new cch<>(this, cgh.class, 10, false, false, cgh.bY);
      this.cs = new cch<>(this, cfd.class, 20, false, false, $$0 -> $$0 instanceof cff);
      this.bS.a(0, new cfq.g());
      this.bS.a(0, new cad(this, this.dP()));
      this.bS.a(1, new cfq.b());
      this.bS.a(2, new cfq.n(2.2));
      this.bS.a(3, new cfq.e(1.0));
      this.bS.a(4, new bzv<>(this, cmy.class, 16.0F, 1.6, 1.4, $$0 -> cn.test($$0) && !this.c($$0.cz()) && !this.gC()));
      this.bS.a(4, new bzv<>(this, cgj.class, 8.0F, 1.6, 1.4, $$0 -> !((cgj)$$0).s() && !this.gC()));
      this.bS.a(4, new bzv<>(this, cfy.class, 8.0F, 1.6, 1.4, $$0 -> !this.gC()));
      this.bS.a(5, new cfq.u());
      this.bS.a(6, new cfq.o());
      this.bS.a(6, new cfq.s(1.25));
      this.bS.a(7, new cfq.l(1.2F, true));
      this.bS.a(7, new cfq.t());
      this.bS.a(8, new cfq.h(this, 1.25));
      this.bS.a(9, new cfq.q(32, 200));
      this.bS.a(10, new cfq.f(1.2F, 12, 1));
      this.bS.a(10, new cau(this, 0.4F));
      this.bS.a(11, new ccb(this, 1.0));
      this.bS.a(11, new cfq.p());
      this.bS.a(12, new cfq.j(this, cmy.class, 24.0F));
      this.bS.a(13, new cfq.r());
      this.bT.a(3, new cfq.a(btq.class, false, false, $$0 -> cl.test($$0) && !this.c($$0.cz())));
   }

   @Override
   public avz d(cuq $$0) {
      return awa.jj;
   }

   @Override
   public void n_() {
      if (!this.dP().B && this.bD() && this.db()) {
         this.cx++;
         cuq $$0 = this.a(btc.a);
         if (this.n($$0)) {
            if (this.cx > 600) {
               cuq $$1 = $$0.a(this.dP(), this);
               if (!$$1.e()) {
                  this.a(btc.a, $$1);
               }

               this.cx = 0;
            } else if (this.cx > 560 && this.ah.i() < 0.1F) {
               this.a(this.d($$0), 1.0F, 1.0F);
               this.dP().a(this, (byte)45);
            }
         }

         btq $$2 = this.p();
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

   private boolean n(cuq $$0) {
      return $$0.b(km.v) && this.p() == null && this.aE() && !this.fL();
   }

   @Override
   protected void a(azh $$0, bqt $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cuq $$3;
         if ($$2 < 0.05F) {
            $$3 = new cuq(cut.oz);
         } else if ($$2 < 0.2F) {
            $$3 = new cuq(cut.qR);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cuq(cut.uD) : new cuq(cut.uE);
         } else if ($$2 < 0.6F) {
            $$3 = new cuq(cut.pw);
         } else if ($$2 < 0.8F) {
            $$3 = new cuq(cut.qD);
         } else {
            $$3 = new cuq(cut.pt);
         }

         this.a(btc.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cuq $$1 = this.a(btc.a);
         if (!$$1.e()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               evs $$3 = new evs(((double)this.ah.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dH() * (float) (Math.PI / 180.0))
                  .b(-this.dF() * (float) (Math.PI / 180.0));
               this.dP().a(new le(li.S, $$1), this.du() + this.bL().c / 2.0, this.dw(), this.dA() + this.bL().e / 2.0, $$3.c, $$3.d + 0.05, $$3.e);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static bux.a s() {
      return bts.A().a(buy.r, 0.3F).a(buy.q, 10.0).a(buy.k, 32.0).a(buy.c, 2.0).a(buy.s, 5.0);
   }

   @Nullable
   public cfq b(arf $$0, bsp $$1) {
      cfq $$2 = btb.Q.a((dbz)$$0);
      if ($$2 != null) {
         $$2.a(this.ah.h() ? this.u() : ((cfq)$$1).u());
      }

      return $$2;
   }

   public static boolean c(btb<cfq> $$0, dca $$1, btu $$2, iz $$3, azh $$4) {
      return $$1.a_($$3.d()).a(awp.ce) && a($$1, $$3);
   }

   @Nullable
   @Override
   public buj a(dco $$0, bqt $$1, btu $$2, @Nullable buj $$3) {
      ji<dcy> $$4 = $$0.t(this.dp());
      cfq.v $$5 = cfq.v.a($$4);
      boolean $$6 = false;
      if ($$3 instanceof cfq.i $$7) {
         $$5 = $$7.a;
         if ($$7.a() >= 2) {
            $$6 = true;
         }
      } else {
         $$3 = new cfq.i($$5);
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
      if (this.u() == cfq.v.a) {
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
   protected void a(cmy $$0, bqu $$1, cuq $$2) {
      if (this.o($$2)) {
         this.a(this.d($$2), 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   @Override
   public bsy e(buc $$0) {
      return this.p_() ? cp : super.e($$0);
   }

   public cfq.v u() {
      return cfq.v.a(this.ao.a(cc));
   }

   public void a(cfq.v $$0) {
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
      this.a(cfq.v.a($$0.l("Type")));
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
   public boolean f(cuq $$0) {
      btc $$1 = bts.h($$0);
      return !this.a($$1).e() ? false : $$1 == btc.a && super.f($$0);
   }

   @Override
   public boolean j(cuq $$0) {
      cuq $$1 = this.a(btc.a);
      return $$1.e() || this.cx > 0 && $$0.b(km.v) && !$$1.b(km.v);
   }

   private void p(cuq $$0) {
      if (!$$0.e() && !this.dP().B) {
         cji $$1 = new cji(this.dP(), this.du() + this.bL().c, this.dw() + 1.0, this.dA() + this.bL().e, $$0);
         $$1.b(40);
         $$1.b(this);
         this.a(awa.jo, 1.0F, 1.0F);
         this.dP().b($$1);
      }
   }

   private void q(cuq $$0) {
      cji $$1 = new cji(this.dP(), this.du(), this.dw(), this.dA(), $$0);
      this.dP().b($$1);
   }

   @Override
   protected void b(cji $$0) {
      cuq $$1 = $$0.p();
      if (this.j($$1)) {
         int $$2 = $$1.I();
         if ($$2 > 1) {
            this.q($$1.a($$2 - 1));
         }

         this.p(this.a(btc.a));
         this.a($$0);
         this.a(btc.a, $$1.a(1));
         this.f(btc.a);
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
            dsd $$2 = this.dP().a_($$1);
            this.dP().c(2001, $$1, dfa.i($$2));
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
   public boolean o(cuq $$0) {
      return $$0.a(awy.Z);
   }

   @Override
   protected void a(cmy $$0, bts $$1) {
      ((cfq)$$1).b($$0.cz());
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
   public void h(@Nullable btq $$0) {
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
            List<cmy> $$0 = this.dP().a(cmy.class, this.cK().c(16.0, 16.0, 16.0), bta.f);
            if ($$0.isEmpty()) {
               return awa.jl;
            }
         }

         return awa.jg;
      }
   }

   @Nullable
   @Override
   protected avz d(bro $$0) {
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
   protected void g(bro $$0) {
      cuq $$1 = this.a(btc.a);
      if (!$$1.e()) {
         this.b($$1);
         this.a(btc.a, cuq.l);
      }

      super.g($$0);
   }

   public static boolean a(cfq $$0, btq $$1) {
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
   public evs cM() {
      return new evs(0.0, (double)(0.55F * this.cL()), (double)(this.dj() * 0.4F));
   }

   class a extends cch<btq> {
      @Nullable
      private btq j;
      @Nullable
      private btq k;
      private int l;

      public a(final Class<btq> $$0, final boolean $$1, final boolean $$2, @Nullable final Predicate<btq> $$3) {
         super(cfq.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean a() {
         if (this.b > 0 && this.e.el().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : cfq.this.gB()) {
               if ($$0 != null && cfq.this.dP() instanceof arf && ((arf)cfq.this.dP()).a($$0) instanceof btq $$2) {
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

         cfq.this.a(awa.jf, 1.0F, 1.0F);
         cfq.this.B(true);
         cfq.this.gD();
         super.c();
      }
   }

   class b extends cao {
      int a;

      public b() {
         this.a(EnumSet.of(cao.a.b, cao.a.c, cao.a.a));
      }

      @Override
      public boolean a() {
         return cfq.this.gq();
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
         cfq.this.A(false);
      }

      @Override
      public void e() {
         this.a--;
      }
   }

   public class c implements Predicate<btq> {
      public boolean a(btq $$0) {
         if ($$0 instanceof cfq) {
            return false;
         } else if ($$0 instanceof cfl || $$0 instanceof cga || $$0 instanceof cke) {
            return true;
         } else if ($$0 instanceof bun) {
            return !((bun)$$0).s();
         } else if (!($$0 instanceof cmy) || !$$0.N_() && !((cmy)$$0).f()) {
            return cfq.this.c($$0.cz()) ? false : !$$0.fL() && !$$0.bY();
         } else {
            return false;
         }
      }
   }

   abstract class d extends cao {
      private final ceh b = ceh.a().a(12.0).d().a(cfq.this.new c());

      protected boolean h() {
         iz $$0 = iz.a(cfq.this.du(), cfq.this.cK().e, cfq.this.dA());
         return !cfq.this.dP().h($$0) && cfq.this.d($$0) >= 0.0F;
      }

      protected boolean i() {
         return !cfq.this.dP().a(btq.class, this.b, cfq.this, cfq.this.cK().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends caa {
      public e(final double $$0) {
         super(cfq.this, $$0);
      }

      @Override
      public void c() {
         ((cfq)this.a).gE();
         ((cfq)this.c).gE();
         super.c();
      }

      @Override
      protected void g() {
         arf $$0 = (arf)this.b;
         cfq $$1 = (cfq)this.a.a($$0, (bsp)this.c);
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
            if (this.b.ab().b(dbv.f)) {
               this.b.b(new btg(this.b, this.a.du(), this.a.dw(), this.a.dA(), this.a.el().a(7) + 1));
            }
         }
      }
   }

   public class f extends cbb {
      private static final int i = 40;
      protected int g;

      public f(final double $$1, final int $$2, final int $$3) {
         super(cfq.this, $$1, $$2, $$3);
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
      protected boolean a(dcc $$0, iz $$1) {
         dsd $$2 = $$0.a_($$1);
         return $$2.a(dfc.oi) && $$2.c(dnd.c) >= 2 || dfw.h_($$2);
      }

      @Override
      public void e() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && cfq.this.ah.i() < 0.05F) {
            cfq.this.a(awa.jn, 1.0F, 1.0F);
         }

         super.e();
      }

      protected void o() {
         if (cfq.this.dP().ab().b(dbv.c)) {
            dsd $$0 = cfq.this.dP().a_(this.e);
            if ($$0.a(dfc.oi)) {
               this.b($$0);
            } else if (dfw.h_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dsd $$0) {
         dfw.a(cfq.this, $$0, cfq.this.dP(), this.e);
      }

      private void b(dsd $$0) {
         int $$1 = $$0.c(dnd.c);
         $$0.a(dnd.c, Integer.valueOf(1));
         int $$2 = 1 + cfq.this.dP().z.a(2) + ($$1 == 3 ? 1 : 0);
         cuq $$3 = cfq.this.a(btc.a);
         if ($$3.e()) {
            cfq.this.a(btc.a, new cuq(cut.wr));
            $$2--;
         }

         if ($$2 > 0) {
            dfa.a(cfq.this.dP(), this.e, new cuq(cut.wr, $$2));
         }

         cfq.this.a(awa.zp, 1.0F, 1.0F);
         cfq.this.dP().a(this.e, $$0.a(dnd.c, Integer.valueOf(1)), 2);
         cfq.this.dP().a(dww.c, this.e, dww.a.a(cfq.this));
      }

      @Override
      public boolean a() {
         return !cfq.this.fL() && super.a();
      }

      @Override
      public void c() {
         this.g = 0;
         cfq.this.w(false);
         super.c();
      }
   }

   class g extends cai {
      public g() {
         super(cfq.this);
      }

      @Override
      public void c() {
         super.c();
         cfq.this.gE();
      }

      @Override
      public boolean a() {
         return cfq.this.be() && cfq.this.b(awv.a) > 0.25 || cfq.this.bs();
      }
   }

   class h extends can {
      private final cfq d;

      public h(final cfq $$0, final double $$1) {
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

   public static class i extends bsp.a {
      public final cfq.v a;

      public i(cfq.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends caw {
      public j(final bts $$0, final Class<? extends btq> $$1, final float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && !cfq.this.gq() && !cfq.this.gz();
      }

      @Override
      public boolean b() {
         return super.b() && !cfq.this.gq() && !cfq.this.gz();
      }
   }

   public class k extends bzq {
      public k() {
         super(cfq.this);
      }

      @Override
      public void a() {
         if (!cfq.this.fL()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cfq.this.gw() && !cfq.this.ca() && !cfq.this.gz() && !cfq.this.gq();
      }
   }

   class l extends cay {
      public l(final double $$0, final boolean $$1) {
         super(cfq.this, $$0, $$1);
      }

      @Override
      protected void a(btq $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            cfq.this.a(awa.jh, 1.0F, 1.0F);
         }
      }

      @Override
      public void c() {
         cfq.this.z(false);
         super.c();
      }

      @Override
      public boolean a() {
         return !cfq.this.y() && !cfq.this.fL() && !cfq.this.ca() && !cfq.this.gq() && super.a();
      }
   }

   class m extends bzr {
      public m() {
         super(cfq.this);
      }

      @Override
      public void a() {
         if (cfq.this.gF()) {
            super.a();
         }
      }
   }

   class n extends cbh {
      public n(final double $$0) {
         super(cfq.this, $$0);
      }

      @Override
      public boolean h() {
         return !cfq.this.gC() && super.h();
      }
   }

   public class o extends cas {
      @Override
      public boolean a() {
         if (!cfq.this.gy()) {
            return false;
         } else {
            btq $$0 = cfq.this.p();
            if ($$0 != null && $$0.bD()) {
               if ($$0.cI() != $$0.cH()) {
                  return false;
               } else {
                  boolean $$1 = cfq.a(cfq.this, $$0);
                  if (!$$1) {
                     cfq.this.K().a($$0, 0);
                     cfq.this.y(false);
                     cfq.this.z(false);
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
         btq $$0 = cfq.this.p();
         if ($$0 != null && $$0.bD()) {
            double $$1 = cfq.this.ds().d;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(cfq.this.dH()) < 15.0F) || !cfq.this.aE()) && !cfq.this.gq();
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
         cfq.this.s(true);
         cfq.this.x(true);
         cfq.this.z(false);
         btq $$0 = cfq.this.p();
         if ($$0 != null) {
            cfq.this.G().a($$0, 60.0F, 30.0F);
            evs $$1 = new evs($$0.du() - cfq.this.du(), $$0.dw() - cfq.this.dw(), $$0.dA() - cfq.this.dA()).d();
            cfq.this.h(cfq.this.ds().b($$1.c * 0.8, 0.9, $$1.e * 0.8));
         }

         cfq.this.K().n();
      }

      @Override
      public void d() {
         cfq.this.y(false);
         cfq.this.cv = 0.0F;
         cfq.this.cw = 0.0F;
         cfq.this.z(false);
         cfq.this.x(false);
      }

      @Override
      public void e() {
         btq $$0 = cfq.this.p();
         if ($$0 != null) {
            cfq.this.G().a($$0, 60.0F, 30.0F);
         }

         if (!cfq.this.gq()) {
            evs $$1 = cfq.this.ds();
            if ($$1.d * $$1.d < 0.03F && cfq.this.dH() != 0.0F) {
               cfq.this.s(ayz.j(0.2F, cfq.this.dH(), 0.0F));
            } else {
               double $$2 = $$1.h();
               double $$3 = Math.signum(-$$1.d) * Math.acos($$2 / $$1.f()) * 180.0F / (float)Math.PI;
               cfq.this.s((float)$$3);
            }
         }

         if ($$0 != null && cfq.this.f($$0) <= 2.0F) {
            cfq.this.C($$0);
         } else if (cfq.this.dH() > 0.0F && cfq.this.aE() && (float)cfq.this.ds().d != 0.0F && cfq.this.dP().a_(cfq.this.dp()).a(dfc.dN)) {
            cfq.this.s(60.0F);
            cfq.this.h(null);
            cfq.this.A(true);
         }
      }
   }

   class p extends cao {
      public p() {
         this.a(EnumSet.of(cao.a.a));
      }

      @Override
      public boolean a() {
         if (!cfq.this.a(btc.a).e()) {
            return false;
         } else if (cfq.this.p() != null || cfq.this.em() != null) {
            return false;
         } else if (!cfq.this.gF()) {
            return false;
         } else if (cfq.this.el().a(b(10)) != 0) {
            return false;
         } else {
            List<cji> $$0 = cfq.this.dP().a(cji.class, cfq.this.cK().c(8.0, 8.0, 8.0), cfq.ck);
            return !$$0.isEmpty() && cfq.this.a(btc.a).e();
         }
      }

      @Override
      public void e() {
         List<cji> $$0 = cfq.this.dP().a(cji.class, cfq.this.cK().c(8.0, 8.0, 8.0), cfq.ck);
         cuq $$1 = cfq.this.a(btc.a);
         if ($$1.e() && !$$0.isEmpty()) {
            cfq.this.K().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void c() {
         List<cji> $$0 = cfq.this.dP().a(cji.class, cfq.this.cK().c(8.0, 8.0, 8.0), cfq.ck);
         if (!$$0.isEmpty()) {
            cfq.this.K().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends cbu {
      public q(final int $$0, final int $$1) {
         super(cfq.this, $$1);
      }

      @Override
      public void c() {
         cfq.this.gE();
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
         return !cfq.this.fL() && !cfq.this.y() && !cfq.this.gC() && cfq.this.p() == null;
      }
   }

   class r extends cfq.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(cao.a.a, cao.a.b));
      }

      @Override
      public boolean a() {
         return cfq.this.em() == null
            && cfq.this.el().i() < 0.02F
            && !cfq.this.fL()
            && cfq.this.p() == null
            && cfq.this.K().l()
            && !this.i()
            && !cfq.this.gw()
            && !cfq.this.ca();
      }

      @Override
      public boolean b() {
         return this.f > 0;
      }

      @Override
      public void c() {
         this.k();
         this.f = 2 + cfq.this.el().a(3);
         cfq.this.w(true);
         cfq.this.K().n();
      }

      @Override
      public void d() {
         cfq.this.w(false);
      }

      @Override
      public void e() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         cfq.this.G().a(cfq.this.du() + this.c, cfq.this.dy(), cfq.this.dA() + this.d, (float)cfq.this.ab(), (float)cfq.this.aa());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * cfq.this.el().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + cfq.this.el().a(20));
      }
   }

   class s extends cah {
      private int c = b(100);

      public s(final double $$0) {
         super(cfq.this, $$0);
      }

      @Override
      public boolean a() {
         if (!cfq.this.fL() && this.a.p() == null) {
            if (cfq.this.dP().ac() && cfq.this.dP().h(this.a.dp())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               iz $$0 = this.a.dp();
               return cfq.this.dP().R() && cfq.this.dP().h($$0) && !((arf)cfq.this.dP()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void c() {
         cfq.this.gE();
         super.c();
      }
   }

   class t extends cfq.d {
      private static final int c = b(140);
      private int d = cfq.this.ah.a(c);

      public t() {
         this.a(EnumSet.of(cao.a.a, cao.a.b, cao.a.c));
      }

      @Override
      public boolean a() {
         return cfq.this.bo == 0.0F && cfq.this.bp == 0.0F && cfq.this.bq == 0.0F ? this.k() || cfq.this.fL() : false;
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
            return cfq.this.dP().R() && this.h() && !this.i() && !cfq.this.aB;
         }
      }

      @Override
      public void d() {
         this.d = cfq.this.ah.a(c);
         cfq.this.gE();
      }

      @Override
      public void c() {
         cfq.this.w(false);
         cfq.this.y(false);
         cfq.this.z(false);
         cfq.this.s(false);
         cfq.this.C(true);
         cfq.this.K().n();
         cfq.this.H().a(cfq.this.du(), cfq.this.dw(), cfq.this.dA(), 0.0);
      }
   }

   class u extends cao {
      public u() {
         this.a(EnumSet.of(cao.a.a, cao.a.b));
      }

      @Override
      public boolean a() {
         if (cfq.this.fL()) {
            return false;
         } else {
            btq $$0 = cfq.this.p();
            return $$0 != null && $$0.bD() && cfq.cm.test($$0) && cfq.this.g($$0) > 36.0 && !cfq.this.ca() && !cfq.this.gz() && !cfq.this.bn;
         }
      }

      @Override
      public void c() {
         cfq.this.w(false);
         cfq.this.A(false);
      }

      @Override
      public void d() {
         btq $$0 = cfq.this.p();
         if ($$0 != null && cfq.a(cfq.this, $$0)) {
            cfq.this.z(true);
            cfq.this.y(true);
            cfq.this.K().n();
            cfq.this.G().a($$0, (float)cfq.this.ab(), (float)cfq.this.aa());
         } else {
            cfq.this.z(false);
            cfq.this.y(false);
         }
      }

      @Override
      public void e() {
         btq $$0 = cfq.this.p();
         if ($$0 != null) {
            cfq.this.G().a($$0, (float)cfq.this.ab(), (float)cfq.this.aa());
            if (cfq.this.g($$0) <= 36.0) {
               cfq.this.z(true);
               cfq.this.y(true);
               cfq.this.K().n();
            } else {
               cfq.this.K().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements azu {
      a(0, "red"),
      b(1, "snow");

      public static final azu.a<cfq.v> c = azu.a(cfq.v::values);
      private static final IntFunction<cfq.v> d = axp.a(cfq.v::a, values(), axp.a.a);
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

      public static cfq.v a(String $$0) {
         return c.a($$0, a);
      }

      public static cfq.v a(int $$0) {
         return d.apply($$0);
      }

      public static cfq.v a(ji<dcy> $$0) {
         return $$0.a(awo.ar) ? b : a;
      }
   }
}
