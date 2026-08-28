import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class ckl extends ciz {
   public static final float bG = 0.6F;
   public static final float bH = 32.5F;
   public static final int bI = 80;
   private static final double bN = 7.0;
   private static final double bO = 2.0;
   private static final akj<ckl.a> bP = akn.a(ckl.class, akl.F);
   private long bQ = 0L;
   public final bvz bK = new bvz();
   public final bvz bL = new bvz();
   public final bvz bM = new bvz();
   private int bR;
   private boolean bS = false;

   public ckl(bwr<? extends ciz> $$0, djm $$1) {
      super($$0, $$1);
      this.O().a(true);
      this.bR = this.gG();
   }

   @Nullable
   @Override
   public bvy a(arq $$0, bvy $$1) {
      return bwr.e.a($$0, bwq.e);
   }

   public static byo.a q() {
      return ciz.gy().a(byp.s, 12.0).a(byp.v, 0.14);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bP, ckl.a.a);
   }

   public boolean t() {
      return this.al.a(bP) != ckl.a.a;
   }

   public boolean x() {
      return this.gu().a(this.bQ);
   }

   public boolean gt() {
      return this.gu() == ckl.a.b && this.bQ > (long)ckl.a.b.b();
   }

   public ckl.a gu() {
      return this.al.a(bP);
   }

   @Override
   protected void ac() {
      super.ac();
      agm.a(this);
   }

   public void a(ckl.a $$0) {
      this.al.a(bP, $$0);
   }

   @Override
   public void a(akj<?> $$0) {
      if (bP.equals($$0)) {
         this.bQ = 0L;
      }

      super.a($$0);
   }

   @Override
   protected byj.b<ckl> ec() {
      return ckm.a();
   }

   @Override
   protected byj<?> a(Dynamic<?> $$0) {
      return ckm.a(this.ec().a($$0));
   }

   @Override
   protected void a(arq $$0) {
      bqq $$1 = bqp.a();
      $$1.a("armadilloBrain");
      ((byj<ckl>)this.bs).a($$0, this);
      $$1.c();
      $$1.a("armadilloActivityUpdate");
      ckm.a(this);
      $$1.c();
      if (this.bI() && !this.n_() && --this.bR <= 0) {
         if (this.a($$0, ezp.aJ, this::a)) {
            this.a(awn.ak, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            this.a(eft.t);
         }

         this.bR = this.gG();
      }

      super.a($$0);
   }

   private int gG() {
      return this.ae.a(20 * baq.e * 5) + 20 * baq.e * 5;
   }

   @Override
   public void h() {
      super.h();
      if (this.dU().w_()) {
         this.gH();
      }

      if (this.t()) {
         this.ag();
      }

      this.bQ++;
   }

   @Override
   public float ej() {
      return this.n_() ? 0.6F : 1.0F;
   }

   private void gH() {
      switch (this.gu()) {
         case a:
            this.bK.a();
            this.bL.a();
            this.bM.a();
            break;
         case b:
            this.bK.a();
            this.bL.b(this.af);
            this.bM.a();
            break;
         case c:
            this.bK.a();
            this.bL.a();
            if (this.bS) {
               this.bM.a();
               this.bS = false;
            }

            if (this.bQ == 0L) {
               this.bM.a(this.af);
               this.bM.a(ckl.a.c.b(), 1.0F);
            } else {
               this.bM.b(this.af);
            }
            break;
         case d:
            this.bK.b(this.af);
            this.bL.a();
            this.bM.a();
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 64 && this.dU().C) {
         this.bS = true;
         this.dU().a(this.dz(), this.dB(), this.dF(), awn.am, this.dl(), 1.0F, 1.0F, false);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean i(czn $$0) {
      return $$0.a(axk.am);
   }

   public static boolean c(bwr<ckl> $$0, djn $$1, bwq $$2, iv $$3, azv $$4) {
      return $$1.a_($$3.e()).a(axc.cb) && a($$1, $$3);
   }

   public boolean i(bxj $$0) {
      if (!this.cQ().c(7.0, 2.0, 7.0).c($$0.cQ())) {
         return false;
      } else if ($$0.an().a(axf.d)) {
         return true;
      } else if (this.eq() == $$0) {
         return true;
      } else if ($$0 instanceof crm $$1) {
         return $$1.V_() ? false : $$1.ch() || $$1.bX();
      } else {
         return false;
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("state", ckl.a.f, this.gu());
      $$0.a("scute_time", this.bR);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a($$0.<ckl.a>a("state", ckl.a.f).orElse(ckl.a.a));
      if ($$0.c("scute_time")) {
         this.bR = $$0.f("scute_time");
      }
   }

   public void gv() {
      if (!this.t()) {
         this.W();
         this.gE();
         this.a(eft.u);
         this.b(awn.ai);
         this.a(ckl.a.b);
      }
   }

   public void gw() {
      if (this.t()) {
         this.a(eft.u);
         this.b(awn.al);
         this.a(ckl.a.a);
      }
   }

   @Override
   public boolean a(arq $$0, bux $$1, float $$2) {
      if (this.t()) {
         $$2 = ($$2 - 1.0F) / 2.0F;
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected void c(arq $$0, bux $$1, float $$2) {
      super.c($$0, $$1, $$2);
      if (!this.gi() && !this.eG()) {
         if ($$1.d() instanceof bxj) {
            this.eb().a(cgl.H, true, 80L);
            if (this.gF()) {
               this.gv();
            }
         } else if ($$1.a(axd.G)) {
            this.gw();
         }
      }
   }

   @Override
   public bug b(crm $$0, buf $$1) {
      czn $$2 = $$0.b($$1);
      if ($$2.a(czr.yG) && this.gx()) {
         $$2.a(16, $$0, d($$1));
         return bug.a;
      } else {
         return (bug)(this.t() ? bug.d : super.b($$0, $$1));
      }
   }

   public boolean gx() {
      if (this.n_()) {
         return false;
      } else {
         if (this.dU() instanceof arq $$0) {
            this.a($$0, new czn(czr.pe));
            this.a(eft.r);
            this.a(awn.ao);
         }

         return true;
      }
   }

   public boolean gF() {
      return !this.gq() && !this.bk() && !this.O_() && !this.bX() && !this.bY();
   }

   @Override
   public boolean gA() {
      return super.gA() && !this.t();
   }

   @Override
   protected awm u() {
      return this.t() ? null : awn.af;
   }

   @Override
   protected void gz() {
      this.b(awn.ac);
   }

   @Override
   protected awm l_() {
      return awn.ah;
   }

   @Override
   protected awm e(bux $$0) {
      return this.t() ? awn.ae : awn.ad;
   }

   @Override
   protected void b(iv $$0, eat $$1) {
      this.a(awn.ag, 0.15F, 1.0F);
   }

   @Override
   public int af() {
      return this.t() ? 0 : 32;
   }

   @Override
   protected cdd I() {
      return new cdd(this) {
         @Override
         public void a() {
            if (!ckl.this.t()) {
               super.a();
            }
         }
      };
   }

   public static enum a implements bak {
      a("idle", false, 0, 0) {
         @Override
         public boolean a(long $$0) {
            return false;
         }
      },
      b("rolling", true, 10, 1) {
         @Override
         public boolean a(long $$0) {
            return $$0 > 5L;
         }
      },
      c("scared", true, 50, 2) {
         @Override
         public boolean a(long $$0) {
            return true;
         }
      },
      d("unrolling", true, 30, 3) {
         @Override
         public boolean a(long $$0) {
            return $$0 < 26L;
         }
      };

      static final Codec<ckl.a> f = bak.a(ckl.a::values);
      private static final IntFunction<ckl.a> g = ayc.a(ckl.a::d, values(), ayc.a.a);
      public static final yw<ByteBuf, ckl.a> e = yu.a(g, ckl.a::d);
      private final String h;
      private final boolean i;
      private final int j;
      private final int k;

      a(final String $$0, final boolean $$1, final int $$2, final int $$3) {
         this.h = $$0;
         this.i = $$1;
         this.j = $$2;
         this.k = $$3;
      }

      @Override
      public String c() {
         return this.h;
      }

      private int d() {
         return this.k;
      }

      public abstract boolean a(long var1);

      public boolean a() {
         return this.i;
      }

      public int b() {
         return this.j;
      }
   }
}
