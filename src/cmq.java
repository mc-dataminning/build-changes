import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cmq extends cmf {
   private static final int cc = 5;
   @Nullable
   private jd cd;
   private int ce;

   public cmq(bsx<? extends cmq> $$0, dcw $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bU.a(0, new cag(this));
      this.bU.a(0, new cbx<>(this, cwu.a(cut.sk, cwv.g), avp.By, $$0 -> this.dP().S() && !$$0.ci()));
      this.bU.a(0, new cbx<>(this, new cuq(cut.qE), avp.BD, $$0 -> this.dP().R() && $$0.ci()));
      this.bU.a(1, new cbv(this));
      this.bU.a(1, new bzt<>(this, ckw.class, 8.0F, 0.5, 0.5));
      this.bU.a(1, new bzt<>(this, cjw.class, 12.0F, 0.5, 0.5));
      this.bU.a(1, new bzt<>(this, cks.class, 8.0F, 0.5, 0.5));
      this.bU.a(1, new bzt<>(this, ckr.class, 8.0F, 0.5, 0.5));
      this.bU.a(1, new bzt<>(this, ckg.class, 15.0F, 0.5, 0.5));
      this.bU.a(1, new bzt<>(this, ckb.class, 12.0F, 0.5, 0.5));
      this.bU.a(1, new bzt<>(this, ckv.class, 10.0F, 0.5, 0.5));
      this.bU.a(1, new cbf(this, 0.5));
      this.bU.a(1, new cav(this));
      this.bU.a(2, new cmq.a(this, 2.0, 0.35));
      this.bU.a(4, new cba(this, 0.35));
      this.bU.a(8, new cbz(this, 0.35));
      this.bU.a(9, new cap(this, cmx.class, 3.0F, 1.0F));
      this.bU.a(10, new cau(this, btp.class, 8.0F));
   }

   @Nullable
   @Override
   public bsl a(aqu $$0, bsl $$1) {
      return null;
   }

   @Override
   public boolean go() {
      return false;
   }

   @Override
   public bqr b(cmx $$0, bqq $$1) {
      cuq $$2 = $$0.b($$1);
      if (!$$2.a(cut.tJ) && this.bE() && !this.gm() && !this.o_()) {
         if ($$1 == bqq.a) {
            $$0.a(avz.S);
         }

         if (!this.dP().B) {
            if (this.gn().isEmpty()) {
               return bqr.c;
            }

            this.a($$0);
            this.a($$0, this.S_(), 1);
         }

         return bqr.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gs() {
      if (this.dP().J().b(cpn.c)) {
         this.gv();
      } else {
         cmo.g[] $$0 = (cmo.g[])cmo.b.get(1);
         cmo.g[] $$1 = (cmo.g[])cmo.b.get(2);
         if ($$0 != null && $$1 != null) {
            dbv $$2 = this.gn();
            this.a($$2, $$0, 5);
            int $$3 = this.ah.a($$1.length);
            cmo.g $$4 = $$1[$$3];
            dbu $$5 = $$4.a(this, this.ah);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gv() {
      dbv $$0 = this.gn();

      for (Pair<cmo.g[], Integer> $$1 : cmo.d) {
         cmo.g[] $$2 = (cmo.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.ce);
      if (this.cd != null) {
         $$0.a("wander_target", uq.a(this.cd));
      }
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.ce = $$0.h("DespawnDelay");
      }

      uq.a($$0, "wander_target").ifPresent($$0x -> this.cd = $$0x);
      this.c_(Math.max(0, this.g()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(dbu $$0) {
      if ($$0.u()) {
         int $$1 = 3 + this.ah.a(4);
         this.dP().b(new btc(this.dP(), this.du(), this.dw() + 0.5, this.dA(), $$1));
      }
   }

   @Override
   protected avo v() {
      return this.gm() ? avp.BE : avp.Bw;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.BB;
   }

   @Override
   protected avo n_() {
      return avp.Bx;
   }

   @Override
   protected avo c(cuq $$0) {
      return $$0.a(cut.qE) ? avp.Bz : avp.BA;
   }

   @Override
   protected avo w(boolean $$0) {
      return $$0 ? avp.BF : avp.BC;
   }

   @Override
   public avo gp() {
      return avp.BF;
   }

   public void u(int $$0) {
      this.ce = $$0;
   }

   public int gu() {
      return this.ce;
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dP().B) {
         this.gw();
      }
   }

   private void gw() {
      if (this.ce > 0 && !this.gm() && --this.ce == 0) {
         this.aq();
      }
   }

   public void h(@Nullable jd $$0) {
      this.cd = $$0;
   }

   @Nullable
   jd gy() {
      return this.cd;
   }

   class a extends cam {
      final cmq a;
      final double b;
      final double c;

      a(final cmq $$0, final double $$1, final double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(cam.a.a));
      }

      @Override
      public void e() {
         this.a.h(null);
         cmq.this.bT.n();
      }

      @Override
      public boolean b() {
         jd $$0 = this.a.gy();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void a() {
         jd $$0 = this.a.gy();
         if ($$0 != null && cmq.this.bT.l()) {
            if (this.a($$0, 10.0)) {
               exa $$1 = new exa((double)$$0.u() - this.a.du(), (double)$$0.v() - this.a.dw(), (double)$$0.w() - this.a.dA()).d();
               exa $$2 = $$1.a(10.0).b(this.a.du(), this.a.dw(), this.a.dA());
               cmq.this.bT.a($$2.c, $$2.d, $$2.e, this.c);
            } else {
               cmq.this.bT.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(jd $$0, double $$1) {
         return !$$0.a(this.a.dn(), $$1);
      }
   }
}
