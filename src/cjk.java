import javax.annotation.Nullable;

public class cjk implements bjo, cjj {
   private final iq<cmr> c = iq.a(1, cmr.f);
   @Nullable
   private cpx<?> d;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean ai_() {
      for (cmr $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cmr a(int $$0) {
      return this.c.get(0);
   }

   @Override
   public cmr a(int $$0, int $$1) {
      return bjp.a(this.c, 0);
   }

   @Override
   public cmr b(int $$0) {
      return bjp.a(this.c, 0);
   }

   @Override
   public void a(int $$0, cmr $$1) {
      this.c.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cfb $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
   }

   @Override
   public void a(@Nullable cpx<?> $$0) {
      this.d = $$0;
   }

   @Nullable
   @Override
   public cpx<?> d() {
      return this.d;
   }
}
