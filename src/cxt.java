import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record cxt(ars<String> k, String l, int m, List<ars<xl>> n, boolean o) implements cww<xl, cxt> {
   public static final cxt a = new cxt(ars.a(""), "", 0, List.of(), true);
   public static final int b = 32767;
   public static final int c = 16;
   public static final int d = 32;
   public static final int e = 3;
   public static final int f = 2;
   public static final Codec<xl> g = xn.a(32767);
   public static final Codec<List<ars<xl>>> h = a(g);
   public static final Codec<cxt> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ars.a(Codec.string(0, 32)).fieldOf("title").forGetter(cxt::d),
               Codec.STRING.fieldOf("author").forGetter(cxt::e),
               ayc.a(0, 3).optionalFieldOf("generation", 0).forGetter(cxt::f),
               h.optionalFieldOf("pages", List.of()).forGetter(cxt::a),
               Codec.BOOL.optionalFieldOf("resolved", false).forGetter(cxt::g)
            )
            .apply($$0, cxt::new)
   );
   public static final zj<ww, cxt> j = zj.a(ars.a(zh.b(32)), cxt::d, zh.l, cxt::e, zh.g, cxt::f, ars.a(xn.b).a(zh.a()), cxt::a, zh.b, cxt::g, cxt::new);

   public cxt(ars<String> k, String l, int m, List<ars<xl>> n, boolean o) {
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

   private static Codec<ars<xl>> b(Codec<xl> $$0) {
      return ars.a($$0);
   }

   public static Codec<List<ars<xl>>> a(Codec<xl> $$0) {
      return b($$0).listOf();
   }

   @Nullable
   public cxt b() {
      return this.m >= 2 ? null : new cxt(this.k, this.l, this.m + 1, this.n, this.o);
   }

   @Nullable
   public cxt a(ep $$0, @Nullable cms $$1) {
      if (this.o) {
         return null;
      } else {
         Builder<ars<xl>> $$2 = ImmutableList.builderWithExpectedSize(this.n.size());

         for (ars<xl> $$3 : this.n) {
            Optional<ars<xl>> $$4 = a($$0, $$1, $$3);
            if ($$4.isEmpty()) {
               return null;
            }

            $$2.add($$4.get());
         }

         return new cxt(this.k, this.l, this.m, $$2.build(), true);
      }
   }

   public cxt c() {
      return new cxt(this.k, this.l, this.m, this.n, true);
   }

   private static Optional<ars<xl>> a(ep $$0, @Nullable cms $$1, ars<xl> $$2) {
      return $$2.b($$2x -> {
         try {
            xl $$3 = xo.a($$0, $$2x, $$1, 0);
            return a($$3, $$0.v()) ? Optional.empty() : Optional.of($$3);
         } catch (Exception var4) {
            return Optional.of($$2x);
         }
      });
   }

   private static boolean a(xl $$0, jk.a $$1) {
      return xl.a.a($$0, $$1).length() > 32767;
   }

   public List<xl> a(boolean $$0) {
      return Lists.transform(this.n, $$1 -> (xl)$$1.a($$0));
   }

   public cxt b(List<ars<xl>> $$0) {
      return new cxt(this.k, this.l, this.m, $$0, false);
   }

   public ars<String> d() {
      return this.k;
   }

   public String e() {
      return this.l;
   }

   public int f() {
      return this.m;
   }

   @Override
   public List<ars<xl>> a() {
      return this.n;
   }

   public boolean g() {
      return this.o;
   }
}
