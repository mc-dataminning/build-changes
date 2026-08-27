import javax.annotation.Nullable;

public class cau extends cap {
   @Nullable
   private els b;

   public cau(can $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.b == null) {
         this.b = this.a.dk();
      }
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public void d() {
      this.b = null;
   }

   @Override
   public float f() {
      return 1.0F;
   }

   @Nullable
   @Override
   public els g() {
      return this.b;
   }

   @Override
   public cbd<cau> i() {
      return cbd.k;
   }
}
