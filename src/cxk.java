import javax.annotation.Nullable;

public class cxk implements bum, cxj {
   private final jp<daa> b = jp.a(1, daa.k);
   @Nullable
   private dew<?> c;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean c() {
      for (daa $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public daa a(int $$0) {
      return this.b.get(0);
   }

   @Override
   public daa a(int $$0, int $$1) {
      return bun.a(this.b, 0);
   }

   @Override
   public daa b(int $$0) {
      return bun.a(this.b, 0);
   }

   @Override
   public void a(int $$0, daa $$1) {
      this.b.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(crz $$0) {
      return true;
   }

   @Override
   public void a() {
      this.b.clear();
   }

   @Override
   public void a(@Nullable dew<?> $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public dew<?> d() {
      return this.c;
   }
}
