import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bxq<T extends box> extends bxn<T> {
   private final bpt i;

   public bxq(bpt $$0, Class<T> $$1, boolean $$2, @Nullable Predicate<box> $$3) {
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
