import com.google.common.collect.Lists;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;
import org.slf4j.Logger;

public class dzs {
   static final Logger c = LogUtils.getLogger();
   public static final dzs a = new dzs(ebv.a, null, new dzr[0], new eaz[0]);
   public static final ebu b = ebv.m;
   final ebu d;
   @Nullable
   final acq e;
   final dzr[] f;
   final eaz[] g;
   private final BiFunction<cfz, dzk, cfz> h;

   dzs(ebu $$0, @Nullable acq $$1, dzr[] $$2, eaz[] $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = ebb.a($$3);
   }

   public static Consumer<cfz> a(aif $$0, Consumer<cfz> $$1) {
      return $$2 -> {
         if ($$2.a($$0.G())) {
            if ($$2.L() < $$2.g()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.L();

               while ($$3 > 0) {
                  cfz $$4 = $$2.c(Math.min($$2.g(), $$3));
                  $$3 -= $$4.L();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(dzq $$0, Consumer<cfz> $$1) {
      this.a(new dzk.a($$0).a(this.e), $$1);
   }

   public void a(dzk $$0, Consumer<cfz> $$1) {
      dzk.c<?> $$2 = dzk.a(this);
      if ($$0.b($$2)) {
         Consumer<cfz> $$3 = eaz.a(this.h, $$1, $$0);

         for (dzr $$4 : this.f) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         c.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(dzq $$0, long $$1, Consumer<cfz> $$2) {
      this.a(new dzk.a($$0).a($$1).a(this.e), a($$0.a(), $$2));
   }

   public void b(dzq $$0, Consumer<cfz> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(dzk $$0, Consumer<cfz> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<cfz> a(dzq $$0, long $$1) {
      return this.a(new dzk.a($$0).a($$1).a(this.e));
   }

   public ObjectArrayList<cfz> a(dzq $$0) {
      return this.a(new dzk.a($$0).a(this.e));
   }

   private ObjectArrayList<cfz> a(dzk $$0) {
      ObjectArrayList<cfz> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public ebu a() {
      return this.d;
   }

   public void a(dzv $$0) {
      for (int $$1 = 0; $$1 < this.f.length; $$1++) {
         this.f[$$1].a($$0.b(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.g.length; $$2++) {
         this.g[$$2].a($$0.b(".functions[" + $$2 + "]"));
      }
   }

   public void a(bdq $$0, dzq $$1, long $$2) {
      dzk $$3 = new dzk.a($$1).a($$2).a(this.e);
      ObjectArrayList<cfz> $$4 = this.a($$3);
      apf $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         cfz $$7 = (cfz)var9.next();
         if ($$6.isEmpty()) {
            c.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.b()) {
            $$0.a($$6.remove($$6.size() - 1), cfz.b);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<cfz> $$0, int $$1, apf $$2) {
      List<cfz> $$3 = Lists.newArrayList();
      Iterator<cfz> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         cfz $$5 = $$4.next();
         if ($$5.b()) {
            $$4.remove();
         } else if ($$5.L() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         cfz $$6 = $$3.remove(apa.a($$2, 0, $$3.size() - 1));
         int $$7 = apa.a($$2, 1, $$6.L() / 2);
         cfz $$8 = $$6.a($$7);
         if ($$6.L() > 1 && $$2.h()) {
            $$3.add($$6);
         } else {
            $$0.add($$6);
         }

         if ($$8.L() > 1 && $$2.h()) {
            $$3.add($$8);
         } else {
            $$0.add($$8);
         }
      }

      $$0.addAll($$3);
      ac.b($$0, $$2);
   }

   private List<Integer> a(bdq $$0, apf $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).b()) {
            $$2.add($$3);
         }
      }

      ac.b($$2, $$1);
      return $$2;
   }

   public static dzs.a b() {
      return new dzs.a();
   }

   public static class a implements eaw<dzs.a> {
      private final List<dzr> a = Lists.newArrayList();
      private final List<eaz> b = Lists.newArrayList();
      private ebu c = dzs.b;
      @Nullable
      private acq d = null;

      public dzs.a a(dzr.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public dzs.a a(ebu $$0) {
         this.c = $$0;
         return this;
      }

      public dzs.a a(acq $$0) {
         this.d = $$0;
         return this;
      }

      public dzs.a a(eaz.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public dzs.a a() {
         return this;
      }

      public dzs b() {
         return new dzs(this.c, this.d, this.a.toArray(new dzr[0]), this.b.toArray(new eaz[0]));
      }
   }

   public static class b implements JsonDeserializer<dzs>, JsonSerializer<dzs> {
      public dzs a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = aor.m($$0, "loot table");
         dzr[] $$4 = aor.a($$3, "pools", new dzr[0], $$2, dzr[].class);
         ebu $$5 = null;
         if ($$3.has("type")) {
            String $$6 = aor.i($$3, "type");
            $$5 = ebv.a(new acq($$6));
         }

         acq $$8;
         if ($$3.has("random_sequence")) {
            String $$7 = aor.i($$3, "random_sequence");
            $$8 = new acq($$7);
         } else {
            $$8 = null;
         }

         eaz[] $$10 = aor.a($$3, "functions", new eaz[0], $$2, eaz[].class);
         return new dzs($$5 != null ? $$5 : ebv.m, $$8, $$4, $$10);
      }

      public JsonElement a(dzs $$0, Type $$1, JsonSerializationContext $$2) {
         JsonObject $$3 = new JsonObject();
         if ($$0.d != dzs.b) {
            acq $$4 = ebv.a($$0.d);
            if ($$4 != null) {
               $$3.addProperty("type", $$4.toString());
            } else {
               dzs.c.warn("Failed to find id for param set {}", $$0.d);
            }
         }

         if ($$0.e != null) {
            $$3.addProperty("random_sequence", $$0.e.toString());
         }

         if ($$0.f.length > 0) {
            $$3.add("pools", $$2.serialize($$0.f));
         }

         if (!ArrayUtils.isEmpty($$0.g)) {
            $$3.add("functions", $$2.serialize($$0.g));
         }

         return $$3;
      }
   }
}
