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
   private final cmj d;
   private final Map<amo<?>, cj.d> e;
   private final Object2BooleanMap<acq> f;
   private final Map<acq, cp.c> g;
   private final bo h;

   private static cp.c b(JsonElement $$0) {
      if ($$0.isJsonPrimitive()) {
         boolean $$1 = $$0.getAsBoolean();
         return new cp.b($$1);
      } else {
         Object2BooleanMap<String> $$2 = new Object2BooleanOpenHashMap();
         JsonObject $$3 = aor.m($$0, "criterion data");
         $$3.entrySet().forEach($$1 -> {
            boolean $$2x = aor.c((JsonElement)$$1.getValue(), "criterion test");
            $$2.put((String)$$1.getKey(), $$2x);
         });
         return new cp.a($$2);
      }
   }

   cp(cj.d $$0, @Nullable cmj $$1, Map<amo<?>, cj.d> $$2, Object2BooleanMap<acq> $$3, Map<acq, cp.c> $$4, bo $$5) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$5;
   }

   @Override
   public boolean a(bfj $$0, aif $$1, @Nullable eei $$2) {
      if (!($$0 instanceof aig $$3)) {
         return false;
      } else if (!this.c.d($$3.ce)) {
         return false;
      } else if (this.d != null && this.d != $$3.e.b()) {
         return false;
      } else {
         ams $$4 = $$3.D();

         for (Entry<amo<?>, cj.d> $$5 : this.e.entrySet()) {
            int $$6 = $$4.a($$5.getKey());
            if (!$$5.getValue().d($$6)) {
               return false;
            }
         }

         amk $$7 = $$3.E();
         ObjectIterator var13 = this.f.object2BooleanEntrySet().iterator();

         while (var13.hasNext()) {
            it.unimi.dsi.fastutil.objects.Object2BooleanMap.Entry<acq> $$8 = (it.unimi.dsi.fastutil.objects.Object2BooleanMap.Entry<acq>)var13.next();
            if ($$7.b((acq)$$8.getKey()) != $$8.getBooleanValue()) {
               return false;
            }
         }

         if (!this.g.isEmpty()) {
            acy $$9 = $$3.M();
            adc $$10 = $$3.cI().az();

            for (Entry<acq, cp.c> $$11 : this.g.entrySet()) {
               ae $$12 = $$10.a($$11.getKey());
               if ($$12 == null || !$$11.getValue().test($$9.b($$12))) {
                  return false;
               }
            }
         }

         if (this.h != bo.a) {
            eei $$13 = $$3.bm();
            eei $$14 = $$3.f(1.0F);
            eei $$15 = $$13.b($$14.c * 100.0, $$14.d * 100.0, $$14.e * 100.0);
            eef $$16 = bzh.a($$3.dI(), $$3, $$13, $$15, new eed($$13, $$15).g(1.0), $$0x -> !$$0x.G_(), 0.0F);
            if ($$16 == null || $$16.c() != eeg.a.c) {
               return false;
            }

            bfj $$17 = $$16.a();
            if (!this.h.a($$3, $$17) || !$$3.B($$17)) {
               return false;
            }
         }

         return true;
      }
   }

   public static cp a(JsonObject $$0) {
      cj.d $$1 = cj.d.a($$0.get("level"));
      String $$2 = aor.a($$0, "gamemode", "");
      cmj $$3 = cmj.a($$2, null);
      Map<amo<?>, cj.d> $$4 = Maps.newHashMap();
      JsonArray $$5 = aor.a($$0, "stats", null);
      if ($$5 != null) {
         for (JsonElement $$6 : $$5) {
            JsonObject $$7 = aor.m($$6, "stats entry");
            acq $$8 = new acq(aor.i($$7, "type"));
            amq<?> $$9 = jb.y.a($$8);
            if ($$9 == null) {
               throw new JsonParseException("Invalid stat type: " + $$8);
            }

            acq $$10 = new acq(aor.i($$7, "stat"));
            amo<?> $$11 = a($$9, $$10);
            cj.d $$12 = cj.d.a($$7.get("value"));
            $$4.put($$11, $$12);
         }
      }

      Object2BooleanMap<acq> $$13 = new Object2BooleanOpenHashMap();
      JsonObject $$14 = aor.a($$0, "recipes", new JsonObject());

      for (Entry<String, JsonElement> $$15 : $$14.entrySet()) {
         acq $$16 = new acq($$15.getKey());
         boolean $$17 = aor.c($$15.getValue(), "recipe present");
         $$13.put($$16, $$17);
      }

      Map<acq, cp.c> $$18 = Maps.newHashMap();
      JsonObject $$19 = aor.a($$0, "advancements", new JsonObject());

      for (Entry<String, JsonElement> $$20 : $$19.entrySet()) {
         acq $$21 = new acq($$20.getKey());
         cp.c $$22 = b($$20.getValue());
         $$18.put($$21, $$22);
      }

      bo $$23 = bo.a($$0.get("looking_at"));
      return new cp($$1, $$3, $$4, $$13, $$18, $$23);
   }

   private static <T> amo<T> a(amq<T> $$0, acq $$1) {
      hr<T> $$2 = $$0.a();
      T $$3 = $$2.a($$1);
      if ($$3 == null) {
         throw new JsonParseException("Unknown object " + $$1 + " for stat type " + jb.y.b($$0));
      } else {
         return $$0.b($$3);
      }
   }

   private static <T> acq a(amo<T> $$0) {
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
            $$3x.addProperty("type", jb.y.b($$1x.a()).toString());
            $$3x.addProperty("stat", a((amo<?>)$$1x).toString());
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
      private cmj b;
      private final Map<amo<?>, cj.d> c = Maps.newHashMap();
      private final Object2BooleanMap<acq> d = new Object2BooleanOpenHashMap();
      private final Map<acq, cp.c> e = Maps.newHashMap();
      private bo f = bo.a;

      public static cp.d a() {
         return new cp.d();
      }

      public cp.d a(cj.d $$0) {
         this.a = $$0;
         return this;
      }

      public cp.d a(amo<?> $$0, cj.d $$1) {
         this.c.put($$0, $$1);
         return this;
      }

      public cp.d a(acq $$0, boolean $$1) {
         this.d.put($$0, $$1);
         return this;
      }

      public cp.d a(cmj $$0) {
         this.b = $$0;
         return this;
      }

      public cp.d a(bo $$0) {
         this.f = $$0;
         return this;
      }

      public cp.d b(acq $$0, boolean $$1) {
         this.e.put($$0, new cp.b($$1));
         return this;
      }

      public cp.d a(acq $$0, Map<String, Boolean> $$1) {
         this.e.put($$0, new cp.a(new Object2BooleanOpenHashMap($$1)));
         return this;
      }

      public cp b() {
         return new cp(this.a, this.b, this.c, this.d, this.e, this.f);
      }
   }
}
