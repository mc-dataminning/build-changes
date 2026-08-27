import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ceu extends cfb implements btn<ceu.b>, cen {
   private static final ajy<Integer> co = akc.a(ceu.class, aka.b);
   private static final Predicate<bsq> cp = new Predicate<bsq>() {
      public boolean a(@Nullable bsq $$0) {
         return $$0 != null && ceu.cq.containsKey($$0.ak());
      }
   };
   static final Map<bsb<?>, avn> cq = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bsb.k, avo.tf);
      $$0.put(bsb.n, avo.tg);
      $$0.put(bsb.o, avo.th);
      $$0.put(bsb.s, avo.tD);
      $$0.put(bsb.z, avo.ti);
      $$0.put(bsb.D, avo.tj);
      $$0.put(bsb.F, avo.tk);
      $$0.put(bsb.bh, avo.tp);
      $$0.put(bsb.aE, avo.tk);
      $$0.put(bsb.H, avo.tl);
      $$0.put(bsb.K, avo.tm);
      $$0.put(bsb.L, avo.tn);
      $$0.put(bsb.V, avo.to);
      $$0.put(bsb.aa, avo.tp);
      $$0.put(bsb.ab, avo.tq);
      $$0.put(bsb.ae, avo.tr);
      $$0.put(bsb.af, avo.ts);
      $$0.put(bsb.aq, avo.tt);
      $$0.put(bsb.az, avo.tu);
      $$0.put(bsb.aB, avo.tv);
      $$0.put(bsb.aC, avo.tw);
      $$0.put(bsb.aD, avo.tx);
      $$0.put(bsb.aJ, avo.ty);
      $$0.put(bsb.aM, avo.tz);
      $$0.put(bsb.aO, avo.tA);
      $$0.put(bsb.aP, avo.tB);
      $$0.put(bsb.aR, avo.tC);
      $$0.put(bsb.aZ, avo.tD);
      $$0.put(bsb.bb, avo.tE);
      $$0.put(bsb.bm, avo.tF);
      $$0.put(bsb.bo, avo.tG);
      $$0.put(bsb.bq, avo.tH);
      $$0.put(bsb.bs, avo.tI);
      $$0.put(bsb.bt, avo.tJ);
      $$0.put(bsb.bu, avo.tK);
      $$0.put(bsb.bx, avo.tL);
      $$0.put(bsb.by, avo.tM);
      $$0.put(bsb.bB, avo.tN);
   });
   public float ck;
   public float cl;
   public float cm;
   public float cn;
   private float cr = 1.0F;
   private float cs = 1.0F;
   private boolean ct;
   @Nullable
   private ir cu;

   public ceu(bsb<? extends ceu> $$0, dca $$1) {
      super($$0, $$1);
      this.bY = new byl(this, 10, false);
      this.a(epv.n, -1.0F);
      this.a(epv.o, -1.0F);
      this.a(epv.x, -1.0F);
   }

   @Nullable
   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      this.a(ad.a(ceu.b.values(), $$0.F_()));
      if ($$3 == null) {
         $$3 = new brp.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean o_() {
      return false;
   }

   @Override
   protected void y() {
      this.cb.a(0, new cae(this, 1.25));
      this.cb.a(0, new bzf(this));
      this.cb.a(1, new bzt(this, cly.class, 8.0F));
      this.cb.a(2, new caq(this));
      this.cb.a(2, new bzj(this, 1.0, 5.0F, 1.0F, true));
      this.cb.a(2, new ceu.a(this, 1.0));
      this.cb.a(3, new bzq(this));
      this.cb.a(3, new bzi(this, 1.0, 3.0F, 7.0F));
   }

   public static btu.a gE() {
      return bsq.A().a(btv.q, 6.0).a(btv.j, 0.4F).a(btv.r, 0.2F);
   }

   @Override
   protected cbz b(dca $$0) {
      cbx $$1 = new cbx(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   public void m_() {
      if (this.cu == null || !this.cu.a(this.ds(), 3.46) || !this.dU().a_(this.cu).a(dfe.eH)) {
         this.ct = false;
         this.cu = null;
      }

      if (this.dU().A.a(400) == 0) {
         a(this.dU(), this);
      }

      super.m_();
      this.gI();
   }

   @Override
   public void a(ir $$0, boolean $$1) {
      this.cu = $$0;
      this.ct = $$1;
   }

   public boolean gF() {
      return this.ct;
   }

   private void gI() {
      this.cn = this.ck;
      this.cm = this.cl;
      this.cl = this.cl + (float)(!this.aE() && !this.bW() ? 4 : -1) * 0.3F;
      this.cl = aym.a(this.cl, 0.0F, 1.0F);
      if (!this.aE() && this.cr < 1.0F) {
         this.cr = 1.0F;
      }

      this.cr *= 0.9F;
      ewu $$0 = this.dx();
      if (!this.aE() && $$0.d < 0.0) {
         this.g($$0.d(1.0, 0.6, 1.0));
      }

      this.ck = this.ck + this.cr * 2.0F;
   }

   public static boolean a(dca $$0, brv $$1) {
      if ($$1.bI() && !$$1.ba() && $$0.A.a(2) == 0) {
         List<bsq> $$2 = $$0.a(bsq.class, $$1.cP().g(20.0), cp);
         if (!$$2.isEmpty()) {
            bsq $$3 = $$2.get($$0.A.a($$2.size()));
            if (!$$3.ba()) {
               avn $$4 = b($$3.ak());
               $$0.a(null, $$1.dz(), $$1.dB(), $$1.dF(), $$4, $$1.dj(), 0.7F, a($$0.A));
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public bqa b(cly $$0, bpz $$1) {
      cuh $$2 = $$0.b($$1);
      if (!this.r() && $$2.a(awm.aw)) {
         $$2.a(1, $$0);
         if (!this.ba()) {
            this.dU().a(null, this.dz(), this.dB(), this.dF(), avo.tc, this.dj(), 1.0F, 1.0F + (this.al.i() - this.al.i()) * 0.2F);
         }

         if (!this.dU().C) {
            if (this.al.a(10) == 0) {
               this.f($$0);
               this.dU().a(this, (byte)7);
            } else {
               this.dU().a(this, (byte)6);
            }
         }

         return bqa.a(this.dU().C);
      } else if (!$$2.a(awm.ax)) {
         if (!this.gL() && this.r() && this.j($$0)) {
            if (!this.dU().C) {
               this.y(!this.gy());
            }

            return bqa.a(this.dU().C);
         } else {
            return super.b($$0, $$1);
         }
      } else {
         $$2.a(1, $$0);
         this.b(new brh(brj.s, 900));
         if ($$0.f() || !this.cz()) {
            this.a(this.dX().a($$0), Float.MAX_VALUE);
         }

         return bqa.a(this.dU().C);
      }
   }

   @Override
   public boolean o(cuh $$0) {
      return false;
   }

   public static boolean c(bsb<ceu> $$0, dcb $$1, bss $$2, ir $$3, ayt $$4) {
      return $$1.a_($$3.d()).a(awe.ce) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dtc $$2, ir $$3) {
   }

   @Override
   public boolean a(cee $$0) {
      return false;
   }

   @Nullable
   @Override
   public brp a(aqt $$0, brp $$1) {
      return null;
   }

   @Override
   public boolean C(brv $$0) {
      return $$0.a(this.dX().b((bso)this), 3.0F);
   }

   @Nullable
   @Override
   public avn u() {
      return a(this.dU(), this.dU().A);
   }

   public static avn a(dca $$0, ayt $$1) {
      if ($$0.al() != bpx.a && $$1.a(1000) == 0) {
         List<bsb<?>> $$2 = Lists.newArrayList(cq.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return avo.ta;
      }
   }

   private static avn b(bsb<?> $$0) {
      return cq.getOrDefault($$0, avo.ta);
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.te;
   }

   @Override
   protected avn n_() {
      return avo.tb;
   }

   @Override
   protected void b(ir $$0, dtc $$1) {
      this.a(avo.tO, 0.15F, 1.0F);
   }

   @Override
   protected boolean aZ() {
      return this.ac > this.cs;
   }

   @Override
   protected void aY() {
      this.a(avo.td, 0.15F, 1.0F);
      this.cs = this.ac + this.cl / 2.0F;
   }

   @Override
   public float fo() {
      return a(this.al);
   }

   public static float a(ayt $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public avq dj() {
      return avq.g;
   }

   @Override
   public boolean bF() {
      return true;
   }

   @Override
   protected void D(brv $$0) {
      if (!($$0 instanceof cly)) {
         super.D($$0);
      }
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dU().C) {
            this.y(false);
         }

         return super.a($$0, $$1);
      }
   }

   public ceu.b gG() {
      return ceu.b.a(this.as.a(co));
   }

   public void a(ceu.b $$0) {
      this.as.a(co, $$0.h);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(co, 0);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("Variant", this.gG().h);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.a(ceu.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gL() {
      return !this.aE();
   }

   @Override
   public ewu cR() {
      return new ewu(0.0, (double)(0.5F * this.cQ()), (double)(this.do() * 0.4F));
   }

   static class a extends cax {
      public a(bsw $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected ewu h() {
         ewu $$0 = null;
         if (this.b.bi()) {
            $$0 = cdl.a(this.b, 15, 15);
         }

         if (this.b.et().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private ewu k() {
         ir $$0 = this.b.du();
         ir.a $$1 = new ir.a();
         ir.a $$2 = new ir.a();

         for (ir $$4 : ir.b(
            aym.a(this.b.dz() - 3.0),
            aym.a(this.b.dB() - 6.0),
            aym.a(this.b.dF() - 3.0),
            aym.a(this.b.dz() + 3.0),
            aym.a(this.b.dB() + 6.0),
            aym.a(this.b.dF() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               dtc $$5 = this.b.dU().a_($$2.a($$4, iw.a));
               boolean $$6 = $$5.b() instanceof djq || $$5.a(awe.t);
               if ($$6 && this.b.dU().u($$4) && this.b.dU().u($$1.a($$4, iw.b))) {
                  return ewu.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements azg {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<ceu.b> f = azg.a(ceu.b::values);
      private static final IntFunction<ceu.b> g = axd.a(ceu.b::a, values(), axd.a.c);
      final int h;
      private final String i;

      private b(int $$0, String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static ceu.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
