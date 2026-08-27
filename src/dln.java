import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dln {
   private final cvu a;
   private final hz b;
   private final boolean c;
   @Nullable
   private dlj d;
   @Nullable
   private dix e;
   private boolean f;

   public dln(cvu $$0, hz $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.i();
      this.c = $$2;
   }

   public dlj a() {
      if (this.d == null && (this.c || this.a.B(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public dix b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public cvu c() {
      return this.a;
   }

   public hz d() {
      return this.b;
   }

   public static Predicate<dln> a(Predicate<dlj> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
