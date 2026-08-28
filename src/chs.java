import java.util.EnumSet;
import javax.annotation.Nullable;

public class chs extends chn {
   private int bZ = 47999;

   public chs(btb<? extends chs> $$0, dbz $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gz() {
      return true;
   }

   @Nullable
   @Override
   protected chn gE() {
      return btb.be.a(this.dP());
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
      this.bS.a(1, new cbh(this, 2.0));
      this.bT.a(1, new chs.a(this));
   }

   @Override
   public void x(int $$0) {
      this.bZ = $$0;
   }

   @Override
   protected void f(cmy $$0) {
      bsv $$1 = this.gf();
      if (!($$1 instanceof cmr)) {
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
         this.bZ = this.hh() ? ((cmr)this.gf()).gz() - 1 : this.bZ - 1;
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
      return this.gf() instanceof cmr;
   }

   private boolean hi() {
      return this.gd() && !this.hh();
   }

   @Nullable
   @Override
   public buj a(dco $$0, bqt $$1, btu $$2, @Nullable buj $$3) {
      if ($$2 == btu.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new bsp.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   protected static class a extends cco {
      private final chn a;
      private btq b;
      private int c;

      public a(chn $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(cao.a.d));
      }

      @Override
      public boolean a() {
         if (!this.a.gd()) {
            return false;
         } else if (!(this.a.gf() instanceof cmr $$1)) {
            return false;
         } else {
            this.b = $$1.em();
            int $$2 = $$1.en();
            return $$2 != this.c && this.a(this.b, ceh.a);
         }
      }

      @Override
      public void c() {
         this.e.h(this.b);
         bsv $$0 = this.a.gf();
         if ($$0 instanceof cmr) {
            this.c = ((cmr)$$0).en();
         }

         super.c();
      }
   }
}
