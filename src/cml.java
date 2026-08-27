import com.google.gson.JsonObject;

public class cml<T extends cls> implements cmd<T> {
   private final cml.a<T> x;

   public cml(cml.a<T> $$0) {
      this.x = $$0;
   }

   public T b(aer $$0, JsonObject $$1) {
      clr $$2 = clr.e.a(arg.a($$1, "category", null), clr.d);
      return this.x.create($$0, $$2);
   }

   public T b(aer $$0, si $$1) {
      clr $$2 = $$1.b(clr.class);
      return this.x.create($$0, $$2);
   }

   public void a(si $$0, T $$1) {
      $$0.a($$1.d());
   }

   @FunctionalInterface
   public interface a<T extends cls> {
      T create(aer var1, clr var2);
   }
}
