import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bvd<T extends bml> extends bva<T> {
   private final bng i;

   public bvd(bng $$0, Class<T> $$1, boolean $$2, @Nullable Predicate<bml> $$3) {
      super($$0, $$1, 10, $$2, false, $$3);
      this.i = $$0;
   }

   @Override
   public boolean a() {
      return !this.i.u() && super.a();
   }

   @Override
   public boolean b() {
      return this.d != null ? this.d.a(this.e, this.c) : super.b();
   }
}
