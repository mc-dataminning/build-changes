import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bop<T extends bfz> extends boo<T> {
   private boolean i = true;

   public bop(bzw $$0, Class<T> $$1, int $$2, boolean $$3, boolean $$4, @Nullable Predicate<bfz> $$5) {
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
