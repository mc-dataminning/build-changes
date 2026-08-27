import javax.annotation.Nullable;

public class cjr implements bju, cjq {
   private final iq<cmy> c = iq.a(1, cmy.f);
   @Nullable
   private cqe<?> d;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean ai_() {
      for (cmy $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cmy a(int $$0) {
      return this.c.get(0);
   }

   @Override
   public cmy a(int $$0, int $$1) {
      return bjv.a(this.c, 0);
   }

   @Override
   public cmy b(int $$0) {
      return bjv.a(this.c, 0);
   }

   @Override
   public void a(int $$0, cmy $$1) {
      this.c.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cfi $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
   }

   @Override
   public void a(@Nullable cqe<?> $$0) {
      this.d = $$0;
   }

   @Nullable
   @Override
   public cqe<?> d() {
      return this.d;
   }
}
