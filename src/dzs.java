import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dzs {
   private final dis a;
   private final iu b;
   private final boolean c;
   @Nullable
   private dzo d;
   @Nullable
   private dwn e;
   private boolean f;

   public dzs(dis $$0, iu $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.j();
      this.c = $$2;
   }

   public dzo a() {
      if (this.d == null && (this.c || this.a.C(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public dwn b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public dis c() {
      return this.a;
   }

   public iu d() {
      return this.b;
   }

   public static Predicate<dzs> a(Predicate<dzo> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
