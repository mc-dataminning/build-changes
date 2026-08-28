import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cho extends chv implements bwh<cho.b>, chh {
   private static final akm<Integer> cg = akq.a(cho.class, ako.b);
   private static final Predicate<bvj> ch = new Predicate<bvj>() {
      public boolean a(@Nullable bvj $$0) {
         return $$0 != null && cho.ci.containsKey($$0.aq());
      }
   };
   static final Map<bus<?>, awm> ci = ae.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bus.o, awn.sJ);
      $$0.put(bus.q, awn.sK);
      $$0.put(bus.r, awn.sL);
      $$0.put(bus.v, awn.th);
      $$0.put(bus.D, awn.sM);
      $$0.put(bus.J, awn.sN);
      $$0.put(bus.L, awn.sO);
      $$0.put(bus.O, awn.sP);
      $$0.put(bus.N, awn.sQ);
      $$0.put(bus.R, awn.sR);
      $$0.put(bus.ac, awn.sS);
      $$0.put(bus.ah, awn.sT);
      $$0.put(bus.ai, awn.sU);
      $$0.put(bus.al, awn.sV);
      $$0.put(bus.am, awn.sW);
      $$0.put(bus.ay, awn.sX);
      $$0.put(bus.aM, awn.sY);
      $$0.put(bus.aO, awn.sZ);
      $$0.put(bus.aP, awn.ta);
      $$0.put(bus.aQ, awn.tb);
      $$0.put(bus.aV, awn.tc);
      $$0.put(bus.aY, awn.td);
      $$0.put(bus.ba, awn.te);
      $$0.put(bus.bb, awn.tf);
      $$0.put(bus.bd, awn.tg);
      $$0.put(bus.bk, awn.th);
      $$0.put(bus.bo, awn.ti);
      $$0.put(bus.by, awn.tj);
      $$0.put(bus.bA, awn.tk);
      $$0.put(bus.bC, awn.tl);
      $$0.put(bus.bE, awn.tm);
      $$0.put(bus.bF, awn.tn);
      $$0.put(bus.bG, awn.to);
      $$0.put(bus.bJ, awn.tp);
      $$0.put(bus.bK, awn.tq);
      $$0.put(bus.bM, awn.tr);
   });
   public float cc;
   public float cd;
   public float ce;
   public float cf;
   private float cj = 1.0F;
   private float ck = 1.0F;
   private boolean cl;
   @Nullable
   private jh cm;

   public cho(bus<? extends cho> $$0, dfm $$1) {
      super($$0, $$1);
      this.bP = new cbf(this, 10, false);
      this.a(esm.n, -1.0F);
      this.a(esm.o, -1.0F);
      this.a(esm.x, -1.0F);
   }

   @Nullable
   @Override
   public bwa a(dgd $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      this.a(ae.a(cho.b.values(), $$0.G_()));
      if ($$3 == null) {
         $$3 = new buc.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_() {
      return false;
   }

   @Override
   protected void B() {
      this.bS.a(0, new bwe.a(1.25));
      this.bS.a(0, new cbz(this));
      this.bS.a(1, new ccn(this, cou.class, 8.0F));
      this.bS.a(2, new cdk(this));
      this.bS.a(2, new ccd(this, 1.0, 5.0F, 1.0F));
      this.bS.a(2, new cho.a(this, 1.0));
      this.bS.a(3, new cck(this));
      this.bS.a(3, new ccc(this, 1.0, 3.0F, 7.0F));
   }

   public static bwo.a gy() {
      return cgy.gr().a(bwp.s, 6.0).a(bwp.l, 0.4F).a(bwp.v, 0.2F).a(bwp.c, 3.0);
   }

   @Override
   protected cet b(dfm $$0) {
      cer $$1 = new cer(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   public void d_() {
      if (this.cm == null || !this.cm.a(this.dt(), 3.46) || !this.dV().a_(this.cm).a(dis.dT)) {
         this.cl = false;
         this.cm = null;
      }

      if (this.dV().A.a(400) == 0) {
         a(this.dV(), this);
      }

      super.d_();
      this.gD();
   }

   @Override
   public void a(jh $$0, boolean $$1) {
      this.cm = $$0;
      this.cl = $$1;
   }

   public boolean gz() {
      return this.cl;
   }

   private void gD() {
      this.cf = this.cc;
      this.ce = this.cd;
      this.cd = this.cd + (float)(!this.aJ() && !this.bZ() ? 4 : -1) * 0.3F;
      this.cd = azm.a(this.cd, 0.0F, 1.0F);
      if (!this.aJ() && this.cj < 1.0F) {
         this.cj = 1.0F;
      }

      this.cj *= 0.9F;
      ezy $$0 = this.dy();
      if (!this.aJ() && $$0.e < 0.0) {
         this.h($$0.d(1.0, 0.6, 1.0));
      }

      this.cc = this.cc + this.cj * 2.0F;
   }

   public static boolean a(dfm $$0, bul $$1) {
      if ($$1.bL() && !$$1.bb() && $$0.A.a(2) == 0) {
         List<bvj> $$2 = $$0.a(bvj.class, $$1.cR().g(20.0), ch);
         if (!$$2.isEmpty()) {
            bvj $$3 = $$2.get($$0.A.a($$2.size()));
            if (!$$3.bb()) {
               awm $$4 = b($$3.aq());
               $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), $$4, $$1.dm(), 0.7F, a($$0.A));
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public bsk b(cou $$0, bsj $$1) {
      cwm $$2 = $$0.b($$1);
      if (!this.n() && $$2.a(axl.aB)) {
         this.a($$0, $$1, $$2);
         if (!this.bb()) {
            this.dV().a(null, this.dA(), this.dC(), this.dG(), awn.sG, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
         }

         if (!this.dV().C) {
            if (this.ae.a(10) == 0) {
               this.a($$0);
               this.dV().a(this, (byte)7);
            } else {
               this.dV().a(this, (byte)6);
            }
         }

         return bsk.a;
      } else if (!$$2.a(axl.aC)) {
         if (!this.gB() && this.n() && this.j($$0)) {
            if (!this.dV().C) {
               this.z(!this.gm());
            }

            return bsk.a;
         } else {
            return super.b($$0, $$1);
         }
      } else {
         this.a($$0, $$1, $$2);
         this.a(new btq(bts.s, 900));
         if ($$0.b() || !this.cC()) {
            this.a(this.dW().a($$0), Float.MAX_VALUE);
         }

         return bsk.a;
      }
   }

   @Override
   public boolean j(cwm $$0) {
      return false;
   }

   public static boolean c(bus<cho> $$0, dfn $$1, bur $$2, jh $$3, azu $$4) {
      return $$1.a_($$3.e()).a(axc.cc) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dvv $$2, jh $$3) {
   }

   @Override
   public boolean a(cgy $$0) {
      return false;
   }

   @Nullable
   @Override
   public buc a(arp $$0, buc $$1) {
      return null;
   }

   @Nullable
   @Override
   public awm t() {
      return a(this.dV(), this.dV().A);
   }

   public static awm a(dfm $$0, azu $$1) {
      if ($$0.ak() != bsh.a && $$1.a(1000) == 0) {
         List<bus<?>> $$2 = Lists.newArrayList(ci.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return awn.sE;
      }
   }

   private static awm b(bus<?> $$0) {
      return ci.getOrDefault($$0, awn.sE);
   }

   @Override
   protected awm e(btb $$0) {
      return awn.sI;
   }

   @Override
   protected awm n_() {
      return awn.sF;
   }

   @Override
   protected void b(jh $$0, dvv $$1) {
      this.a(awn.ts, 0.15F, 1.0F);
   }

   @Override
   protected boolean ba() {
      return this.Y > this.ck;
   }

   @Override
   protected void aZ() {
      this.a(awn.sH, 0.15F, 1.0F);
      this.ck = this.Y + this.cd / 2.0F;
   }

   @Override
   public float ff() {
      return a(this.ae);
   }

   public static float a(azu $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public awo dm() {
      return awo.g;
   }

   @Override
   public boolean bI() {
      return true;
   }

   @Override
   protected void D(bul $$0) {
      if (!($$0 instanceof cou)) {
         super.D($$0);
      }
   }

   @Override
   public boolean a(arp $$0, btb $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.z(false);
         return super.a($$0, $$1, $$2);
      }
   }

   public cho.b gA() {
      return cho.b.a(this.al.a(cg));
   }

   public void a(cho.b $$0) {
      this.al.a(cg, $$0.h);
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(cg, 0);
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("Variant", this.gA().h);
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      this.a(cho.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gB() {
      return !this.aJ();
   }

   @Override
   protected boolean gq() {
      return true;
   }

   @Override
   public ezy cT() {
      return new ezy(0.0, (double)(0.5F * this.cS()), (double)(this.dq() * 0.4F));
   }

   static class a extends cdr {
      public a(bvp $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected ezy h() {
         ezy $$0 = null;
         if (this.b.bj()) {
            $$0 = cgf.a(this.b, 15, 15);
         }

         if (this.b.dY().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private ezy k() {
         jh $$0 = this.b.dv();
         jh.a $$1 = new jh.a();
         jh.a $$2 = new jh.a();

         for (jh $$4 : jh.b(
            azm.a(this.b.dA() - 3.0),
            azm.a(this.b.dC() - 6.0),
            azm.a(this.b.dG() - 3.0),
            azm.a(this.b.dA() + 3.0),
            azm.a(this.b.dC() + 6.0),
            azm.a(this.b.dG() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               dvv $$5 = this.b.dV().a_($$2.a($$4, jm.a));
               boolean $$6 = $$5.b() instanceof dmz || $$5.a(axc.u);
               if ($$6 && this.b.dV().u($$4) && this.b.dV().u($$1.a($$4, jm.b))) {
                  return ezy.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements bai {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<cho.b> f = bai.a(cho.b::values);
      private static final IntFunction<cho.b> g = ayd.a(cho.b::a, values(), ayd.a.c);
      final int h;
      private final String i;

      private b(final int $$0, final String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static cho.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
