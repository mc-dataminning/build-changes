import javax.annotation.Nullable;

public class crf implements bqi, cre {
   private final jr<cuk> b = jr.a(1, cuk.l);
   @Nullable
   private cys<?> c;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean c() {
      for (cuk $$0 : this.b) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cuk a(int $$0) {
      return this.b.get(0);
   }

   @Override
   public cuk a(int $$0, int $$1) {
      return bqj.a(this.b, 0);
   }

   @Override
   public cuk b(int $$0) {
      return bqj.a(this.b, 0);
   }

   @Override
   public void a(int $$0, cuk $$1) {
      this.b.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cms $$0) {
      return true;
   }

   @Override
   public void a() {
      this.b.clear();
   }

   @Override
   public void a(@Nullable cys<?> $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public cys<?> d() {
      return this.c;
   }
}
