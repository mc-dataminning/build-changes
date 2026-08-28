import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cch<T extends btp> extends ccg<T> {
   private boolean i = true;

   public cch(coj $$0, Class<T> $$1, int $$2, boolean $$3, boolean $$4, @Nullable Predicate<btp> $$5) {
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
