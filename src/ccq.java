import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class ccq extends ccf {
   private static final int bV = 5;
   @Nullable
   private ht bW;
   private int bX;

   public ccq(bjx<? extends ccq> $$0, cqz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bO.a(0, new bqy(this));
      this.bO.a(0, new bsp<>(this, cmi.a(new ckj(ckm.rv), cmj.i), aqd.zp, $$0 -> this.dL().O() && !$$0.cd()));
      this.bO.a(0, new bsp<>(this, new ckj(ckm.pQ), aqd.zu, $$0 -> this.dL().N() && $$0.cd()));
      this.bO.a(1, new bsn(this));
      this.bO.a(1, new bql<>(this, cbe.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bql<>(this, cae.class, 12.0F, 0.5, 0.5));
      this.bO.a(1, new bql<>(this, cba.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bql<>(this, caz.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bql<>(this, cao.class, 15.0F, 0.5, 0.5));
      this.bO.a(1, new bql<>(this, caj.class, 12.0F, 0.5, 0.5));
      this.bO.a(1, new bql<>(this, cbd.class, 10.0F, 0.5, 0.5));
      this.bO.a(1, new brx(this, 0.5));
      this.bO.a(1, new brn(this));
      this.bO.a(2, new ccq.a(this, 2.0, 0.35));
      this.bO.a(4, new brs(this, 0.35));
      this.bO.a(8, new bsr(this, 0.35));
      this.bO.a(9, new brh(this, ccx.class, 3.0F, 1.0F));
      this.bO.a(10, new brm(this, bkl.class, 8.0F));
   }

   @Nullable
   @Override
   public bjo a(alq $$0, bjo $$1) {
      return null;
   }

   @Override
   public boolean gh() {
      return false;
   }

   @Override
   public bib b(ccx $$0, bia $$1) {
      ckj $$2 = $$0.b($$1);
      if (!$$2.a(ckm.sR) && this.bv() && !this.gf() && !this.n_()) {
         if ($$1 == bia.a) {
            $$0.a(aqn.S);
         }

         if (this.gg().isEmpty()) {
            return bib.a(this.dL().B);
         } else {
            if (!this.dL().B) {
               this.f($$0);
               this.a($$0, this.O_(), 1);
            }

            return bib.a(this.dL().B);
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gl() {
      if (this.dL().G().b(cfi.c)) {
         this.go();
      } else {
         cco.g[] $$0 = (cco.g[])cco.b.get(1);
         cco.g[] $$1 = (cco.g[])cco.b.get(2);
         if ($$0 != null && $$1 != null) {
            cpy $$2 = this.gg();
            this.a($$2, $$0, 5);
            int $$3 = this.ag.a($$1.length);
            cco.g $$4 = $$1[$$3];
            cpx $$5 = $$4.a(this, this.ag);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void go() {
      cpy $$0 = this.gg();

      for (Pair<cco.g[], Integer> $$1 : cco.d) {
         cco.g[] $$2 = (cco.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bX);
      if (this.bW != null) {
         $$0.a("WanderTarget", sg.a(this.bW));
      }
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bX = $$0.h("DespawnDelay");
      }

      if ($$0.e("WanderTarget")) {
         this.bW = sg.b($$0.p("WanderTarget"));
      }

      this.c_(Math.max(0, this.h()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(cpx $$0) {
      if ($$0.s()) {
         int $$1 = 3 + this.ag.a(4);
         this.dL().b(new bjz(this.dL(), this.dq(), this.ds() + 0.5, this.dw(), $$1));
      }
   }

   @Override
   protected aqc w() {
      return this.gf() ? aqd.zv : aqd.zn;
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.zs;
   }

   @Override
   protected aqc m_() {
      return aqd.zo;
   }

   @Override
   protected aqc c(ckj $$0) {
      return $$0.a(ckm.pQ) ? aqd.zq : aqd.zr;
   }

   @Override
   protected aqc w(boolean $$0) {
      return $$0 ? aqd.zw : aqd.zt;
   }

   @Override
   public aqc gi() {
      return aqd.zw;
   }

   public void u(int $$0) {
      this.bX = $$0;
   }

   public int gn() {
      return this.bX;
   }

   @Override
   public void c_() {
      super.c_();
      if (!this.dL().B) {
         this.gp();
      }
   }

   private void gp() {
      if (this.bX > 0 && !this.gf() && --this.bX == 0) {
         this.ak();
      }
   }

   public void i(@Nullable ht $$0) {
      this.bW = $$0;
   }

   @Nullable
   ht gr() {
      return this.bW;
   }

   class a extends bre {
      final ccq a;
      final double b;
      final double c;

      a(ccq $$0, double $$1, double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(bre.a.a));
      }

      @Override
      public void d() {
         this.a.i(null);
         ccq.this.bN.n();
      }

      @Override
      public boolean a() {
         ht $$0 = this.a.gr();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void e() {
         ht $$0 = this.a.gr();
         if ($$0 != null && ccq.this.bN.l()) {
            if (this.a($$0, 10.0)) {
               eif $$1 = new eif((double)$$0.u() - this.a.dq(), (double)$$0.v() - this.a.ds(), (double)$$0.w() - this.a.dw()).d();
               eif $$2 = $$1.a(10.0).b(this.a.dq(), this.a.ds(), this.a.dw());
               ccq.this.bN.a($$2.c, $$2.d, $$2.e, this.c);
            } else {
               ccq.this.bN.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(ht $$0, double $$1) {
         return !$$0.a(this.a.dj(), $$1);
      }
   }
}
