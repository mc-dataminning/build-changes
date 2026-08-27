import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cp implements bp {
   public static final int b = 100;
   private final cj.d c;
   @Nullable
   private final cph d;
   private final Map<apb<?>, cj.d> e;
   private final Object2BooleanMap<aep> f;
   private final Map<aep, cp.c> g;
   private final bo h;

   private static cp.c b(JsonElement $$0) {
      if ($$0.isJsonPrimitive()) {
         boolean $$1 = $$0.getAsBoolean();
         return new cp.b($$1);
      } else {
         Object2BooleanMap<String> $$2 = new Object2BooleanOpenHashMap();
         JsonObject $$3 = arf.m($$0, "criterion data");
         $$3.entrySet().forEach($$1 -> {
            boolean $$2x = arf.c((JsonElement)$$1.getValue(), "criterion test");
            $$2.put((String)$$1.getKey(), $$2x);
         });
         return new cp.a($$2);
      }
   }

   cp(cj.d $$0, @Nullable cph $$1, Map<apb<?>, cj.d> $$2, Object2BooleanMap<aep> $$3, Map<aep, cp.c> $$4, bo $$5) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$5;
   }

   @Override
   public boolean a(big $$0, aki $$1, @Nullable ehf $$2) {
      if (!($$0 instanceof akj $$3)) {
         return false;
      } else if (!this.c.d($$3.cd)) {
         return false;
      } else if (this.d != null && this.d != $$3.e.b()) {
         return false;
      } else {
         apf $$4 = $$3.E();

         for (Entry<apb<?>, cj.d> $$5 : this.e.entrySet()) {
            int $$6 = $$4.a($$5.getKey());
            if (!$$5.getValue().d($$6)) {
               return false;
            }
         }

         aox $$7 = $$3.F();
         ObjectIterator var13 = this.f.object2BooleanEntrySet().iterator();

         while (var13.hasNext()) {
            it.unimi.dsi.fastutil.objects.Object2BooleanMap.Entry<aep> $$8 = (it.unimi.dsi.fastutil.objects.Object2BooleanMap.Entry<aep>)var13.next();
            if ($$7.b((aep)$$8.getKey()) != $$8.getBooleanValue()) {
               return false;
            }
         }

         if (!this.g.isEmpty()) {
            aex $$9 = $$3.N();
            afb $$10 = $$3.cK().az();

            for (Entry<aep, cp.c> $$11 : this.g.entrySet()) {
               ae $$12 = $$10.a($$11.getKey());
               if ($$12 == null || !$$11.getValue().test($$9.b($$12))) {
                  return false;
               }
            }
         }

         if (this.h != bo.a) {
            ehf $$13 = $$3.bp();
            ehf $$14 = $$3.f(1.0F);
            ehf $$15 = $$13.b($$14.c * 100.0, $$14.d * 100.0, $$14.e * 100.0);
            ehc $$16 = cce.a($$3.dK(), $$3, $$13, $$15, new eha($$13, $$15).g(1.0), $$0x -> !$$0x.G_(), 0.0F);
            if ($$16 == null || $$16.c() != ehd.a.c) {
               return false;
            }

            big $$17 = $$16.a();
            if (!this.h.a($$3, $$17) || !$$3.E($$17)) {
               return false;
            }
         }

         return true;
      }
   }

   public static cp a(JsonObject $$0) {
      cj.d $$1 = cj.d.a($$0.get("level"));
      String $$2 = arf.a($$0, "gamemode", "");
      cph $$3 = cph.a($$2, null);
      Map<apb<?>, cj.d> $$4 = Maps.newHashMap();
      JsonArray $$5 = arf.a($$0, "stats", null);
      if ($$5 != null) {
         for (JsonElement $$6 : $$5) {
            JsonObject $$7 = arf.m($$6, "stats entry");
            aep $$8 = new aep(arf.i($$7, "type"));
            apd<?> $$9 = jc.y.a($$8);
            if ($$9 == null) {
               throw new JsonParseException("Invalid stat type: " + $$8);
            }

            aep $$10 = new aep(arf.i($$7, "stat"));
            apb<?> $$11 = a($$9, $$10);
            cj.d $$12 = cj.d.a($$7.get("value"));
            $$4.put($$11, $$12);
         }
      }

      Object2BooleanMap<aep> $$13 = new Object2BooleanOpenHashMap();
      JsonObject $$14 = arf.a($$0, "recipes", new JsonObject());

      for (Entry<String, JsonElement> $$15 : $$14.entrySet()) {
         aep $$16 = new aep($$15.getKey());
         boolean $$17 = arf.c($$15.getValue(), "recipe present");
         $$13.put($$16, $$17);
      }

      Map<aep, cp.c> $$18 = Maps.newHashMap();
      JsonObject $$19 = arf.a($$0, "advancements", new JsonObject());

      for (Entry<String, JsonElement> $$20 : $$19.entrySet()) {
         aep $$21 = new aep($$20.getKey());
         cp.c $$22 = b($$20.getValue());
         $$18.put($$21, $$22);
      }

      bo $$23 = bo.a($$0.get("looking_at"));
      return new cp($$1, $$3, $$4, $$13, $$18, $$23);
   }

   private static <T> apb<T> a(apd<T> $$0, aep $$1) {
      hs<T> $$2 = $$0.a();
      T $$3 = $$2.a($$1);
      if ($$3 == null) {
         throw new JsonParseException("Unknown object " + $$1 + " for stat type " + jc.y.b($$0));
      } else {
         return $$0.b($$3);
      }
   }

   private static <T> aep a(apb<T> $$0) {
      return $$0.a().a().b($$0.b());
   }

   @Override
   public JsonObject a() {
      JsonObject $$0 = new JsonObject();
      $$0.add("level", this.c.d());
      if (this.d != null) {
         $$0.addProperty("gamemode", this.d.b());
      }

      if (!this.e.isEmpty()) {
         JsonArray $$1 = new JsonArray();
         this.e.forEach(($$1x, $$2) -> {
            JsonObject $$3x = new JsonObject();
            $$3x.addProperty("type", jc.y.b($$1x.a()).toString());
            $$3x.addProperty("stat", a((apb<?>)$$1x).toString());
            $$3x.add("value", $$2.d());
            $$1.add($$3x);
         });
         $$0.add("stats", $$1);
      }

      if (!this.f.isEmpty()) {
         JsonObject $$2 = new JsonObject();
         this.f.forEach(($$1, $$2x) -> $$2.addProperty($$1.toString(), $$2x));
         $$0.add("recipes", $$2);
      }

      if (!this.g.isEmpty()) {
         JsonObject $$3 = new JsonObject();
         this.g.forEach(($$1, $$2) -> $$3.add($$1.toString(), $$2.a()));
         $$0.add("advancements", $$3);
      }

      $$0.add("looking_at", this.h.a());
      return $$0;
   }

   @Override
   public bp.a c() {
      return bp.b.d;
   }

   static class a implements cp.c {
      private final Object2BooleanMap<String> a;

      public a(Object2BooleanMap<String> $$0) {
         this.a = $$0;
      }

      @Override
      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         this.a.forEach($$0::addProperty);
         return $$0;
      }

      public boolean a(ag $$0) {
         ObjectIterator var2 = this.a.object2BooleanEntrySet().iterator();

         while (var2.hasNext()) {
            it.unimi.dsi.fastutil.objects.Object2BooleanMap.Entry<String> $$1 = (it.unimi.dsi.fastutil.objects.Object2BooleanMap.Entry<String>)var2.next();
            ak $$2 = $$0.c((String)$$1.getKey());
            if ($$2 == null || $$2.a() != $$1.getBooleanValue()) {
               return false;
            }
         }

         return true;
      }
   }

   static class b implements cp.c {
      private final boolean a;

      public b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public JsonElement a() {
         return new JsonPrimitive(this.a);
      }

      public boolean a(ag $$0) {
         return $$0.a() == this.a;
      }
   }

   interface c extends Predicate<ag> {
      JsonElement a();
   }

   public static class d {
      private cj.d a = cj.d.e;
      @Nullable
      private cph b;
      private final Map<apb<?>, cj.d> c = Maps.newHashMap();
      private final Object2BooleanMap<aep> d = new Object2BooleanOpenHashMap();
      private final Map<aep, cp.c> e = Maps.newHashMap();
      private bo f = bo.a;

      public static cp.d a() {
         return new cp.d();
      }

      public cp.d a(cj.d $$0) {
         this.a = $$0;
         return this;
      }

      public cp.d a(apb<?> $$0, cj.d $$1) {
         this.c.put($$0, $$1);
         return this;
      }

      public cp.d a(aep $$0, boolean $$1) {
         this.d.put($$0, $$1);
         return this;
      }

      public cp.d a(cph $$0) {
         this.b = $$0;
         return this;
      }

      public cp.d a(bo $$0) {
         this.f = $$0;
         return this;
      }

      public cp.d b(aep $$0, boolean $$1) {
         this.e.put($$0, new cp.b($$1));
         return this;
      }

      public cp.d a(aep $$0, Map<String, Boolean> $$1) {
         this.e.put($$0, new cp.a(new Object2BooleanOpenHashMap($$1)));
         return this;
      }

      public cp b() {
         return new cp(this.a, this.b, this.c, this.d, this.e, this.f);
      }
   }
}
