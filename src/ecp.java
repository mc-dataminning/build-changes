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

public class ecp {
   static final Logger c = LogUtils.getLogger();
   public static final ecp a = new ecp(ees.a, null, new eco[0], new edw[0]);
   public static final eer b = ees.m;
   final eer d;
   @Nullable
   final aep e;
   final eco[] f;
   final edw[] g;
   private final BiFunction<ciw, ech, ciw> h;

   ecp(eer $$0, @Nullable aep $$1, eco[] $$2, edw[] $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = edy.a($$3);
   }

   public static Consumer<ciw> a(aki $$0, Consumer<ciw> $$1) {
      return $$2 -> {
         if ($$2.a($$0.G())) {
            if ($$2.L() < $$2.g()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.L();

               while ($$3 > 0) {
                  ciw $$4 = $$2.c(Math.min($$2.g(), $$3));
                  $$3 -= $$4.L();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(ecn $$0, Consumer<ciw> $$1) {
      this.a(new ech.a($$0).a(this.e), $$1);
   }

   public void a(ech $$0, Consumer<ciw> $$1) {
      ech.c<?> $$2 = ech.a(this);
      if ($$0.b($$2)) {
         Consumer<ciw> $$3 = edw.a(this.h, $$1, $$0);

         for (eco $$4 : this.f) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         c.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(ecn $$0, long $$1, Consumer<ciw> $$2) {
      this.a(new ech.a($$0).a($$1).a(this.e), a($$0.a(), $$2));
   }

   public void b(ecn $$0, Consumer<ciw> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(ech $$0, Consumer<ciw> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<ciw> a(ecn $$0, long $$1) {
      return this.a(new ech.a($$0).a($$1).a(this.e));
   }

   public ObjectArrayList<ciw> a(ecn $$0) {
      return this.a(new ech.a($$0).a(this.e));
   }

   private ObjectArrayList<ciw> a(ech $$0) {
      ObjectArrayList<ciw> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public eer a() {
      return this.d;
   }

   public void a(ecs $$0) {
      for (int $$1 = 0; $$1 < this.f.length; $$1++) {
         this.f[$$1].a($$0.b(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.g.length; $$2++) {
         this.g[$$2].a($$0.b(".functions[" + $$2 + "]"));
      }
   }

   public void a(bgh $$0, ecn $$1, long $$2) {
      ech $$3 = new ech.a($$1).a($$2).a(this.e);
      ObjectArrayList<ciw> $$4 = this.a($$3);
      art $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         ciw $$7 = (ciw)var9.next();
         if ($$6.isEmpty()) {
            c.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.b()) {
            $$0.a($$6.remove($$6.size() - 1), ciw.b);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<ciw> $$0, int $$1, art $$2) {
      List<ciw> $$3 = Lists.newArrayList();
      Iterator<ciw> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         ciw $$5 = $$4.next();
         if ($$5.b()) {
            $$4.remove();
         } else if ($$5.L() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         ciw $$6 = $$3.remove(aro.a($$2, 0, $$3.size() - 1));
         int $$7 = aro.a($$2, 1, $$6.L() / 2);
         ciw $$8 = $$6.a($$7);
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

   private List<Integer> a(bgh $$0, art $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).b()) {
            $$2.add($$3);
         }
      }

      ac.b($$2, $$1);
      return $$2;
   }

   public static ecp.a b() {
      return new ecp.a();
   }

   public static class a implements edt<ecp.a> {
      private final List<eco> a = Lists.newArrayList();
      private final List<edw> b = Lists.newArrayList();
      private eer c = ecp.b;
      @Nullable
      private aep d = null;

      public ecp.a a(eco.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public ecp.a a(eer $$0) {
         this.c = $$0;
         return this;
      }

      public ecp.a a(aep $$0) {
         this.d = $$0;
         return this;
      }

      public ecp.a a(edw.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public ecp.a a() {
         return this;
      }

      public ecp b() {
         return new ecp(this.c, this.d, this.a.toArray(new eco[0]), this.b.toArray(new edw[0]));
      }
   }

   public static class b implements JsonDeserializer<ecp>, JsonSerializer<ecp> {
      public ecp a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = arf.m($$0, "loot table");
         eco[] $$4 = arf.a($$3, "pools", new eco[0], $$2, eco[].class);
         eer $$5 = null;
         if ($$3.has("type")) {
            String $$6 = arf.i($$3, "type");
            $$5 = ees.a(new aep($$6));
         }

         aep $$8;
         if ($$3.has("random_sequence")) {
            String $$7 = arf.i($$3, "random_sequence");
            $$8 = new aep($$7);
         } else {
            $$8 = null;
         }

         edw[] $$10 = arf.a($$3, "functions", new edw[0], $$2, edw[].class);
         return new ecp($$5 != null ? $$5 : ees.m, $$8, $$4, $$10);
      }

      public JsonElement a(ecp $$0, Type $$1, JsonSerializationContext $$2) {
         JsonObject $$3 = new JsonObject();
         if ($$0.d != ecp.b) {
            aep $$4 = ees.a($$0.d);
            if ($$4 != null) {
               $$3.addProperty("type", $$4.toString());
            } else {
               ecp.c.warn("Failed to find id for param set {}", $$0.d);
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
