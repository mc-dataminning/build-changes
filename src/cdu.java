import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cdu<T extends bva> extends cdr<T> {
   private final bvx i;

   public cdu(bvx $$0, Class<T> $$1, boolean $$2, @Nullable Predicate<bva> $$3) {
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
