import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class ebe extends eay {
   final List<Pair<he<cze>, cen>> a;
   final boolean b;

   ebe(eck[] $$0, List<Pair<he<cze>, cen>> $$1, boolean $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   protected cfz a(cfz $$0, dzk $$1) {
      qr $$2 = cds.a($$0);
      if ($$2 == null) {
         $$2 = new qr();
      }

      cze.a $$3 = new cze.a();
      this.a.forEach($$3::a);
      qx $$4 = $$3.a();
      qx $$5;
      if (this.b) {
         $$5 = $$2.c("Patterns", 10).e();
         $$5.addAll($$4);
      } else {
         $$5 = $$4;
      }

      $$2.a("Patterns", $$5);
      cds.a($$0, czp.t, $$2);
      return $$0;
   }

   @Override
   public eba b() {
      return ebb.x;
   }

   public static ebe.a a(boolean $$0) {
      return new ebe.a($$0);
   }

   public static class a extends eay.a<ebe.a> {
      private final Builder<Pair<he<cze>, cen>> a = ImmutableList.builder();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected ebe.a a() {
         return this;
      }

      @Override
      public eaz b() {
         return new ebe(this.g(), this.a.build(), this.b);
      }

      public ebe.a a(acp<cze> $$0, cen $$1) {
         return this.a(jb.al.f($$0), $$1);
      }

      public ebe.a a(he<cze> $$0, cen $$1) {
         this.a.add(Pair.of($$0, $$1));
         return this;
      }
   }

   public static class b extends eay.c<ebe> {
      public void a(JsonObject $$0, ebe $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         JsonArray $$3 = new JsonArray();
         $$1.a
            .forEach(
               $$1x -> {
                  JsonObject $$2x = new JsonObject();
                  $$2x.addProperty(
                     "pattern",
                     ((acp)((he)$$1x.getFirst()).e().orElseThrow(() -> new JsonSyntaxException("Unknown pattern: " + $$1x.getFirst()))).a().toString()
                  );
                  $$2x.addProperty("color", ((cen)$$1x.getSecond()).b());
                  $$3.add($$2x);
               }
            );
         $$0.add("patterns", $$3);
         $$0.addProperty("append", $$1.b);
      }

      public ebe a(JsonObject $$0, JsonDeserializationContext $$1, eck[] $$2) {
         Builder<Pair<he<cze>, cen>> $$3 = ImmutableList.builder();
         JsonArray $$4 = aor.v($$0, "patterns");

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            JsonObject $$6 = aor.m($$4.get($$5), "pattern[" + $$5 + "]");
            String $$7 = aor.i($$6, "pattern");
            Optional<? extends he<cze>> $$8 = jb.al.b(acp.a(jc.c, new acq($$7)));
            if ($$8.isEmpty()) {
               throw new JsonSyntaxException("Unknown pattern: " + $$7);
            }

            String $$9 = aor.i($$6, "color");
            cen $$10 = cen.a($$9, null);
            if ($$10 == null) {
               throw new JsonSyntaxException("Unknown color: " + $$9);
            }

            $$3.add(Pair.of($$8.get(), $$10));
         }

         boolean $$11 = aor.k($$0, "append");
         return new ebe($$2, $$3.build(), $$11);
      }
   }
}
