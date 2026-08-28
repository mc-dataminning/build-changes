import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ebu {
   private final dkm a;
   private final iw b;
   private final boolean c;
   @Nullable
   private ebq d;
   @Nullable
   private dyo e;
   private boolean f;

   public ebu(dkm $$0, iw $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.j();
      this.c = $$2;
   }

   public ebq a() {
      if (this.d == null && (this.c || this.a.C(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public dyo b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public dkm c() {
      return this.a;
   }

   public iw d() {
      return this.b;
   }

   public static Predicate<ebu> a(Predicate<ebq> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
