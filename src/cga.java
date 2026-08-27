import javax.annotation.Nullable;

public class cga implements bgt, cfz {
   private final hp<cjh> c = hp.a(1, cjh.b);
   @Nullable
   private cmm<?> d;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean af_() {
      for (cjh $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cjh a(int $$0) {
      return this.c.get(0);
   }

   @Override
   public cjh a(int $$0, int $$1) {
      return bgu.a(this.c, 0);
   }

   @Override
   public cjh b(int $$0) {
      return bgu.a(this.c, 0);
   }

   @Override
   public void a(int $$0, cjh $$1) {
      this.c.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cbw $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
   }

   @Override
   public void a(@Nullable cmm<?> $$0) {
      this.d = $$0;
   }

   @Nullable
   @Override
   public cmm<?> d() {
      return this.d;
   }
}
