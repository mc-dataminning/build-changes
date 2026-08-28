import javax.annotation.Nullable;

public class cwu implements btz, cwt {
   private final jo<czk> b = jo.a(1, czk.k);
   @Nullable
   private deg<?> c;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean c() {
      for (czk $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public czk a(int $$0) {
      return this.b.get(0);
   }

   @Override
   public czk a(int $$0, int $$1) {
      return bua.a(this.b, 0);
   }

   @Override
   public czk b(int $$0) {
      return bua.a(this.b, 0);
   }

   @Override
   public void a(int $$0, czk $$1) {
      this.b.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(crj $$0) {
      return true;
   }

   @Override
   public void a() {
      this.b.clear();
   }

   @Override
   public void a(@Nullable deg<?> $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public deg<?> d() {
      return this.c;
   }
}
