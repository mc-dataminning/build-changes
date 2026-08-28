import java.util.EnumSet;
import javax.annotation.Nullable;

public class clf extends cla {
   private int bF = 47999;

   public clf(bwj<? extends clf> $$0, dip $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gt() {
      return true;
   }

   @Nullable
   @Override
   protected cla gE() {
      return bwj.by.a(this.dV(), bwi.e);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bF);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bF = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void D() {
      super.D();
      this.bC.a(1, new ceo(this, 2.0));
      this.bD.a(1, new clf.a(this));
      this.bD.a(2, new cfo<>(this, com.class, true, ($$0, $$1) -> $$0.aq() != bwj.bR));
      this.bD.a(2, new cfo<>(this, cna.class, true));
   }

   @Override
   public void w(int $$0) {
      this.bF = $$0;
   }

   @Override
   protected void a(cqs $$0) {
      bwa $$1 = this.C();
      if (!($$1 instanceof cqk)) {
         super.a($$0);
      }
   }

   @Override
   public void k_() {
      super.k_();
      if (!this.dV().C) {
         this.hd();
      }
   }

   private void hd() {
      if (this.he()) {
         this.bF = this.hf() ? ((cqk)this.C()).gy() - 1 : this.bF - 1;
         if (this.bF <= 0) {
            this.z();
            this.at();
         }
      }
   }

   private boolean he() {
      return !this.gH() && !this.hg() && !this.de();
   }

   private boolean hf() {
      return this.C() instanceof cqk;
   }

   private boolean hg() {
      return this.O_() && !this.hf();
   }

   @Nullable
   @Override
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      if ($$2 == bwi.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new bvq.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   protected static class a extends cfv {
      private final cla a;
      private bwz b;
      private int c;

      public a(cla $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(cdv.a.d));
      }

      @Override
      public boolean b() {
         if (!this.a.O_()) {
            return false;
         } else if (!(this.a.C() instanceof cqk $$1)) {
            return false;
         } else {
            this.b = $$1.eq();
            int $$2 = $$1.es();
            return $$2 != this.c && this.a(this.b, cho.a);
         }
      }

      @Override
      public void d() {
         this.e.g(this.b);
         bwa $$0 = this.a.C();
         if ($$0 instanceof cqk) {
            this.c = ((cqk)$$0).es();
         }

         super.d();
      }
   }
}
