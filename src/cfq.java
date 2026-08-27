import javax.annotation.Nullable;

public class cfq implements bgj, cfp {
   private final hn<cix> c = hn.a(1, cix.b);
   @Nullable
   private cma<?> d;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean aa_() {
      for (cix $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cix a(int $$0) {
      return this.c.get(0);
   }

   @Override
   public cix a(int $$0, int $$1) {
      return bgk.a(this.c, 0);
   }

   @Override
   public cix b(int $$0) {
      return bgk.a(this.c, 0);
   }

   @Override
   public void a(int $$0, cix $$1) {
      this.c.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cbm $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
   }

   @Override
   public void a(@Nullable cma<?> $$0) {
      this.d = $$0;
   }

   @Nullable
   @Override
   public cma<?> d() {
      return this.d;
   }
}
