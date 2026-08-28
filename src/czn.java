import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record czn(asi<String> k, String l, int m, List<asi<xl>> n, boolean o) implements cyi<xl, czn> {
   public static final czn a = new czn(asi.a(""), "", 0, List.of(), true);
   public static final int b = 32767;
   public static final int c = 16;
   public static final int d = 32;
   public static final int e = 3;
   public static final int f = 2;
   public static final Codec<xl> g = xn.a(32767);
   public static final Codec<List<asi<xl>>> h = a(g);
   public static final Codec<czn> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asi.a(Codec.string(0, 32)).fieldOf("title").forGetter(czn::d),
               Codec.STRING.fieldOf("author").forGetter(czn::e),
               ayw.a(0, 3).optionalFieldOf("generation", 0).forGetter(czn::f),
               h.optionalFieldOf("pages", List.of()).forGetter(czn::a),
               Codec.BOOL.optionalFieldOf("resolved", false).forGetter(czn::g)
            )
            .apply($$0, czn::new)
   );
   public static final zj<ww, czn> j = zj.a(asi.a(zh.b(32)), czn::d, zh.m, czn::e, zh.h, czn::f, asi.a(xn.b).a(zh.a()), czn::a, zh.b, czn::g, czn::new);

   public czn(asi<String> k, String l, int m, List<asi<xl>> n, boolean o) {
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

   private static Codec<asi<xl>> b(Codec<xl> $$0) {
      return asi.a($$0);
   }

   public static Codec<List<asi<xl>>> a(Codec<xl> $$0) {
      return b($$0).listOf();
   }

   @Nullable
   public czn b() {
      return this.m >= 2 ? null : new czn(this.k, this.l, this.m + 1, this.n, this.o);
   }

   @Nullable
   public czn a(ew $$0, @Nullable cor $$1) {
      if (this.o) {
         return null;
      } else {
         Builder<asi<xl>> $$2 = ImmutableList.builderWithExpectedSize(this.n.size());

         for (asi<xl> $$3 : this.n) {
            Optional<asi<xl>> $$4 = a($$0, $$1, $$3);
            if ($$4.isEmpty()) {
               return null;
            }

            $$2.add($$4.get());
         }

         return new czn(this.k, this.l, this.m, $$2.build(), true);
      }
   }

   public czn c() {
      return new czn(this.k, this.l, this.m, this.n, true);
   }

   private static Optional<asi<xl>> a(ew $$0, @Nullable cor $$1, asi<xl> $$2) {
      return $$2.b($$2x -> {
         try {
            xl $$3 = xo.a($$0, $$2x, $$1, 0);
            return a($$3, $$0.v()) ? Optional.empty() : Optional.of($$3);
         } catch (Exception var4) {
            return Optional.of($$2x);
         }
      });
   }

   private static boolean a(xl $$0, js.a $$1) {
      return xl.a.a($$0, $$1).length() > 32767;
   }

   public List<xl> a(boolean $$0) {
      return Lists.transform(this.n, $$1 -> (xl)$$1.a($$0));
   }

   public czn b(List<asi<xl>> $$0) {
      return new czn(this.k, this.l, this.m, $$0, false);
   }

   public asi<String> d() {
      return this.k;
   }

   public String e() {
      return this.l;
   }

   public int f() {
      return this.m;
   }

   @Override
   public List<asi<xl>> a() {
      return this.n;
   }

   public boolean g() {
      return this.o;
   }
}
