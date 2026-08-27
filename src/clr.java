import javax.annotation.Nullable;

public class clr implements bln, clq {
   private final is<coz> c = is.a(1, coz.h);
   @Nullable
   private csd<?> d;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean aj_() {
      for (coz $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public coz a(int $$0) {
      return this.c.get(0);
   }

   @Override
   public coz a(int $$0, int $$1) {
      return blo.a(this.c, 0);
   }

   @Override
   public coz b(int $$0) {
      return blo.a(this.c, 0);
   }

   @Override
   public void a(int $$0, coz $$1) {
      this.c.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(chh $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
   }

   @Override
   public void a(@Nullable csd<?> $$0) {
      this.d = $$0;
   }

   @Nullable
   @Override
   public csd<?> d() {
      return this.d;
   }
}
