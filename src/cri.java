import javax.annotation.Nullable;

public class cri implements bql, crh {
   private final jr<cun> b = jr.a(1, cun.l);
   @Nullable
   private cyv<?> c;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean c() {
      for (cun $$0 : this.b) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cun a(int $$0) {
      return this.b.get(0);
   }

   @Override
   public cun a(int $$0, int $$1) {
      return bqm.a(this.b, 0);
   }

   @Override
   public cun b(int $$0) {
      return bqm.a(this.b, 0);
   }

   @Override
   public void a(int $$0, cun $$1) {
      this.b.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cmv $$0) {
      return true;
   }

   @Override
   public void a() {
      this.b.clear();
   }

   @Override
   public void a(@Nullable cyv<?> $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public cyv<?> d() {
      return this.c;
   }
}
