import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class byo extends byv implements bnj<byo.b>, byh {
   private static final agm<Integer> ca = agp.a(byo.class, ago.b);
   private static final Predicate<bmn> cb = new Predicate<bmn>() {
      public boolean a(@Nullable bmn $$0) {
         return $$0 != null && byo.ce.containsKey($$0.ai());
      }
   };
   private static final cmt cc = cnb.rP;
   private static final Set<cmt> cd = Sets.newHashSet(new cmt[]{cnb.ps, cnb.rW, cnb.rV, cnb.ve, cnb.vb, cnb.vc});
   static final Map<blz<?>, arr> ce = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(blz.i, ars.rO);
      $$0.put(blz.l, ars.rP);
      $$0.put(blz.o, ars.sl);
      $$0.put(blz.v, ars.rQ);
      $$0.put(blz.z, ars.rR);
      $$0.put(blz.B, ars.rS);
      $$0.put(blz.D, ars.rT);
      $$0.put(blz.G, ars.rU);
      $$0.put(blz.H, ars.rV);
      $$0.put(blz.R, ars.rW);
      $$0.put(blz.W, ars.rX);
      $$0.put(blz.X, ars.rY);
      $$0.put(blz.aa, ars.rZ);
      $$0.put(blz.ab, ars.sa);
      $$0.put(blz.am, ars.sb);
      $$0.put(blz.av, ars.sc);
      $$0.put(blz.ax, ars.sd);
      $$0.put(blz.ay, ars.se);
      $$0.put(blz.az, ars.sf);
      $$0.put(blz.aE, ars.sg);
      $$0.put(blz.aH, ars.sh);
      $$0.put(blz.aJ, ars.si);
      $$0.put(blz.aK, ars.sj);
      $$0.put(blz.aM, ars.sk);
      $$0.put(blz.aT, ars.sl);
      $$0.put(blz.aV, ars.sm);
      $$0.put(blz.bf, ars.sn);
      $$0.put(blz.bh, ars.so);
      $$0.put(blz.bj, ars.sp);
      $$0.put(blz.bl, ars.sq);
      $$0.put(blz.bm, ars.sr);
      $$0.put(blz.bn, ars.ss);
      $$0.put(blz.bq, ars.st);
      $$0.put(blz.br, ars.su);
      $$0.put(blz.bt, ars.sv);
   });
   public float bW;
   public float bX;
   public float bY;
   public float bZ;
   private float cf = 1.0F;
   private float cg = 1.0F;
   private boolean ch;
   @Nullable
   private hx ci;

   public byo(blz<? extends byo> $$0, ctp $$1) {
      super($$0, $$1);
      this.bL = new bsh(this, 10, false);
      this.a(efc.n, -1.0F);
      this.a(efc.o, -1.0F);
      this.a(efc.x, -1.0F);
   }

   @Nullable
   @Override
   public bne a(cue $$0, bjz $$1, bmp $$2, @Nullable bne $$3, @Nullable sn $$4) {
      this.a(ac.a(byo.b.values(), $$0.F_()));
      if ($$3 == null) {
         $$3 = new blq.a(false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean o_() {
      return false;
   }

   @Override
   protected void B() {
      this.bO.a(0, new bua(this, 1.25));
      this.bO.a(0, new btb(this));
      this.bO.a(1, new btp(this, cfi.class, 8.0F));
      this.bO.a(2, new bum(this));
      this.bO.a(2, new btf(this, 1.0, 5.0F, 1.0F, true));
      this.bO.a(2, new byo.a(this, 1.0));
      this.bO.a(3, new btm(this));
      this.bO.a(3, new bte(this, 1.0, 3.0F, 7.0F));
   }

   public static bnq.a gk() {
      return bmn.C().a(bnr.l, 6.0).a(bnr.f, 0.4F).a(bnr.m, 0.2F);
   }

   @Override
   protected bvv b(ctp $$0) {
      bvt $$1 = new bvt(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected float b(bmx $$0, blw $$1) {
      return $$1.b * 0.6F;
   }

   @Override
   public void d_() {
      if (this.ci == null || !this.ci.a(this.dk(), 3.46) || !this.dM().a_(this.ci).a(cws.dT)) {
         this.ch = false;
         this.ci = null;
      }

      if (this.dM().z.a(400) == 0) {
         a(this.dM(), this);
      }

      super.d_();
      this.go();
   }

   @Override
   public void a(hx $$0, boolean $$1) {
      this.ci = $$0;
      this.ch = $$1;
   }

   public boolean gl() {
      return this.ch;
   }

   private void go() {
      this.bZ = this.bW;
      this.bY = this.bX;
      this.bX = this.bX + (float)(!this.aC() && !this.bO() ? 4 : -1) * 0.3F;
      this.bX = auo.a(this.bX, 0.0F, 1.0F);
      if (!this.aC() && this.cf < 1.0F) {
         this.cf = 1.0F;
      }

      this.cf *= 0.9F;
      elt $$0 = this.dp();
      if (!this.aC() && $$0.d < 0.0) {
         this.g($$0.d(1.0, 0.6, 1.0));
      }

      this.bW = this.bW + this.cf * 2.0F;
   }

   public static boolean a(ctp $$0, blv $$1) {
      if ($$1.bx() && !$$1.aU() && $$0.z.a(2) == 0) {
         List<bmn> $$2 = $$0.a(bmn.class, $$1.cH().g(20.0), cb);
         if (!$$2.isEmpty()) {
            bmn $$3 = $$2.get($$0.z.a($$2.size()));
            if (!$$3.aU()) {
               arr $$4 = b($$3.ai());
               $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), $$4, $$1.db(), 0.7F, a($$0.z));
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public bkb b(cfi $$0, bka $$1) {
      cmy $$2 = $$0.b($$1);
      if (!this.u() && cd.contains($$2.d())) {
         if (!$$0.fT().d) {
            $$2.h(1);
         }

         if (!this.aU()) {
            this.dM().a(null, this.dr(), this.dt(), this.dx(), ars.rL, this.db(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
         }

         if (!this.dM().B) {
            if (this.ag.a(10) == 0) {
               this.f($$0);
               this.dM().a(this, (byte)7);
            } else {
               this.dM().a(this, (byte)6);
            }
         }

         return bkb.a(this.dM().B);
      } else if ($$2.a(cc)) {
         if (!$$0.fT().d) {
            $$2.h(1);
         }

         this.b(new bli(blk.s, 900));
         if ($$0.f() || !this.cr()) {
            this.a(this.dN().a($$0), Float.MAX_VALUE);
         }

         return bkb.a(this.dM().B);
      } else if (!this.gr() && this.u() && this.j($$0)) {
         if (!this.dM().B) {
            this.z(!this.ge());
         }

         return bkb.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean m(cmy $$0) {
      return false;
   }

   public static boolean c(blz<byo> $$0, ctq $$1, bmp $$2, hx $$3, auv $$4) {
      return $$1.a_($$3.d()).a(ash.bT) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, djh $$2, hx $$3) {
   }

   @Override
   public boolean a(bxy $$0) {
      return false;
   }

   @Nullable
   @Override
   public blq a(and $$0, blq $$1) {
      return null;
   }

   @Override
   public boolean C(blv $$0) {
      return $$0.a(this.dN().b((bml)this), 3.0F);
   }

   @Nullable
   @Override
   public arr y() {
      return a(this.dM(), this.dM().z);
   }

   public static arr a(ctp $$0, auv $$1) {
      if ($$0.ak() != bjy.a && $$1.a(1000) == 0) {
         List<blz<?>> $$2 = Lists.newArrayList(ce.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return ars.rJ;
      }
   }

   private static arr b(blz<?> $$0) {
      return ce.getOrDefault($$0, ars.rJ);
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.rN;
   }

   @Override
   protected arr n_() {
      return ars.rK;
   }

   @Override
   protected void b(hx $$0, djh $$1) {
      this.a(ars.sw, 0.15F, 1.0F);
   }

   @Override
   protected boolean aT() {
      return this.aa > this.cg;
   }

   @Override
   protected void aS() {
      this.a(ars.rM, 0.15F, 1.0F);
      this.cg = this.aa + this.bX / 2.0F;
   }

   @Override
   public float eX() {
      return a(this.ag);
   }

   public static float a(auv $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public art db() {
      return art.g;
   }

   @Override
   public boolean bu() {
      return true;
   }

   @Override
   protected void D(blv $$0) {
      if (!($$0 instanceof cfi)) {
         super.D($$0);
      }
   }

   @Override
   public boolean a(bkt $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dM().B) {
            this.z(false);
         }

         return super.a($$0, $$1);
      }
   }

   public byo.b gm() {
      return byo.b.a(this.an.b(ca));
   }

   public void a(byo.b $$0) {
      this.an.b(ca, $$0.h);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(ca, 0);
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("Variant", this.gm().h);
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.a(byo.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gr() {
      return !this.aC();
   }

   @Override
   public elt cJ() {
      return new elt(0.0, (double)(0.5F * this.cI()), (double)(this.dg() * 0.4F));
   }

   @Override
   protected Vector3f a(blv $$0, blw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.4375F * $$2, 0.0F);
   }

   static class a extends but {
      public a(bmu $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected elt h() {
         elt $$0 = null;
         if (this.b.aZ()) {
            $$0 = bxg.a(this.b, 15, 15);
         }

         if (this.b.eg().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private elt k() {
         hx $$0 = this.b.dm();
         hx.a $$1 = new hx.a();
         hx.a $$2 = new hx.a();

         for (hx $$4 : hx.b(
            auo.a(this.b.dr() - 3.0),
            auo.a(this.b.dt() - 6.0),
            auo.a(this.b.dx() - 3.0),
            auo.a(this.b.dr() + 3.0),
            auo.a(this.b.dt() + 6.0),
            auo.a(this.b.dx() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               djh $$5 = this.b.dM().a_($$2.a($$4, ic.a));
               boolean $$6 = $$5.b() instanceof daz || $$5.a(ash.t);
               if ($$6 && this.b.dM().u($$4) && this.b.dM().u($$1.a($$4, ic.b))) {
                  return elt.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements avk {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<byo.b> f = avk.a(byo.b::values);
      private static final IntFunction<byo.b> g = atg.a(byo.b::a, values(), atg.a.c);
      final int h;
      private final String i;

      private b(int $$0, String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static byo.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
