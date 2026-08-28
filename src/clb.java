import javax.annotation.Nullable;

public class clb extends ckw {
   @Nullable
   private fby b;

   public clb(cku $$0) {
      super($$0);
   }

   @Override
   public void a(ash $$0) {
      if (this.b == null) {
         this.b = this.a.du();
      }
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public void c() {
      this.b = null;
   }

   @Override
   public float e() {
      return 1.0F;
   }

   @Nullable
   @Override
   public fby f() {
      return this.b;
   }

   @Override
   public clk<clb> h() {
      return clk.k;
   }
}
