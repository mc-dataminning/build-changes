import java.util.Optional;
import javax.annotation.Nullable;

public class eqq {
   private final ir a;
   private final int b;
   private final int c;

   public eqq(ir $$0, int $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Nullable
   public static eqq a(uk $$0) {
      Optional<ir> $$1 = uz.a($$0, "pos");
      if ($$1.isEmpty()) {
         return null;
      } else {
         int $$2 = $$0.h("rotation");
         int $$3 = $$0.h("entity_id");
         return new eqq($$1.get(), $$2, $$3);
      }
   }

   public uk a() {
      uk $$0 = new uk();
      $$0.a("pos", uz.a(this.a));
      $$0.a("rotation", this.b);
      $$0.a("entity_id", this.c);
      return $$0;
   }

   public ir b() {
      return this.a;
   }

   public int c() {
      return this.b;
   }

   public int d() {
      return this.c;
   }

   public String e() {
      return a(this.a);
   }

   public static String a(ir $$0) {
      return "frame-" + $$0.u() + "," + $$0.v() + "," + $$0.w();
   }
}
