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

public record dbe(asf<String> k, String l, int m, List<asf<wv>> n, boolean o) implements czy<wv, dbe>, day {
   public static final dbe a = new dbe(asf.a(""), "", 0, List.of(), true);
   public static final int b = 32767;
   public static final int c = 16;
   public static final int d = 32;
   public static final int e = 3;
   public static final int f = 2;
   public static final Codec<wv> g = wx.a(32767);
   public static final Codec<List<asf<wv>>> h = a(g);
   public static final Codec<dbe> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asf.a(Codec.string(0, 32)).fieldOf("title").forGetter(dbe::d),
               Codec.STRING.fieldOf("author").forGetter(dbe::e),
               ays.a(0, 3).optionalFieldOf("generation", 0).forGetter(dbe::f),
               h.optionalFieldOf("pages", List.of()).forGetter(dbe::a),
               Codec.BOOL.optionalFieldOf("resolved", false).forGetter(dbe::g)
            )
            .apply($$0, dbe::new)
   );
   public static final yt<wg, dbe> j = yt.a(asf.a(yr.b(32)), dbe::d, yr.o, dbe::e, yr.h, dbe::f, asf.a(wx.b).a(yr.a()), dbe::a, yr.b, dbe::g, dbe::new);

   public dbe(asf<String> k, String l, int m, List<asf<wv>> n, boolean o) {
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

   private static Codec<asf<wv>> b(Codec<wv> $$0) {
      return asf.a($$0);
   }

   public static Codec<List<asf<wv>>> a(Codec<wv> $$0) {
      return b($$0).listOf();
   }

   @Nullable
   public dbe b() {
      return this.m >= 2 ? null : new dbe(this.k, this.l, this.m + 1, this.n, this.o);
   }

   public static boolean a(cxy $$0, ex $$1, @Nullable cqi $$2) {
      dbe $$3 = $$0.a(kx.V);
      if ($$3 != null && !$$3.g()) {
         dbe $$4 = $$3.a($$1, $$2);
         if ($$4 != null) {
            $$0.b(kx.V, $$4);
            return true;
         }

         $$0.b(kx.V, $$3.c());
      }

      return false;
   }

   @Nullable
   public dbe a(ex $$0, @Nullable cqi $$1) {
      if (this.o) {
         return null;
      } else {
         Builder<asf<wv>> $$2 = ImmutableList.builderWithExpectedSize(this.n.size());

         for (asf<wv> $$3 : this.n) {
            Optional<asf<wv>> $$4 = a($$0, $$1, $$3);
            if ($$4.isEmpty()) {
               return null;
            }

            $$2.add($$4.get());
         }

         return new dbe(this.k, this.l, this.m, $$2.build(), true);
      }
   }

   public dbe c() {
      return new dbe(this.k, this.l, this.m, this.n, true);
   }

   private static Optional<asf<wv>> a(ex $$0, @Nullable cqi $$1, asf<wv> $$2) {
      return $$2.b($$2x -> {
         try {
            wv $$3 = wy.a($$0, $$2x, $$1, 0);
            return a($$3, $$0.u()) ? Optional.empty() : Optional.of($$3);
         } catch (Exception var4) {
            return Optional.of($$2x);
         }
      });
   }

   private static boolean a(wv $$0, ju.a $$1) {
      DataResult<JsonElement> $$2 = wx.a.encodeStart($$1.a(JsonOps.INSTANCE), $$0);
      return $$2.isSuccess() && aza.a((JsonElement)$$2.getOrThrow(), 32767);
   }

   public List<wv> a(boolean $$0) {
      return Lists.transform(this.n, $$1 -> (wv)$$1.a($$0));
   }

   public dbe b(List<asf<wv>> $$0) {
      return new dbe(this.k, this.l, this.m, $$0, false);
   }

   @Override
   public void a(cxu.b $$0, Consumer<wv> $$1, czn $$2) {
      if (!bah.h(this.l)) {
         $$1.accept(wv.a("book.byAuthor", this.l).a(n.h));
      }

      $$1.accept(wv.c("book.generation." + this.m).a(n.h));
   }

   public asf<String> d() {
      return this.k;
   }

   public String e() {
      return this.l;
   }

   public int f() {
      return this.m;
   }

   @Override
   public List<asf<wv>> a() {
      return this.n;
   }

   public boolean g() {
      return this.o;
   }
}
