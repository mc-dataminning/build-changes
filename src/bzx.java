import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bzx<T extends bre> extends bzu<T> {
   private final bsa i;

   public bzx(bsa $$0, Class<T> $$1, boolean $$2, @Nullable Predicate<bre> $$3) {
      super($$0, $$1, 10, $$2, false, $$3);
      this.i = $$0;
   }

   @Override
   public boolean a() {
      return !this.i.r() && super.a();
   }

   @Override
   public boolean b() {
      return this.d != null ? this.d.a(this.e, this.c) : super.b();
   }
}
