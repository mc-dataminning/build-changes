import javax.annotation.Nullable;

public class cfy implements bgr, cfx {
   private final hn<cjf> c = hn.a(1, cjf.b);
   @Nullable
   private cmk<?> d;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean af_() {
      for (cjf $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cjf a(int $$0) {
      return this.c.get(0);
   }

   @Override
   public cjf a(int $$0, int $$1) {
      return bgs.a(this.c, 0);
   }

   @Override
   public cjf b(int $$0) {
      return bgs.a(this.c, 0);
   }

   @Override
   public void a(int $$0, cjf $$1) {
      this.c.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cbu $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
   }

   @Override
   public void a(@Nullable cmk<?> $$0) {
      this.d = $$0;
   }

   @Nullable
   @Override
   public cmk<?> d() {
      return this.d;
   }
}
