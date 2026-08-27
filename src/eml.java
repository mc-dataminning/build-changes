import java.util.Optional;
import javax.annotation.Nullable;

public class eml {
   private final id a;
   private final int b;
   private final int c;

   public eml(id $$0, int $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Nullable
   public static eml a(to $$0) {
      Optional<id> $$1 = ud.a($$0, "pos");
      if ($$1.isEmpty()) {
         return null;
      } else {
         int $$2 = $$0.h("rotation");
         int $$3 = $$0.h("entity_id");
         return new eml($$1.get(), $$2, $$3);
      }
   }

   public to a() {
      to $$0 = new to();
      $$0.a("pos", ud.a(this.a));
      $$0.a("rotation", this.b);
      $$0.a("entity_id", this.c);
      return $$0;
   }

   public id b() {
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

   public static String a(id $$0) {
      return "frame-" + $$0.u() + "," + $$0.v() + "," + $$0.w();
   }
}
