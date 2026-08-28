import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cdp<T extends buv> extends cdm<T> {
   private final bvs i;

   public cdp(bvs $$0, Class<T> $$1, boolean $$2, @Nullable Predicate<buv> $$3) {
      super($$0, $$1, 10, $$2, false, $$3);
      this.i = $$0;
   }

   @Override
   public boolean b() {
      return !this.i.q() && super.b();
   }

   @Override
   public boolean c() {
      return this.d != null ? this.d.a(this.e, this.c) : super.c();
   }
}
