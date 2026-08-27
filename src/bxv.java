import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bxv extends blp implements cdf, dmb {
   private static final Logger e = LogUtils.getLogger();
   private static final iw bT = new iw(1, 1, 1);
   private static final int bU = 5;
   private static final float bV = 55.0F;
   private static final float bW = 15.0F;
   private static final cok bX = cok.a(clm.oz);
   private static final int bY = 6000;
   private static final int bZ = 3;
   private static final afo<Boolean> ca = afr.a(bxv.class, afq.k);
   private static final afo<Boolean> cb = afr.a(bxv.class, afq.k);
   protected static final ImmutableList<bvm<? extends bvl<? super bxv>>> b = ImmutableList.of(bvm.c, bvm.d, bvm.f, bvm.b);
   protected static final ImmutableList<buh<?>> c = ImmutableList.of(
      buh.t, buh.n, buh.h, buh.m, buh.E, buh.x, buh.K, buh.aL, buh.aM, buh.aN, buh.aO, buh.Y, new buh[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final dlp<dmb.b> cc;
   private dmb.a cd;
   private final dmb.d ce;
   private final dlp<bxv.a> cf;
   private final bje cg = new bje(1);
   @Nullable
   private ht ch;
   private long ci;
   private float cj;
   private float ck;
   private float cl;
   private float cm;
   private float cn;

   public bxv(bku<? extends bxv> $$0, csa $$1) {
      super($$0, $$1);
      this.bL = new brb(this, 20, true);
      this.s(this.fL());
      this.ce = new bxv.b();
      this.cd = new dmb.a();
      this.cc = new dlp<>(new dmb.b(this));
      this.cf = new dlp<>(new bxv.a(this.ce.b(), dls.E.a()));
   }

   @Override
   protected bmg.b<bxv> dQ() {
      return bmg.a(c, b);
   }

   @Override
   protected bmg<?> a(Dynamic<?> $$0) {
      return bxw.a(this.dQ().a($$0));
   }

   @Override
   public bmg<bxv> dP() {
      return (bmg<bxv>)super.dP();
   }

   public static bml.a u() {
      return bli.C().a(bmm.l, 20.0).a(bmm.f, 0.1F).a(bmm.m, 0.1F).a(bmm.c, 2.0).a(bmm.g, 48.0);
   }

   @Override
   protected bup b(csa $$0) {
      bun $$1 = new bun(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(ca, false);
      this.an.a(cb, true);
   }

   @Override
   public void a(eju $$0) {
      if (this.cY()) {
         if (this.aZ()) {
            this.a(0.02F, $$0);
            this.a(blm.a, this.dq());
            this.g(this.dq().a(0.8F));
         } else if (this.bn()) {
            this.a(0.02F, $$0);
            this.a(blm.a, this.dq());
            this.g(this.dq().a(0.5));
         } else {
            this.a(this.fg(), $$0);
            this.a(blm.a, this.dq());
            this.g(this.dq().a(0.91F));
         }
      }

      this.q(false);
   }

   @Override
   protected float b(bls $$0, bkr $$1) {
      return $$1.b * 0.6F;
   }

   @Override
   public boolean a(bjo $$0, float $$1) {
      if ($$0.d() instanceof cdu $$2) {
         Optional<UUID> $$3 = this.dP().c(buh.aL);
         if ($$3.isPresent() && $$2.cw().equals($$3.get())) {
            return false;
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void b(ht $$0, dhi $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, dhi $$2, ht $$3) {
   }

   @Override
   protected aqq y() {
      return this.b(bkv.a) ? aqr.a : aqr.b;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.d;
   }

   @Override
   protected aqq m_() {
      return aqr.c;
   }

   @Override
   protected float eX() {
      return 0.4F;
   }

   @Override
   protected void Z() {
      this.dN().ae().a("allayBrain");
      this.dP().a((ame)this.dN(), this);
      this.dN().ae().c();
      this.dN().ae().a("allayActivityUpdate");
      bxw.a(this);
      this.dN().ae().c();
      super.Z();
   }

   @Override
   public void c_() {
      super.c_();
      if (!this.dN().B && this.bx() && this.ah % 10 == 0) {
         this.b(1.0F);
      }

      if (this.gf() && this.gk() && this.ah % 20 == 0) {
         this.w(false);
         this.ch = null;
      }

      this.gl();
   }

   @Override
   public void l() {
      super.l();
      if (this.dN().B) {
         this.ck = this.cj;
         if (this.w()) {
            this.cj = atm.a(this.cj + 1.0F, 0.0F, 5.0F);
         } else {
            this.cj = atm.a(this.cj - 1.0F, 0.0F, 5.0F);
         }

         if (this.gf()) {
            this.cl++;
            this.cn = this.cm;
            if (this.gg()) {
               this.cm++;
            } else {
               this.cm--;
            }

            this.cm = atm.a(this.cm, 0.0F, 15.0F);
         } else {
            this.cl = 0.0F;
            this.cm = 0.0F;
            this.cn = 0.0F;
         }
      } else {
         dmb.c.a(this.dN(), this.cd, this.ce);
         if (this.gc()) {
            this.w(false);
         }
      }
   }

   @Override
   public boolean fL() {
      return !this.gj() && this.w();
   }

   public boolean w() {
      return !this.b(biw.a).b();
   }

   @Override
   public boolean f(clj $$0) {
      return false;
   }

   private boolean gj() {
      return this.dP().a(buh.aO, bui.a);
   }

   @Override
   protected bix b(cdu $$0, biw $$1) {
      clj $$2 = $$0.b($$1);
      clj $$3 = this.b(biw.a);
      if (this.gf() && this.l($$2) && this.go()) {
         this.gm();
         this.dN().a(this, (byte)18);
         this.dN().a($$0, this, aqr.E, aqs.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bix.a;
      } else if ($$3.b() && !$$2.b()) {
         clj $$4 = $$2.c(1);
         this.a(biw.a, $$4);
         this.a($$0, $$2);
         this.dN().a($$0, this, aqr.e, aqs.g, 2.0F, 1.0F);
         this.dP().a(buh.aL, $$0.cw());
         return bix.a;
      } else if (!$$3.b() && $$1 == biw.a && $$2.b()) {
         this.a(bkv.a, clj.b);
         this.dN().a($$0, this, aqr.f, aqs.g, 2.0F, 1.0F);
         this.a(biw.a);

         for (clj $$5 : this.A().f()) {
            bmz.a(this, $$5, this.dl());
         }

         this.dP().b(buh.aL);
         $$0.i($$3);
         return bix.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(ht $$0, boolean $$1) {
      if ($$1) {
         if (!this.gf()) {
            this.ch = $$0;
            this.w(true);
         }
      } else if ($$0.equals(this.ch) || this.ch == null) {
         this.ch = null;
         this.w(false);
      }
   }

   @Override
   public bje A() {
      return this.cg;
   }

   @Override
   protected iw V() {
      return bT;
   }

   @Override
   public boolean k(clj $$0) {
      clj $$1 = this.b(biw.a);
      return !$$1.b() && this.dN().Y().b(crw.c) && this.cg.b($$0) && this.d($$1, $$0);
   }

   private boolean d(clj $$0, clj $$1) {
      return clj.b($$0, $$1) && !this.e($$0, $$1);
   }

   private boolean e(clj $$0, clj $$1) {
      rz $$2 = $$0.v();
      boolean $$3 = $$2 != null && $$2.e("Potion");
      if (!$$3) {
         return false;
      } else {
         rz $$4 = $$1.v();
         boolean $$5 = $$4 != null && $$4.e("Potion");
         if (!$$5) {
            return true;
         } else {
            sw $$6 = $$2.c("Potion");
            sw $$7 = $$4.c("Potion");
            return $$6 != null && $$7 != null && !$$6.equals($$7);
         }
      }
   }

   @Override
   protected void b(can $$0) {
      cdf.a(this, this, $$0);
   }

   @Override
   protected void Y() {
      super.Y();
      ack.a(this);
   }

   @Override
   public boolean aT() {
      return !this.aC();
   }

   @Override
   public void a(BiConsumer<dlp<?>, ame> $$0) {
      if (this.dN() instanceof ame $$1) {
         $$0.accept(this.cc, $$1);
         $$0.accept(this.cf, $$1);
      }
   }

   public boolean gf() {
      return this.an.b(ca);
   }

   public void w(boolean $$0) {
      if (!this.dN().B && this.cZ() && (!$$0 || !this.gc())) {
         this.an.b(ca, $$0);
      }
   }

   private boolean gk() {
      return this.ch == null || !this.ch.a(this.dl(), (double)dls.E.a()) || !this.dN().a_(this.ch).a(cvc.dT);
   }

   public float E(float $$0) {
      return atm.i($$0, this.ck, this.cj) / 5.0F;
   }

   public boolean gg() {
      float $$0 = this.cl % 55.0F;
      return $$0 < 15.0F;
   }

   public float F(float $$0) {
      return atm.i($$0, this.cn, this.cm) / 15.0F;
   }

   @Override
   public boolean a(clj $$0, clj $$1) {
      return !this.d($$0, $$1);
   }

   @Override
   protected void ez() {
      super.ez();
      this.cg.f().forEach(this::b);
      clj $$0 = this.c(bkv.a);
      if (!$$0.b() && !cpw.e($$0)) {
         this.b($$0);
         this.a(bkv.a, clj.b);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      this.a_($$0);
      dmb.a.a.encodeStart(sn.a, this.cd).resultOrPartial(e::error).ifPresent($$1 -> $$0.a("listener", $$1));
      $$0.a("DuplicationCooldown", this.ci);
      $$0.a("CanDuplicate", this.go());
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.c($$0);
      if ($$0.b("listener", 10)) {
         dmb.a.a.parse(new Dynamic(sn.a, $$0.p("listener"))).resultOrPartial(e::error).ifPresent($$0x -> this.cd = $$0x);
      }

      this.ci = (long)$$0.h("DuplicationCooldown");
      this.an.b(cb, $$0.q("CanDuplicate"));
   }

   @Override
   protected boolean gd() {
      return false;
   }

   private void gl() {
      if (this.ci > 0L) {
         this.ci--;
      }

      if (!this.dN().x_() && this.ci == 0L && !this.go()) {
         this.an.b(cb, true);
      }
   }

   private boolean l(clj $$0) {
      return bX.a($$0);
   }

   private void gm() {
      bxv $$0 = bku.b.a(this.dN());
      if ($$0 != null) {
         $$0.e(this.dl());
         $$0.fK();
         $$0.gn();
         this.gn();
         this.dN().b($$0);
      }
   }

   private void gn() {
      this.ci = 6000L;
      this.an.b(cb, false);
   }

   private boolean go() {
      return this.an.b(cb);
   }

   private void a(cdu $$0, clj $$1) {
      if (!$$0.fU().d) {
         $$1.h(1);
      }
   }

   @Override
   public eju cJ() {
      return new eju(0.0, (double)this.cI() * 0.6, (double)this.dh() * 0.1);
   }

   @Override
   protected float l(bkq $$0) {
      return 0.04F;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 3; $$1++) {
            this.gp();
         }
      } else {
         super.b($$0);
      }
   }

   private void gp() {
      double $$0 = this.ag.k() * 0.02;
      double $$1 = this.ag.k() * 0.02;
      double $$2 = this.ag.k() * 0.02;
      this.dN().a(js.M, this.d(1.0), this.dv() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public dmb.a gh() {
      return this.cd;
   }

   @Override
   public dmb.d gi() {
      return this.ce;
   }

   class a implements dlu {
      private final dlw b;
      private final int c;

      public a(dlw $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public dlw a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(ame $$0, dls $$1, dls.a $$2, eju $$3) {
         if ($$1 == dls.E) {
            bxv.this.b(ht.a($$3), true);
            return true;
         } else if ($$1 == dls.F) {
            bxv.this.b(ht.a($$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements dmb.d {
      private static final int b = 16;
      private final dlw c = new dlq(bxv.this, bxv.this.cI());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dlw b() {
         return this.c;
      }

      @Override
      public boolean a(ame $$0, ht $$1, dls $$2, dls.a $$3) {
         if (bxv.this.fV()) {
            return false;
         } else {
            Optional<ia> $$4 = bxv.this.dP().c(buh.aM);
            if ($$4.isEmpty()) {
               return true;
            } else {
               ia $$5 = $$4.get();
               return $$5.a().equals($$0.ad()) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(ame $$0, ht $$1, dls $$2, @Nullable bkq $$3, @Nullable bkq $$4, float $$5) {
         if ($$2 == dls.H) {
            bxw.a(bxv.this, new ht($$1));
         }
      }

      @Override
      public arv<dls> c() {
         return arm.e;
      }
   }
}
