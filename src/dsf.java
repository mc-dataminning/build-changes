import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dsf {
   private final dca a;
   private final iz b;
   private final boolean c;
   @Nullable
   private dsb d;
   @Nullable
   private dpg e;
   private boolean f;

   public dsf(dca $$0, iz $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.i();
      this.c = $$2;
   }

   public dsb a() {
      if (this.d == null && (this.c || this.a.B(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public dpg b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public dca c() {
      return this.a;
   }

   public iz d() {
      return this.b;
   }

   public static Predicate<dsf> a(Predicate<dsb> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
