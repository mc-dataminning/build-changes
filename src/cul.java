import javax.annotation.Nullable;

public class cul implements bst, cuk {
   private final jz<cxg> b = jz.a(1, cxg.j);
   @Nullable
   private dca<?> c;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean c() {
      for (cxg $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cxg a(int $$0) {
      return this.b.get(0);
   }

   @Override
   public cxg a(int $$0, int $$1) {
      return bsu.a(this.b, 0);
   }

   @Override
   public cxg b(int $$0) {
      return bsu.a(this.b, 0);
   }

   @Override
   public void a(int $$0, cxg $$1) {
      this.b.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cpo $$0) {
      return true;
   }

   @Override
   public void a() {
      this.b.clear();
   }

   @Override
   public void a(@Nullable dca<?> $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public dca<?> d() {
      return this.c;
   }
}
