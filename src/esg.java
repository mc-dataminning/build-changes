import java.util.Optional;
import javax.annotation.Nullable;

public class esg {
   private final je a;
   private final int b;
   private final int c;

   public esg(je $$0, int $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Nullable
   public static esg a(uf $$0) {
      Optional<je> $$1 = uu.a($$0, "pos");
      if ($$1.isEmpty()) {
         return null;
      } else {
         int $$2 = $$0.h("rotation");
         int $$3 = $$0.h("entity_id");
         return new esg($$1.get(), $$2, $$3);
      }
   }

   public uf a() {
      uf $$0 = new uf();
      $$0.a("pos", uu.a(this.a));
      $$0.a("rotation", this.b);
      $$0.a("entity_id", this.c);
      return $$0;
   }

   public je b() {
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

   public static String a(je $$0) {
      return "frame-" + $$0.u() + "," + $$0.v() + "," + $$0.w();
   }
}
