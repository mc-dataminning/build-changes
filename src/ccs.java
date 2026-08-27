import javax.annotation.Nullable;

public class ccs implements bdq, ccr {
   private final hn<cfz> c = hn.a(1, cfz.b);
   @Nullable
   private cjc<?> d;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean ab_() {
      for (cfz $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cfz a(int $$0) {
      return this.c.get(0);
   }

   @Override
   public cfz a(int $$0, int $$1) {
      return bdr.a(this.c, 0);
   }

   @Override
   public cfz b(int $$0) {
      return bdr.a(this.c, 0);
   }

   @Override
   public void a(int $$0, cfz $$1) {
      this.c.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(byo $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
   }

   @Override
   public void a(@Nullable cjc<?> $$0) {
      this.d = $$0;
   }

   @Nullable
   @Override
   public cjc<?> d() {
      return this.d;
   }
}
