import javax.annotation.Nullable;

public class cgk<T extends bxu> extends cgj<T> {
   private boolean i = true;

   public cgk(cto $$0, Class<T> $$1, int $$2, boolean $$3, boolean $$4, @Nullable cij.a $$5) {
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
