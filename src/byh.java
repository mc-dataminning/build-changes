import java.util.EnumSet;
import javax.annotation.Nullable;

public class byh extends bxw {
   private static final int bV = 5;
   @Nullable
   private gu bW;
   private int bX;

   public byh(bfn<? extends byh> $$0, cmm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void x() {
      this.bO.a(0, new bmp(this));
      this.bO.a(0, new bog<>(this, chy.a(new cfz(cgc.rv), chz.i), amh.zh, $$0 -> this.dI().O() && !$$0.cb()));
      this.bO.a(0, new bog<>(this, new cfz(cgc.pQ), amh.zm, $$0 -> this.dI().N() && $$0.cb()));
      this.bO.a(1, new boe(this));
      this.bO.a(1, new bmc<>(this, bwv.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bmc<>(this, bvv.class, 12.0F, 0.5, 0.5));
      this.bO.a(1, new bmc<>(this, bwr.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bmc<>(this, bwq.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bmc<>(this, bwf.class, 15.0F, 0.5, 0.5));
      this.bO.a(1, new bmc<>(this, bwa.class, 12.0F, 0.5, 0.5));
      this.bO.a(1, new bmc<>(this, bwu.class, 10.0F, 0.5, 0.5));
      this.bO.a(1, new bno(this, 0.5));
      this.bO.a(1, new bne(this));
      this.bO.a(2, new byh.a(this, 2.0, 0.35));
      this.bO.a(4, new bnj(this, 0.35));
      this.bO.a(8, new boi(this, 0.35));
      this.bO.a(9, new bmy(this, byo.class, 3.0F, 1.0F));
      this.bO.a(10, new bnd(this, bgb.class, 8.0F));
   }

   @Nullable
   @Override
   public bfe a(aif $$0, bfe $$1) {
      return null;
   }

   @Override
   public boolean gb() {
      return false;
   }

   @Override
   public bdx b(byo $$0, bdw $$1) {
      cfz $$2 = $$0.b($$1);
      if (!$$2.a(cgc.sR) && this.bs() && !this.fZ() && !this.h_()) {
         if ($$1 == bdw.a) {
            $$0.a(amr.S);
         }

         if (this.ga().isEmpty()) {
            return bdx.a(this.dI().B);
         } else {
            if (!this.dI().B) {
               this.f($$0);
               this.a($$0, this.H_(), 1);
            }

            return bdx.a(this.dI().B);
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gf() {
      byf.f[] $$0 = (byf.f[])byf.b.get(1);
      byf.f[] $$1 = (byf.f[])byf.b.get(2);
      if ($$0 != null && $$1 != null) {
         cll $$2 = this.ga();
         this.a($$2, $$0, 5);
         int $$3 = this.af.a($$1.length);
         byf.f $$4 = $$1[$$3];
         clk $$5 = $$4.a(this, this.af);
         if ($$5 != null) {
            $$2.add($$5);
         }
      }
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bX);
      if (this.bW != null) {
         $$0.a("WanderTarget", rd.a(this.bW));
      }
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bX = $$0.h("DespawnDelay");
      }

      if ($$0.e("WanderTarget")) {
         this.bW = rd.b($$0.p("WanderTarget"));
      }

      this.c_(Math.max(0, this.h()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(clk $$0) {
      if ($$0.s()) {
         int $$1 = 3 + this.af.a(4);
         this.dI().b(new bfp(this.dI(), this.dn(), this.dp() + 0.5, this.dt(), $$1));
      }
   }

   @Override
   protected amg s() {
      return this.fZ() ? amh.zn : amh.zf;
   }

   @Override
   protected amg d(ben $$0) {
      return amh.zk;
   }

   @Override
   protected amg g_() {
      return amh.zg;
   }

   @Override
   protected amg c(cfz $$0) {
      return $$0.a(cgc.pQ) ? amh.zi : amh.zj;
   }

   @Override
   protected amg w(boolean $$0) {
      return $$0 ? amh.zo : amh.zl;
   }

   @Override
   public amg gc() {
      return amh.zo;
   }

   public void u(int $$0) {
      this.bX = $$0;
   }

   public int gh() {
      return this.bX;
   }

   @Override
   public void b_() {
      super.b_();
      if (!this.dI().B) {
         this.gi();
      }
   }

   private void gi() {
      if (this.bX > 0 && !this.fZ() && --this.bX == 0) {
         this.ai();
      }
   }

   public void i(@Nullable gu $$0) {
      this.bW = $$0;
   }

   @Nullable
   gu gj() {
      return this.bW;
   }

   class a extends bmv {
      final byh a;
      final double b;
      final double c;

      a(byh $$0, double $$1, double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(bmv.a.a));
      }

      @Override
      public void d() {
         this.a.i(null);
         byh.this.bN.n();
      }

      @Override
      public boolean a() {
         gu $$0 = this.a.gj();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void e() {
         gu $$0 = this.a.gj();
         if ($$0 != null && byh.this.bN.l()) {
            if (this.a($$0, 10.0)) {
               eei $$1 = new eei((double)$$0.u() - this.a.dn(), (double)$$0.v() - this.a.dp(), (double)$$0.w() - this.a.dt()).d();
               eei $$2 = $$1.a(10.0).b(this.a.dn(), this.a.dp(), this.a.dt());
               byh.this.bN.a($$2.c, $$2.d, $$2.e, this.c);
            } else {
               byh.this.bN.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(gu $$0, double $$1) {
         return !$$0.a(this.a.dg(), $$1);
      }
   }
}
