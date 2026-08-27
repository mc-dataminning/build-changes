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

public class fqc implements gcm {
   private static final Logger g = LogUtils.getLogger();
   private static final fqe h = new fqe();
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(fqc.class, new fqc.a())
      .registerTypeAdapter(fpy.class, new fpy.a())
      .registerTypeAdapter(fpz.class, new fpz.a())
      .registerTypeAdapter(fqb.class, new fqb.a())
      .registerTypeAdapter(fqi.class, new fqi.a())
      .registerTypeAdapter(fqj.class, new fqj.a())
      .registerTypeAdapter(fqg.class, new fqg.a())
      .create();
   private static final char i = '#';
   public static final String b = "particle";
   private static final boolean j = true;
   private final List<fpy> k;
   @Nullable
   private final fqc.b l;
   @Nullable
   private final Boolean m;
   private final fqj n;
   private final List<fqg> o;
   public String c = "";
   @VisibleForTesting
   protected final Map<String, Either<gce, String>> d;
   @Nullable
   protected fqc e;
   @Nullable
   protected afw f;

   public static fqc a(Reader $$0) {
      return aso.a(a, $$0, fqc.class);
   }

   public static fqc a(String $$0) {
      return a(new StringReader($$0));
   }

   public fqc(@Nullable afw $$0, List<fpy> $$1, Map<String, Either<gce, String>> $$2, @Nullable Boolean $$3, @Nullable fqc.b $$4, fqj $$5, List<fqg> $$6) {
      this.k = $$1;
      this.m = $$3;
      this.l = $$4;
      this.d = $$2;
      this.f = $$0;
      this.n = $$5;
      this.o = $$6;
   }

   public List<fpy> a() {
      return this.k.isEmpty() && this.e != null ? this.e.a() : this.k;
   }

   public boolean b() {
      if (this.m != null) {
         return this.m;
      } else {
         return this.e != null ? this.e.b() : true;
      }
   }

   public fqc.b c() {
      if (this.l != null) {
         return this.l;
      } else {
         return this.e != null ? this.e.c() : fqc.b.b;
      }
   }

   public boolean d() {
      return this.f == null || this.e != null && this.e.d();
   }

   public List<fqg> e() {
      return this.o;
   }

   private fqh a(gcf $$0, fqc $$1) {
      return this.o.isEmpty() ? fqh.a : new fqh($$0, $$1, this.o);
   }

   @Override
   public Collection<afw> f() {
      Set<afw> $$0 = Sets.newHashSet();

      for (fqg $$1 : this.o) {
         $$0.add($$1.a());
      }

      if (this.f != null) {
         $$0.add(this.f);
      }

      return $$0;
   }

   @Override
   public void a(Function<afw, gcm> $$0) {
      Set<gcm> $$1 = Sets.newLinkedHashSet();

      for (fqc $$2 = this; $$2.f != null && $$2.e == null; $$2 = $$2.e) {
         $$1.add($$2);
         gcm $$3 = $$0.apply($$2.f);
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
            $$2.f = gcg.n;
            $$3 = $$0.apply($$2.f);
         }

         if (!($$3 instanceof fqc)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         $$2.e = (fqc)$$3;
      }

      this.o.forEach($$1x -> {
         gcm $$2x = $$0.apply($$1x.a());
         if (!Objects.equals($$2x, this)) {
            $$2x.a($$0);
         }
      });
   }

   @Override
   public gcb a(gcf $$0, Function<gce, gaa> $$1, gcj $$2, afw $$3) {
      return this.a($$0, this, $$1, $$2, $$3, true);
   }

