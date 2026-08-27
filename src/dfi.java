import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dfi {
   private final cpt a;
   private final gw b;
   private final boolean c;
   @Nullable
   private dfe d;
   @Nullable
   private dcq e;
   private boolean f;

   public dfi(cpt $$0, gw $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.i();
      this.c = $$2;
   }

   public dfe a() {
      if (this.d == null && (this.c || this.a.A(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public dcq b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public cpt c() {
      return this.a;
   }

   public gw d() {
      return this.b;
   }

   public static Predicate<dfi> a(Predicate<dfe> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
