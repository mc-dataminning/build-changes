import javax.annotation.Nullable;

public class cql implements bpp, cqk {
   private final jg<ctq> b = jg.a(1, ctq.i);
   @Nullable
   private cxy<?> c;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean c() {
      for (ctq $$0 : this.b) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ctq a(int $$0) {
      return this.b.get(0);
   }

   @Override
   public ctq a(int $$0, int $$1) {
      return bpq.a(this.b, 0);
   }

   @Override
   public ctq b(int $$0) {
      return bpq.a(this.b, 0);
   }

   @Override
   public void a(int $$0, ctq $$1) {
      this.b.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cly $$0) {
      return true;
   }

   @Override
   public void a() {
      this.b.clear();
   }

   @Override
   public void a(@Nullable cxy<?> $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public cxy<?> d() {
      return this.c;
   }
}
