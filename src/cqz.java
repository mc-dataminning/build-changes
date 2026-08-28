import javax.annotation.Nullable;

public class cqz implements bqa, cqy {
   private final js<cud> b = js.a(1, cud.l);
   @Nullable
   private cyl<?> c;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean c() {
      for (cud $$0 : this.b) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cud a(int $$0) {
      return this.b.get(0);
   }

   @Override
   public cud a(int $$0, int $$1) {
      return bqb.a(this.b, 0);
   }

   @Override
   public cud b(int $$0) {
      return bqb.a(this.b, 0);
   }

   @Override
   public void a(int $$0, cud $$1) {
      this.b.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cml $$0) {
      return true;
   }

   @Override
   public void a() {
      this.b.clear();
   }

   @Override
   public void a(@Nullable cyl<?> $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public cyl<?> d() {
      return this.c;
   }
}
