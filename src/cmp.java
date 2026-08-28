import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cmp extends cme {
   private static final int ca = 5;
   @Nullable
   private iz cb;
   private int cc;

   public cmp(bsz<? extends cmp> $$0, dbx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(0, new cag(this));
      this.bS.a(0, new cbx<>(this, cwp.a(cur.sk, cwq.g), avz.Bu, $$0 -> this.dP().S() && !$$0.ch()));
      this.bS.a(0, new cbx<>(this, new cuo(cur.qE), avz.Bz, $$0 -> this.dP().R() && $$0.ch()));
      this.bS.a(1, new cbv(this));
      this.bS.a(1, new bzt<>(this, ckv.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new bzt<>(this, cjv.class, 12.0F, 0.5, 0.5));
      this.bS.a(1, new bzt<>(this, ckr.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new bzt<>(this, ckq.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new bzt<>(this, ckf.class, 15.0F, 0.5, 0.5));
      this.bS.a(1, new bzt<>(this, cka.class, 12.0F, 0.5, 0.5));
      this.bS.a(1, new bzt<>(this, cku.class, 10.0F, 0.5, 0.5));
      this.bS.a(1, new cbf(this, 0.5));
      this.bS.a(1, new cav(this));
      this.bS.a(2, new cmp.a(this, 2.0, 0.35));
      this.bS.a(4, new cba(this, 0.35));
      this.bS.a(8, new cbz(this, 0.35));
      this.bS.a(9, new cap(this, cmw.class, 3.0F, 1.0F));
      this.bS.a(10, new cau(this, btq.class, 8.0F));
   }

   @Nullable
   @Override
   public bsn a(are $$0, bsn $$1) {
      return null;
   }

   @Override
   public boolean gt() {
      return false;
   }

   @Override
   public bqt b(cmw $$0, bqs $$1) {
      cuo $$2 = $$0.b($$1);
      if (!$$2.a(cur.tJ) && this.bD() && !this.gr() && !this.p_()) {
         if ($$1 == bqs.a) {
            $$0.a(awj.S);
         }

         if (this.gs().isEmpty()) {
            return bqt.a(this.dP().B);
         } else {
            if (!this.dP().B) {
               this.f($$0);
               this.a($$0, this.O_(), 1);
            }

            return bqt.a(this.dP().B);
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gx() {
      if (this.dP().J().b(cpm.d)) {
         this.gA();
      } else {
         cmn.g[] $$0 = (cmn.g[])cmn.b.get(1);
         cmn.g[] $$1 = (cmn.g[])cmn.b.get(2);
         if ($$0 != null && $$1 != null) {
            daw $$2 = this.gs();
            this.a($$2, $$0, 5);
            int $$3 = this.ah.a($$1.length);
            cmn.g $$4 = $$1[$$3];
            dav $$5 = $$4.a(this, this.ah);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gA() {
      daw $$0 = this.gs();

      for (Pair<cmn.g[], Integer> $$1 : cmn.d) {
         cmn.g[] $$2 = (cmn.g[])$$1.getLeft();
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
   protected void b(dav $$0) {
      if ($$0.u()) {
         int $$1 = 3 + this.ah.a(4);
         this.dP().b(new bte(this.dP(), this.du(), this.dw() + 0.5, this.dA(), $$1));
      }
   }

   @Override
   protected avy v() {
      return this.gr() ? avz.BA : avz.Bs;
   }

   @Override
   protected avy d(brm $$0) {
      return avz.Bx;
   }

   @Override
   protected avy o_() {
      return avz.Bt;
   }

   @Override
   protected avy c(cuo $$0) {
      return $$0.a(cur.qE) ? avz.Bv : avz.Bw;
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

   class a extends cam {
      final cmp a;
      final double b;
      final double c;

      a(final cmp $$0, final double $$1, final double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(cam.a.a));
      }

      @Override
      public void d() {
         this.a.i(null);
         cmp.this.bR.n();
      }

      @Override
      public boolean a() {
         iz $$0 = this.a.gD();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void e() {
         iz $$0 = this.a.gD();
         if ($$0 != null && cmp.this.bR.l()) {
            if (this.a($$0, 10.0)) {
               evq $$1 = new evq((double)$$0.u() - this.a.du(), (double)$$0.v() - this.a.dw(), (double)$$0.w() - this.a.dA()).d();
               evq $$2 = $$1.a(10.0).b(this.a.du(), this.a.dw(), this.a.dA());
               cmp.this.bR.a($$2.c, $$2.d, $$2.e, this.c);
            } else {
               cmp.this.bR.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(iz $$0, double $$1) {
         return !$$0.a(this.a.dn(), $$1);
      }
   }
}
