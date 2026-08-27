import com.google.gson.JsonObject;

public class cmj<T extends clq> implements cmb<T> {
   private final cmj.a<T> x;

   public cmj(cmj.a<T> $$0) {
      this.x = $$0;
   }

   public T b(aep $$0, JsonObject $$1) {
      clp $$2 = clp.e.a(arf.a($$1, "category", null), clp.d);
      return this.x.create($$0, $$2);
   }

   public T b(aep $$0, sh $$1) {
      clp $$2 = $$1.b(clp.class);
      return this.x.create($$0, $$2);
   }

   public void a(sh $$0, T $$1) {
      $$0.a($$1.d());
   }

   @FunctionalInterface
   public interface a<T extends clq> {
      T create(aep var1, clp var2);
   }
}
