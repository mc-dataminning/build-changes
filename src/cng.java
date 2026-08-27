import javax.annotation.Nullable;

public class cng implements bmw, cnf {
   private final iu<cqm> c = iu.a(1, cqm.h);
   @Nullable
   private ctr<?> d;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean ai_() {
      for (cqm $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cqm a(int $$0) {
      return this.c.get(0);
   }

   @Override
   public cqm a(int $$0, int $$1) {
      return bmx.a(this.c, 0);
   }

   @Override
   public cqm b(int $$0) {
      return bmx.a(this.c, 0);
   }

   @Override
   public void a(int $$0, cqm $$1) {
      this.c.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(ciu $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
   }

   @Override
   public void a(@Nullable ctr<?> $$0) {
      this.d = $$0;
   }

   @Nullable
   @Override
   public ctr<?> d() {
      return this.d;
   }
}
