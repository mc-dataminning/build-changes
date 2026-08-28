import javax.annotation.Nullable;

public class cso implements bri, csn {
   private final jw<cvp> b = jw.a(1, cvp.k);
   @Nullable
   private daj<?> c;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean c() {
      for (cvp $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cvp a(int $$0) {
      return this.b.get(0);
   }

   @Override
   public cvp a(int $$0, int $$1) {
      return brj.a(this.b, 0);
   }

   @Override
   public cvp b(int $$0) {
      return brj.a(this.b, 0);
   }

   @Override
   public void a(int $$0, cvp $$1) {
      this.b.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cnu $$0) {
      return true;
   }

   @Override
   public void a() {
      this.b.clear();
   }

   @Override
   public void a(@Nullable daj<?> $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public daj<?> d() {
      return this.c;
   }
}
