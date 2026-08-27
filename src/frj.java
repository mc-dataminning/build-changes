import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class frj implements gdt {
   private static final Logger g = LogUtils.getLogger();
   private static final frl h = new frl();
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(frj.class, new frj.a())
      .registerTypeAdapter(frf.class, new frf.a())
      .registerTypeAdapter(frg.class, new frg.a())
      .registerTypeAdapter(fri.class, new fri.a())
      .registerTypeAdapter(frp.class, new frp.a())
      .registerTypeAdapter(frq.class, new frq.a())
      .registerTypeAdapter(frn.class, new frn.a())
      .create();
   private static final char i = '#';
   public static final String b = "particle";
   private static final boolean j = true;
   private final List<frf> k;
   @Nullable
   private final frj.b l;
   @Nullable
   private final Boolean m;
   private final frq n;
   private final List<frn> o;
   public String c = "";
   @VisibleForTesting
   protected final Map<String, Either<gdl, String>> d;
   @Nullable
   protected frj e;
   @Nullable
   protected agg f;

   public static frj a(Reader $$0) {
      return asy.a(a, $$0, frj.class);
   }

   public static frj a(String $$0) {
      return a(new StringReader($$0));
   }

   public frj(@Nullable agg $$0, List<frf> $$1, Map<String, Either<gdl, String>> $$2, @Nullable Boolean $$3, @Nullable frj.b $$4, frq $$5, List<frn> $$6) {
      this.k = $$1;
      this.m = $$3;
      this.l = $$4;
      this.d = $$2;
      this.f = $$0;
      this.n = $$5;
      this.o = $$6;
   }

   public List<frf> a() {
      return this.k.isEmpty() && this.e != null ? this.e.a() : this.k;
   }

   public boolean b() {
      if (this.m != null) {
         return this.m;
      } else {
         return this.e != null ? this.e.b() : true;
      }
   }

   public frj.b c() {
      if (this.l != null) {
         return this.l;
      } else {
         return this.e != null ? this.e.c() : frj.b.b;
      }
   }

   public boolean d() {
      return this.f == null || this.e != null && this.e.d();
   }

   public List<frn> e() {
      return this.o;
   }

   private fro a(gdm $$0, frj $$1) {
      return this.o.isEmpty() ? fro.a : new fro($$0, $$1, this.o);
   }

   @Override
   public Collection<agg> f() {
      Set<agg> $$0 = Sets.newHashSet();

      for (frn $$1 : this.o) {
         $$0.add($$1.a());
      }

      if (this.f != null) {
         $$0.add(this.f);
      }

      return $$0;
   }

   @Override
   public void a(Function<agg, gdt> $$0) {
      Set<gdt> $$1 = Sets.newLinkedHashSet();

      for (frj $$2 = this; $$2.f != null && $$2.e == null; $$2 = $$2.e) {
         $$1.add($$2);
         gdt $$3 = $$0.apply($$2.f);
         if ($$3 == null) {
            g.warn("No parent '{}' while loading model '{}'", this.f, $$2);
         }

         if ($$1.contains($$3)) {
            g.warn(
               "Found 'parent' loop while loading model '{}' in chain: {} -> {}",
               new Object[]{$$2, $$1.stream().map(Object::toString).collect(Collectors.joining(" -> ")), this.f}
            );
            $$3 = null;
         }

         if ($$3 == null) {
            $$2.f = gdn.n;
            $$3 = $$0.apply($$2.f);
         }

         if (!($$3 instanceof frj)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         $$2.e = (frj)$$3;
      }

      this.o.forEach($$1x -> {
         gdt $$2x = $$0.apply($$1x.a());
         if (!Objects.equals($$2x, this)) {
            $$2x.a($$0);
         }
      });
   }

   @Override
   public gdi a(gdm $$0, Function<gdl, gbh> $$1, gdq $$2, agg $$3) {
      return this.a($$0, this, $$1, $$2, $$3, true);
   }

   public gdi a(gdm $$0, frj $$1, Function<gdl, gbh> $$2, gdq $$3, agg $$4, boolean $$5) {
      gbh $$6 = $$2.apply(this.c("particle"));
      if (this.g() == gdn.s) {
         return new gdk(this.h(), this.a($$0, $$1), $$6, this.c().a());
      } else {
         gds.a $$7 = new gds.a(this, this.a($$0, $$1), $$5).a($$6);

         for (frf $$8 : this.a()) {
            for (hx $$9 : $$8.c.keySet()) {
               frg $$10 = $$8.c.get($$9);
               gbh $$11 = $$2.apply(this.c($$10.d));
               if ($$10.b == null) {
                  $$7.a(a($$8, $$10, $$11, $$9, $$3, $$4));
               } else {
                  $$7.a(hx.a($$3.b().c(), $$10.b), a($$8, $$10, $$11, $$9, $$3, $$4));
               }
            }
         }

         return $$7.b();
      }
   }

   private static fre a(frf $$0, frg $$1, gbh $$2, hx $$3, gdq $$4, agg $$5) {
      return h.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$5);
   }

   public boolean b(String $$0) {
      return !gax.b().equals(this.c($$0).b());
   }

   public gdl c(String $$0) {
      if (e($$0)) {
         $$0 = $$0.substring(1);
      }

      List<String> $$1 = Lists.newArrayList();

      while (true) {
         Either<gdl, String> $$2 = this.d($$0);
         Optional<gdl> $$3 = $$2.left();
         if ($$3.isPresent()) {
            return $$3.get();
         }

         $$0 = (String)$$2.right().get();
         if ($$1.contains($$0)) {
            g.warn("Unable to resolve texture due to reference chain {}->{} in {}", new Object[]{Joiner.on("->").join($$1), $$0, this.c});
            return new gdl(gbg.e, gax.b());
         }

         $$1.add($$0);
      }
   }

   private Either<gdl, String> d(String $$0) {
      for (frj $$1 = this; $$1 != null; $$1 = $$1.e) {
         Either<gdl, String> $$2 = $$1.d.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return Either.left(new gdl(gbg.e, gax.b()));
   }

   static boolean e(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public frj g() {
      return this.e == null ? this : this.e.g();
   }

   public frq h() {
      frp $$0 = this.a(cky.b);
      frp $$1 = this.a(cky.c);
      frp $$2 = this.a(cky.d);
      frp $$3 = this.a(cky.e);
      frp $$4 = this.a(cky.f);
      frp $$5 = this.a(cky.g);
      frp $$6 = this.a(cky.h);
      frp $$7 = this.a(cky.i);
      return new frq($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private frp a(cky $$0) {
      return this.e != null && !this.n.b($$0) ? this.e.a($$0) : this.n.a($$0);
   }

   @Override
   public String toString() {
      return this.c;
   }

   public static class a implements JsonDeserializer<frj> {
      public frj a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<frf> $$4 = this.b($$2, $$3);
         String $$5 = this.c($$3);
         Map<String, Either<gdl, String>> $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         frq $$8 = frq.a;
         if ($$3.has("display")) {
            JsonObject $$9 = asy.u($$3, "display");
            $$8 = (frq)$$2.deserialize($$9, frq.class);
         }

         List<frn> $$10 = this.a($$2, $$3);
         frj.b $$11 = null;
         if ($$3.has("gui_light")) {
            $$11 = frj.b.a(asy.i($$3, "gui_light"));
         }

         agg $$12 = $$5.isEmpty() ? null : new agg($$5);
         return new frj($$12, $$4, $$6, $$7, $$11, $$8, $$10);
      }

      protected List<frn> a(JsonDeserializationContext $$0, JsonObject $$1) {
         List<frn> $$2 = Lists.newArrayList();
         if ($$1.has("overrides")) {
            for (JsonElement $$4 : asy.v($$1, "overrides")) {
               $$2.add((frn)$$0.deserialize($$4, frn.class));
            }
         }

         return $$2;
      }

      private Map<String, Either<gdl, String>> b(JsonObject $$0) {
         agg $$1 = gbg.e;
         Map<String, Either<gdl, String>> $$2 = Maps.newHashMap();
         if ($$0.has("textures")) {
            JsonObject $$3 = asy.u($$0, "textures");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), a($$1, $$4.getValue().getAsString()));
            }
         }

         return $$2;
      }

      private static Either<gdl, String> a(agg $$0, String $$1) {
         if (frj.e($$1)) {
            return Either.right($$1.substring(1));
         } else {
            agg $$2 = agg.a($$1);
            if ($$2 == null) {
               throw new JsonParseException($$1 + " is not valid resource location");
            } else {
               return Either.left(new gdl($$0, $$2));
            }
         }
      }

      private String c(JsonObject $$0) {
         return asy.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? asy.k($$0, "ambientocclusion") : null;
      }

      protected List<frf> b(JsonDeserializationContext $$0, JsonObject $$1) {
         List<frf> $$2 = Lists.newArrayList();
         if ($$1.has("elements")) {
            for (JsonElement $$3 : asy.v($$1, "elements")) {
               $$2.add((frf)$$0.deserialize($$3, frf.class));
            }
         }

         return $$2;
      }
   }

   public static enum b {
      a("front"),
      b("side");

      private final String c;

      private b(String $$0) {
         this.c = $$0;
      }

      public static frj.b a(String $$0) {
         for (frj.b $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         throw new IllegalArgumentException("Invalid gui light: " + $$0);
      }

      public boolean a() {
         return this == b;
      }
   }

   public static class c extends RuntimeException {
      public c(String $$0) {
         super($$0);
      }
   }
}
