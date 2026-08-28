import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfb extends cer implements bub<cfb.v> {
   private static final ajp<Integer> ce = ajt.a(cfb.class, ajr.b);
   private static final ajp<Byte> cf = ajt.a(cfb.class, ajr.a);
   private static final int cg = 1;
   public static final int ca = 4;
   public static final int cb = 8;
   public static final int cd = 16;
   private static final int ch = 32;
   private static final int ci = 64;
   private static final int cj = 128;
   private static final ajp<Optional<UUID>> ck = ajt.a(cfb.class, ajr.r);
   private static final ajp<Optional<UUID>> cl = ajt.a(cfb.class, ajr.r);
   static final Predicate<ciu> cm = $$0 -> !$$0.y() && $$0.bE();
   private static final Predicate<bsg> cn = $$0 -> !($$0 instanceof btb $$1) ? false : $$1.el() != null && $$1.em() < $$1.ai + 600;
   static final Predicate<bsg> co = $$0 -> $$0 instanceof cew || $$0 instanceof cfl;
   private static final Predicate<bsg> cp = $$0 -> !$$0.bZ() && bsl.e.test($$0);
   private static final int cq = 600;
   private static final bsj cr = bsm.Q.n().a(0.5F).b(0.2975F);
   private bzz cs;
   private bzz ct;
   private bzz cu;
   private float cv;
   private float cw;
   float cx;
   float cy;
   private int cz;

   public cfb(bsm<? extends cfb> $$0, dcf $$1) {
      super($$0, $$1);
      this.bQ = new cfb.k();
      this.bR = new cfb.m();
      this.a(eoy.p, 0.0F);
      this.a(eoy.q, 0.0F);
      this.a_(true);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(ck, Optional.empty());
      $$0.a(cl, Optional.empty());
      $$0.a(ce, 0);
      $$0.a(cf, (byte)0);
   }

   @Override
   protected void z() {
      this.cs = new cbs<>(this, cer.class, 10, false, false, $$0 -> $$0 instanceof cew || $$0 instanceof cfl);
      this.ct = new cbs<>(this, cfs.class, 10, false, false, cfs.ca);
      this.cu = new cbs<>(this, ceo.class, 20, false, false, $$0 -> $$0 instanceof ceq);
      this.bU.a(0, new cfb.g());
      this.bU.a(0, new bzo(this, this.dQ()));
      this.bU.a(1, new cfb.b());
      this.bU.a(2, new cfb.n(2.2));
      this.bU.a(3, new cfb.e(1.0));
      this.bU.a(4, new bzg<>(this, cmk.class, 16.0F, 1.6, 1.4, $$0 -> cp.test($$0) && !this.c($$0.cA()) && !this.gA()));
      this.bU.a(4, new bzg<>(this, cfu.class, 8.0F, 1.6, 1.4, $$0 -> !((cfu)$$0).s() && !this.gA()));
      this.bU.a(4, new bzg<>(this, cfj.class, 8.0F, 1.6, 1.4, $$0 -> !this.gA()));
      this.bU.a(5, new cfb.u());
      this.bU.a(6, new cfb.o());
      this.bU.a(6, new cfb.s(1.25));
      this.bU.a(7, new cfb.l(1.2F, true));
      this.bU.a(7, new cfb.t());
      this.bU.a(8, new cfb.h(this, 1.25));
      this.bU.a(9, new cfb.q(32, 200));
      this.bU.a(10, new cfb.f(1.2F, 12, 1));
      this.bU.a(10, new caf(this, 0.4F));
      this.bU.a(11, new cbm(this, 1.0));
      this.bU.a(11, new cfb.p());
      this.bU.a(12, new cfb.j(this, cmk.class, 24.0F));
      this.bU.a(13, new cfb.r());
      this.bV.a(3, new cfb.a(btb.class, false, false, $$0 -> cn.test($$0) && !this.c($$0.cA())));
   }

   @Override
   public avg d(cuc $$0) {
      return avh.jj;
   }

   @Override
   public void n_() {
      if (!this.dQ().B && this.bE() && this.dc()) {
         this.cz++;
         cuc $$0 = this.a(bsn.a);
         if (this.n($$0)) {
            if (this.cz > 600) {
               cuc $$1 = $$0.a(this.dQ(), this);
               if (!$$1.e()) {
                  this.a(bsn.a, $$1);
               }

               this.cz = 0;
            } else if (this.cz > 560 && this.ah.i() < 0.1F) {
               this.a(this.d($$0), 1.0F, 1.0F);
               this.dQ().a(this, (byte)45);
            }
         }

         btb $$2 = this.p();
         if ($$2 == null || !$$2.bE()) {
            this.y(false);
            this.z(false);
         }
      }

      if (this.fI() || this.fd()) {
         this.bn = false;
         this.bo = 0.0F;
         this.bq = 0.0F;
      }

      super.n_();
      if (this.gA() && this.ah.i() < 0.05F) {
         this.a(avh.jf, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean fd() {
      return this.ey();
   }

   private boolean n(cuc $$0) {
      return $$0.b(kn.v) && this.p() == null && this.aF() && !this.fI();
   }

   @Override
   protected void a(ayo $$0, bqe $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cuc $$3;
         if ($$2 < 0.05F) {
            $$3 = new cuc(cuf.oA);
         } else if ($$2 < 0.2F) {
            $$3 = new cuc(cuf.qR);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cuc(cuf.uD) : new cuc(cuf.uE);
         } else if ($$2 < 0.6F) {
            $$3 = new cuc(cuf.pw);
         } else if ($$2 < 0.8F) {
            $$3 = new cuc(cuf.qD);
         } else {
            $$3 = new cuc(cuf.pt);
         }

         this.a(bsn.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cuc $$1 = this.a(bsn.a);
         if (!$$1.e()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               ewf $$3 = new ewf(((double)this.ah.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dI() * (float) (Math.PI / 180.0))
                  .b(-this.dG() * (float) (Math.PI / 180.0));
               this.dQ().a(new lf(lj.S, $$1), this.dv() + this.bM().c / 2.0, this.dx(), this.dB() + this.bM().e / 2.0, $$3.c, $$3.d + 0.05, $$3.e);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static bui.a s() {
      return btd.A().a(buj.v, 0.3F).a(buj.s, 10.0).a(buj.m, 32.0).a(buj.c, 2.0).a(buj.x, 5.0);
   }

   @Nullable
   public cfb b(aqm $$0, bsa $$1) {
      cfb $$2 = bsm.Q.a((dcf)$$0);
      if ($$2 != null) {
         $$2.a(this.ah.h() ? this.u() : ((cfb)$$1).u());
      }

      return $$2;
   }

   public static boolean c(bsm<cfb> $$0, dcg $$1, btf $$2, ja $$3, ayo $$4) {
      return $$1.a_($$3.d()).a(avw.ce) && a($$1, $$3);
   }

   @Nullable
   @Override
   public btu a(dcu $$0, bqe $$1, btf $$2, @Nullable btu $$3) {
      jj<ddf> $$4 = $$0.t(this.dq());
      cfb.v $$5 = cfb.v.a($$4);
      boolean $$6 = false;
      if ($$3 instanceof cfb.i $$7) {
         $$5 = $$7.a;
         if ($$7.a() >= 2) {
            $$6 = true;
         }
      } else {
         $$3 = new cfb.i($$5);
      }

      this.a($$5);
      if ($$6) {
         this.c_(-24000);
      }

      if ($$0 instanceof aqm) {
         this.gy();
      }

      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   private void gy() {
      if (this.u() == cfb.v.a) {
         this.bV.a(4, this.cs);
         this.bV.a(4, this.ct);
         this.bV.a(6, this.cu);
      } else {
         this.bV.a(4, this.cu);
         this.bV.a(6, this.cs);
         this.bV.a(6, this.ct);
      }
   }

   @Override
   protected void a(cmk $$0, bqf $$1, cuc $$2) {
      if (this.o($$2)) {
         this.a(this.d($$2), 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   @Override
   public bsj e(btn $$0) {
      return this.p_() ? cr : super.e($$0);
   }

   public cfb.v u() {
      return cfb.v.a(this.ao.a(ce));
   }

   public void a(cfb.v $$0) {
      this.ao.a(ce, $$0.a());
   }

   List<UUID> gz() {
      List<UUID> $$0 = Lists.newArrayList();
      $$0.add(this.ao.a(ck).orElse(null));
      $$0.add(this.ao.a(cl).orElse(null));
      return $$0;
   }

   void b(@Nullable UUID $$0) {
      if (this.ao.a(ck).isPresent()) {
         this.ao.a(cl, Optional.ofNullable($$0));
      } else {
         this.ao.a(ck, Optional.ofNullable($$0));
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      List<UUID> $$1 = this.gz();
      ud $$2 = new ud();

      for (UUID $$3 : $$1) {
         if ($$3 != null) {
            $$2.add(um.a($$3));
         }
      }

      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fI());
      $$0.a("Type", this.u().c());
      $$0.a("Sitting", this.y());
      $$0.a("Crouching", this.cb());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);

      for (uu $$2 : $$0.c("Trusted", 11)) {
         this.b(um.a($$2));
      }

      this.C($$0.q("Sleeping"));
      this.a(cfb.v.a($$0.l("Type")));
      this.w($$0.q("Sitting"));
      this.y($$0.q("Crouching"));
      if (this.dQ() instanceof aqm) {
         this.gy();
      }
   }

   public boolean y() {
      return this.t(1);
   }

   public void w(boolean $$0) {
      this.d(1, $$0);
   }

   public boolean go() {
      return this.t(64);
   }

   void A(boolean $$0) {
      this.d(64, $$0);
   }

   boolean gA() {
      return this.t(128);
   }

   void B(boolean $$0) {
      this.d(128, $$0);
   }

   @Override
   public boolean fI() {
      return this.t(32);
   }

   void C(boolean $$0) {
      this.d(32, $$0);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.ao.a(cf, (byte)(this.ao.a(cf) | $$0));
      } else {
         this.ao.a(cf, (byte)(this.ao.a(cf) & ~$$0));
      }
   }

   private boolean t(int $$0) {
      return (this.ao.a(cf) & $$0) != 0;
   }

   @Override
   public boolean f(cuc $$0) {
      bsn $$1 = btd.h($$0);
      return !this.a($$1).e() ? false : $$1 == bsn.a && super.f($$0);
   }

   @Override
   public boolean j(cuc $$0) {
      cuc $$1 = this.a(bsn.a);
      return $$1.e() || this.cz > 0 && $$0.b(kn.v) && !$$1.b(kn.v);
   }

   private void p(cuc $$0) {
      if (!$$0.e() && !this.dQ().B) {
         ciu $$1 = new ciu(this.dQ(), this.dv() + this.bM().c, this.dx() + 1.0, this.dB() + this.bM().e, $$0);
         $$1.b(40);
         $$1.b(this);
         this.a(avh.jo, 1.0F, 1.0F);
         this.dQ().b($$1);
      }
   }

   private void q(cuc $$0) {
      ciu $$1 = new ciu(this.dQ(), this.dv(), this.dx(), this.dB(), $$0);
      this.dQ().b($$1);
   }

   @Override
   protected void b(ciu $$0) {
      cuc $$1 = $$0.p();
      if (this.j($$1)) {
         int $$2 = $$1.H();
         if ($$2 > 1) {
            this.q($$1.a($$2 - 1));
         }

         this.p(this.a(bsn.a));
         this.a($$0);
         this.a(bsn.a, $$1.a(1));
         this.f(bsn.a);
         this.a($$0, $$1.H());
         $$0.ap();
         this.cz = 0;
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.dc()) {
         boolean $$0 = this.bf();
         if ($$0 || this.p() != null || this.dQ().ac()) {
            this.gB();
         }

         if ($$0 || this.fI()) {
            this.w(false);
         }

         if (this.go() && this.dQ().z.i() < 0.2F) {
            ja $$1 = this.dq();
            dsk $$2 = this.dQ().a_($$1);
            this.dQ().c(2001, $$1, dfh.i($$2));
         }
      }

      this.cw = this.cv;
      if (this.gx()) {
         this.cv = this.cv + (1.0F - this.cv) * 0.4F;
      } else {
         this.cv = this.cv + (0.0F - this.cv) * 0.4F;
      }

      this.cy = this.cx;
      if (this.cb()) {
         this.cx += 0.2F;
         if (this.cx > 3.0F) {
            this.cx = 3.0F;
         }
      } else {
         this.cx = 0.0F;
      }
   }

   @Override
   public boolean o(cuc $$0) {
      return $$0.a(awf.Z);
   }

   @Override
   protected void a(cmk $$0, btd $$1) {
      ((cfb)$$1).b($$0.cA());
   }

   public boolean gu() {
      return this.t(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gv() {
      return this.bn;
   }

   public boolean gw() {
      return this.cx == 3.0F;
   }

   public void y(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   public boolean cb() {
      return this.t(4);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean gx() {
      return this.t(8);
   }

   public float H(float $$0) {
      return ayg.i($$0, this.cw, this.cv) * 0.11F * (float) Math.PI;
   }

   public float I(float $$0) {
      return ayg.i($$0, this.cy, this.cx);
   }

   @Override
   public void h(@Nullable btb $$0) {
      if (this.gA() && $$0 == null) {
         this.B(false);
      }

      super.h($$0);
   }

   void gB() {
      this.C(false);
   }

   void gC() {
      this.z(false);
      this.y(false);
      this.w(false);
      this.C(false);
      this.B(false);
      this.A(false);
   }

   boolean gD() {
      return !this.fI() && !this.y() && !this.go();
   }

   @Override
   public void Q() {
      avg $$0 = this.v();
      if ($$0 == avh.jl) {
         this.a($$0, 2.0F, this.fc());
      } else {
         super.Q();
      }
   }

   @Nullable
   @Override
   protected avg v() {
      if (this.fI()) {
         return avh.jm;
      } else {
         if (!this.dQ().R() && this.ah.i() < 0.1F) {
            List<cmk> $$0 = this.dQ().a(cmk.class, this.cL().c(16.0, 16.0, 16.0), bsl.f);
            if ($$0.isEmpty()) {
               return avh.jl;
            }
         }

         return avh.jg;
      }
   }

   @Nullable
   @Override
   protected avg d(bqz $$0) {
      return avh.jk;
   }

   @Nullable
   @Override
   protected avg o_() {
      return avh.ji;
   }

   boolean c(UUID $$0) {
      return this.gz().contains($$0);
   }

   @Override
   protected void g(bqz $$0) {
      cuc $$1 = this.a(bsn.a);
      if (!$$1.e()) {
         this.b($$1);
         this.a(bsn.a, cuc.l);
      }

      super.g($$0);
   }

   public static boolean a(cfb $$0, btb $$1) {
      double $$2 = $$1.dB() - $$0.dB();
      double $$3 = $$1.dv() - $$0.dv();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dQ().a_(ja.a($$0.dv() + $$8, $$0.dx() + (double)$$9, $$0.dB() + $$7)).r()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public ewf cN() {
      return new ewf(0.0, (double)(0.55F * this.cM()), (double)(this.dk() * 0.4F));
   }

   class a extends cbs<btb> {
      @Nullable
      private btb j;
      @Nullable
      private btb k;
      private int l;

      public a(final Class<btb> $$0, final boolean $$1, final boolean $$2, @Nullable final Predicate<btb> $$3) {
         super(cfb.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean a() {
         if (this.b > 0 && this.e.dT().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : cfb.this.gz()) {
               if ($$0 != null && cfb.this.dQ() instanceof aqm && ((aqm)cfb.this.dQ()).a($$0) instanceof btb $$2) {
                  this.k = $$2;
                  this.j = $$2.ej();
                  int $$3 = $$2.ek();
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
            this.l = this.k.ek();
         }

         cfb.this.a(avh.jf, 1.0F, 1.0F);
         cfb.this.B(true);
         cfb.this.gB();
         super.c();
      }
   }

   class b extends bzz {
      int a;

      public b() {
         this.a(EnumSet.of(bzz.a.b, bzz.a.c, bzz.a.a));
      }

      @Override
      public boolean a() {
         return cfb.this.go();
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
         cfb.this.A(false);
      }

      @Override
      public void e() {
         this.a--;
      }
   }

   public class c implements Predicate<btb> {
      public boolean a(btb $$0) {
         if ($$0 instanceof cfb) {
            return false;
         } else if ($$0 instanceof cew || $$0 instanceof cfl || $$0 instanceof cjq) {
            return true;
         } else if ($$0 instanceof bty) {
            return !((bty)$$0).s();
         } else if (!($$0 instanceof cmk) || !$$0.N_() && !((cmk)$$0).f()) {
            return cfb.this.c($$0.cA()) ? false : !$$0.fI() && !$$0.bZ();
         } else {
            return false;
         }
      }
   }

   abstract class d extends bzz {
      private final cds b = cds.a().a(12.0).d().a(cfb.this.new c());

      protected boolean h() {
         ja $$0 = ja.a(cfb.this.dv(), cfb.this.cL().e, cfb.this.dB());
         return !cfb.this.dQ().h($$0) && cfb.this.c($$0) >= 0.0F;
      }

      protected boolean i() {
         return !cfb.this.dQ().a(btb.class, this.b, cfb.this, cfb.this.cL().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends bzl {
      public e(final double $$0) {
         super(cfb.this, $$0);
      }

      @Override
      public void c() {
         ((cfb)this.a).gC();
         ((cfb)this.c).gC();
         super.c();
      }

      @Override
      protected void g() {
         aqm $$0 = (aqm)this.b;
         cfb $$1 = (cfb)this.a.a($$0, (bsa)this.c);
         if ($$1 != null) {
            aqn $$2 = this.a.gr();
            aqn $$3 = this.c.gr();
            aqn $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.cA());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.cA());
            }

            if ($$4 != null) {
               $$4.a(avr.P);
               am.p.a($$4, this.a, this.c, $$1);
            }

            this.a.c_(6000);
            this.c.c_(6000);
            this.a.gt();
            this.c.gt();
            $$1.c_(-24000);
            $$1.b(this.a.dv(), this.a.dx(), this.a.dB(), 0.0F, 0.0F);
            $$0.a_($$1);
            this.b.a(this.a, (byte)18);
            if (this.b.ab().b(dcb.f)) {
               this.b.b(new bsr(this.b, this.a.dv(), this.a.dx(), this.a.dB(), this.a.dT().a(7) + 1));
            }
         }
      }
   }

   public class f extends cam {
      private static final int i = 40;
      protected int g;

      public f(final double $$1, final int $$2, final int $$3) {
         super(cfb.this, $$1, $$2, $$3);
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
      protected boolean a(dci $$0, ja $$1) {
         dsk $$2 = $$0.a_($$1);
         return $$2.a(dfj.oi) && $$2.c(dnk.c) >= 2 || dgd.h_($$2);
      }

      @Override
      public void e() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && cfb.this.ah.i() < 0.05F) {
            cfb.this.a(avh.jn, 1.0F, 1.0F);
         }

         super.e();
      }

      protected void o() {
         if (cfb.this.dQ().ab().b(dcb.c)) {
            dsk $$0 = cfb.this.dQ().a_(this.e);
            if ($$0.a(dfj.oi)) {
               this.b($$0);
            } else if (dgd.h_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dsk $$0) {
         dgd.a(cfb.this, $$0, cfb.this.dQ(), this.e);
      }

      private void b(dsk $$0) {
         int $$1 = $$0.c(dnk.c);
         $$0.a(dnk.c, Integer.valueOf(1));
         int $$2 = 1 + cfb.this.dQ().z.a(2) + ($$1 == 3 ? 1 : 0);
         cuc $$3 = cfb.this.a(bsn.a);
         if ($$3.e()) {
            cfb.this.a(bsn.a, new cuc(cuf.wu));
            $$2--;
         }

         if ($$2 > 0) {
            dfh.a(cfb.this.dQ(), this.e, new cuc(cuf.wu, $$2));
         }

         cfb.this.a(avh.zs, 1.0F, 1.0F);
         cfb.this.dQ().a(this.e, $$0.a(dnk.c, Integer.valueOf(1)), 2);
         cfb.this.dQ().a(dxg.c, this.e, dxg.a.a(cfb.this));
      }

      @Override
      public boolean a() {
         return !cfb.this.fI() && super.a();
      }

      @Override
      public void c() {
         this.g = 0;
         cfb.this.w(false);
         super.c();
      }
   }

   class g extends bzt {
      public g() {
         super(cfb.this);
      }

      @Override
      public void c() {
         super.c();
         cfb.this.gC();
      }

      @Override
      public boolean a() {
         return cfb.this.bf() && cfb.this.b(awc.a) > 0.25 || cfb.this.bt();
      }
   }

   class h extends bzy {
      private final cfb d;

      public h(final cfb $$0, final double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean a() {
         return !this.d.gA() && super.a();
      }

      @Override
      public boolean b() {
         return !this.d.gA() && super.b();
      }

      @Override
      public void c() {
         this.d.gC();
         super.c();
      }
   }

   public static class i extends bsa.a {
      public final cfb.v a;

      public i(cfb.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends cah {
      public j(final btd $$0, final Class<? extends btb> $$1, final float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && !cfb.this.go() && !cfb.this.gx();
      }

      @Override
      public boolean b() {
         return super.b() && !cfb.this.go() && !cfb.this.gx();
      }
   }

   public class k extends bzb {
      public k() {
         super(cfb.this);
      }

      @Override
      public void a() {
         if (!cfb.this.fI()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cfb.this.gu() && !cfb.this.cb() && !cfb.this.gx() && !cfb.this.go();
      }
   }

   class l extends caj {
      public l(final double $$0, final boolean $$1) {
         super(cfb.this, $$0, $$1);
      }

      @Override
      protected void a(btb $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.D($$0);
            cfb.this.a(avh.jh, 1.0F, 1.0F);
         }
      }

      @Override
      public void c() {
         cfb.this.z(false);
         super.c();
      }

      @Override
      public boolean a() {
         return !cfb.this.y() && !cfb.this.fI() && !cfb.this.cb() && !cfb.this.go() && super.a();
      }
   }

   class m extends bzc {
      public m() {
         super(cfb.this);
      }

      @Override
      public void a() {
         if (cfb.this.gD()) {
            super.a();
         }
      }
   }

   class n extends cas {
      public n(final double $$0) {
         super(cfb.this, $$0);
      }

      @Override
      public boolean h() {
         return !cfb.this.gA() && super.h();
      }
   }

   public class o extends cad {
      @Override
      public boolean a() {
         if (!cfb.this.gw()) {
            return false;
         } else {
            btb $$0 = cfb.this.p();
            if ($$0 != null && $$0.bE()) {
               if ($$0.cJ() != $$0.cI()) {
                  return false;
               } else {
                  boolean $$1 = cfb.a(cfb.this, $$0);
                  if (!$$1) {
                     cfb.this.K().a($$0, 0);
                     cfb.this.y(false);
                     cfb.this.z(false);
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
         btb $$0 = cfb.this.p();
         if ($$0 != null && $$0.bE()) {
            double $$1 = cfb.this.dt().d;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(cfb.this.dI()) < 15.0F) || !cfb.this.aF()) && !cfb.this.go();
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
         cfb.this.s(true);
         cfb.this.x(true);
         cfb.this.z(false);
         btb $$0 = cfb.this.p();
         if ($$0 != null) {
            cfb.this.G().a($$0, 60.0F, 30.0F);
            ewf $$1 = new ewf($$0.dv() - cfb.this.dv(), $$0.dx() - cfb.this.dx(), $$0.dB() - cfb.this.dB()).d();
            cfb.this.i(cfb.this.dt().b($$1.c * 0.8, 0.9, $$1.e * 0.8));
         }

         cfb.this.K().n();
      }

      @Override
      public void d() {
         cfb.this.y(false);
         cfb.this.cx = 0.0F;
         cfb.this.cy = 0.0F;
         cfb.this.z(false);
         cfb.this.x(false);
      }

      @Override
      public void e() {
         btb $$0 = cfb.this.p();
         if ($$0 != null) {
            cfb.this.G().a($$0, 60.0F, 30.0F);
         }

         if (!cfb.this.go()) {
            ewf $$1 = cfb.this.dt();
            if ($$1.d * $$1.d < 0.03F && cfb.this.dI() != 0.0F) {
               cfb.this.t(ayg.j(0.2F, cfb.this.dI(), 0.0F));
            } else {
               double $$2 = $$1.h();
               double $$3 = Math.signum(-$$1.d) * Math.acos($$2 / $$1.f()) * 180.0F / (float)Math.PI;
               cfb.this.t((float)$$3);
            }
         }

         if ($$0 != null && cfb.this.f($$0) <= 2.0F) {
            cfb.this.D($$0);
         } else if (cfb.this.dI() > 0.0F && cfb.this.aF() && (float)cfb.this.dt().d != 0.0F && cfb.this.dQ().a_(cfb.this.dq()).a(dfj.dN)) {
            cfb.this.t(60.0F);
            cfb.this.h(null);
            cfb.this.A(true);
         }
      }
   }

   class p extends bzz {
      public p() {
         this.a(EnumSet.of(bzz.a.a));
      }

      @Override
      public boolean a() {
         if (!cfb.this.a(bsn.a).e()) {
            return false;
         } else if (cfb.this.p() != null || cfb.this.ej() != null) {
            return false;
         } else if (!cfb.this.gD()) {
            return false;
         } else if (cfb.this.dT().a(b(10)) != 0) {
            return false;
         } else {
            List<ciu> $$0 = cfb.this.dQ().a(ciu.class, cfb.this.cL().c(8.0, 8.0, 8.0), cfb.cm);
            return !$$0.isEmpty() && cfb.this.a(bsn.a).e();
         }
      }

      @Override
      public void e() {
         List<ciu> $$0 = cfb.this.dQ().a(ciu.class, cfb.this.cL().c(8.0, 8.0, 8.0), cfb.cm);
         cuc $$1 = cfb.this.a(bsn.a);
         if ($$1.e() && !$$0.isEmpty()) {
            cfb.this.K().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void c() {
         List<ciu> $$0 = cfb.this.dQ().a(ciu.class, cfb.this.cL().c(8.0, 8.0, 8.0), cfb.cm);
         if (!$$0.isEmpty()) {
            cfb.this.K().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends cbf {
      public q(final int $$0, final int $$1) {
         super(cfb.this, $$1);
      }

      @Override
      public void c() {
         cfb.this.gC();
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
         return !cfb.this.fI() && !cfb.this.y() && !cfb.this.gA() && cfb.this.p() == null;
      }
   }

   class r extends cfb.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(bzz.a.a, bzz.a.b));
      }

      @Override
      public boolean a() {
         return cfb.this.ej() == null
            && cfb.this.dT().i() < 0.02F
            && !cfb.this.fI()
            && cfb.this.p() == null
            && cfb.this.K().l()
            && !this.i()
            && !cfb.this.gu()
            && !cfb.this.cb();
      }

      @Override
      public boolean b() {
         return this.f > 0;
      }

      @Override
      public void c() {
         this.k();
         this.f = 2 + cfb.this.dT().a(3);
         cfb.this.w(true);
         cfb.this.K().n();
      }

      @Override
      public void d() {
         cfb.this.w(false);
      }

      @Override
      public void e() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         cfb.this.G().a(cfb.this.dv() + this.c, cfb.this.dz(), cfb.this.dB() + this.d, (float)cfb.this.ab(), (float)cfb.this.aa());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * cfb.this.dT().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + cfb.this.dT().a(20));
      }
   }

   class s extends bzs {
      private int c = b(100);

      public s(final double $$0) {
         super(cfb.this, $$0);
      }

      @Override
      public boolean a() {
         if (!cfb.this.fI() && this.a.p() == null) {
            if (cfb.this.dQ().ac() && cfb.this.dQ().h(this.a.dq())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               ja $$0 = this.a.dq();
               return cfb.this.dQ().R() && cfb.this.dQ().h($$0) && !((aqm)cfb.this.dQ()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void c() {
         cfb.this.gC();
         super.c();
      }
   }

   class t extends cfb.d {
      private static final int c = b(140);
      private int d = cfb.this.ah.a(c);

      public t() {
         this.a(EnumSet.of(bzz.a.a, bzz.a.b, bzz.a.c));
      }

      @Override
      public boolean a() {
         return cfb.this.bo == 0.0F && cfb.this.bp == 0.0F && cfb.this.bq == 0.0F ? this.k() || cfb.this.fI() : false;
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
            return cfb.this.dQ().R() && this.h() && !this.i() && !cfb.this.aB;
         }
      }

      @Override
      public void d() {
         this.d = cfb.this.ah.a(c);
         cfb.this.gC();
      }

      @Override
      public void c() {
         cfb.this.w(false);
         cfb.this.y(false);
         cfb.this.z(false);
         cfb.this.s(false);
         cfb.this.C(true);
         cfb.this.K().n();
         cfb.this.H().a(cfb.this.dv(), cfb.this.dx(), cfb.this.dB(), 0.0);
      }
   }

   class u extends bzz {
      public u() {
         this.a(EnumSet.of(bzz.a.a, bzz.a.b));
      }

      @Override
      public boolean a() {
         if (cfb.this.fI()) {
            return false;
         } else {
            btb $$0 = cfb.this.p();
            return $$0 != null && $$0.bE() && cfb.co.test($$0) && cfb.this.g($$0) > 36.0 && !cfb.this.cb() && !cfb.this.gx() && !cfb.this.bn;
         }
      }

      @Override
      public void c() {
         cfb.this.w(false);
         cfb.this.A(false);
      }

      @Override
      public void d() {
         btb $$0 = cfb.this.p();
         if ($$0 != null && cfb.a(cfb.this, $$0)) {
            cfb.this.z(true);
            cfb.this.y(true);
            cfb.this.K().n();
            cfb.this.G().a($$0, (float)cfb.this.ab(), (float)cfb.this.aa());
         } else {
            cfb.this.z(false);
            cfb.this.y(false);
         }
      }

      @Override
      public void e() {
         btb $$0 = cfb.this.p();
         if ($$0 != null) {
            cfb.this.G().a($$0, (float)cfb.this.ab(), (float)cfb.this.aa());
            if (cfb.this.g($$0) <= 36.0) {
               cfb.this.z(true);
               cfb.this.y(true);
               cfb.this.K().n();
            } else {
               cfb.this.K().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements azc {
      a(0, "red"),
      b(1, "snow");

      public static final azc.a<cfb.v> c = azc.a(cfb.v::values);
      private static final IntFunction<cfb.v> d = aww.a(cfb.v::a, values(), aww.a.a);
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

      public static cfb.v a(String $$0) {
         return c.a($$0, a);
      }

      public static cfb.v a(int $$0) {
         return d.apply($$0);
      }

      public static cfb.v a(jj<ddf> $$0) {
         return $$0.a(avv.ar) ? b : a;
      }
   }
}
