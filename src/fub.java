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

public class fub implements ggr {
   private static final Logger g = LogUtils.getLogger();
   private static final fud h = new fud();
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(fub.class, new fub.a())
      .registerTypeAdapter(ftx.class, new ftx.a())
      .registerTypeAdapter(fty.class, new fty.a())
      .registerTypeAdapter(fua.class, new fua.a())
      .registerTypeAdapter(fuh.class, new fuh.a())
      .registerTypeAdapter(fui.class, new fui.a())
      .registerTypeAdapter(fuf.class, new fuf.a())
      .create();
   private static final char i = '#';
   public static final String b = "particle";
   private static final boolean j = true;
   private final List<ftx> k;
   @Nullable
   private final fub.b l;
   @Nullable
   private final Boolean m;
   private final fui n;
   private final List<fuf> o;
   public String c = "";
   @VisibleForTesting
   protected final Map<String, Either<ggj, String>> d;
   @Nullable
   protected fub e;
   @Nullable
   protected ahd f;

   public static fub a(Reader $$0) {
      return aty.a(a, $$0, fub.class);
   }

   public static fub a(String $$0) {
      return a(new StringReader($$0));
   }

   public fub(@Nullable ahd $$0, List<ftx> $$1, Map<String, Either<ggj, String>> $$2, @Nullable Boolean $$3, @Nullable fub.b $$4, fui $$5, List<fuf> $$6) {
      this.k = $$1;
      this.m = $$3;
      this.l = $$4;
      this.d = $$2;
      this.f = $$0;
      this.n = $$5;
      this.o = $$6;
   }

   public List<ftx> a() {
      return this.k.isEmpty() && this.e != null ? this.e.a() : this.k;
   }

   public boolean b() {
      if (this.m != null) {
         return this.m;
      } else {
         return this.e != null ? this.e.b() : true;
      }
   }

   public fub.b c() {
      if (this.l != null) {
         return this.l;
      } else {
         return this.e != null ? this.e.c() : fub.b.b;
      }
   }

   public boolean d() {
      return this.f == null || this.e != null && this.e.d();
   }

   public List<fuf> e() {
      return this.o;
   }

   private fug a(ggk $$0, fub $$1) {
      return this.o.isEmpty() ? fug.a : new fug($$0, $$1, this.o);
   }

   @Override
   public Collection<ahd> f() {
      Set<ahd> $$0 = Sets.newHashSet();

      for (fuf $$1 : this.o) {
         $$0.add($$1.a());
      }

      if (this.f != null) {
         $$0.add(this.f);
      }

      return $$0;
   }

   @Override
   public void a(Function<ahd, ggr> $$0) {
      Set<ggr> $$1 = Sets.newLinkedHashSet();

      for (fub $$2 = this; $$2.f != null && $$2.e == null; $$2 = $$2.e) {
         $$1.add($$2);
         ggr $$3 = $$0.apply($$2.f);
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
            $$2.f = ggl.n;
            $$3 = $$0.apply($$2.f);
         }

         if (!($$3 instanceof fub)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         $$2.e = (fub)$$3;
      }

      this.o.forEach($$1x -> {
         ggr $$2x = $$0.apply($$1x.a());
         if (!Objects.equals($$2x, this)) {
            $$2x.a($$0);
         }
      });
   }

   @Override
   public ggg a(ggk $$0, Function<ggj, gef> $$1, ggo $$2, ahd $$3) {
      return this.a($$0, this, $$1, $$2, $$3, true);
   }

   public ggg a(ggk $$0, fub $$1, Function<ggj, gef> $$2, ggo $$3, ahd $$4, boolean $$5) {
      gef $$6 = $$2.apply(this.c("particle"));
      if (this.g() == ggl.s) {
         return new ggi(this.h(), this.a($$0, $$1), $$6, this.c().a());
      } else {
         ggq.a $$7 = new ggq.a(this, this.a($$0, $$1), $$5).a($$6);

         for (ftx $$8 : this.a()) {
            for (ic $$9 : $$8.c.keySet()) {
               fty $$10 = $$8.c.get($$9);
               gef $$11 = $$2.apply(this.c($$10.d));
               if ($$10.b == null) {
                  $$7.a(a($$8, $$10, $$11, $$9, $$3, $$4));
               } else {
                  $$7.a(ic.a($$3.b().c(), $$10.b), a($$8, $$10, $$11, $$9, $$3, $$4));
               }
            }
         }

         return $$7.b();
      }
   }

