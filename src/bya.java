import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bya extends blu implements cdk, dmg {
   private static final Logger e = LogUtils.getLogger();
   private static final ja bT = new ja(1, 1, 1);
   private static final int bU = 5;
   private static final float bV = 55.0F;
   private static final float bW = 15.0F;
   private static final coq bX = coq.a(clr.oz);
   private static final int bY = 6000;
   private static final int bZ = 3;
   private static final afs<Boolean> ca = afv.a(bya.class, afu.k);
   private static final afs<Boolean> cb = afv.a(bya.class, afu.k);
   protected static final ImmutableList<bvr<? extends bvq<? super bya>>> b = ImmutableList.of(bvr.c, bvr.d, bvr.f, bvr.b);
   protected static final ImmutableList<bum<?>> c = ImmutableList.of(
      bum.t, bum.n, bum.h, bum.m, bum.E, bum.x, bum.K, bum.aL, bum.aM, bum.aN, bum.aO, bum.Y, new bum[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final dlu<dmg.b> cc;
   private dmg.a cd;
   private final dmg.d ce;
   private final dlu<bya.a> cf;
   private final bjj cg = new bjj(1);
   @Nullable
   private hx ch;
   private long ci;
   private float cj;
   private float ck;
   private float cl;
   private float cm;
   private float cn;

   public bya(bkz<? extends bya> $$0, csf $$1) {
      super($$0, $$1);
      this.bL = new brg(this, 20, true);
      this.s(this.fL());
      this.ce = new bya.b();
      this.cd = new dmg.a();
      this.cc = new dlu<>(new dmg.b(this));
      this.cf = new dlu<>(new bya.a(this.ce.b(), dlx.E.a()));
   }

   @Override
   protected bml.b<bya> dQ() {
      return bml.a(c, b);
   }

   @Override
   protected bml<?> a(Dynamic<?> $$0) {
      return byb.a(this.dQ().a($$0));
   }

   @Override
   public bml<bya> dP() {
      return (bml<bya>)super.dP();
   }

   public static bmq.a u() {
      return bln.C().a(bmr.l, 20.0).a(bmr.f, 0.1F).a(bmr.m, 0.1F).a(bmr.c, 2.0).a(bmr.g, 48.0);
   }

   @Override
   protected buu b(csf $$0) {
      bus $$1 = new bus(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(ca, false);
      this.an.a(cb, true);
   }

   @Override
   public void a(ejz $$0) {
      if (this.cY()) {
         if (this.aZ()) {
            this.a(0.02F, $$0);
            this.a(blr.a, this.dq());
            this.g(this.dq().a(0.8F));
         } else if (this.bn()) {
            this.a(0.02F, $$0);
            this.a(blr.a, this.dq());
            this.g(this.dq().a(0.5));
         } else {
            this.a(this.fg(), $$0);
            this.a(blr.a, this.dq());
            this.g(this.dq().a(0.91F));
         }
      }

      this.q(false);
   }

   @Override
   protected float b(blx $$0, bkw $$1) {
      return $$1.b * 0.6F;
   }

   @Override
   public boolean a(bjt $$0, float $$1) {
      if ($$0.d() instanceof cdz $$2) {
         Optional<UUID> $$3 = this.dP().c(bum.aL);
         if ($$3.isPresent() && $$2.cw().equals($$3.get())) {
            return false;
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void b(hx $$0, dhn $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, dhn $$2, hx $$3) {
   }

   @Override
   protected aqu y() {
      return this.b(bla.a) ? aqv.a : aqv.b;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.d;
   }

   @Override
   protected aqu n_() {
      return aqv.c;
   }

   @Override
   protected float eX() {
      return 0.4F;
   }

   @Override
   protected void Z() {
      this.dN().ae().a("allayBrain");
      this.dP().a((ami)this.dN(), this);
      this.dN().ae().c();
      this.dN().ae().a("allayActivityUpdate");
      byb.a(this);
      this.dN().ae().c();
      super.Z();
   }

   @Override
   public void d_() {
      super.d_();
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
            this.cj = atq.a(this.cj + 1.0F, 0.0F, 5.0F);
         } else {
            this.cj = atq.a(this.cj - 1.0F, 0.0F, 5.0F);
         }

         if (this.gf()) {
            this.cl++;
            this.cn = this.cm;
            if (this.gg()) {
               this.cm++;
            } else {
               this.cm--;
            }

            this.cm = atq.a(this.cm, 0.0F, 15.0F);
         } else {
            this.cl = 0.0F;
            this.cm = 0.0F;
            this.cn = 0.0F;
         }
      } else {
         dmg.c.a(this.dN(), this.cd, this.ce);
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
      return !this.b(bja.a).b();
   }

   @Override
   public boolean f(clo $$0) {
      return false;
   }

   private boolean gj() {
      return this.dP().a(bum.aO, bun.a);
   }

   @Override
   protected bjb b(cdz $$0, bja $$1) {
      clo $$2 = $$0.b($$1);
      clo $$3 = this.b(bja.a);
      if (this.gf() && this.l($$2) && this.go()) {
         this.gm();
         this.dN().a(this, (byte)18);
         this.dN().a($$0, this, aqv.E, aqw.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bjb.a;
      } else if ($$3.b() && !$$2.b()) {
         clo $$4 = $$2.c(1);
         this.a(bja.a, $$4);
         this.a($$0, $$2);
         this.dN().a($$0, this, aqv.e, aqw.g, 2.0F, 1.0F);
         this.dP().a(bum.aL, $$0.cw());
         return bjb.a;
      } else if (!$$3.b() && $$1 == bja.a && $$2.b()) {
         this.a(bla.a, clo.b);
         this.dN().a($$0, this, aqv.f, aqw.g, 2.0F, 1.0F);
         this.a(bja.a);

         for (clo $$5 : this.A().f()) {
            bne.a(this, $$5, this.dl());
         }

         this.dP().b(bum.aL);
         $$0.i($$3);
         return bjb.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(hx $$0, boolean $$1) {
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
   public bjj A() {
      return this.cg;
   }

   @Override
   protected ja V() {
      return bT;
   }

   @Override
   public boolean k(clo $$0) {
      clo $$1 = this.b(bja.a);
      return !$$1.b() && this.dN().Y().b(csb.c) && this.cg.b($$0) && this.d($$1, $$0);
   }

   private boolean d(clo $$0, clo $$1) {
      return clo.b($$0, $$1) && !this.e($$0, $$1);
   }

   private boolean e(clo $$0, clo $$1) {
      sd $$2 = $$0.v();
      boolean $$3 = $$2 != null && $$2.e("Potion");
      if (!$$3) {
         return false;
      } else {
         sd $$4 = $$1.v();
         boolean $$5 = $$4 != null && $$4.e("Potion");
         if (!$$5) {
            return true;
         } else {
            ta $$6 = $$2.c("Potion");
            ta $$7 = $$4.c("Potion");
            return $$6 != null && $$7 != null && !$$6.equals($$7);
         }
      }
   }

   @Override
   protected void b(cas $$0) {
      cdk.a(this, this, $$0);
   }

   @Override
   protected void Y() {
      super.Y();
      aco.a(this);
   }

   @Override
   public boolean aT() {
      return !this.aC();
   }

   @Override
   public void a(BiConsumer<dlu<?>, ami> $$0) {
      if (this.dN() instanceof ami $$1) {
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
      return this.ch == null || !this.ch.a(this.dl(), (double)dlx.E.a()) || !this.dN().a_(this.ch).a(cvh.dT);
   }

   public float E(float $$0) {
      return atq.i($$0, this.ck, this.cj) / 5.0F;
   }

   public boolean gg() {
      float $$0 = this.cl % 55.0F;
      return $$0 < 15.0F;
   }

   public float F(float $$0) {
      return atq.i($$0, this.cn, this.cm) / 15.0F;
   }

   @Override
   public boolean a(clo $$0, clo $$1) {
      return !this.d($$0, $$1);
   }

   @Override
   protected void ez() {
      super.ez();
      this.cg.f().forEach(this::b);
      clo $$0 = this.c(bla.a);
      if (!$$0.b() && !cqb.e($$0)) {
         this.b($$0);
         this.a(bla.a, clo.b);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      this.a_($$0);
      dmg.a.a.encodeStart(sr.a, this.cd).resultOrPartial(e::error).ifPresent($$1 -> $$0.a("listener", $$1));
      $$0.a("DuplicationCooldown", this.ci);
      $$0.a("CanDuplicate", this.go());
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.c($$0);
      if ($$0.b("listener", 10)) {
         dmg.a.a.parse(new Dynamic(sr.a, $$0.p("listener"))).resultOrPartial(e::error).ifPresent($$0x -> this.cd = $$0x);
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

      if (!this.dN().y_() && this.ci == 0L && !this.go()) {
         this.an.b(cb, true);
      }
   }

   private boolean l(clo $$0) {
      return bX.a($$0);
   }

   private void gm() {
      bya $$0 = bkz.b.a(this.dN());
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

   private void a(cdz $$0, clo $$1) {
      if (!$$0.fU().d) {
         $$1.h(1);
      }
   }

   @Override
   public ejz cJ() {
      return new ejz(0.0, (double)this.cI() * 0.6, (double)this.dh() * 0.1);
   }

   @Override
   protected float l(bkv $$0) {
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
      this.dN().a(jw.M, this.d(1.0), this.dv() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public dmg.a gh() {
      return this.cd;
   }

   @Override
   public dmg.d gi() {
      return this.ce;
   }

   class a implements dlz {
      private final dmb b;
      private final int c;

      public a(dmb $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public dmb a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(ami $$0, dlx $$1, dlx.a $$2, ejz $$3) {
         if ($$1 == dlx.E) {
            bya.this.b(hx.a($$3), true);
            return true;
         } else if ($$1 == dlx.F) {
            bya.this.b(hx.a($$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements dmg.d {
      private static final int b = 16;
      private final dmb c = new dlv(bya.this, bya.this.cI());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dmb b() {
         return this.c;
      }

      @Override
      public boolean a(ami $$0, hx $$1, dlx $$2, dlx.a $$3) {
         if (bya.this.fV()) {
            return false;
         } else {
            Optional<ie> $$4 = bya.this.dP().c(bum.aM);
            if ($$4.isEmpty()) {
               return true;
            } else {
               ie $$5 = $$4.get();
               return $$5.a().equals($$0.ad()) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(ami $$0, hx $$1, dlx $$2, @Nullable bkv $$3, @Nullable bkv $$4, float $$5) {
         if ($$2 == dlx.H) {
            byb.a(bya.this, new hx($$1));
         }
      }

      @Override
      public arz<dlx> c() {
         return arq.e;
      }
   }
}
