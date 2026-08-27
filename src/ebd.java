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

public class ebd extends eay {
   final List<ebd.b> a;

   ebd(eck[] $$0, List<ebd.b> $$1) {
      super($$0);
      this.a = ImmutableList.copyOf($$1);
   }

   @Override
   public eba b() {
      return ebb.j;
   }

   @Override
   public Set<ebt<?>> a() {
      return this.a.stream().flatMap($$0 -> $$0.d.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cfz a(cfz $$0, dzk $$1) {
      apf $$2 = $$1.b();

      for (ebd.b $$3 : this.a) {
         UUID $$4 = $$3.e;
         if ($$4 == null) {
            $$4 = UUID.randomUUID();
         }

         bfo $$5 = ac.a($$3.f, $$2);
         $$0.a($$3.b, new bhe($$4, $$3.a, (double)$$3.d.b($$1), $$3.c), $$5);
      }

      return $$0;
   }

   public static ebd.c a(String $$0, bhb $$1, bhe.a $$2, edf $$3) {
      return new ebd.c($$0, $$1, $$2, $$3);
   }

   public static ebd.a c() {
      return new ebd.a();
   }

   public static class a extends eay.a<ebd.a> {
      private final List<ebd.b> a = Lists.newArrayList();

      protected ebd.a a() {
         return this;
      }

      public ebd.a a(ebd.c $$0) {
         this.a.add($$0.a());
         return this;
      }

      @Override
      public eaz b() {
         return new ebd(this.g(), this.a);
      }
   }

   static class b {
      final String a;
      final bhb b;
      final bhe.a c;
      final edf d;
      @Nullable
      final UUID e;
      final bfo[] f;

      b(String $$0, bhb $$1, bhe.a $$2, edf $$3, bfo[] $$4, @Nullable UUID $$5) {
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
         $$1.addProperty("attribute", jb.v.b(this.b).toString());
         $$1.addProperty("operation", a(this.c));
         $$1.add("amount", $$0.serialize(this.d));
         if (this.e != null) {
            $$1.addProperty("id", this.e.toString());
         }

         if (this.f.length == 1) {
            $$1.addProperty("slot", this.f[0].d());
         } else {
            JsonArray $$2 = new JsonArray();

            for (bfo $$3 : this.f) {
               $$2.add(new JsonPrimitive($$3.d()));
            }

            $$1.add("slot", $$2);
         }

         return $$1;
      }

      public static ebd.b a(JsonObject $$0, JsonDeserializationContext $$1) {
         String $$2 = aor.i($$0, "name");
         acq $$3 = new acq(aor.i($$0, "attribute"));
         bhb $$4 = jb.v.a($$3);
         if ($$4 == null) {
            throw new JsonSyntaxException("Unknown attribute: " + $$3);
         } else {
            bhe.a $$5 = a(aor.i($$0, "operation"));
            edf $$6 = aor.a($$0, "amount", $$1, edf.class);
            UUID $$7 = null;
            bfo[] $$8;
            if (aor.a($$0, "slot")) {
               $$8 = new bfo[]{bfo.a(aor.i($$0, "slot"))};
            } else {
               if (!aor.d($$0, "slot")) {
                  throw new JsonSyntaxException("Invalid or missing attribute modifier slot; must be either string or array of strings.");
               }

               JsonArray $$9 = aor.v($$0, "slot");
               $$8 = new bfo[$$9.size()];
               int $$11 = 0;

               for (JsonElement $$12 : $$9) {
                  $$8[$$11++] = bfo.a(aor.a($$12, "slot"));
               }

               if ($$8.length == 0) {
                  throw new JsonSyntaxException("Invalid attribute modifier slot; must contain at least one entry.");
               }
            }

            if ($$0.has("id")) {
               String $$14 = aor.i($$0, "id");

               try {
                  $$7 = UUID.fromString($$14);
               } catch (IllegalArgumentException var13) {
                  throw new JsonSyntaxException("Invalid attribute modifier id '" + $$14 + "' (must be UUID format, with dashes)");
               }
            }

            return new ebd.b($$2, $$4, $$5, $$6, $$8, $$7);
         }
      }

      private static String a(bhe.a $$0) {
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

      private static bhe.a a(String $$0) {
         switch ($$0) {
            case "addition":
               return bhe.a.a;
            case "multiply_base":
               return bhe.a.b;
            case "multiply_total":
               return bhe.a.c;
            default:
               throw new JsonSyntaxException("Unknown attribute modifier operation " + $$0);
         }
      }
   }

   public static class c {
      private final String a;
      private final bhb b;
      private final bhe.a c;
      private final edf d;
      @Nullable
      private UUID e;
      private final Set<bfo> f = EnumSet.noneOf(bfo.class);

      public c(String $$0, bhb $$1, bhe.a $$2, edf $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public ebd.c a(bfo $$0) {
         this.f.add($$0);
         return this;
      }

      public ebd.c a(UUID $$0) {
         this.e = $$0;
         return this;
      }

      public ebd.b a() {
         return new ebd.b(this.a, this.b, this.c, this.d, this.f.toArray(new bfo[0]), this.e);
      }
   }

   public static class d extends eay.c<ebd> {
      public void a(JsonObject $$0, ebd $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         JsonArray $$3 = new JsonArray();

         for (ebd.b $$4 : $$1.a) {
            $$3.add($$4.a($$2));
         }

         $$0.add("modifiers", $$3);
      }

      public ebd a(JsonObject $$0, JsonDeserializationContext $$1, eck[] $$2) {
         JsonArray $$3 = aor.v($$0, "modifiers");
         List<ebd.b> $$4 = Lists.newArrayListWithExpectedSize($$3.size());

         for (JsonElement $$5 : $$3) {
            $$4.add(ebd.b.a(aor.m($$5, "modifier"), $$1));
         }

         if ($$4.isEmpty()) {
            throw new JsonSyntaxException("Invalid attribute modifiers array; cannot be empty");
         } else {
            return new ebd($$2, $$4);
         }
      }
   }
}
