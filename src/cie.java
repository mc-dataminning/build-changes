import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cie extends bvp implements cod, eba {
   private static final Logger d = LogUtils.getLogger();
   private static final kl bY = new kl(1, 1, 1);
   private static final int bZ = 5;
   private static final float ca = 55.0F;
   private static final float cb = 15.0F;
   private static final int cc = 6000;
   private static final int cd = 3;
   private static final akm<Boolean> ce = akq.a(cie.class, ako.k);
   private static final akm<Boolean> cf = akq.a(cie.class, ako.k);
   protected static final ImmutableList<cfs<? extends cfr<? super cie>>> a = ImmutableList.of(cfs.c, cfs.d, cfs.f, cfs.b);
   protected static final ImmutableList<cel<?>> b = ImmutableList.of(
      cel.t, cel.n, cel.h, cel.m, cel.E, cel.x, cel.L, cel.aM, cel.aN, cel.aO, cel.aP, cel.Z, new cel[0]
   );
   public static final ImmutableList<Float> c = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final eao<eba.b> cg;
   private eba.a ch;
   private final eba.d ci;
   private final eao<cie.a> cj;
   private final bsr ck = new bsr(1);
   @Nullable
   private jh cl;
   private long cm;
   private float cn;
   private float co;
   private float cp;
   private float cq;
   private float cr;

   public cie(bus<? extends cie> $$0, dfm $$1) {
      super($$0, $$1);
      this.bP = new cbf(this, 20, true);
      this.a_(this.fL());
      this.ci = new cie.b();
      this.ch = new eba.a();
      this.cg = new eao<>(new eba.b(this));
      this.cj = new eao<>(new cie.a(this.ci.b(), ear.E.a().a()));
   }

   @Override
   protected bwj.b<cie> ec() {
      return bwj.a(b, a);
   }

   @Override
   protected bwj<?> a(Dynamic<?> $$0) {
      return cif.a(this.ec().a($$0));
   }

   @Override
   public bwj<cie> eb() {
      return (bwj<cie>)super.eb();
   }

   public static bwo.a n() {
      return bvj.C().a(bwp.s, 20.0).a(bwp.l, 0.1F).a(bwp.v, 0.1F).a(bwp.c, 2.0);
   }

   @Override
   protected cet b(dfm $$0) {
      cer $$1 = new cer(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      $$1.a(48.0F);
      return $$1;
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(ce, false);
      $$0.a(cf, true);
   }

   @Override
   public void a_(ezy $$0) {
      if (this.di()) {
         if (this.bj()) {
            this.a(0.02F, $$0);
            this.a(bvl.a, this.dy());
            this.h(this.dy().c(0.8F));
         } else if (this.bx()) {
            this.a(0.02F, $$0);
            this.a(bvl.a, this.dy());
            this.h(this.dy().c(0.5));
         } else {
            this.a(this.fn(), $$0);
            this.a(bvl.a, this.dy());
            this.h(this.dy().c(0.91F));
         }
      }
   }

   @Override
   public boolean a(arp $$0, btb $$1, float $$2) {
      if ($$1.d() instanceof cou $$3) {
         Optional<UUID> $$4 = this.eb().c(cel.aM);
         if ($$4.isPresent() && $$3.cG().equals($$4.get())) {
            return false;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected void b(jh $$0, dvv $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, dvv $$2, jh $$3) {
   }

   @Override
   protected awm t() {
      return this.d(but.a) ? awn.a : awn.b;
   }

   @Override
   protected awm e(btb $$0) {
      return awn.d;
   }

   @Override
   protected awm n_() {
      return awn.c;
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Override
   protected void a(arp $$0) {
      bou $$1 = bot.a();
      $$1.a("allayBrain");
      this.eb().a($$0, this);
      $$1.c();
      $$1.a("allayActivityUpdate");
      cif.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dV().C && this.bL() && this.af % 10 == 0) {
         this.c(1.0F);
      }

      if (this.gm() && this.gr() && this.af % 20 == 0) {
         this.x(false);
         this.cl = null;
      }

      this.gs();
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C) {
         this.co = this.cn;
         if (this.q()) {
            this.cn = azm.a(this.cn + 1.0F, 0.0F, 5.0F);
         } else {
            this.cn = azm.a(this.cn - 1.0F, 0.0F, 5.0F);
         }

         if (this.gm()) {
            this.cp++;
            this.cr = this.cq;
            if (this.gn()) {
               this.cq++;
            } else {
               this.cq--;
            }

            this.cq = azm.a(this.cq, 0.0F, 15.0F);
         } else {
            this.cp = 0.0F;
            this.cq = 0.0F;
            this.cr = 0.0F;
         }
      } else {
         eba.c.a(this.dV(), this.ch, this.ci);
         if (this.gj()) {
            this.x(false);
         }
      }
   }

   @Override
   public boolean fL() {
      return !this.gq() && this.q();
   }

   public boolean q() {
      return !this.b(bsj.a).f();
   }

   @Override
   protected boolean f(but $$0) {
      return false;
   }

   private boolean gq() {
      return this.eb().a(cel.aP, cem.a);
   }

   @Override
   protected bsk b(cou $$0, bsj $$1) {
      cwm $$2 = $$0.b($$1);
      cwm $$3 = this.b(bsj.a);
      if (this.gm() && $$2.a(axl.X) && this.gv()) {
         this.gt();
         this.dV().a(this, (byte)18);
         this.dV().a($$0, this, awn.E, awo.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bsk.a;
      } else if ($$3.f() && !$$2.f()) {
         cwm $$4 = $$2.c(1);
         this.a(bsj.a, $$4);
         this.a($$0, $$2);
         this.dV().a($$0, this, awn.e, awo.g, 2.0F, 1.0F);
         this.eb().a(cel.aM, $$0.cG());
         return bsk.a;
      } else if (!$$3.f() && $$1 == bsj.a && $$2.f()) {
         this.a(but.a, cwm.k);
         this.dV().a($$0, this, awn.f, awo.g, 2.0F, 1.0F);
         this.a(bsj.a);

         for (cwm $$5 : this.v().f()) {
            bxc.a(this, $$5, this.dt());
         }

         this.eb().b(cel.aM);
         $$0.i($$3);
         return bsk.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(jh $$0, boolean $$1) {
      if ($$1) {
         if (!this.gm()) {
            this.cl = $$0;
            this.x(true);
         }
      } else if ($$0.equals(this.cl) || this.cl == null) {
         this.cl = null;
         this.x(false);
      }
   }

   @Override
   public bsr v() {
      return this.ck;
   }

   @Override
   protected kl V() {
      return bY;
   }

   @Override
   public boolean c(arp $$0, cwm $$1) {
      cwm $$2 = this.b(bsj.a);
      return !$$2.f() && $$0.N().b(dfi.c) && this.ck.c($$1) && this.c($$2, $$1);
   }

   private boolean c(cwm $$0, cwm $$1) {
      return cwm.b($$0, $$1) && !this.d($$0, $$1);
   }

   private boolean d(cwm $$0, cwm $$1) {
      cyl $$2 = $$0.a(ku.Q);
      cyl $$3 = $$1.a(ku.Q);
      return !Objects.equals($$2, $$3);
   }

   @Override
   protected void a(arp $$0, clc $$1) {
      cod.a($$0, this, this, $$1);
   }

   @Override
   protected void Y() {
      super.Y();
      agt.a(this);
   }

   @Override
   public boolean ba() {
      return !this.aJ();
   }

   @Override
   public void a(BiConsumer<eao<?>, arp> $$0) {
      if (this.dV() instanceof arp $$1) {
         $$0.accept(this.cg, $$1);
         $$0.accept(this.cj, $$1);
      }
   }

   public boolean gm() {
      return this.al.a(ce);
   }

   public void x(boolean $$0) {
      if (!this.dV().C && this.dj() && (!$$0 || !this.gj())) {
         this.al.a(ce, $$0);
      }
   }

   private boolean gr() {
      return this.cl == null || !this.cl.a(this.dt(), (double)ear.E.a().a()) || !this.dV().a_(this.cl).a(dis.dT);
   }

   public float J(float $$0) {
      return azm.h($$0, this.co, this.cn) / 5.0F;
   }

   public boolean gn() {
      float $$0 = this.cp % 55.0F;
      return $$0 < 15.0F;
   }

   public float K(float $$0) {
      return azm.h($$0, this.cr, this.cq) / 15.0F;
   }

   @Override
   public boolean a(cwm $$0, cwm $$1) {
      return !this.c($$0, $$1);
   }

   @Override
   protected void f(arp $$0) {
      super.f($$0);
      this.ck.f().forEach($$1x -> this.a($$0, $$1x));
      cwm $$1 = this.a(but.a);
      if (!$$1.f() && !dcf.a($$1, dce.D)) {
         this.a($$0, $$1);
         this.a(but.a, cwm.k);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      this.b($$0, this.dX());
      alh<vi> $$1 = this.dX().a(uz.a);
      eba.a.a
         .encodeStart($$1, this.ch)
         .resultOrPartial($$0x -> d.error("Failed to encode vibration listener for Allay: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
      $$0.a("DuplicationCooldown", this.cm);
      $$0.a("CanDuplicate", this.gv());
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      this.a($$0, this.dX());
      alh<vi> $$1 = this.dX().a(uz.a);
      if ($$0.b("listener", 10)) {
         eba.a.a
            .parse($$1, $$0.p("listener"))
            .resultOrPartial($$0x -> d.error("Failed to parse vibration listener for Allay: '{}'", $$0x))
            .ifPresent($$0x -> this.ch = $$0x);
      }

      this.cm = (long)$$0.h("DuplicationCooldown");
      this.al.a(cf, $$0.q("CanDuplicate"));
   }

   @Override
   protected boolean gk() {
      return false;
   }

   private void gs() {
      if (this.cm > 0L) {
         this.cm--;
      }

      if (!this.dV().A_() && this.cm == 0L && !this.gv()) {
         this.al.a(cf, true);
      }
   }

   private void gt() {
      cie $$0 = bus.c.a(this.dV(), bur.e);
      if ($$0 != null) {
         $$0.e(this.dt());
         $$0.ai();
         $$0.gu();
         this.gu();
         this.dV().b($$0);
      }
   }

   private void gu() {
      this.cm = 6000L;
      this.al.a(cf, false);
   }

   private boolean gv() {
      return this.al.a(cf);
   }

   private void a(cou $$0, cwm $$1) {
      $$1.a(1, $$0);
   }

   @Override
   public ezy cT() {
      return new ezy(0.0, (double)this.cS() * 0.6, (double)this.dq() * 0.1);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 3; $$1++) {
            this.gw();
         }
      } else {
         super.b($$0);
      }
   }

   private void gw() {
      double $$0 = this.ae.k() * 0.02;
      double $$1 = this.ae.k() * 0.02;
      double $$2 = this.ae.k() * 0.02;
      this.dV().a(ls.Q, this.d(1.0), this.dD() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public eba.a go() {
      return this.ch;
   }

   @Override
   public eba.d gp() {
      return this.ci;
   }

   class a implements eat {
      private final eav b;
      private final int c;

      public a(final eav $$0, final int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public eav a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(arp $$0, jq<ear> $$1, ear.a $$2, ezy $$3) {
         if ($$1.a(ear.E)) {
            cie.this.b(jh.a((ka)$$3), true);
            return true;
         } else if ($$1.a(ear.F)) {
            cie.this.b(jh.a((ka)$$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements eba.d {
      private static final int b = 16;
      private final eav c = new eap(cie.this, cie.this.cS());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public eav b() {
         return this.c;
      }

      @Override
      public boolean a(arp $$0, jh $$1, jq<ear> $$2, ear.a $$3) {
         if (cie.this.fZ()) {
            return false;
         } else {
            Optional<jp> $$4 = cie.this.eb().c(cel.aN);
            if ($$4.isEmpty()) {
               return true;
            } else {
               jp $$5 = $$4.get();
               return $$5.a().equals($$0.ag()) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(arp $$0, jh $$1, jq<ear> $$2, @Nullable bul $$3, @Nullable bul $$4, float $$5) {
         if ($$2.a(ear.H)) {
            cif.a(cie.this, new jh($$1));
         }
      }

      @Override
      public axs<ear> c() {
         return axj.e;
      }
   }
}
