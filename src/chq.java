import java.util.EnumSet;
import javax.annotation.Nullable;

public class chq extends chl {
   private int cc = 47999;

   public chq(bsx<? extends chq> $$0, dcw $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gn() {
      return true;
   }

   @Nullable
   @Override
   protected chl gx() {
      return bsx.be.a(this.dO());
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.cc);
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.cc = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void B() {
      super.B();
      this.bW.a(1, new cbf(this, 2.0));
      this.bX.a(1, new chq.a(this));
   }

   @Override
   public void x(int $$0) {
      this.cc = $$0;
   }

   @Override
   protected void a(cmx $$0) {
      bsr $$1 = this.A();
      if (!($$1 instanceof cmq)) {
         super.a($$0);
      }
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dO().B) {
         this.gZ();
      }
   }

   private void gZ() {
      if (this.ha()) {
         this.cc = this.hb() ? ((cmq)this.A()).gt() - 1 : this.cc - 1;
         if (this.cc <= 0) {
            this.a(true, false);
            this.aq();
         }
      }
   }

   private boolean ha() {
      return !this.gz() && !this.hc() && !this.cY();
   }

   private boolean hb() {
      return this.A() instanceof cmq;
   }

   private boolean hc() {
      return this.N_() && !this.hb();
   }

   @Nullable
   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      if ($$2 == btr.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new bsl.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   protected static class a extends ccm {
      private final chl a;
      private btn b;
      private int c;

      public a(chl $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(cam.a.d));
      }

      @Override
      public boolean b() {
         if (!this.a.N_()) {
            return false;
         } else if (!(this.a.A() instanceof cmq $$1)) {
            return false;
         } else {
            this.b = $$1.ei();
            int $$2 = $$1.ej();
            return $$2 != this.c && this.a(this.b, cef.a);
         }
      }

      @Override
      public void d() {
         this.e.h(this.b);
         bsr $$0 = this.a.A();
         if ($$0 instanceof cmq) {
            this.c = ((cmq)$$0).ej();
         }

         super.d();
      }
   }
}
