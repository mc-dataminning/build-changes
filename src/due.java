import java.util.function.Predicate;
import javax.annotation.Nullable;

public class due {
   private final ddv a;
   private final je b;
   private final boolean c;
   @Nullable
   private dua d;
   @Nullable
   private dre e;
   private boolean f;

   public due(ddv $$0, je $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.j();
      this.c = $$2;
   }

   public dua a() {
      if (this.d == null && (this.c || this.a.B(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public dre b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public ddv c() {
      return this.a;
   }

   public je d() {
      return this.b;
   }

   public static Predicate<due> a(Predicate<dua> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
