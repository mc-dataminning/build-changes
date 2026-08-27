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

public class foh implements gas {
   private static final Logger g = LogUtils.getLogger();
   private static final foj h = new foj();
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(foh.class, new foh.a())
      .registerTypeAdapter(fod.class, new fod.a())
      .registerTypeAdapter(foe.class, new foe.a())
      .registerTypeAdapter(fog.class, new fog.a())
      .registerTypeAdapter(fon.class, new fon.a())
      .registerTypeAdapter(foo.class, new foo.a())
      .registerTypeAdapter(fol.class, new fol.a())
      .create();
   private static final char i = '#';
   public static final String b = "particle";
   private static final boolean j = true;
   private final List<fod> k;
   @Nullable
   private final foh.b l;
   @Nullable
   private final Boolean m;
   private final foo n;
   private final List<fol> o;
   public String c = "";
   @VisibleForTesting
   protected final Map<String, Either<gak, String>> d;
   @Nullable
   protected foh e;
   @Nullable
   protected aep f;

   public static foh a(Reader $$0) {
      return arf.a(a, $$0, foh.class);
   }

   public static foh a(String $$0) {
      return a(new StringReader($$0));
   }

   public foh(@Nullable aep $$0, List<fod> $$1, Map<String, Either<gak, String>> $$2, @Nullable Boolean $$3, @Nullable foh.b $$4, foo $$5, List<fol> $$6) {
      this.k = $$1;
      this.m = $$3;
      this.l = $$4;
      this.d = $$2;
      this.f = $$0;
      this.n = $$5;
      this.o = $$6;
   }

   public List<fod> a() {
      return this.k.isEmpty() && this.e != null ? this.e.a() : this.k;
   }

   public boolean b() {
      if (this.m != null) {
         return this.m;
      } else {
         return this.e != null ? this.e.b() : true;
      }
   }

   public foh.b c() {
      if (this.l != null) {
         return this.l;
      } else {
         return this.e != null ? this.e.c() : foh.b.b;
      }
   }

   public boolean d() {
      return this.f == null || this.e != null && this.e.d();
   }

   public List<fol> e() {
      return this.o;
   }

   private fom a(gal $$0, foh $$1) {
      return this.o.isEmpty() ? fom.a : new fom($$0, $$1, this.o);
   }

   @Override
   public Collection<aep> f() {
      Set<aep> $$0 = Sets.newHashSet();

      for (fol $$1 : this.o) {
         $$0.add($$1.a());
      }

      if (this.f != null) {
         $$0.add(this.f);
      }

      return $$0;
   }

   @Override
   public void a(Function<aep, gas> $$0) {
      Set<gas> $$1 = Sets.newLinkedHashSet();

      for (foh $$2 = this; $$2.f != null && $$2.e == null; $$2 = $$2.e) {
         $$1.add($$2);
         gas $$3 = $$0.apply($$2.f);
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
            $$2.f = gam.n;
            $$3 = $$0.apply($$2.f);
         }

         if (!($$3 instanceof foh)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         $$2.e = (foh)$$3;
      }

      this.o.forEach($$1x -> {
         gas $$2x = $$0.apply($$1x.a());
         if (!Objects.equals($$2x, this)) {
            $$2x.a($$0);
         }
      });
   }

   @Override
   public gah a(gal $$0, Function<gak, fyg> $$1, gap $$2, aep $$3) {
      return this.a($$0, this, $$1, $$2, $$3, true);
   }

   public gah a(gal $$0, foh $$1, Function<gak, fyg> $$2, gap $$3, aep $$4, boolean $$5) {
      fyg $$6 = $$2.apply(this.c("particle"));
      if (this.g() == gam.s) {
         return new gaj(this.h(), this.a($$0, $$1), $$6, this.c().a());
      } else {
         gar.a $$7 = new gar.a(this, this.a($$0, $$1), $$5).a($$6);

         for (fod $$8 : this.a()) {
            for (hb $$9 : $$8.c.keySet()) {
               foe $$10 = $$8.c.get($$9);
               fyg $$11 = $$2.apply(this.c($$10.d));
               if ($$10.b == null) {
                  $$7.a(a($$8, $$10, $$11, $$9, $$3, $$4));
               } else {
                  $$7.a(hb.a($$3.b().c(), $$10.b), a($$8, $$10, $$11, $$9, $$3, $$4));
               }
            }
         }

         return $$7.b();
      }
   }

