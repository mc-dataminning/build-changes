import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.util.Arrays;
import java.util.Optional;

public class ca extends cu<ca.a> {
   final aer a;

   public ca(aer $$0) {
      this.a = $$0;
   }

   @Override
   public aer a() {
      return this.a;
   }

   public ca.a a(JsonObject $$0, Optional<ba> $$1, be $$2) {
      Optional<Optional<ba>> $$3 = ba.a("location", $$2, $$0.get("location"), eeq.m);
      if ($$3.isEmpty()) {
         throw new JsonParseException("Failed to parse 'location' field");
      } else {
         return new ca.a(this.a, $$1, $$3.get());
      }
   }

   public void a(akl $$0, gu $$1, cix $$2) {
      akk $$3 = $$0.x();
      dez $$4 = $$3.a_($$1);
      ecm $$5 = new ecm.a($$3).a(eer.f, $$1.b()).a(eer.a, $$0).a(eer.g, $$4).a(eer.i, $$2).a(eeq.m);
      ecg $$6 = new ecg.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static class a extends ar {
      private final Optional<ba> a;

      public a(aer $$0, Optional<ba> $$1, Optional<ba> $$2) {
         super($$0, $$1);
         this.a = $$2;
      }

      public static ca.a a(csl $$0) {
         ba $$1 = ba.a(efe.a($$0).build());
         return new ca.a(ai.y.a, Optional.empty(), Optional.of($$1));
      }

      public static ca.a a(eff.a... $$0) {
         ba $$1 = ba.a(Arrays.stream($$0).map(eff.a::build).toArray(eff[]::new));
         return new ca.a(ai.y.a, Optional.empty(), Optional.of($$1));
      }

      private static ca.a a(ch.a $$0, bz.a $$1, aer $$2) {
         ba $$3 = ba.a(efd.a($$0).build(), efm.a($$1).build());
         return new ca.a($$2, Optional.empty(), Optional.of($$3));
      }

      public static ca.a a(ch.a $$0, bz.a $$1) {
         return a($$0, $$1, ai.M.a);
      }

      public static ca.a b(ch.a $$0, bz.a $$1) {
         return a($$0, $$1, ai.X.a);
      }

      public boolean a(ecg $$0) {
         return this.a.isEmpty() || this.a.get().a($$0);
      }

      @Override
      public JsonObject b() {
         JsonObject $$0 = super.b();
         this.a.ifPresent($$1 -> $$0.add("location", $$1.a()));
         return $$0;
      }
   }
}
