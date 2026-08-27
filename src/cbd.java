import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class cbd extends cbb {
   @Nullable
   private cbd b;
   private int c = 1;

   public cbd(bpd<? extends cbd> $$0, cxb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bR.a(5, new bwi(this));
   }

   @Override
   public int fO() {
      return this.gp();
   }

   public int gp() {
      return super.fO();
   }

   @Override
   protected boolean gn() {
      return !this.gq();
   }

   public boolean gq() {
      return this.b != null && this.b.bA();
   }

   public cbd a(cbd $$0) {
      this.b = $$0;
      $$0.gw();
      return $$0;
   }

   public void gr() {
      this.b.gx();
      this.b = null;
   }

   private void gw() {
      this.c++;
   }

   private void gx() {
      this.c--;
   }

   public boolean gs() {
      return this.gt() && this.c < this.gp();
   }

   @Override
   public void l() {
      super.l();
      if (this.gt() && this.dM().z.a(200) == 1) {
         List<? extends cbb> $$0 = this.dM().a((Class<? extends cbb>)this.getClass(), this.cH().c(8.0, 8.0, 8.0));
         if ($$0.size() <= 1) {
            this.c = 1;
         }
      }
   }

   public boolean gt() {
      return this.c > 1;
   }

   public boolean gu() {
      return this.g(this.b) <= 121.0;
   }

   public void gv() {
      if (this.gq()) {
         this.K().a(this.b, 1.0);
      }
   }

   public void a(Stream<? extends cbd> $$0) {
      $$0.limit((long)(this.gp() - this.c)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public bqh a(cxq $$0, bnb $$1, bpt $$2, @Nullable bqh $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3 == null) {
         $$3 = new cbd.a(this);
      } else {
         this.a(((cbd.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements bqh {
      public final cbd a;

      public a(cbd $$0) {
         this.a = $$0;
      }
   }
}
