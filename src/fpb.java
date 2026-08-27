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

public class fpb implements gbl {
   private static final Logger g = LogUtils.getLogger();
   private static final fpd h = new fpd();
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(fpb.class, new fpb.a())
      .registerTypeAdapter(fox.class, new fox.a())
      .registerTypeAdapter(foy.class, new foy.a())
      .registerTypeAdapter(fpa.class, new fpa.a())
      .registerTypeAdapter(fph.class, new fph.a())
      .registerTypeAdapter(fpi.class, new fpi.a())
      .registerTypeAdapter(fpf.class, new fpf.a())
      .create();
   private static final char i = '#';
   public static final String b = "particle";
   private static final boolean j = true;
   private final List<fox> k;
   @Nullable
   private final fpb.b l;
   @Nullable
   private final Boolean m;
   private final fpi n;
   private final List<fpf> o;
   public String c = "";
   @VisibleForTesting
   protected final Map<String, Either<gbd, String>> d;
   @Nullable
   protected fpb e;
   @Nullable
   protected aeu f;

   public static fpb a(Reader $$0) {
      return arj.a(a, $$0, fpb.class);
   }

   public static fpb a(String $$0) {
      return a(new StringReader($$0));
   }

   public fpb(@Nullable aeu $$0, List<fox> $$1, Map<String, Either<gbd, String>> $$2, @Nullable Boolean $$3, @Nullable fpb.b $$4, fpi $$5, List<fpf> $$6) {
      this.k = $$1;
      this.m = $$3;
      this.l = $$4;
      this.d = $$2;
      this.f = $$0;
      this.n = $$5;
      this.o = $$6;
   }

   public List<fox> a() {
      return this.k.isEmpty() && this.e != null ? this.e.a() : this.k;
   }

   public boolean b() {
      if (this.m != null) {
         return this.m;
      } else {
         return this.e != null ? this.e.b() : true;
      }
   }

   public fpb.b c() {
      if (this.l != null) {
         return this.l;
      } else {
         return this.e != null ? this.e.c() : fpb.b.b;
      }
   }

   public boolean d() {
      return this.f == null || this.e != null && this.e.d();
   }

   public List<fpf> e() {
      return this.o;
   }

   private fpg a(gbe $$0, fpb $$1) {
      return this.o.isEmpty() ? fpg.a : new fpg($$0, $$1, this.o);
   }

   @Override
   public Collection<aeu> f() {
      Set<aeu> $$0 = Sets.newHashSet();

      for (fpf $$1 : this.o) {
         $$0.add($$1.a());
      }

      if (this.f != null) {
         $$0.add(this.f);
      }

      return $$0;
   }

   @Override
   public void a(Function<aeu, gbl> $$0) {
      Set<gbl> $$1 = Sets.newLinkedHashSet();

      for (fpb $$2 = this; $$2.f != null && $$2.e == null; $$2 = $$2.e) {
         $$1.add($$2);
         gbl $$3 = $$0.apply($$2.f);
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
            $$2.f = gbf.n;
            $$3 = $$0.apply($$2.f);
         }

         if (!($$3 instanceof fpb)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         $$2.e = (fpb)$$3;
      }

      this.o.forEach($$1x -> {
         gbl $$2x = $$0.apply($$1x.a());
         if (!Objects.equals($$2x, this)) {
            $$2x.a($$0);
         }
      });
   }

   @Override
   public gba a(gbe $$0, Function<gbd, fyz> $$1, gbi $$2, aeu $$3) {
      return this.a($$0, this, $$1, $$2, $$3, true);
   }

   public gba a(gbe $$0, fpb $$1, Function<gbd, fyz> $$2, gbi $$3, aeu $$4, boolean $$5) {
      fyz $$6 = $$2.apply(this.c("particle"));
      if (this.g() == gbf.s) {
         return new gbc(this.h(), this.a($$0, $$1), $$6, this.c().a());
      } else {
         gbk.a $$7 = new gbk.a(this, this.a($$0, $$1), $$5).a($$6);

         for (fox $$8 : this.a()) {
            for (hc $$9 : $$8.c.keySet()) {
               foy $$10 = $$8.c.get($$9);
               fyz $$11 = $$2.apply(this.c($$10.d));
               if ($$10.b == null) {
                  $$7.a(a($$8, $$10, $$11, $$9, $$3, $$4));
               } else {
                  $$7.a(hc.a($$3.b().c(), $$10.b), a($$8, $$10, $$11, $$9, $$3, $$4));
               }
            }
         }

         return $$7.b();
      }
   }

