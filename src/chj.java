import javax.annotation.Nullable;

public class chj extends che {
   @Nullable
   private eum b;

   public chj(chc $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.b == null) {
         this.b = this.a.dn();
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
   public eum g() {
      return this.b;
   }

   @Override
   public chs<chj> i() {
      return chs.k;
   }
}
