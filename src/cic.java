import javax.annotation.Nullable;

public class cic implements biq, cib {
   private final il<clj> c = il.a(1, clj.b);
   @Nullable
   private coq<?> d;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean ai_() {
      for (clj $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public clj a(int $$0) {
      return this.c.get(0);
   }

   @Override
   public clj a(int $$0, int $$1) {
      return bir.a(this.c, 0);
   }

   @Override
   public clj b(int $$0) {
      return bir.a(this.c, 0);
   }

   @Override
   public void a(int $$0, clj $$1) {
      this.c.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cdu $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
   }

   @Override
   public void a(@Nullable coq<?> $$0) {
      this.d = $$0;
   }

   @Nullable
   @Override
   public coq<?> d() {
      return this.d;
   }
}
