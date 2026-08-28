import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cib extends bvm implements coa, eat {
   private static final Logger e = LogUtils.getLogger();
   private static final kl bY = new kl(1, 1, 1);
   private static final int bZ = 5;
   private static final float ca = 55.0F;
   private static final float cb = 15.0F;
   private static final int cc = 6000;
   private static final int cd = 3;
   private static final ako<Boolean> ce = aks.a(cib.class, akq.k);
   private static final ako<Boolean> cf = aks.a(cib.class, akq.k);
   protected static final ImmutableList<cfp<? extends cfo<? super cib>>> b = ImmutableList.of(cfp.c, cfp.d, cfp.f, cfp.b);
   protected static final ImmutableList<cei<?>> c = ImmutableList.of(
      cei.t, cei.n, cei.h, cei.m, cei.E, cei.x, cei.L, cei.aM, cei.aN, cei.aO, cei.aP, cei.Z, new cei[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final eah<eat.b> cg;
   private eat.a ch;
   private final eat.d ci;
   private final eah<cib.a> cj;
   private final bso ck = new bso(1);
   @Nullable
   private jh cl;
   private long cm;
   private float cn;
   private float co;
   private float cp;
   private float cq;
   private float cr;

   public cib(bup<? extends cib> $$0, dff $$1) {
      super($$0, $$1);
      this.bP = new cbc(this, 20, true);
      this.a_(this.fQ());
      this.ci = new cib.b();
      this.ch = new eat.a();
      this.cg = new eah<>(new eat.b(this));
      this.cj = new eah<>(new cib.a(this.ci.b(), eak.E.a().a()));
   }

   @Override
   protected bwg.b<cib> ef() {
      return bwg.a(c, b);
   }

   @Override
   protected bwg<?> a(Dynamic<?> $$0) {
      return cic.a(this.ef().a($$0));
   }

   @Override
   public bwg<cib> ee() {
      return (bwg<cib>)super.ee();
   }

   public static bwl.a q() {
      return bvg.E().a(bwm.s, 20.0).a(bwm.l, 0.1F).a(bwm.v, 0.1F).a(bwm.c, 2.0);
   }

   @Override
   protected ceq b(dff $$0) {
      ceo $$1 = new ceo(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      $$1.a(48.0F);
      return $$1;
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(ce, false);
      $$0.a(cf, true);
   }

   @Override
   public void a_(ezr $$0) {
      if (this.dk()) {
         if (this.bl()) {
            this.a(0.02F, $$0);
            this.a(bvi.a, this.dB());
            this.h(this.dB().c(0.8F));
         } else if (this.bz()) {
            this.a(0.02F, $$0);
            this.a(bvi.a, this.dB());
            this.h(this.dB().c(0.5));
         } else {
            this.a(this.fs(), $$0);
            this.a(bvi.a, this.dB());
            this.h(this.dB().c(0.91F));
         }
      }
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
      if ($$0.d() instanceof cor $$2) {
         Optional<UUID> $$3 = this.ee().c(cei.aM);
         if ($$3.isPresent() && $$2.cI().equals($$3.get())) {
            return false;
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void b(jh $$0, dvo $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, dvo $$2, jh $$3) {
   }

   @Override
   protected awn w() {
      return this.d(buq.a) ? awo.a : awo.b;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.d;
   }

   @Override
   protected awn o_() {
      return awo.c;
   }

   @Override
   protected float fj() {
      return 0.4F;
   }

   @Override
   protected void ac() {
      bor $$0 = boq.a();
      $$0.a("allayBrain");
      this.ee().a((arq)this.dY(), this);
      $$0.c();
      $$0.a("allayActivityUpdate");
      cic.a(this);
      $$0.c();
      super.ac();
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dY().C && this.bN() && this.ag % 10 == 0) {
         this.c(1.0F);
      }

      if (this.gv() && this.gA() && this.ag % 20 == 0) {
         this.x(false);
         this.cl = null;
      }

      this.gB();
   }

   @Override
   public void l() {
      super.l();
      if (this.dY().C) {
         this.co = this.cn;
         if (this.t()) {
            this.cn = azn.a(this.cn + 1.0F, 0.0F, 5.0F);
         } else {
            this.cn = azn.a(this.cn - 1.0F, 0.0F, 5.0F);
         }

         if (this.gv()) {
            this.cp++;
            this.cr = this.cq;
            if (this.gw()) {
               this.cq++;
            } else {
               this.cq--;
            }

            this.cq = azn.a(this.cq, 0.0F, 15.0F);
         } else {
            this.cp = 0.0F;
            this.cq = 0.0F;
            this.cr = 0.0F;
         }
      } else {
         eat.c.a(this.dY(), this.ch, this.ci);
         if (this.gs()) {
            this.x(false);
         }
      }
   }

   @Override
   public boolean fQ() {
      return !this.gz() && this.t();
   }

   public boolean t() {
      return !this.b(bsg.a).f();
   }

   @Override
   protected boolean f(buq $$0) {
      return false;
   }

   private boolean gz() {
      return this.ee().a(cei.aP, cej.a);
   }

   @Override
   protected bsh b(cor $$0, bsg $$1) {
      cwf $$2 = $$0.b($$1);
      cwf $$3 = this.b(bsg.a);
      if (this.gv() && $$2.a(axm.X) && this.gE()) {
         this.gC();
         this.dY().a(this, (byte)18);
         this.dY().a($$0, this, awo.E, awp.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bsh.a;
      } else if ($$3.f() && !$$2.f()) {
         cwf $$4 = $$2.c(1);
         this.a(bsg.a, $$4);
         this.a($$0, $$2);
         this.dY().a($$0, this, awo.e, awp.g, 2.0F, 1.0F);
         this.ee().a(cei.aM, $$0.cI());
         return bsh.a;
      } else if (!$$3.f() && $$1 == bsg.a && $$2.f()) {
         this.a(buq.a, cwf.k);
         this.dY().a($$0, this, awo.f, awp.g, 2.0F, 1.0F);
         this.a(bsg.a);

         for (cwf $$5 : this.y().f()) {
            bwz.a(this, $$5, this.dw());
         }

         this.ee().b(cei.aM);
         $$0.i($$3);
         return bsh.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(jh $$0, boolean $$1) {
      if ($$1) {
         if (!this.gv()) {
            this.cl = $$0;
            this.x(true);
         }
      } else if ($$0.equals(this.cl) || this.cl == null) {
         this.cl = null;
         this.x(false);
      }
   }

   @Override
   public bso y() {
      return this.ck;
   }

   @Override
   protected kl Y() {
      return bY;
   }

   @Override
   public boolean i(cwf $$0) {
      cwf $$1 = this.b(bsg.a);
      return !$$1.f() && this.dY().ac().b(dfb.c) && this.ck.c($$0) && this.c($$1, $$0);
   }

   private boolean c(cwf $$0, cwf $$1) {
      return cwf.b($$0, $$1) && !this.d($$0, $$1);
   }

   private boolean d(cwf $$0, cwf $$1) {
      cye $$2 = $$0.a(ku.Q);
      cye $$3 = $$1.a(ku.Q);
      return !Objects.equals($$2, $$3);
   }

   @Override
   protected void b(ckz $$0) {
      coa.a(this, this, $$0);
   }

   @Override
   protected void ab() {
      super.ab();
      agv.a(this);
   }

   @Override
   public boolean bc() {
      return !this.aL();
   }

   @Override
   public void a(BiConsumer<eah<?>, arq> $$0) {
      if (this.dY() instanceof arq $$1) {
         $$0.accept(this.cg, $$1);
         $$0.accept(this.cj, $$1);
      }
   }

   public boolean gv() {
      return this.am.a(ce);
   }

   public void x(boolean $$0) {
      if (!this.dY().C && this.dl() && (!$$0 || !this.gs())) {
         this.am.a(ce, $$0);
      }
   }

   private boolean gA() {
      return this.cl == null || !this.cl.a(this.dw(), (double)eak.E.a().a()) || !this.dY().a_(this.cl).a(dil.dT);
   }

   public float J(float $$0) {
      return azn.h($$0, this.co, this.cn) / 5.0F;
   }

   public boolean gw() {
      float $$0 = this.cp % 55.0F;
      return $$0 < 15.0F;
   }

   public float K(float $$0) {
      return azn.h($$0, this.cr, this.cq) / 15.0F;
   }

   @Override
   public boolean a(cwf $$0, cwf $$1) {
      return !this.c($$0, $$1);
   }

   @Override
   protected void eK() {
      super.eK();
      this.ck.f().forEach(this::b);
      cwf $$0 = this.a(buq.a);
      if (!$$0.f() && !dby.a($$0, dbx.D)) {
         this.b($$0);
         this.a(buq.a, cwf.k);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      this.b($$0, this.ea());
      alj<vk> $$1 = this.ea().a(vb.a);
      eat.a.a
         .encodeStart($$1, this.ch)
         .resultOrPartial($$0x -> e.error("Failed to encode vibration listener for Allay: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
      $$0.a("DuplicationCooldown", this.cm);
      $$0.a("CanDuplicate", this.gE());
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      this.a($$0, this.ea());
      alj<vk> $$1 = this.ea().a(vb.a);
      if ($$0.b("listener", 10)) {
         eat.a.a
            .parse($$1, $$0.p("listener"))
            .resultOrPartial($$0x -> e.error("Failed to parse vibration listener for Allay: '{}'", $$0x))
            .ifPresent($$0x -> this.ch = $$0x);
      }

      this.cm = (long)$$0.h("DuplicationCooldown");
      this.am.a(cf, $$0.q("CanDuplicate"));
   }

   @Override
   protected boolean gt() {
      return false;
   }

   private void gB() {
      if (this.cm > 0L) {
         this.cm--;
      }

      if (!this.dY().y_() && this.cm == 0L && !this.gE()) {
         this.am.a(cf, true);
      }
   }

   private void gC() {
      cib $$0 = bup.a.a(this.dY(), buo.e);
      if ($$0 != null) {
         $$0.e(this.dw());
         $$0.gb();
         $$0.gD();
         this.gD();
         this.dY().b($$0);
      }
   }

   private void gD() {
      this.cm = 6000L;
      this.am.a(cf, false);
   }

   private boolean gE() {
      return this.am.a(cf);
   }

   private void a(cor $$0, cwf $$1) {
      $$1.a(1, $$0);
   }

   @Override
   public ezr cV() {
      return new ezr(0.0, (double)this.cU() * 0.6, (double)this.dt() * 0.1);
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
      this.dY().a(ls.Q, this.d(1.0), this.dG() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public eat.a gx() {
      return this.ch;
   }

   @Override
   public eat.d gy() {
      return this.ci;
   }

   class a implements eam {
      private final eao b;
      private final int c;

      public a(final eao $$0, final int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public eao a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(arq $$0, jq<eak> $$1, eak.a $$2, ezr $$3) {
         if ($$1.a(eak.E)) {
            cib.this.b(jh.a((ka)$$3), true);
            return true;
         } else if ($$1.a(eak.F)) {
            cib.this.b(jh.a((ka)$$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements eat.d {
      private static final int b = 16;
      private final eao c = new eai(cib.this, cib.this.cU());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public eao b() {
         return this.c;
      }

      @Override
      public boolean a(arq $$0, jh $$1, jq<eak> $$2, eak.a $$3) {
         if (cib.this.gi()) {
            return false;
         } else {
            Optional<jp> $$4 = cib.this.ee().c(cei.aN);
            if ($$4.isEmpty()) {
               return true;
            } else {
               jp $$5 = $$4.get();
               return $$5.a().equals($$0.ag()) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(arq $$0, jh $$1, jq<eak> $$2, @Nullable bui $$3, @Nullable bui $$4, float $$5) {
         if ($$2.a(eak.H)) {
            cic.a(cib.this, new jh($$1));
         }
      }

      @Override
      public axt<eak> c() {
         return axk.e;
      }
   }
}
