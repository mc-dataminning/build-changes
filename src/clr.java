import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class clr extends clg {
   private static final int ca = 5;
   @Nullable
   private io cb;
   private int cc;

   public clr(bsc<? extends clr> $$0, daz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(0, new bzi(this));
      this.bS.a(0, new caz<>(this, cvr.a(ctt.sk, cvs.g), avi.Bu, $$0 -> this.dP().R() && !$$0.ch()));
      this.bS.a(0, new caz<>(this, new ctq(ctt.qE), avi.Bz, $$0 -> this.dP().Q() && $$0.ch()));
      this.bS.a(1, new cax(this));
      this.bS.a(1, new byv<>(this, cjx.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new byv<>(this, cix.class, 12.0F, 0.5, 0.5));
      this.bS.a(1, new byv<>(this, cjt.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new byv<>(this, cjs.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new byv<>(this, cjh.class, 15.0F, 0.5, 0.5));
      this.bS.a(1, new byv<>(this, cjc.class, 12.0F, 0.5, 0.5));
      this.bS.a(1, new byv<>(this, cjw.class, 10.0F, 0.5, 0.5));
      this.bS.a(1, new cah(this, 0.5));
      this.bS.a(1, new bzx(this));
      this.bS.a(2, new clr.a(this, 2.0, 0.35));
      this.bS.a(4, new cac(this, 0.35));
      this.bS.a(8, new cbb(this, 0.35));
      this.bS.a(9, new bzr(this, cly.class, 3.0F, 1.0F));
      this.bS.a(10, new bzw(this, bss.class, 8.0F));
   }

   @Nullable
   @Override
   public brq a(aqn $$0, brq $$1) {
      return null;
   }

   @Override
   public boolean gs() {
      return false;
   }

   @Override
   public bpw b(cly $$0, bpv $$1) {
      ctq $$2 = $$0.b($$1);
      if (!$$2.a(ctt.tJ) && this.bD() && !this.gq() && !this.p_()) {
         if ($$1 == bpv.a) {
            $$0.a(avs.S);
         }

         if (this.gr().isEmpty()) {
            return bpw.a(this.dP().B);
         } else {
            if (!this.dP().B) {
               this.f($$0);
               this.a($$0, this.O_(), 1);
            }

            return bpw.a(this.dP().B);
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gw() {
      if (this.dP().J().b(coo.d)) {
         this.gz();
      } else {
         clp.g[] $$0 = (clp.g[])clp.b.get(1);
         clp.g[] $$1 = (clp.g[])clp.b.get(2);
         if ($$0 != null && $$1 != null) {
            czy $$2 = this.gr();
            this.a($$2, $$0, 5);
            int $$3 = this.ah.a($$1.length);
            clp.g $$4 = $$1[$$3];
            czx $$5 = $$4.a(this, this.ah);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gz() {
      czy $$0 = this.gr();

      for (Pair<clp.g[], Integer> $$1 : clp.d) {
         clp.g[] $$2 = (clp.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.cc);
      if (this.cb != null) {
         $$0.a("wander_target", us.a(this.cb));
      }
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.cc = $$0.h("DespawnDelay");
      }

      us.a($$0, "wander_target").ifPresent($$0x -> this.cb = $$0x);
      this.c_(Math.max(0, this.g()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(czx $$0) {
      if ($$0.u()) {
         int $$1 = 3 + this.ah.a(4);
         this.dP().b(new bsg(this.dP(), this.du(), this.dw() + 0.5, this.dA(), $$1));
      }
   }

   @Override
   protected avh v() {
      return this.gq() ? avi.BA : avi.Bs;
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.Bx;
   }

   @Override
   protected avh o_() {
      return avi.Bt;
   }

   @Override
   protected avh c(ctq $$0) {
      return $$0.a(ctt.qE) ? avi.Bv : avi.Bw;
   }

   @Override
   protected avh w(boolean $$0) {
      return $$0 ? avi.BB : avi.By;
   }

   @Override
   public avh gt() {
      return avi.BB;
   }

   public void v(int $$0) {
      this.cc = $$0;
   }

   public int gy() {
      return this.cc;
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dP().B) {
         this.gA();
      }
   }

   private void gA() {
      if (this.cc > 0 && !this.gq() && --this.cc == 0) {
         this.ao();
      }
   }

   public void i(@Nullable io $$0) {
      this.cb = $$0;
   }

   @Nullable
   io gC() {
      return this.cb;
   }

   class a extends bzo {
      final clr a;
      final double b;
      final double c;

      a(clr $$0, double $$1, double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(bzo.a.a));
      }

      @Override
      public void d() {
         this.a.i(null);
         clr.this.bR.n();
      }

      @Override
      public boolean a() {
         io $$0 = this.a.gC();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void e() {
         io $$0 = this.a.gC();
         if ($$0 != null && clr.this.bR.l()) {
            if (this.a($$0, 10.0)) {
               eum $$1 = new eum((double)$$0.u() - this.a.du(), (double)$$0.v() - this.a.dw(), (double)$$0.w() - this.a.dA()).d();
               eum $$2 = $$1.a(10.0).b(this.a.du(), this.a.dw(), this.a.dA());
               clr.this.bR.a($$2.c, $$2.d, $$2.e, this.c);
            } else {
               clr.this.bR.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(io $$0, double $$1) {
         return !$$0.a(this.a.dn(), $$1);
      }
   }
}
