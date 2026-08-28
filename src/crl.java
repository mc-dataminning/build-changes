import javax.annotation.Nullable;

public class crl implements bqk, crk {
   private final jv<cuq> b = jv.a(1, cuq.l);
   @Nullable
   private czb<?> c;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean c() {
      for (cuq $$0 : this.b) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cuq a(int $$0) {
      return this.b.get(0);
   }

   @Override
   public cuq a(int $$0, int $$1) {
      return bql.a(this.b, 0);
   }

   @Override
   public cuq b(int $$0) {
      return bql.a(this.b, 0);
   }

   @Override
   public void a(int $$0, cuq $$1) {
      this.b.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cmx $$0) {
      return true;
   }

   @Override
   public void a() {
      this.b.clear();
   }

   @Override
   public void a(@Nullable czb<?> $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public czb<?> d() {
      return this.c;
   }
}
