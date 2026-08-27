import javax.annotation.Nullable;

public class cja implements bje, ciz {
   private final io<cmh> c = io.a(1, cmh.f);
   @Nullable
   private cpn<?> d;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean ai_() {
      for (cmh $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cmh a(int $$0) {
      return this.c.get(0);
   }

   @Override
   public cmh a(int $$0, int $$1) {
      return bjf.a(this.c, 0);
   }

   @Override
   public cmh b(int $$0) {
      return bjf.a(this.c, 0);
   }

   @Override
   public void a(int $$0, cmh $$1) {
      this.c.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cer $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
   }

   @Override
   public void a(@Nullable cpn<?> $$0) {
      this.d = $$0;
   }

   @Nullable
   @Override
   public cpn<?> d() {
      return this.d;
   }
}
