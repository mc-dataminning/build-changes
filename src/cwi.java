import javax.annotation.Nullable;

public class cwi implements btu, cwh {
   private final jn<cyy> b = jn.a(1, cyy.k);
   @Nullable
   private ddu<?> c;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean c() {
      for (cyy $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cyy a(int $$0) {
      return this.b.get(0);
   }

   @Override
   public cyy a(int $$0, int $$1) {
      return btv.a(this.b, 0);
   }

   @Override
   public cyy b(int $$0) {
      return btv.a(this.b, 0);
   }

   @Override
   public void a(int $$0, cyy $$1) {
      this.b.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cqy $$0) {
      return true;
   }

   @Override
   public void a() {
      this.b.clear();
   }

   @Override
   public void a(@Nullable ddu<?> $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public ddu<?> d() {
      return this.c;
   }
}
