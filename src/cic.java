import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cic extends bvn implements coe, eca {
   private static final Logger bY = LogUtils.getLogger();
   private static final km bZ = new km(1, 1, 1);
   private static final int ca = 5;
   private static final float cb = 55.0F;
   private static final float cc = 15.0F;
   private static final int cd = 6000;
   private static final int ce = 3;
   public static final int a = 1024;
   private static final ajx<Boolean> cf = akb.a(cic.class, ajz.k);
   private static final ajx<Boolean> cg = akb.a(cic.class, ajz.k);
   protected static final ImmutableList<cfq<? extends cfp<? super cic>>> b = ImmutableList.of(cfq.c, cfq.d, cfq.f, cfq.b);
   protected static final ImmutableList<cej<?>> c = ImmutableList.of(
      cej.t, cej.n, cej.h, cej.m, cej.E, cej.x, cej.L, cej.aM, cej.aN, cej.aO, cej.aP, cej.Z, new cej[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final ebo<eca.b> ch;
   private eca.a ci;
   private final eca.d cj;
   private final ebo<cic.a> ck;
   private final bsp cl = new bsp(1);
   @Nullable
   private ji cm;
   private long cn;
   private float co;
   private float cp;
   private float cq;
   private float cr;
   private float cs;

   public cic(buq<? extends cic> $$0, dgg $$1) {
      super($$0, $$1);
      this.bP = new cbd(this, 20, true);
      this.a_(this.fN());
      this.cj = new cic.b();
      this.ci = new eca.a();
      this.ch = new ebo<>(new eca.b(this));
      this.ck = new ebo<>(new cic.a(this.cj.b(), ebr.E.a().a()));
   }

   @Override
   protected bwh.b<cic> ed() {
      return bwh.a(c, b);
   }

   @Override
   protected bwh<?> a(Dynamic<?> $$0) {
      return cid.a(this.ed().a($$0));
   }

   @Override
   public bwh<cic> ec() {
      return (bwh<cic>)super.ec();
   }

   public static bwm.a m() {
      return bvh.C().a(bwn.s, 20.0).a(bwn.l, 0.1F).a(bwn.v, 0.1F).a(bwn.c, 2.0);
   }

   @Override
   protected cer b(dgg $$0) {
      cep $$1 = new cep(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.a(48.0F);
      return $$1;
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(cf, false);
      $$0.a(cg, true);
   }

   @Override
   public void a_(fay $$0) {
      if (this.di()) {
         if (this.bj()) {
            this.a(0.02F, $$0);
            this.a(bvj.a, this.dz());
            this.h(this.dz().c(0.8F));
         } else if (this.bx()) {
            this.a(0.02F, $$0);
            this.a(bvj.a, this.dz());
            this.h(this.dz().c(0.5));
         } else {
            this.a(this.fp(), $$0);
            this.a(bvj.a, this.dz());
            this.h(this.dz().c(0.91F));
         }
      }
   }

   @Override
   public boolean a(arc $$0, bsz $$1, float $$2) {
      return this.b($$1.d()) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean t(buj $$0) {
      return this.b($$0) || super.t($$0);
   }

   private boolean b(@Nullable buj $$0) {
      if (!($$0 instanceof cov $$1)) {
         return false;
      } else {
         Optional<UUID> $$2 = this.ec().c(cej.aM);
         return $$2.isPresent() && $$1.cG().equals($$2.get());
      }
   }

   @Override
   protected void b(ji $$0, dwv $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, dwv $$2, ji $$3) {
   }

   @Override
   protected avy u() {
      return this.d(bur.a) ? avz.a : avz.b;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.d;
   }

   @Override
   protected avy o_() {
      return avz.c;
   }

   @Override
   protected float fg() {
      return 0.4F;
   }

   @Override
   protected void a(arc $$0) {
      bor $$1 = boq.a();
      $$1.a("allayBrain");
      this.ec().a($$0, this);
      $$1.c();
      $$1.a("allayActivityUpdate");
      cid.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dW().C && this.bL() && this.af % 10 == 0) {
         this.c(1.0F);
      }

      if (this.x() && this.gt() && this.af % 20 == 0) {
         this.x(false);
         this.cm = null;
      }

      this.gu();
   }

   @Override
   public void h() {
      super.h();
      if (this.dW().C) {
         this.cp = this.co;
         if (this.p()) {
            this.co = ayy.a(this.co + 1.0F, 0.0F, 5.0F);
         } else {
            this.co = ayy.a(this.co - 1.0F, 0.0F, 5.0F);
         }

         if (this.x()) {
            this.cq++;
            this.cs = this.cr;
            if (this.gp()) {
               this.cr++;
            } else {
               this.cr--;
            }

            this.cr = ayy.a(this.cr, 0.0F, 15.0F);
         } else {
            this.cq = 0.0F;
            this.cr = 0.0F;
            this.cs = 0.0F;
         }
      } else {
         eca.c.a(this.dW(), this.ci, this.cj);
         if (this.gm()) {
            this.x(false);
         }
      }
   }

   @Override
   public boolean fN() {
      return !this.gs() && this.p();
   }

   public boolean p() {
      return !this.b(bsh.a).f();
   }

   @Override
   protected boolean f(bur $$0) {
      return false;
   }

   private boolean gs() {
      return this.ec().a(cej.aP, cek.a);
   }

   @Override
   protected bsi b(cov $$0, bsh $$1) {
      cwn $$2 = $$0.b($$1);
      cwn $$3 = this.b(bsh.a);
      if (this.x() && $$2.a(awx.W) && this.gx()) {
         this.gv();
         this.dW().a(this, (byte)18);
         this.dW().a($$0, this, avz.E, awa.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bsi.a;
      } else if ($$3.f() && !$$2.f()) {
         cwn $$4 = $$2.c(1);
         this.a(bsh.a, $$4);
         this.a($$0, $$2);
         this.dW().a($$0, this, avz.e, awa.g, 2.0F, 1.0F);
         this.ec().a(cej.aM, $$0.cG());
         return bsi.a;
      } else if (!$$3.f() && $$1 == bsh.a && $$2.f()) {
         this.a(bur.a, cwn.j);
         this.dW().a($$0, this, avz.f, awa.g, 2.0F, 1.0F);
         this.a(bsh.a);

         for (cwn $$5 : this.t().f()) {
            bxa.a(this, $$5, this.du());
         }

         this.ec().b(cej.aM);
         $$0.i($$3);
         return bsi.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(ji $$0, boolean $$1) {
      if ($$1) {
         if (!this.x()) {
            this.cm = $$0;
            this.x(true);
         }
      } else if ($$0.equals(this.cm) || this.cm == null) {
         this.cm = null;
         this.x(false);
      }
   }

   @Override
   public bsp t() {
      return this.cl;
   }

   @Override
   protected km V() {
      return bZ;
   }

   @Override
   public boolean c(arc $$0, cwn $$1) {
      cwn $$2 = this.b(bsh.a);
      return !$$2.f() && $$0.O().b(dgc.c) && this.cl.c($$1) && this.c($$2, $$1);
   }

   private boolean c(cwn $$0, cwn $$1) {
      return cwn.b($$0, $$1) && !this.d($$0, $$1);
   }

   private boolean d(cwn $$0, cwn $$1) {
      cym $$2 = $$0.a(kv.Q);
      cym $$3 = $$1.a(kv.Q);
      return !Objects.equals($$2, $$3);
   }

   @Override
   protected void a(arc $$0, cla $$1) {
      coe.a($$0, this, this, $$1);
   }

   @Override
   protected void Z() {
      super.Z();
      agc.a(this);
   }

   @Override
   public boolean ba() {
      return !this.aJ();
   }

   @Override
   public void a(BiConsumer<ebo<?>, arc> $$0) {
      if (this.dW() instanceof arc $$1) {
         $$0.accept(this.ch, $$1);
         $$0.accept(this.ck, $$1);
      }
   }

   public boolean x() {
      return this.al.a(cf);
   }

   public void x(boolean $$0) {
      if (!this.dW().C && this.dk() && (!$$0 || !this.gm())) {
         this.al.a(cf, $$0);
      }
   }

   private boolean gt() {
      return this.cm == null || !this.cm.a(this.du(), (double)ebr.E.a().a()) || !this.dW().a_(this.cm).a(djm.eg);
   }

   public float J(float $$0) {
      return ayy.h($$0, this.cp, this.co) / 5.0F;
   }

   public boolean gp() {
      float $$0 = this.cq % 55.0F;
      return $$0 < 15.0F;
   }

   public float K(float $$0) {
      return ayy.h($$0, this.cs, this.cr) / 15.0F;
   }

   @Override
   public boolean a(cwn $$0, cwn $$1) {
      return !this.c($$0, $$1);
   }

   @Override
   protected void f(arc $$0) {
      super.f($$0);
      this.cl.f().forEach($$1x -> this.a($$0, $$1x));
      cwn $$1 = this.a(bur.a);
      if (!$$1.f() && !dcz.a($$1, dcy.D)) {
         this.a($$0, $$1);
         this.a(bur.a, cwn.j);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      this.b($$0, this.dY());
      aks<un> $$1 = this.dY().a(ue.a);
      eca.a.a
         .encodeStart($$1, this.ci)
         .resultOrPartial($$0x -> bY.error("Failed to encode vibration listener for Allay: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
      $$0.a("DuplicationCooldown", this.cn);
      $$0.a("CanDuplicate", this.gx());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a($$0, this.dY());
      aks<un> $$1 = this.dY().a(ue.a);
      if ($$0.b("listener", 10)) {
         eca.a.a
            .parse($$1, $$0.p("listener"))
            .resultOrPartial($$0x -> bY.error("Failed to parse vibration listener for Allay: '{}'", $$0x))
            .ifPresent($$0x -> this.ci = $$0x);
      }

      this.cn = (long)$$0.h("DuplicationCooldown");
      this.al.a(cg, $$0.q("CanDuplicate"));
   }

   @Override
   protected boolean gn() {
      return false;
   }

   private void gu() {
      if (this.cn > 0L) {
         this.cn--;
      }

      if (!this.dW().B_() && this.cn == 0L && !this.gx()) {
         this.al.a(cg, true);
      }
   }

   private void gv() {
      cic $$0 = buq.c.a(this.dW(), bup.e);
      if ($$0 != null) {
         $$0.e(this.du());
         $$0.aj();
         $$0.gw();
         this.gw();
         this.dW().b($$0);
      }
   }

   private void gw() {
      this.cn = 6000L;
      this.al.a(cg, false);
   }

   private boolean gx() {
      return this.al.a(cg);
   }

   private void a(cov $$0, cwn $$1) {
      $$1.a(1, $$0);
   }

   @Override
   public fay cT() {
      return new fay(0.0, (double)this.cS() * 0.6, (double)this.dr() * 0.1);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 3; $$1++) {
            this.gy();
         }
      } else {
         super.b($$0);
      }
   }

   private void gy() {
      double $$0 = this.ae.k() * 0.02;
      double $$1 = this.ae.k() * 0.02;
      double $$2 = this.ae.k() * 0.02;
      this.dW().a(lt.R, this.d(1.0), this.dE() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public eca.a gq() {
      return this.ci;
   }

   @Override
   public eca.d gr() {
      return this.cj;
   }

   class a implements ebt {
      private final ebv b;
      private final int c;

      public a(final ebv $$0, final int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public ebv a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(arc $$0, jr<ebr> $$1, ebr.a $$2, fay $$3) {
         if ($$1.a(ebr.E)) {
            cic.this.b(ji.a((kb)$$3), true);
            return true;
         } else if ($$1.a(ebr.F)) {
            cic.this.b(ji.a((kb)$$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements eca.d {
      private static final int b = 16;
      private final ebv c = new ebp(cic.this, cic.this.cS());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public ebv b() {
         return this.c;
      }

      @Override
      public boolean a(arc $$0, ji $$1, jr<ebr> $$2, ebr.a $$3) {
         if (cic.this.gc()) {
            return false;
         } else {
            Optional<jq> $$4 = cic.this.ec().c(cej.aN);
            if ($$4.isEmpty()) {
               return true;
            } else {
               jq $$5 = $$4.get();
               return $$5.a($$0.ai(), cic.this.dw(), 1024) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(arc $$0, ji $$1, jr<ebr> $$2, @Nullable buj $$3, @Nullable buj $$4, float $$5) {
         if ($$2.a(ebr.H)) {
            cid.a(cic.this, new ji($$1));
         }
      }

      @Override
      public axe<ebr> c() {
         return awv.e;
      }
   }
}
