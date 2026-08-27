import javax.annotation.Nullable;

public class cpu implements bpf, cpt {
   private final jf<csz> b = jf.a(1, csz.i);
   @Nullable
   private cxf<?> c;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean c() {
      for (csz $$0 : this.b) {
         if (!$$0.d()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public csz a(int $$0) {
      return this.b.get(0);
   }

   @Override
   public csz a(int $$0, int $$1) {
      return bpg.a(this.b, 0);
   }

   @Override
   public csz b(int $$0) {
      return bpg.a(this.b, 0);
   }

   @Override
   public void a(int $$0, csz $$1) {
      this.b.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(clh $$0) {
      return true;
   }

   @Override
   public void a() {
      this.b.clear();
   }

   @Override
   public void a(@Nullable cxf<?> $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public cxf<?> d() {
      return this.c;
   }
}
