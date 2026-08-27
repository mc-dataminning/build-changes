import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class cmi<T extends cli> implements cmb<T> {
   private final int x;
   private final cmi.a<T> y;

   public cmi(cmi.a<T> $$0, int $$1) {
      this.x = $$1;
      this.y = $$0;
   }

   public T b(aep $$0, JsonObject $$1) {
      String $$2 = arf.a($$1, "group", "");
      clo $$3 = clo.d.a(arf.a($$1, "category", null), clo.c);
      JsonElement $$4 = (JsonElement)(arf.d($$1, "ingredient") ? arf.v($$1, "ingredient") : arf.u($$1, "ingredient"));
      clw $$5 = clw.a($$4, false);
      String $$6 = arf.i($$1, "result");
      aep $$7 = new aep($$6);
      ciw $$8 = new ciw(jc.i.b($$7).orElseThrow(() -> new IllegalStateException("Item: " + $$6 + " does not exist")));
      float $$9 = arf.a($$1, "experience", 0.0F);
      int $$10 = arf.a($$1, "cookingtime", this.x);
      return this.y.create($$0, $$2, $$3, $$5, $$8, $$9, $$10);
   }

   public T b(aep $$0, sh $$1) {
      String $$2 = $$1.r();
      clo $$3 = $$1.b(clo.class);
      clw $$4 = clw.b($$1);
      ciw $$5 = $$1.q();
      float $$6 = $$1.readFloat();
      int $$7 = $$1.m();
      return this.y.create($$0, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public void a(sh $$0, T $$1) {
      $$0.a($$1.c);
      $$0.a($$1.g());
      $$1.d.a($$0);
      $$0.a($$1.e);
      $$0.a($$1.f);
      $$0.c($$1.g);
   }

   interface a<T extends cli> {
      T create(aep var1, String var2, clo var3, clw var4, ciw var5, float var6, int var7);
   }
}
