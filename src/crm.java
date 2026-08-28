import javax.annotation.Nullable;

public class crm implements bqp, crl {
   private final jr<cur> b = jr.a(1, cur.l);
   @Nullable
   private cyz<?> c;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean c() {
      for (cur $$0 : this.b) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cur a(int $$0) {
      return this.b.get(0);
   }

   @Override
   public cur a(int $$0, int $$1) {
      return bqq.a(this.b, 0);
   }

   @Override
   public cur b(int $$0) {
      return bqq.a(this.b, 0);
   }

   @Override
   public void a(int $$0, cur $$1) {
      this.b.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cmz $$0) {
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
