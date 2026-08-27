import javax.annotation.Nullable;

public class cih implements biu, cig {
   private final ip<clo> c = ip.a(1, clo.b);
   @Nullable
   private cov<?> d;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean aj_() {
      for (clo $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public clo a(int $$0) {
      return this.c.get(0);
   }

   @Override
   public clo a(int $$0, int $$1) {
      return biv.a(this.c, 0);
   }

   @Override
   public clo b(int $$0) {
      return biv.a(this.c, 0);
   }

   @Override
   public void a(int $$0, clo $$1) {
      this.c.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cdz $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
   }

   @Override
   public void a(@Nullable cov<?> $$0) {
      this.d = $$0;
   }

   @Nullable
   @Override
   public cov<?> d() {
      return this.d;
   }
}
