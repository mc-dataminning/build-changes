import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bzb extends bmt implements ces, dnz {
   private static final Logger e = LogUtils.getLogger();
   private static final jb bT = new jb(1, 1, 1);
   private static final int bU = 5;
   private static final float bV = 55.0F;
   private static final float bW = 15.0F;
   private static final cpy bX = cpy.a(cna.oz);
   private static final int bY = 6000;
   private static final int bZ = 3;
   private static final agm<Boolean> ca = agp.a(bzb.class, ago.k);
   private static final agm<Boolean> cb = agp.a(bzb.class, ago.k);
   protected static final ImmutableList<bws<? extends bwr<? super bzb>>> b = ImmutableList.of(bws.c, bws.d, bws.f, bws.b);
   protected static final ImmutableList<bvm<?>> c = ImmutableList.of(
      bvm.t, bvm.n, bvm.h, bvm.m, bvm.E, bvm.x, bvm.K, bvm.aL, bvm.aM, bvm.aN, bvm.aO, bvm.Y, new bvm[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final dnn<dnz.b> cc;
   private dnz.a cd;
   private final dnz.d ce;
   private final dnn<bzb.a> cf;
   private final bki cg = new bki(1);
   @Nullable
   private hx ch;
   private long ci;
   private float cj;
   private float ck;
   private float cl;
   private float cm;
   private float cn;

   public bzb(bly<? extends bzb> $$0, cto $$1) {
      super($$0, $$1);
      this.bL = new bsg(this, 20, true);
      this.s(this.fK());
      this.ce = new bzb.b();
      this.cd = new dnz.a();
      this.cc = new dnn<>(new dnz.b(this));
      this.cf = new dnn<>(new bzb.a(this.ce.b(), dnq.E.a()));
   }

   @Override
   protected bnk.b<bzb> dP() {
      return bnk.a(c, b);
   }

   @Override
   protected bnk<?> a(Dynamic<?> $$0) {
      return bzc.a(this.dP().a($$0));
   }

   @Override
   public bnk<bzb> dO() {
      return (bnk<bzb>)super.dO();
   }

   public static bnp.a u() {
      return bmm.C().a(bnq.l, 20.0).a(bnq.f, 0.1F).a(bnq.m, 0.1F).a(bnq.c, 2.0).a(bnq.g, 48.0);
   }

   @Override
   protected bvu b(cto $$0) {
      bvs $$1 = new bvs(this, $$0);
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
   public void a(els $$0) {
      if (this.cX()) {
         if (this.aZ()) {
            this.a(0.02F, $$0);
            this.a(bmq.a, this.dp());
            this.g(this.dp().a(0.8F));
         } else if (this.bn()) {
            this.a(0.02F, $$0);
            this.a(bmq.a, this.dp());
            this.g(this.dp().a(0.5));
         } else {
            this.a(this.ff(), $$0);
            this.a(bmq.a, this.dp());
            this.g(this.dp().a(0.91F));
         }
      }

      this.q(false);
   }

   @Override
   protected float b(bmw $$0, blv $$1) {
      return $$1.b * 0.6F;
   }

   @Override
   public boolean a(bks $$0, float $$1) {
      if ($$0.d() instanceof cfh $$2) {
         Optional<UUID> $$3 = this.dO().c(bvm.aL);
         if ($$3.isPresent() && $$2.cw().equals($$3.get())) {
            return false;
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void b(hx $$0, djg $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, djg $$2, hx $$3) {
   }

   @Override
   protected arq y() {
      return this.b(blz.a) ? arr.a : arr.b;
   }

   @Override
   protected arq d(bks $$0) {
      return arr.d;
   }

   @Override
   protected arq n_() {
      return arr.c;
   }

   @Override
   protected float eW() {
      return 0.4F;
   }

   @Override
   protected void Z() {
      this.dM().af().a("allayBrain");
      this.dO().a((and)this.dM(), this);
      this.dM().af().c();
      this.dM().af().a("allayActivityUpdate");
      bzc.a(this);
      this.dM().af().c();
      super.Z();
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dM().B && this.bx() && this.ah % 10 == 0) {
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
      if (this.dM().B) {
         this.ck = this.cj;
         if (this.w()) {
            this.cj = aun.a(this.cj + 1.0F, 0.0F, 5.0F);
         } else {
            this.cj = aun.a(this.cj - 1.0F, 0.0F, 5.0F);
         }

         if (this.ge()) {
            this.cl++;
            this.cn = this.cm;
            if (this.gf()) {
               this.cm++;
            } else {
               this.cm--;
            }

            this.cm = aun.a(this.cm, 0.0F, 15.0F);
         } else {
            this.cl = 0.0F;
            this.cm = 0.0F;
            this.cn = 0.0F;
         }
      } else {
         dnz.c.a(this.dM(), this.cd, this.ce);
         if (this.gb()) {
            this.w(false);
         }
      }
   }

   @Override
   public boolean fK() {
      return !this.gi() && this.w();
   }

   public boolean w() {
      return !this.b(bjz.a).b();
   }

   @Override
   public boolean f(cmx $$0) {
      return false;
   }

   private boolean gi() {
      return this.dO().a(bvm.aO, bvn.a);
   }

   @Override
   protected bka b(cfh $$0, bjz $$1) {
      cmx $$2 = $$0.b($$1);
      cmx $$3 = this.b(bjz.a);
      if (this.ge() && this.l($$2) && this.gn()) {
         this.gl();
         this.dM().a(this, (byte)18);
         this.dM().a($$0, this, arr.E, ars.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bka.a;
      } else if ($$3.b() && !$$2.b()) {
         cmx $$4 = $$2.c(1);
         this.a(bjz.a, $$4);
         this.a($$0, $$2);
         this.dM().a($$0, this, arr.e, ars.g, 2.0F, 1.0F);
         this.dO().a(bvm.aL, $$0.cw());
         return bka.a;
      } else if (!$$3.b() && $$1 == bjz.a && $$2.b()) {
         this.a(blz.a, cmx.f);
         this.dM().a($$0, this, arr.f, ars.g, 2.0F, 1.0F);
         this.a(bjz.a);

         for (cmx $$5 : this.A().f()) {
            bod.a(this, $$5, this.dk());
         }

         this.dO().b(bvm.aL);
         $$0.i($$3);
         return bka.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(hx $$0, boolean $$1) {
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
   public bki A() {
      return this.cg;
   }

   @Override
   protected jb V() {
      return bT;
   }

   @Override
   public boolean k(cmx $$0) {
      cmx $$1 = this.b(bjz.a);
      return !$$1.b() && this.dM().Z().b(ctk.c) && this.cg.b($$0) && this.d($$1, $$0);
   }

   private boolean d(cmx $$0, cmx $$1) {
      return cmx.b($$0, $$1) && !this.e($$0, $$1);
   }

   private boolean e(cmx $$0, cmx $$1) {
      sn $$2 = $$0.v();
      boolean $$3 = $$2 != null && $$2.e("Potion");
      if (!$$3) {
         return false;
      } else {
         sn $$4 = $$1.v();
         boolean $$5 = $$4 != null && $$4.e("Potion");
         if (!$$5) {
            return true;
         } else {
            tk $$6 = $$2.c("Potion");
            tk $$7 = $$4.c("Potion");
            return $$6 != null && $$7 != null && !$$6.equals($$7);
         }
      }
   }

   @Override
   protected void b(cbt $$0) {
      ces.a(this, this, $$0);
   }

   @Override
   protected void Y() {
      super.Y();
      adi.a(this);
   }

   @Override
   public boolean aT() {
      return !this.aC();
   }

   @Override
   public void a(BiConsumer<dnn<?>, and> $$0) {
      if (this.dM() instanceof and $$1) {
         $$0.accept(this.cc, $$1);
         $$0.accept(this.cf, $$1);
      }
   }

   public boolean ge() {
      return this.an.b(ca);
   }

   public void w(boolean $$0) {
      if (!this.dM().B && this.cY() && (!$$0 || !this.gb())) {
         this.an.b(ca, $$0);
      }
   }

   private boolean gj() {
      return this.ch == null || !this.ch.a(this.dk(), (double)dnq.E.a()) || !this.dM().a_(this.ch).a(cwr.dT);
   }

   public float E(float $$0) {
      return aun.i($$0, this.ck, this.cj) / 5.0F;
   }

   public boolean gf() {
      float $$0 = this.cl % 55.0F;
      return $$0 < 15.0F;
   }

   public float F(float $$0) {
      return aun.i($$0, this.cn, this.cm) / 15.0F;
   }

   @Override
   public boolean a(cmx $$0, cmx $$1) {
      return !this.d($$0, $$1);
   }

   @Override
   protected void ey() {
      super.ey();
      this.cg.f().forEach(this::b);
      cmx $$0 = this.c(blz.a);
      if (!$$0.b() && !crk.e($$0)) {
         this.b($$0);
         this.a(blz.a, cmx.f);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      this.a_($$0);
      dnz.a.a.encodeStart(tb.a, this.cd).resultOrPartial(e::error).ifPresent($$1 -> $$0.a("listener", $$1));
      $$0.a("DuplicationCooldown", this.ci);
      $$0.a("CanDuplicate", this.gn());
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.c($$0);
      if ($$0.b("listener", 10)) {
         dnz.a.a.parse(new Dynamic(tb.a, $$0.p("listener"))).resultOrPartial(e::error).ifPresent($$0x -> this.cd = $$0x);
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

      if (!this.dM().y_() && this.ci == 0L && !this.gn()) {
         this.an.b(cb, true);
      }
   }

   private boolean l(cmx $$0) {
      return bX.a($$0);
   }

   private void gl() {
      bzb $$0 = bly.b.a(this.dM());
      if ($$0 != null) {
         $$0.e(this.dk());
         $$0.fJ();
         $$0.gm();
         this.gm();
         this.dM().b($$0);
      }
   }

   private void gm() {
      this.ci = 6000L;
      this.an.b(cb, false);
   }

   private boolean gn() {
      return this.an.b(cb);
   }

   private void a(cfh $$0, cmx $$1) {
      if (!$$0.fT().d) {
         $$1.h(1);
      }
   }

   @Override
   public els cJ() {
      return new els(0.0, (double)this.cI() * 0.6, (double)this.dg() * 0.1);
   }

   @Override
   protected float l(blu $$0) {
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
      this.dM().a(jx.O, this.d(1.0), this.du() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public dnz.a gg() {
      return this.cd;
   }

   @Override
   public dnz.d gh() {
      return this.ce;
   }

   class a implements dns {
      private final dnu b;
      private final int c;

      public a(dnu $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public dnu a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(and $$0, dnq $$1, dnq.a $$2, els $$3) {
         if ($$1 == dnq.E) {
            bzb.this.b(hx.a($$3), true);
            return true;
         } else if ($$1 == dnq.F) {
            bzb.this.b(hx.a($$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements dnz.d {
      private static final int b = 16;
      private final dnu c = new dno(bzb.this, bzb.this.cI());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dnu b() {
         return this.c;
      }

      @Override
      public boolean a(and $$0, hx $$1, dnq $$2, dnq.a $$3) {
         if (bzb.this.fU()) {
            return false;
         } else {
            Optional<ig> $$4 = bzb.this.dO().c(bvm.aM);
            if ($$4.isEmpty()) {
               return true;
            } else {
               ig $$5 = $$4.get();
               return $$5.a().equals($$0.ae()) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(and $$0, hx $$1, dnq $$2, @Nullable blu $$3, @Nullable blu $$4, float $$5) {
         if ($$2 == dnq.H) {
            bzc.a(bzb.this, new hx($$1));
         }
      }

      @Override
      public asv<dnq> c() {
         return asm.e;
      }
   }
}
