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

public class fom implements gax {
   private static final Logger g = LogUtils.getLogger();
   private static final foo h = new foo();
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(fom.class, new fom.a())
      .registerTypeAdapter(foi.class, new foi.a())
      .registerTypeAdapter(foj.class, new foj.a())
      .registerTypeAdapter(fol.class, new fol.a())
      .registerTypeAdapter(fot.class, new fot.a())
      .registerTypeAdapter(fou.class, new fou.a())
      .registerTypeAdapter(foq.class, new foq.a())
      .create();
   private static final char i = '#';
   public static final String b = "particle";
   private static final boolean j = true;
   private final List<foi> k;
   @Nullable
   private final fom.b l;
   @Nullable
   private final Boolean m;
   private final fou n;
   private final List<foq> o;
   public String c = "";
   @VisibleForTesting
   protected final Map<String, Either<gap, String>> d;
   @Nullable
   protected fom e;
   @Nullable
   protected aer f;

   public static fom a(Reader $$0) {
      return arg.a(a, $$0, fom.class);
   }

   public static fom a(String $$0) {
      return a(new StringReader($$0));
   }

   public fom(@Nullable aer $$0, List<foi> $$1, Map<String, Either<gap, String>> $$2, @Nullable Boolean $$3, @Nullable fom.b $$4, fou $$5, List<foq> $$6) {
      this.k = $$1;
      this.m = $$3;
      this.l = $$4;
      this.d = $$2;
      this.f = $$0;
      this.n = $$5;
      this.o = $$6;
   }

   public List<foi> a() {
      return this.k.isEmpty() && this.e != null ? this.e.a() : this.k;
   }

   public boolean b() {
      if (this.m != null) {
         return this.m;
      } else {
         return this.e != null ? this.e.b() : true;
      }
   }

   public fom.b c() {
      if (this.l != null) {
         return this.l;
      } else {
         return this.e != null ? this.e.c() : fom.b.b;
      }
   }

   public boolean d() {
      return this.f == null || this.e != null && this.e.d();
   }

   public List<foq> e() {
      return this.o;
   }

   private fos a(gaq $$0, fom $$1) {
      return this.o.isEmpty() ? fos.a : new fos($$0, $$1, this.o);
   }

   @Override
   public Collection<aer> f() {
      Set<aer> $$0 = Sets.newHashSet();

      for (foq $$1 : this.o) {
         $$0.add($$1.a());
      }

      if (this.f != null) {
         $$0.add(this.f);
      }

      return $$0;
   }

   @Override
   public void a(Function<aer, gax> $$0) {
      Set<gax> $$1 = Sets.newLinkedHashSet();

      for (fom $$2 = this; $$2.f != null && $$2.e == null; $$2 = $$2.e) {
         $$1.add($$2);
         gax $$3 = $$0.apply($$2.f);
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
            $$2.f = gar.n;
            $$3 = $$0.apply($$2.f);
         }

         if (!($$3 instanceof fom)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         $$2.e = (fom)$$3;
      }

      this.o.forEach($$1x -> {
         gax $$2x = $$0.apply($$1x.a());
         if (!Objects.equals($$2x, this)) {
            $$2x.a($$0);
         }
      });
   }

   @Override
   public gam a(gaq $$0, Function<gap, fyl> $$1, gau $$2, aer $$3) {
      return this.a($$0, this, $$1, $$2, $$3, true);
   }

