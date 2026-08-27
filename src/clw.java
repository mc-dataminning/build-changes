import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntComparators;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public final class clw implements Predicate<ciw> {
   public static final clw a = new clw(Stream.empty());
   private final clw.c[] b;
   @Nullable
   private ciw[] c;
   @Nullable
   private IntList d;

   private clw(Stream<? extends clw.c> $$0) {
      this.b = $$0.toArray(clw.c[]::new);
   }

   public ciw[] a() {
      if (this.c == null) {
         this.c = Arrays.stream(this.b).flatMap($$0 -> $$0.a().stream()).distinct().toArray(ciw[]::new);
      }

      return this.c;
   }

   public boolean a(@Nullable ciw $$0) {
      if ($$0 == null) {
         return false;
      } else if (this.d()) {
         return $$0.b();
      } else {
         for (ciw $$1 : this.a()) {
            if ($$1.a($$0.d())) {
               return true;
            }
         }

         return false;
      }
   }

   public IntList b() {
      if (this.d == null) {
         ciw[] $$0 = this.a();
         this.d = new IntArrayList($$0.length);

         for (ciw $$1 : $$0) {
            this.d.add(cbp.c($$1));
         }

         this.d.sort(IntComparators.NATURAL_COMPARATOR);
      }

      return this.d;
   }

   public void a(sh $$0) {
      $$0.a(Arrays.asList(this.a()), sh::a);
   }

   public JsonElement c() {
      if (this.b.length == 1) {
         return this.b[0].b();
      } else {
         JsonArray $$0 = new JsonArray();

         for (clw.c $$1 : this.b) {
            $$0.add($$1.b());
         }

         return $$0;
      }
   }

   public boolean d() {
      return this.b.length == 0;
   }

   private static clw b(Stream<? extends clw.c> $$0) {
      clw $$1 = new clw($$0);
      return $$1.d() ? a : $$1;
   }

   public static clw e() {
      return a;
   }

   public static clw a(cpj... $$0) {
      return a(Arrays.stream($$0).map(ciw::new));
   }

   public static clw a(ciw... $$0) {
      return a(Arrays.stream($$0));
   }

   public static clw a(Stream<ciw> $$0) {
      return b($$0.filter($$0x -> !$$0x.b()).map(clw.a::new));
   }

   public static clw a(apy<cir> $$0) {
      return b(Stream.of(new clw.b($$0)));
   }

   public static clw b(sh $$0) {
      return b($$0.<ciw>a(sh::q).stream().map(clw.a::new));
   }

   public static clw a(@Nullable JsonElement $$0) {
      return a($$0, true);
   }

   public static clw a(@Nullable JsonElement $$0, boolean $$1) {
      if ($$0 == null || $$0.isJsonNull()) {
         throw new JsonSyntaxException("Item cannot be null");
      } else if ($$0.isJsonObject()) {
         return b(Stream.of(a($$0.getAsJsonObject())));
      } else if ($$0.isJsonArray()) {
         JsonArray $$2 = $$0.getAsJsonArray();
         if ($$2.size() == 0 && !$$1) {
            throw new JsonSyntaxException("Item array cannot be empty, at least one item must be defined");
         } else {
            return b(StreamSupport.<JsonElement>stream($$2.spliterator(), false).map($$0x -> a(arf.m($$0x, "item"))));
         }
      } else {
         throw new JsonSyntaxException("Expected item to be object or array of objects");
      }
   }

   private static clw.c a(JsonObject $$0) {
      if ($$0.has("item") && $$0.has("tag")) {
         throw new JsonParseException("An ingredient entry is either a tag or an item, not both");
      } else if ($$0.has("item")) {
         cir $$1 = cme.b($$0);
         return new clw.a(new ciw($$1));
      } else if ($$0.has("tag")) {
         aep $$2 = new aep(arf.i($$0, "tag"));
         apy<cir> $$3 = apy.a(jd.D, $$2);
         return new clw.b($$3);
      } else {
         throw new JsonParseException("An ingredient entry needs either a tag or an item");
      }
   }

   static class a implements clw.c {
      private final ciw a;

      a(ciw $$0) {
         this.a = $$0;
      }

      @Override
      public Collection<ciw> a() {
         return Collections.singleton(this.a);
      }

      @Override
      public JsonObject b() {
         JsonObject $$0 = new JsonObject();
         $$0.addProperty("item", jc.i.b(this.a.d()).toString());
         return $$0;
      }
   }

   static class b implements clw.c {
      private final apy<cir> a;

      b(apy<cir> $$0) {
         this.a = $$0;
      }

      @Override
      public Collection<ciw> a() {
         List<ciw> $$0 = Lists.newArrayList();

         for (hf<cir> $$1 : jc.i.c(this.a)) {
            $$0.add(new ciw($$1));
         }

         return $$0;
      }

      @Override
      public JsonObject b() {
         JsonObject $$0 = new JsonObject();
         $$0.addProperty("tag", this.a.b().toString());
         return $$0;
      }
   }

   interface c {
      Collection<ciw> a();

      JsonObject b();
   }
}
