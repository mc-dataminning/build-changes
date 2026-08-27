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

public class byn extends byu implements bni<byn.b>, byg {
   private static final agm<Integer> ca = agp.a(byn.class, ago.b);
   private static final Predicate<bmm> cb = new Predicate<bmm>() {
      public boolean a(@Nullable bmm $$0) {
         return $$0 != null && byn.ce.containsKey($$0.ai());
      }
   };
   private static final cms cc = cna.rP;
   private static final Set<cms> cd = Sets.newHashSet(new cms[]{cna.ps, cna.rW, cna.rV, cna.ve, cna.vb, cna.vc});
   static final Map<bly<?>, arq> ce = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bly.i, arr.rO);
      $$0.put(bly.l, arr.rP);
      $$0.put(bly.o, arr.sl);
      $$0.put(bly.v, arr.rQ);
      $$0.put(bly.z, arr.rR);
      $$0.put(bly.B, arr.rS);
      $$0.put(bly.D, arr.rT);
      $$0.put(bly.G, arr.rU);
      $$0.put(bly.H, arr.rV);
      $$0.put(bly.R, arr.rW);
      $$0.put(bly.W, arr.rX);
      $$0.put(bly.X, arr.rY);
      $$0.put(bly.aa, arr.rZ);
      $$0.put(bly.ab, arr.sa);
      $$0.put(bly.am, arr.sb);
      $$0.put(bly.av, arr.sc);
      $$0.put(bly.ax, arr.sd);
      $$0.put(bly.ay, arr.se);
      $$0.put(bly.az, arr.sf);
      $$0.put(bly.aE, arr.sg);
      $$0.put(bly.aH, arr.sh);
      $$0.put(bly.aJ, arr.si);
      $$0.put(bly.aK, arr.sj);
      $$0.put(bly.aM, arr.sk);
      $$0.put(bly.aT, arr.sl);
      $$0.put(bly.aV, arr.sm);
      $$0.put(bly.bf, arr.sn);
      $$0.put(bly.bh, arr.so);
      $$0.put(bly.bj, arr.sp);
      $$0.put(bly.bl, arr.sq);
      $$0.put(bly.bm, arr.sr);
      $$0.put(bly.bn, arr.ss);
      $$0.put(bly.bq, arr.st);
      $$0.put(bly.br, arr.su);
      $$0.put(bly.bt, arr.sv);
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

   public byn(bly<? extends byn> $$0, cto $$1) {
      super($$0, $$1);
      this.bL = new bsg(this, 10, false);
      this.a(efb.n, -1.0F);
      this.a(efb.o, -1.0F);
      this.a(efb.x, -1.0F);
   }

   @Nullable
   @Override
   public bnd a(cud $$0, bjy $$1, bmo $$2, @Nullable bnd $$3, @Nullable sn $$4) {
      this.a(ac.a(byn.b.values(), $$0.F_()));
      if ($$3 == null) {
         $$3 = new blp.a(false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean o_() {
      return false;
   }

   @Override
   protected void B() {
      this.bO.a(0, new btz(this, 1.25));
      this.bO.a(0, new bta(this));
      this.bO.a(1, new bto(this, cfh.class, 8.0F));
      this.bO.a(2, new bul(this));
      this.bO.a(2, new bte(this, 1.0, 5.0F, 1.0F, true));
      this.bO.a(2, new byn.a(this, 1.0));
      this.bO.a(3, new btl(this));
      this.bO.a(3, new btd(this, 1.0, 3.0F, 7.0F));
   }

   public static bnp.a gk() {
      return bmm.C().a(bnq.l, 6.0).a(bnq.f, 0.4F).a(bnq.m, 0.2F);
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
   protected float b(bmw $$0, blv $$1) {
      return $$1.b * 0.6F;
   }

   @Override
   public void d_() {
      if (this.ci == null || !this.ci.a(this.dk(), 3.46) || !this.dM().a_(this.ci).a(cwr.dT)) {
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
      this.bX = aun.a(this.bX, 0.0F, 1.0F);
      if (!this.aC() && this.cf < 1.0F) {
         this.cf = 1.0F;
      }

      this.cf *= 0.9F;
      els $$0 = this.dp();
      if (!this.aC() && $$0.d < 0.0) {
         this.g($$0.d(1.0, 0.6, 1.0));
      }

      this.bW = this.bW + this.cf * 2.0F;
   }

   public static boolean a(cto $$0, blu $$1) {
      if ($$1.bx() && !$$1.aU() && $$0.z.a(2) == 0) {
         List<bmm> $$2 = $$0.a(bmm.class, $$1.cH().g(20.0), cb);
         if (!$$2.isEmpty()) {
            bmm $$3 = $$2.get($$0.z.a($$2.size()));
            if (!$$3.aU()) {
               arq $$4 = b($$3.ai());
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
   public bka b(cfh $$0, bjz $$1) {
      cmx $$2 = $$0.b($$1);
      if (!this.u() && cd.contains($$2.d())) {
         if (!$$0.fT().d) {
            $$2.h(1);
         }

         if (!this.aU()) {
            this.dM().a(null, this.dr(), this.dt(), this.dx(), arr.rL, this.db(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
         }

         if (!this.dM().B) {
            if (this.ag.a(10) == 0) {
               this.f($$0);
               this.dM().a(this, (byte)7);
            } else {
               this.dM().a(this, (byte)6);
            }
         }

         return bka.a(this.dM().B);
      } else if ($$2.a(cc)) {
         if (!$$0.fT().d) {
            $$2.h(1);
         }

         this.b(new blh(blj.s, 900));
         if ($$0.f() || !this.cr()) {
            this.a(this.dN().a($$0), Float.MAX_VALUE);
         }

         return bka.a(this.dM().B);
      } else if (!this.gr() && this.u() && this.j($$0)) {
         if (!this.dM().B) {
            this.z(!this.ge());
         }

         return bka.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean m(cmx $$0) {
      return false;
   }

   public static boolean c(bly<byn> $$0, ctp $$1, bmo $$2, hx $$3, auu $$4) {
      return $$1.a_($$3.d()).a(asg.bT) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, djg $$2, hx $$3) {
   }

   @Override
   public boolean a(bxx $$0) {
      return false;
   }

   @Nullable
   @Override
   public blp a(and $$0, blp $$1) {
      return null;
   }

   @Override
   public boolean C(blu $$0) {
      return $$0.a(this.dN().b((bmk)this), 3.0F);
   }

   @Nullable
   @Override
   public arq y() {
      return a(this.dM(), this.dM().z);
   }

   public static arq a(cto $$0, auu $$1) {
      if ($$0.ak() != bjx.a && $$1.a(1000) == 0) {
         List<bly<?>> $$2 = Lists.newArrayList(ce.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return arr.rJ;
      }
   }

   private static arq b(bly<?> $$0) {
      return ce.getOrDefault($$0, arr.rJ);
   }

   @Override
   protected arq d(bks $$0) {
      return arr.rN;
   }

   @Override
   protected arq n_() {
      return arr.rK;
   }

   @Override
   protected void b(hx $$0, djg $$1) {
      this.a(arr.sw, 0.15F, 1.0F);
   }

   @Override
   protected boolean aT() {
      return this.aa > this.cg;
   }

   @Override
   protected void aS() {
      this.a(arr.rM, 0.15F, 1.0F);
      this.cg = this.aa + this.bX / 2.0F;
   }

   @Override
   public float eX() {
      return a(this.ag);
   }

   public static float a(auu $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public ars db() {
      return ars.g;
   }

   @Override
   public boolean bu() {
      return true;
   }

   @Override
   protected void D(blu $$0) {
      if (!($$0 instanceof cfh)) {
         super.D($$0);
      }
   }

   @Override
   public boolean a(bks $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dM().B) {
            this.z(false);
         }

         return super.a($$0, $$1);
      }
   }

   public byn.b gm() {
      return byn.b.a(this.an.b(ca));
   }

   public void a(byn.b $$0) {
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
      this.a(byn.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gr() {
      return !this.aC();
   }

   @Override
   public els cJ() {
      return new els(0.0, (double)(0.5F * this.cI()), (double)(this.dg() * 0.4F));
   }

   @Override
   protected Vector3f a(blu $$0, blv $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.4375F * $$2, 0.0F);
   }

   static class a extends bus {
      public a(bmt $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected els h() {
         els $$0 = null;
         if (this.b.aZ()) {
            $$0 = bxf.a(this.b, 15, 15);
         }

         if (this.b.eg().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private els k() {
         hx $$0 = this.b.dm();
         hx.a $$1 = new hx.a();
         hx.a $$2 = new hx.a();

         for (hx $$4 : hx.b(
            aun.a(this.b.dr() - 3.0),
            aun.a(this.b.dt() - 6.0),
            aun.a(this.b.dx() - 3.0),
            aun.a(this.b.dr() + 3.0),
            aun.a(this.b.dt() + 6.0),
            aun.a(this.b.dx() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               djg $$5 = this.b.dM().a_($$2.a($$4, ic.a));
               boolean $$6 = $$5.b() instanceof day || $$5.a(asg.t);
               if ($$6 && this.b.dM().u($$4) && this.b.dM().u($$1.a($$4, ic.b))) {
                  return els.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements avj {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<byn.b> f = avj.a(byn.b::values);
      private static final IntFunction<byn.b> g = atf.a(byn.b::a, values(), atf.a.c);
      final int h;
      private final String i;

      private b(int $$0, String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static byn.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
