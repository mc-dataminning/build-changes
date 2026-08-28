import java.util.EnumSet;
import javax.annotation.Nullable;

public class cht extends cho {
   private int bZ = 47999;

   public cht(btc<? extends cht> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gz() {
      return true;
   }

   @Nullable
   @Override
   protected cho gE() {
      return btc.be.a(this.dP());
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bZ);
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bZ = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(1, new cbi(this, 2.0));
      this.bT.a(1, new cht.a(this));
   }

   @Override
   public void x(int $$0) {
      this.bZ = $$0;
   }

   @Override
   protected void f(cmz $$0) {
      bsw $$1 = this.gf();
      if (!($$1 instanceof cms)) {
         super.f($$0);
      }
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dP().B) {
         this.hf();
      }
   }

   private void hf() {
      if (this.hg()) {
         this.bZ = this.hh() ? ((cms)this.gf()).gz() - 1 : this.bZ - 1;
         if (this.bZ <= 0) {
            this.a(true, false);
            this.ao();
         }
      }
   }

   private boolean hg() {
      return !this.gF() && !this.hi() && !this.cY();
   }

   private boolean hh() {
      return this.gf() instanceof cms;
   }

   private boolean hi() {
      return this.gd() && !this.hh();
   }

   @Nullable
   @Override
   public buk a(dcp $$0, bqu $$1, btv $$2, @Nullable buk $$3) {
      if ($$2 == btv.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new bsq.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   protected static class a extends ccp {
      private final cho a;
      private btr b;
      private int c;

      public a(cho $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(cap.a.d));
      }

      @Override
      public boolean a() {
         if (!this.a.gd()) {
            return false;
         } else if (!(this.a.gf() instanceof cms $$1)) {
            return false;
         } else {
            this.b = $$1.em();
            int $$2 = $$1.en();
            return $$2 != this.c && this.a(this.b, cei.a);
         }
      }

      @Override
      public void c() {
         this.e.h(this.b);
         bsw $$0 = this.a.gf();
         if ($$0 instanceof cms) {
            this.c = ((cms)$$0).en();
         }

         super.c();
      }
   }
}
