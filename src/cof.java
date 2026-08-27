import javax.annotation.Nullable;

public class cof implements bnt, coe {
   private final iu<crj> c = iu.a(1, crj.i);
   @Nullable
   private cvl<?> d;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean ah_() {
      for (crj $$0 : this.c) {
         if (!$$0.d()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public crj a(int $$0) {
      return this.c.get(0);
   }

   @Override
   public crj a(int $$0, int $$1) {
      return bnu.a(this.c, 0);
   }

   @Override
   public crj b(int $$0) {
      return bnu.a(this.c, 0);
   }

   @Override
   public void a(int $$0, crj $$1) {
      this.c.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cjt $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
   }

   @Override
   public void a(@Nullable cvl<?> $$0) {
      this.d = $$0;
   }

   @Nullable
   @Override
   public cvl<?> d() {
      return this.d;
   }
}
