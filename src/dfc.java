import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dfc {
   private final cpn a;
   private final gv b;
   private final boolean c;
   @Nullable
   private dey d;
   @Nullable
   private dck e;
   private boolean f;

   public dfc(cpn $$0, gv $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.i();
      this.c = $$2;
   }

   public dey a() {
      if (this.d == null && (this.c || this.a.A(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public dck b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public cpn c() {
      return this.a;
   }

   public gv d() {
      return this.b;
   }

   public static Predicate<dfc> a(Predicate<dey> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
