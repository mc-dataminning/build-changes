import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cgn extends cfe {
   public static final float bY = 0.6F;
   public static final float bZ = 32.5F;
   public static final int cb = 80;
   private static final double cf = 7.0;
   private static final double cg = 2.0;
   private static final akj<cgn.a> ch = akn.a(cgn.class, akl.B);
   private long ci = 0L;
   public final bso cc = new bso();
   public final bso cd = new bso();
   public final bso ce = new bso();
   private int cj;
   private boolean ck = false;

   public cgn(bsz<? extends cfe> $$0, dbx $$1) {
      super($$0, $$1);
      this.K().a(true);
      this.cj = this.gC();
   }

   @Nullable
   @Override
   public bsn a(are $$0, bsn $$1) {
      return bsz.c.a((dbx)$$0);
   }

   public static buv.a s() {
      return btq.A().a(buw.q, 12.0).a(buw.r, 0.14);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(ch, cgn.a.a);
   }

   public boolean u() {
      return this.ao.a(ch) != cgn.a.a;
   }

   public boolean y() {
      return this.gw().a(this.ci);
   }

   public boolean gq() {
      return this.gw() == cgn.a.b && this.ci > (long)cgn.a.b.b();
   }

   public cgn.a gw() {
      return this.ao.a(ch);
   }

   @Override
   protected void Y() {
      super.Y();
      ags.a(this);
   }

   public void a(cgn.a $$0) {
      this.ao.a(ch, $$0);
   }

   @Override
   public void a(akj<?> $$0) {
      if (ch.equals($$0)) {
         this.ci = 0L;
      }

      super.a($$0);
   }

   @Override
   protected buq.b<cgn> dT() {
      return cgo.a();
   }

   @Override
   protected buq<?> a(Dynamic<?> $$0) {
      return cgo.a(this.dT().a($$0));
   }

   @Override
   protected void Z() {
      this.dP().ag().a("armadilloBrain");
      ((buq<cgn>)this.bD).a((are)this.dP(), this);
      this.dP().ag().c();
      this.dP().ag().a("armadilloActivityUpdate");
      cgo.a(this);
      this.dP().ag().c();
      if (this.bD() && !this.p_() && --this.cj <= 0) {
         this.a(avz.ak, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
         this.a(cur.oq);
         this.a(dwu.t);
         this.cj = this.gC();
      }

      super.Z();
   }

   private int gC() {
      return this.ah.a(20 * azy.e * 5) + 20 * azy.e * 5;
   }

   @Override
   public void l() {
      super.l();
      if (this.dP().x_()) {
         this.gD();
      }

      if (this.u()) {
         this.ad();
      }

      this.ci++;
   }

   @Override
   public float ed() {
      return this.p_() ? 0.6F : 1.0F;
   }

   private void gD() {
      switch (this.gw()) {
         case a:
            this.cc.a();
            this.cd.a();
            this.ce.a();
            break;
         case b:
            this.cc.a();
            this.cd.b(this.ai);
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
               this.ce.a(this.ai);
               this.ce.a(cgn.a.c.b(), 1.0F);
            } else {
               this.ce.b(this.ai);
            }
            break;
         case d:
            this.cc.b(this.ai);
            this.cd.a();
            this.ce.a();
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 64 && this.dP().B) {
         this.ck = true;
         this.dP().a(this.du(), this.dw(), this.dA(), avz.am, this.de(), 1.0F, 1.0F, false);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean o(cuo $$0) {
      return $$0.a(awx.ai);
   }

   public static boolean c(bsz<cgn> $$0, dby $$1, bts $$2, iz $$3, azg $$4) {
      return $$1.a_($$3.d()).a(awo.bX) && a($$1, $$3);
   }

   public boolean j(bto $$0) {
      if (!this.cK().c(7.0, 2.0, 7.0).c($$0.cK())) {
         return false;
      } else if ($$0.ak().a(aws.d)) {
         return true;
      } else if (this.em() == $$0) {
         return true;
      } else if ($$0 instanceof cmw $$1) {
         return $$1.N_() ? false : $$1.cb() || $$1.bR();
      } else {
         return false;
      }
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("state", this.gw().c());
      $$0.a("scute_time", this.cj);
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.a(cgn.a.a($$0.l("state")));
      if ($$0.e("scute_time")) {
         this.cj = $$0.h("scute_time");
      }
   }

   public void gx() {
      if (!this.u()) {
         this.U();
         this.gv();
         this.a(dwu.u);
         this.b(avz.ai);
         this.a(cgn.a.b);
      }
   }

   public void gy() {
      if (this.u()) {
         this.a(dwu.u);
         this.b(avz.al);
         this.a(cgn.a.a);
      }
   }

   @Override
   public boolean a(brm $$0, float $$1) {
      if (this.u()) {
         $$1 = ($$1 - 1.0F) / 2.0F;
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void f(brm $$0, float $$1) {
      super.f($$0, $$1);
      if (!this.gg() && !this.eB()) {
         if ($$0.d() instanceof bto) {
            this.dS().a(ccs.G, true, 80L);
            if (this.gB()) {
               this.gx();
            }
         } else if (this.gz()) {
            this.gy();
         }
      }
   }

   public boolean gz() {
      return this.bQ() || this.dE();
   }

   @Override
   public bqt b(cmw $$0, bqs $$1) {
      cuo $$2 = $$0.b($$1);
      if ($$2.a(cur.xr) && this.gA()) {
         $$2.a(16, $$0, d($$1));
         return bqt.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(int $$0, boolean $$1) {
      if (this.p_() && $$1) {
         this.b(avz.ac);
      }

      super.a($$0, $$1);
   }

   public boolean gA() {
      if (this.p_()) {
         return false;
      } else {
         this.b(new cuo(cur.oq));
         this.a(dwu.r);
         this.a(avz.ao);
         return true;
      }
   }

   public boolean gB() {
      return !this.gn() && !this.bi() && !this.gd() && !this.bR() && !this.bS();
   }

   @Override
   public void g(@Nullable cmw $$0) {
      super.g($$0);
      this.b(avz.ac);
   }

   @Override
   public boolean gr() {
      return super.gr() && !this.u();
   }

   @Override
   public avy d(cuo $$0) {
      return avz.ac;
   }

   @Override
   protected avy v() {
      return this.u() ? null : avz.af;
   }

   @Override
   protected avy o_() {
      return avz.ah;
   }

   @Override
   protected avy d(brm $$0) {
      return this.u() ? avz.ae : avz.ad;
   }

   @Override
   protected void b(iz $$0, dsb $$1) {
      this.a(avz.ag, 0.15F, 1.0F);
   }

   @Override
   public int ab() {
      return this.u() ? 0 : 32;
   }

   @Override
   protected bzk E() {
      return new bzk(this) {
         @Override
         public void a() {
            if (!cgn.this.u()) {
               super.a();
            }
         }
      };
   }

   public static enum a implements azt {
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

      private static final azt.a<cgn.a> f = azt.a(cgn.a::values);
      private static final IntFunction<cgn.a> g = axo.a(cgn.a::d, values(), axo.a.a);
      public static final zm<ByteBuf, cgn.a> e = zk.a(g, cgn.a::d);
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

      public static cgn.a a(String $$0) {
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
