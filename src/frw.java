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

public class frw implements geg {
   private static final Logger g = LogUtils.getLogger();
   private static final fry h = new fry();
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(frw.class, new frw.a())
      .registerTypeAdapter(frs.class, new frs.a())
      .registerTypeAdapter(frt.class, new frt.a())
      .registerTypeAdapter(frv.class, new frv.a())
      .registerTypeAdapter(fsc.class, new fsc.a())
      .registerTypeAdapter(fsd.class, new fsd.a())
      .registerTypeAdapter(fsa.class, new fsa.a())
      .create();
   private static final char i = '#';
   public static final String b = "particle";
   private static final boolean j = true;
   private final List<frs> k;
   @Nullable
   private final frw.b l;
   @Nullable
   private final Boolean m;
   private final fsd n;
   private final List<fsa> o;
   public String c = "";
   @VisibleForTesting
   protected final Map<String, Either<gdy, String>> d;
   @Nullable
   protected frw e;
   @Nullable
   protected agi f;

   public static frw a(Reader $$0) {
      return atc.a(a, $$0, frw.class);
   }

   public static frw a(String $$0) {
      return a(new StringReader($$0));
   }

   public frw(@Nullable agi $$0, List<frs> $$1, Map<String, Either<gdy, String>> $$2, @Nullable Boolean $$3, @Nullable frw.b $$4, fsd $$5, List<fsa> $$6) {
      this.k = $$1;
      this.m = $$3;
      this.l = $$4;
      this.d = $$2;
      this.f = $$0;
      this.n = $$5;
      this.o = $$6;
   }

   public List<frs> a() {
      return this.k.isEmpty() && this.e != null ? this.e.a() : this.k;
   }

   public boolean b() {
      if (this.m != null) {
         return this.m;
      } else {
         return this.e != null ? this.e.b() : true;
      }
   }

   public frw.b c() {
      if (this.l != null) {
         return this.l;
      } else {
         return this.e != null ? this.e.c() : frw.b.b;
      }
   }

   public boolean d() {
      return this.f == null || this.e != null && this.e.d();
   }

   public List<fsa> e() {
      return this.o;
   }

   private fsb a(gdz $$0, frw $$1) {
      return this.o.isEmpty() ? fsb.a : new fsb($$0, $$1, this.o);
   }

   @Override
   public Collection<agi> f() {
      Set<agi> $$0 = Sets.newHashSet();

      for (fsa $$1 : this.o) {
         $$0.add($$1.a());
      }

      if (this.f != null) {
         $$0.add(this.f);
      }

      return $$0;
   }

   @Override
   public void a(Function<agi, geg> $$0) {
      Set<geg> $$1 = Sets.newLinkedHashSet();

      for (frw $$2 = this; $$2.f != null && $$2.e == null; $$2 = $$2.e) {
         $$1.add($$2);
         geg $$3 = $$0.apply($$2.f);
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
            $$2.f = gea.n;
            $$3 = $$0.apply($$2.f);
         }

         if (!($$3 instanceof frw)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         $$2.e = (frw)$$3;
      }

      this.o.forEach($$1x -> {
         geg $$2x = $$0.apply($$1x.a());
         if (!Objects.equals($$2x, this)) {
            $$2x.a($$0);
         }
      });
   }

   @Override
   public gdv a(gdz $$0, Function<gdy, gbu> $$1, ged $$2, agi $$3) {
      return this.a($$0, this, $$1, $$2, $$3, true);
   }