   private static ftw a(ftx $$0, fty $$1, gef $$2, ic $$3, ggo $$4, ahd $$5) {
      return h.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$5);
   }

   public boolean b(String $$0) {
      return !gdv.b().equals(this.c($$0).b());
   }

   public ggj c(String $$0) {
      if (e($$0)) {
         $$0 = $$0.substring(1);
      }

      List<String> $$1 = Lists.newArrayList();

      while (true) {
         Either<ggj, String> $$2 = this.d($$0);
         Optional<ggj> $$3 = $$2.left();
         if ($$3.isPresent()) {
            return $$3.get();
         }

         $$0 = (String)$$2.right().get();
         if ($$1.contains($$0)) {
            g.warn("Unable to resolve texture due to reference chain {}->{} in {}", new Object[]{Joiner.on("->").join($$1), $$0, this.c});
            return new ggj(gee.e, gdv.b());
         }

         $$1.add($$0);
      }
   }

   private Either<ggj, String> d(String $$0) {
      for (fub $$1 = this; $$1 != null; $$1 = $$1.e) {
         Either<ggj, String> $$2 = $$1.d.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return Either.left(new ggj(gee.e, gdv.b()));
   }

   static boolean e(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public fub g() {
      return this.e == null ? this : this.e.g();
   }

   public fui h() {
      fuh $$0 = this.a(cmo.b);
      fuh $$1 = this.a(cmo.c);
      fuh $$2 = this.a(cmo.d);
      fuh $$3 = this.a(cmo.e);
      fuh $$4 = this.a(cmo.f);
      fuh $$5 = this.a(cmo.g);
      fuh $$6 = this.a(cmo.h);
      fuh $$7 = this.a(cmo.i);
      return new fui($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private fuh a(cmo $$0) {
      return this.e != null && !this.n.b($$0) ? this.e.a($$0) : this.n.a($$0);
   }

   @Override
   public String toString() {
      return this.c;
   }

   public static class a implements JsonDeserializer<fub> {
      public fub a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<ftx> $$4 = this.b($$2, $$3);
         String $$5 = this.c($$3);
         Map<String, Either<ggj, String>> $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         fui $$8 = fui.a;
         if ($$3.has("display")) {
            JsonObject $$9 = aty.u($$3, "display");
            $$8 = (fui)$$2.deserialize($$9, fui.class);
         }

         List<fuf> $$10 = this.a($$2, $$3);
         fub.b $$11 = null;
         if ($$3.has("gui_light")) {
            $$11 = fub.b.a(aty.i($$3, "gui_light"));
         }

         ahd $$12 = $$5.isEmpty() ? null : new ahd($$5);
         return new fub($$12, $$4, $$6, $$7, $$11, $$8, $$10);
      }

      protected List<fuf> a(JsonDeserializationContext $$0, JsonObject $$1) {
         List<fuf> $$2 = Lists.newArrayList();
         if ($$1.has("overrides")) {
            for (JsonElement $$4 : aty.v($$1, "overrides")) {
               $$2.add((fuf)$$0.deserialize($$4, fuf.class));
            }
         }

         return $$2;
      }

      private Map<String, Either<ggj, String>> b(JsonObject $$0) {
         ahd $$1 = gee.e;
         Map<String, Either<ggj, String>> $$2 = Maps.newHashMap();
         if ($$0.has("textures")) {
            JsonObject $$3 = aty.u($$0, "textures");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), a($$1, $$4.getValue().getAsString()));
            }
         }

         return $$2;
      }

      private static Either<ggj, String> a(ahd $$0, String $$1) {
         if (fub.e($$1)) {
            return Either.right($$1.substring(1));
         } else {
            ahd $$2 = ahd.a($$1);
            if ($$2 == null) {
               throw new JsonParseException($$1 + " is not valid resource location");
            } else {
               return Either.left(new ggj($$0, $$2));
            }
         }
      }

      private String c(JsonObject $$0) {
         return aty.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? aty.k($$0, "ambientocclusion") : null;
      }

      protected List<ftx> b(JsonDeserializationContext $$0, JsonObject $$1) {
         List<ftx> $$2 = Lists.newArrayList();
         if ($$1.has("elements")) {
            for (JsonElement $$3 : aty.v($$1, "elements")) {
               $$2.add((ftx)$$0.deserialize($$3, ftx.class));
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

      public static fub.b a(String $$0) {
         for (fub.b $$1 : values()) {
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
