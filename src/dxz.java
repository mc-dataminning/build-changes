import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dxz {
   private final dhl a;
   private final jh b;
   private final boolean c;
   @Nullable
   private dxv d;
   @Nullable
   private dux e;
   private boolean f;

   public dxz(dhl $$0, jh $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.j();
      this.c = $$2;
   }

   public dxv a() {
      if (this.d == null && (this.c || this.a.B(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public dux b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public dhl c() {
      return this.a;
   }

   public jh d() {
      return this.b;
   }

   public static Predicate<dxz> a(Predicate<dxv> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
