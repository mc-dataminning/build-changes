import javax.annotation.Nullable;

public class cqv implements bpw, cqu {
   private final js<cua> b = js.a(1, cua.l);
   @Nullable
   private cyi<?> c;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean c() {
      for (cua $$0 : this.b) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cua a(int $$0) {
      return this.b.get(0);
   }

   @Override
   public cua a(int $$0, int $$1) {
      return bpx.a(this.b, 0);
   }

   @Override
   public cua b(int $$0) {
      return bpx.a(this.b, 0);
   }

   @Override
   public void a(int $$0, cua $$1) {
      this.b.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cmh $$0) {
      return true;
   }

   @Override
   public void a() {
      this.b.clear();
   }

   @Override
   public void a(@Nullable cyi<?> $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public cyi<?> d() {
      return this.c;
   }
}
