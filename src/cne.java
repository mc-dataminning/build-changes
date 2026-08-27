import javax.annotation.Nullable;

public class cne implements bmv, cnd {
   private final iu<cqk> c = iu.a(1, cqk.h);
   @Nullable
   private ctp<?> d;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean ai_() {
      for (cqk $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cqk a(int $$0) {
      return this.c.get(0);
   }

   @Override
   public cqk a(int $$0, int $$1) {
      return bmw.a(this.c, 0);
   }

   @Override
   public cqk b(int $$0) {
      return bmw.a(this.c, 0);
   }

   @Override
   public void a(int $$0, cqk $$1) {
      this.c.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cis $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
   }

   @Override
   public void a(@Nullable ctp<?> $$0) {
      this.d = $$0;
   }

   @Nullable
   @Override
   public ctp<?> d() {
      return this.d;
   }
}
