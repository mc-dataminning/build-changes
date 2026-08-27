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

public class fpg implements gbq {
   private static final Logger g = LogUtils.getLogger();
   private static final fpi h = new fpi();
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(fpg.class, new fpg.a())
      .registerTypeAdapter(fpc.class, new fpc.a())
      .registerTypeAdapter(fpd.class, new fpd.a())
      .registerTypeAdapter(fpf.class, new fpf.a())
      .registerTypeAdapter(fpm.class, new fpm.a())
      .registerTypeAdapter(fpn.class, new fpn.a())
      .registerTypeAdapter(fpk.class, new fpk.a())
      .create();
   private static final char i = '#';
   public static final String b = "particle";
   private static final boolean j = true;
   private final List<fpc> k;
   @Nullable
   private final fpg.b l;
   @Nullable
   private final Boolean m;
   private final fpn n;
   private final List<fpk> o;
   public String c = "";
   @VisibleForTesting
   protected final Map<String, Either<gbi, String>> d;
   @Nullable
   protected fpg e;
   @Nullable
   protected aex f;

   public static fpg a(Reader $$0) {
      return aro.a(a, $$0, fpg.class);
   }

   public static fpg a(String $$0) {
      return a(new StringReader($$0));
   }

   public fpg(@Nullable aex $$0, List<fpc> $$1, Map<String, Either<gbi, String>> $$2, @Nullable Boolean $$3, @Nullable fpg.b $$4, fpn $$5, List<fpk> $$6) {
      this.k = $$1;
      this.m = $$3;
      this.l = $$4;
      this.d = $$2;
      this.f = $$0;
      this.n = $$5;
      this.o = $$6;
   }

   public List<fpc> a() {
      return this.k.isEmpty() && this.e != null ? this.e.a() : this.k;
   }

   public boolean b() {
      if (this.m != null) {
         return this.m;
      } else {
         return this.e != null ? this.e.b() : true;
      }
   }

   public fpg.b c() {
      if (this.l != null) {
         return this.l;
      } else {
         return this.e != null ? this.e.c() : fpg.b.b;
      }
   }

   public boolean d() {
      return this.f == null || this.e != null && this.e.d();
   }

   public List<fpk> e() {
      return this.o;
   }

   private fpl a(gbj $$0, fpg $$1) {
      return this.o.isEmpty() ? fpl.a : new fpl($$0, $$1, this.o);
   }

   @Override
   public Collection<aex> f() {
      Set<aex> $$0 = Sets.newHashSet();

      for (fpk $$1 : this.o) {
         $$0.add($$1.a());
      }

      if (this.f != null) {
         $$0.add(this.f);
      }

      return $$0;
   }

   @Override
   public void a(Function<aex, gbq> $$0) {
      Set<gbq> $$1 = Sets.newLinkedHashSet();

      for (fpg $$2 = this; $$2.f != null && $$2.e == null; $$2 = $$2.e) {
         $$1.add($$2);
         gbq $$3 = $$0.apply($$2.f);
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
            $$2.f = gbk.n;
            $$3 = $$0.apply($$2.f);
         }

         if (!($$3 instanceof fpg)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         $$2.e = (fpg)$$3;
      }

      this.o.forEach($$1x -> {
         gbq $$2x = $$0.apply($$1x.a());
         if (!Objects.equals($$2x, this)) {
            $$2x.a($$0);
         }
      });
   }

   @Override
   public gbf a(gbj $$0, Function<gbi, fze> $$1, gbn $$2, aex $$3) {
      return this.a($$0, this, $$1, $$2, $$3, true);
   }

