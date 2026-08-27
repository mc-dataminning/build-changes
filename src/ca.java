import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.util.Arrays;

public class ca extends cv<ca.a> {
   final acq a;

   public ca(acq $$0) {
      this.a = $$0;
   }

   @Override
   public acq a() {
      return this.a;
   }

   public ca.a a(JsonObject $$0, ba $$1, be $$2) {
      ba $$3 = ba.a("location", $$2, $$0.get("location"), ebv.l);
      if ($$3 == null) {
         throw new JsonParseException("Failed to parse 'location' field");
      } else {
         return new ca.a(this.a, $$1, $$3);
      }
   }

   public void a(aig $$0, gu $$1, cfz $$2) {
      aif $$3 = $$0.x();
      dcb $$4 = $$3.a_($$1);
      dzq $$5 = new dzq.a($$3).a(ebw.f, $$1.b()).a(ebw.a, $$0).a(ebw.g, $$4).a(ebw.i, $$2).a(ebv.l);
      dzk $$6 = new dzk.a($$5).a(null);
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static class a extends ar {
      private final ba a;

      public a(acq $$0, ba $$1, ba $$2) {
         super($$0, $$1);
         this.a = $$2;
      }

      public static ca.a a(cpn $$0) {
         ba $$1 = ba.a(ecj.a($$0).build());
         return new ca.a(ai.y.a, ba.a, $$1);
      }

      public static ca.a a(eck.a... $$0) {
         ba $$1 = ba.a(Arrays.stream($$0).map(eck.a::build).toArray(eck[]::new));
         return new ca.a(ai.y.a, ba.a, $$1);
      }

      private static ca.a a(ch.a $$0, bz.a $$1, acq $$2) {
         ba $$3 = ba.a(eci.a($$0).build(), ecr.a($$1).build());
         return new ca.a($$2, ba.a, $$3);
      }

      public static ca.a a(ch.a $$0, bz.a $$1) {
         return a($$0, $$1, ai.M.a);
      }

      public static ca.a b(ch.a $$0, bz.a $$1) {
         return a($$0, $$1, ai.X.a);
      }

      public boolean a(dzk $$0) {
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
