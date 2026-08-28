import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cfy extends btl implements clw, dxq {
   private static final Logger e = LogUtils.getLogger();
   private static final ke ca = new ke(1, 1, 1);
   private static final int cb = 5;
   private static final float cc = 55.0F;
   private static final float cd = 15.0F;
   private static final cyg ce = cyg.a(cug.oD);
   private static final int cf = 6000;
   private static final int cg = 3;
   private static final ajp<Boolean> ch = ajt.a(cfy.class, ajr.k);
   private static final ajp<Boolean> ci = ajt.a(cfy.class, ajr.k);
   protected static final ImmutableList<cdn<? extends cdm<? super cfy>>> b = ImmutableList.of(cdn.c, cdn.d, cdn.f, cdn.b);
   protected static final ImmutableList<ccg<?>> c = ImmutableList.of(
      ccg.t, ccg.n, ccg.h, ccg.m, ccg.E, ccg.x, ccg.L, ccg.aM, ccg.aN, ccg.aO, ccg.aP, ccg.Z, new ccg[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final dxe<dxq.b> cj;
   private dxq.a ck;
   private final dxq.d cl;
   private final dxe<cfy.a> cm;
   private final bqq cn = new bqq(1);
   @Nullable
   private ja co;
   private long cp;
   private float cq;
   private float cr;
   private float cs;
   private float ct;
   private float cu;

   public cfy(bsn<? extends cfy> $$0, dcg $$1) {
      super($$0, $$1);
      this.bR = new bza(this, 20, true);
      this.a_(this.fR());
      this.cl = new cfy.b();
      this.ck = new dxq.a();
      this.cj = new dxe<>(new dxq.b(this));
      this.cm = new dxe<>(new cfy.a(this.cl.b(), dxh.E.a().a()));
   }

   @Override
   protected bue.b<cfy> dW() {
      return bue.a(c, b);
   }

   @Override
   protected bue<?> a(Dynamic<?> $$0) {
      return cfz.a(this.dW().a($$0));
   }

   @Override
   public bue<cfy> dV() {
      return (bue<cfy>)super.dV();
   }

   public static buj.a s() {
      return bte.A().a(buk.s, 20.0).a(buk.l, 0.1F).a(buk.v, 0.1F).a(buk.c, 2.0).a(buk.m, 48.0);
   }

   @Override
   protected cco b(dcg $$0) {
      ccm $$1 = new ccm(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(ch, false);
      $$0.a(ci, true);
   }

   @Override
   public void a(ewh $$0) {
      if (this.dc()) {
         if (this.bg()) {
            this.a(0.02F, $$0);
            this.a(bth.a, this.du());
            this.j(this.du().a(0.8F));
         } else if (this.bu()) {
            this.a(0.02F, $$0);
            this.a(bth.a, this.du());
            this.j(this.du().a(0.5));
         } else {
            this.a(this.fl(), $$0);
            this.a(bth.a, this.du());
            this.j(this.du().a(0.91F));
         }
      }

      this.s(false);
   }

   @Override
   public boolean a(bra $$0, float $$1) {
      if ($$0.d() instanceof cml $$2) {
         Optional<UUID> $$3 = this.dV().c(ccg.aM);
         if ($$3.isPresent() && $$2.cB().equals($$3.get())) {
            return false;
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void b(ja $$0, dsl $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, dsl $$2, ja $$3) {
   }

   @Override
   protected avg v() {
      return this.c(bso.a) ? avh.a : avh.b;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.d;
   }

   @Override
   protected avg n_() {
      return avh.c;
   }

   @Override
   protected float fc() {
      return 0.4F;
   }

   @Override
   protected void Z() {
      this.dR().ag().a("allayBrain");
      this.dV().a((aqm)this.dR(), this);
      this.dR().ag().c();
      this.dR().ag().a("allayActivityUpdate");
      cfz.a(this);
      this.dR().ag().c();
      super.Z();
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dR().B && this.bF() && this.ai % 10 == 0) {
         this.c(1.0F);
      }

      if (this.gn() && this.gs() && this.ai % 20 == 0) {
         this.w(false);
         this.co = null;
      }

      this.gt();
   }

   @Override
   public void l() {
      super.l();
      if (this.dR().B) {
         this.cr = this.cq;
         if (this.t()) {
            this.cq = ayg.a(this.cq + 1.0F, 0.0F, 5.0F);
         } else {
            this.cq = ayg.a(this.cq - 1.0F, 0.0F, 5.0F);
         }

         if (this.gn()) {
            this.cs++;
            this.cu = this.ct;
            if (this.go()) {
               this.ct++;
            } else {
               this.ct--;
            }

            this.ct = ayg.a(this.ct, 0.0F, 15.0F);
         } else {
            this.cs = 0.0F;
            this.ct = 0.0F;
            this.cu = 0.0F;
         }
      } else {
         dxq.c.a(this.dR(), this.ck, this.cl);
         if (this.gk()) {
            this.w(false);
         }
      }
   }

   @Override
   public boolean fR() {
      return !this.gr() && this.t();
   }

   public boolean t() {
      return !this.b(bqg.a).e();
   }

   @Override
   public boolean f(cud $$0) {
      return false;
   }

   private boolean gr() {
      return this.dV().a(ccg.aP, cch.a);
   }

   @Override
   protected bqh b(cml $$0, bqg $$1) {
      cud $$2 = $$0.b($$1);
      cud $$3 = this.b(bqg.a);
      if (this.gn() && this.n($$2) && this.gw()) {
         this.gu();
         this.dR().a(this, (byte)18);
         this.dR().a($$0, this, avh.E, avi.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bqh.a;
      } else if ($$3.e() && !$$2.e()) {
         cud $$4 = $$2.c(1);
         this.a(bqg.a, $$4);
         this.a($$0, $$2);
         this.dR().a($$0, this, avh.e, avi.g, 2.0F, 1.0F);
         this.dV().a(ccg.aM, $$0.cB());
         return bqh.a;
      } else if (!$$3.e() && $$1 == bqg.a && $$2.e()) {
         this.a(bso.a, cud.l);
         this.dR().a($$0, this, avh.f, avi.g, 2.0F, 1.0F);
         this.a(bqg.a);

         for (cud $$5 : this.x().f()) {
            bux.a(this, $$5, this.dp());
         }

         this.dV().b(ccg.aM);
         $$0.i($$3);
         return bqh.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(ja $$0, boolean $$1) {
      if ($$1) {
         if (!this.gn()) {
            this.co = $$0;
            this.w(true);
         }
      } else if ($$0.equals(this.co) || this.co == null) {
         this.co = null;
         this.w(false);
      }
   }

   @Override
   public bqq x() {
      return this.cn;
   }

   @Override
   protected ke V() {
      return ca;
   }

   @Override
   public boolean k(cud $$0) {
      cud $$1 = this.b(bqg.a);
      return !$$1.e() && this.dR().ab().b(dcc.c) && this.cn.c($$0) && this.d($$1, $$0);
   }

   private boolean d(cud $$0, cud $$1) {
      return cud.b($$0, $$1) && !this.e($$0, $$1);
   }

   private boolean e(cud $$0, cud $$1) {
      cwe $$2 = $$0.a(kn.G);
      cwe $$3 = $$1.a(kn.G);
      return !Objects.equals($$2, $$3);
   }

   @Override
   protected void b(civ $$0) {
      clw.a(this, this, $$0);
   }

   @Override
   protected void Y() {
      super.Y();
      afy.a(this);
   }

   @Override
   public boolean aX() {
      return !this.aG();
   }

   @Override
   public void a(BiConsumer<dxe<?>, aqm> $$0) {
      if (this.dR() instanceof aqm $$1) {
         $$0.accept(this.cj, $$1);
         $$0.accept(this.cm, $$1);
      }
   }

   public boolean gn() {
      return this.ao.a(ch);
   }

   public void w(boolean $$0) {
      if (!this.dR().B && this.dd() && (!$$0 || !this.gk())) {
         this.ao.a(ch, $$0);
      }
   }

   private boolean gs() {
      return this.co == null || !this.co.a(this.dp(), (double)dxh.E.a().a()) || !this.dR().a_(this.co).a(dfk.dT);
   }

   public float H(float $$0) {
      return ayg.i($$0, this.cr, this.cq) / 5.0F;
   }

   public boolean go() {
      float $$0 = this.cs % 55.0F;
      return $$0 < 15.0F;
   }

   public float I(float $$0) {
      return ayg.i($$0, this.cu, this.ct) / 15.0F;
   }

   @Override
   public boolean a(cud $$0, cud $$1) {
      return !this.d($$0, $$1);
   }

   @Override
   protected void eB() {
      super.eB();
      this.cn.f().forEach(this::b);
      cud $$0 = this.a(bso.a);
      if (!$$0.e() && !czo.a($$0, czn.D)) {
         this.b($$0);
         this.a(bso.a, cud.l);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      this.b($$0, this.dT());
      dxq.a.a.encodeStart(ul.a, this.ck).resultOrPartial(e::error).ifPresent($$1 -> $$0.a("listener", $$1));
      $$0.a("DuplicationCooldown", this.cp);
      $$0.a("CanDuplicate", this.gw());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a($$0, this.dT());
      if ($$0.b("listener", 10)) {
         dxq.a.a.parse(new Dynamic(ul.a, $$0.p("listener"))).resultOrPartial(e::error).ifPresent($$0x -> this.ck = $$0x);
      }

      this.cp = (long)$$0.h("DuplicationCooldown");
      this.ao.a(ci, $$0.q("CanDuplicate"));
   }

   @Override
   protected boolean gl() {
      return false;
   }

   private void gt() {
      if (this.cp > 0L) {
         this.cp--;
      }

      if (!this.dR().x_() && this.cp == 0L && !this.gw()) {
         this.ao.a(ci, true);
      }
   }

   private boolean n(cud $$0) {
      return ce.a($$0);
   }

   private void gu() {
      cfy $$0 = bsn.a.a(this.dR());
      if ($$0 != null) {
         $$0.f(this.dp());
         $$0.fQ();
         $$0.gv();
         this.gv();
         this.dR().b($$0);
      }
   }

   private void gv() {
      this.cp = 6000L;
      this.ao.a(ci, false);
   }

   private boolean gw() {
      return this.ao.a(ci);
   }

   private void a(cml $$0, cud $$1) {
      $$1.a(1, $$0);
   }

   @Override
   public ewh cO() {
      return new ewh(0.0, (double)this.cN() * 0.6, (double)this.dl() * 0.1);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 3; $$1++) {
            this.gx();
         }
      } else {
         super.b($$0);
      }
   }

   private void gx() {
      double $$0 = this.ah.k() * 0.02;
      double $$1 = this.ah.k() * 0.02;
      double $$2 = this.ah.k() * 0.02;
      this.dR().a(lj.Q, this.d(1.0), this.dz() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public dxq.a gp() {
      return this.ck;
   }

   @Override
   public dxq.d gq() {
      return this.cl;
   }

   class a implements dxj {
      private final dxl b;
      private final int c;

      public a(final dxl $$0, final int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public dxl a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(aqm $$0, jj<dxh> $$1, dxh.a $$2, ewh $$3) {
         if ($$1.a(dxh.E)) {
            cfy.this.b(ja.a($$3), true);
            return true;
         } else if ($$1.a(dxh.F)) {
            cfy.this.b(ja.a($$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements dxq.d {
      private static final int b = 16;
      private final dxl c = new dxf(cfy.this, cfy.this.cN());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dxl b() {
         return this.c;
      }

      @Override
      public boolean a(aqm $$0, ja $$1, jj<dxh> $$2, dxh.a $$3) {
         if (cfy.this.gc()) {
            return false;
         } else {
            Optional<ji> $$4 = cfy.this.dV().c(ccg.aN);
            if ($$4.isEmpty()) {
               return true;
            } else {
               ji $$5 = $$4.get();
               return $$5.a().equals($$0.af()) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(aqm $$0, ja $$1, jj<dxh> $$2, @Nullable bsh $$3, @Nullable bsh $$4, float $$5) {
         if ($$2.a(dxh.H)) {
            cfz.a(cfy.this, new ja($$1));
         }
      }

      @Override
      public awm<dxh> c() {
         return awd.e;
      }
   }
}
