import com.google.gson.JsonObject;

public class cjm<T extends cit> implements cje<T> {
   private final cjm.a<T> x;

   public cjm(cjm.a<T> $$0) {
      this.x = $$0;
   }

   public T b(acq $$0, JsonObject $$1) {
      cis $$2 = cis.e.a(aor.a($$1, "category", null), cis.d);
      return this.x.create($$0, $$2);
   }

   public T b(acq $$0, sf $$1) {
      cis $$2 = $$1.b(cis.class);
      return this.x.create($$0, $$2);
   }

   public void a(sf $$0, T $$1) {
      $$0.a($$1.d());
   }

   @FunctionalInterface
   public interface a<T extends cit> {
      T create(acq var1, cis var2);
   }
}
