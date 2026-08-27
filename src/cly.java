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

public final class cly implements Predicate<ciy> {
   public static final cly a = new cly(Stream.empty());
   private final cly.c[] b;
   @Nullable
   private ciy[] c;
   @Nullable
   private IntList d;

   private cly(Stream<? extends cly.c> $$0) {
      this.b = $$0.toArray(cly.c[]::new);
   }

   public ciy[] a() {
      if (this.c == null) {
         this.c = Arrays.stream(this.b).flatMap($$0 -> $$0.a().stream()).distinct().toArray(ciy[]::new);
      }

      return this.c;
   }

   public boolean a(@Nullable ciy $$0) {
      if ($$0 == null) {
         return false;
      } else if (this.d()) {
         return $$0.b();
      } else {
         for (ciy $$1 : this.a()) {
            if ($$1.a($$0.d())) {
               return true;
            }
         }

         return false;
      }
   }

   public IntList b() {
      if (this.d == null) {
         ciy[] $$0 = this.a();
         this.d = new IntArrayList($$0.length);

         for (ciy $$1 : $$0) {
            this.d.add(cbr.c($$1));
         }

         this.d.sort(IntComparators.NATURAL_COMPARATOR);
      }

      return this.d;
   }

   public void a(si $$0) {
      $$0.a(Arrays.asList(this.a()), si::a);
   }

   public JsonElement c() {
      if (this.b.length == 1) {
         return this.b[0].b();
      } else {
         JsonArray $$0 = new JsonArray();

         for (cly.c $$1 : this.b) {
            $$0.add($$1.b());
         }

         return $$0;
      }
   }

   public boolean d() {
      return this.b.length == 0;
   }

   private static cly b(Stream<? extends cly.c> $$0) {
      cly $$1 = new cly($$0);
      return $$1.d() ? a : $$1;
   }

   public static cly e() {
      return a;
   }

   public static cly a(cpl... $$0) {
      return a(Arrays.stream($$0).map(ciy::new));
   }

   public static cly a(ciy... $$0) {
      return a(Arrays.stream($$0));
   }

   public static cly a(Stream<ciy> $$0) {
      return b($$0.filter($$0x -> !$$0x.b()).map(cly.a::new));
   }

   public static cly a(aqa<cit> $$0) {
      return b(Stream.of(new cly.b($$0)));
   }

   public static cly b(si $$0) {
      return b($$0.<ciy>a(si::q).stream().map(cly.a::new));
   }

   public static cly a(@Nullable JsonElement $$0) {
      return a($$0, true);
   }

   public static cly a(@Nullable JsonElement $$0, boolean $$1) {
      if ($$0 == null || $$0.isJsonNull()) {
         throw new JsonSyntaxException("Item cannot be null");
      } else if ($$0.isJsonObject()) {
         return b(Stream.of(a($$0.getAsJsonObject())));
      } else if ($$0.isJsonArray()) {
         JsonArray $$2 = $$0.getAsJsonArray();
         if ($$2.size() == 0 && !$$1) {
            throw new JsonSyntaxException("Item array cannot be empty, at least one item must be defined");
         } else {
            return b(StreamSupport.<JsonElement>stream($$2.spliterator(), false).map($$0x -> a(arg.m($$0x, "item"))));
         }
      } else {
         throw new JsonSyntaxException("Expected item to be object or array of objects");
      }
   }

   private static cly.c a(JsonObject $$0) {
      if ($$0.has("item") && $$0.has("tag")) {
         throw new JsonParseException("An ingredient entry is either a tag or an item, not both");
      } else if ($$0.has("item")) {
         cit $$1 = cmg.b($$0);
         return new cly.a(new ciy($$1));
      } else if ($$0.has("tag")) {
         aer $$2 = new aer(arg.i($$0, "tag"));
         aqa<cit> $$3 = aqa.a(jc.D, $$2);
         return new cly.b($$3);
      } else {
         throw new JsonParseException("An ingredient entry needs either a tag or an item");
      }
   }

   static class a implements cly.c {
      private final ciy a;

      a(ciy $$0) {
         this.a = $$0;
      }

      @Override
      public Collection<ciy> a() {
         return Collections.singleton(this.a);
      }

      @Override
      public JsonObject b() {
         JsonObject $$0 = new JsonObject();
         $$0.addProperty("item", jb.i.b(this.a.d()).toString());
         return $$0;
      }
   }

   static class b implements cly.c {
      private final aqa<cit> a;

      b(aqa<cit> $$0) {
         this.a = $$0;
      }

      @Override
      public Collection<ciy> a() {
         List<ciy> $$0 = Lists.newArrayList();

         for (he<cit> $$1 : jb.i.c(this.a)) {
            $$0.add(new ciy($$1));
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
      Collection<ciy> a();

      JsonObject b();
   }
}
