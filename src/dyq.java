import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dyq {
   private final dhs a;
   private final jj b;
   private final boolean c;
   @Nullable
   private dym d;
   @Nullable
   private dvl e;
   private boolean f;

   public dyq(dhs $$0, jj $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.j();
      this.c = $$2;
   }

   public dym a() {
      if (this.d == null && (this.c || this.a.B(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public dvl b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public dhs c() {
      return this.a;
   }

   public jj d() {
      return this.b;
   }

   public static Predicate<dyq> a(Predicate<dym> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
