import javax.annotation.Nullable;

public class ctr implements bsd, ctq {
   private final jz<cwm> b = jz.a(1, cwm.k);
   @Nullable
   private dbc<?> c;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean c() {
      for (cwm $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cwm a(int $$0) {
      return this.b.get(0);
   }

   @Override
   public cwm a(int $$0, int $$1) {
      return bse.a(this.b, 0);
   }

   @Override
   public cwm b(int $$0) {
      return bse.a(this.b, 0);
   }

   @Override
   public void a(int $$0, cwm $$1) {
      this.b.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cou $$0) {
      return true;
   }

   @Override
   public void a() {
      this.b.clear();
   }

   @Override
   public void a(@Nullable dbc<?> $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public dbc<?> d() {
      return this.c;
   }
}
