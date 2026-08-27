import javax.annotation.Nullable;

public class clv implements blp, clu {
   private final is<cpd> c = is.a(1, cpd.h);
   @Nullable
   private csh<?> d;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean aj_() {
      for (cpd $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cpd a(int $$0) {
      return this.c.get(0);
   }

   @Override
   public cpd a(int $$0, int $$1) {
      return blq.a(this.c, 0);
   }

   @Override
   public cpd b(int $$0) {
      return blq.a(this.c, 0);
   }

   @Override
   public void a(int $$0, cpd $$1) {
      this.c.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(chl $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
   }

   @Override
   public void a(@Nullable csh<?> $$0) {
      this.d = $$0;
   }

   @Nullable
   @Override
   public csh<?> d() {
      return this.d;
   }
}
