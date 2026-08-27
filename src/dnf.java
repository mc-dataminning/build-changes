import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dnf {
   private final cxe a;
   private final ib b;
   private final boolean c;
   @Nullable
   private dnb d;
   @Nullable
   private dki e;
   private boolean f;

   public dnf(cxe $$0, ib $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.i();
      this.c = $$2;
   }

   public dnb a() {
      if (this.d == null && (this.c || this.a.B(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public dki b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public cxe c() {
      return this.a;
   }

   public ib d() {
      return this.b;
   }

   public static Predicate<dnf> a(Predicate<dnb> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
