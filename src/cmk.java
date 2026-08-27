import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class cmk<T extends clk> implements cmd<T> {
   private final int x;
   private final cmk.a<T> y;

   public cmk(cmk.a<T> $$0, int $$1) {
      this.x = $$1;
      this.y = $$0;
   }

   public T b(aer $$0, JsonObject $$1) {
      String $$2 = arg.a($$1, "group", "");
      clq $$3 = clq.d.a(arg.a($$1, "category", null), clq.c);
      JsonElement $$4 = (JsonElement)(arg.d($$1, "ingredient") ? arg.v($$1, "ingredient") : arg.u($$1, "ingredient"));
      cly $$5 = cly.a($$4, false);
      String $$6 = arg.i($$1, "result");
      aer $$7 = new aer($$6);
      ciy $$8 = new ciy(jb.i.b($$7).orElseThrow(() -> new IllegalStateException("Item: " + $$6 + " does not exist")));
      float $$9 = arg.a($$1, "experience", 0.0F);
      int $$10 = arg.a($$1, "cookingtime", this.x);
      return this.y.create($$0, $$2, $$3, $$5, $$8, $$9, $$10);
   }

   public T b(aer $$0, si $$1) {
      String $$2 = $$1.r();
      clq $$3 = $$1.b(clq.class);
      cly $$4 = cly.b($$1);
      ciy $$5 = $$1.q();
      float $$6 = $$1.readFloat();
      int $$7 = $$1.m();
      return this.y.create($$0, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public void a(si $$0, T $$1) {
      $$0.a($$1.c);
      $$0.a($$1.g());
      $$1.d.a($$0);
      $$0.a($$1.e);
      $$0.a($$1.f);
      $$0.c($$1.g);
   }

   interface a<T extends clk> {
      T create(aer var1, String var2, clq var3, cly var4, ciy var5, float var6, int var7);
   }
}
