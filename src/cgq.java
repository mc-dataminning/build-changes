import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cgq extends cfe implements btl, buo<cgq.d>, cfg {
   public static final int cc = 200;
   protected static final ImmutableList<? extends cdz<? extends cdy<? super cgq>>> cd = ImmutableList.of(cdz.c, cdz.o, cdz.f, cdz.p, cdz.q);
   protected static final ImmutableList<? extends ccs<?>> ce = ImmutableList.of(
      ccs.r, ccs.g, ccs.h, ccs.k, ccs.l, ccs.n, ccs.m, ccs.E, ccs.t, ccs.o, ccs.p, ccs.K, new ccs[]{ccs.y, ccs.N, ccs.B, ccs.O, ccs.P, ccs.R, ccs.U, ccs.Z}
   );
   private static final ajw<Integer> cj = aka.a(cgq.class, ajy.b);
   private static final ajw<Boolean> ck = aka.a(cgq.class, ajy.k);
   private static final ajw<Boolean> cl = aka.a(cgq.class, ajy.k);
   public static final double cg = 20.0;
   public static final int ch = 1200;
   private static final int cm = 6000;
   public static final String ci = "Variant";
   private static final int cn = 1800;
   private static final int co = 2400;
   private final Map<String, Vector3f> cp = Maps.newHashMap();
   private static final int cq = 100;

   public cgq(bsx<? extends cgq> $$0, dcw $$1) {
      super($$0, $$1);
      this.a(epv.j, 0.0F);
      this.bT = new cgq.c(this);
      this.bS = new cgq.b(this, 20);
   }

   @Override
   public Map<String, Vector3f> a() {
      return this.cp;
   }

   @Override
   public float a(jd $$0, dcz $$1) {
      return 0.0F;
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(cj, 0);
      $$0.a(ck, false);
      $$0.a(cl, false);
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("Variant", this.gk().a());
      $$0.a("FromBucket", this.t());
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.a(cgq.d.a($$0.h("Variant")));
      this.x($$0.q("FromBucket"));
   }

   @Override
   public void S() {
      if (!this.gl()) {
         super.S();
      }
   }

   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      boolean $$4 = false;
      if ($$2 == btr.l) {
         return $$3;
      } else {
         ayw $$5 = $$0.E_();
         if ($$3 instanceof cgq.a) {
            if (((cgq.a)$$3).a() >= 2) {
               $$4 = true;
            }
         } else {
            $$3 = new cgq.a(cgq.d.a($$5), cgq.d.a($$5));
         }

         this.a(((cgq.a)$$3).a($$5));
         if ($$4) {
            this.c_(-24000);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void aw() {
      int $$0 = this.cm();
      super.aw();
      if (!this.fZ()) {
         this.t($$0);
      }
   }

   protected void t(int $$0) {
      if (this.bE() && !this.bh()) {
         this.j($$0 - 1);
         if (this.cm() == -20) {
            this.j(0);
            this.a(this.dP().s(), 2.0F);
         }
      } else {
         this.j(this.cl());
      }
   }

   @Override
   public void s() {
      int $$0 = this.cm() + 1800;
      this.j(Math.min($$0, this.cl()));
   }

   @Override
   public int cl() {
      return 6000;
   }

   public cgq.d gk() {
      return cgq.d.a(this.ao.a(cj));
   }

   public void a(cgq.d $$0) {
      this.ao.a(cj, $$0.a());
   }

   private static boolean a(ayw $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(dcz $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean cC() {
      return false;
   }

   public void y(boolean $$0) {
      this.ao.a(ck, $$0);
   }

   public boolean gl() {
      return this.ao.a(ck);
   }

   @Override
   public boolean t() {
      return this.ao.a(cl);
   }

   @Override
   public void x(boolean $$0) {
      this.ao.a(cl, $$0);
   }

   @Nullable
   @Override
   public bsl a(aqu $$0, bsl $$1) {
      cgq $$2 = bsx.f.a((dcw)$$0);
      if ($$2 != null) {
         cgq.d $$3;
         if (a(this.ah)) {
            $$3 = cgq.d.b(this.ah);
         } else {
            $$3 = this.ah.h() ? this.gk() : ((cgq)$$1).gk();
         }

         $$2.a($$3);
         $$2.fR();
      }

      return $$2;
   }

   @Override
   public boolean o(cuq $$0) {
      return $$0.a(awn.ay);
   }

   @Override
   public boolean y() {
      return true;
   }

   @Override
   protected void ab() {
      this.dO().ag().a("axolotlBrain");
      this.dT().a((aqu)this.dO(), this);
      this.dO().ag().c();
      this.dO().ag().a("axolotlActivityUpdate");
      cgr.a(this);
      this.dO().ag().c();
      if (!this.fZ()) {
         Optional<Integer> $$0 = this.dT().c(ccs.N);
         this.y($$0.isPresent() && $$0.get() > 0);
      }
   }

   public static buv.a gm() {
      return btp.C().a(buw.s, 14.0).a(buw.v, 1.0).a(buw.c, 2.0).a(buw.B, 1.0);
   }

   @Override
   protected cda b(dcw $$0) {
      return new ccx(this, $$0);
   }

   @Override
   public void gd() {
      this.a(avp.aK, 1.0F, 1.0F);
   }

   @Override
   public boolean a(brk $$0, float $$1) {
      float $$2 = this.ew();
      if (!this.dO().B
         && !this.fZ()
         && this.dO().z.a(3) == 0
         && ((float)this.dO().z.a(3) < $$1 || $$2 / this.eN() < 0.5F)
         && $$1 < $$2
         && this.bf()
         && ($$0.d() != null || $$0.c() != null)
         && !this.gl()) {
         this.bF.a(ccs.N, 200);
      }

      return super.a($$0, $$1);
   }

   @Override
   public int ac() {
      return 1;
   }

   @Override
   public int ae() {
      return 1;
   }

   @Override
   public bqr b(cmx $$0, bqq $$1) {
      return cfg.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void n(cuq $$0) {
      cfg.a(this, $$0);
      cxh.a(kq.N, $$0, $$0x -> {
         $$0x.a("Variant", this.gk().a());
         $$0x.a("Age", this.g());
         buq<?> $$1 = this.dT();
         if ($$1.a(ccs.U)) {
            $$0x.a("HuntingCooldown", $$1.e(ccs.U));
         }
      });
   }

   @Override
   public void h(ub $$0) {
      cfg.a(this, $$0);
      this.a(cgq.d.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.dT().a(ccs.U, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public cuq b() {
      return new cuq(cut.qJ);
   }

   @Override
   public avo x() {
      return avp.dj;
   }

   @Override
   public boolean ep() {
      return !this.gl() && super.ep();
   }

   public static void a(cgq $$0, btn $$1) {
      dcw $$2 = $$0.dO();
      if ($$1.ex()) {
         brk $$3 = $$1.ey();
         if ($$3 != null) {
            bsr $$4 = $$3.d();
            if ($$4 != null && $$4.am() == bsx.by) {
               cmx $$5 = (cmx)$$4;
               List<cmx> $$6 = $$2.a(cmx.class, $$0.cK().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.a($$5);
               }
            }
         }
      }
   }

   public void a(cmx $$0) {
      brz $$1 = $$0.c(bsb.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new brz(bsb.j, $$3, 0), this);
      }

      $$0.e(bsb.d);
   }

   @Override
   public boolean Y() {
      return super.Y() || this.t();
   }

   @Override
   protected avo d(brk $$0) {
      return avp.aM;
   }

   @Nullable
   @Override
   protected avo n_() {
      return avp.aL;
   }

   @Nullable
   @Override
   protected avo v() {
      return this.bf() ? avp.aO : avp.aN;
   }

   @Override
   protected avo aR() {
      return avp.aP;
   }

   @Override
   protected avo aQ() {
      return avp.aQ;
   }

   @Override
   protected buq.b<cgq> dU() {
      return buq.a(ce, cd);
   }

   @Override
   protected buq<?> a(Dynamic<?> $$0) {
      return cgr.a(this.dU().a($$0));
   }

   @Override
   public buq<cgq> dT() {
      return (buq<cgq>)super.dT();
   }

   @Override
   protected void aa() {
      super.aa();
      agf.a(this);
   }

   @Override
   public void a(exc $$0) {
      if (this.da() && this.bf()) {
         this.a(this.fj(), $$0);
         this.a(bts.a, this.dr());
         this.i(this.dr().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   protected void a(cmx $$0, bqq $$1, cuq $$2) {
      if ($$2.a(cut.qI)) {
         $$0.a($$1, cus.a($$2, $$0, new cuq(cut.qz)));
      } else {
         super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.t() && !this.ai();
   }

   @Nullable
   @Override
   public btn p() {
      return this.P();
   }

   public static boolean a(bsx<? extends btn> $$0, ddl $$1, btr $$2, jd $$3, ayw $$4) {
      return $$1.a_($$3.e()).a(awe.bZ);
   }

   public static class a extends bsl.a {
      public final cgq.d[] a;

      public a(cgq.d... $$0) {
         super(false);
         this.a = $$0;
      }

      public cgq.d a(ayw $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class b extends bzq {
      public b(final cgq $$0, final int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!cgq.this.gl()) {
            super.a();
         }
      }
   }

   static class c extends bzr {
      private final cgq l;

      public c(cgq $$0) {
         super($$0, 85, 10, 0.1F, 0.5F, false);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (!this.l.gl()) {
            super.a();
         }
      }
   }

   public static enum d implements azk {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<cgq.d> g = axe.a(cgq.d::a, values(), axe.a.a);
      public static final Codec<cgq.d> f = azk.a(cgq.d::values);
      private final int h;
      private final String i;
      private final boolean j;

      private d(final int $$0, final String $$1, final boolean $$2) {
         this.h = $$0;
         this.i = $$1;
         this.j = $$2;
      }

      public int a() {
         return this.h;
      }

      public String b() {
         return this.i;
      }

      @Override
      public String c() {
         return this.i;
      }

      public static cgq.d a(int $$0) {
         return g.apply($$0);
      }

      public static cgq.d a(ayw $$0) {
         return a($$0, true);
      }

      public static cgq.d b(ayw $$0) {
         return a($$0, false);
      }

      private static cgq.d a(ayw $$0, boolean $$1) {
         cgq.d[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(cgq.d[]::new);
         return ad.a($$2, $$0);
      }
   }
}
