import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bxo<T extends box> extends bxn<T> {
   private boolean i = true;

   public bxo(cjk $$0, Class<T> $$1, int $$2, boolean $$3, boolean $$4, @Nullable Predicate<box> $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(boolean $$0) {
      this.i = $$0;
   }

   @Override
   public boolean a() {
      return this.i && super.a();
   }
}
