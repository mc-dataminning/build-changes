import javax.annotation.Nullable;

public class cqy implements bpz, cqx {
   private final js<cuc> b = js.a(1, cuc.l);
   @Nullable
   private cyk<?> c;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean c() {
      for (cuc $$0 : this.b) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cuc a(int $$0) {
      return this.b.get(0);
   }

   @Override
   public cuc a(int $$0, int $$1) {
      return bqa.a(this.b, 0);
   }

   @Override
   public cuc b(int $$0) {
      return bqa.a(this.b, 0);
   }

   @Override
   public void a(int $$0, cuc $$1) {
      this.b.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cmk $$0) {
      return true;
   }

   @Override
   public void a() {
      this.b.clear();
   }

   @Override
   public void a(@Nullable cyk<?> $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public cyk<?> d() {
      return this.c;
   }
}
