import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dfh {
   private final cqe a;
   private final gw b;
   private final boolean c;
   @Nullable
   private dfd d;
   @Nullable
   private dcz e;
   private boolean f;

   public dfh(cqe $$0, gw $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.i();
      this.c = $$2;
   }

   public dfd a() {
      if (this.d == null && (this.c || this.a.A(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public dcz b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public cqe c() {
      return this.a;
   }

   public gw d() {
      return this.b;
   }

   public static Predicate<dfh> a(Predicate<dfd> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
