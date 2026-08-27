import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class ag implements Comparable<ag> {
   final Map<String, ak> a;
   private String[][] b = new String[0][];

   private ag(Map<String, ak> $$0) {
      this.a = $$0;
   }

   public ag() {
      this.a = Maps.newHashMap();
   }

   public void a(Map<String, aj> $$0, String[][] $$1) {
      Set<String> $$2 = $$0.keySet();
      this.a.entrySet().removeIf($$1x -> !$$2.contains($$1x.getKey()));

      for (String $$3 : $$2) {
         if (!this.a.containsKey($$3)) {
            this.a.put($$3, new ak());
         }
      }

      this.b = $$1;
   }

   public boolean a() {
      if (this.b.length == 0) {
         return false;
      } else {
         for (String[] $$0 : this.b) {
            boolean $$1 = false;

            for (String $$2 : $$0) {
               ak $$3 = this.c($$2);
               if ($$3 != null && $$3.a()) {
                  $$1 = true;
                  break;
               }
            }

            if (!$$1) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean b() {
      for (ak $$0 : this.a.values()) {
         if ($$0.a()) {
            return true;
         }
      }

      return false;
   }

   public boolean a(String $$0) {
      ak $$1 = this.a.get($$0);
      if ($$1 != null && !$$1.a()) {
         $$1.b();
         return true;
      } else {
         return false;
      }
   }

   public boolean b(String $$0) {
      ak $$1 = this.a.get($$0);
      if ($$1 != null && $$1.a()) {
         $$1.c();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "AdvancementProgress{criteria=" + this.a + ", requirements=" + Arrays.deepToString(this.b) + "}";
   }

   public void a(sh $$0) {
      $$0.a(this.a, sh::a, ($$0x, $$1) -> $$1.a($$0x));
   }

   public static ag b(sh $$0) {
      Map<String, ak> $$1 = $$0.a(sh::r, ak::b);
      return new ag($$1);
   }

   @Nullable
   public ak c(String $$0) {
      return this.a.get($$0);
   }

   public float c() {
      if (this.a.isEmpty()) {
         return 0.0F;
      } else {
         float $$0 = (float)this.b.length;
         float $$1 = (float)this.h();
         return $$1 / $$0;
      }
   }

   @Nullable
   public String d() {
      if (this.a.isEmpty()) {
         return null;
      } else {
         int $$0 = this.b.length;
         if ($$0 <= 1) {
            return null;
         } else {
            int $$1 = this.h();
            return $$1 + "/" + $$0;
         }
      }
   }

   private int h() {
      int $$0 = 0;

      for (String[] $$1 : this.b) {
         boolean $$2 = false;

         for (String $$3 : $$1) {
            ak $$4 = this.c($$3);
            if ($$4 != null && $$4.a()) {
               $$2 = true;
               break;
            }
         }

         if ($$2) {
            $$0++;
         }
      }

      return $$0;
   }

   public Iterable<String> e() {
      List<String> $$0 = Lists.newArrayList();

      for (Entry<String, ak> $$1 : this.a.entrySet()) {
         if (!$$1.getValue().a()) {
            $$0.add($$1.getKey());
         }
      }

      return $$0;
   }

   public Iterable<String> f() {
      List<String> $$0 = Lists.newArrayList();

      for (Entry<String, ak> $$1 : this.a.entrySet()) {
         if ($$1.getValue().a()) {
            $$0.add($$1.getKey());
         }
      }

      return $$0;
   }

   @Nullable
   public Date g() {
      Date $$0 = null;

      for (ak $$1 : this.a.values()) {
         if ($$1.a() && ($$0 == null || $$1.d().before($$0))) {
            $$0 = $$1.d();
         }
      }

      return $$0;
   }

   public int a(ag $$0) {
      Date $$1 = this.g();
      Date $$2 = $$0.g();
      if ($$1 == null && $$2 != null) {
         return 1;
      } else if ($$1 != null && $$2 == null) {
         return -1;
      } else {
         return $$1 == null && $$2 == null ? 0 : $$1.compareTo($$2);
      }
   }

   public static class a implements JsonDeserializer<ag>, JsonSerializer<ag> {
      public JsonElement a(ag $$0, Type $$1, JsonSerializationContext $$2) {
         JsonObject $$3 = new JsonObject();
         JsonObject $$4 = new JsonObject();

         for (Entry<String, ak> $$5 : $$0.a.entrySet()) {
            ak $$6 = $$5.getValue();
            if ($$6.a()) {
               $$4.add($$5.getKey(), $$6.e());
            }
         }

         if (!$$4.entrySet().isEmpty()) {
            $$3.add("criteria", $$4);
         }

         $$3.addProperty("done", $$0.a());
         return $$3;
      }

      public ag a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = arf.m($$0, "advancement");
         JsonObject $$4 = arf.a($$3, "criteria", new JsonObject());
         ag $$5 = new ag();

         for (Entry<String, JsonElement> $$6 : $$4.entrySet()) {
            String $$7 = $$6.getKey();
            $$5.a.put($$7, ak.a(arf.a($$6.getValue(), $$7)));
         }

         return $$5;
      }
   }
}
