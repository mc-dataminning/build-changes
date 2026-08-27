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

public class eeb extends edv {
   final List<Pair<hf<dcb>, chk>> a;
   final boolean b;

   eeb(efh[] $$0, List<Pair<hf<dcb>, chk>> $$1, boolean $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   protected ciw a(ciw $$0, ech $$1) {
      qs $$2 = cgp.a($$0);
      if ($$2 == null) {
         $$2 = new qs();
      }

      dcb.a $$3 = new dcb.a();
      this.a.forEach($$3::a);
      qy $$4 = $$3.a();
      qy $$5;
      if (this.b) {
         $$5 = $$2.c("Patterns", 10).e();
         $$5.addAll($$4);
      } else {
         $$5 = $$4;
      }

      $$2.a("Patterns", $$5);
      cgp.a($$0, dcm.t, $$2);
      return $$0;
   }

   @Override
   public edx b() {
      return edy.x;
   }

   public static eeb.a a(boolean $$0) {
      return new eeb.a($$0);
   }

   public static class a extends edv.a<eeb.a> {
      private final Builder<Pair<hf<dcb>, chk>> a = ImmutableList.builder();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected eeb.a a() {
         return this;
      }

      @Override
      public edw b() {
         return new eeb(this.g(), this.a.build(), this.b);
      }

      public eeb.a a(aeo<dcb> $$0, chk $$1) {
         return this.a(jc.al.f($$0), $$1);
      }

      public eeb.a a(hf<dcb> $$0, chk $$1) {
         this.a.add(Pair.of($$0, $$1));
         return this;
      }
   }

   public static class b extends edv.c<eeb> {
      public void a(JsonObject $$0, eeb $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         JsonArray $$3 = new JsonArray();
         $$1.a
            .forEach(
               $$1x -> {
                  JsonObject $$2x = new JsonObject();
                  $$2x.addProperty(
                     "pattern",
                     ((aeo)((hf)$$1x.getFirst()).e().orElseThrow(() -> new JsonSyntaxException("Unknown pattern: " + $$1x.getFirst()))).a().toString()
                  );
                  $$2x.addProperty("color", ((chk)$$1x.getSecond()).b());
                  $$3.add($$2x);
               }
            );
         $$0.add("patterns", $$3);
         $$0.addProperty("append", $$1.b);
      }

      public eeb a(JsonObject $$0, JsonDeserializationContext $$1, efh[] $$2) {
         Builder<Pair<hf<dcb>, chk>> $$3 = ImmutableList.builder();
         JsonArray $$4 = arf.v($$0, "patterns");

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            JsonObject $$6 = arf.m($$4.get($$5), "pattern[" + $$5 + "]");
            String $$7 = arf.i($$6, "pattern");
            Optional<? extends hf<dcb>> $$8 = jc.al.b(aeo.a(jd.c, new aep($$7)));
            if ($$8.isEmpty()) {
               throw new JsonSyntaxException("Unknown pattern: " + $$7);
            }

            String $$9 = arf.i($$6, "color");
            chk $$10 = chk.a($$9, null);
            if ($$10 == null) {
               throw new JsonSyntaxException("Unknown color: " + $$9);
            }

            $$3.add(Pair.of($$8.get(), $$10));
         }

         boolean $$11 = arf.k($$0, "append");
         return new eeb($$2, $$3.build(), $$11);
      }
   }
}
