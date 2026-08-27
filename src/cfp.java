import javax.annotation.Nullable;

public class cfp implements bgh, cfo {
   private final ho<ciw> c = ho.a(1, ciw.b);
   @Nullable
   private clz<?> d;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean ab_() {
      for (ciw $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ciw a(int $$0) {
      return this.c.get(0);
   }

   @Override
   public ciw a(int $$0, int $$1) {
      return bgi.a(this.c, 0);
   }

   @Override
   public ciw b(int $$0) {
      return bgi.a(this.c, 0);
   }

   @Override
   public void a(int $$0, ciw $$1) {
      this.c.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cbl $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
   }

   @Override
   public void a(@Nullable clz<?> $$0) {
      this.d = $$0;
   }

   @Nullable
   @Override
   public clz<?> d() {
      return this.d;
   }
}
