import com.google.gson.JsonObject;

public class cmk<T extends clr> implements cmc<T> {
   private final cmk.a<T> x;

   public cmk(cmk.a<T> $$0) {
      this.x = $$0;
   }

   public T b(aer $$0, JsonObject $$1) {
      clq $$2 = clq.e.a(arg.a($$1, "category", null), clq.d);
      return this.x.create($$0, $$2);
   }

   public T b(aer $$0, si $$1) {
      clq $$2 = $$1.b(clq.class);
      return this.x.create($$0, $$2);
   }

   public void a(si $$0, T $$1) {
      $$0.a($$1.d());
   }

   @FunctionalInterface
   public interface a<T extends clr> {
      T create(aer var1, clq var2);
   }
}
