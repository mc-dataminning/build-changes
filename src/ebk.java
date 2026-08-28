import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ebk {
   private final dkc a;
   private final iw b;
   private final boolean c;
   @Nullable
   private ebg d;
   @Nullable
   private dye e;
   private boolean f;

   public ebk(dkc $$0, iw $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.j();
      this.c = $$2;
   }

   public ebg a() {
      if (this.d == null && (this.c || this.a.C(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public dye b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public dkc c() {
      return this.a;
   }

   public iw d() {
      return this.b;
   }

   public static Predicate<ebk> a(Predicate<ebg> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
