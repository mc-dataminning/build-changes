import javax.annotation.Nullable;

public class crj implements bqj, cri {
   private final jv<cuo> b = jv.a(1, cuo.l);
   @Nullable
   private cyz<?> c;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean c() {
      for (cuo $$0 : this.b) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cuo a(int $$0) {
      return this.b.get(0);
   }

   @Override
   public cuo a(int $$0, int $$1) {
      return bqk.a(this.b, 0);
   }

   @Override
   public cuo b(int $$0) {
      return bqk.a(this.b, 0);
   }

   @Override
   public void a(int $$0, cuo $$1) {
      this.b.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cmv $$0) {
      return true;
   }

   @Override
   public void a() {
      this.b.clear();
   }

   @Override
   public void a(@Nullable cyz<?> $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public cyz<?> d() {
      return this.c;
   }
}
