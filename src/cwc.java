import javax.annotation.Nullable;

public class cwc implements btr, cwb {
   private final jn<cys> b = jn.a(1, cys.k);
   @Nullable
   private ddo<?> c;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean c() {
      for (cys $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cys a(int $$0) {
      return this.b.get(0);
   }

   @Override
   public cys a(int $$0, int $$1) {
      return bts.a(this.b, 0);
   }

   @Override
   public cys b(int $$0) {
      return bts.a(this.b, 0);
   }

   @Override
   public void a(int $$0, cys $$1) {
      this.b.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cqs $$0) {
      return true;
   }

   @Override
   public void a() {
      this.b.clear();
   }

   @Override
   public void a(@Nullable ddo<?> $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public ddo<?> d() {
      return this.c;
   }
}