   public gbf a(gbj $$0, fpg $$1, Function<gbi, fze> $$2, gbn $$3, aex $$4, boolean $$5) {
      fze $$6 = $$2.apply(this.c("particle"));
      if (this.g() == gbk.s) {
         return new gbh(this.h(), this.a($$0, $$1), $$6, this.c().a());
      } else {
         gbp.a $$7 = new gbp.a(this, this.a($$0, $$1), $$5).a($$6);

         for (fpc $$8 : this.a()) {
            for (hc $$9 : $$8.c.keySet()) {
               fpd $$10 = $$8.c.get($$9);
               fze $$11 = $$2.apply(this.c($$10.d));
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

   private static fpb a(fpc $$0, fpd $$1, fze $$2, hc $$3, gbn $$4, aex $$5) {
      return h.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$5);
   }

   public boolean b(String $$0) {
      return !fyu.b().equals(this.c($$0).b());
   }

   public gbi c(String $$0) {
      if (e($$0)) {
         $$0 = $$0.substring(1);
      }

      List<String> $$1 = Lists.newArrayList();

      while (true) {
         Either<gbi, String> $$2 = this.d($$0);
         Optional<gbi> $$3 = $$2.left();
         if ($$3.isPresent()) {
            return $$3.get();
         }

         $$0 = (String)$$2.right().get();
         if ($$1.contains($$0)) {
            g.warn("Unable to resolve texture due to reference chain {}->{} in {}", new Object[]{Joiner.on("->").join($$1), $$0, this.c});
            return new gbi(fzd.e, fyu.b());
         }

         $$1.add($$0);
      }
   }

   private Either<gbi, String> d(String $$0) {
      for (fpg $$1 = this; $$1 != null; $$1 = $$1.e) {
         Either<gbi, String> $$2 = $$1.d.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return Either.left(new gbi(fzd.e, fyu.b()));
   }

   static boolean e(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public fpg g() {
      return this.e == null ? this : this.e.g();
   }

   public fpn h() {
      fpm $$0 = this.a(cjc.b);
      fpm $$1 = this.a(cjc.c);
      fpm $$2 = this.a(cjc.d);
      fpm $$3 = this.a(cjc.e);
      fpm $$4 = this.a(cjc.f);
      fpm $$5 = this.a(cjc.g);
      fpm $$6 = this.a(cjc.h);
      fpm $$7 = this.a(cjc.i);
      return new fpn($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private fpm a(cjc $$0) {
      return this.e != null && !this.n.b($$0) ? this.e.a($$0) : this.n.a($$0);
   }

   @Override
   public String toString() {
      return this.c;
   }

   public static class a implements JsonDeserializer<fpg> {
      public fpg a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<fpc> $$4 = this.b($$2, $$3);
         String $$5 = this.c($$3);
         Map<String, Either<gbi, String>> $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         fpn $$8 = fpn.a;
         if ($$3.has("display")) {
            JsonObject $$9 = aro.u($$3, "display");
            $$8 = (fpn)$$2.deserialize($$9, fpn.class);
         }

         List<fpk> $$10 = this.a($$2, $$3);
         fpg.b $$11 = null;
         if ($$3.has("gui_light")) {
            $$11 = fpg.b.a(aro.i($$3, "gui_light"));
         }

         aex $$12 = $$5.isEmpty() ? null : new aex($$5);
         return new fpg($$12, $$4, $$6, $$7, $$11, $$8, $$10);
      }

      protected List<fpk> a(JsonDeserializationContext $$0, JsonObject $$1) {
         List<fpk> $$2 = Lists.newArrayList();
         if ($$1.has("overrides")) {
            for (JsonElement $$4 : aro.v($$1, "overrides")) {
               $$2.add((fpk)$$0.deserialize($$4, fpk.class));
            }
         }

         return $$2;
      }

      private Map<String, Either<gbi, String>> b(JsonObject $$0) {
         aex $$1 = fzd.e;
         Map<String, Either<gbi, String>> $$2 = Maps.newHashMap();
         if ($$0.has("textures")) {
            JsonObject $$3 = aro.u($$0, "textures");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), a($$1, $$4.getValue().getAsString()));
            }
         }

         return $$2;
      }

      private static Either<gbi, String> a(aex $$0, String $$1) {
         if (fpg.e($$1)) {
            return Either.right($$1.substring(1));
         } else {
            aex $$2 = aex.a($$1);
            if ($$2 == null) {
               throw new JsonParseException($$1 + " is not valid resource location");
            } else {
               return Either.left(new gbi($$0, $$2));
            }
         }
      }

      private String c(JsonObject $$0) {
         return aro.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? aro.k($$0, "ambientocclusion") : null;
      }

      protected List<fpc> b(JsonDeserializationContext $$0, JsonObject $$1) {
         List<fpc> $$2 = Lists.newArrayList();
         if ($$1.has("elements")) {
            for (JsonElement $$3 : aro.v($$1, "elements")) {
               $$2.add((fpc)$$0.deserialize($$3, fpc.class));
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

      public static fpg.b a(String $$0) {
         for (fpg.b $$1 : values()) {
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
