import javax.annotation.Nullable;

public class cwx implements btz, cww {
   private final jo<czn> b = jo.a(1, czn.k);
   @Nullable
   private dej<?> c;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean c() {
      for (czn $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public czn a(int $$0) {
      return this.b.get(0);
   }

   @Override
   public czn a(int $$0, int $$1) {
      return bua.a(this.b, 0);
   }

   @Override
   public czn b(int $$0) {
      return bua.a(this.b, 0);
   }

   @Override
   public void a(int $$0, czn $$1) {
      this.b.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(crm $$0) {
      return true;
   }

   @Override
   public void a() {
      this.b.clear();
   }

   @Override
   public void a(@Nullable dej<?> $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public dej<?> d() {
      return this.c;
   }
}
