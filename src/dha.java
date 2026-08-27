import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dha {
   private final crv a;
   private final ht b;
   private final boolean c;
   @Nullable
   private dgw d;
   @Nullable
   private der e;
   private boolean f;

   public dha(crv $$0, ht $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.i();
      this.c = $$2;
   }

   public dgw a() {
      if (this.d == null && (this.c || this.a.A(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public der b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public crv c() {
      return this.a;
   }

   public ht d() {
      return this.b;
   }

   public static Predicate<dha> a(Predicate<dgw> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
