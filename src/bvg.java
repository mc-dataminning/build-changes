import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bvg<T extends bmo> extends bvd<T> {
   private final bnj i;

   public bvg(bnj $$0, Class<T> $$1, boolean $$2, @Nullable Predicate<bmo> $$3) {
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
