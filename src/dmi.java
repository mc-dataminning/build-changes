import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dmi {
   private final cwh a;
   private final ib b;
   private final boolean c;
   @Nullable
   private dme d;
   @Nullable
   private djl e;
   private boolean f;

   public dmi(cwh $$0, ib $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.i();
      this.c = $$2;
   }

   public dme a() {
      if (this.d == null && (this.c || this.a.B(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public djl b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public cwh c() {
      return this.a;
   }

   public ib d() {
      return this.b;
   }

   public static Predicate<dmi> a(Predicate<dme> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
