import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bxn extends blh implements ccx, dlp {
   private static final Logger e = LogUtils.getLogger();
   private static final iw bT = new iw(1, 1, 1);
   private static final int bU = 5;
   private static final float bV = 55.0F;
   private static final float bW = 15.0F;
   private static final coc bX = coc.a(cle.nO);
   private static final int bY = 6000;
   private static final int bZ = 3;
   private static final afm<Boolean> ca = afp.a(bxn.class, afo.k);
   private static final afm<Boolean> cb = afp.a(bxn.class, afo.k);
   protected static final ImmutableList<bve<? extends bvd<? super bxn>>> b = ImmutableList.of(bve.c, bve.d, bve.f, bve.b);
   protected static final ImmutableList<btz<?>> c = ImmutableList.of(
      btz.t, btz.n, btz.h, btz.m, btz.E, btz.x, btz.K, btz.aL, btz.aM, btz.aN, btz.aO, btz.Y, new btz[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final dld<dlp.b> cc;
   private dlp.a cd;
   private final dlp.d ce;
   private final dld<bxn.a> cf;
   private final bix cg = new bix(1);
   @Nullable
   private ht ch;
   private long ci;
   private float cj;
   private float ck;
   private float cl;
   private float cm;
   private float cn;

   public bxn(bkm<? extends bxn> $$0, crs $$1) {
      super($$0, $$1);
      this.bL = new bqt(this, 20, true);
      this.s(this.fK());
      this.ce = new bxn.b();
      this.cd = new dlp.a();
      this.cc = new dld<>(new dlp.b(this));
      this.cf = new dld<>(new bxn.a(this.ce.b(), dlg.E.a()));
   }

   @Override
   protected bly.b<bxn> dO() {
      return bly.a(c, b);
   }

   @Override
   protected bly<?> a(Dynamic<?> $$0) {
      return bxo.a(this.dO().a($$0));
   }

   @Override
   public bly<bxn> dN() {
      return (bly<bxn>)super.dN();
   }

   public static bmd.a s() {
      return bla.A().a(bme.l, 20.0).a(bme.f, 0.1F).a(bme.m, 0.1F).a(bme.c, 2.0).a(bme.g, 48.0);
   }

   @Override
   protected buh b(crs $$0) {
      buf $$1 = new buf(this, $$0);
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
   public void h(eji $$0) {
      if (this.cW()) {
         if (this.aX()) {
            this.a(0.02F, $$0);
            this.a(ble.a, this.do());
            this.f(this.do().a(0.8F));
         } else if (this.bl()) {
            this.a(0.02F, $$0);
            this.a(ble.a, this.do());
            this.f(this.do().a(0.5));
         } else {
            this.a(this.fe(), $$0);
            this.a(ble.a, this.do());
            this.f(this.do().a(0.91F));
         }
      }

      this.q(false);
   }

   @Override
   protected float b(blk $$0, bkj $$1) {
      return $$1.b * 0.6F;
   }

   @Override
   public boolean a(bjg $$0, float $$1) {
      if ($$0.d() instanceof cdm $$2) {
         Optional<UUID> $$3 = this.dN().c(btz.aL);
         if ($$3.isPresent() && $$2.cv().equals($$3.get())) {
            return false;
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void b(ht $$0, dgw $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, dgw $$2, ht $$3) {
   }

   @Override
   protected aqm w() {
      return this.b(bkn.a) ? aqn.a : aqn.b;
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.d;
   }

   @Override
   protected aqm m_() {
      return aqn.c;
   }

   @Override
   protected float eV() {
      return 0.4F;
   }

   @Override
   protected void X() {
      this.dL().ad().a("allayBrain");
      this.dN().a((ama)this.dL(), this);
      this.dL().ad().c();
      this.dL().ad().a("allayActivityUpdate");
      bxo.a(this);
      this.dL().ad().c();
      super.X();
   }

   @Override
   public void c_() {
      super.c_();
      if (!this.dL().B && this.bv() && this.ah % 10 == 0) {
         this.b(1.0F);
      }

      if (this.ge() && this.gj() && this.ah % 20 == 0) {
         this.w(false);
         this.ch = null;
      }

      this.gk();
   }

   @Override
   public void l() {
      super.l();
      if (this.dL().B) {
         this.ck = this.cj;
         if (this.t()) {
            this.cj = ati.a(this.cj + 1.0F, 0.0F, 5.0F);
         } else {
            this.cj = ati.a(this.cj - 1.0F, 0.0F, 5.0F);
         }

         if (this.ge()) {
            this.cl++;
            this.cn = this.cm;
            if (this.gf()) {
               this.cm++;
            } else {
               this.cm--;
            }

            this.cm = ati.a(this.cm, 0.0F, 15.0F);
         } else {
            this.cl = 0.0F;
            this.cm = 0.0F;
            this.cn = 0.0F;
         }
      } else {
         dlp.c.a(this.dL(), this.cd, this.ce);
         if (this.gb()) {
            this.w(false);
         }
      }
   }

   @Override
   public boolean fK() {
      return !this.gi() && this.t();
   }

   public boolean t() {
      return !this.b(bip.a).b();
   }

   @Override
   public boolean f(clb $$0) {
      return false;
   }

   private boolean gi() {
      return this.dN().a(btz.aO, bua.a);
   }

   @Override
   protected biq b(cdm $$0, bip $$1) {
      clb $$2 = $$0.b($$1);
      clb $$3 = this.b(bip.a);
      if (this.ge() && this.l($$2) && this.gn()) {
         this.gl();
         this.dL().a(this, (byte)18);
         this.dL().a($$0, this, aqn.E, aqo.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return biq.a;
      } else if ($$3.b() && !$$2.b()) {
         clb $$4 = $$2.c(1);
         this.a(bip.a, $$4);
         this.a($$0, $$2);
         this.dL().a($$0, this, aqn.e, aqo.g, 2.0F, 1.0F);
         this.dN().a(btz.aL, $$0.cv());
         return biq.a;
      } else if (!$$3.b() && $$1 == bip.a && $$2.b()) {
         this.a(bkn.a, clb.b);
         this.dL().a($$0, this, aqn.f, aqo.g, 2.0F, 1.0F);
         this.a(bip.a);

         for (clb $$5 : this.y().f()) {
            bmr.a(this, $$5, this.dj());
         }

         this.dN().b(btz.aL);
         $$0.i($$3);
         return biq.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(ht $$0, boolean $$1) {
      if ($$1) {
         if (!this.ge()) {
            this.ch = $$0;
            this.w(true);
         }
      } else if ($$0.equals(this.ch) || this.ch == null) {
         this.ch = null;
         this.w(false);
      }
   }

   @Override
   public bix y() {
      return this.cg;
   }

   @Override
   protected iw T() {
      return bT;
   }

   @Override
   public boolean k(clb $$0) {
      clb $$1 = this.b(bip.a);
      return !$$1.b() && this.dL().X().b(cro.c) && this.cg.b($$0) && this.d($$1, $$0);
   }

   private boolean d(clb $$0, clb $$1) {
      return clb.b($$0, $$1) && !this.e($$0, $$1);
   }

   private boolean e(clb $$0, clb $$1) {
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
   protected void b(caf $$0) {
      ccx.a(this, this, $$0);
   }

   @Override
   protected void W() {
      super.W();
      aci.a(this);
   }

   @Override
   public boolean aR() {
      return !this.aA();
   }

   @Override
   public void a(BiConsumer<dld<?>, ama> $$0) {
      if (this.dL() instanceof ama $$1) {
         $$0.accept(this.cc, $$1);
         $$0.accept(this.cf, $$1);
      }
   }

   public boolean ge() {
      return this.an.b(ca);
   }

   public void w(boolean $$0) {
      if (!this.dL().B && this.cX() && (!$$0 || !this.gb())) {
         this.an.b(ca, $$0);
      }
   }

   private boolean gj() {
      return this.ch == null || !this.ch.a(this.dj(), (double)dlg.E.a()) || !this.dL().a_(this.ch).a(cuv.dT);
   }

   public float E(float $$0) {
      return ati.i($$0, this.ck, this.cj) / 5.0F;
   }

   public boolean gf() {
      float $$0 = this.cl % 55.0F;
      return $$0 < 15.0F;
   }

   public float F(float $$0) {
      return ati.i($$0, this.cn, this.cm) / 15.0F;
   }

   @Override
   public boolean a(clb $$0, clb $$1) {
      return !this.d($$0, $$1);
   }

   @Override
   protected void ex() {
      super.ex();
      this.cg.f().forEach(this::b);
      clb $$0 = this.c(bkn.a);
      if (!$$0.b() && !cpo.e($$0)) {
         this.b($$0);
         this.a(bkn.a, clb.b);
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
      dlp.a.a.encodeStart(sn.a, this.cd).resultOrPartial(e::error).ifPresent($$1 -> $$0.a("listener", $$1));
      $$0.a("DuplicationCooldown", this.ci);
      $$0.a("CanDuplicate", this.gn());
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.c($$0);
      if ($$0.b("listener", 10)) {
         dlp.a.a.parse(new Dynamic(sn.a, $$0.p("listener"))).resultOrPartial(e::error).ifPresent($$0x -> this.cd = $$0x);
      }

      this.ci = (long)$$0.h("DuplicationCooldown");
      this.an.b(cb, $$0.q("CanDuplicate"));
   }

   @Override
   protected boolean gc() {
      return false;
   }

   private void gk() {
      if (this.ci > 0L) {
         this.ci--;
      }

      if (!this.dL().x_() && this.ci == 0L && !this.gn()) {
         this.an.b(cb, true);
      }
   }

   private boolean l(clb $$0) {
      return bX.a($$0);
   }

   private void gl() {
      bxn $$0 = bkm.b.a(this.dL());
      if ($$0 != null) {
         $$0.d(this.dj());
         $$0.fJ();
         $$0.gm();
         this.gm();
         this.dL().b($$0);
      }
   }

   private void gm() {
      this.ci = 6000L;
      this.an.b(cb, false);
   }

   private boolean gn() {
      return this.an.b(cb);
   }

   private void a(cdm $$0, clb $$1) {
      if (!$$0.fT().d) {
         $$1.h(1);
      }
   }

   @Override
   public eji cI() {
      return new eji(0.0, (double)this.cH() * 0.6, (double)this.df() * 0.1);
   }

   @Override
   protected float l(bki $$0) {
      return 0.04F;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 3; $$1++) {
            this.go();
         }
      } else {
         super.b($$0);
      }
   }

   private void go() {
      double $$0 = this.ag.k() * 0.02;
      double $$1 = this.ag.k() * 0.02;
      double $$2 = this.ag.k() * 0.02;
      this.dL().a(js.M, this.d(1.0), this.dt() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public dlp.a gg() {
      return this.cd;
   }

   @Override
   public dlp.d gh() {
      return this.ce;
   }

   class a implements dli {
      private final dlk b;
      private final int c;

      public a(dlk $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public dlk a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(ama $$0, dlg $$1, dlg.a $$2, eji $$3) {
         if ($$1 == dlg.E) {
            bxn.this.b(ht.a($$3), true);
            return true;
         } else if ($$1 == dlg.F) {
            bxn.this.b(ht.a($$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements dlp.d {
      private static final int b = 16;
      private final dlk c = new dle(bxn.this, bxn.this.cH());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dlk b() {
         return this.c;
      }

      @Override
      public boolean a(ama $$0, ht $$1, dlg $$2, dlg.a $$3) {
         if (bxn.this.fU()) {
            return false;
         } else {
            Optional<ia> $$4 = bxn.this.dN().c(btz.aM);
            if ($$4.isEmpty()) {
               return true;
            } else {
               ia $$5 = $$4.get();
               return $$5.a().equals($$0.ac()) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(ama $$0, ht $$1, dlg $$2, @Nullable bki $$3, @Nullable bki $$4, float $$5) {
         if ($$2 == dlg.H) {
            bxo.a(bxn.this, new ht($$1));
         }
      }

      @Override
      public arr<dlg> c() {
         return ari.e;
      }
   }
}
