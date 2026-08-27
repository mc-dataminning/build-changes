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

public class fsb implements gel {
   private static final Logger g = LogUtils.getLogger();
   private static final fsd h = new fsd();
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(fsb.class, new fsb.a())
      .registerTypeAdapter(frx.class, new frx.a())
      .registerTypeAdapter(fry.class, new fry.a())
      .registerTypeAdapter(fsa.class, new fsa.a())
      .registerTypeAdapter(fsh.class, new fsh.a())
      .registerTypeAdapter(fsi.class, new fsi.a())
      .registerTypeAdapter(fsf.class, new fsf.a())
      .create();
   private static final char i = '#';
   public static final String b = "particle";
   private static final boolean j = true;
   private final List<frx> k;
   @Nullable
   private final fsb.b l;
   @Nullable
   private final Boolean m;
   private final fsi n;
   private final List<fsf> o;
   public String c = "";
   @VisibleForTesting
   protected final Map<String, Either<ged, String>> d;
   @Nullable
   protected fsb e;
   @Nullable
   protected agm f;

   public static fsb a(Reader $$0) {
      return atg.a(a, $$0, fsb.class);
   }

   public static fsb a(String $$0) {
      return a(new StringReader($$0));
   }

   public fsb(@Nullable agm $$0, List<frx> $$1, Map<String, Either<ged, String>> $$2, @Nullable Boolean $$3, @Nullable fsb.b $$4, fsi $$5, List<fsf> $$6) {
      this.k = $$1;
      this.m = $$3;
      this.l = $$4;
      this.d = $$2;
      this.f = $$0;
      this.n = $$5;
      this.o = $$6;
   }

   public List<frx> a() {
      return this.k.isEmpty() && this.e != null ? this.e.a() : this.k;
   }

   public boolean b() {
      if (this.m != null) {
         return this.m;
      } else {
         return this.e != null ? this.e.b() : true;
      }
   }

   public fsb.b c() {
      if (this.l != null) {
         return this.l;
      } else {
         return this.e != null ? this.e.c() : fsb.b.b;
      }
   }

   public boolean d() {
      return this.f == null || this.e != null && this.e.d();
   }

   public List<fsf> e() {
      return this.o;
   }

   private fsg a(gee $$0, fsb $$1) {
      return this.o.isEmpty() ? fsg.a : new fsg($$0, $$1, this.o);
   }

   @Override
   public Collection<agm> f() {
      Set<agm> $$0 = Sets.newHashSet();

      for (fsf $$1 : this.o) {
         $$0.add($$1.a());
      }

      if (this.f != null) {
         $$0.add(this.f);
      }

      return $$0;
   }

   @Override
   public void a(Function<agm, gel> $$0) {
      Set<gel> $$1 = Sets.newLinkedHashSet();

      for (fsb $$2 = this; $$2.f != null && $$2.e == null; $$2 = $$2.e) {
         $$1.add($$2);
         gel $$3 = $$0.apply($$2.f);
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
            $$2.f = gef.n;
            $$3 = $$0.apply($$2.f);
         }

         if (!($$3 instanceof fsb)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         $$2.e = (fsb)$$3;
      }

      this.o.forEach($$1x -> {
         gel $$2x = $$0.apply($$1x.a());
         if (!Objects.equals($$2x, this)) {
            $$2x.a($$0);
         }
      });
   }

   @Override
   public gea a(gee $$0, Function<ged, gbz> $$1, gei $$2, agm $$3) {
      return this.a($$0, this, $$1, $$2, $$3, true);
   }

   public gea a(gee $$0, fsb $$1, Function<ged, gbz> $$2, gei $$3, agm $$4, boolean $$5) {
      gbz $$6 = $$2.apply(this.c("particle"));
      if (this.g() == gef.s) {
         return new gec(this.h(), this.a($$0, $$1), $$6, this.c().a());
      } else {
         gek.a $$7 = new gek.a(this, this.a($$0, $$1), $$5).a($$6);

         for (frx $$8 : this.a()) {
            for (ib $$9 : $$8.c.keySet()) {
               fry $$10 = $$8.c.get($$9);
               gbz $$11 = $$2.apply(this.c($$10.d));
               if ($$10.b == null) {
                  $$7.a(a($$8, $$10, $$11, $$9, $$3, $$4));
               } else {
                  $$7.a(ib.a($$3.b().c(), $$10.b), a($$8, $$10, $$11, $$9, $$3, $$4));
               }
            }
         }

         return $$7.b();
      }
   }

