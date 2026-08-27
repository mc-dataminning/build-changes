import javax.annotation.Nullable;

public class cge implements bgx, cgd {
   private final hn<cjl> c = hn.a(1, cjl.b);
   @Nullable
   private cmq<?> d;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean af_() {
      for (cjl $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cjl a(int $$0) {
      return this.c.get(0);
   }

   @Override
   public cjl a(int $$0, int $$1) {
      return bgy.a(this.c, 0);
   }

   @Override
   public cjl b(int $$0) {
      return bgy.a(this.c, 0);
   }

   @Override
   public void a(int $$0, cjl $$1) {
      this.c.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cca $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
   }

   @Override
   public void a(@Nullable cmq<?> $$0) {
      this.d = $$0;
   }

   @Nullable
   @Override
   public cmq<?> d() {
      return this.d;
   }
}
