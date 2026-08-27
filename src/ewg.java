import java.util.function.Function;

public class ewg<T> implements evx<T> {
   private final Function<io, ewe<T>> a;

   public ewg(Function<io, ewe<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(io $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(ewb<T> $$0) {
      this.a.apply($$0.b()).a($$0);
   }

   @Override
   public boolean b(io $$0, T $$1) {
      return false;
   }

   @Override
   public int a() {
      return 0;
   }
}
