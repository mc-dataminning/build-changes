import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dfd {
   private final cpo a;
   private final gu b;
   private final boolean c;
   @Nullable
   private dez d;
   @Nullable
   private dcl e;
   private boolean f;

   public dfd(cpo $$0, gu $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.i();
      this.c = $$2;
   }

   public dez a() {
      if (this.d == null && (this.c || this.a.A(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public dcl b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public cpo c() {
      return this.a;
   }

   public gu d() {
      return this.b;
   }

   public static Predicate<dfd> a(Predicate<dez> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
