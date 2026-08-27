import java.util.function.Predicate;
import javax.annotation.Nullable;

public class drf {
   private final dba a;
   private final io b;
   private final boolean c;
   @Nullable
   private drb d;
   @Nullable
   private dog e;
   private boolean f;

   public drf(dba $$0, io $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.i();
      this.c = $$2;
   }

   public drb a() {
      if (this.d == null && (this.c || this.a.B(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public dog b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public dba c() {
      return this.a;
   }

   public io d() {
      return this.b;
   }

   public static Predicate<drf> a(Predicate<drb> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
