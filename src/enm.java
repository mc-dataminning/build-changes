import java.util.Optional;
import javax.annotation.Nullable;

public class enm {
   private final in a;
   private final int b;
   private final int c;

   public enm(in $$0, int $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Nullable
   public static enm a(ua $$0) {
      Optional<in> $$1 = up.a($$0, "pos");
      if ($$1.isEmpty()) {
         return null;
      } else {
         int $$2 = $$0.h("rotation");
         int $$3 = $$0.h("entity_id");
         return new enm($$1.get(), $$2, $$3);
      }
   }

   public ua a() {
      ua $$0 = new ua();
      $$0.a("pos", up.a(this.a));
      $$0.a("rotation", this.b);
      $$0.a("entity_id", this.c);
      return $$0;
   }

   public in b() {
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

   public static String a(in $$0) {
      return "frame-" + $$0.u() + "," + $$0.v() + "," + $$0.w();
   }
}
