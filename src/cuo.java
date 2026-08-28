import javax.annotation.Nullable;

public class cuo implements bsr, cun {
   private final ka<cxh> b = ka.a(1, cxh.k);
   @Nullable
   private dca<?> c;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean c() {
      for (cxh $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cxh a(int $$0) {
      return this.b.get(0);
   }

   @Override
   public cxh a(int $$0, int $$1) {
      return bss.a(this.b, 0);
   }

   @Override
   public cxh b(int $$0) {
      return bss.a(this.b, 0);
   }

   @Override
   public void a(int $$0, cxh $$1) {
      this.b.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cpr $$0) {
      return true;
   }

   @Override
   public void a() {
      this.b.clear();
   }

   @Override
   public void a(@Nullable dca<?> $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public dca<?> d() {
      return this.c;
   }
}
