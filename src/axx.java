public class axx {
   private final int a;
   private final axx.a b;
   private int c;
   private int d;

   public axx(int $$0, axx.a $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public axx(int $$0) {
      this($$0, $$0x -> $$0x);
   }

   public void a(boolean $$0) {
      this.d = this.c;
      if ($$0) {
         if (this.c < this.a) {
            this.c++;
         }
      } else if (this.c > 0) {
         this.c--;
      }
   }

   public float a(float $$0) {
      float $$1 = azj.h($$0, (float)this.d, (float)this.c) / (float)this.a;
      return this.b.apply($$1);
   }

   public interface a {
      float apply(float var1);
   }
}
