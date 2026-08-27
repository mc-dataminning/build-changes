import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class ae {
   @Nullable
   private final ae a;
   @Nullable
   private final an b;
   private final ah c;
   private final aer d;
   private final Map<String, aj> e;
   private final String[][] f;
   private final Set<ae> g = Sets.newLinkedHashSet();
   private final tf h;
   private final boolean i;

   public ae(aer $$0, @Nullable ae $$1, @Nullable an $$2, ah $$3, Map<String, aj> $$4, String[][] $$5, boolean $$6) {
      this.d = $$0;
      this.b = $$2;
      this.e = ImmutableMap.copyOf($$4);
      this.a = $$1;
      this.c = $$3;
      this.f = $$5;
      this.i = $$6;
      if ($$1 != null) {
         $$1.b(this);
      }

      if ($$2 == null) {
         this.h = tf.b($$0.toString());
      } else {
         tf $$7 = $$2.a();
         n $$8 = $$2.e().b();
         tf $$9 = th.a($$7.e(), ub.a.a($$8)).f("\n").b($$2.b());
         tf $$10 = $$7.e().a($$1x -> $$1x.a(new tk(tk.a.a, $$9)));
         this.h = th.a($$10).a($$8);
      }
   }

   public ae.a a() {
      return new ae.a(this.a == null ? null : this.a.j(), this.b, this.c, this.e, this.f, this.i);
   }

   @Nullable
   public ae b() {
      return this.a;
   }

   public ae c() {
      return a(this);
   }

   public static ae a(ae $$0) {
      ae $$1 = $$0;

      while (true) {
         ae $$2 = $$1.b();
         if ($$2 == null) {
            return $$1;
         }

         $$1 = $$2;
      }
   }

   @Nullable
   public an d() {
      return this.b;
   }

   public boolean e() {
      return this.i;
   }

   public ah f() {
      return this.c;
   }

   @Override
   public String toString() {
      return "SimpleAdvancement{id="
         + this.j()
         + ", parent="
         + (this.a == null ? "null" : this.a.j())
         + ", display="
         + this.b
         + ", rewards="
         + this.c
         + ", criteria="
         + this.e
         + ", requirements="
         + Arrays.deepToString(this.f)
         + ", sendsTelemetryEvent="
         + this.i
         + "}";
   }

   public Iterable<ae> g() {
      return this.g;
   }

   public Map<String, aj> h() {
      return this.e;
   }

   public int i() {
      return this.f.length;
   }

   public void b(ae $$0) {
      this.g.add($$0);
   }

   public aer j() {
      return this.d;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof ae $$1) ? false : this.d.equals($$1.d);
      }
   }

   @Override
   public int hashCode() {
      return this.d.hashCode();
   }

   public String[][] k() {
      return this.f;
   }

   public tf l() {
      return this.h;
   }

   public static class a {
      @Nullable
      private aer a;
      @Nullable
      private ae b;
      @Nullable
      private an c;
      private ah d = ah.a;
      private Map<String, aj> e = Maps.newLinkedHashMap();
      @Nullable
      private String[][] f;
      private ap g = ap.a;
      private final boolean h;

      a(@Nullable aer $$0, @Nullable an $$1, ah $$2, Map<String, aj> $$3, String[][] $$4, boolean $$5) {
         this.a = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.h = $$5;
      }

      private a(boolean $$0) {
         this.h = $$0;
      }

      public static ae.a a() {
         return new ae.a(true);
      }

      public static ae.a b() {
         return new ae.a(false);
      }

      public ae.a a(ae $$0) {
         this.b = $$0;
         return this;
      }

      public ae.a a(aer $$0) {
         this.a = $$0;
         return this;
      }

      public ae.a a(ciy $$0, tf $$1, tf $$2, @Nullable aer $$3, ao $$4, boolean $$5, boolean $$6, boolean $$7) {
         return this.a(new an($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
      }

      public ae.a a(cpl $$0, tf $$1, tf $$2, @Nullable aer $$3, ao $$4, boolean $$5, boolean $$6, boolean $$7) {
         return this.a(new an(new ciy($$0.k()), $$1, $$2, $$3, $$4, $$5, $$6, $$7));
      }

      public ae.a a(an $$0) {
         this.c = $$0;
         return this;
      }

      public ae.a a(ah.a $$0) {
         return this.a($$0.a());
      }

      public ae.a a(ah $$0) {
         this.d = $$0;
         return this;
      }

      public ae.a a(String $$0, am $$1) {
         return this.a($$0, new aj($$1));
      }

      public ae.a a(String $$0, aj $$1) {
         if (this.e.containsKey($$0)) {
            throw new IllegalArgumentException("Duplicate criterion " + $$0);
         } else {
            this.e.put($$0, $$1);
            return this;
         }
      }

      public ae.a a(ap $$0) {
         this.g = $$0;
         return this;
      }

      public ae.a a(String[][] $$0) {
         this.f = $$0;
         return this;
      }

      public boolean a(Function<aer, ae> $$0) {
         if (this.a == null) {
            return true;
         } else {
            if (this.b == null) {
               this.b = $$0.apply(this.a);
            }

            return this.b != null;
         }
      }

      public ae b(aer $$0) {
         if (!this.a($$0x -> null)) {
            throw new IllegalStateException("Tried to build incomplete advancement!");
         } else {
            if (this.f == null) {
               this.f = this.g.createRequirements(this.e.keySet());
            }

            return new ae($$0, this.b, this.c, this.d, this.e, this.f, this.h);
         }
      }

      public ae a(Consumer<ae> $$0, String $$1) {
         ae $$2 = this.b(new aer($$1));
         $$0.accept($$2);
         return $$2;
      }

      public JsonObject c() {
         if (this.f == null) {
            this.f = this.g.createRequirements(this.e.keySet());
         }

         JsonObject $$0 = new JsonObject();
         if (this.b != null) {
            $$0.addProperty("parent", this.b.j().toString());
         } else if (this.a != null) {
            $$0.addProperty("parent", this.a.toString());
         }

         if (this.c != null) {
            $$0.add("display", this.c.k());
         }

         $$0.add("rewards", this.d.b());
         JsonObject $$1 = new JsonObject();

         for (Entry<String, aj> $$2 : this.e.entrySet()) {
            $$1.add($$2.getKey(), $$2.getValue().b());
         }

         $$0.add("criteria", $$1);
         JsonArray $$3 = new JsonArray();

         for (String[] $$4 : this.f) {
            JsonArray $$5 = new JsonArray();

            for (String $$6 : $$4) {
               $$5.add($$6);
            }

            $$3.add($$5);
         }

         $$0.add("requirements", $$3);
         $$0.addProperty("sends_telemetry_event", this.h);
         return $$0;
      }

      public void a(si $$0) {
         if (this.f == null) {
            this.f = this.g.createRequirements(this.e.keySet());
         }

         $$0.a(this.a, si::a);
         $$0.a(this.c, ($$0x, $$1x) -> $$1x.a($$0x));
         aj.a(this.e, $$0);
         $$0.c(this.f.length);

         for (String[] $$1 : this.f) {
            $$0.c($$1.length);

            for (String $$2 : $$1) {
               $$0.a($$2);
            }
         }

         $$0.a(this.h);
      }

      @Override
      public String toString() {
         return "Task Advancement{parentId="
            + this.a
            + ", display="
            + this.c
            + ", rewards="
            + this.d
            + ", criteria="
            + this.e
            + ", requirements="
            + Arrays.deepToString(this.f)
            + ", sends_telemetry_event="
            + this.h
            + "}";
      }

      public static ae.a a(JsonObject $$0, be $$1) {
         aer $$2 = $$0.has("parent") ? new aer(arg.i($$0, "parent")) : null;
         an $$3 = $$0.has("display") ? an.a(arg.u($$0, "display")) : null;
         ah $$4 = $$0.has("rewards") ? ah.a(arg.u($$0, "rewards")) : ah.a;
         Map<String, aj> $$5 = aj.b(arg.u($$0, "criteria"), $$1);
         if ($$5.isEmpty()) {
            throw new JsonSyntaxException("Advancement criteria cannot be empty");
         } else {
            JsonArray $$6 = arg.a($$0, "requirements", new JsonArray());
            String[][] $$7 = new String[$$6.size()][];

            for (int $$8 = 0; $$8 < $$6.size(); $$8++) {
               JsonArray $$9 = arg.n($$6.get($$8), "requirements[" + $$8 + "]");
               $$7[$$8] = new String[$$9.size()];

               for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
                  $$7[$$8][$$10] = arg.a($$9.get($$10), "requirements[" + $$8 + "][" + $$10 + "]");
               }
            }

            if ($$7.length == 0) {
               $$7 = new String[$$5.size()][];
               int $$11 = 0;

               for (String $$12 : $$5.keySet()) {
                  $$7[$$11++] = new String[]{$$12};
               }
            }

            for (String[] $$13 : $$7) {
               if ($$13.length == 0 && $$5.isEmpty()) {
                  throw new JsonSyntaxException("Requirement entry cannot be empty");
               }

               for (String $$14 : $$13) {
                  if (!$$5.containsKey($$14)) {
                     throw new JsonSyntaxException("Unknown required criterion '" + $$14 + "'");
                  }
               }
            }

            for (String $$15 : $$5.keySet()) {
               boolean $$16 = false;

               for (String[] $$17 : $$7) {
                  if (ArrayUtils.contains($$17, $$15)) {
                     $$16 = true;
                     break;
                  }
               }

               if (!$$16) {
                  throw new JsonSyntaxException(
                     "Criterion '" + $$15 + "' isn't a requirement for completion. This isn't supported behaviour, all criteria must be required."
                  );
               }
            }

            boolean $$18 = arg.a($$0, "sends_telemetry_event", false);
            return new ae.a($$2, $$3, $$4, $$5, $$7, $$18);
         }
      }

      public static ae.a b(si $$0) {
         aer $$1 = $$0.c(si::s);
         an $$2 = $$0.c(an::b);
         Map<String, aj> $$3 = aj.c($$0);
         String[][] $$4 = new String[$$0.m()][];

         for (int $$5 = 0; $$5 < $$4.length; $$5++) {
            $$4[$$5] = new String[$$0.m()];

            for (int $$6 = 0; $$6 < $$4[$$5].length; $$6++) {
               $$4[$$5][$$6] = $$0.r();
            }
         }

         boolean $$7 = $$0.readBoolean();
         return new ae.a($$1, $$2, ah.a, $$3, $$4, $$7);
      }

      public Map<String, aj> d() {
         return this.e;
      }
   }
}
