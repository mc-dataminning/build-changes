import java.util.EnumSet;
import javax.annotation.Nullable;

public class ckv extends ckq {
   private int bE = 47999;

   public ckv(bwb<? extends ckv> $$0, dhp $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gt() {
      return true;
   }

   @Nullable
   @Override
   protected ckq gE() {
      return bwb.bx.a(this.dV(), bwa.e);
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bE);
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bE = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void D() {
      super.D();
      this.bB.a(1, new ceg(this, 2.0));
      this.bC.a(1, new ckv.a(this));
      this.bC.a(2, new cfg<>(this, coc.class, true, ($$0, $$1) -> $$0.aq() != bwb.bQ));
      this.bC.a(2, new cfg<>(this, cmq.class, true));
   }

   @Override
   public void w(int $$0) {
      this.bE = $$0;
   }

   @Override
   protected void a(cqi $$0) {
      bvs $$1 = this.C();
      if (!($$1 instanceof cqa)) {
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
         this.bE = this.hf() ? ((cqa)this.C()).gy() - 1 : this.bE - 1;
         if (this.bE <= 0) {
            this.z();
            this.at();
         }
      }
   }

   private boolean he() {
      return !this.gH() && !this.hg() && !this.de();
   }

   private boolean hf() {
      return this.C() instanceof cqa;
   }

   private boolean hg() {
      return this.O_() && !this.hf();
   }

   @Nullable
   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      if ($$2 == bwa.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new bvi.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   protected static class a extends cfn {
      private final ckq a;
      private bwr b;
      private int c;

      public a(ckq $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(cdn.a.d));
      }

      @Override
      public boolean b() {
         if (!this.a.O_()) {
            return false;
         } else if (!(this.a.C() instanceof cqa $$1)) {
            return false;
         } else {
            this.b = $$1.eq();
            int $$2 = $$1.es();
            return $$2 != this.c && this.a(this.b, chg.a);
         }
      }

      @Override
      public void d() {
         this.e.h(this.b);
         bvs $$0 = this.a.C();
         if ($$0 instanceof cqa) {
            this.c = ((cqa)$$0).es();
         }

         super.d();
      }
   }
}
