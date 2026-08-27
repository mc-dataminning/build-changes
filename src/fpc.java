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

public class fpc implements gbm {
   private static final Logger g = LogUtils.getLogger();
   private static final fpe h = new fpe();
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(fpc.class, new fpc.a())
      .registerTypeAdapter(foy.class, new foy.a())
      .registerTypeAdapter(foz.class, new foz.a())
      .registerTypeAdapter(fpb.class, new fpb.a())
      .registerTypeAdapter(fpi.class, new fpi.a())
      .registerTypeAdapter(fpj.class, new fpj.a())
      .registerTypeAdapter(fpg.class, new fpg.a())
      .create();
   private static final char i = '#';
   public static final String b = "particle";
   private static final boolean j = true;
   private final List<foy> k;
   @Nullable
   private final fpc.b l;
   @Nullable
   private final Boolean m;
   private final fpj n;
   private final List<fpg> o;
   public String c = "";
   @VisibleForTesting
   protected final Map<String, Either<gbe, String>> d;
   @Nullable
   protected fpc e;
   @Nullable
   protected aez f;

   public static fpc a(Reader $$0) {
      return arr.a(a, $$0, fpc.class);
   }

   public static fpc a(String $$0) {
      return a(new StringReader($$0));
   }

   public fpc(@Nullable aez $$0, List<foy> $$1, Map<String, Either<gbe, String>> $$2, @Nullable Boolean $$3, @Nullable fpc.b $$4, fpj $$5, List<fpg> $$6) {
      this.k = $$1;
      this.m = $$3;
      this.l = $$4;
      this.d = $$2;
      this.f = $$0;
      this.n = $$5;
      this.o = $$6;
   }

   public List<foy> a() {
      return this.k.isEmpty() && this.e != null ? this.e.a() : this.k;
   }

   public boolean b() {
      if (this.m != null) {
         return this.m;
      } else {
         return this.e != null ? this.e.b() : true;
      }
   }

   public fpc.b c() {
      if (this.l != null) {
         return this.l;
      } else {
         return this.e != null ? this.e.c() : fpc.b.b;
      }
   }

   public boolean d() {
      return this.f == null || this.e != null && this.e.d();
   }

   public List<fpg> e() {
      return this.o;
   }

   private fph a(gbf $$0, fpc $$1) {
      return this.o.isEmpty() ? fph.a : new fph($$0, $$1, this.o);
   }

   @Override
   public Collection<aez> f() {
      Set<aez> $$0 = Sets.newHashSet();

      for (fpg $$1 : this.o) {
         $$0.add($$1.a());
      }

      if (this.f != null) {
         $$0.add(this.f);
      }

      return $$0;
   }

   @Override
   public void a(Function<aez, gbm> $$0) {
      Set<gbm> $$1 = Sets.newLinkedHashSet();

      for (fpc $$2 = this; $$2.f != null && $$2.e == null; $$2 = $$2.e) {
         $$1.add($$2);
         gbm $$3 = $$0.apply($$2.f);
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
            $$2.f = gbg.n;
            $$3 = $$0.apply($$2.f);
         }

         if (!($$3 instanceof fpc)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         $$2.e = (fpc)$$3;
      }

      this.o.forEach($$1x -> {
         gbm $$2x = $$0.apply($$1x.a());
         if (!Objects.equals($$2x, this)) {
            $$2x.a($$0);
         }
      });
   }

   @Override
   public gbb a(gbf $$0, Function<gbe, fza> $$1, gbj $$2, aez $$3) {
      return this.a($$0, this, $$1, $$2, $$3, true);
   }

   public gbb a(gbf $$0, fpc $$1, Function<gbe, fza> $$2, gbj $$3, aez $$4, boolean $$5) {
      fza $$6 = $$2.apply(this.c("particle"));
      if (this.g() == gbg.s) {
         return new gbd(this.h(), this.a($$0, $$1), $$6, this.c().a());
      } else {
         gbl.a $$7 = new gbl.a(this, this.a($$0, $$1), $$5).a($$6);

         for (foy $$8 : this.a()) {
            for (ha $$9 : $$8.c.keySet()) {
               foz $$10 = $$8.c.get($$9);
               fza $$11 = $$2.apply(this.c($$10.d));
               if ($$10.b == null) {
                  $$7.a(a($$8, $$10, $$11, $$9, $$3, $$4));
               } else {
                  $$7.a(ha.a($$3.b().c(), $$10.b), a($$8, $$10, $$11, $$9, $$3, $$4));
               }
            }
         }

         return $$7.b();
      }
   }

