import javax.annotation.Nullable;

public class cft implements bgm, cfs {
   private final hp<cja> c = hp.a(1, cja.b);
   @Nullable
   private cmf<?> d;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean aa_() {
      for (cja $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cja a(int $$0) {
      return this.c.get(0);
   }

   @Override
   public cja a(int $$0, int $$1) {
      return bgn.a(this.c, 0);
   }

   @Override
   public cja b(int $$0) {
      return bgn.a(this.c, 0);
   }

   @Override
   public void a(int $$0, cja $$1) {
      this.c.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cbp $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
   }

   @Override
   public void a(@Nullable cmf<?> $$0) {
      this.d = $$0;
   }

   @Nullable
   @Override
   public cmf<?> d() {
      return this.d;
   }
}
