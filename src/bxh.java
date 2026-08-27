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

public class bxh extends bxo implements bme<bxh.b>, bxa {
   private static final afo<Integer> ca = afr.a(bxh.class, afq.b);
   private static final Predicate<bli> cb = new Predicate<bli>() {
      public boolean a(@Nullable bli $$0) {
         return $$0 != null && bxh.ce.containsKey($$0.ai());
      }
   };
   private static final cle cc = clm.rP;
   private static final Set<cle> cd = Sets.newHashSet(new cle[]{clm.ps, clm.rW, clm.rV, clm.vd, clm.va, clm.vb});
   static final Map<bku<?>, aqq> ce = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bku.i, aqr.ru);
      $$0.put(bku.n, aqr.rQ);
      $$0.put(bku.u, aqr.rv);
      $$0.put(bku.y, aqr.rw);
      $$0.put(bku.A, aqr.rx);
      $$0.put(bku.C, aqr.ry);
      $$0.put(bku.F, aqr.rz);
      $$0.put(bku.G, aqr.rA);
      $$0.put(bku.Q, aqr.rB);
      $$0.put(bku.V, aqr.rC);
      $$0.put(bku.W, aqr.rD);
      $$0.put(bku.Z, aqr.rE);
      $$0.put(bku.aa, aqr.rF);
      $$0.put(bku.al, aqr.rG);
      $$0.put(bku.au, aqr.rH);
      $$0.put(bku.aw, aqr.rI);
      $$0.put(bku.ax, aqr.rJ);
      $$0.put(bku.ay, aqr.rK);
      $$0.put(bku.aD, aqr.rL);
      $$0.put(bku.aG, aqr.rM);
      $$0.put(bku.aI, aqr.rN);
      $$0.put(bku.aJ, aqr.rO);
      $$0.put(bku.aL, aqr.rP);
      $$0.put(bku.aS, aqr.rQ);
      $$0.put(bku.aU, aqr.rR);
      $$0.put(bku.be, aqr.rS);
      $$0.put(bku.bg, aqr.rT);
      $$0.put(bku.bi, aqr.rU);
      $$0.put(bku.bj, aqr.rV);
      $$0.put(bku.bk, aqr.rW);
      $$0.put(bku.bl, aqr.rX);
      $$0.put(bku.bo, aqr.rY);
      $$0.put(bku.bp, aqr.rZ);
      $$0.put(bku.br, aqr.sa);
   });
   public float bW;
   public float bX;
   public float bY;
   public float bZ;
   private float cf = 1.0F;
   private float cg = 1.0F;
   private boolean ch;
   @Nullable
   private ht ci;

   public bxh(bku<? extends bxh> $$0, csa $$1) {
      super($$0, $$1);
      this.bL = new brb(this, 10, false);
      this.a(edd.n, -1.0F);
      this.a(edd.o, -1.0F);
      this.a(edd.x, -1.0F);
   }

   @Nullable
   @Override
   public blz a(csp $$0, biv $$1, blk $$2, @Nullable blz $$3, @Nullable rz $$4) {
      this.a(ac.a(bxh.b.values(), $$0.E_()));
      if ($$3 == null) {
         $$3 = new bkl.a(false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean n_() {
      return false;
   }

   @Override
   protected void B() {
      this.bO.a(0, new bsu(this, 1.25));
      this.bO.a(0, new brv(this));
      this.bO.a(1, new bsj(this, cdu.class, 8.0F));
      this.bO.a(2, new btg(this));
      this.bO.a(2, new brz(this, 1.0, 5.0F, 1.0F, true));
      this.bO.a(2, new bxh.a(this, 1.0));
      this.bO.a(3, new bsg(this));
      this.bO.a(3, new bry(this, 1.0, 3.0F, 7.0F));
   }

   public static bml.a gl() {
      return bli.C().a(bmm.l, 6.0).a(bmm.f, 0.4F).a(bmm.m, 0.2F);
   }

   @Override
   protected bup b(csa $$0) {
      bun $$1 = new bun(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected float b(bls $$0, bkr $$1) {
      return $$1.b * 0.6F;
   }

   @Override
   public void c_() {
      if (this.ci == null || !this.ci.a(this.dl(), 3.46) || !this.dN().a_(this.ci).a(cvc.dT)) {
         this.ch = false;
         this.ci = null;
      }

      if (this.dN().z.a(400) == 0) {
         a(this.dN(), this);
      }

      super.c_();
      this.gp();
   }

   @Override
   public void a(ht $$0, boolean $$1) {
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
      this.bX = atm.a(this.bX, 0.0F, 1.0F);
      if (!this.aC() && this.cf < 1.0F) {
         this.cf = 1.0F;
      }

      this.cf *= 0.9F;
      eju $$0 = this.dq();
      if (!this.aC() && $$0.d < 0.0) {
         this.g($$0.d(1.0, 0.6, 1.0));
      }

      this.bW = this.bW + this.cf * 2.0F;
   }

   public static boolean a(csa $$0, bkq $$1) {
      if ($$1.bx() && !$$1.aU() && $$0.z.a(2) == 0) {
         List<bli> $$2 = $$0.a(bli.class, $$1.cH().g(20.0), cb);
         if (!$$2.isEmpty()) {
            bli $$3 = $$2.get($$0.z.a($$2.size()));
            if (!$$3.aU()) {
               aqq $$4 = b($$3.ai());
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
   public bix b(cdu $$0, biw $$1) {
      clj $$2 = $$0.b($$1);
      if (!this.u() && cd.contains($$2.d())) {
         if (!$$0.fU().d) {
            $$2.h(1);
         }

         if (!this.aU()) {
            this.dN().a(null, this.ds(), this.du(), this.dy(), aqr.rr, this.dc(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
         }

         if (!this.dN().B) {
            if (this.ag.a(10) == 0) {
               this.f($$0);
               this.dN().a(this, (byte)7);
            } else {
               this.dN().a(this, (byte)6);
            }
         }

         return bix.a(this.dN().B);
      } else if ($$2.a(cc)) {
         if (!$$0.fU().d) {
            $$2.h(1);
         }

         this.b(new bkd(bkf.s, 900));
         if ($$0.f() || !this.cr()) {
            this.a(this.dO().a($$0), Float.MAX_VALUE);
         }

         return bix.a(this.dN().B);
      } else if (!this.gs() && this.u() && this.j($$0)) {
         if (!this.dN().B) {
            this.z(!this.gf());
         }

         return bix.a(this.dN().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean m(clj $$0) {
      return false;
   }

   public static boolean c(bku<bxh> $$0, csb $$1, blk $$2, ht $$3, ats $$4) {
      return $$1.a_($$3.d()).a(arg.bT) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dhi $$2, ht $$3) {
   }

   @Override
   public boolean a(bwr $$0) {
      return false;
   }

   @Nullable
   @Override
   public bkl a(ame $$0, bkl $$1) {
      return null;
   }

   @Override
   public boolean C(bkq $$0) {
      return $$0.a(this.dO().b((blg)this), 3.0F);
   }

   @Nullable
   @Override
   public aqq y() {
      return a(this.dN(), this.dN().z);
   }

   public static aqq a(csa $$0, ats $$1) {
      if ($$0.aj() != biu.a && $$1.a(1000) == 0) {
         List<bku<?>> $$2 = Lists.newArrayList(ce.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return aqr.rp;
      }
   }

   private static aqq b(bku<?> $$0) {
      return ce.getOrDefault($$0, aqr.rp);
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.rt;
   }

   @Override
   protected aqq m_() {
      return aqr.rq;
   }

   @Override
   protected void b(ht $$0, dhi $$1) {
      this.a(aqr.sb, 0.15F, 1.0F);
   }

   @Override
   protected boolean aT() {
      return this.aa > this.cg;
   }

   @Override
   protected void aS() {
      this.a(aqr.rs, 0.15F, 1.0F);
      this.cg = this.aa + this.bX / 2.0F;
   }

   @Override
   public float eY() {
      return a(this.ag);
   }

   public static float a(ats $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public aqs dc() {
      return aqs.g;
   }

   @Override
   public boolean bu() {
      return true;
   }

   @Override
   protected void D(bkq $$0) {
      if (!($$0 instanceof cdu)) {
         super.D($$0);
      }
   }

   @Override
   public boolean a(bjo $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dN().B) {
            this.z(false);
         }

         return super.a($$0, $$1);
      }
   }

   public bxh.b gn() {
      return bxh.b.a(this.an.b(ca));
   }

   public void a(bxh.b $$0) {
      this.an.b(ca, $$0.h);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(ca, 0);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("Variant", this.gn().h);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.a(bxh.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gs() {
      return !this.aC();
   }

   @Override
   public eju cJ() {
      return new eju(0.0, (double)(0.5F * this.cI()), (double)(this.dh() * 0.4F));
   }

   @Override
   protected Vector3f a(bkq $$0, bkr $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.4375F * $$2, 0.0F);
   }

   static class a extends btn {
      public a(blp $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected eju h() {
         eju $$0 = null;
         if (this.b.aZ()) {
            $$0 = bvz.a(this.b, 15, 15);
         }

         if (this.b.eh().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private eju k() {
         ht $$0 = this.b.dn();
         ht.a $$1 = new ht.a();
         ht.a $$2 = new ht.a();

         for (ht $$4 : ht.b(
            atm.a(this.b.ds() - 3.0),
            atm.a(this.b.du() - 6.0),
            atm.a(this.b.dy() - 3.0),
            atm.a(this.b.ds() + 3.0),
            atm.a(this.b.du() + 6.0),
            atm.a(this.b.dy() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               dhi $$5 = this.b.dN().a_($$2.a($$4, hx.a));
               boolean $$6 = $$5.b() instanceof czj || $$5.a(arg.t);
               if ($$6 && this.b.dN().t($$4) && this.b.dN().t($$1.a($$4, hx.b))) {
                  return eju.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements aug {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<bxh.b> f = aug.a(bxh.b::values);
      private static final IntFunction<bxh.b> g = asf.a(bxh.b::a, values(), asf.a.c);
      final int h;
      private final String i;

      private b(int $$0, String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static bxh.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
