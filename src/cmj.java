import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class cmj<T extends clj> implements cmc<T> {
   private final int x;
   private final cmj.a<T> y;

   public cmj(cmj.a<T> $$0, int $$1) {
      this.x = $$1;
      this.y = $$0;
   }

   public T b(aer $$0, JsonObject $$1) {
      String $$2 = arg.a($$1, "group", "");
      clp $$3 = clp.d.a(arg.a($$1, "category", null), clp.c);
      JsonElement $$4 = (JsonElement)(arg.d($$1, "ingredient") ? arg.v($$1, "ingredient") : arg.u($$1, "ingredient"));
      clx $$5 = clx.a($$4, false);
      String $$6 = arg.i($$1, "result");
      aer $$7 = new aer($$6);
      cix $$8 = new cix(jb.i.b($$7).orElseThrow(() -> new IllegalStateException("Item: " + $$6 + " does not exist")));
      float $$9 = arg.a($$1, "experience", 0.0F);
      int $$10 = arg.a($$1, "cookingtime", this.x);
      return this.y.create($$0, $$2, $$3, $$5, $$8, $$9, $$10);
   }

   public T b(aer $$0, si $$1) {
      String $$2 = $$1.r();
      clp $$3 = $$1.b(clp.class);
      clx $$4 = clx.b($$1);
      cix $$5 = $$1.q();
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

   interface a<T extends clj> {
      T create(aer var1, String var2, clp var3, clx var4, cix var5, float var6, int var7);
   }
}
