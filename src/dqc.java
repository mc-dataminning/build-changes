import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dqc {
   private final czx a;
   private final im b;
   private final boolean c;
   @Nullable
   private dpy d;
   @Nullable
   private dnd e;
   private boolean f;

   public dqc(czx $$0, im $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.i();
      this.c = $$2;
   }

   public dpy a() {
      if (this.d == null && (this.c || this.a.B(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public dnd b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public czx c() {
      return this.a;
   }

   public im d() {
      return this.b;
   }

   public static Predicate<dqc> a(Predicate<dpy> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
