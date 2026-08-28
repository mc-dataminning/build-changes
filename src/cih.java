import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cih extends cgy {
   public static final float bY = 0.6F;
   public static final float bZ = 32.5F;
   public static final int ca = 80;
   private static final double cf = 7.0;
   private static final double cg = 2.0;
   private static final akm<cih.a> ch = akq.a(cih.class, ako.B);
   private long ci = 0L;
   public final bud cc = new bud();
   public final bud cd = new bud();
   public final bud ce = new bud();
   private int cj;
   private boolean ck = false;

   public cih(bus<? extends cgy> $$0, dfm $$1) {
      super($$0, $$1);
      this.L().a(true);
      this.cj = this.gz();
   }

   @Nullable
   @Override
   public buc a(arp $$0, buc $$1) {
      return bus.e.a($$0, bur.e);
   }

   public static bwo.a n() {
      return cgy.gr().a(bwp.s, 12.0).a(bwp.v, 0.14);
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(ch, cih.a.a);
   }

   public boolean q() {
      return this.al.a(ch) != cih.a.a;
   }

   public boolean v() {
      return this.gn().a(this.ci);
   }

   public boolean gm() {
      return this.gn() == cih.a.b && this.ci > (long)cih.a.b.b();
   }

   public cih.a gn() {
      return this.al.a(ch);
   }

   @Override
   protected void Y() {
      super.Y();
      agt.a(this);
   }

   public void a(cih.a $$0) {
      this.al.a(ch, $$0);
   }

   @Override
   public void a(akm<?> $$0) {
      if (ch.equals($$0)) {
         this.ci = 0L;
      }

      super.a($$0);
   }

   @Override
   protected bwj.b<cih> ec() {
      return cii.a();
   }

   @Override
   protected bwj<?> a(Dynamic<?> $$0) {
      return cii.a(this.ec().a($$0));
   }

   @Override
   protected void a(arp $$0) {
      bou $$1 = bot.a();
      $$1.a("armadilloBrain");
      ((bwj<cih>)this.bE).a($$0, this);
      $$1.c();
      $$1.a("armadilloActivityUpdate");
      cii.a(this);
      $$1.c();
      if (this.bL() && !this.e_() && --this.cj <= 0) {
         if (this.a($$0, euj.aJ, this::a)) {
            this.a(awn.ak, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            this.a(ear.t);
         }

         this.cj = this.gz();
      }

      super.a($$0);
   }

   private int gz() {
      return this.ae.a(20 * bao.e * 5) + 20 * bao.e * 5;
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().A_()) {
         this.gA();
      }

      if (this.q()) {
         this.ab();
      }

      this.ci++;
   }

   @Override
   public float ei() {
      return this.e_() ? 0.6F : 1.0F;
   }

   private void gA() {
      switch (this.gn()) {
         case a:
            this.cc.a();
            this.cd.a();
            this.ce.a();
            break;
         case b:
            this.cc.a();
            this.cd.b(this.af);
            this.ce.a();
            break;
         case c:
            this.cc.a();
            this.cd.a();
            if (this.ck) {
               this.ce.a();
               this.ck = false;
            }

            if (this.ci == 0L) {
               this.ce.a(this.af);
               this.ce.a(cih.a.c.b(), 1.0F);
            } else {
               this.ce.b(this.af);
            }
            break;
         case d:
            this.cc.b(this.af);
            this.cd.a();
            this.ce.a();
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 64 && this.dV().C) {
         this.ck = true;
         this.dV().a(this.dA(), this.dC(), this.dG(), awn.am, this.dm(), 1.0F, 1.0F, false);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean j(cwm $$0) {
      return $$0.a(axl.am);
   }

   public static boolean c(bus<cih> $$0, dfn $$1, bur $$2, jh $$3, azu $$4) {
      return $$1.a_($$3.e()).a(axc.bY) && a($$1, $$3);
   }

   public boolean j(bvh $$0) {
      if (!this.cR().c(7.0, 2.0, 7.0).c($$0.cR())) {
         return false;
      } else if ($$0.aq().a(axg.d)) {
         return true;
      } else if (this.ep() == $$0) {
         return true;
      } else if ($$0 instanceof cou $$1) {
         return $$1.Y_() ? false : $$1.cj() || $$1.bZ();
      } else {
         return false;
      }
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("state", this.gn().c());
      $$0.a("scute_time", this.cj);
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      this.a(cih.a.a($$0.l("state")));
      if ($$0.e("scute_time")) {
         this.cj = $$0.h("scute_time");
      }
   }

   public void go() {
      if (!this.q()) {
         this.U();
         this.gx();
         this.a(ear.u);
         this.b(awn.ai);
         this.a(cih.a.b);
      }
   }

   public void gp() {
      if (this.q()) {
         this.a(ear.u);
         this.b(awn.al);
         this.a(cih.a.a);
      }
   }

   @Override
   public boolean a(arp $$0, btb $$1, float $$2) {
      if (this.q()) {
         $$2 = ($$2 - 1.0F) / 2.0F;
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected void b(arp $$0, btb $$1, float $$2) {
      super.b($$0, $$1, $$2);
      if (!this.fZ() && !this.eE()) {
         if ($$1.d() instanceof bvh) {
            this.eb().a(cel.G, true, 80L);
            if (this.gy()) {
               this.go();
            }
         } else if ($$1.a(axe.G)) {
            this.gp();
         }
      }
   }

   @Override
   public bsk b(cou $$0, bsj $$1) {
      cwm $$2 = $$0.b($$1);
      if ($$2.a(cwq.xN) && this.gq()) {
         $$2.a(16, $$0, d($$1));
         return bsk.a;
      } else {
         return (bsk)(this.q() ? bsk.d : super.b($$0, $$1));
      }
   }

   public boolean gq() {
      if (this.e_()) {
         return false;
      } else {
         if (this.dV() instanceof arp $$0) {
            this.a($$0, new cwm(cwq.or));
            this.a(ear.r);
            this.a(awn.ao);
         }

         return true;
      }
   }

   public boolean gy() {
      return !this.gj() && !this.bn() && !this.N_() && !this.bZ() && !this.ca();
   }

   @Override
   public boolean gt() {
      return super.gt() && !this.q();
   }

   @Override
   protected awm t() {
      return this.q() ? null : awn.af;
   }

   @Override
   protected void gs() {
      this.b(awn.ac);
   }

   @Override
   protected awm n_() {
      return awn.ah;
   }

   @Override
   protected awm e(btb $$0) {
      return this.q() ? awn.ae : awn.ad;
   }

   @Override
   protected void b(jh $$0, dvv $$1) {
      this.a(awn.ag, 0.15F, 1.0F);
   }

   @Override
   public int aa() {
      return this.q() ? 0 : 32;
   }

   @Override
   protected cbd G() {
      return new cbd(this) {
         @Override
         public void a() {
            if (!cih.this.q()) {
               super.a();
            }
         }
      };
   }

   public static enum a implements bai {
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

      private static final bai.a<cih.a> f = bai.a(cih.a::values);
      private static final IntFunction<cih.a> g = ayd.a(cih.a::d, values(), ayd.a.a);
      public static final zh<ByteBuf, cih.a> e = zf.a(g, cih.a::d);
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

      public static cih.a a(String $$0) {
         return f.a($$0, a);
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
