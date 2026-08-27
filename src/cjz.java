import javax.annotation.Nullable;

public class cjz implements bjv, cjy {
   private final iq<cng> c = iq.a(1, cng.f);
   @Nullable
   private cqm<?> d;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean aj_() {
      for (cng $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cng a(int $$0) {
      return this.c.get(0);
   }

   @Override
   public cng a(int $$0, int $$1) {
      return bjw.a(this.c, 0);
   }

   @Override
   public cng b(int $$0) {
      return bjw.a(this.c, 0);
   }

   @Override
   public void a(int $$0, cng $$1) {
      this.c.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cfq $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
   }

   @Override
   public void a(@Nullable cqm<?> $$0) {
      this.d = $$0;
   }

   @Nullable
   @Override
   public cqm<?> d() {
      return this.d;
   }
}
