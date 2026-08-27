import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cbq extends bpf implements chl, dra {
   private static final Logger e = LogUtils.getLogger();
   private static final jf bV = new jf(1, 1, 1);
   private static final int bW = 5;
   private static final float bX = 55.0F;
   private static final float bY = 15.0F;
   private static final csp bZ = csp.a(cpt.oB);
   private static final int ca = 6000;
   private static final int cb = 3;
   private static final aii<Boolean> cc = ail.a(cbq.class, aik.k);
   private static final aii<Boolean> cd = ail.a(cbq.class, aik.k);
   protected static final ImmutableList<bzh<? extends bzg<? super cbq>>> b = ImmutableList.of(bzh.c, bzh.d, bzh.f, bzh.b);
   protected static final ImmutableList<bya<?>> c = ImmutableList.of(
      bya.t, bya.n, bya.h, bya.m, bya.E, bya.x, bya.L, bya.aM, bya.aN, bya.aO, bya.aP, bya.Z, new bya[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final dqo<dra.b> ce;
   private dra.a cf;
   private final dra.d cg;
   private final dqo<cbq.a> ch;
   private final bmu ci = new bmu(1);
   @Nullable
   private ib cj;
   private long ck;
   private float cl;
   private float cm;
   private float cn;
   private float co;
   private float cp;

   public cbq(bol<? extends cbq> $$0, cwe $$1) {
      super($$0, $$1);
      this.bM = new buu(this, 20, true);
      this.s(this.fR());
      this.cg = new cbq.b();
      this.cf = new dra.a();
      this.ce = new dqo<>(new dra.b(this));
      this.ch = new dqo<>(new cbq.a(this.cg.b(), dqr.E.a().a()));
   }

   @Override
   protected bpy.b<cbq> dN() {
      return bpy.a(c, b);
   }

   @Override
   protected bpy<?> a(Dynamic<?> $$0) {
      return cbr.a(this.dN().a($$0));
   }

   @Override
   public bpy<cbq> dM() {
      return (bpy<cbq>)super.dM();
   }

   public static bqd.a u() {
      return boz.C().a(bqe.n, 20.0).a(bqe.h, 0.1F).a(bqe.o, 0.1F).a(bqe.c, 2.0).a(bqe.i, 48.0);
   }

   @Override
   protected byi b(cwe $$0) {
      byg $$1 = new byg(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(cc, false);
      this.am.a(cd, true);
   }

   @Override
   public void a(eov $$0) {
      if (this.cU()) {
         if (this.aZ()) {
            this.a(0.02F, $$0);
            this.a(bpc.a, this.dm());
            this.g(this.dm().a(0.8F));
         } else if (this.bn()) {
            this.a(0.02F, $$0);
            this.a(bpc.a, this.dm());
            this.g(this.dm().a(0.5));
         } else {
            this.a(this.fh(), $$0);
            this.a(bpc.a, this.dm());
            this.g(this.dm().a(0.91F));
         }
      }

      this.q(false);
   }

   @Override
   public boolean a(bne $$0, float $$1) {
      if ($$0.d() instanceof cia $$2) {
         Optional<UUID> $$3 = this.dM().c(bya.aM);
         if ($$3.isPresent() && $$2.ct().equals($$3.get())) {
            return false;
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void b(ib $$0, dme $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, dme $$2, ib $$3) {
   }

   @Override
   protected ato y() {
      return this.b(bom.a) ? atp.a : atp.b;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.d;
   }

   @Override
   protected ato n_() {
      return atp.c;
   }

   @Override
   protected float eY() {
      return 0.4F;
   }

   @Override
   protected void aa() {
      this.dJ().ae().a("allayBrain");
      this.dM().a((apa)this.dJ(), this);
      this.dJ().ae().c();
      this.dJ().ae().a("allayActivityUpdate");
      cbr.a(this);
      this.dJ().ae().c();
      super.aa();
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dJ().B && this.bx() && this.ag % 10 == 0) {
         this.c(1.0F);
      }

      if (this.gl() && this.gq() && this.ag % 20 == 0) {
         this.w(false);
         this.cj = null;
      }

      this.gr();
   }

   @Override
   public void l() {
      super.l();
      if (this.dJ().B) {
         this.cm = this.cl;
         if (this.w()) {
            this.cl = awm.a(this.cl + 1.0F, 0.0F, 5.0F);
         } else {
            this.cl = awm.a(this.cl - 1.0F, 0.0F, 5.0F);
         }

         if (this.gl()) {
            this.cn++;
            this.cp = this.co;
            if (this.gm()) {
               this.co++;
            } else {
               this.co--;
            }

            this.co = awm.a(this.co, 0.0F, 15.0F);
         } else {
            this.cn = 0.0F;
            this.co = 0.0F;
            this.cp = 0.0F;
         }
      } else {
         dra.c.a(this.dJ(), this.cf, this.cg);
         if (this.gi()) {
            this.w(false);
         }
      }
   }

   @Override
   public boolean fR() {
      return !this.gp() && this.w();
   }

   public boolean w() {
      return !this.b(bmk.a).b();
   }

   @Override
   public boolean f(cpq $$0) {
      return false;
   }

   private boolean gp() {
      return this.dM().a(bya.aP, byb.a);
   }

   @Override
   protected bml b(cia $$0, bmk $$1) {
      cpq $$2 = $$0.b($$1);
      cpq $$3 = this.b(bmk.a);
      if (this.gl() && this.n($$2) && this.gu()) {
         this.gs();
         this.dJ().a(this, (byte)18);
         this.dJ().a($$0, this, atp.E, atq.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bml.a;
      } else if ($$3.b() && !$$2.b()) {
         cpq $$4 = $$2.c(1);
         this.a(bmk.a, $$4);
         this.a($$0, $$2);
         this.dJ().a($$0, this, atp.e, atq.g, 2.0F, 1.0F);
         this.dM().a(bya.aM, $$0.ct());
         return bml.a;
      } else if (!$$3.b() && $$1 == bmk.a && $$2.b()) {
         this.a(bom.a, cpq.h);
         this.dJ().a($$0, this, atp.f, atq.g, 2.0F, 1.0F);
         this.a(bmk.a);

         for (cpq $$5 : this.A().f()) {
            bqr.a(this, $$5, this.dh());
         }

         this.dM().b(bya.aM);
         $$0.i($$3);
         return bml.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(ib $$0, boolean $$1) {
      if ($$1) {
         if (!this.gl()) {
            this.cj = $$0;
            this.w(true);
         }
      } else if ($$0.equals(this.cj) || this.cj == null) {
         this.cj = null;
         this.w(false);
      }
   }

   @Override
   public bmu A() {
      return this.ci;
   }

   @Override
   protected jf W() {
      return bV;
   }

   @Override
   public boolean k(cpq $$0) {
      cpq $$1 = this.b(bmk.a);
      return !$$1.b() && this.dJ().Z().b(cwa.c) && this.ci.b($$0) && this.d($$1, $$0);
   }

   private boolean d(cpq $$0, cpq $$1) {
      return cpq.b($$0, $$1) && !this.e($$0, $$1);
   }

   private boolean e(cpq $$0, cpq $$1) {
      sy $$2 = $$0.w();
      boolean $$3 = $$2 != null && $$2.e("Potion");
      if (!$$3) {
         return false;
      } else {
         sy $$4 = $$1.w();
         boolean $$5 = $$4 != null && $$4.e("Potion");
         if (!$$5) {
            return true;
         } else {
            tv $$6 = $$2.c("Potion");
            tv $$7 = $$4.c("Potion");
            return $$6 != null && $$7 != null && !$$6.equals($$7);
         }
      }
   }

   @Override
   protected void b(cel $$0) {
      chl.a(this, this, $$0);
   }

   @Override
   protected void Z() {
      super.Z();
      aes.a(this);
   }

   @Override
   public boolean aT() {
      return !this.aC();
   }

   @Override
   public void a(BiConsumer<dqo<?>, apa> $$0) {
      if (this.dJ() instanceof apa $$1) {
         $$0.accept(this.ce, $$1);
         $$0.accept(this.ch, $$1);
      }
   }

   public boolean gl() {
      return this.am.b(cc);
   }

   public void w(boolean $$0) {
      if (!this.dJ().B && this.cV() && (!$$0 || !this.gi())) {
         this.am.b(cc, $$0);
      }
   }

   private boolean gq() {
      return this.cj == null || !this.cj.a(this.dh(), (double)dqr.E.a().a()) || !this.dJ().a_(this.cj).a(czh.dT);
   }

   public float E(float $$0) {
      return awm.i($$0, this.cm, this.cl) / 5.0F;
   }

   public boolean gm() {
      float $$0 = this.cn % 55.0F;
      return $$0 < 15.0F;
   }

   public float F(float $$0) {
      return awm.i($$0, this.cp, this.co) / 15.0F;
   }

   @Override
   public boolean a(cpq $$0, cpq $$1) {
      return !this.d($$0, $$1);
   }

   @Override
   protected void ex() {
      super.ex();
      this.ci.f().forEach(this::b);
      cpq $$0 = this.c(bom.a);
      if (!$$0.b() && !cua.e($$0)) {
         this.b($$0);
         this.a(bom.a, cpq.h);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      this.a_($$0);
      dra.a.a.encodeStart(tm.a, this.cf).resultOrPartial(e::error).ifPresent($$1 -> $$0.a("listener", $$1));
      $$0.a("DuplicationCooldown", this.ck);
      $$0.a("CanDuplicate", this.gu());
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      this.c($$0);
      if ($$0.b("listener", 10)) {
         dra.a.a.parse(new Dynamic(tm.a, $$0.p("listener"))).resultOrPartial(e::error).ifPresent($$0x -> this.cf = $$0x);
      }

      this.ck = (long)$$0.h("DuplicationCooldown");
      this.am.b(cd, $$0.q("CanDuplicate"));
   }

   @Override
   protected boolean gj() {
      return false;
   }

   private void gr() {
      if (this.ck > 0L) {
         this.ck--;
      }

      if (!this.dJ().y_() && this.ck == 0L && !this.gu()) {
         this.am.b(cd, true);
      }
   }

   private boolean n(cpq $$0) {
      return bZ.a($$0);
   }

   private void gs() {
      cbq $$0 = bol.b.a(this.dJ());
      if ($$0 != null) {
         $$0.e(this.dh());
         $$0.fQ();
         $$0.gt();
         this.gt();
         this.dJ().b($$0);
      }
   }

   private void gt() {
      this.ck = 6000L;
      this.am.b(cd, false);
   }

   private boolean gu() {
      return this.am.b(cd);
   }

   private void a(cia $$0, cpq $$1) {
      if (!$$0.fW().d) {
         $$1.h(1);
      }
   }

   @Override
   public eov cG() {
      return new eov(0.0, (double)this.cF() * 0.6, (double)this.dd() * 0.1);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 3; $$1++) {
            this.gv();
         }
      } else {
         super.b($$0);
      }
   }

   private void gv() {
      double $$0 = this.af.k() * 0.02;
      double $$1 = this.af.k() * 0.02;
      double $$2 = this.af.k() * 0.02;
      this.dJ().a(kb.O, this.d(1.0), this.dr() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public dra.a gn() {
      return this.cf;
   }

   @Override
   public dra.d go() {
      return this.cg;
   }

   class a implements dqt {
      private final dqv b;
      private final int c;

      public a(dqv $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public dqv a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(apa $$0, il<dqr> $$1, dqr.a $$2, eov $$3) {
         if ($$1.a(dqr.E)) {
            cbq.this.b(ib.a($$3), true);
            return true;
         } else if ($$1.a(dqr.F)) {
            cbq.this.b(ib.a($$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements dra.d {
      private static final int b = 16;
      private final dqv c = new dqp(cbq.this, cbq.this.cF());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dqv b() {
         return this.c;
      }

      @Override
      public boolean a(apa $$0, ib $$1, il<dqr> $$2, dqr.a $$3) {
         if (cbq.this.gb()) {
            return false;
         } else {
            Optional<ik> $$4 = cbq.this.dM().c(bya.aN);
            if ($$4.isEmpty()) {
               return true;
            } else {
               ik $$5 = $$4.get();
               return $$5.a().equals($$0.ad()) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(apa $$0, ib $$1, il<dqr> $$2, @Nullable bof $$3, @Nullable bof $$4, float $$5) {
         if ($$2.a(dqr.H)) {
            cbr.a(cbq.this, new ib($$1));
         }
      }

      @Override
      public aut<dqr> c() {
         return auk.e;
      }
   }
}
