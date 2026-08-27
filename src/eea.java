import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public class eea extends edv {
   final List<eea.b> a;

   eea(efh[] $$0, List<eea.b> $$1) {
      super($$0);
      this.a = ImmutableList.copyOf($$1);
   }

   @Override
   public edx b() {
      return edy.j;
   }

   @Override
   public Set<eeq<?>> a() {
      return this.a.stream().flatMap($$0 -> $$0.d.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public ciw a(ciw $$0, ech $$1) {
      art $$2 = $$1.b();

      for (eea.b $$3 : this.a) {
         UUID $$4 = $$3.e;
         if ($$4 == null) {
            $$4 = UUID.randomUUID();
         }

         bil $$5 = ac.a($$3.f, $$2);
         $$0.a($$3.b, new bkb($$4, $$3.a, (double)$$3.d.b($$1), $$3.c), $$5);
      }

      return $$0;
   }

   public static eea.c a(String $$0, bjy $$1, bkb.a $$2, egc $$3) {
      return new eea.c($$0, $$1, $$2, $$3);
   }

   public static eea.a c() {
      return new eea.a();
   }

   public static class a extends edv.a<eea.a> {
      private final List<eea.b> a = Lists.newArrayList();

      protected eea.a a() {
         return this;
      }

      public eea.a a(eea.c $$0) {
         this.a.add($$0.a());
         return this;
      }

      @Override
      public edw b() {
         return new eea(this.g(), this.a);
      }
   }

   static class b {
      final String a;
      final bjy b;
      final bkb.a c;
      final egc d;
      @Nullable
      final UUID e;
      final bil[] f;

      b(String $$0, bjy $$1, bkb.a $$2, egc $$3, bil[] $$4, @Nullable UUID $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$5;
         this.f = $$4;
      }

      public JsonObject a(JsonSerializationContext $$0) {
         JsonObject $$1 = new JsonObject();
         $$1.addProperty("name", this.a);
         $$1.addProperty("attribute", jc.v.b(this.b).toString());
         $$1.addProperty("operation", a(this.c));
         $$1.add("amount", $$0.serialize(this.d));
         if (this.e != null) {
            $$1.addProperty("id", this.e.toString());
         }

         if (this.f.length == 1) {
            $$1.addProperty("slot", this.f[0].d());
         } else {
            JsonArray $$2 = new JsonArray();

            for (bil $$3 : this.f) {
               $$2.add(new JsonPrimitive($$3.d()));
            }

            $$1.add("slot", $$2);
         }

         return $$1;
      }

      public static eea.b a(JsonObject $$0, JsonDeserializationContext $$1) {
         String $$2 = arf.i($$0, "name");
         aep $$3 = new aep(arf.i($$0, "attribute"));
         bjy $$4 = jc.v.a($$3);
         if ($$4 == null) {
            throw new JsonSyntaxException("Unknown attribute: " + $$3);
         } else {
            bkb.a $$5 = a(arf.i($$0, "operation"));
            egc $$6 = arf.a($$0, "amount", $$1, egc.class);
            UUID $$7 = null;
            bil[] $$8;
            if (arf.a($$0, "slot")) {
               $$8 = new bil[]{bil.a(arf.i($$0, "slot"))};
            } else {
               if (!arf.d($$0, "slot")) {
                  throw new JsonSyntaxException("Invalid or missing attribute modifier slot; must be either string or array of strings.");
               }

               JsonArray $$9 = arf.v($$0, "slot");
               $$8 = new bil[$$9.size()];
               int $$11 = 0;

               for (JsonElement $$12 : $$9) {
                  $$8[$$11++] = bil.a(arf.a($$12, "slot"));
               }

               if ($$8.length == 0) {
                  throw new JsonSyntaxException("Invalid attribute modifier slot; must contain at least one entry.");
               }
            }

            if ($$0.has("id")) {
               String $$14 = arf.i($$0, "id");

               try {
                  $$7 = UUID.fromString($$14);
               } catch (IllegalArgumentException var13) {
                  throw new JsonSyntaxException("Invalid attribute modifier id '" + $$14 + "' (must be UUID format, with dashes)");
               }
            }

            return new eea.b($$2, $$4, $$5, $$6, $$8, $$7);
         }
      }

      private static String a(bkb.a $$0) {
         switch ($$0) {
            case a:
               return "addition";
            case b:
               return "multiply_base";
            case c:
               return "multiply_total";
            default:
               throw new IllegalArgumentException("Unknown operation " + $$0);
         }
      }

      private static bkb.a a(String $$0) {
         switch ($$0) {
            case "addition":
               return bkb.a.a;
            case "multiply_base":
               return bkb.a.b;
            case "multiply_total":
               return bkb.a.c;
            default:
               throw new JsonSyntaxException("Unknown attribute modifier operation " + $$0);
         }
      }
   }

   public static class c {
      private final String a;
      private final bjy b;
      private final bkb.a c;
      private final egc d;
      @Nullable
      private UUID e;
      private final Set<bil> f = EnumSet.noneOf(bil.class);

      public c(String $$0, bjy $$1, bkb.a $$2, egc $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public eea.c a(bil $$0) {
         this.f.add($$0);
         return this;
      }

      public eea.c a(UUID $$0) {
         this.e = $$0;
         return this;
      }

      public eea.b a() {
         return new eea.b(this.a, this.b, this.c, this.d, this.f.toArray(new bil[0]), this.e);
      }
   }

   public static class d extends edv.c<eea> {
      public void a(JsonObject $$0, eea $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         JsonArray $$3 = new JsonArray();

         for (eea.b $$4 : $$1.a) {
            $$3.add($$4.a($$2));
         }

         $$0.add("modifiers", $$3);
      }

      public eea a(JsonObject $$0, JsonDeserializationContext $$1, efh[] $$2) {
         JsonArray $$3 = arf.v($$0, "modifiers");
         List<eea.b> $$4 = Lists.newArrayListWithExpectedSize($$3.size());

         for (JsonElement $$5 : $$3) {
            $$4.add(eea.b.a(arf.m($$5, "modifier"), $$1));
         }

         if ($$4.isEmpty()) {
            throw new JsonSyntaxException("Invalid attribute modifiers array; cannot be empty");
         } else {
            return new eea($$2, $$4);
         }
      }
   }
}
