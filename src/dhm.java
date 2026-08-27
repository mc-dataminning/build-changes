import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dhm {
   private final csd a;
   private final ht b;
   private final boolean c;
   @Nullable
   private dhi d;
   @Nullable
   private dfd e;
   private boolean f;

   public dhm(csd $$0, ht $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.i();
      this.c = $$2;
   }

   public dhi a() {
      if (this.d == null && (this.c || this.a.A(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public dfd b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public csd c() {
      return this.a;
   }

   public ht d() {
      return this.b;
   }

   public static Predicate<dhm> a(Predicate<dhi> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
