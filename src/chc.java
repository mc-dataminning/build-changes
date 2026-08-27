import javax.annotation.Nullable;

public class chc implements bhu, chb {
   private final il<ckj> c = il.a(1, ckj.b);
   @Nullable
   private cno<?> d;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean ai_() {
      for (ckj $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ckj a(int $$0) {
      return this.c.get(0);
   }

   @Override
   public ckj a(int $$0, int $$1) {
      return bhv.a(this.c, 0);
   }

   @Override
   public ckj b(int $$0) {
      return bhv.a(this.c, 0);
   }

   @Override
   public void a(int $$0, ckj $$1) {
      this.c.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(ccx $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
   }

   @Override
   public void a(@Nullable cno<?> $$0) {
      this.d = $$0;
   }

   @Nullable
   @Override
   public cno<?> d() {
      return this.d;
   }
}
