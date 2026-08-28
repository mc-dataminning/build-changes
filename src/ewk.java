import java.util.Optional;
import javax.annotation.Nullable;

public record ewk(jj a, int b, int c) {
   @Nullable
   public static ewk a(tw $$0) {
      Optional<jj> $$1 = ul.a($$0, "pos");
      if ($$1.isEmpty()) {
         return null;
      } else {
         int $$2 = $$0.h("rotation");
         int $$3 = $$0.h("entity_id");
         return new ewk($$1.get(), $$2, $$3);
      }
   }

   public tw a() {
      tw $$0 = new tw();
      $$0.a("pos", ul.a(this.a));
      $$0.a("rotation", this.b);
      $$0.a("entity_id", this.c);
      return $$0;
   }

   public String b() {
      return a(this.a);
   }

   public static String a(jj $$0) {
      return "frame-" + $$0.u() + "," + $$0.v() + "," + $$0.w();
   }

   public jj c() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
