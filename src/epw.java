public class epw extends epi {
   private boolean a;

   public epw(int $$0, int $$1, epi.c $$2) {
      super($$0, $$1, 20, 20, sw.c("narrator.button.difficulty_lock"), $$2, x);
   }

   @Override
   protected tj aE_() {
      return sv.a(super.aE_(), this.a() ? sw.c("narrator.button.difficulty_lock.locked") : sw.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(eox $$0, int $$1, int $$2, float $$3) {
      epw.a $$4;
      if (!this.r) {
         $$4 = this.a ? epw.a.c : epw.a.f;
      } else if (this.n()) {
         $$4 = this.a ? epw.a.b : epw.a.e;
      } else {
         $$4 = this.a ? epw.a.a : epw.a.d;
      }

      $$0.a(epi.m, this.p(), this.r(), $$4.a(), $$4.b(), this.o, this.p);
   }

   static enum a {
      a(0, 146),
      b(0, 166),
      c(0, 186),
      d(20, 146),
      e(20, 166),
      f(20, 186);

      private final int g;
      private final int h;

      private a(int $$0, int $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public int b() {
         return this.h;
      }
   }
}
