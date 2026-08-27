import javax.annotation.Nullable;

public class coy implements boj, cox {
   private final je<csd> c = je.a(1, csd.i);
   @Nullable
   private cwi<?> d;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean c() {
      for (csd $$0 : this.c) {
         if (!$$0.d()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public csd a(int $$0) {
      return this.c.get(0);
   }

   @Override
   public csd a(int $$0, int $$1) {
      return bok.a(this.c, 0);
   }

   @Override
   public csd b(int $$0) {
      return bok.a(this.c, 0);
   }

   @Override
   public void a(int $$0, csd $$1) {
      this.c.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(ckl $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
   }

   @Override
   public void a(@Nullable cwi<?> $$0) {
      this.d = $$0;
   }

   @Nullable
   @Override
   public cwi<?> d() {
      return this.d;
   }
}