   public gam a(gaq $$0, fom $$1, Function<gap, fyl> $$2, gau $$3, aer $$4, boolean $$5) {
      fyl $$6 = $$2.apply(this.c("particle"));
      if (this.g() == gar.s) {
         return new gao(this.h(), this.a($$0, $$1), $$6, this.c().a());
      } else {
         gaw.a $$7 = new gaw.a(this, this.a($$0, $$1), $$5).a($$6);

         for (foi $$8 : this.a()) {
            for (ha $$9 : $$8.c.keySet()) {
               foj $$10 = $$8.c.get($$9);
               fyl $$11 = $$2.apply(this.c($$10.d));
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

   private static foh a(foi $$0, foj $$1, fyl $$2, ha $$3, gau $$4, aer $$5) {
      return h.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$5);
   }

   public boolean b(String $$0) {
      return !fyb.b().equals(this.c($$0).b());
   }

   public gap c(String $$0) {
      if (e($$0)) {
         $$0 = $$0.substring(1);
      }

      List<String> $$1 = Lists.newArrayList();

      while (true) {
         Either<gap, String> $$2 = this.d($$0);
         Optional<gap> $$3 = $$2.left();
         if ($$3.isPresent()) {
            return $$3.get();
         }

         $$0 = (String)$$2.right().get();
         if ($$1.contains($$0)) {
            g.warn("Unable to resolve texture due to reference chain {}->{} in {}", new Object[]{Joiner.on("->").join($$1), $$0, this.c});
            return new gap(fyk.e, fyb.b());
         }

         $$1.add($$0);
      }
   }

   private Either<gap, String> d(String $$0) {
      for (fom $$1 = this; $$1 != null; $$1 = $$1.e) {
         Either<gap, String> $$2 = $$1.d.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return Either.left(new gap(fyk.e, fyb.b()));
   }

   static boolean e(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public fom g() {
      return this.e == null ? this : this.e.g();
   }

   public fou h() {
      fot $$0 = this.a(civ.b);
      fot $$1 = this.a(civ.c);
      fot $$2 = this.a(civ.d);
      fot $$3 = this.a(civ.e);
      fot $$4 = this.a(civ.f);
      fot $$5 = this.a(civ.g);
      fot $$6 = this.a(civ.h);
      fot $$7 = this.a(civ.i);
      return new fou($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private fot a(civ $$0) {
      return this.e != null && !this.n.b($$0) ? this.e.a($$0) : this.n.a($$0);
   }

   @Override
   public String toString() {
      return this.c;
   }

   public static class a implements JsonDeserializer<fom> {
      public fom a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<foi> $$4 = this.b($$2, $$3);
         String $$5 = this.c($$3);
         Map<String, Either<gap, String>> $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         fou $$8 = fou.a;
         if ($$3.has("display")) {
            JsonObject $$9 = arg.u($$3, "display");
            $$8 = (fou)$$2.deserialize($$9, fou.class);
         }

         List<foq> $$10 = this.a($$2, $$3);
         fom.b $$11 = null;
         if ($$3.has("gui_light")) {
            $$11 = fom.b.a(arg.i($$3, "gui_light"));
         }

         aer $$12 = $$5.isEmpty() ? null : new aer($$5);
         return new fom($$12, $$4, $$6, $$7, $$11, $$8, $$10);
      }

      protected List<foq> a(JsonDeserializationContext $$0, JsonObject $$1) {
         List<foq> $$2 = Lists.newArrayList();
         if ($$1.has("overrides")) {
            for (JsonElement $$4 : arg.v($$1, "overrides")) {
               $$2.add((foq)$$0.deserialize($$4, foq.class));
            }
         }

         return $$2;
      }

      private Map<String, Either<gap, String>> b(JsonObject $$0) {
         aer $$1 = fyk.e;
         Map<String, Either<gap, String>> $$2 = Maps.newHashMap();
         if ($$0.has("textures")) {
            JsonObject $$3 = arg.u($$0, "textures");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), a($$1, $$4.getValue().getAsString()));
            }
         }

         return $$2;
      }

      private static Either<gap, String> a(aer $$0, String $$1) {
         if (fom.e($$1)) {
            return Either.right($$1.substring(1));
         } else {
            aer $$2 = aer.a($$1);
            if ($$2 == null) {
               throw new JsonParseException($$1 + " is not valid resource location");
            } else {
               return Either.left(new gap($$0, $$2));
            }
         }
      }

      private String c(JsonObject $$0) {
         return arg.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? arg.k($$0, "ambientocclusion") : null;
      }

      protected List<foi> b(JsonDeserializationContext $$0, JsonObject $$1) {
         List<foi> $$2 = Lists.newArrayList();
         if ($$1.has("elements")) {
            for (JsonElement $$3 : arg.v($$1, "elements")) {
               $$2.add((foi)$$0.deserialize($$3, foi.class));
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

      public static fom.b a(String $$0) {
         for (fom.b $$1 : values()) {
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
