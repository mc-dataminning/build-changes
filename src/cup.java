import javax.annotation.Nullable;

public class cup implements bsx, cuo {
   private final jz<cxk> b = jz.a(1, cxk.k);
   @Nullable
   private dcd<?> c;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean c() {
      for (cxk $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cxk a(int $$0) {
      return this.b.get(0);
   }

   @Override
   public cxk a(int $$0, int $$1) {
      return bsy.a(this.b, 0);
   }

   @Override
   public cxk b(int $$0) {
      return bsy.a(this.b, 0);
   }

   @Override
   public void a(int $$0, cxk $$1) {
      this.b.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cps $$0) {
      return true;
   }

   @Override
   public void a() {
      this.b.clear();
   }

   @Override
   public void a(@Nullable dcd<?> $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public dcd<?> d() {
      return this.c;
   }
}