   public gdv a(gdz $$0, frw $$1, Function<gdy, gbu> $$2, ged $$3, agi $$4, boolean $$5) {
      gbu $$6 = $$2.apply(this.c("particle"));
      if (this.g() == gea.s) {
         return new gdx(this.h(), this.a($$0, $$1), $$6, this.c().a());
      } else {
         gef.a $$7 = new gef.a(this, this.a($$0, $$1), $$5).a($$6);

         for (frs $$8 : this.a()) {
            for (hx $$9 : $$8.c.keySet()) {
               frt $$10 = $$8.c.get($$9);
               gbu $$11 = $$2.apply(this.c($$10.d));
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

   private static frr a(frs $$0, frt $$1, gbu $$2, hx $$3, ged $$4, agi $$5) {
      return h.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$5);
   }

   public boolean b(String $$0) {
      return !gbk.b().equals(this.c($$0).b());
   }

   public gdy c(String $$0) {
      if (e($$0)) {
         $$0 = $$0.substring(1);
      }

      List<String> $$1 = Lists.newArrayList();

      while (true) {
         Either<gdy, String> $$2 = this.d($$0);
         Optional<gdy> $$3 = $$2.left();
         if ($$3.isPresent()) {
            return $$3.get();
         }

         $$0 = (String)$$2.right().get();
         if ($$1.contains($$0)) {
            g.warn("Unable to resolve texture due to reference chain {}->{} in {}", new Object[]{Joiner.on("->").join($$1), $$0, this.c});
            return new gdy(gbt.e, gbk.b());
         }

         $$1.add($$0);
      }
   }

   private Either<gdy, String> d(String $$0) {
      for (frw $$1 = this; $$1 != null; $$1 = $$1.e) {
         Either<gdy, String> $$2 = $$1.d.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return Either.left(new gdy(gbt.e, gbk.b()));
   }

   static boolean e(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public frw g() {
      return this.e == null ? this : this.e.g();
   }

   public fsd h() {
      fsc $$0 = this.a(clg.b);
      fsc $$1 = this.a(clg.c);
      fsc $$2 = this.a(clg.d);
      fsc $$3 = this.a(clg.e);
      fsc $$4 = this.a(clg.f);
      fsc $$5 = this.a(clg.g);
      fsc $$6 = this.a(clg.h);
      fsc $$7 = this.a(clg.i);
      return new fsd($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private fsc a(clg $$0) {
      return this.e != null && !this.n.b($$0) ? this.e.a($$0) : this.n.a($$0);
   }

   @Override
   public String toString() {
      return this.c;
   }

   public static class a implements JsonDeserializer<frw> {
      public frw a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<frs> $$4 = this.b($$2, $$3);
         String $$5 = this.c($$3);
         Map<String, Either<gdy, String>> $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         fsd $$8 = fsd.a;
         if ($$3.has("display")) {
            JsonObject $$9 = atc.u($$3, "display");
            $$8 = (fsd)$$2.deserialize($$9, fsd.class);
         }

         List<fsa> $$10 = this.a($$2, $$3);
         frw.b $$11 = null;
         if ($$3.has("gui_light")) {
            $$11 = frw.b.a(atc.i($$3, "gui_light"));
         }

         agi $$12 = $$5.isEmpty() ? null : new agi($$5);
         return new frw($$12, $$4, $$6, $$7, $$11, $$8, $$10);
      }

      protected List<fsa> a(JsonDeserializationContext $$0, JsonObject $$1) {
         List<fsa> $$2 = Lists.newArrayList();
         if ($$1.has("overrides")) {
            for (JsonElement $$4 : atc.v($$1, "overrides")) {
               $$2.add((fsa)$$0.deserialize($$4, fsa.class));
            }
         }

         return $$2;
      }

      private Map<String, Either<gdy, String>> b(JsonObject $$0) {
         agi $$1 = gbt.e;
         Map<String, Either<gdy, String>> $$2 = Maps.newHashMap();
         if ($$0.has("textures")) {
            JsonObject $$3 = atc.u($$0, "textures");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), a($$1, $$4.getValue().getAsString()));
            }
         }

         return $$2;
      }

      private static Either<gdy, String> a(agi $$0, String $$1) {
         if (frw.e($$1)) {
            return Either.right($$1.substring(1));
         } else {
            agi $$2 = agi.a($$1);
            if ($$2 == null) {
               throw new JsonParseException($$1 + " is not valid resource location");
            } else {
               return Either.left(new gdy($$0, $$2));
            }
         }
      }

      private String c(JsonObject $$0) {
         return atc.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? atc.k($$0, "ambientocclusion") : null;
      }

      protected List<frs> b(JsonDeserializationContext $$0, JsonObject $$1) {
         List<frs> $$2 = Lists.newArrayList();
         if ($$1.has("elements")) {
            for (JsonElement $$3 : atc.v($$1, "elements")) {
               $$2.add((frs)$$0.deserialize($$3, frs.class));
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

      public static frw.b a(String $$0) {
         for (frw.b $$1 : values()) {
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
