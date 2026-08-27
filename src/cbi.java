import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cbi<T extends bsq> extends cbh<T> {
   private boolean i = true;

   public cbi(cnk $$0, Class<T> $$1, int $$2, boolean $$3, boolean $$4, @Nullable Predicate<bsq> $$5) {
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
