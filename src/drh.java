import java.util.function.Predicate;
import javax.annotation.Nullable;

public class drh {
   private final dbc a;
   private final io b;
   private final boolean c;
   @Nullable
   private drd d;
   @Nullable
   private doi e;
   private boolean f;

   public drh(dbc $$0, io $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.i();
      this.c = $$2;
   }

   public drd a() {
      if (this.d == null && (this.c || this.a.B(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public doi b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public dbc c() {
      return this.a;
   }

   public io d() {
      return this.b;
   }

   public static Predicate<drh> a(Predicate<drd> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
