import javax.annotation.Nullable;

public class csi implements brd, csh {
   private final jw<cvl> b = jw.a(1, cvl.k);
   @Nullable
   private czv<?> c;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean c() {
      for (cvl $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cvl a(int $$0) {
      return this.b.get(0);
   }

   @Override
   public cvl a(int $$0, int $$1) {
      return bre.a(this.b, 0);
   }

   @Override
   public cvl b(int $$0) {
      return bre.a(this.b, 0);
   }

   @Override
   public void a(int $$0, cvl $$1) {
      this.b.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cnp $$0) {
      return true;
   }

   @Override
   public void a() {
      this.b.clear();
   }

   @Override
   public void a(@Nullable czv<?> $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public czv<?> d() {
      return this.c;
   }
}
