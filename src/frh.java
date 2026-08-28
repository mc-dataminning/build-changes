import javax.annotation.Nullable;

public class frh extends frw {
   @Nullable
   private fmo a;

   public frh(xj $$0) {
      super($$0);
   }

   @Override
   protected void aR_() {
      this.a = this.c(new fmo(this.n, this.l, this.p, 12));
      this.c();
   }

   @Override
   protected void c() {
      if (this.a != null) {
         this.a.b(this.n);
         this.a.c(this.n / 2 - this.a.y() / 2, this.o / 2 - 9 / 2);
      }
   }

   @Override
   public boolean aG_() {
      return false;
   }

   @Override
   protected boolean aQ_() {
      return false;
   }

   @Override
   public void b(flq $$0, int $$1, int $$2, float $$3) {
      this.a($$0, $$3);
      this.r();
      this.a($$0);
   }
}