   private static fox a(foy $$0, foz $$1, fza $$2, ha $$3, gbj $$4, aez $$5) {
      return h.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$5);
   }

   public boolean b(String $$0) {
      return !fyq.b().equals(this.c($$0).b());
   }

   public gbe c(String $$0) {
      if (e($$0)) {
         $$0 = $$0.substring(1);
      }

      List<String> $$1 = Lists.newArrayList();

      while (true) {
         Either<gbe, String> $$2 = this.d($$0);
         Optional<gbe> $$3 = $$2.left();
         if ($$3.isPresent()) {
            return $$3.get();
         }

         $$0 = (String)$$2.right().get();
         if ($$1.contains($$0)) {
            g.warn("Unable to resolve texture due to reference chain {}->{} in {}", new Object[]{Joiner.on("->").join($$1), $$0, this.c});
            return new gbe(fyz.e, fyq.b());
         }

         $$1.add($$0);
      }
   }

   private Either<gbe, String> d(String $$0) {
      for (fpc $$1 = this; $$1 != null; $$1 = $$1.e) {
         Either<gbe, String> $$2 = $$1.d.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return Either.left(new gbe(fyz.e, fyq.b()));
   }

   static boolean e(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public fpc g() {
      return this.e == null ? this : this.e.g();
   }

   public fpj h() {
      fpi $$0 = this.a(cji.b);
      fpi $$1 = this.a(cji.c);
      fpi $$2 = this.a(cji.d);
      fpi $$3 = this.a(cji.e);
      fpi $$4 = this.a(cji.f);
      fpi $$5 = this.a(cji.g);
      fpi $$6 = this.a(cji.h);
      fpi $$7 = this.a(cji.i);
      return new fpj($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private fpi a(cji $$0) {
      return this.e != null && !this.n.b($$0) ? this.e.a($$0) : this.n.a($$0);
   }

   @Override
   public String toString() {
      return this.c;
   }

   public static class a implements JsonDeserializer<fpc> {
      public fpc a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<foy> $$4 = this.b($$2, $$3);
         String $$5 = this.c($$3);
         Map<String, Either<gbe, String>> $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         fpj $$8 = fpj.a;
         if ($$3.has("display")) {
            JsonObject $$9 = arr.u($$3, "display");
            $$8 = (fpj)$$2.deserialize($$9, fpj.class);
         }

         List<fpg> $$10 = this.a($$2, $$3);
         fpc.b $$11 = null;
         if ($$3.has("gui_light")) {
            $$11 = fpc.b.a(arr.i($$3, "gui_light"));
         }

         aez $$12 = $$5.isEmpty() ? null : new aez($$5);
         return new fpc($$12, $$4, $$6, $$7, $$11, $$8, $$10);
      }

      protected List<fpg> a(JsonDeserializationContext $$0, JsonObject $$1) {
         List<fpg> $$2 = Lists.newArrayList();
         if ($$1.has("overrides")) {
            for (JsonElement $$4 : arr.v($$1, "overrides")) {
               $$2.add((fpg)$$0.deserialize($$4, fpg.class));
            }
         }

         return $$2;
      }

      private Map<String, Either<gbe, String>> b(JsonObject $$0) {
         aez $$1 = fyz.e;
         Map<String, Either<gbe, String>> $$2 = Maps.newHashMap();
         if ($$0.has("textures")) {
            JsonObject $$3 = arr.u($$0, "textures");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), a($$1, $$4.getValue().getAsString()));
            }
         }

         return $$2;
      }

      private static Either<gbe, String> a(aez $$0, String $$1) {
         if (fpc.e($$1)) {
            return Either.right($$1.substring(1));
         } else {
            aez $$2 = aez.a($$1);
            if ($$2 == null) {
               throw new JsonParseException($$1 + " is not valid resource location");
            } else {
               return Either.left(new gbe($$0, $$2));
            }
         }
      }

      private String c(JsonObject $$0) {
         return arr.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? arr.k($$0, "ambientocclusion") : null;
      }

      protected List<foy> b(JsonDeserializationContext $$0, JsonObject $$1) {
         List<foy> $$2 = Lists.newArrayList();
         if ($$1.has("elements")) {
            for (JsonElement $$3 : arr.v($$1, "elements")) {
               $$2.add((foy)$$0.deserialize($$3, foy.class));
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

      public static fpc.b a(String $$0) {
         for (fpc.b $$1 : values()) {
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
