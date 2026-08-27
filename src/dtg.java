import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dtg {
   private final dcd a;
   private final ir b;
   private final boolean c;
   @Nullable
   private dtc d;
   @Nullable
   private dqc e;
   private boolean f;

   public dtg(dcd $$0, ir $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.i();
      this.c = $$2;
   }

   public dtc a() {
      if (this.d == null && (this.c || this.a.B(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public dqc b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public dcd c() {
      return this.a;
   }

   public ir d() {
      return this.b;
   }

   public static Predicate<dtg> a(Predicate<dtc> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
