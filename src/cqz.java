import javax.annotation.Nullable;

public class cqz implements bpt, cqy {
   private final jj<cuh> b = jj.a(1, cuh.i);
   @Nullable
   private czc<?> c;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean c() {
      for (cuh $$0 : this.b) {
         if (!$$0.d()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cuh a(int $$0) {
      return this.b.get(0);
   }

   @Override
   public cuh a(int $$0, int $$1) {
      return bpu.a(this.b, 0);
   }

   @Override
   public cuh b(int $$0) {
      return bpu.a(this.b, 0);
   }

   @Override
   public void a(int $$0, cuh $$1) {
      this.b.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cly $$0) {
      return true;
   }

   @Override
   public void a() {
      this.b.clear();
   }

   @Override
   public void a(@Nullable czc<?> $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public czc<?> d() {
      return this.c;
   }
}
