import javax.annotation.Nullable;

public class cqj implements bpn, cqi {
   private final jg<cto> b = jg.a(1, cto.i);
   @Nullable
   private cxw<?> c;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean c() {
      for (cto $$0 : this.b) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cto a(int $$0) {
      return this.b.get(0);
   }

   @Override
   public cto a(int $$0, int $$1) {
      return bpo.a(this.b, 0);
   }

   @Override
   public cto b(int $$0) {
      return bpo.a(this.b, 0);
   }

   @Override
   public void a(int $$0, cto $$1) {
      this.b.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(clw $$0) {
      return true;
   }

   @Override
   public void a() {
      this.b.clear();
   }

   @Override
   public void a(@Nullable cxw<?> $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public cxw<?> d() {
      return this.c;
   }
}