   private static fow a(fox $$0, foy $$1, fyz $$2, hc $$3, gbi $$4, aeu $$5) {
      return h.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$5);
   }

   public boolean b(String $$0) {
      return !fyp.b().equals(this.c($$0).b());
   }

   public gbd c(String $$0) {
      if (e($$0)) {
         $$0 = $$0.substring(1);
      }

      List<String> $$1 = Lists.newArrayList();

      while (true) {
         Either<gbd, String> $$2 = this.d($$0);
         Optional<gbd> $$3 = $$2.left();
         if ($$3.isPresent()) {
            return $$3.get();
         }

         $$0 = (String)$$2.right().get();
         if ($$1.contains($$0)) {
            g.warn("Unable to resolve texture due to reference chain {}->{} in {}", new Object[]{Joiner.on("->").join($$1), $$0, this.c});
            return new gbd(fyy.e, fyp.b());
         }

         $$1.add($$0);
      }
   }

   private Either<gbd, String> d(String $$0) {
      for (fpb $$1 = this; $$1 != null; $$1 = $$1.e) {
         Either<gbd, String> $$2 = $$1.d.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return Either.left(new gbd(fyy.e, fyp.b()));
   }

   static boolean e(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public fpb g() {
      return this.e == null ? this : this.e.g();
   }

   public fpi h() {
      fph $$0 = this.a(cix.b);
      fph $$1 = this.a(cix.c);
      fph $$2 = this.a(cix.d);
      fph $$3 = this.a(cix.e);
      fph $$4 = this.a(cix.f);
      fph $$5 = this.a(cix.g);
      fph $$6 = this.a(cix.h);
      fph $$7 = this.a(cix.i);
      return new fpi($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private fph a(cix $$0) {
      return this.e != null && !this.n.b($$0) ? this.e.a($$0) : this.n.a($$0);
   }

   @Override
   public String toString() {
      return this.c;
   }

   public static class a implements JsonDeserializer<fpb> {
      public fpb a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<fox> $$4 = this.b($$2, $$3);
         String $$5 = this.c($$3);
         Map<String, Either<gbd, String>> $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         fpi $$8 = fpi.a;
         if ($$3.has("display")) {
            JsonObject $$9 = arj.u($$3, "display");
            $$8 = (fpi)$$2.deserialize($$9, fpi.class);
         }

         List<fpf> $$10 = this.a($$2, $$3);
         fpb.b $$11 = null;
         if ($$3.has("gui_light")) {
            $$11 = fpb.b.a(arj.i($$3, "gui_light"));
         }

         aeu $$12 = $$5.isEmpty() ? null : new aeu($$5);
         return new fpb($$12, $$4, $$6, $$7, $$11, $$8, $$10);
      }

      protected List<fpf> a(JsonDeserializationContext $$0, JsonObject $$1) {
         List<fpf> $$2 = Lists.newArrayList();
         if ($$1.has("overrides")) {
            for (JsonElement $$4 : arj.v($$1, "overrides")) {
               $$2.add((fpf)$$0.deserialize($$4, fpf.class));
            }
         }

         return $$2;
      }

      private Map<String, Either<gbd, String>> b(JsonObject $$0) {
         aeu $$1 = fyy.e;
         Map<String, Either<gbd, String>> $$2 = Maps.newHashMap();
         if ($$0.has("textures")) {
            JsonObject $$3 = arj.u($$0, "textures");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), a($$1, $$4.getValue().getAsString()));
            }
         }

         return $$2;
      }

      private static Either<gbd, String> a(aeu $$0, String $$1) {
         if (fpb.e($$1)) {
            return Either.right($$1.substring(1));
         } else {
            aeu $$2 = aeu.a($$1);
            if ($$2 == null) {
               throw new JsonParseException($$1 + " is not valid resource location");
            } else {
               return Either.left(new gbd($$0, $$2));
            }
         }
      }

      private String c(JsonObject $$0) {
         return arj.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? arj.k($$0, "ambientocclusion") : null;
      }

      protected List<fox> b(JsonDeserializationContext $$0, JsonObject $$1) {
         List<fox> $$2 = Lists.newArrayList();
         if ($$1.has("elements")) {
            for (JsonElement $$3 : arj.v($$1, "elements")) {
               $$2.add((fox)$$0.deserialize($$3, fox.class));
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

      public static fpb.b a(String $$0) {
         for (fpb.b $$1 : values()) {
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
