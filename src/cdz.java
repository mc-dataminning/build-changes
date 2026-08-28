import javax.annotation.Nullable;

public class cdz<T extends bvh> extends cdy<T> {
   private boolean i = true;

   public cdz(cql $$0, Class<T> $$1, int $$2, boolean $$3, boolean $$4, @Nullable cfy.a $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(boolean $$0) {
      this.i = $$0;
   }

   @Override
   public boolean b() {
      return this.i && super.b();
   }
}
