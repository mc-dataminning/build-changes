import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dje {
   private final ctl a;
   private final hx b;
   private final boolean c;
   @Nullable
   private dja d;
   @Nullable
   private dgo e;
   private boolean f;

   public dje(ctl $$0, hx $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.i();
      this.c = $$2;
   }

   public dja a() {
      if (this.d == null && (this.c || this.a.B(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public dgo b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public ctl c() {
      return this.a;
   }

   public hx d() {
      return this.b;
   }

   public static Predicate<dje> a(Predicate<dja> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
