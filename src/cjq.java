import javax.annotation.Nullable;

public class cjq implements bjt, cjp {
   private final iq<cmx> c = iq.a(1, cmx.f);
   @Nullable
   private cqd<?> d;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean ai_() {
      for (cmx $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cmx a(int $$0) {
      return this.c.get(0);
   }

   @Override
   public cmx a(int $$0, int $$1) {
      return bju.a(this.c, 0);
   }

   @Override
   public cmx b(int $$0) {
      return bju.a(this.c, 0);
   }

   @Override
   public void a(int $$0, cmx $$1) {
      this.c.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cfh $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
   }

   @Override
   public void a(@Nullable cqd<?> $$0) {
      this.d = $$0;
   }

   @Nullable
   @Override
   public cqd<?> d() {
      return this.d;
   }
}
