import javax.annotation.Nullable;

public class cts implements bsb, ctr {
   private final ka<cwn> b = ka.a(1, cwn.j);
   @Nullable
   private dbh<?> c;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean c() {
      for (cwn $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cwn a(int $$0) {
      return this.b.get(0);
   }

   @Override
   public cwn a(int $$0, int $$1) {
      return bsc.a(this.b, 0);
   }

   @Override
   public cwn b(int $$0) {
      return bsc.a(this.b, 0);
   }

   @Override
   public void a(int $$0, cwn $$1) {
      this.b.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cov $$0) {
      return true;
   }

   @Override
   public void a() {
      this.b.clear();
   }

   @Override
   public void a(@Nullable dbh<?> $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public dbh<?> d() {
      return this.c;
   }
}
