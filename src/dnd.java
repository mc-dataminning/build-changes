import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dnd {
   private final cxc a;
   private final ib b;
   private final boolean c;
   @Nullable
   private dmz d;
   @Nullable
   private dkg e;
   private boolean f;

   public dnd(cxc $$0, ib $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.i();
      this.c = $$2;
   }

   public dmz a() {
      if (this.d == null && (this.c || this.a.B(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public dkg b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public cxc c() {
      return this.a;
   }

   public ib d() {
      return this.b;
   }

   public static Predicate<dnd> a(Predicate<dmz> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
