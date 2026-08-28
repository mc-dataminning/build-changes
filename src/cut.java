import javax.annotation.Nullable;

public class cut implements btb, cus {
   private final jz<cxo> b = jz.a(1, cxo.j);
   @Nullable
   private dci<?> c;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean c() {
      for (cxo $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cxo a(int $$0) {
      return this.b.get(0);
   }

   @Override
   public cxo a(int $$0, int $$1) {
      return btc.a(this.b, 0);
   }

   @Override
   public cxo b(int $$0) {
      return btc.a(this.b, 0);
   }

   @Override
   public void a(int $$0, cxo $$1) {
      this.b.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cpw $$0) {
      return true;
   }

   @Override
   public void a() {
      this.b.clear();
   }

   @Override
   public void a(@Nullable dci<?> $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public dci<?> d() {
      return this.c;
   }
}
