import java.util.Optional;
import javax.annotation.Nullable;

public record evn(ji a, int b, int c) {
   @Nullable
   public static evn a(tq $$0) {
      Optional<ji> $$1 = uf.a($$0, "pos");
      if ($$1.isEmpty()) {
         return null;
      } else {
         int $$2 = $$0.h("rotation");
         int $$3 = $$0.h("entity_id");
         return new evn($$1.get(), $$2, $$3);
      }
   }

   public tq a() {
      tq $$0 = new tq();
      $$0.a("pos", uf.a(this.a));
      $$0.a("rotation", this.b);
      $$0.a("entity_id", this.c);
      return $$0;
   }

   public String b() {
      return a(this.a);
   }

   public static String a(ji $$0) {
      return "frame-" + $$0.u() + "," + $$0.v() + "," + $$0.w();
   }

   public ji c() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
