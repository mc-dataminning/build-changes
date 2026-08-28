import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cdg<T extends bun> extends cdd<T> {
   private final bvj i;

   public cdg(bvj $$0, Class<T> $$1, boolean $$2, @Nullable Predicate<bun> $$3) {
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
