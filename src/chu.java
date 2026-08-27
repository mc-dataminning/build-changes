import javax.annotation.Nullable;

public class chu implements bij, cht {
   private final il<clb> c = il.a(1, clb.b);
   @Nullable
   private coh<?> d;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean ai_() {
      for (clb $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public clb a(int $$0) {
      return this.c.get(0);
   }

   @Override
   public clb a(int $$0, int $$1) {
      return bik.a(this.c, 0);
   }

   @Override
   public clb b(int $$0) {
      return bik.a(this.c, 0);
   }

   @Override
   public void a(int $$0, clb $$1) {
      this.c.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cdm $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
   }

   @Override
   public void a(@Nullable coh<?> $$0) {
      this.d = $$0;
   }

   @Nullable
   @Override
   public coh<?> d() {
      return this.d;
   }
}
