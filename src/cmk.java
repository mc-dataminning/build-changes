import javax.annotation.Nullable;

public class cmk implements bme, cmj {
   private final iu<cpq> c = iu.a(1, cpq.h);
   @Nullable
   private csu<?> d;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean aj_() {
      for (cpq $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cpq a(int $$0) {
      return this.c.get(0);
   }

   @Override
   public cpq a(int $$0, int $$1) {
      return bmf.a(this.c, 0);
   }

   @Override
   public cpq b(int $$0) {
      return bmf.a(this.c, 0);
   }

   @Override
   public void a(int $$0, cpq $$1) {
      this.c.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cia $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
   }

   @Override
   public void a(@Nullable csu<?> $$0) {
      this.d = $$0;
   }

   @Nullable
   @Override
   public csu<?> d() {
      return this.d;
   }
}
