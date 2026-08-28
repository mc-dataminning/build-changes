import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dtg {
   private final dcz a;
   private final jd b;
   private final boolean c;
   @Nullable
   private dtc d;
   @Nullable
   private dqh e;
   private boolean f;

   public dtg(dcz $$0, jd $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.j();
      this.c = $$2;
   }

   public dtc a() {
      if (this.d == null && (this.c || this.a.B(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public dqh b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public dcz c() {
      return this.a;
   }

   public jd d() {
      return this.b;
   }

   public static Predicate<dtg> a(Predicate<dtc> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
