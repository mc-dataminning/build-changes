import javax.annotation.Nullable;

public class ctv implements bse, ctu {
   private final ka<cwq> b = ka.a(1, cwq.j);
   @Nullable
   private dbk<?> c;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean c() {
      for (cwq $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cwq a(int $$0) {
      return this.b.get(0);
   }

   @Override
   public cwq a(int $$0, int $$1) {
      return bsf.a(this.b, 0);
   }

   @Override
   public cwq b(int $$0) {
      return bsf.a(this.b, 0);
   }

   @Override
   public void a(int $$0, cwq $$1) {
      this.b.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(coy $$0) {
      return true;
   }

   @Override
   public void a() {
      this.b.clear();
   }

   @Override
   public void a(@Nullable dbk<?> $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public dbk<?> d() {
      return this.c;
   }
}
