import javax.annotation.Nullable;

public class ctu implements bsd, ctt {
   private final ka<cwp> b = ka.a(1, cwp.j);
   @Nullable
   private dbj<?> c;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean c() {
      for (cwp $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cwp a(int $$0) {
      return this.b.get(0);
   }

   @Override
   public cwp a(int $$0, int $$1) {
      return bse.a(this.b, 0);
   }

   @Override
   public cwp b(int $$0) {
      return bse.a(this.b, 0);
   }

   @Override
   public void a(int $$0, cwp $$1) {
      this.b.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cox $$0) {
      return true;
   }

   @Override
   public void a() {
      this.b.clear();
   }

   @Override
   public void a(@Nullable dbj<?> $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public dbj<?> d() {
      return this.c;
   }
}
