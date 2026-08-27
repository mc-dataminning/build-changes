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

public class bxm extends bxt implements bmj<bxm.b>, bxf {
   private static final afs<Integer> ca = afv.a(bxm.class, afu.b);
   private static final Predicate<bln> cb = new Predicate<bln>() {
      public boolean a(@Nullable bln $$0) {
         return $$0 != null && bxm.ce.containsKey($$0.ai());
      }
   };
   private static final clj cc = clr.rP;
   private static final Set<clj> cd = Sets.newHashSet(new clj[]{clr.ps, clr.rW, clr.rV, clr.vd, clr.va, clr.vb});
   static final Map<bkz<?>, aqu> ce = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bkz.i, aqv.ru);
      $$0.put(bkz.n, aqv.rQ);
      $$0.put(bkz.u, aqv.rv);
      $$0.put(bkz.y, aqv.rw);
      $$0.put(bkz.A, aqv.rx);
      $$0.put(bkz.C, aqv.ry);
      $$0.put(bkz.F, aqv.rz);
      $$0.put(bkz.G, aqv.rA);
      $$0.put(bkz.Q, aqv.rB);
      $$0.put(bkz.V, aqv.rC);
      $$0.put(bkz.W, aqv.rD);
      $$0.put(bkz.Z, aqv.rE);
      $$0.put(bkz.aa, aqv.rF);
      $$0.put(bkz.al, aqv.rG);
      $$0.put(bkz.au, aqv.rH);
      $$0.put(bkz.aw, aqv.rI);
      $$0.put(bkz.ax, aqv.rJ);
      $$0.put(bkz.ay, aqv.rK);
      $$0.put(bkz.aD, aqv.rL);
      $$0.put(bkz.aG, aqv.rM);
      $$0.put(bkz.aI, aqv.rN);
      $$0.put(bkz.aJ, aqv.rO);
      $$0.put(bkz.aL, aqv.rP);
      $$0.put(bkz.aS, aqv.rQ);
      $$0.put(bkz.aU, aqv.rR);
      $$0.put(bkz.be, aqv.rS);
      $$0.put(bkz.bg, aqv.rT);
      $$0.put(bkz.bi, aqv.rU);
      $$0.put(bkz.bj, aqv.rV);
      $$0.put(bkz.bk, aqv.rW);
      $$0.put(bkz.bl, aqv.rX);
      $$0.put(bkz.bo, aqv.rY);
      $$0.put(bkz.bp, aqv.rZ);
      $$0.put(bkz.br, aqv.sa);
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

   public bxm(bkz<? extends bxm> $$0, csf $$1) {
      super($$0, $$1);
      this.bL = new brg(this, 10, false);
      this.a(edi.n, -1.0F);
      this.a(edi.o, -1.0F);
      this.a(edi.x, -1.0F);
   }

   @Nullable
   @Override
   public bme a(csu $$0, biz $$1, blp $$2, @Nullable bme $$3, @Nullable sd $$4) {
      this.a(ac.a(bxm.b.values(), $$0.F_()));
      if ($$3 == null) {
         $$3 = new bkq.a(false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean o_() {
      return false;
   }

   @Override
   protected void B() {
      this.bO.a(0, new bsz(this, 1.25));
      this.bO.a(0, new bsa(this));
      this.bO.a(1, new bso(this, cdz.class, 8.0F));
      this.bO.a(2, new btl(this));
      this.bO.a(2, new bse(this, 1.0, 5.0F, 1.0F, true));
      this.bO.a(2, new bxm.a(this, 1.0));
      this.bO.a(3, new bsl(this));
      this.bO.a(3, new bsd(this, 1.0, 3.0F, 7.0F));
   }

   public static bmq.a gl() {
      return bln.C().a(bmr.l, 6.0).a(bmr.f, 0.4F).a(bmr.m, 0.2F);
   }

   @Override
   protected buu b(csf $$0) {
      bus $$1 = new bus(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected float b(blx $$0, bkw $$1) {
      return $$1.b * 0.6F;
   }

   @Override
   public void d_() {
      if (this.ci == null || !this.ci.a(this.dl(), 3.46) || !this.dN().a_(this.ci).a(cvh.dT)) {
         this.ch = false;
         this.ci = null;
      }

      if (this.dN().z.a(400) == 0) {
         a(this.dN(), this);
      }

      super.d_();
      this.gp();
   }

   @Override
   public void a(hx $$0, boolean $$1) {
      this.ci = $$0;
      this.ch = $$1;
   }

   public boolean gm() {
      return this.ch;
   }

   private void gp() {
      this.bZ = this.bW;
      this.bY = this.bX;
      this.bX = this.bX + (float)(!this.aC() && !this.bO() ? 4 : -1) * 0.3F;
      this.bX = atq.a(this.bX, 0.0F, 1.0F);
      if (!this.aC() && this.cf < 1.0F) {
         this.cf = 1.0F;
      }

      this.cf *= 0.9F;
      ejz $$0 = this.dq();
      if (!this.aC() && $$0.d < 0.0) {
         this.g($$0.d(1.0, 0.6, 1.0));
      }

      this.bW = this.bW + this.cf * 2.0F;
   }

   public static boolean a(csf $$0, bkv $$1) {
      if ($$1.bx() && !$$1.aU() && $$0.z.a(2) == 0) {
         List<bln> $$2 = $$0.a(bln.class, $$1.cH().g(20.0), cb);
         if (!$$2.isEmpty()) {
            bln $$3 = $$2.get($$0.z.a($$2.size()));
            if (!$$3.aU()) {
               aqu $$4 = b($$3.ai());
               $$0.a(null, $$1.ds(), $$1.du(), $$1.dy(), $$4, $$1.dc(), 0.7F, a($$0.z));
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public bjb b(cdz $$0, bja $$1) {
      clo $$2 = $$0.b($$1);
      if (!this.u() && cd.contains($$2.d())) {
         if (!$$0.fU().d) {
            $$2.h(1);
         }

         if (!this.aU()) {
            this.dN().a(null, this.ds(), this.du(), this.dy(), aqv.rr, this.dc(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
         }

         if (!this.dN().B) {
            if (this.ag.a(10) == 0) {
               this.f($$0);
               this.dN().a(this, (byte)7);
            } else {
               this.dN().a(this, (byte)6);
            }
         }

         return bjb.a(this.dN().B);
      } else if ($$2.a(cc)) {
         if (!$$0.fU().d) {
            $$2.h(1);
         }

         this.b(new bki(bkk.s, 900));
         if ($$0.f() || !this.cr()) {
            this.a(this.dO().a($$0), Float.MAX_VALUE);
         }

         return bjb.a(this.dN().B);
      } else if (!this.gs() && this.u() && this.j($$0)) {
         if (!this.dN().B) {
            this.z(!this.gf());
         }

         return bjb.a(this.dN().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean m(clo $$0) {
      return false;
   }

   public static boolean c(bkz<bxm> $$0, csg $$1, blp $$2, hx $$3, atw $$4) {
      return $$1.a_($$3.d()).a(ark.bT) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dhn $$2, hx $$3) {
   }

   @Override
   public boolean a(bww $$0) {
      return false;
   }

   @Nullable
   @Override
   public bkq a(ami $$0, bkq $$1) {
      return null;
   }

   @Override
   public boolean C(bkv $$0) {
      return $$0.a(this.dO().b((bll)this), 3.0F);
   }

   @Nullable
   @Override
   public aqu y() {
      return a(this.dN(), this.dN().z);
   }

   public static aqu a(csf $$0, atw $$1) {
      if ($$0.aj() != biy.a && $$1.a(1000) == 0) {
         List<bkz<?>> $$2 = Lists.newArrayList(ce.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return aqv.rp;
      }
   }

   private static aqu b(bkz<?> $$0) {
      return ce.getOrDefault($$0, aqv.rp);
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.rt;
   }

   @Override
   protected aqu n_() {
      return aqv.rq;
   }

   @Override
   protected void b(hx $$0, dhn $$1) {
      this.a(aqv.sb, 0.15F, 1.0F);
   }

   @Override
   protected boolean aT() {
      return this.aa > this.cg;
   }

   @Override
   protected void aS() {
      this.a(aqv.rs, 0.15F, 1.0F);
      this.cg = this.aa + this.bX / 2.0F;
   }

   @Override
   public float eY() {
      return a(this.ag);
   }

   public static float a(atw $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public aqw dc() {
      return aqw.g;
   }

   @Override
   public boolean bu() {
      return true;
   }

   @Override
   protected void D(bkv $$0) {
      if (!($$0 instanceof cdz)) {
         super.D($$0);
      }
   }

   @Override
   public boolean a(bjt $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dN().B) {
            this.z(false);
         }

         return super.a($$0, $$1);
      }
   }

   public bxm.b gn() {
      return bxm.b.a(this.an.b(ca));
   }

   public void a(bxm.b $$0) {
      this.an.b(ca, $$0.h);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(ca, 0);
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("Variant", this.gn().h);
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.a(bxm.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gs() {
      return !this.aC();
   }

   @Override
   public ejz cJ() {
      return new ejz(0.0, (double)(0.5F * this.cI()), (double)(this.dh() * 0.4F));
   }

   @Override
   protected Vector3f a(bkv $$0, bkw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.4375F * $$2, 0.0F);
   }

   static class a extends bts {
      public a(blu $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected ejz h() {
         ejz $$0 = null;
         if (this.b.aZ()) {
            $$0 = bwe.a(this.b, 15, 15);
         }

         if (this.b.eh().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private ejz k() {
         hx $$0 = this.b.dn();
         hx.a $$1 = new hx.a();
         hx.a $$2 = new hx.a();

         for (hx $$4 : hx.b(
            atq.a(this.b.ds() - 3.0),
            atq.a(this.b.du() - 6.0),
            atq.a(this.b.dy() - 3.0),
            atq.a(this.b.ds() + 3.0),
            atq.a(this.b.du() + 6.0),
            atq.a(this.b.dy() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               dhn $$5 = this.b.dN().a_($$2.a($$4, ib.a));
               boolean $$6 = $$5.b() instanceof czo || $$5.a(ark.t);
               if ($$6 && this.b.dN().t($$4) && this.b.dN().t($$1.a($$4, ib.b))) {
                  return ejz.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements auk {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<bxm.b> f = auk.a(bxm.b::values);
      private static final IntFunction<bxm.b> g = asj.a(bxm.b::a, values(), asj.a.c);
      final int h;
      private final String i;

      private b(int $$0, String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static bxm.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
