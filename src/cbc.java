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

public class cbc extends cbj implements bpw<cbc.b>, cav {
   private static final aii<Integer> cc = ail.a(cbc.class, aik.b);
   private static final Predicate<boz> cd = new Predicate<boz>() {
      public boolean a(@Nullable boz $$0) {
         return $$0 != null && cbc.cg.containsKey($$0.ai());
      }
   };
   private static final cpl ce = cpt.rR;
   private static final Set<cpl> cf = Sets.newHashSet(new cpl[]{cpt.pu, cpt.rY, cpt.rX, cpt.vh, cpt.ve, cpt.vf});
   static final Map<bol<?>, ato> cg = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bol.j, atp.se);
      $$0.put(bol.m, atp.sf);
      $$0.put(bol.p, atp.sB);
      $$0.put(bol.w, atp.sg);
      $$0.put(bol.A, atp.sh);
      $$0.put(bol.C, atp.si);
      $$0.put(bol.E, atp.sj);
      $$0.put(bol.H, atp.sk);
      $$0.put(bol.I, atp.sl);
      $$0.put(bol.S, atp.sm);
      $$0.put(bol.X, atp.sn);
      $$0.put(bol.Y, atp.so);
      $$0.put(bol.ab, atp.sp);
      $$0.put(bol.ac, atp.sq);
      $$0.put(bol.an, atp.sr);
      $$0.put(bol.aw, atp.ss);
      $$0.put(bol.ay, atp.st);
      $$0.put(bol.az, atp.su);
      $$0.put(bol.aA, atp.sv);
      $$0.put(bol.aF, atp.sw);
      $$0.put(bol.aI, atp.sx);
      $$0.put(bol.aK, atp.sy);
      $$0.put(bol.aL, atp.sz);
      $$0.put(bol.aN, atp.sA);
      $$0.put(bol.aU, atp.sB);
      $$0.put(bol.aW, atp.sC);
      $$0.put(bol.bg, atp.sD);
      $$0.put(bol.bi, atp.sE);
      $$0.put(bol.bk, atp.sF);
      $$0.put(bol.bm, atp.sG);
      $$0.put(bol.bn, atp.sH);
      $$0.put(bol.bo, atp.sI);
      $$0.put(bol.br, atp.sJ);
      $$0.put(bol.bs, atp.sK);
      $$0.put(bol.bu, atp.sL);
   });
   public float bY;
   public float bZ;
   public float ca;
   public float cb;
   private float ch = 1.0F;
   private float ci = 1.0F;
   private boolean cj;
   @Nullable
   private ib ck;

   public cbc(bol<? extends cbc> $$0, cwe $$1) {
      super($$0, $$1);
      this.bM = new buu(this, 10, false);
      this.a(eic.n, -1.0F);
      this.a(eic.o, -1.0F);
      this.a(eic.x, -1.0F);
   }

   @Nullable
   @Override
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      this.a(ac.a(cbc.b.values(), $$0.F_()));
      if ($$3 == null) {
         $$3 = new boa.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean o_() {
      return false;
   }

   @Override
   protected void B() {
      this.bP.a(0, new bwn(this, 1.25));
      this.bP.a(0, new bvo(this));
      this.bP.a(1, new bwc(this, cia.class, 8.0F));
      this.bP.a(2, new bwz(this));
      this.bP.a(2, new bvs(this, 1.0, 5.0F, 1.0F, true));
      this.bP.a(2, new cbc.a(this, 1.0));
      this.bP.a(3, new bvz(this));
      this.bP.a(3, new bvr(this, 1.0, 3.0F, 7.0F));
   }

   public static bqd.a gr() {
      return boz.C().a(bqe.n, 6.0).a(bqe.h, 0.4F).a(bqe.o, 0.2F);
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
   public void d_() {
      if (this.ck == null || !this.ck.a(this.dh(), 3.46) || !this.dJ().a_(this.ck).a(czh.dT)) {
         this.cj = false;
         this.ck = null;
      }

      if (this.dJ().z.a(400) == 0) {
         a(this.dJ(), this);
      }

      super.d_();
      this.gv();
   }

   @Override
   public void a(ib $$0, boolean $$1) {
      this.ck = $$0;
      this.cj = $$1;
   }

   public boolean gs() {
      return this.cj;
   }

   private void gv() {
      this.cb = this.bY;
      this.ca = this.bZ;
      this.bZ = this.bZ + (float)(!this.aC() && !this.bL() ? 4 : -1) * 0.3F;
      this.bZ = awm.a(this.bZ, 0.0F, 1.0F);
      if (!this.aC() && this.ch < 1.0F) {
         this.ch = 1.0F;
      }

      this.ch *= 0.9F;
      eov $$0 = this.dm();
      if (!this.aC() && $$0.d < 0.0) {
         this.g($$0.d(1.0, 0.6, 1.0));
      }

      this.bY = this.bY + this.ch * 2.0F;
   }

   public static boolean a(cwe $$0, bof $$1) {
      if ($$1.bx() && !$$1.aU() && $$0.z.a(2) == 0) {
         List<boz> $$2 = $$0.a(boz.class, $$1.cE().g(20.0), cd);
         if (!$$2.isEmpty()) {
            boz $$3 = $$2.get($$0.z.a($$2.size()));
            if (!$$3.aU()) {
               ato $$4 = b($$3.ai());
               $$0.a(null, $$1.do(), $$1.dq(), $$1.du(), $$4, $$1.cY(), 0.7F, a($$0.z));
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public bml b(cia $$0, bmk $$1) {
      cpq $$2 = $$0.b($$1);
      if (!this.u() && cf.contains($$2.d())) {
         if (!$$0.fW().d) {
            $$2.h(1);
         }

         if (!this.aU()) {
            this.dJ().a(null, this.do(), this.dq(), this.du(), atp.sb, this.cY(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
         }

         if (!this.dJ().B) {
            if (this.af.a(10) == 0) {
               this.f($$0);
               this.dJ().a(this, (byte)7);
            } else {
               this.dJ().a(this, (byte)6);
            }
         }

         return bml.a(this.dJ().B);
      } else if ($$2.a(ce)) {
         if (!$$0.fW().d) {
            $$2.h(1);
         }

         this.b(new bns(bnu.s, 900));
         if ($$0.f() || !this.co()) {
            this.a(this.dK().a($$0), Float.MAX_VALUE);
         }

         return bml.a(this.dJ().B);
      } else if (!this.gy() && this.u() && this.j($$0)) {
         if (!this.dJ().B) {
            this.z(!this.gl());
         }

         return bml.a(this.dJ().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean o(cpq $$0) {
      return false;
   }

   public static boolean c(bol<cbc> $$0, cwf $$1, bpb $$2, ib $$3, awt $$4) {
      return $$1.a_($$3.d()).a(aue.bU) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dme $$2, ib $$3) {
   }

   @Override
   public boolean a(cam $$0) {
      return false;
   }

   @Nullable
   @Override
   public boa a(apa $$0, boa $$1) {
      return null;
   }

   @Override
   public boolean B(bof $$0) {
      return $$0.a(this.dK().b((box)this), 3.0F);
   }

   @Nullable
   @Override
   public ato y() {
      return a(this.dJ(), this.dJ().z);
   }

   public static ato a(cwe $$0, awt $$1) {
      if ($$0.aj() != bmi.a && $$1.a(1000) == 0) {
         List<bol<?>> $$2 = Lists.newArrayList(cg.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return atp.rZ;
      }
   }

   private static ato b(bol<?> $$0) {
      return cg.getOrDefault($$0, atp.rZ);
   }

   @Override
   protected ato d(bne $$0) {
      return atp.sd;
   }

   @Override
   protected ato n_() {
      return atp.sa;
   }

   @Override
   protected void b(ib $$0, dme $$1) {
      this.a(atp.sM, 0.15F, 1.0F);
   }

   @Override
   protected boolean aT() {
      return this.Z > this.ci;
   }

   @Override
   protected void aS() {
      this.a(atp.sc, 0.15F, 1.0F);
      this.ci = this.Z + this.bZ / 2.0F;
   }

   @Override
   public float eZ() {
      return a(this.af);
   }

   public static float a(awt $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public atq cY() {
      return atq.g;
   }

   @Override
   public boolean bu() {
      return true;
   }

   @Override
   protected void C(bof $$0) {
      if (!($$0 instanceof cia)) {
         super.C($$0);
      }
   }

   @Override
   public boolean a(bne $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dJ().B) {
            this.z(false);
         }

         return super.a($$0, $$1);
      }
   }

   public cbc.b gt() {
      return cbc.b.a(this.am.b(cc));
   }

   public void a(cbc.b $$0) {
      this.am.b(cc, $$0.h);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(cc, 0);
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("Variant", this.gt().h);
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      this.a(cbc.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gy() {
      return !this.aC();
   }

   @Override
   public eov cG() {
      return new eov(0.0, (double)(0.5F * this.cF()), (double)(this.dd() * 0.4F));
   }

   static class a extends bxg {
      public a(bpf $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected eov h() {
         eov $$0 = null;
         if (this.b.aZ()) {
            $$0 = bzu.a(this.b, 15, 15);
         }

         if (this.b.ef().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private eov k() {
         ib $$0 = this.b.dj();
         ib.a $$1 = new ib.a();
         ib.a $$2 = new ib.a();

         for (ib $$4 : ib.b(
            awm.a(this.b.do() - 3.0),
            awm.a(this.b.dq() - 6.0),
            awm.a(this.b.du() - 3.0),
            awm.a(this.b.do() + 3.0),
            awm.a(this.b.dq() + 6.0),
            awm.a(this.b.du() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               dme $$5 = this.b.dJ().a_($$2.a($$4, ih.a));
               boolean $$6 = $$5.b() instanceof ddo || $$5.a(aue.t);
               if ($$6 && this.b.dJ().u($$4) && this.b.dJ().u($$1.a($$4, ih.b))) {
                  return eov.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements axg {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<cbc.b> f = axg.a(cbc.b::values);
      private static final IntFunction<cbc.b> g = ave.a(cbc.b::a, values(), ave.a.c);
      final int h;
      private final String i;

      private b(int $$0, String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static cbc.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
