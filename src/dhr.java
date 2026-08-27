import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dhr {
   private final csi a;
   private final hx b;
   private final boolean c;
   @Nullable
   private dhn d;
   @Nullable
   private dfi e;
   private boolean f;

   public dhr(csi $$0, hx $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.i();
      this.c = $$2;
   }

   public dhn a() {
      if (this.d == null && (this.c || this.a.A(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public dfi b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public csi c() {
      return this.a;
   }

   public hx d() {
      return this.b;
   }

   public static Predicate<dhr> a(Predicate<dhn> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
