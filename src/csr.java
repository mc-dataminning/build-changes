import javax.annotation.Nullable;

public class csr implements brl, csq {
   private final jx<cvs> b = jx.a(1, cvs.k);
   @Nullable
   private dam<?> c;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean c() {
      for (cvs $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cvs a(int $$0) {
      return this.b.get(0);
   }

   @Override
   public cvs a(int $$0, int $$1) {
      return brm.a(this.b, 0);
   }

   @Override
   public cvs b(int $$0) {
      return brm.a(this.b, 0);
   }

   @Override
   public void a(int $$0, cvs $$1) {
      this.b.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cnx $$0) {
      return true;
   }

   @Override
   public void a() {
      this.b.clear();
   }

   @Override
   public void a(@Nullable dam<?> $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public dam<?> d() {
      return this.c;
   }
}
