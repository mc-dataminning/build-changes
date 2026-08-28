import java.util.Optional;
import javax.annotation.Nullable;

public record exm(iu a, int b, int c) {
   @Nullable
   public static exm a(tx $$0) {
      Optional<iu> $$1 = um.a($$0, "pos");
      if ($$1.isEmpty()) {
         return null;
      } else {
         int $$2 = $$0.h("rotation");
         int $$3 = $$0.h("entity_id");
         return new exm($$1.get(), $$2, $$3);
      }
   }

   public tx a() {
      tx $$0 = new tx();
      $$0.a("pos", um.a(this.a));
      $$0.a("rotation", this.b);
      $$0.a("entity_id", this.c);
      return $$0;
   }

   public String b() {
      return a(this.a);
   }

   public static String a(iu $$0) {
      return "frame-" + $$0.u() + "," + $$0.v() + "," + $$0.w();
   }

   public iu c() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
