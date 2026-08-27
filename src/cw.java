import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import javax.annotation.Nullable;

public class cw extends cv<cw.a> {
   static final aep a = new aep("slide_down_block");

   @Override
   public aep a() {
      return a;
   }

   public cw.a a(JsonObject $$0, ba $$1, be $$2) {
      csk $$3 = a($$0);
      cz $$4 = cz.a($$0.get("state"));
      if ($$3 != null) {
         $$4.a($$3.l(), $$1x -> {
            throw new JsonSyntaxException("Block " + $$3 + " has no property " + $$1x);
         });
      }

      return new cw.a($$1, $$3, $$4);
   }

   @Nullable
   private static csk a(JsonObject $$0) {
      if ($$0.has("block")) {
         aep $$1 = new aep(arf.i($$0, "block"));
         return jc.f.b($$1).orElseThrow(() -> new JsonSyntaxException("Unknown block type '" + $$1 + "'"));
      } else {
         return null;
      }
   }

   public void a(akj $$0, dey $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static class a extends ar {
      @Nullable
      private final csk a;
      private final cz b;

      public a(ba $$0, @Nullable csk $$1, cz $$2) {
         super(cw.a, $$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static cw.a a(csk $$0) {
         return new cw.a(ba.a, $$0, cz.a);
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         if (this.a != null) {
            $$1.addProperty("block", jc.f.b(this.a).toString());
         }

         $$1.add("state", this.b.a());
         return $$1;
      }

      public boolean a(dey $$0) {
         return this.a != null && !$$0.a(this.a) ? false : this.b.a($$0);
      }
   }
}