   public gcb a(gcf $$0, fqc $$1, Function<gce, gaa> $$2, gcj $$3, afw $$4, boolean $$5) {
      gaa $$6 = $$2.apply(this.c("particle"));
      if (this.g() == gcg.s) {
         return new gcd(this.h(), this.a($$0, $$1), $$6, this.c().a());
      } else {
         gcl.a $$7 = new gcl.a(this, this.a($$0, $$1), $$5).a($$6);

         for (fpy $$8 : this.a()) {
            for (hx $$9 : $$8.c.keySet()) {
               fpz $$10 = $$8.c.get($$9);
               gaa $$11 = $$2.apply(this.c($$10.d));
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

   private static fpx a(fpy $$0, fpz $$1, gaa $$2, hx $$3, gcj $$4, afw $$5) {
      return h.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$5);
   }

   public boolean b(String $$0) {
      return !fzq.b().equals(this.c($$0).b());
   }

   public gce c(String $$0) {
      if (e($$0)) {
         $$0 = $$0.substring(1);
      }

      List<String> $$1 = Lists.newArrayList();

      while (true) {
         Either<gce, String> $$2 = this.d($$0);
         Optional<gce> $$3 = $$2.left();
         if ($$3.isPresent()) {
            return $$3.get();
         }

         $$0 = (String)$$2.right().get();
         if ($$1.contains($$0)) {
            g.warn("Unable to resolve texture due to reference chain {}->{} in {}", new Object[]{Joiner.on("->").join($$1), $$0, this.c});
            return new gce(fzz.e, fzq.b());
         }

         $$1.add($$0);
      }
   }

   private Either<gce, String> d(String $$0) {
      for (fqc $$1 = this; $$1 != null; $$1 = $$1.e) {
         Either<gce, String> $$2 = $$1.d.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return Either.left(new gce(fzz.e, fzq.b()));
   }

   static boolean e(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public fqc g() {
      return this.e == null ? this : this.e.g();
   }

   public fqj h() {
      fqi $$0 = this.a(ckg.b);
      fqi $$1 = this.a(ckg.c);
      fqi $$2 = this.a(ckg.d);
      fqi $$3 = this.a(ckg.e);
      fqi $$4 = this.a(ckg.f);
      fqi $$5 = this.a(ckg.g);
      fqi $$6 = this.a(ckg.h);
      fqi $$7 = this.a(ckg.i);
      return new fqj($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private fqi a(ckg $$0) {
      return this.e != null && !this.n.b($$0) ? this.e.a($$0) : this.n.a($$0);
   }

   @Override
   public String toString() {
      return this.c;
   }

   public static class a implements JsonDeserializer<fqc> {
      public fqc a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<fpy> $$4 = this.b($$2, $$3);
         String $$5 = this.c($$3);
         Map<String, Either<gce, String>> $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         fqj $$8 = fqj.a;
         if ($$3.has("display")) {
            JsonObject $$9 = aso.u($$3, "display");
            $$8 = (fqj)$$2.deserialize($$9, fqj.class);
         }

         List<fqg> $$10 = this.a($$2, $$3);
         fqc.b $$11 = null;
         if ($$3.has("gui_light")) {
            $$11 = fqc.b.a(aso.i($$3, "gui_light"));
         }

         afw $$12 = $$5.isEmpty() ? null : new afw($$5);
         return new fqc($$12, $$4, $$6, $$7, $$11, $$8, $$10);
      }

      protected List<fqg> a(JsonDeserializationContext $$0, JsonObject $$1) {
         List<fqg> $$2 = Lists.newArrayList();
         if ($$1.has("overrides")) {
            for (JsonElement $$4 : aso.v($$1, "overrides")) {
               $$2.add((fqg)$$0.deserialize($$4, fqg.class));
            }
         }

         return $$2;
      }

      private Map<String, Either<gce, String>> b(JsonObject $$0) {
         afw $$1 = fzz.e;
         Map<String, Either<gce, String>> $$2 = Maps.newHashMap();
         if ($$0.has("textures")) {
            JsonObject $$3 = aso.u($$0, "textures");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), a($$1, $$4.getValue().getAsString()));
            }
         }

         return $$2;
      }

      private static Either<gce, String> a(afw $$0, String $$1) {
         if (fqc.e($$1)) {
            return Either.right($$1.substring(1));
         } else {
            afw $$2 = afw.a($$1);
            if ($$2 == null) {
               throw new JsonParseException($$1 + " is not valid resource location");
            } else {
               return Either.left(new gce($$0, $$2));
            }
         }
      }

      private String c(JsonObject $$0) {
         return aso.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? aso.k($$0, "ambientocclusion") : null;
      }

      protected List<fpy> b(JsonDeserializationContext $$0, JsonObject $$1) {
         List<fpy> $$2 = Lists.newArrayList();
         if ($$1.has("elements")) {
            for (JsonElement $$3 : aso.v($$1, "elements")) {
               $$2.add((fpy)$$0.deserialize($$3, fpy.class));
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

      public static fqc.b a(String $$0) {
         for (fqc.b $$1 : values()) {
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
