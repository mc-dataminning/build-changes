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

public class cfs extends ceg implements bso, btq<cfs.d>, cei {
   public static final int bY = 200;
   protected static final ImmutableList<? extends cdb<? extends cda<? super cfs>>> bZ = ImmutableList.of(cdb.c, cdb.o, cdb.f, cdb.p, cdb.q);
   protected static final ImmutableList<? extends cbu<?>> cb = ImmutableList.of(
      cbu.r, cbu.g, cbu.h, cbu.k, cbu.l, cbu.n, cbu.m, cbu.E, cbu.t, cbu.o, cbu.p, cbu.K, new cbu[]{cbu.y, cbu.N, cbu.B, cbu.O, cbu.P, cbu.R, cbu.U, cbu.Z}
   );
   private static final ajs<Integer> cf = ajw.a(cfs.class, aju.b);
   private static final ajs<Boolean> cg = ajw.a(cfs.class, aju.k);
   private static final ajs<Boolean> ch = ajw.a(cfs.class, aju.k);
   public static final double cc = 20.0;
   public static final int cd = 1200;
   private static final int ci = 6000;
   public static final String ce = "Variant";
   private static final int cj = 1800;
   private static final int ck = 2400;
   private final Map<String, Vector3f> cl = Maps.newHashMap();
   private static final int cm = 100;

   public cfs(bsc<? extends cfs> $$0, daz $$1) {
      super($$0, $$1);
      this.a(enn.j, 0.0F);
      this.bP = new cfs.c(this);
      this.bO = new cfs.b(this, 20);
   }

   @Override
   public Map<String, Vector3f> a() {
      return this.cl;
   }

   @Override
   public float a(io $$0, dbc $$1) {
      return 0.0F;
   }

   @Override
   protected void a(ajw.a $$0) {
      super.a($$0);
      $$0.a(cf, 0);
      $$0.a(cg, false);
      $$0.a(ch, false);
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("Variant", this.gp().a());
      $$0.a("FromBucket", this.u());
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.a(cfs.d.a($$0.h("Variant")));
      this.w($$0.q("FromBucket"));
   }

   @Override
   public void P() {
      if (!this.gv()) {
         super.P();
      }
   }

