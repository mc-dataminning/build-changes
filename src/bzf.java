import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bzf<T extends bqo> extends bze<T> {
   private boolean i = true;

   public bzf(clf $$0, Class<T> $$1, int $$2, boolean $$3, boolean $$4, @Nullable Predicate<bqo> $$5) {
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
