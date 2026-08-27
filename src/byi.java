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

public class byi extends byp implements bnd<byi.b>, byb {
   private static final agj<Integer> ca = agm.a(byi.class, agl.b);
   private static final Predicate<bmh> cb = new Predicate<bmh>() {
      public boolean a(@Nullable bmh $$0) {
         return $$0 != null && byi.ce.containsKey($$0.ai());
      }
   };
   private static final cmm cc = cmu.rP;
   private static final Set<cmm> cd = Sets.newHashSet(new cmm[]{cmu.ps, cmu.rW, cmu.rV, cmu.ve, cmu.vb, cmu.vc});
   static final Map<blt<?>, arl> ce = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(blt.i, arm.rO);
      $$0.put(blt.l, arm.rP);
      $$0.put(blt.o, arm.sl);
      $$0.put(blt.v, arm.rQ);
      $$0.put(blt.z, arm.rR);
      $$0.put(blt.B, arm.rS);
      $$0.put(blt.D, arm.rT);
      $$0.put(blt.G, arm.rU);
      $$0.put(blt.H, arm.rV);
      $$0.put(blt.R, arm.rW);
      $$0.put(blt.W, arm.rX);
      $$0.put(blt.X, arm.rY);
      $$0.put(blt.aa, arm.rZ);
      $$0.put(blt.ab, arm.sa);
      $$0.put(blt.am, arm.sb);
      $$0.put(blt.av, arm.sc);
      $$0.put(blt.ax, arm.sd);
      $$0.put(blt.ay, arm.se);
      $$0.put(blt.az, arm.sf);
      $$0.put(blt.aE, arm.sg);
      $$0.put(blt.aH, arm.sh);
      $$0.put(blt.aJ, arm.si);
      $$0.put(blt.aK, arm.sj);
      $$0.put(blt.aM, arm.sk);
      $$0.put(blt.aT, arm.sl);
      $$0.put(blt.aV, arm.sm);
      $$0.put(blt.bf, arm.sn);
      $$0.put(blt.bh, arm.so);
      $$0.put(blt.bj, arm.sp);
      $$0.put(blt.bl, arm.sq);
      $$0.put(blt.bm, arm.sr);
      $$0.put(blt.bn, arm.ss);
      $$0.put(blt.bq, arm.st);
      $$0.put(blt.br, arm.su);
      $$0.put(blt.bt, arm.sv);
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

   public byi(blt<? extends byi> $$0, cti $$1) {
      super($$0, $$1);
      this.bL = new bsb(this, 10, false);
      this.a(eev.n, -1.0F);
      this.a(eev.o, -1.0F);
      this.a(eev.x, -1.0F);
   }

