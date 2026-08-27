import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;

public class bsp extends bgi implements bxz, dgu {
   private static final Logger e = LogUtils.getLogger();
   private static final hz bT = new hz(1, 1, 1);
   private static final int bU = 5;
   private static final float bV = 55.0F;
   private static final float bW = 15.0F;
   private static final ciz bX = ciz.a(cgc.nO);
   private static final int bY = 6000;
   private static final int bZ = 3;
   private static final double ca = 0.4;
   private static final aby<Boolean> cb = acb.a(bsp.class, aca.k);
   private static final aby<Boolean> cc = acb.a(bsp.class, aca.k);
   protected static final ImmutableList<bqg<? extends bqf<? super bsp>>> b = ImmutableList.of(bqg.c, bqg.d, bqg.f, bqg.b);
   protected static final ImmutableList<bpb<?>> c = ImmutableList.of(
      bpb.t, bpb.n, bpb.h, bpb.m, bpb.E, bpb.x, bpb.K, bpb.aL, bpb.aM, bpb.aN, bpb.aO, bpb.Y, new bpb[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final dgi<dgu.b> cd;
   private dgu.a ce;
   private final dgu.d cf;
   private final dgi<bsp.a> cg;
   private final bee ch = new bee(1);
   @Nullable
   private gu ci;
   private long cj;
   private float ck;
   private float cl;
   private float cm;
   private float cn;
   private float co;

   public bsp(bfn<? extends bsp> $$0, cmm $$1) {
      super($$0, $$1);
      this.bL = new blv(this, 20, true);
      this.s(this.fG());
      this.cf = new bsp.b();
      this.ce = new dgu.a();
      this.cd = new dgi<>(new dgu.b(this));
      this.cg = new dgi<>(new bsp.a(this.cf.b(), dgl.F.b()));
   }

   @Override
   protected bha.b<bsp> dL() {
      return bha.a(c, b);
   }

   @Override
   protected bha<?> a(Dynamic<?> $$0) {
      return bsq.a(this.dL().a($$0));
   }

   @Override
   public bha<bsp> dK() {
      return (bha<bsp>)super.dK();
   }

   public static bhf.a q() {
      return bgb.y().a(bhg.a, 20.0).a(bhg.e, 0.1F).a(bhg.d, 0.1F).a(bhg.f, 2.0).a(bhg.b, 48.0);
   }

   @Override
   protected bpj b(cmm $$0) {
      bph $$1 = new bph(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void a_() {
      super.a_();
      this.am.a(cb, false);
      this.am.a(cc, true);
   }

   @Override
   public void h(eei $$0) {
      if (this.cU()) {
         if (this.aV()) {
            this.a(0.02F, $$0);
            this.a(bgf.a, this.dl());
            this.f(this.dl().a(0.8F));
         } else if (this.bi()) {
            this.a(0.02F, $$0);
            this.a(bgf.a, this.dl());
            this.f(this.dl().a(0.5));
         } else {
            this.a(this.fa(), $$0);
            this.a(bgf.a, this.dl());
            this.f(this.dl().a(0.91F));
         }
      }

      this.q(false);
   }

   @Override
   protected float b(bgl $$0, bfk $$1) {
      return $$1.b * 0.6F;
   }

   @Override
   public boolean a(ben $$0, float $$1) {
      if ($$0.d() instanceof byo $$2) {
         Optional<UUID> $$3 = this.dK().c(bpb.aL);
         if ($$3.isPresent() && $$2.ct().equals($$3.get())) {
            return false;
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void b(gu $$0, dcb $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, dcb $$2, gu $$3) {
   }

   @Override
   protected amg s() {
      return this.b(bfo.a) ? amh.a : amh.b;
   }

   @Override
   protected amg d(ben $$0) {
      return amh.d;
   }

   @Override
   protected amg g_() {
      return amh.c;
   }

   @Override
   protected float eR() {
      return 0.4F;
   }

   @Override
   protected void W() {
      this.dI().ad().a("allayBrain");
      this.dK().a((aif)this.dI(), this);
      this.dI().ad().c();
      this.dI().ad().a("allayActivityUpdate");
      bsq.a(this);
      this.dI().ad().c();
      super.W();
   }

   @Override
   public void b_() {
      super.b_();
      if (!this.dI().B && this.bs() && this.ag % 10 == 0) {
         this.s(1.0F);
      }

      if (this.fY() && this.ge() && this.ag % 20 == 0) {
         this.w(false);
         this.ci = null;
      }

      this.gf();
   }

   @Override
   public void l() {
      super.l();
      if (this.dI().B) {
         this.cl = this.ck;
         if (this.r()) {
            this.ck = apa.a(this.ck + 1.0F, 0.0F, 5.0F);
         } else {
            this.ck = apa.a(this.ck - 1.0F, 0.0F, 5.0F);
         }

         if (this.fY()) {
            this.cm++;
            this.co = this.cn;
            if (this.ga()) {
               this.cn++;
            } else {
               this.cn--;
            }

            this.cn = apa.a(this.cn, 0.0F, 15.0F);
         } else {
            this.cm = 0.0F;
            this.cn = 0.0F;
            this.co = 0.0F;
         }
      } else {
         dgu.c.a(this.dI(), this.ce, this.cf);
         if (this.fZ()) {
            this.w(false);
         }
      }
   }

   @Override
   public boolean fG() {
      return !this.gd() && this.r();
   }

   public boolean r() {
      return !this.b(bdw.a).b();
   }

   @Override
   public boolean f(cfz $$0) {
      return false;
   }

   private boolean gd() {
      return this.dK().a(bpb.aO, bpc.a);
   }

   @Override
   protected bdx b(byo $$0, bdw $$1) {
      cfz $$2 = $$0.b($$1);
      cfz $$3 = this.b(bdw.a);
      if (this.fY() && this.l($$2) && this.gi()) {
         this.gg();
         this.dI().a(this, (byte)18);
         this.dI().a($$0, this, amh.E, ami.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bdx.a;
      } else if ($$3.b() && !$$2.b()) {
         cfz $$4 = $$2.c(1);
         this.a(bdw.a, $$4);
         this.a($$0, $$2);
         this.dI().a($$0, this, amh.e, ami.g, 2.0F, 1.0F);
         this.dK().a(bpb.aL, $$0.ct());
         return bdx.a;
      } else if (!$$3.b() && $$1 == bdw.a && $$2.b()) {
         this.a(bfo.a, cfz.b);
         this.dI().a($$0, this, amh.f, ami.g, 2.0F, 1.0F);
         this.a(bdw.a);

         for (cfz $$5 : this.w().f()) {
            bht.a(this, $$5, this.dg());
         }

         this.dK().b(bpb.aL);
         $$0.i($$3);
         return bdx.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(gu $$0, boolean $$1) {
      if ($$1) {
         if (!this.fY()) {
            this.ci = $$0;
            this.w(true);
         }
      } else if ($$0.equals(this.ci) || this.ci == null) {
         this.ci = null;
         this.w(false);
      }
   }

   @Override
   public bee w() {
      return this.ch;
   }

   @Override
   protected hz R() {
      return bT;
   }

   @Override
   public boolean k(cfz $$0) {
      cfz $$1 = this.b(bdw.a);
      return !$$1.b() && this.dI().X().b(cmi.c) && this.ch.b($$0) && this.d($$1, $$0);
   }

   private boolean d(cfz $$0, cfz $$1) {
      return cfz.b($$0, $$1) && !this.e($$0, $$1);
   }

   private boolean e(cfz $$0, cfz $$1) {
      qr $$2 = $$0.v();
      boolean $$3 = $$2 != null && $$2.e("Potion");
      if (!$$3) {
         return false;
      } else {
         qr $$4 = $$1.v();
         boolean $$5 = $$4 != null && $$4.e("Potion");
         if (!$$5) {
            return true;
         } else {
            rk $$6 = $$2.c("Potion");
            rk $$7 = $$4.c("Potion");
            return $$6 != null && $$7 != null && !$$6.equals($$7);
         }
      }
   }

   @Override
   protected void b(bvh $$0) {
      bxz.a(this, this, $$0);
   }

   @Override
   protected void V() {
      super.V();
      za.a(this);
   }

   @Override
   public boolean aP() {
      return !this.ay();
   }

   @Override
   public void a(BiConsumer<dgi<?>, aif> $$0) {
      if (this.dI() instanceof aif $$1) {
         $$0.accept(this.cd, $$1);
         $$0.accept(this.cg, $$1);
      }
   }

   public boolean fY() {
      return this.am.b(cb);
   }

   public boolean fZ() {
      return this.bA.c(bpb.Y).isPresent();
   }

   public void w(boolean $$0) {
      if (!this.dI().B && this.cV() && (!$$0 || !this.fZ())) {
         this.am.b(cb, $$0);
      }
   }

   private boolean ge() {
      return this.ci == null || !this.ci.a(this.dg(), (double)dgl.F.b()) || !this.dI().a_(this.ci).a(cpo.dT);
   }

   public float D(float $$0) {
      return apa.i($$0, this.cl, this.ck) / 5.0F;
   }

   public boolean ga() {
      float $$0 = this.cm % 55.0F;
      return $$0 < 15.0F;
   }

   public float E(float $$0) {
      return apa.i($$0, this.co, this.cn) / 15.0F;
   }

   @Override
   public boolean a(cfz $$0, cfz $$1) {
      return !this.d($$0, $$1);
   }

   @Override
   protected void eu() {
      super.eu();
      this.ch.f().forEach(this::b);
      cfz $$0 = this.c(bfo.a);
      if (!$$0.b() && !cki.e($$0)) {
         this.b($$0);
         this.a(bfo.a, cfz.b);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      this.a_($$0);
      dgu.a.a.encodeStart(rc.a, this.ce).resultOrPartial(e::error).ifPresent($$1 -> $$0.a("listener", $$1));
      $$0.a("DuplicationCooldown", this.cj);
      $$0.a("CanDuplicate", this.gi());
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.c($$0);
      if ($$0.b("listener", 10)) {
         dgu.a.a.parse(new Dynamic(rc.a, $$0.p("listener"))).resultOrPartial(e::error).ifPresent($$0x -> this.ce = $$0x);
      }

      this.cj = (long)$$0.h("DuplicationCooldown");
      this.am.b(cc, $$0.q("CanDuplicate"));
   }

   @Override
   protected boolean fW() {
      return false;
   }

   private void gf() {
      if (this.cj > 0L) {
         this.cj--;
      }

      if (!this.dI().r_() && this.cj == 0L && !this.gi()) {
         this.am.b(cc, true);
      }
   }

   private boolean l(cfz $$0) {
      return bX.a($$0);
   }

   private void gg() {
      bsp $$0 = bfn.b.a(this.dI());
      if ($$0 != null) {
         $$0.d(this.dg());
         $$0.fF();
         $$0.gh();
         this.gh();
         this.dI().b($$0);
      }
   }

   private void gh() {
      this.cj = 6000L;
      this.am.b(cc, false);
   }

   private boolean gi() {
      return this.am.b(cc);
   }

   private void a(byo $$0, cfz $$1) {
      if (!$$0.fO().d) {
         $$1.h(1);
      }
   }

   @Override
   public eei cG() {
      return new eei(0.0, (double)this.cF() * 0.6, (double)this.dd() * 0.1);
   }

   @Override
   public double bw() {
      return 0.4;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 3; $$1++) {
            this.gj();
         }
      } else {
         super.b($$0);
      }
   }

   private void gj() {
      double $$0 = this.af.k() * 0.02;
      double $$1 = this.af.k() * 0.02;
      double $$2 = this.af.k() * 0.02;
      this.dI().a(iv.M, this.d(1.0), this.dq() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public dgu.a gb() {
      return this.ce;
   }

   @Override
   public dgu.d gc() {
      return this.cf;
   }

   class a implements dgn {
      private final dgp b;
      private final int c;

      public a(dgp $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public dgp a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(aif $$0, dgl $$1, dgl.a $$2, eei $$3) {
         if ($$1 == dgl.F) {
            bsp.this.b(gu.a($$3), true);
            return true;
         } else if ($$1 == dgl.G) {
            bsp.this.b(gu.a($$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements dgu.d {
      private static final int b = 16;
      private final dgp c = new dgj(bsp.this, bsp.this.cF());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dgp b() {
         return this.c;
      }

      @Override
      public boolean a(aif $$0, gu $$1, dgl $$2, dgl.a $$3) {
         if (bsp.this.fQ()) {
            return false;
         } else {
            Optional<hd> $$4 = bsp.this.dK().c(bpb.aM);
            if ($$4.isEmpty()) {
               return true;
            } else {
               hd $$5 = $$4.get();
               return $$5.a().equals($$0.ac()) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(aif $$0, gu $$1, dgl $$2, @Nullable bfj $$3, @Nullable bfj $$4, float $$5) {
         if ($$2 == dgl.I) {
            bsq.a(bsp.this, new gu($$1));
         }
      }

      @Override
      public anl<dgl> c() {
         return anc.e;
      }
   }
}
