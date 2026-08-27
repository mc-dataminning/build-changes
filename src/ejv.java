import java.util.Optional;
import javax.annotation.Nullable;

public class ejv {
   private final ib a;
   private final int b;
   private final int c;

   public ejv(ib $$0, int $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Nullable
   public static ejv a(ta $$0) {
      Optional<ib> $$1 = tp.a($$0, "pos");
      if ($$1.isEmpty()) {
         return null;
      } else {
         int $$2 = $$0.h("rotation");
         int $$3 = $$0.h("entity_id");
         return new ejv($$1.get(), $$2, $$3);
      }
   }

   public ta a() {
      ta $$0 = new ta();
      $$0.a("pos", tp.a(this.a));
      $$0.a("rotation", this.b);
      $$0.a("entity_id", this.c);
      return $$0;
   }

   public ib b() {
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

   public static String a(ib $$0) {
      return "frame-" + $$0.u() + "," + $$0.v() + "," + $$0.w();
   }
}
