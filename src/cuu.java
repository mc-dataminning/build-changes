import javax.annotation.Nullable;

public class cuu implements btc, cut {
   private final jz<cxp> b = jz.a(1, cxp.j);
   @Nullable
   private dcj<?> c;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean c() {
      for (cxp $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cxp a(int $$0) {
      return this.b.get(0);
   }

   @Override
   public cxp a(int $$0, int $$1) {
      return btd.a(this.b, 0);
   }

   @Override
   public cxp b(int $$0) {
      return btd.a(this.b, 0);
   }

   @Override
   public void a(int $$0, cxp $$1) {
      this.b.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cpx $$0) {
      return true;
   }

   @Override
   public void a() {
      this.b.clear();
   }

   @Override
   public void a(@Nullable dcj<?> $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public dcj<?> d() {
      return this.c;
   }
}
