import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cch<T extends btn> extends cce<T> {
   private final buk i;

   public cch(buk $$0, Class<T> $$1, boolean $$2, @Nullable Predicate<btn> $$3) {
      super($$0, $$1, 10, $$2, false, $$3);
      this.i = $$0;
   }

   @Override
   public boolean a() {
      return !this.i.s() && super.a();
   }

   @Override
   public boolean b() {
      return this.d != null ? this.d.a(this.e, this.c) : super.b();
   }
}
