import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dxc {
   private final dgm a;
   private final ji b;
   private final boolean c;
   @Nullable
   private dwy d;
   @Nullable
   private dua e;
   private boolean f;

   public dxc(dgm $$0, ji $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.j();
      this.c = $$2;
   }

   public dwy a() {
      if (this.d == null && (this.c || this.a.B(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public dua b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public dgm c() {
      return this.a;
   }

   public ji d() {
      return this.b;
   }

   public static Predicate<dxc> a(Predicate<dwy> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
