import javax.annotation.Nullable;

public class cxu implements buv, cxs {
   private final jp<dak> b = jp.a(1, dak.l);
   @Nullable
   private dfg<?> c;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean c() {
      for (dak $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dak a(int $$0) {
      return this.b.get(0);
   }

   @Override
   public dak a(int $$0, int $$1) {
      return buw.a(this.b, 0);
   }

   @Override
   public dak b(int $$0) {
      return buw.a(this.b, 0);
   }

   @Override
   public void a(int $$0, dak $$1) {
      this.b.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(csi $$0) {
      return true;
   }

   @Override
   public void a() {
      this.b.clear();
   }

   @Override
   public void a(@Nullable dfg<?> $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public dfg<?> d() {
      return this.c;
   }
}
