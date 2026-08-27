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

public class bxy extends byf implements bmt<bxy.b>, bxr {
   private static final afz<Integer> ca = agc.a(bxy.class, agb.b);
   private static final Predicate<blx> cb = new Predicate<blx>() {
      public boolean a(@Nullable blx $$0) {
         return $$0 != null && bxy.ce.containsKey($$0.ai());
      }
   };
   private static final cmc cc = cmk.rP;
   private static final Set<cmc> cd = Sets.newHashSet(new cmc[]{cmk.ps, cmk.rW, cmk.rV, cmk.ve, cmk.vb, cmk.vc});
   static final Map<blj<?>, arb> ce = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(blj.i, arc.rO);
      $$0.put(blj.l, arc.rP);
      $$0.put(blj.o, arc.sl);
      $$0.put(blj.v, arc.rQ);
      $$0.put(blj.z, arc.rR);
      $$0.put(blj.B, arc.rS);
      $$0.put(blj.D, arc.rT);
      $$0.put(blj.G, arc.rU);
      $$0.put(blj.H, arc.rV);
      $$0.put(blj.R, arc.rW);
      $$0.put(blj.W, arc.rX);
      $$0.put(blj.X, arc.rY);
      $$0.put(blj.aa, arc.rZ);
      $$0.put(blj.ab, arc.sa);
      $$0.put(blj.am, arc.sb);
      $$0.put(blj.av, arc.sc);
      $$0.put(blj.ax, arc.sd);
      $$0.put(blj.ay, arc.se);
      $$0.put(blj.az, arc.sf);
      $$0.put(blj.aE, arc.sg);
      $$0.put(blj.aH, arc.sh);
      $$0.put(blj.aJ, arc.si);
      $$0.put(blj.aK, arc.sj);
      $$0.put(blj.aM, arc.sk);
      $$0.put(blj.aT, arc.sl);
      $$0.put(blj.aV, arc.sm);
      $$0.put(blj.bf, arc.sn);
      $$0.put(blj.bh, arc.so);
      $$0.put(blj.bj, arc.sp);
      $$0.put(blj.bl, arc.sq);
      $$0.put(blj.bm, arc.sr);
      $$0.put(blj.bn, arc.ss);
      $$0.put(blj.bq, arc.st);
      $$0.put(blj.br, arc.su);
      $$0.put(blj.bt, arc.sv);
   });
   public float bW;
   public float bX;
   public float bY;
   public float bZ;
   private float cf = 1.0F;
   private float cg = 1.0F;
   private boolean ch;
   @Nullable
   private hv ci;

   public bxy(blj<? extends bxy> $$0, csy $$1) {
      super($$0, $$1);
      this.bL = new brr(this, 10, false);
      this.a(eek.n, -1.0F);
      this.a(eek.o, -1.0F);
      this.a(eek.x, -1.0F);
   }

   @Nullable
   @Override
   public bmo a(ctn $$0, bjj $$1, blz $$2, @Nullable bmo $$3, @Nullable sj $$4) {
      this.a(ac.a(bxy.b.values(), $$0.F_()));
      if ($$3 == null) {
         $$3 = new bla.a(false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean o_() {
      return false;
   }

   @Override
   protected void B() {
      this.bO.a(0, new btk(this, 1.25));
      this.bO.a(0, new bsl(this));
      this.bO.a(1, new bsz(this, cer.class, 8.0F));
      this.bO.a(2, new btw(this));
      this.bO.a(2, new bsp(this, 1.0, 5.0F, 1.0F, true));
      this.bO.a(2, new bxy.a(this, 1.0));
      this.bO.a(3, new bsw(this));
      this.bO.a(3, new bso(this, 1.0, 3.0F, 7.0F));
   }

   public static bna.a gk() {
      return blx.C().a(bnb.l, 6.0).a(bnb.f, 0.4F).a(bnb.m, 0.2F);
   }

   @Override
   protected bvf b(csy $$0) {
      bvd $$1 = new bvd(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected float b(bmh $$0, blg $$1) {
      return $$1.b * 0.6F;
   }

   @Override
   public void d_() {
      if (this.ci == null || !this.ci.a(this.dk(), 3.46) || !this.dM().a_(this.ci).a(cwb.dT)) {
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
   public void a(hv $$0, boolean $$1) {
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
      this.bX = aty.a(this.bX, 0.0F, 1.0F);
      if (!this.aC() && this.cf < 1.0F) {
         this.cf = 1.0F;
      }

      this.cf *= 0.9F;
      elb $$0 = this.dp();
      if (!this.aC() && $$0.d < 0.0) {
         this.g($$0.d(1.0, 0.6, 1.0));
      }

      this.bW = this.bW + this.cf * 2.0F;
   }

   public static boolean a(csy $$0, blf $$1) {
      if ($$1.bx() && !$$1.aU() && $$0.z.a(2) == 0) {
         List<blx> $$2 = $$0.a(blx.class, $$1.cH().g(20.0), cb);
         if (!$$2.isEmpty()) {
            blx $$3 = $$2.get($$0.z.a($$2.size()));
            if (!$$3.aU()) {
               arb $$4 = b($$3.ai());
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
   public bjl b(cer $$0, bjk $$1) {
      cmh $$2 = $$0.b($$1);
      if (!this.u() && cd.contains($$2.d())) {
         if (!$$0.fT().d) {
            $$2.h(1);
         }

         if (!this.aU()) {
            this.dM().a(null, this.dr(), this.dt(), this.dx(), arc.rL, this.db(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
         }

         if (!this.dM().B) {
            if (this.ag.a(10) == 0) {
               this.f($$0);
               this.dM().a(this, (byte)7);
            } else {
               this.dM().a(this, (byte)6);
            }
         }

         return bjl.a(this.dM().B);
      } else if ($$2.a(cc)) {
         if (!$$0.fT().d) {
            $$2.h(1);
         }

         this.b(new bks(bku.s, 900));
         if ($$0.f() || !this.cr()) {
            this.a(this.dN().a($$0), Float.MAX_VALUE);
         }

         return bjl.a(this.dM().B);
      } else if (!this.gr() && this.u() && this.j($$0)) {
         if (!this.dM().B) {
            this.z(!this.ge());
         }

         return bjl.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean m(cmh $$0) {
      return false;
   }

   public static boolean c(blj<bxy> $$0, csz $$1, blz $$2, hv $$3, auf $$4) {
      return $$1.a_($$3.d()).a(arr.bT) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dip $$2, hv $$3) {
   }

   @Override
   public boolean a(bxi $$0) {
      return false;
   }

   @Nullable
   @Override
   public bla a(amp $$0, bla $$1) {
      return null;
   }

   @Override
   public boolean C(blf $$0) {
      return $$0.a(this.dN().b((blv)this), 3.0F);
   }

   @Nullable
   @Override
   public arb y() {
      return a(this.dM(), this.dM().z);
   }

   public static arb a(csy $$0, auf $$1) {
      if ($$0.aj() != bji.a && $$1.a(1000) == 0) {
         List<blj<?>> $$2 = Lists.newArrayList(ce.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return arc.rJ;
      }
   }

   private static arb b(blj<?> $$0) {
      return ce.getOrDefault($$0, arc.rJ);
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.rN;
   }

   @Override
   protected arb n_() {
      return arc.rK;
   }

   @Override
   protected void b(hv $$0, dip $$1) {
      this.a(arc.sw, 0.15F, 1.0F);
   }

   @Override
   protected boolean aT() {
      return this.aa > this.cg;
   }

   @Override
   protected void aS() {
      this.a(arc.rM, 0.15F, 1.0F);
      this.cg = this.aa + this.bX / 2.0F;
   }

   @Override
   public float eX() {
      return a(this.ag);
   }

   public static float a(auf $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public ard db() {
      return ard.g;
   }

   @Override
   public boolean bu() {
      return true;
   }

   @Override
   protected void D(blf $$0) {
      if (!($$0 instanceof cer)) {
         super.D($$0);
      }
   }

   @Override
   public boolean a(bkd $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dM().B) {
            this.z(false);
         }

         return super.a($$0, $$1);
      }
   }

   public bxy.b gm() {
      return bxy.b.a(this.an.b(ca));
   }

   public void a(bxy.b $$0) {
      this.an.b(ca, $$0.h);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(ca, 0);
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      $$0.a("Variant", this.gm().h);
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      this.a(bxy.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gr() {
      return !this.aC();
   }

   @Override
   public elb cJ() {
      return new elb(0.0, (double)(0.5F * this.cI()), (double)(this.dg() * 0.4F));
   }

   @Override
   protected Vector3f a(blf $$0, blg $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.4375F * $$2, 0.0F);
   }

   static class a extends bud {
      public a(bme $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected elb h() {
         elb $$0 = null;
         if (this.b.aZ()) {
            $$0 = bwq.a(this.b, 15, 15);
         }

         if (this.b.eg().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private elb k() {
         hv $$0 = this.b.dm();
         hv.a $$1 = new hv.a();
         hv.a $$2 = new hv.a();

         for (hv $$4 : hv.b(
            aty.a(this.b.dr() - 3.0),
            aty.a(this.b.dt() - 6.0),
            aty.a(this.b.dx() - 3.0),
            aty.a(this.b.dr() + 3.0),
            aty.a(this.b.dt() + 6.0),
            aty.a(this.b.dx() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               dip $$5 = this.b.dM().a_($$2.a($$4, ia.a));
               boolean $$6 = $$5.b() instanceof dai || $$5.a(arr.t);
               if ($$6 && this.b.dM().t($$4) && this.b.dM().t($$1.a($$4, ia.b))) {
                  return elb.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements aut {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<bxy.b> f = aut.a(bxy.b::values);
      private static final IntFunction<bxy.b> g = asq.a(bxy.b::a, values(), asq.a.c);
      final int h;
      private final String i;

      private b(int $$0, String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static bxy.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
