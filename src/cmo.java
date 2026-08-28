import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cmo extends cmd {
   private static final int ca = 5;
   @Nullable
   private iz cb;
   private int cc;

   public cmo(bsy<? extends cmo> $$0, dbw $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(0, new caf(this));
      this.bS.a(0, new cbw<>(this, cwo.a(cuq.sk, cwp.g), avz.Bu, $$0 -> this.dP().S() && !$$0.ch()));
      this.bS.a(0, new cbw<>(this, new cun(cuq.qE), avz.Bz, $$0 -> this.dP().R() && $$0.ch()));
      this.bS.a(1, new cbu(this));
      this.bS.a(1, new bzs<>(this, cku.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new bzs<>(this, cju.class, 12.0F, 0.5, 0.5));
      this.bS.a(1, new bzs<>(this, ckq.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new bzs<>(this, ckp.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new bzs<>(this, cke.class, 15.0F, 0.5, 0.5));
      this.bS.a(1, new bzs<>(this, cjz.class, 12.0F, 0.5, 0.5));
      this.bS.a(1, new bzs<>(this, ckt.class, 10.0F, 0.5, 0.5));
      this.bS.a(1, new cbe(this, 0.5));
      this.bS.a(1, new cau(this));
      this.bS.a(2, new cmo.a(this, 2.0, 0.35));
      this.bS.a(4, new caz(this, 0.35));
      this.bS.a(8, new cby(this, 0.35));
      this.bS.a(9, new cao(this, cmv.class, 3.0F, 1.0F));
      this.bS.a(10, new cat(this, btp.class, 8.0F));
   }

   @Nullable
   @Override
   public bsm a(are $$0, bsm $$1) {
      return null;
   }

   @Override
   public boolean gt() {
      return false;
   }

   @Override
   public bqs b(cmv $$0, bqr $$1) {
      cun $$2 = $$0.b($$1);
      if (!$$2.a(cuq.tJ) && this.bD() && !this.gr() && !this.p_()) {
         if ($$1 == bqr.a) {
            $$0.a(awj.S);
         }

         if (this.gs().isEmpty()) {
            return bqs.a(this.dP().B);
         } else {
            if (!this.dP().B) {
               this.f($$0);
               this.a($$0, this.O_(), 1);
            }

            return bqs.a(this.dP().B);
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gx() {
      if (this.dP().J().b(cpl.d)) {
         this.gA();
      } else {
         cmm.g[] $$0 = (cmm.g[])cmm.b.get(1);
         cmm.g[] $$1 = (cmm.g[])cmm.b.get(2);
         if ($$0 != null && $$1 != null) {
            dav $$2 = this.gs();
            this.a($$2, $$0, 5);
            int $$3 = this.ah.a($$1.length);
            cmm.g $$4 = $$1[$$3];
            dau $$5 = $$4.a(this, this.ah);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gA() {
      dav $$0 = this.gs();

      for (Pair<cmm.g[], Integer> $$1 : cmm.d) {
         cmm.g[] $$2 = (cmm.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.cc);
      if (this.cb != null) {
         $$0.a("wander_target", vg.a(this.cb));
      }
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.cc = $$0.h("DespawnDelay");
      }

      vg.a($$0, "wander_target").ifPresent($$0x -> this.cb = $$0x);
      this.c_(Math.max(0, this.g()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(dau $$0) {
      if ($$0.u()) {
         int $$1 = 3 + this.ah.a(4);
         this.dP().b(new btd(this.dP(), this.du(), this.dw() + 0.5, this.dA(), $$1));
      }
   }

   @Override
   protected avy v() {
      return this.gr() ? avz.BA : avz.Bs;
   }

   @Override
   protected avy d(brl $$0) {
      return avz.Bx;
   }

   @Override
   protected avy o_() {
      return avz.Bt;
   }

   @Override
   protected avy c(cun $$0) {
      return $$0.a(cuq.qE) ? avz.Bv : avz.Bw;
   }

   @Override
   protected avy w(boolean $$0) {
      return $$0 ? avz.BB : avz.By;
   }

   @Override
   public avy gu() {
      return avz.BB;
   }

   public void v(int $$0) {
      this.cc = $$0;
   }

   public int gz() {
      return this.cc;
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dP().B) {
         this.gB();
      }
   }

   private void gB() {
      if (this.cc > 0 && !this.gr() && --this.cc == 0) {
         this.ao();
      }
   }

   public void i(@Nullable iz $$0) {
      this.cb = $$0;
   }

   @Nullable
   iz gD() {
      return this.cb;
   }

   class a extends cal {
      final cmo a;
      final double b;
      final double c;

      a(final cmo $$0, final double $$1, final double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(cal.a.a));
      }

      @Override
      public void d() {
         this.a.i(null);
         cmo.this.bR.n();
      }

      @Override
      public boolean a() {
         iz $$0 = this.a.gD();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void e() {
         iz $$0 = this.a.gD();
         if ($$0 != null && cmo.this.bR.l()) {
            if (this.a($$0, 10.0)) {
               evp $$1 = new evp((double)$$0.u() - this.a.du(), (double)$$0.v() - this.a.dw(), (double)$$0.w() - this.a.dA()).d();
               evp $$2 = $$1.a(10.0).b(this.a.du(), this.a.dw(), this.a.dA());
               cmo.this.bR.a($$2.c, $$2.d, $$2.e, this.c);
            } else {
               cmo.this.bR.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(iz $$0, double $$1) {
         return !$$0.a(this.a.dn(), $$1);
      }
   }
}
