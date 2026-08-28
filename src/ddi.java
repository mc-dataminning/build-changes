import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import com.google.gson.JsonElement;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public record ddi(ask<String> k, String l, int m, List<ask<xa>> n, boolean o) implements dca<xa, ddi>, ddd {
   public static final ddi a = new ddi(ask.a(""), "", 0, List.of(), true);
   public static final int b = 32767;
   public static final int c = 16;
   public static final int d = 32;
   public static final int e = 3;
   public static final int f = 2;
   public static final Codec<xa> g = xc.a(32767);
   public static final Codec<List<ask<xa>>> h = a(g);
   public static final Codec<ddi> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ask.a(Codec.string(0, 32)).fieldOf("title").forGetter(ddi::d),
               Codec.STRING.fieldOf("author").forGetter(ddi::e),
               ayw.a(0, 3).optionalFieldOf("generation", 0).forGetter(ddi::f),
               h.optionalFieldOf("pages", List.of()).forGetter(ddi::a),
               Codec.BOOL.optionalFieldOf("resolved", false).forGetter(ddi::g)
            )
            .apply($$0, ddi::new)
   );
   public static final yy<wl, ddi> j = yy.a(ask.a(yw.b(32)), ddi::d, yw.p, ddi::e, yw.h, ddi::f, ask.a(xc.b).a(yw.a()), ddi::a, yw.b, ddi::g, ddi::new);

   public ddi(ask<String> k, String l, int m, List<ask<xa>> n, boolean o) {
      if (m >= 0 && m <= 3) {
         this.k = k;
         this.l = l;
         this.m = m;
         this.n = n;
         this.o = o;
      } else {
         throw new IllegalArgumentException("Generation was " + m + ", but must be between 0 and 3");
      }
   }

   private static Codec<ask<xa>> b(Codec<xa> $$0) {
      return ask.a($$0);
   }

   public static Codec<List<ask<xa>>> a(Codec<xa> $$0) {
      return b($$0).listOf();
   }

   @Nullable
   public ddi b() {
      return this.m >= 2 ? null : new ddi(this.k, this.l, this.m + 1, this.n, this.o);
   }

   public static boolean a(czy $$0, ej $$1, @Nullable crx $$2) {
      ddi $$3 = $$0.a(kk.V);
      if ($$3 != null && !$$3.g()) {
         ddi $$4 = $$3.a($$1, $$2);
         if ($$4 != null) {
            $$0.b(kk.V, $$4);
            return true;
         }

         $$0.b(kk.V, $$3.c());
      }

      return false;
   }

   @Nullable
   public ddi a(ej $$0, @Nullable crx $$1) {
      if (this.o) {
         return null;
      } else {
         Builder<ask<xa>> $$2 = ImmutableList.builderWithExpectedSize(this.n.size());

         for (ask<xa> $$3 : this.n) {
            Optional<ask<xa>> $$4 = a($$0, $$1, $$3);
            if ($$4.isEmpty()) {
               return null;
            }

            $$2.add($$4.get());
         }

         return new ddi(this.k, this.l, this.m, $$2.build(), true);
      }
   }

   public ddi c() {
      return new ddi(this.k, this.l, this.m, this.n, true);
   }

   private static Optional<ask<xa>> a(ej $$0, @Nullable crx $$1, ask<xa> $$2) {
      return $$2.b($$2x -> {
         try {
            xa $$3 = xd.a($$0, $$2x, $$1, 0);
            return a($$3, $$0.u()) ? Optional.empty() : Optional.of($$3);
         } catch (Exception var4) {
            return Optional.of($$2x);
         }
      });
   }

   private static boolean a(xa $$0, jh.a $$1) {
      DataResult<JsonElement> $$2 = xc.a.encodeStart($$1.a(JsonOps.INSTANCE), $$0);
      return $$2.isSuccess() && aze.a((JsonElement)$$2.getOrThrow(), 32767);
   }

   public List<xa> a(boolean $$0) {
      return Lists.transform(this.n, $$1 -> (xa)$$1.a($$0));
   }

   public ddi b(List<ask<xa>> $$0) {
      return new ddi(this.k, this.l, this.m, $$0, false);
   }

   @Override
   public void a(czu.b $$0, Consumer<xa> $$1, dbn $$2, kf $$3) {
      if (!ban.h(this.l)) {
         $$1.accept(xa.a("book.byAuthor", this.l).a(o.h));
      }

      $$1.accept(xa.c("book.generation." + this.m).a(o.h));
   }

   public ask<String> d() {
      return this.k;
   }

   public String e() {
      return this.l;
   }

   public int f() {
      return this.m;
   }

   @Override
   public List<ask<xa>> a() {
      return this.n;
   }

   public boolean g() {
      return this.o;
   }
}
