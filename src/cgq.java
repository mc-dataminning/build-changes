import java.util.EnumSet;
import javax.annotation.Nullable;

public class cgq extends cgl {
   private int ci = 47999;

   public cgq(bsb<? extends cgq> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gH() {
      return true;
   }

   @Nullable
   @Override
   protected cgl gM() {
      return bsb.bi.a(this.dU());
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.ci);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.ci = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void y() {
      super.y();
      this.cb.a(1, new cae(this, 2.0));
      this.cc.a(1, new cgq.a(this));
   }

   @Override
   public void y(int $$0) {
      this.ci = $$0;
   }

   @Override
   protected void f(cly $$0) {
      brv $$1 = this.gn();
      if (!($$1 instanceof clr)) {
         super.f($$0);
      }
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dU().C) {
         this.hn();
      }
   }

   private void hn() {
      if (this.ho()) {
         this.ci = this.hp() ? ((clr)this.gn()).gH() - 1 : this.ci - 1;
         if (this.ci <= 0) {
            this.a(true, false);
            this.ao();
         }
      }
   }

   private boolean ho() {
      return !this.gN() && !this.hq() && !this.dd();
   }

   private boolean hp() {
      return this.gn() instanceof clr;
   }

   private boolean hq() {
      return this.gl() && !this.hp();
   }

   @Nullable
   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      if ($$2 == bss.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new brp.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   protected static class a extends cbl {
      private final cgl a;
      private bso b;
      private int c;

      public a(cgl $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(bzl.a.d));
      }

      @Override
      public boolean a() {
         if (!this.a.gl()) {
            return false;
         } else if (!(this.a.gn() instanceof clr $$1)) {
            return false;
         } else {
            this.b = $$1.eu();
            int $$2 = $$1.ev();
            return $$2 != this.c && this.a(this.b, cde.a);
         }
      }

      @Override
      public void c() {
         this.e.h(this.b);
         brv $$0 = this.a.gn();
         if ($$0 instanceof clr) {
            this.c = ((clr)$$0).ev();
         }

         super.c();
      }
   }
}
