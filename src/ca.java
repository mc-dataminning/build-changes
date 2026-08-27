import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.util.Arrays;

public class ca extends cv<ca.a> {
   final aep a;

   public ca(aep $$0) {
      this.a = $$0;
   }

   @Override
   public aep a() {
      return this.a;
   }

   public ca.a a(JsonObject $$0, ba $$1, be $$2) {
      ba $$3 = ba.a("location", $$2, $$0.get("location"), ees.l);
      if ($$3 == null) {
         throw new JsonParseException("Failed to parse 'location' field");
      } else {
         return new ca.a(this.a, $$1, $$3);
      }
   }

   public void a(akj $$0, gv $$1, ciw $$2) {
      aki $$3 = $$0.x();
      dey $$4 = $$3.a_($$1);
      ecn $$5 = new ecn.a($$3).a(eet.f, $$1.b()).a(eet.a, $$0).a(eet.g, $$4).a(eet.i, $$2).a(ees.l);
      ech $$6 = new ech.a($$5).a(null);
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static class a extends ar {
      private final ba a;

      public a(aep $$0, ba $$1, ba $$2) {
         super($$0, $$1);
         this.a = $$2;
      }

      public static ca.a a(csk $$0) {
         ba $$1 = ba.a(efg.a($$0).build());
         return new ca.a(ai.y.a, ba.a, $$1);
      }

      public static ca.a a(efh.a... $$0) {
         ba $$1 = ba.a(Arrays.stream($$0).map(efh.a::build).toArray(efh[]::new));
         return new ca.a(ai.y.a, ba.a, $$1);
      }

      private static ca.a a(ch.a $$0, bz.a $$1, aep $$2) {
         ba $$3 = ba.a(eff.a($$0).build(), efo.a($$1).build());
         return new ca.a($$2, ba.a, $$3);
      }

      public static ca.a a(ch.a $$0, bz.a $$1) {
         return a($$0, $$1, ai.M.a);
      }

      public static ca.a b(ch.a $$0, bz.a $$1) {
         return a($$0, $$1, ai.X.a);
      }

      public boolean a(ech $$0) {
         return this.a.a($$0);
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.add("location", this.a.a($$0));
         return $$1;
      }
   }
}
