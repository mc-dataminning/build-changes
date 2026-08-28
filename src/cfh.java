import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfh extends cfo implements bub<cfh.b>, cfa {
   private static final ajp<Integer> ch = ajt.a(cfh.class, ajr.b);
   private static final Predicate<btd> ci = new Predicate<btd>() {
      public boolean a(@Nullable btd $$0) {
         return $$0 != null && cfh.cj.containsKey($$0.al());
      }
   };
   static final Map<bsm<?>, avg> cj = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bsm.i, avh.sK);
      $$0.put(bsm.l, avh.sL);
      $$0.put(bsm.m, avh.sM);
      $$0.put(bsm.q, avh.ti);
      $$0.put(bsm.x, avh.sN);
      $$0.put(bsm.B, avh.sO);
      $$0.put(bsm.D, avh.sP);
      $$0.put(bsm.F, avh.sQ);
      $$0.put(bsm.I, avh.sR);
      $$0.put(bsm.J, avh.sS);
      $$0.put(bsm.T, avh.sT);
      $$0.put(bsm.Y, avh.sU);
      $$0.put(bsm.Z, avh.sV);
      $$0.put(bsm.ac, avh.sW);
      $$0.put(bsm.ad, avh.sX);
      $$0.put(bsm.ap, avh.sY);
      $$0.put(bsm.ay, avh.sZ);
      $$0.put(bsm.aA, avh.ta);
      $$0.put(bsm.aB, avh.tb);
      $$0.put(bsm.aC, avh.tc);
      $$0.put(bsm.aH, avh.td);
      $$0.put(bsm.aK, avh.te);
      $$0.put(bsm.aM, avh.tf);
      $$0.put(bsm.aN, avh.tg);
      $$0.put(bsm.aP, avh.th);
      $$0.put(bsm.aW, avh.ti);
      $$0.put(bsm.aY, avh.tj);
      $$0.put(bsm.bi, avh.tk);
      $$0.put(bsm.bk, avh.tl);
      $$0.put(bsm.bm, avh.tm);
      $$0.put(bsm.bo, avh.tn);
      $$0.put(bsm.bp, avh.to);
      $$0.put(bsm.bq, avh.tp);
      $$0.put(bsm.bt, avh.tq);
      $$0.put(bsm.bu, avh.tr);
      $$0.put(bsm.bw, avh.ts);
   });
   public float cd;
   public float ce;
   public float cf;
   public float cg;
   private float ck = 1.0F;
   private float cl = 1.0F;
   private boolean cm;
   @Nullable
   private ja cn;

   public cfh(bsm<? extends cfh> $$0, dcf $$1) {
      super($$0, $$1);
      this.bR = new byz(this, 10, false);
      this.a(eoy.n, -1.0F);
      this.a(eoy.o, -1.0F);
      this.a(eoy.x, -1.0F);
   }

   @Nullable
   @Override
   public btu a(dcu $$0, bqe $$1, btf $$2, @Nullable btu $$3) {
      this.a(ac.a(cfh.b.values(), $$0.E_()));
      if ($$3 == null) {
         $$3 = new bsa.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean p_() {
      return false;
   }

   @Override
   protected void z() {
      this.bU.a(0, new cas(this, 1.25));
      this.bU.a(0, new bzt(this));
      this.bU.a(1, new cah(this, cmk.class, 8.0F));
      this.bU.a(2, new cbe(this));
      this.bU.a(2, new bzx(this, 1.0, 5.0F, 1.0F, true));
      this.bU.a(2, new cfh.a(this, 1.0));
      this.bU.a(3, new cae(this));
      this.bU.a(3, new bzw(this, 1.0, 3.0F, 7.0F));
   }

   public static bui.a gu() {
      return btd.A().a(buj.s, 6.0).a(buj.l, 0.4F).a(buj.v, 0.2F).a(buj.c, 3.0);
   }

   @Override
   protected ccn b(dcf $$0) {
      ccl $$1 = new ccl(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   public void n_() {
      if (this.cn == null || !this.cn.a(this.do(), 3.46) || !this.dQ().a_(this.cn).a(dfj.dT)) {
         this.cm = false;
         this.cn = null;
      }

      if (this.dQ().z.a(400) == 0) {
         a(this.dQ(), this);
      }

      super.n_();
      this.gy();
   }

   @Override
   public void a(ja $$0, boolean $$1) {
      this.cn = $$0;
      this.cm = $$1;
   }

   public boolean gv() {
      return this.cm;
   }

   private void gy() {
      this.cg = this.cd;
      this.cf = this.ce;
      this.ce = this.ce + (float)(!this.aF() && !this.bS() ? 4 : -1) * 0.3F;
      this.ce = ayg.a(this.ce, 0.0F, 1.0F);
      if (!this.aF() && this.ck < 1.0F) {
         this.ck = 1.0F;
      }

      this.ck *= 0.9F;
      ewf $$0 = this.dt();
      if (!this.aF() && $$0.d < 0.0) {
         this.i($$0.d(1.0, 0.6, 1.0));
      }

      this.cd = this.cd + this.ck * 2.0F;
   }

   public static boolean a(dcf $$0, bsg $$1) {
      if ($$1.bE() && !$$1.aX() && $$0.z.a(2) == 0) {
         List<btd> $$2 = $$0.a(btd.class, $$1.cL().g(20.0), ci);
         if (!$$2.isEmpty()) {
            btd $$3 = $$2.get($$0.z.a($$2.size()));
            if (!$$3.aX()) {
               avg $$4 = b($$3.al());
               $$0.a(null, $$1.dv(), $$1.dx(), $$1.dB(), $$4, $$1.df(), 0.7F, a($$0.z));
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public bqg b(cmk $$0, bqf $$1) {
      cuc $$2 = $$0.b($$1);
      if (!this.s() && $$2.a(awf.aw)) {
         $$2.a(1, $$0);
         if (!this.aX()) {
            this.dQ().a(null, this.dv(), this.dx(), this.dB(), avh.sH, this.df(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
         }

         if (!this.dQ().B) {
            if (this.ah.a(10) == 0) {
               this.f($$0);
               this.dQ().a(this, (byte)7);
            } else {
               this.dQ().a(this, (byte)6);
            }
         }

         return bqg.a(this.dQ().B);
      } else if (!$$2.a(awf.ax)) {
         if (!this.gB() && this.s() && this.j($$0)) {
            if (!this.dQ().B) {
               this.y(!this.go());
            }

            return bqg.a(this.dQ().B);
         } else {
            return super.b($$0, $$1);
         }
      } else {
         $$2.a(1, $$0);
         this.b(new bro(brq.s, 900));
         if ($$0.f() || !this.cv()) {
            this.a(this.dR().a($$0), Float.MAX_VALUE);
         }

         return bqg.a(this.dQ().B);
      }
   }

   @Override
   public boolean o(cuc $$0) {
      return false;
   }

   public static boolean c(bsm<cfh> $$0, dcg $$1, btf $$2, ja $$3, ayo $$4) {
      return $$1.a_($$3.d()).a(avw.cb) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dsk $$2, ja $$3) {
   }

   @Override
   public boolean a(cer $$0) {
      return false;
   }

   @Nullable
   @Override
   public bsa a(aqm $$0, bsa $$1) {
      return null;
   }

   @Nullable
   @Override
   public avg v() {
      return a(this.dQ(), this.dQ().z);
   }

   public static avg a(dcf $$0, ayo $$1) {
      if ($$0.al() != bqd.a && $$1.a(1000) == 0) {
         List<bsm<?>> $$2 = Lists.newArrayList(cj.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return avh.sF;
      }
   }

   private static avg b(bsm<?> $$0) {
      return cj.getOrDefault($$0, avh.sF);
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.sJ;
   }

   @Override
   protected avg o_() {
      return avh.sG;
   }

   @Override
   protected void b(ja $$0, dsk $$1) {
      this.a(avh.tt, 0.15F, 1.0F);
   }

   @Override
   protected boolean aW() {
      return this.ab > this.cl;
   }

   @Override
   protected void aV() {
      this.a(avh.sI, 0.15F, 1.0F);
      this.cl = this.ab + this.ce / 2.0F;
   }

   @Override
   public float fc() {
      return a(this.ah);
   }

   public static float a(ayo $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public avi df() {
      return avi.g;
   }

   @Override
   public boolean bB() {
      return true;
   }

   @Override
   protected void E(bsg $$0) {
      if (!($$0 instanceof cmk)) {
         super.E($$0);
      }
   }

   @Override
   public boolean a(bqz $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dQ().B) {
            this.y(false);
         }

         return super.a($$0, $$1);
      }
   }

   public cfh.b gw() {
      return cfh.b.a(this.ao.a(ch));
   }

   public void a(cfh.b $$0) {
      this.ao.a(ch, $$0.h);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(ch, 0);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Variant", this.gw().h);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a(cfh.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gB() {
      return !this.aF();
   }

   @Override
   public ewf cN() {
      return new ewf(0.0, (double)(0.5F * this.cM()), (double)(this.dk() * 0.4F));
   }

   static class a extends cbl {
      public a(btk $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected ewf h() {
         ewf $$0 = null;
         if (this.b.bf()) {
            $$0 = cdz.a(this.b, 15, 15);
         }

         if (this.b.dT().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private ewf k() {
         ja $$0 = this.b.dq();
         ja.a $$1 = new ja.a();
         ja.a $$2 = new ja.a();

         for (ja $$4 : ja.b(
            ayg.a(this.b.dv() - 3.0),
            ayg.a(this.b.dx() - 6.0),
            ayg.a(this.b.dB() - 3.0),
            ayg.a(this.b.dv() + 3.0),
            ayg.a(this.b.dx() + 6.0),
            ayg.a(this.b.dB() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               dsk $$5 = this.b.dQ().a_($$2.a($$4, jf.a));
               boolean $$6 = $$5.b() instanceof djr || $$5.a(avw.t);
               if ($$6 && this.b.dQ().u($$4) && this.b.dQ().u($$1.a($$4, jf.b))) {
                  return ewf.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements azc {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<cfh.b> f = azc.a(cfh.b::values);
      private static final IntFunction<cfh.b> g = aww.a(cfh.b::a, values(), aww.a.c);
      final int h;
      private final String i;

      private b(final int $$0, final String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static cfh.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
