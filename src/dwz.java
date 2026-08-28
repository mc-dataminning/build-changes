import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dwz {
   private final dgj a;
   private final ji b;
   private final boolean c;
   @Nullable
   private dwv d;
   @Nullable
   private dtx e;
   private boolean f;

   public dwz(dgj $$0, ji $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.j();
      this.c = $$2;
   }

   public dwv a() {
      if (this.d == null && (this.c || this.a.B(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public dtx b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public dgj c() {
      return this.a;
   }

   public ji d() {
      return this.b;
   }

   public static Predicate<dwz> a(Predicate<dwv> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
