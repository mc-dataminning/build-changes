import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class clp extends cle {
   private static final int ca = 5;
   @Nullable
   private io cb;
   private int cc;

   public clp(bsa<? extends clp> $$0, dax $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(0, new bzg(this));
      this.bS.a(0, new cax<>(this, cvp.a(ctr.sk, cvq.g), avh.Bu, $$0 -> this.dP().R() && !$$0.ch()));
      this.bS.a(0, new cax<>(this, new cto(ctr.qE), avh.Bz, $$0 -> this.dP().Q() && $$0.ch()));
      this.bS.a(1, new cav(this));
      this.bS.a(1, new byt<>(this, cjv.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new byt<>(this, civ.class, 12.0F, 0.5, 0.5));
      this.bS.a(1, new byt<>(this, cjr.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new byt<>(this, cjq.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new byt<>(this, cjf.class, 15.0F, 0.5, 0.5));
      this.bS.a(1, new byt<>(this, cja.class, 12.0F, 0.5, 0.5));
      this.bS.a(1, new byt<>(this, cju.class, 10.0F, 0.5, 0.5));
      this.bS.a(1, new caf(this, 0.5));
      this.bS.a(1, new bzv(this));
      this.bS.a(2, new clp.a(this, 2.0, 0.35));
      this.bS.a(4, new caa(this, 0.35));
      this.bS.a(8, new caz(this, 0.35));
      this.bS.a(9, new bzp(this, clw.class, 3.0F, 1.0F));
      this.bS.a(10, new bzu(this, bsq.class, 8.0F));
   }

   @Nullable
   @Override
   public bro a(aqm $$0, bro $$1) {
      return null;
   }

   @Override
   public boolean gs() {
      return false;
   }

   @Override
   public bpu b(clw $$0, bpt $$1) {
      cto $$2 = $$0.b($$1);
      if (!$$2.a(ctr.tJ) && this.bD() && !this.gq() && !this.p_()) {
         if ($$1 == bpt.a) {
            $$0.a(avr.S);
         }

         if (this.gr().isEmpty()) {
            return bpu.a(this.dP().B);
         } else {
            if (!this.dP().B) {
               this.f($$0);
               this.a($$0, this.O_(), 1);
            }

            return bpu.a(this.dP().B);
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gw() {
      if (this.dP().J().b(col.d)) {
         this.gz();
      } else {
         cln.g[] $$0 = (cln.g[])cln.b.get(1);
         cln.g[] $$1 = (cln.g[])cln.b.get(2);
         if ($$0 != null && $$1 != null) {
            czw $$2 = this.gr();
            this.a($$2, $$0, 5);
            int $$3 = this.ah.a($$1.length);
            cln.g $$4 = $$1[$$3];
            czv $$5 = $$4.a(this, this.ah);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gz() {
      czw $$0 = this.gr();

      for (Pair<cln.g[], Integer> $$1 : cln.d) {
         cln.g[] $$2 = (cln.g[])$$1.getLeft();
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
   protected void b(czv $$0) {
      if ($$0.u()) {
         int $$1 = 3 + this.ah.a(4);
         this.dP().b(new bse(this.dP(), this.du(), this.dw() + 0.5, this.dA(), $$1));
      }
   }

   @Override
   protected avg v() {
      return this.gq() ? avh.BA : avh.Bs;
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.Bx;
   }

   @Override
   protected avg o_() {
      return avh.Bt;
   }

   @Override
   protected avg c(cto $$0) {
      return $$0.a(ctr.qE) ? avh.Bv : avh.Bw;
   }

   @Override
   protected avg w(boolean $$0) {
      return $$0 ? avh.BB : avh.By;
   }

   @Override
   public avg gt() {
      return avh.BB;
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

   class a extends bzm {
      final clp a;
      final double b;
      final double c;

      a(clp $$0, double $$1, double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(bzm.a.a));
      }

      @Override
      public void d() {
         this.a.i(null);
         clp.this.bR.n();
      }

      @Override
      public boolean a() {
         io $$0 = this.a.gC();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void e() {
         io $$0 = this.a.gC();
         if ($$0 != null && clp.this.bR.l()) {
            if (this.a($$0, 10.0)) {
               euk $$1 = new euk((double)$$0.u() - this.a.du(), (double)$$0.v() - this.a.dw(), (double)$$0.w() - this.a.dA()).d();
               euk $$2 = $$1.a(10.0).b(this.a.du(), this.a.dw(), this.a.dA());
               clp.this.bR.a($$2.c, $$2.d, $$2.e, this.c);
            } else {
               clp.this.bR.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(io $$0, double $$1) {
         return !$$0.a(this.a.dn(), $$1);
      }
   }
}
