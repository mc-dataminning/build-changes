import javax.annotation.Nullable;

public class ctt implements bsc, cts {
   private final ka<cwo> b = ka.a(1, cwo.j);
   @Nullable
   private dbi<?> c;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean c() {
      for (cwo $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cwo a(int $$0) {
      return this.b.get(0);
   }

   @Override
   public cwo a(int $$0, int $$1) {
      return bsd.a(this.b, 0);
   }

   @Override
   public cwo b(int $$0) {
      return bsd.a(this.b, 0);
   }

   @Override
   public void a(int $$0, cwo $$1) {
      this.b.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cow $$0) {
      return true;
   }

   @Override
   public void a() {
      this.b.clear();
   }

   @Override
   public void a(@Nullable dbi<?> $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public dbi<?> d() {
      return this.c;
   }
}
