import java.util.Optional;
import javax.annotation.Nullable;

public class evh {
   private final jh a;
   private final int b;
   private final int c;

   public evh(jh $$0, int $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Nullable
   public static evh a(um $$0) {
      Optional<jh> $$1 = vb.a($$0, "pos");
      if ($$1.isEmpty()) {
         return null;
      } else {
         int $$2 = $$0.h("rotation");
         int $$3 = $$0.h("entity_id");
         return new evh($$1.get(), $$2, $$3);
      }
   }

   public um a() {
      um $$0 = new um();
      $$0.a("pos", vb.a(this.a));
      $$0.a("rotation", this.b);
      $$0.a("entity_id", this.c);
      return $$0;
   }

   public jh b() {
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

   public static String a(jh $$0) {
      return "frame-" + $$0.u() + "," + $$0.v() + "," + $$0.w();
   }
}
