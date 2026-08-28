import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dus {
   private final dej a;
   private final je b;
   private final boolean c;
   @Nullable
   private duo d;
   @Nullable
   private drs e;
   private boolean f;

   public dus(dej $$0, je $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.j();
      this.c = $$2;
   }

   public duo a() {
      if (this.d == null && (this.c || this.a.B(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public drs b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public dej c() {
      return this.a;
   }

   public je d() {
      return this.b;
   }

   public static Predicate<dus> a(Predicate<duo> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