   private static foc a(fod $$0, foe $$1, fyg $$2, hb $$3, gap $$4, aep $$5) {
      return h.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$5);
   }

   public boolean b(String $$0) {
      return !fxw.b().equals(this.c($$0).b());
   }

   public gak c(String $$0) {
      if (e($$0)) {
         $$0 = $$0.substring(1);
      }

      List<String> $$1 = Lists.newArrayList();

      while (true) {
         Either<gak, String> $$2 = this.d($$0);
         Optional<gak> $$3 = $$2.left();
         if ($$3.isPresent()) {
            return $$3.get();
         }

         $$0 = (String)$$2.right().get();
         if ($$1.contains($$0)) {
            g.warn("Unable to resolve texture due to reference chain {}->{} in {}", new Object[]{Joiner.on("->").join($$1), $$0, this.c});
            return new gak(fyf.e, fxw.b());
         }

         $$1.add($$0);
      }
   }

   private Either<gak, String> d(String $$0) {
      for (foh $$1 = this; $$1 != null; $$1 = $$1.e) {
         Either<gak, String> $$2 = $$1.d.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return Either.left(new gak(fyf.e, fxw.b()));
   }

   static boolean e(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public foh g() {
      return this.e == null ? this : this.e.g();
   }

   public foo h() {
      fon $$0 = this.a(cit.b);
      fon $$1 = this.a(cit.c);
      fon $$2 = this.a(cit.d);
      fon $$3 = this.a(cit.e);
      fon $$4 = this.a(cit.f);
      fon $$5 = this.a(cit.g);
      fon $$6 = this.a(cit.h);
      fon $$7 = this.a(cit.i);
      return new foo($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private fon a(cit $$0) {
      return this.e != null && !this.n.b($$0) ? this.e.a($$0) : this.n.a($$0);
   }

   @Override
   public String toString() {
      return this.c;
   }

   public static class a implements JsonDeserializer<foh> {
      public foh a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<fod> $$4 = this.b($$2, $$3);
         String $$5 = this.c($$3);
         Map<String, Either<gak, String>> $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         foo $$8 = foo.a;
         if ($$3.has("display")) {
            JsonObject $$9 = arf.u($$3, "display");
            $$8 = (foo)$$2.deserialize($$9, foo.class);
         }

         List<fol> $$10 = this.a($$2, $$3);
         foh.b $$11 = null;
         if ($$3.has("gui_light")) {
            $$11 = foh.b.a(arf.i($$3, "gui_light"));
         }

         aep $$12 = $$5.isEmpty() ? null : new aep($$5);
         return new foh($$12, $$4, $$6, $$7, $$11, $$8, $$10);
      }

      protected List<fol> a(JsonDeserializationContext $$0, JsonObject $$1) {
         List<fol> $$2 = Lists.newArrayList();
         if ($$1.has("overrides")) {
            for (JsonElement $$4 : arf.v($$1, "overrides")) {
               $$2.add((fol)$$0.deserialize($$4, fol.class));
            }
         }

         return $$2;
      }

      private Map<String, Either<gak, String>> b(JsonObject $$0) {
         aep $$1 = fyf.e;
         Map<String, Either<gak, String>> $$2 = Maps.newHashMap();
         if ($$0.has("textures")) {
            JsonObject $$3 = arf.u($$0, "textures");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), a($$1, $$4.getValue().getAsString()));
            }
         }

         return $$2;
      }

      private static Either<gak, String> a(aep $$0, String $$1) {
         if (foh.e($$1)) {
            return Either.right($$1.substring(1));
         } else {
            aep $$2 = aep.a($$1);
            if ($$2 == null) {
               throw new JsonParseException($$1 + " is not valid resource location");
            } else {
               return Either.left(new gak($$0, $$2));
            }
         }
      }

      private String c(JsonObject $$0) {
         return arf.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? arf.k($$0, "ambientocclusion") : null;
      }

      protected List<fod> b(JsonDeserializationContext $$0, JsonObject $$1) {
         List<fod> $$2 = Lists.newArrayList();
         if ($$1.has("elements")) {
            for (JsonElement $$3 : arf.v($$1, "elements")) {
               $$2.add((fod)$$0.deserialize($$3, fod.class));
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

      public static foh.b a(String $$0) {
         for (foh.b $$1 : values()) {
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
