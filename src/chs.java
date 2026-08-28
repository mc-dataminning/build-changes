import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class chs extends bvd implements cnr, eaj {
   private static final Logger e = LogUtils.getLogger();
   private static final kk bY = new kk(1, 1, 1);
   private static final int bZ = 5;
   private static final float ca = 55.0F;
   private static final float cb = 15.0F;
   private static final Predicate<cvx> cc = $$0 -> $$0.a(cwb.oE);
   private static final int cd = 6000;
   private static final int ce = 3;
   private static final akk<Boolean> cf = ako.a(chs.class, akm.k);
   private static final akk<Boolean> cg = ako.a(chs.class, akm.k);
   protected static final ImmutableList<cfg<? extends cff<? super chs>>> b = ImmutableList.of(cfg.c, cfg.d, cfg.f, cfg.b);
   protected static final ImmutableList<cdz<?>> c = ImmutableList.of(
      cdz.t, cdz.n, cdz.h, cdz.m, cdz.E, cdz.x, cdz.L, cdz.aM, cdz.aN, cdz.aO, cdz.aP, cdz.Z, new cdz[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final dzx<eaj.b> ch;
   private eaj.a ci;
   private final eaj.d cj;
   private final dzx<chs.a> ck;
   private final bsf cl = new bsf(1);
   @Nullable
   private jg cm;
   private long cn;
   private float co;
   private float cp;
   private float cq;
   private float cr;
   private float cs;

   public chs(bug<? extends chs> $$0, dev $$1) {
      super($$0, $$1);
      this.bP = new cat(this, 20, true);
      this.a_(this.fP());
      this.cj = new chs.b();
      this.ci = new eaj.a();
      this.ch = new dzx<>(new eaj.b(this));
      this.ck = new dzx<>(new chs.a(this.cj.b(), eaa.E.a().a()));
   }

   @Override
   protected bvx.b<chs> ee() {
      return bvx.a(c, b);
   }

   @Override
   protected bvx<?> a(Dynamic<?> $$0) {
      return cht.a(this.ee().a($$0));
   }

   @Override
   public bvx<chs> ed() {
      return (bvx<chs>)super.ed();
   }

   public static bwc.a q() {
      return bux.E().a(bwd.s, 20.0).a(bwd.l, 0.1F).a(bwd.v, 0.1F).a(bwd.c, 2.0);
   }

   @Override
   protected ceh b(dev $$0) {
      cef $$1 = new cef(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      $$1.a(48.0F);
      return $$1;
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(cf, false);
      $$0.a(cg, true);
   }

   @Override
   public void a_(ezh $$0) {
      if (this.dj()) {
         if (this.bk()) {
            this.a(0.02F, $$0);
            this.a(buz.a, this.dA());
            this.h(this.dA().c(0.8F));
         } else if (this.by()) {
            this.a(0.02F, $$0);
            this.a(buz.a, this.dA());
            this.h(this.dA().c(0.5));
         } else {
            this.a(this.fr(), $$0);
            this.a(buz.a, this.dA());
            this.h(this.dA().c(0.91F));
         }
      }
   }

   @Override
   public boolean a(bsp $$0, float $$1) {
      if ($$0.d() instanceof coh $$2) {
         Optional<UUID> $$3 = this.ed().c(cdz.aM);
         if ($$3.isPresent() && $$2.cH().equals($$3.get())) {
            return false;
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void b(jg $$0, dvd $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, dvd $$2, jg $$3) {
   }

   @Override
   protected awj w() {
      return this.d(buh.a) ? awk.a : awk.b;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.d;
   }

   @Override
   protected awj o_() {
      return awk.c;
   }

   @Override
   protected float fi() {
      return 0.4F;
   }

   @Override
   protected void ac() {
      this.dX().ah().a("allayBrain");
      this.ed().a((arm)this.dX(), this);
      this.dX().ah().c();
      this.dX().ah().a("allayActivityUpdate");
      cht.a(this);
      this.dX().ah().c();
      super.ac();
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dX().C && this.bM() && this.ag % 10 == 0) {
         this.c(1.0F);
      }

      if (this.gv() && this.gA() && this.ag % 20 == 0) {
         this.x(false);
         this.cm = null;
      }

      this.gB();
   }

   @Override
   public void l() {
      super.l();
      if (this.dX().C) {
         this.cp = this.co;
         if (this.t()) {
            this.co = azj.a(this.co + 1.0F, 0.0F, 5.0F);
         } else {
            this.co = azj.a(this.co - 1.0F, 0.0F, 5.0F);
         }

         if (this.gv()) {
            this.cq++;
            this.cs = this.cr;
            if (this.gw()) {
               this.cr++;
            } else {
               this.cr--;
            }

            this.cr = azj.a(this.cr, 0.0F, 15.0F);
         } else {
            this.cq = 0.0F;
            this.cr = 0.0F;
            this.cs = 0.0F;
         }
      } else {
         eaj.c.a(this.dX(), this.ci, this.cj);
         if (this.gs()) {
            this.x(false);
         }
      }
   }

   @Override
   public boolean fP() {
      return !this.gz() && this.t();
   }

   public boolean t() {
      return !this.b(brx.a).f();
   }

   @Override
   protected boolean f(buh $$0) {
      return false;
   }

   private boolean gz() {
      return this.ed().a(cdz.aP, cea.a);
   }

   @Override
   protected bry b(coh $$0, brx $$1) {
      cvx $$2 = $$0.b($$1);
      cvx $$3 = this.b(brx.a);
      if (this.gv() && this.k($$2) && this.gE()) {
         this.gC();
         this.dX().a(this, (byte)18);
         this.dX().a($$0, this, awk.E, awl.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bry.a;
      } else if ($$3.f() && !$$2.f()) {
         cvx $$4 = $$2.c(1);
         this.a(brx.a, $$4);
         this.a($$0, $$2);
         this.dX().a($$0, this, awk.e, awl.g, 2.0F, 1.0F);
         this.ed().a(cdz.aM, $$0.cH());
         return bry.a;
      } else if (!$$3.f() && $$1 == brx.a && $$2.f()) {
         this.a(buh.a, cvx.k);
         this.dX().a($$0, this, awk.f, awl.g, 2.0F, 1.0F);
         this.a(brx.a);

         for (cvx $$5 : this.y().f()) {
            bwq.a(this, $$5, this.dv());
         }

         this.ed().b(cdz.aM);
         $$0.i($$3);
         return bry.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(jg $$0, boolean $$1) {
      if ($$1) {
         if (!this.gv()) {
            this.cm = $$0;
            this.x(true);
         }
      } else if ($$0.equals(this.cm) || this.cm == null) {
         this.cm = null;
         this.x(false);
      }
   }

   @Override
   public bsf y() {
      return this.cl;
   }

   @Override
   protected kk Y() {
      return bY;
   }

   @Override
   public boolean i(cvx $$0) {
      cvx $$1 = this.b(brx.a);
      return !$$1.f() && this.dX().ac().b(der.c) && this.cl.c($$0) && this.c($$1, $$0);
   }

   private boolean c(cvx $$0, cvx $$1) {
      return cvx.b($$0, $$1) && !this.d($$0, $$1);
   }

   private boolean d(cvx $$0, cvx $$1) {
      cxw $$2 = $$0.a(kt.P);
      cxw $$3 = $$1.a(kt.P);
      return !Objects.equals($$2, $$3);
   }

   @Override
   protected void b(ckq $$0) {
      cnr.a(this, this, $$0);
   }

   @Override
   protected void ab() {
      super.ab();
      agr.a(this);
   }

   @Override
   public boolean bb() {
      return !this.aJ();
   }

   @Override
   public void a(BiConsumer<dzx<?>, arm> $$0) {
      if (this.dX() instanceof arm $$1) {
         $$0.accept(this.ch, $$1);
         $$0.accept(this.ck, $$1);
      }
   }

   public boolean gv() {
      return this.am.a(cf);
   }

   public void x(boolean $$0) {
      if (!this.dX().C && this.dk() && (!$$0 || !this.gs())) {
         this.am.a(cf, $$0);
      }
   }

   private boolean gA() {
      return this.cm == null || !this.cm.a(this.dv(), (double)eaa.E.a().a()) || !this.dX().a_(this.cm).a(dia.dT);
   }

   public float J(float $$0) {
      return azj.h($$0, this.cp, this.co) / 5.0F;
   }

   public boolean gw() {
      float $$0 = this.cq % 55.0F;
      return $$0 < 15.0F;
   }

   public float K(float $$0) {
      return azj.h($$0, this.cs, this.cr) / 15.0F;
   }

   @Override
   public boolean a(cvx $$0, cvx $$1) {
      return !this.c($$0, $$1);
   }

   @Override
   protected void eJ() {
      super.eJ();
      this.cl.f().forEach(this::b);
      cvx $$0 = this.a(buh.a);
      if (!$$0.f() && !dbo.a($$0, dbn.D)) {
         this.b($$0);
         this.a(buh.a, cvx.k);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      this.b($$0, this.dZ());
      alf<vg> $$1 = this.dZ().a(ux.a);
      eaj.a.a
         .encodeStart($$1, this.ci)
         .resultOrPartial($$0x -> e.error("Failed to encode vibration listener for Allay: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
      $$0.a("DuplicationCooldown", this.cn);
      $$0.a("CanDuplicate", this.gE());
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      this.a($$0, this.dZ());
      alf<vg> $$1 = this.dZ().a(ux.a);
      if ($$0.b("listener", 10)) {
         eaj.a.a
            .parse($$1, $$0.p("listener"))
            .resultOrPartial($$0x -> e.error("Failed to parse vibration listener for Allay: '{}'", $$0x))
            .ifPresent($$0x -> this.ci = $$0x);
      }

      this.cn = (long)$$0.h("DuplicationCooldown");
      this.am.a(cg, $$0.q("CanDuplicate"));
   }

   @Override
   protected boolean gt() {
      return false;
   }

   private void gB() {
      if (this.cn > 0L) {
         this.cn--;
      }

      if (!this.dX().y_() && this.cn == 0L && !this.gE()) {
         this.am.a(cg, true);
      }
   }

   private boolean k(cvx $$0) {
      return cc.test($$0);
   }

   private void gC() {
      chs $$0 = bug.a.a(this.dX(), buf.e);
      if ($$0 != null) {
         $$0.e(this.dv());
         $$0.gb();
         $$0.gD();
         this.gD();
         this.dX().b($$0);
      }
   }

   private void gD() {
      this.cn = 6000L;
      this.am.a(cg, false);
   }

   private boolean gE() {
      return this.am.a(cg);
   }

   private void a(coh $$0, cvx $$1) {
      $$1.a(1, $$0);
   }

   @Override
   public ezh cU() {
      return new ezh(0.0, (double)this.cT() * 0.6, (double)this.ds() * 0.1);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 3; $$1++) {
            this.gF();
         }
      } else {
         super.b($$0);
      }
   }

   private void gF() {
      double $$0 = this.af.k() * 0.02;
      double $$1 = this.af.k() * 0.02;
      double $$2 = this.af.k() * 0.02;
      this.dX().a(lq.Q, this.d(1.0), this.dF() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public eaj.a gx() {
      return this.ci;
   }

   @Override
   public eaj.d gy() {
      return this.cj;
   }

   class a implements eac {
      private final eae b;
      private final int c;

      public a(final eae $$0, final int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public eae a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(arm $$0, jp<eaa> $$1, eaa.a $$2, ezh $$3) {
         if ($$1.a(eaa.E)) {
            chs.this.b(jg.a((jz)$$3), true);
            return true;
         } else if ($$1.a(eaa.F)) {
            chs.this.b(jg.a((jz)$$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements eaj.d {
      private static final int b = 16;
      private final eae c = new dzy(chs.this, chs.this.cT());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public eae b() {
         return this.c;
      }

      @Override
      public boolean a(arm $$0, jg $$1, jp<eaa> $$2, eaa.a $$3) {
         if (chs.this.gi()) {
            return false;
         } else {
            Optional<jo> $$4 = chs.this.ed().c(cdz.aN);
            if ($$4.isEmpty()) {
               return true;
            } else {
               jo $$5 = $$4.get();
               return $$5.a().equals($$0.ag()) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(arm $$0, jg $$1, jp<eaa> $$2, @Nullable btz $$3, @Nullable btz $$4, float $$5) {
         if ($$2.a(eaa.H)) {
            cht.a(chs.this, new jg($$1));
         }
      }

      @Override
      public axp<eaa> c() {
         return axg.e;
      }
   }
}