   @Nullable
   @Override
   public bmy a(ctx $$0, bjt $$1, bmj $$2, @Nullable bmy $$3, @Nullable sl $$4) {
      this.a(ac.a(byi.b.values(), $$0.F_()));
      if ($$3 == null) {
         $$3 = new blk.a(false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean o_() {
      return false;
   }

   @Override
   protected void B() {
      this.bO.a(0, new btu(this, 1.25));
      this.bO.a(0, new bsv(this));
      this.bO.a(1, new btj(this, cfb.class, 8.0F));
      this.bO.a(2, new bug(this));
      this.bO.a(2, new bsz(this, 1.0, 5.0F, 1.0F, true));
      this.bO.a(2, new byi.a(this, 1.0));
      this.bO.a(3, new btg(this));
      this.bO.a(3, new bsy(this, 1.0, 3.0F, 7.0F));
   }

   public static bnk.a gk() {
      return bmh.C().a(bnl.l, 6.0).a(bnl.f, 0.4F).a(bnl.m, 0.2F);
   }

   @Override
   protected bvp b(cti $$0) {
      bvn $$1 = new bvn(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected float b(bmr $$0, blq $$1) {
      return $$1.b * 0.6F;
   }

   @Override
   public void d_() {
      if (this.ci == null || !this.ci.a(this.dk(), 3.46) || !this.dM().a_(this.ci).a(cwl.dT)) {
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
      this.bX = aui.a(this.bX, 0.0F, 1.0F);
      if (!this.aC() && this.cf < 1.0F) {
         this.cf = 1.0F;
      }

      this.cf *= 0.9F;
      elm $$0 = this.dp();
      if (!this.aC() && $$0.d < 0.0) {
         this.g($$0.d(1.0, 0.6, 1.0));
      }

      this.bW = this.bW + this.cf * 2.0F;
   }

   public static boolean a(cti $$0, blp $$1) {
      if ($$1.bx() && !$$1.aU() && $$0.z.a(2) == 0) {
         List<bmh> $$2 = $$0.a(bmh.class, $$1.cH().g(20.0), cb);
         if (!$$2.isEmpty()) {
            bmh $$3 = $$2.get($$0.z.a($$2.size()));
            if (!$$3.aU()) {
               arl $$4 = b($$3.ai());
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
   public bjv b(cfb $$0, bju $$1) {
      cmr $$2 = $$0.b($$1);
      if (!this.u() && cd.contains($$2.d())) {
         if (!$$0.fT().d) {
            $$2.h(1);
         }

         if (!this.aU()) {
            this.dM().a(null, this.dr(), this.dt(), this.dx(), arm.rL, this.db(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
         }

         if (!this.dM().B) {
            if (this.ag.a(10) == 0) {
               this.f($$0);
               this.dM().a(this, (byte)7);
            } else {
               this.dM().a(this, (byte)6);
            }
         }

         return bjv.a(this.dM().B);
      } else if ($$2.a(cc)) {
         if (!$$0.fT().d) {
            $$2.h(1);
         }

         this.b(new blc(ble.s, 900));
         if ($$0.f() || !this.cr()) {
            this.a(this.dN().a($$0), Float.MAX_VALUE);
         }

         return bjv.a(this.dM().B);
      } else if (!this.gr() && this.u() && this.j($$0)) {
         if (!this.dM().B) {
            this.z(!this.ge());
         }

         return bjv.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean m(cmr $$0) {
      return false;
   }

   public static boolean c(blt<byi> $$0, ctj $$1, bmj $$2, hx $$3, aup $$4) {
      return $$1.a_($$3.d()).a(asb.bT) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dja $$2, hx $$3) {
   }

   @Override
   public boolean a(bxs $$0) {
      return false;
   }

   @Nullable
   @Override
   public blk a(amz $$0, blk $$1) {
      return null;
   }

   @Override
   public boolean C(blp $$0) {
      return $$0.a(this.dN().b((bmf)this), 3.0F);
   }

   @Nullable
   @Override
   public arl y() {
      return a(this.dM(), this.dM().z);
   }

   public static arl a(cti $$0, aup $$1) {
      if ($$0.ak() != bjs.a && $$1.a(1000) == 0) {
         List<blt<?>> $$2 = Lists.newArrayList(ce.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return arm.rJ;
      }
   }

   private static arl b(blt<?> $$0) {
      return ce.getOrDefault($$0, arm.rJ);
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.rN;
   }

   @Override
   protected arl n_() {
      return arm.rK;
   }

   @Override
   protected void b(hx $$0, dja $$1) {
      this.a(arm.sw, 0.15F, 1.0F);
   }

   @Override
   protected boolean aT() {
      return this.aa > this.cg;
   }

   @Override
   protected void aS() {
      this.a(arm.rM, 0.15F, 1.0F);
      this.cg = this.aa + this.bX / 2.0F;
   }

   @Override
   public float eX() {
      return a(this.ag);
   }

   public static float a(aup $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public arn db() {
      return arn.g;
   }

   @Override
   public boolean bu() {
      return true;
   }

   @Override
   protected void D(blp $$0) {
      if (!($$0 instanceof cfb)) {
         super.D($$0);
      }
   }

   @Override
   public boolean a(bkn $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dM().B) {
            this.z(false);
         }

         return super.a($$0, $$1);
      }
   }

   public byi.b gm() {
      return byi.b.a(this.an.b(ca));
   }

   public void a(byi.b $$0) {
      this.an.b(ca, $$0.h);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(ca, 0);
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      $$0.a("Variant", this.gm().h);
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      this.a(byi.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gr() {
      return !this.aC();
   }

   @Override
   public elm cJ() {
      return new elm(0.0, (double)(0.5F * this.cI()), (double)(this.dg() * 0.4F));
   }

   @Override
   protected Vector3f a(blp $$0, blq $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.4375F * $$2, 0.0F);
   }

   static class a extends bun {
      public a(bmo $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected elm h() {
         elm $$0 = null;
         if (this.b.aZ()) {
            $$0 = bxa.a(this.b, 15, 15);
         }

         if (this.b.eg().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private elm k() {
         hx $$0 = this.b.dm();
         hx.a $$1 = new hx.a();
         hx.a $$2 = new hx.a();

         for (hx $$4 : hx.b(
            aui.a(this.b.dr() - 3.0),
            aui.a(this.b.dt() - 6.0),
            aui.a(this.b.dx() - 3.0),
            aui.a(this.b.dr() + 3.0),
            aui.a(this.b.dt() + 6.0),
            aui.a(this.b.dx() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               dja $$5 = this.b.dM().a_($$2.a($$4, ic.a));
               boolean $$6 = $$5.b() instanceof das || $$5.a(asb.t);
               if ($$6 && this.b.dM().u($$4) && this.b.dM().u($$1.a($$4, ic.b))) {
                  return elm.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements ave {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<byi.b> f = ave.a(byi.b::values);
      private static final IntFunction<byi.b> g = ata.a(byi.b::a, values(), ata.a.c);
      final int h;
      private final String i;

      private b(int $$0, String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static byi.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
