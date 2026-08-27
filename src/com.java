import javax.annotation.Nullable;

public class com implements bny, col {
   private final iw<crs> c = iw.a(1, crs.i);
   @Nullable
   private cvu<?> d;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean c() {
      for (crs $$0 : this.c) {
         if (!$$0.d()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public crs a(int $$0) {
      return this.c.get(0);
   }

   @Override
   public crs a(int $$0, int $$1) {
      return bnz.a(this.c, 0);
   }

   @Override
   public crs b(int $$0) {
      return bnz.a(this.c, 0);
   }

   @Override
   public void a(int $$0, crs $$1) {
      this.c.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cka $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
   }

   @Override
   public void a(@Nullable cvu<?> $$0) {
      this.d = $$0;
   }

   @Nullable
   @Override
   public cvu<?> d() {
      return this.d;
   }
}
