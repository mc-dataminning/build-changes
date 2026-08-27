import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bvc<T extends bmk> extends buz<T> {
   private final bnf i;

   public bvc(bnf $$0, Class<T> $$1, boolean $$2, @Nullable Predicate<bmk> $$3) {
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
