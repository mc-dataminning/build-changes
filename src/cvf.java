import javax.annotation.Nullable;

public class cvf implements btj, cve {
   private final kb<cxy> b = kb.a(1, cxy.k);
   @Nullable
   private dcq<?> c;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean c() {
      for (cxy $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cxy a(int $$0) {
      return this.b.get(0);
   }

   @Override
   public cxy a(int $$0, int $$1) {
      return btk.a(this.b, 0);
   }

   @Override
   public cxy b(int $$0) {
      return btk.a(this.b, 0);
   }

   @Override
   public void a(int $$0, cxy $$1) {
      this.b.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cqi $$0) {
      return true;
   }

   @Override
   public void a() {
      this.b.clear();
   }

   @Override
   public void a(@Nullable dcq<?> $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public dcq<?> d() {
      return this.c;
   }
}
