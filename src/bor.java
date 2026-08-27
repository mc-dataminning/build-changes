import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bor<T extends bfz> extends boo<T> {
   private final bgv i;

   public bor(bgv $$0, Class<T> $$1, boolean $$2, @Nullable Predicate<bfz> $$3) {
      super($$0, $$1, 10, $$2, false, $$3);
      this.i = $$0;
   }

   @Override
   public boolean a() {
      return !this.i.q() && super.a();
   }

   @Override
   public boolean b() {
      return this.d != null ? this.d.a(this.e, this.c) : super.b();
   }
}
