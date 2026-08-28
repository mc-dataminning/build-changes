import javax.annotation.Nullable;

public class crj implements bqm, cri {
   private final jr<cuo> b = jr.a(1, cuo.l);
   @Nullable
   private cyw<?> c;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean c() {
      for (cuo $$0 : this.b) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cuo a(int $$0) {
      return this.b.get(0);
   }

   @Override
   public cuo a(int $$0, int $$1) {
      return bqn.a(this.b, 0);
   }

   @Override
   public cuo b(int $$0) {
      return bqn.a(this.b, 0);
   }

   @Override
   public void a(int $$0, cuo $$1) {
      this.b.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cmw $$0) {
      return true;
   }

   @Override
   public void a() {
      this.b.clear();
   }

   @Override
   public void a(@Nullable cyw<?> $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public cyw<?> d() {
      return this.c;
   }
}
