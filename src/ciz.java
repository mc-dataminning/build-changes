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

public final class ciz implements Predicate<cfz> {
   public static final ciz a = new ciz(Stream.empty());
   private final ciz.c[] b;
   @Nullable
   private cfz[] c;
   @Nullable
   private IntList d;

   private ciz(Stream<? extends ciz.c> $$0) {
      this.b = $$0.toArray(ciz.c[]::new);
   }

   public cfz[] a() {
      if (this.c == null) {
         this.c = Arrays.stream(this.b).flatMap($$0 -> $$0.a().stream()).distinct().toArray(cfz[]::new);
      }

      return this.c;
   }

   public boolean a(@Nullable cfz $$0) {
      if ($$0 == null) {
         return false;
      } else if (this.d()) {
         return $$0.b();
      } else {
         for (cfz $$1 : this.a()) {
            if ($$1.a($$0.d())) {
               return true;
            }
         }

         return false;
      }
   }

   public IntList b() {
      if (this.d == null) {
         cfz[] $$0 = this.a();
         this.d = new IntArrayList($$0.length);

         for (cfz $$1 : $$0) {
            this.d.add(bys.c($$1));
         }

         this.d.sort(IntComparators.NATURAL_COMPARATOR);
      }

      return this.d;
   }

   public void a(sf $$0) {
      $$0.a(Arrays.asList(this.a()), sf::a);
   }

   public JsonElement c() {
      if (this.b.length == 1) {
         return this.b[0].b();
      } else {
         JsonArray $$0 = new JsonArray();

         for (ciz.c $$1 : this.b) {
            $$0.add($$1.b());
         }

         return $$0;
      }
   }

   public boolean d() {
      return this.b.length == 0;
   }

   private static ciz b(Stream<? extends ciz.c> $$0) {
      ciz $$1 = new ciz($$0);
      return $$1.d() ? a : $$1;
   }

   public static ciz e() {
      return a;
   }

   public static ciz a(cml... $$0) {
      return a(Arrays.stream($$0).map(cfz::new));
   }

   public static ciz a(cfz... $$0) {
      return a(Arrays.stream($$0));
   }

   public static ciz a(Stream<cfz> $$0) {
      return b($$0.filter($$0x -> !$$0x.b()).map(ciz.a::new));
   }

   public static ciz a(anl<cfu> $$0) {
      return b(Stream.of(new ciz.b($$0)));
   }

   public static ciz b(sf $$0) {
      return b($$0.<cfz>a(sf::r).stream().map(ciz.a::new));
   }

   public static ciz a(@Nullable JsonElement $$0) {
      return a($$0, true);
   }

   public static ciz a(@Nullable JsonElement $$0, boolean $$1) {
      if ($$0 == null || $$0.isJsonNull()) {
         throw new JsonSyntaxException("Item cannot be null");
      } else if ($$0.isJsonObject()) {
         return b(Stream.of(a($$0.getAsJsonObject())));
      } else if ($$0.isJsonArray()) {
         JsonArray $$2 = $$0.getAsJsonArray();
         if ($$2.size() == 0 && !$$1) {
            throw new JsonSyntaxException("Item array cannot be empty, at least one item must be defined");
         } else {
            return b(StreamSupport.<JsonElement>stream($$2.spliterator(), false).map($$0x -> a(aor.m($$0x, "item"))));
         }
      } else {
         throw new JsonSyntaxException("Expected item to be object or array of objects");
      }
   }

   private static ciz.c a(JsonObject $$0) {
      if ($$0.has("item") && $$0.has("tag")) {
         throw new JsonParseException("An ingredient entry is either a tag or an item, not both");
      } else if ($$0.has("item")) {
         cfu $$1 = cjh.b($$0);
         return new ciz.a(new cfz($$1));
      } else if ($$0.has("tag")) {
         acq $$2 = new acq(aor.i($$0, "tag"));
         anl<cfu> $$3 = anl.a(jc.D, $$2);
         return new ciz.b($$3);
      } else {
         throw new JsonParseException("An ingredient entry needs either a tag or an item");
      }
   }

   static class a implements ciz.c {
      private final cfz a;

      a(cfz $$0) {
         this.a = $$0;
      }

      @Override
      public Collection<cfz> a() {
         return Collections.singleton(this.a);
      }

      @Override
      public JsonObject b() {
         JsonObject $$0 = new JsonObject();
         $$0.addProperty("item", jb.i.b(this.a.d()).toString());
         return $$0;
      }
   }

   static class b implements ciz.c {
      private final anl<cfu> a;

      b(anl<cfu> $$0) {
         this.a = $$0;
      }

      @Override
      public Collection<cfz> a() {
         List<cfz> $$0 = Lists.newArrayList();

         for (he<cfu> $$1 : jb.i.c(this.a)) {
            $$0.add(new cfz($$1));
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
      Collection<cfz> a();

      JsonObject b();
   }
}
