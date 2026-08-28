import javax.annotation.Nullable;

public class cwn implements btw, cwm {
   private final jn<czd> b = jn.a(1, czd.k);
   @Nullable
   private ddz<?> c;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean c() {
      for (czd $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public czd a(int $$0) {
      return this.b.get(0);
   }

   @Override
   public czd a(int $$0, int $$1) {
      return btx.a(this.b, 0);
   }

   @Override
   public czd b(int $$0) {
      return btx.a(this.b, 0);
   }

   @Override
   public void a(int $$0, czd $$1) {
      this.b.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(crc $$0) {
      return true;
   }

   @Override
   public void a() {
      this.b.clear();
   }

   @Override
   public void a(@Nullable ddz<?> $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public ddz<?> d() {
      return this.c;
   }
}
