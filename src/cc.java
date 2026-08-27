import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.util.Arrays;
import java.util.Optional;

public class cc extends cw<cc.a> {
   public cc.a a(JsonObject $$0, Optional<bc> $$1, bg $$2) {
      Optional<Optional<bc>> $$3 = bc.a("location", $$2, $$0.get("location"), eeu.m);
      if ($$3.isEmpty()) {
         throw new JsonParseException("Failed to parse 'location' field");
      } else {
         return new cc.a($$1, $$3.get());
      }
   }

   public void a(aku $$0, gw $$1, cjl $$2) {
      akt $$3 = $$0.x();
      dfd $$4 = $$3.a_($$1);
      ecq $$5 = new ecq.a($$3).a(eev.f, $$1.b()).a(eev.a, $$0).a(eev.g, $$4).a(eev.i, $$2).a(eeu.m);
      eck $$6 = new eck.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static class a extends at {
      private final Optional<bc> a;

      public a(Optional<bc> $$0, Optional<bc> $$1) {
         super($$0);
         this.a = $$1;
      }

      public static am<cc.a> a(ctc $$0) {
         bc $$1 = bc.a(efi.a($$0).build());
         return al.y.a(new cc.a(Optional.empty(), Optional.of($$1)));
      }

      public static am<cc.a> a(efj.a... $$0) {
         bc $$1 = bc.a(Arrays.stream($$0).map(efj.a::build).toArray(efj[]::new));
         return al.y.a(new cc.a(Optional.empty(), Optional.of($$1)));
      }

      private static cc.a c(cj.a $$0, cb.a $$1) {
         bc $$2 = bc.a(efh.a($$0).build(), efq.a($$1).build());
         return new cc.a(Optional.empty(), Optional.of($$2));
      }

      public static am<cc.a> a(cj.a $$0, cb.a $$1) {
         return al.M.a(c($$0, $$1));
      }

      public static am<cc.a> b(cj.a $$0, cb.a $$1) {
         return al.X.a(c($$0, $$1));
      }

      public boolean a(eck $$0) {
         return this.a.isEmpty() || this.a.get().a($$0);
      }

      @Override
      public JsonObject a() {
         JsonObject $$0 = super.a();
         this.a.ifPresent($$1 -> $$0.add("location", $$1.a()));
         return $$0;
      }
   }
}
