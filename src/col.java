import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class col extends coa implements cys.b {
   private static final int ca = 5;
   @Nullable
   private jh cb;
   private int cc;

   public col(bus<? extends col> $$0, dfm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bS.a(0, new cbz(this));
      this.bS.a(0, new cdq<>(this, cyl.a(cwq.sC, cym.g), awn.BC, $$0 -> this.dV().U() && !$$0.cp()));
      this.bS.a(0, new cdq<>(this, new cwm(cwq.qF), awn.BH, $$0 -> this.dV().T() && $$0.cp()));
      this.bS.a(1, new cdo(this));
      this.bS.a(1, new cbm<>(this, cmr.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new cbm<>(this, clr.class, 12.0F, 0.5, 0.5));
      this.bS.a(1, new cbm<>(this, cmn.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new cbm<>(this, cmm.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new cbm<>(this, cmb.class, 15.0F, 0.5, 0.5));
      this.bS.a(1, new cbm<>(this, clw.class, 12.0F, 0.5, 0.5));
      this.bS.a(1, new cbm<>(this, cmq.class, 10.0F, 0.5, 0.5));
      this.bS.a(1, new ccy(this, 0.5));
      this.bS.a(1, new cco(this));
      this.bS.a(2, new col.a(this, 2.0, 0.35));
      this.bS.a(4, new cct(this, 0.35));
      this.bS.a(8, new cds(this, 0.35));
      this.bS.a(9, new cci(this, cou.class, 3.0F, 1.0F));
      this.bS.a(10, new ccn(this, bvj.class, 8.0F));
   }

   @Nullable
   @Override
   public buc a(arp $$0, buc $$1) {
      return null;
   }

   @Override
   public boolean gp() {
      return false;
   }

   @Override
   public bsk b(cou $$0, bsj $$1) {
      cwm $$2 = $$0.b($$1);
      if (!$$2.a(cwq.ua) && this.bL() && !this.gn() && !this.e_()) {
         if ($$1 == bsj.a) {
            $$0.a(awx.S);
         }

         if (!this.dV().C) {
            if (this.go().isEmpty()) {
               return bsk.c;
            }

            this.a($$0);
            this.a($$0, this.o_(), 1);
         }

         return bsk.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gt() {
      if (this.dV().J().b(crs.b)) {
         this.gw();
      } else {
         coj.g[] $$0 = (coj.g[])coj.b.get(1);
         coj.g[] $$1 = (coj.g[])coj.b.get(2);
         if ($$0 != null && $$1 != null) {
            dek $$2 = this.go();
            this.a($$2, $$0, 5);
            int $$3 = this.ae.a($$1.length);
            coj.g $$4 = $$1[$$3];
            dej $$5 = $$4.a(this, this.ae);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gw() {
      dek $$0 = this.go();

      for (Pair<coj.g[], Integer> $$1 : coj.d) {
         coj.g[] $$2 = (coj.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.cc);
      if (this.cb != null) {
         $$0.a("wander_target", va.a(this.cb));
      }
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.cc = $$0.h("DespawnDelay");
      }

      va.a($$0, "wander_target").ifPresent($$0x -> this.cb = $$0x);
      this.c_(Math.max(0, this.X_()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(dej $$0) {
      if ($$0.u()) {
         int $$1 = 3 + this.ae.a(4);
         this.dV().b(new bux(this.dV(), this.dA(), this.dC() + 0.5, this.dG(), $$1));
      }
   }

   @Override
   protected awm t() {
      return this.gn() ? awn.BI : awn.BA;
   }

   @Override
   protected awm e(btb $$0) {
      return awn.BF;
   }

   @Override
   protected awm n_() {
      return awn.BB;
   }

   @Override
   public awm j(cwm $$0) {
      return $$0.a(cwq.qF) ? awn.BD : awn.BE;
   }

   @Override
   protected awm x(boolean $$0) {
      return $$0 ? awn.BJ : awn.BG;
   }

   @Override
   public awm gq() {
      return awn.BJ;
   }

   public void t(int $$0) {
      this.cc = $$0;
   }

   public int gv() {
      return this.cc;
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dV().C) {
         this.gx();
      }
   }

   private void gx() {
      if (this.cc > 0 && !this.gn() && --this.cc == 0) {
         this.at();
      }
   }

   public void h(@Nullable jh $$0) {
      this.cb = $$0;
   }

   @Nullable
   jh gz() {
      return this.cb;
   }

   class a extends ccf {
      final col a;
      final double b;
      final double c;

      a(final col $$0, final double $$1, final double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(ccf.a.a));
      }

      @Override
      public void e() {
         this.a.h(null);
         col.this.bR.o();
      }

      @Override
      public boolean b() {
         jh $$0 = this.a.gz();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void a() {
         jh $$0 = this.a.gz();
         if ($$0 != null && col.this.bR.m()) {
            if (this.a($$0, 10.0)) {
               ezy $$1 = new ezy((double)$$0.u() - this.a.dA(), (double)$$0.v() - this.a.dC(), (double)$$0.w() - this.a.dG()).d();
               ezy $$2 = $$1.c(10.0).b(this.a.dA(), this.a.dC(), this.a.dG());
               col.this.bR.a($$2.d, $$2.e, $$2.f, this.c);
            } else {
               col.this.bR.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(jh $$0, double $$1) {
         return !$$0.a(this.a.dt(), $$1);
      }
   }
}
