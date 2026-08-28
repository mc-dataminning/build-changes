import javax.annotation.Nullable;

public class ctb implements brr, cta {
   private final jy<cvx> b = jy.a(1, cvx.k);
   @Nullable
   private dal<?> c;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean c() {
      for (cvx $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cvx a(int $$0) {
      return this.b.get(0);
   }

   @Override
   public cvx a(int $$0, int $$1) {
      return brs.a(this.b, 0);
   }

   @Override
   public cvx b(int $$0) {
      return brs.a(this.b, 0);
   }

   @Override
   public void a(int $$0, cvx $$1) {
      this.b.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(coh $$0) {
      return true;
   }

   @Override
   public void a() {
      this.b.clear();
   }

   @Override
   public void a(@Nullable dal<?> $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public dal<?> d() {
      return this.c;
   }
}
