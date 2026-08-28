import javax.annotation.Nullable;

public class ctg implements brw, ctf {
   private final jz<cwb> b = jz.a(1, cwb.k);
   @Nullable
   private dar<?> c;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean c() {
      for (cwb $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cwb a(int $$0) {
      return this.b.get(0);
   }

   @Override
   public cwb a(int $$0, int $$1) {
      return brx.a(this.b, 0);
   }

   @Override
   public cwb b(int $$0) {
      return brx.a(this.b, 0);
   }

   @Override
   public void a(int $$0, cwb $$1) {
      this.b.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(com $$0) {
      return true;
   }

   @Override
   public void a() {
      this.b.clear();
   }

   @Override
   public void a(@Nullable dar<?> $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public dar<?> d() {
      return this.c;
   }
}