   private static frw a(frx $$0, fry $$1, gbz $$2, ib $$3, gei $$4, agm $$5) {
      return h.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$5);
   }

   public boolean b(String $$0) {
      return !gbp.b().equals(this.c($$0).b());
   }

   public ged c(String $$0) {
      if (e($$0)) {
         $$0 = $$0.substring(1);
      }

      List<String> $$1 = Lists.newArrayList();

      while (true) {
         Either<ged, String> $$2 = this.d($$0);
         Optional<ged> $$3 = $$2.left();
         if ($$3.isPresent()) {
            return $$3.get();
         }

         $$0 = (String)$$2.right().get();
         if ($$1.contains($$0)) {
            g.warn("Unable to resolve texture due to reference chain {}->{} in {}", new Object[]{Joiner.on("->").join($$1), $$0, this.c});
            return new ged(gby.e, gbp.b());
         }

         $$1.add($$0);
      }
   }

   private Either<ged, String> d(String $$0) {
      for (fsb $$1 = this; $$1 != null; $$1 = $$1.e) {
         Either<ged, String> $$2 = $$1.d.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return Either.left(new ged(gby.e, gbp.b()));
   }

   static boolean e(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public fsb g() {
      return this.e == null ? this : this.e.g();
   }

   public fsi h() {
      fsh $$0 = this.a(cll.b);
      fsh $$1 = this.a(cll.c);
      fsh $$2 = this.a(cll.d);
      fsh $$3 = this.a(cll.e);
      fsh $$4 = this.a(cll.f);
      fsh $$5 = this.a(cll.g);
      fsh $$6 = this.a(cll.h);
      fsh $$7 = this.a(cll.i);
      return new fsi($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private fsh a(cll $$0) {
      return this.e != null && !this.n.b($$0) ? this.e.a($$0) : this.n.a($$0);
   }

   @Override
   public String toString() {
      return this.c;
   }

   public static class a implements JsonDeserializer<fsb> {
      public fsb a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<frx> $$4 = this.b($$2, $$3);
         String $$5 = this.c($$3);
         Map<String, Either<ged, String>> $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         fsi $$8 = fsi.a;
         if ($$3.has("display")) {
            JsonObject $$9 = atg.u($$3, "display");
            $$8 = (fsi)$$2.deserialize($$9, fsi.class);
         }

         List<fsf> $$10 = this.a($$2, $$3);
         fsb.b $$11 = null;
         if ($$3.has("gui_light")) {
            $$11 = fsb.b.a(atg.i($$3, "gui_light"));
         }

         agm $$12 = $$5.isEmpty() ? null : new agm($$5);
         return new fsb($$12, $$4, $$6, $$7, $$11, $$8, $$10);
      }

      protected List<fsf> a(JsonDeserializationContext $$0, JsonObject $$1) {
         List<fsf> $$2 = Lists.newArrayList();
         if ($$1.has("overrides")) {
            for (JsonElement $$4 : atg.v($$1, "overrides")) {
               $$2.add((fsf)$$0.deserialize($$4, fsf.class));
            }
         }

         return $$2;
      }

      private Map<String, Either<ged, String>> b(JsonObject $$0) {
         agm $$1 = gby.e;
         Map<String, Either<ged, String>> $$2 = Maps.newHashMap();
         if ($$0.has("textures")) {
            JsonObject $$3 = atg.u($$0, "textures");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), a($$1, $$4.getValue().getAsString()));
            }
         }

         return $$2;
      }

      private static Either<ged, String> a(agm $$0, String $$1) {
         if (fsb.e($$1)) {
            return Either.right($$1.substring(1));
         } else {
            agm $$2 = agm.a($$1);
            if ($$2 == null) {
               throw new JsonParseException($$1 + " is not valid resource location");
            } else {
               return Either.left(new ged($$0, $$2));
            }
         }
      }

      private String c(JsonObject $$0) {
         return atg.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? atg.k($$0, "ambientocclusion") : null;
      }

      protected List<frx> b(JsonDeserializationContext $$0, JsonObject $$1) {
         List<frx> $$2 = Lists.newArrayList();
         if ($$1.has("elements")) {
            for (JsonElement $$3 : atg.v($$1, "elements")) {
               $$2.add((frx)$$0.deserialize($$3, frx.class));
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

      public static fsb.b a(String $$0) {
         for (fsb.b $$1 : values()) {
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