   @Override
   public btj a(dbo $$0, bpu $$1, bsu $$2, @Nullable btj $$3) {
      boolean $$4 = false;
      if ($$2 == bsu.l) {
         return $$3;
      } else {
         aym $$5 = $$0.E_();
         if ($$3 instanceof cfs.a) {
            if (((cfs.a)$$3).a() >= 2) {
               $$4 = true;
            }
         } else {
            $$3 = new cfs.a(cfs.d.a($$5), cfs.d.a($$5));
         }

         this.a(((cfs.a)$$3).a($$5));
         if ($$4) {
            this.c_(-24000);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void au() {
      int $$0 = this.cl();
      super.au();
      if (!this.gf()) {
         this.u($$0);
      }
   }

   protected void u(int $$0) {
      if (this.bD() && !this.bg()) {
         this.k($$0 - 1);
         if (this.cl() == -20) {
            this.k(0);
            this.a(this.dQ().r(), 2.0F);
         }
      } else {
         this.k(this.ck());
      }
   }

   @Override
   public void s() {
      int $$0 = this.cl() + 1800;
      this.k(Math.min($$0, this.ck()));
   }

   @Override
   public int ck() {
      return 6000;
   }

   public cfs.d gp() {
      return cfs.d.a(this.ao.a(cf));
   }

   public void a(cfs.d $$0) {
      this.ao.a(cf, $$0.a());
   }

   private static boolean a(aym $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(dbc $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean cC() {
      return false;
   }

   public void x(boolean $$0) {
      this.ao.a(cg, $$0);
   }

   public boolean gv() {
      return this.ao.a(cg);
   }

   @Override
   public boolean u() {
      return this.ao.a(ch);
   }

   @Override
   public void w(boolean $$0) {
      this.ao.a(ch, $$0);
   }

   @Nullable
   @Override
   public brq a(aqn $$0, brq $$1) {
      cfs $$2 = bsc.f.a((daz)$$0);
      if ($$2 != null) {
         cfs.d $$3;
         if (a(this.ah)) {
            $$3 = cfs.d.b(this.ah);
         } else {
            $$3 = this.ah.h() ? this.gp() : ((cfs)$$1).gp();
         }

         $$2.a($$3);
         $$2.fT();
      }

      return $$2;
   }

   @Override
   public boolean o(ctq $$0) {
      return $$0.a(awf.ay);
   }

   @Override
   public boolean a(cly $$0) {
      return true;
   }

   @Override
   protected void Y() {
      this.dP().af().a("axolotlBrain");
      this.dS().a((aqn)this.dP(), this);
      this.dP().af().c();
      this.dP().af().a("axolotlActivityUpdate");
      cft.a(this);
      this.dP().af().c();
      if (!this.gf()) {
         Optional<Integer> $$0 = this.dS().c(cbu.N);
         this.x($$0.isPresent() && $$0.get() > 0);
      }
   }

   public static btx.a gw() {
      return bss.A().a(bty.q, 14.0).a(bty.r, 1.0).a(bty.c, 2.0).a(bty.v, 1.0);
   }

   @Override
   protected ccc b(daz $$0) {
      return new cbz(this, $$0);
   }

   @Override
   public boolean C(brw $$0) {
      boolean $$1 = $$0.a(this.dQ().b((bsq)this), (float)((int)this.g(bty.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(avi.aK, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public boolean a(bqp $$0, float $$1) {
      float $$2 = this.eA();
      if (!this.dP().B
         && !this.gf()
         && this.dP().z.a(3) == 0
         && ((float)this.dP().z.a(3) < $$1 || $$2 / this.eR() < 0.5F)
         && $$1 < $$2
         && this.be()
         && ($$0.d() != null || $$0.c() != null)
         && !this.gv()) {
         this.bD.a(cbu.N, 200);
      }

      return super.a($$0, $$1);
   }

   @Override
   public int Z() {
      return 1;
   }

   @Override
   public int aa() {
      return 1;
   }

   @Override
   public bpw b(cly $$0, bpv $$1) {
      return cei.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void n(ctq $$0) {
      cei.a(this, $$0);
      cwf.a(kb.M, $$0, $$0x -> {
         $$0x.a("Variant", this.gp().a());
         $$0x.a("Age", this.g());
         bts<?> $$1 = this.dS();
         if ($$1.a(cbu.U)) {
            $$0x.a("HuntingCooldown", $$1.e(cbu.U));
         }
      });
   }

   @Override
   public void c(ud $$0) {
      cei.a(this, $$0);
      this.a(cfs.d.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.dS().a(cbu.U, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public ctq b() {
      return new ctq(ctt.qJ);
   }

   @Override
   public avh y() {
      return avi.dj;
   }

   @Override
   public boolean et() {
      return !this.gv() && super.et();
   }

   public static void a(cfs $$0, bsq $$1) {
      daz $$2 = $$0.dP();
      if ($$1.eB()) {
         bqp $$3 = $$1.eC();
         if ($$3 != null) {
            brw $$4 = $$3.d();
            if ($$4 != null && $$4.ak() == bsc.by) {
               cly $$5 = (cly)$$4;
               List<cly> $$6 = $$2.a(cly.class, $$0.cK().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.f($$5);
               }
            }
         }
      }
   }

   public void f(cly $$0) {
      bre $$1 = $$0.c(brg.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new bre(brg.j, $$3, 0), this);
      }

      $$0.e(brg.d);
   }

   @Override
   public boolean V() {
      return super.V() || this.u();
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.aM;
   }

   @Nullable
   @Override
   protected avh o_() {
      return avi.aL;
   }

   @Nullable
   @Override
   protected avh v() {
      return this.be() ? avi.aO : avi.aN;
   }

   @Override
   protected avh aQ() {
      return avi.aP;
   }

   @Override
   protected avh aP() {
      return avi.aQ;
   }

   @Override
   protected bts.b<cfs> dT() {
      return bts.a(cb, bZ);
   }

   @Override
   protected bts<?> a(Dynamic<?> $$0) {
      return cft.a(this.dT().a($$0));
   }

   @Override
   public bts<cfs> dS() {
      return (bts<cfs>)super.dS();
   }

   @Override
   protected void X() {
      super.X();
      agb.a(this);
   }

   @Override
   public void a(eum $$0) {
      if (this.da() && this.be()) {
         this.a(this.fn(), $$0);
         this.a(bsv.a, this.ds());
         this.g(this.ds().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   protected void a(cly $$0, bpv $$1, ctq $$2) {
      if ($$2.a(ctt.qI)) {
         $$0.a($$1, new ctq(ctt.qz));
      } else {
         super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.u() && !this.ag();
   }

   public static boolean a(bsc<? extends bsq> $$0, dbo $$1, bsu $$2, io $$3, aym $$4) {
      return $$1.a_($$3.d()).a(avx.bY);
   }

   public static class a extends brq.a {
      public final cfs.d[] a;

      public a(cfs.d... $$0) {
         super(false);
         this.a = $$0;
      }

      public cfs.d a(aym $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class b extends bys {
      public b(cfs $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!cfs.this.gv()) {
            super.a();
         }
      }
   }

   static class c extends byt {
      private final cfs l;

      public c(cfs $$0) {
         super($$0, 85, 10, 0.1F, 0.5F, false);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (!this.l.gv()) {
            super.a();
         }
      }
   }

   public static enum d implements ayz {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<cfs.d> g = aww.a(cfs.d::a, values(), aww.a.a);
      public static final Codec<cfs.d> f = ayz.a(cfs.d::values);
      private final int h;
      private final String i;
      private final boolean j;

      private d(int $$0, String $$1, boolean $$2) {
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

      public static cfs.d a(int $$0) {
         return g.apply($$0);
      }

      public static cfs.d a(aym $$0) {
         return a($$0, true);
      }

      public static cfs.d b(aym $$0) {
         return a($$0, false);
      }

      private static cfs.d a(aym $$0, boolean $$1) {
         cfs.d[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(cfs.d[]::new);
         return ac.a($$2, $$0);
      }
   }
}
