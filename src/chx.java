import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class chx extends bvi implements cnw, eap {
   private static final Logger e = LogUtils.getLogger();
   private static final kl bY = new kl(1, 1, 1);
   private static final int bZ = 5;
   private static final float ca = 55.0F;
   private static final float cb = 15.0F;
   private static final int cc = 6000;
   private static final int cd = 3;
   private static final akl<Boolean> ce = akp.a(chx.class, akn.k);
   private static final akl<Boolean> cf = akp.a(chx.class, akn.k);
   protected static final ImmutableList<cfl<? extends cfk<? super chx>>> b = ImmutableList.of(cfl.c, cfl.d, cfl.f, cfl.b);
   protected static final ImmutableList<cee<?>> c = ImmutableList.of(
      cee.t, cee.n, cee.h, cee.m, cee.E, cee.x, cee.L, cee.aM, cee.aN, cee.aO, cee.aP, cee.Z, new cee[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final ead<eap.b> cg;
   private eap.a ch;
   private final eap.d ci;
   private final ead<chx.a> cj;
   private final bsk ck = new bsk(1);
   @Nullable
   private jh cl;
   private long cm;
   private float cn;
   private float co;
   private float cp;
   private float cq;
   private float cr;

   public chx(bul<? extends chx> $$0, dfb $$1) {
      super($$0, $$1);
      this.bP = new cay(this, 20, true);
      this.a_(this.fP());
      this.ci = new chx.b();
      this.ch = new eap.a();
      this.cg = new ead<>(new eap.b(this));
      this.cj = new ead<>(new chx.a(this.ci.b(), eag.E.a().a()));
   }

   @Override
   protected bwc.b<chx> ee() {
      return bwc.a(c, b);
   }

   @Override
   protected bwc<?> a(Dynamic<?> $$0) {
      return chy.a(this.ee().a($$0));
   }

   @Override
   public bwc<chx> ed() {
      return (bwc<chx>)super.ed();
   }

   public static bwh.a q() {
      return bvc.E().a(bwi.s, 20.0).a(bwi.l, 0.1F).a(bwi.v, 0.1F).a(bwi.c, 2.0);
   }

   @Override
   protected cem b(dfb $$0) {
      cek $$1 = new cek(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      $$1.a(48.0F);
      return $$1;
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(ce, false);
      $$0.a(cf, true);
   }

   @Override
   public void a_(ezn $$0) {
      if (this.dj()) {
         if (this.bk()) {
            this.a(0.02F, $$0);
            this.a(bve.a, this.dA());
            this.h(this.dA().c(0.8F));
         } else if (this.by()) {
            this.a(0.02F, $$0);
            this.a(bve.a, this.dA());
            this.h(this.dA().c(0.5));
         } else {
            this.a(this.fr(), $$0);
            this.a(bve.a, this.dA());
            this.h(this.dA().c(0.91F));
         }
      }
   }

   @Override
   public boolean a(bsu $$0, float $$1) {
      if ($$0.d() instanceof com $$2) {
         Optional<UUID> $$3 = this.ed().c(cee.aM);
         if ($$3.isPresent() && $$2.cH().equals($$3.get())) {
            return false;
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void b(jh $$0, dvj $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, dvj $$2, jh $$3) {
   }

   @Override
   protected awk w() {
      return this.d(bum.a) ? awl.a : awl.b;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.d;
   }

   @Override
   protected awk o_() {
      return awl.c;
   }

   @Override
   protected float fi() {
      return 0.4F;
   }

   @Override
   protected void ac() {
      bon $$0 = bom.a();
      $$0.a("allayBrain");
      this.ed().a((arn)this.dX(), this);
      $$0.c();
      $$0.a("allayActivityUpdate");
      chy.a(this);
      $$0.c();
      super.ac();
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dX().C && this.bM() && this.ag % 10 == 0) {
         this.c(1.0F);
      }

      if (this.gu() && this.gz() && this.ag % 20 == 0) {
         this.x(false);
         this.cl = null;
      }

      this.gA();
   }

   @Override
   public void l() {
      super.l();
      if (this.dX().C) {
         this.co = this.cn;
         if (this.t()) {
            this.cn = azk.a(this.cn + 1.0F, 0.0F, 5.0F);
         } else {
            this.cn = azk.a(this.cn - 1.0F, 0.0F, 5.0F);
         }

         if (this.gu()) {
            this.cp++;
            this.cr = this.cq;
            if (this.gv()) {
               this.cq++;
            } else {
               this.cq--;
            }

            this.cq = azk.a(this.cq, 0.0F, 15.0F);
         } else {
            this.cp = 0.0F;
            this.cq = 0.0F;
            this.cr = 0.0F;
         }
      } else {
         eap.c.a(this.dX(), this.ch, this.ci);
         if (this.gr()) {
            this.x(false);
         }
      }
   }

   @Override
   public boolean fP() {
      return !this.gy() && this.t();
   }

   public boolean t() {
      return !this.b(bsc.a).f();
   }

   @Override
   protected boolean f(bum $$0) {
      return false;
   }

   private boolean gy() {
      return this.ed().a(cee.aP, cef.a);
   }

   @Override
   protected bsd b(com $$0, bsc $$1) {
      cwb $$2 = $$0.b($$1);
      cwb $$3 = this.b(bsc.a);
      if (this.gu() && $$2.a(axj.X) && this.gD()) {
         this.gB();
         this.dX().a(this, (byte)18);
         this.dX().a($$0, this, awl.E, awm.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bsd.a;
      } else if ($$3.f() && !$$2.f()) {
         cwb $$4 = $$2.c(1);
         this.a(bsc.a, $$4);
         this.a($$0, $$2);
         this.dX().a($$0, this, awl.e, awm.g, 2.0F, 1.0F);
         this.ed().a(cee.aM, $$0.cH());
         return bsd.a;
      } else if (!$$3.f() && $$1 == bsc.a && $$2.f()) {
         this.a(bum.a, cwb.k);
         this.dX().a($$0, this, awl.f, awm.g, 2.0F, 1.0F);
         this.a(bsc.a);

         for (cwb $$5 : this.y().f()) {
            bwv.a(this, $$5, this.dv());
         }

         this.ed().b(cee.aM);
         $$0.i($$3);
         return bsd.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(jh $$0, boolean $$1) {
      if ($$1) {
         if (!this.gu()) {
            this.cl = $$0;
            this.x(true);
         }
      } else if ($$0.equals(this.cl) || this.cl == null) {
         this.cl = null;
         this.x(false);
      }
   }

   @Override
   public bsk y() {
      return this.ck;
   }

   @Override
   protected kl Y() {
      return bY;
   }

   @Override
   public boolean i(cwb $$0) {
      cwb $$1 = this.b(bsc.a);
      return !$$1.f() && this.dX().ac().b(dex.c) && this.ck.c($$0) && this.c($$1, $$0);
   }

   private boolean c(cwb $$0, cwb $$1) {
      return cwb.b($$0, $$1) && !this.d($$0, $$1);
   }

   private boolean d(cwb $$0, cwb $$1) {
      cya $$2 = $$0.a(ku.Q);
      cya $$3 = $$1.a(ku.Q);
      return !Objects.equals($$2, $$3);
   }

   @Override
   protected void b(ckv $$0) {
      cnw.a(this, this, $$0);
   }

   @Override
   protected void ab() {
      super.ab();
      ags.a(this);
   }

   @Override
   public boolean bb() {
      return !this.aK();
   }

   @Override
   public void a(BiConsumer<ead<?>, arn> $$0) {
      if (this.dX() instanceof arn $$1) {
         $$0.accept(this.cg, $$1);
         $$0.accept(this.cj, $$1);
      }
   }

   public boolean gu() {
      return this.am.a(ce);
   }

   public void x(boolean $$0) {
      if (!this.dX().C && this.dk() && (!$$0 || !this.gr())) {
         this.am.a(ce, $$0);
      }
   }

   private boolean gz() {
      return this.cl == null || !this.cl.a(this.dv(), (double)eag.E.a().a()) || !this.dX().a_(this.cl).a(dig.dT);
   }

   public float J(float $$0) {
      return azk.h($$0, this.co, this.cn) / 5.0F;
   }

   public boolean gv() {
      float $$0 = this.cp % 55.0F;
      return $$0 < 15.0F;
   }

   public float K(float $$0) {
      return azk.h($$0, this.cr, this.cq) / 15.0F;
   }

   @Override
   public boolean a(cwb $$0, cwb $$1) {
      return !this.c($$0, $$1);
   }

   @Override
   protected void eJ() {
      super.eJ();
      this.ck.f().forEach(this::b);
      cwb $$0 = this.a(bum.a);
      if (!$$0.f() && !dbu.a($$0, dbt.D)) {
         this.b($$0);
         this.a(bum.a, cwb.k);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      this.b($$0, this.dZ());
      alg<vh> $$1 = this.dZ().a(uy.a);
      eap.a.a
         .encodeStart($$1, this.ch)
         .resultOrPartial($$0x -> e.error("Failed to encode vibration listener for Allay: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
      $$0.a("DuplicationCooldown", this.cm);
      $$0.a("CanDuplicate", this.gD());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.a($$0, this.dZ());
      alg<vh> $$1 = this.dZ().a(uy.a);
      if ($$0.b("listener", 10)) {
         eap.a.a
            .parse($$1, $$0.p("listener"))
            .resultOrPartial($$0x -> e.error("Failed to parse vibration listener for Allay: '{}'", $$0x))
            .ifPresent($$0x -> this.ch = $$0x);
      }

      this.cm = (long)$$0.h("DuplicationCooldown");
      this.am.a(cf, $$0.q("CanDuplicate"));
   }

   @Override
   protected boolean gs() {
      return false;
   }

   private void gA() {
      if (this.cm > 0L) {
         this.cm--;
      }

      if (!this.dX().y_() && this.cm == 0L && !this.gD()) {
         this.am.a(cf, true);
      }
   }

   private void gB() {
      chx $$0 = bul.a.a(this.dX(), buk.e);
      if ($$0 != null) {
         $$0.e(this.dv());
         $$0.ga();
         $$0.gC();
         this.gC();
         this.dX().b($$0);
      }
   }

   private void gC() {
      this.cm = 6000L;
      this.am.a(cf, false);
   }

   private boolean gD() {
      return this.am.a(cf);
   }

   private void a(com $$0, cwb $$1) {
      $$1.a(1, $$0);
   }

   @Override
   public ezn cU() {
      return new ezn(0.0, (double)this.cT() * 0.6, (double)this.ds() * 0.1);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 3; $$1++) {
            this.gE();
         }
      } else {
         super.b($$0);
      }
   }

   private void gE() {
      double $$0 = this.af.k() * 0.02;
      double $$1 = this.af.k() * 0.02;
      double $$2 = this.af.k() * 0.02;
      this.dX().a(lr.Q, this.d(1.0), this.dF() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public eap.a gw() {
      return this.ch;
   }

   @Override
   public eap.d gx() {
      return this.ci;
   }

   class a implements eai {
      private final eak b;
      private final int c;

      public a(final eak $$0, final int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public eak a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(arn $$0, jq<eag> $$1, eag.a $$2, ezn $$3) {
         if ($$1.a(eag.E)) {
            chx.this.b(jh.a((ka)$$3), true);
            return true;
         } else if ($$1.a(eag.F)) {
            chx.this.b(jh.a((ka)$$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements eap.d {
      private static final int b = 16;
      private final eak c = new eae(chx.this, chx.this.cT());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public eak b() {
         return this.c;
      }

      @Override
      public boolean a(arn $$0, jh $$1, jq<eag> $$2, eag.a $$3) {
         if (chx.this.gh()) {
            return false;
         } else {
            Optional<jp> $$4 = chx.this.ed().c(cee.aN);
            if ($$4.isEmpty()) {
               return true;
            } else {
               jp $$5 = $$4.get();
               return $$5.a().equals($$0.ag()) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(arn $$0, jh $$1, jq<eag> $$2, @Nullable bue $$3, @Nullable bue $$4, float $$5) {
         if ($$2.a(eag.H)) {
            chy.a(chx.this, new jh($$1));
         }
      }

      @Override
      public axq<eag> c() {
         return axh.e;
      }
   }
}
