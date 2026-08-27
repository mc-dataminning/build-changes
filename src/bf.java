import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class bf {
   public static final bf a = new bf(cj.c.e, cj.c.e, cj.c.e, cj.c.e, cj.c.e);
   private final cj.c b;
   private final cj.c c;
   private final cj.c d;
   private final cj.c e;
   private final cj.c f;

   public bf(cj.c $$0, cj.c $$1, cj.c $$2, cj.c $$3, cj.c $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
   }

   public static bf a(cj.c $$0) {
      return new bf(cj.c.e, cj.c.e, cj.c.e, $$0, cj.c.e);
   }

   public static bf b(cj.c $$0) {
      return new bf(cj.c.e, $$0, cj.c.e, cj.c.e, cj.c.e);
   }

   public static bf c(cj.c $$0) {
      return new bf(cj.c.e, cj.c.e, cj.c.e, cj.c.e, $$0);
   }

   public boolean a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      float $$6 = (float)($$0 - $$3);
      float $$7 = (float)($$1 - $$4);
      float $$8 = (float)($$2 - $$5);
      if (!this.b.d((double)apa.e($$6)) || !this.c.d((double)apa.e($$7)) || !this.d.d((double)apa.e($$8))) {
         return false;
      } else {
         return !this.e.e((double)($$6 * $$6 + $$8 * $$8)) ? false : this.f.e((double)($$6 * $$6 + $$7 * $$7 + $$8 * $$8));
      }
   }

   public static bf a(@Nullable JsonElement $$0) {
      if ($$0 != null && !$$0.isJsonNull()) {
         JsonObject $$1 = aor.m($$0, "distance");
         cj.c $$2 = cj.c.a($$1.get("x"));
         cj.c $$3 = cj.c.a($$1.get("y"));
         cj.c $$4 = cj.c.a($$1.get("z"));
         cj.c $$5 = cj.c.a($$1.get("horizontal"));
         cj.c $$6 = cj.c.a($$1.get("absolute"));
         return new bf($$2, $$3, $$4, $$5, $$6);
      } else {
         return a;
      }
   }

   public JsonElement a() {
      if (this == a) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject $$0 = new JsonObject();
         $$0.add("x", this.b.d());
         $$0.add("y", this.c.d());
         $$0.add("z", this.d.d());
         $$0.add("horizontal", this.e.d());
         $$0.add("absolute", this.f.d());
         return $$0;
      }
   }
}
