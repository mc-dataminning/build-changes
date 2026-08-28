import javax.annotation.Nullable;

public class crk implements bqn, crj {
   private final jr<cup> b = jr.a(1, cup.l);
   @Nullable
   private cyx<?> c;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean c() {
      for (cup $$0 : this.b) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cup a(int $$0) {
      return this.b.get(0);
   }

   @Override
   public cup a(int $$0, int $$1) {
      return bqo.a(this.b, 0);
   }

   @Override
   public cup b(int $$0) {
      return bqo.a(this.b, 0);
   }

   @Override
   public void a(int $$0, cup $$1) {
      this.b.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cmx $$0) {
      return true;
   }

   @Override
   public void a() {
      this.b.clear();
   }

   @Override
   public void a(@Nullable cyx<?> $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public cyx<?> d() {
      return this.c;
   }
}
