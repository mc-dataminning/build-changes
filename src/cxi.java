import javax.annotation.Nullable;

public class cxi implements buk, cxh {
   private final jo<czy> b = jo.a(1, czy.k);
   @Nullable
   private deu<?> c;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean c() {
      for (czy $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public czy a(int $$0) {
      return this.b.get(0);
   }

   @Override
   public czy a(int $$0, int $$1) {
      return bul.a(this.b, 0);
   }

   @Override
   public czy b(int $$0) {
      return bul.a(this.b, 0);
   }

   @Override
   public void a(int $$0, czy $$1) {
      this.b.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(crx $$0) {
      return true;
   }

   @Override
   public void a() {
      this.b.clear();
   }

   @Override
   public void a(@Nullable deu<?> $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public deu<?> d() {
      return this.c;
   }
}
