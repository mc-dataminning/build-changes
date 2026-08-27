import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dcf {
   private final cmp a;
   private final gu b;
   private final boolean c;
   @Nullable
   private dcb d;
   @Nullable
   private czn e;
   private boolean f;

   public dcf(cmp $$0, gu $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.i();
      this.c = $$2;
   }

   public dcb a() {
      if (this.d == null && (this.c || this.a.A(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public czn b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public cmp c() {
      return this.a;
   }

   public gu d() {
      return this.b;
   }

   public static Predicate<dcf> a(Predicate<dcb> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
