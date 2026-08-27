import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import java.util.Arrays;
import java.util.List;

public class eec extends edv {
   final List<edc> a;
   final dcm<?> b;

   eec(efh[] $$0, dcm<?> $$1, List<edc> $$2) {
      super($$0);
      this.b = $$1;
      this.a = ImmutableList.copyOf($$2);
   }

   @Override
   public edx b() {
      return edy.o;
   }

   @Override
   public ciw a(ciw $$0, ech $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         ho<ciw> $$2 = ho.a();
         this.a.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(ecp.a($$1.d(), $$2::add), $$1)));
         qs $$3 = new qs();
         bgi.a($$3, $$2);
         qs $$4 = cgp.a($$0);
         if ($$4 == null) {
            $$4 = $$3;
         } else {
            $$4.a($$3);
         }

         cgp.a($$0, this.b, $$4);
         return $$0;
      }
   }

   @Override
   public void a(ecs $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
         this.a.get($$1).a($$0.b(".entry[" + $$1 + "]"));
      }
   }

   public static eec.a a(dcm<?> $$0) {
      return new eec.a($$0);
   }

   public static class a extends edv.a<eec.a> {
      private final List<edc> a = Lists.newArrayList();
      private final dcm<?> b;

      public a(dcm<?> $$0) {
         this.b = $$0;
      }

      protected eec.a a() {
         return this;
      }

      public eec.a a(edc.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public edw b() {
         return new eec(this.g(), this.b, this.a);
      }
   }

   public static class b extends edv.c<eec> {
      public void a(JsonObject $$0, eec $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.addProperty("type", jc.l.b($$1.b).toString());
         $$0.add("entries", $$2.serialize($$1.a));
      }

      public eec a(JsonObject $$0, JsonDeserializationContext $$1, efh[] $$2) {
         edc[] $$3 = arf.a($$0, "entries", $$1, edc[].class);
         aep $$4 = new aep(arf.i($$0, "type"));
         dcm<?> $$5 = jc.l.b($$4).orElseThrow(() -> new JsonSyntaxException("Unknown block entity type id '" + $$4 + "'"));
         return new eec($$2, $$5, Arrays.asList($$3));
      }
   }
}
