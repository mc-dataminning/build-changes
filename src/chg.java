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

public class chg extends bus implements cnf, dzu {
   private static final Logger e = LogUtils.getLogger();
   private static final ki bY = new ki(1, 1, 1);
   private static final int bZ = 5;
   private static final float ca = 55.0F;
   private static final float cb = 15.0F;
   private static final Predicate<cvp> cc = $$0 -> $$0.a(cvt.oE);
   private static final int cd = 6000;
   private static final int ce = 3;
   private static final akg<Boolean> cf = akk.a(chg.class, aki.k);
   private static final akg<Boolean> cg = akk.a(chg.class, aki.k);
   protected static final ImmutableList<ceu<? extends cet<? super chg>>> b = ImmutableList.of(ceu.c, ceu.d, ceu.f, ceu.b);
   protected static final ImmutableList<cdn<?>> c = ImmutableList.of(
      cdn.t, cdn.n, cdn.h, cdn.m, cdn.E, cdn.x, cdn.L, cdn.aM, cdn.aN, cdn.aO, cdn.aP, cdn.Z, new cdn[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final dzi<dzu.b> ch;
   private dzu.a ci;
   private final dzu.d cj;
   private final dzi<chg.a> ck;
   private final brw cl = new brw(1);
   @Nullable
   private je cm;
   private long cn;
   private float co;
   private float cp;
   private float cq;
   private float cr;
   private float cs;

   public chg(btv<? extends chg> $$0, deg $$1) {
      super($$0, $$1);
      this.bP = new cah(this, 20, true);
      this.a_(this.fX());
      this.cj = new chg.b();
      this.ci = new dzu.a();
      this.ch = new dzi<>(new dzu.b(this));
      this.ck = new dzi<>(new chg.a(this.cj.b(), dzl.E.a().a()));
   }

   @Override
   protected bvl.b<chg> dY() {
      return bvl.a(c, b);
   }

   @Override
   protected bvl<?> a(Dynamic<?> $$0) {
      return chh.a(this.dY().a($$0));
   }

   @Override
   public bvl<chg> dX() {
      return (bvl<chg>)super.dX();
   }

   public static bvq.a q() {
      return bum.E().a(bvr.s, 20.0).a(bvr.l, 0.1F).a(bvr.v, 0.1F).a(bvr.c, 2.0);
   }

   @Override
   protected cdv b(deg $$0) {
      cdt $$1 = new cdt(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      $$1.a(48.0F);
      return $$1;
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(cf, false);
      $$0.a(cg, true);
   }

   @Override
   public void a_(eys $$0) {
      if (this.de()) {
         if (this.bi()) {
            this.a(0.02F, $$0);
            this.a(buo.a, this.dv());
            this.h(this.dv().c(0.8F));
         } else if (this.bw()) {
            this.a(0.02F, $$0);
            this.a(buo.a, this.dv());
            this.h(this.dv().c(0.5));
         } else {
            this.a(this.fm(), $$0);
            this.a(buo.a, this.dv());
            this.h(this.dv().c(0.91F));
         }
      }
   }

   @Override
   public boolean a(bsg $$0, float $$1) {
      if ($$0.d() instanceof cnu $$2) {
         Optional<UUID> $$3 = this.dX().c(cdn.aM);
         if ($$3.isPresent() && $$2.cD().equals($$3.get())) {
            return false;
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void b(je $$0, duo $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, duo $$2, je $$3) {
   }

   @Override
   protected awd w() {
      return this.d(btw.a) ? awe.a : awe.b;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.d;
   }

   @Override
   protected awd n_() {
      return awe.c;
   }

   @Override
   protected float fd() {
      return 0.4F;
   }

   @Override
   protected void ad() {
      this.dS().ah().a("allayBrain");
      this.dX().a((arh)this.dS(), this);
      this.dS().ah().c();
      this.dS().ah().a("allayActivityUpdate");
      chh.a(this);
      this.dS().ah().c();
      super.ad();
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dS().B && this.bI() && this.ag % 10 == 0) {
         this.c(1.0F);
      }

      if (this.gp() && this.gu() && this.ag % 20 == 0) {
         this.x(false);
         this.cm = null;
      }

      this.gv();
   }

   @Override
   public void l() {
      super.l();
      if (this.dS().B) {
         this.cp = this.co;
         if (this.t()) {
            this.co = azd.a(this.co + 1.0F, 0.0F, 5.0F);
         } else {
            this.co = azd.a(this.co - 1.0F, 0.0F, 5.0F);
         }

         if (this.gp()) {
            this.cq++;
            this.cs = this.cr;
            if (this.gq()) {
               this.cr++;
            } else {
               this.cr--;
            }

            this.cr = azd.a(this.cr, 0.0F, 15.0F);
         } else {
            this.cq = 0.0F;
            this.cr = 0.0F;
            this.cs = 0.0F;
         }
      } else {
         dzu.c.a(this.dS(), this.ci, this.cj);
         if (this.gm()) {
            this.x(false);
         }
      }
   }

   @Override
   public boolean fX() {
      return !this.gt() && this.t();
   }

   public boolean t() {
      return !this.b(bro.a).f();
   }

   @Override
   public boolean e(cvp $$0) {
      return false;
   }

   private boolean gt() {
      return this.dX().a(cdn.aP, cdo.a);
   }

   @Override
   protected brp b(cnu $$0, bro $$1) {
      cvp $$2 = $$0.b($$1);
      cvp $$3 = this.b(bro.a);
      if (this.gp() && this.m($$2) && this.gy()) {
         this.gw();
         this.dS().a(this, (byte)18);
         this.dS().a($$0, this, awe.E, awf.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return brp.a;
      } else if ($$3.f() && !$$2.f()) {
         cvp $$4 = $$2.c(1);
         this.a(bro.a, $$4);
         this.a($$0, $$2);
         this.dS().a($$0, this, awe.e, awf.g, 2.0F, 1.0F);
         this.dX().a(cdn.aM, $$0.cD());
         return brp.a;
      } else if (!$$3.f() && $$1 == bro.a && $$2.f()) {
         this.a(btw.a, cvp.k);
         this.dS().a($$0, this, awe.f, awf.g, 2.0F, 1.0F);
         this.a(bro.a);

         for (cvp $$5 : this.y().f()) {
            bwe.a(this, $$5, this.dq());
         }

         this.dX().b(cdn.aM);
         $$0.j($$3);
         return brp.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(je $$0, boolean $$1) {
      if ($$1) {
         if (!this.gp()) {
            this.cm = $$0;
            this.x(true);
         }
      } else if ($$0.equals(this.cm) || this.cm == null) {
         this.cm = null;
         this.x(false);
      }
   }

   @Override
   public brw y() {
      return this.cl;
   }

   @Override
   protected ki Z() {
      return bY;
   }

   @Override
   public boolean j(cvp $$0) {
      cvp $$1 = this.b(bro.a);
      return !$$1.f() && this.dS().ac().b(dec.c) && this.cl.c($$0) && this.d($$1, $$0);
   }

   private boolean d(cvp $$0, cvp $$1) {
      return cvp.b($$0, $$1) && !this.e($$0, $$1);
   }

   private boolean e(cvp $$0, cvp $$1) {
      cxo $$2 = $$0.a(kr.L);
      cxo $$3 = $$1.a(kr.L);
      return !Objects.equals($$2, $$3);
   }

   @Override
   protected void b(cke $$0) {
      cnf.a(this, this, $$0);
   }

   @Override
   protected void ac() {
      super.ac();
      agn.a(this);
   }

   @Override
   public boolean aZ() {
      return !this.aH();
   }

   @Override
   public void a(BiConsumer<dzi<?>, arh> $$0) {
      if (this.dS() instanceof arh $$1) {
         $$0.accept(this.ch, $$1);
         $$0.accept(this.ck, $$1);
      }
   }

   public boolean gp() {
      return this.am.a(cf);
   }

   public void x(boolean $$0) {
      if (!this.dS().B && this.df() && (!$$0 || !this.gm())) {
         this.am.a(cf, $$0);
      }
   }

   private boolean gu() {
      return this.cm == null || !this.cm.a(this.dq(), (double)dzl.E.a().a()) || !this.dS().a_(this.cm).a(dhl.dT);
   }

   public float J(float $$0) {
      return azd.h($$0, this.cp, this.co) / 5.0F;
   }

   public boolean gq() {
      float $$0 = this.cq % 55.0F;
      return $$0 < 15.0F;
   }

   public float K(float $$0) {
      return azd.h($$0, this.cs, this.cr) / 15.0F;
   }

   @Override
   public boolean a(cvp $$0, cvp $$1) {
      return !this.d($$0, $$1);
   }

   @Override
   protected void eD() {
      super.eD();
      this.cl.f().forEach(this::b);
      cvp $$0 = this.a(btw.a);
      if (!$$0.f() && !dbm.a($$0, dbl.D)) {
         this.b($$0);
         this.a(btw.a, cvp.k);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      this.b($$0, this.dU());
      ala<vc> $$1 = this.dU().a(ut.a);
      dzu.a.a
         .encodeStart($$1, this.ci)
         .resultOrPartial($$0x -> e.error("Failed to encode vibration listener for Allay: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
      $$0.a("DuplicationCooldown", this.cn);
      $$0.a("CanDuplicate", this.gy());
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.a($$0, this.dU());
      ala<vc> $$1 = this.dU().a(ut.a);
      if ($$0.b("listener", 10)) {
         dzu.a.a
            .parse($$1, $$0.p("listener"))
            .resultOrPartial($$0x -> e.error("Failed to parse vibration listener for Allay: '{}'", $$0x))
            .ifPresent($$0x -> this.ci = $$0x);
      }

      this.cn = (long)$$0.h("DuplicationCooldown");
      this.am.a(cg, $$0.q("CanDuplicate"));
   }

   @Override
   protected boolean gn() {
      return false;
   }

   private void gv() {
      if (this.cn > 0L) {
         this.cn--;
      }

      if (!this.dS().w_() && this.cn == 0L && !this.gy()) {
         this.am.a(cg, true);
      }
   }

   private boolean m(cvp $$0) {
      return cc.test($$0);
   }

   private void gw() {
      chg $$0 = btv.a.a(this.dS(), btu.e);
      if ($$0 != null) {
         $$0.e(this.dq());
         $$0.fW();
         $$0.gx();
         this.gx();
         this.dS().b($$0);
      }
   }

   private void gx() {
      this.cn = 6000L;
      this.am.a(cg, false);
   }

   private boolean gy() {
      return this.am.a(cg);
   }

   private void a(cnu $$0, cvp $$1) {
      $$1.a(1, $$0);
   }

   @Override
   public eys cQ() {
      return new eys(0.0, (double)this.cP() * 0.6, (double)this.dn() * 0.1);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 3; $$1++) {
            this.gz();
         }
      } else {
         super.b($$0);
      }
   }

   private void gz() {
      double $$0 = this.af.k() * 0.02;
      double $$1 = this.af.k() * 0.02;
      double $$2 = this.af.k() * 0.02;
      this.dS().a(ln.Q, this.d(1.0), this.dA() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public dzu.a gr() {
      return this.ci;
   }

   @Override
   public dzu.d gs() {
      return this.cj;
   }

   class a implements dzn {
      private final dzp b;
      private final int c;

      public a(final dzp $$0, final int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public dzp a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(arh $$0, jn<dzl> $$1, dzl.a $$2, eys $$3) {
         if ($$1.a(dzl.E)) {
            chg.this.b(je.a((jx)$$3), true);
            return true;
         } else if ($$1.a(dzl.F)) {
            chg.this.b(je.a((jx)$$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements dzu.d {
      private static final int b = 16;
      private final dzp c = new dzj(chg.this, chg.this.cP());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dzp b() {
         return this.c;
      }

      @Override
      public boolean a(arh $$0, je $$1, jn<dzl> $$2, dzl.a $$3) {
         if (chg.this.ge()) {
            return false;
         } else {
            Optional<jm> $$4 = chg.this.dX().c(cdn.aN);
            if ($$4.isEmpty()) {
               return true;
            } else {
               jm $$5 = $$4.get();
               return $$5.a().equals($$0.ag()) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(arh $$0, je $$1, jn<dzl> $$2, @Nullable bto $$3, @Nullable bto $$4, float $$5) {
         if ($$2.a(dzl.H)) {
            chh.a(chg.this, new je($$1));
         }
      }

      @Override
      public axj<dzl> c() {
         return axa.e;
      }
   }
}
