import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record cxi(arb<String> k, String l, int m, List<arb<wu>> n, boolean o) implements cwl<wu, cxi> {
   public static final cxi a = new cxi(arb.a(""), "", 0, List.of(), true);
   public static final int b = 32767;
   public static final int c = 16;
   public static final int d = 32;
   public static final int e = 3;
   public static final int f = 2;
   public static final Codec<wu> g = ww.a(32767);
   public static final Codec<List<arb<wu>>> h = a(g);
   public static final Codec<cxi> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arb.a(Codec.string(0, 32)).fieldOf("title").forGetter(cxi::d),
               Codec.STRING.fieldOf("author").forGetter(cxi::e),
               axm.a(0, 3).optionalFieldOf("generation", 0).forGetter(cxi::f),
               h.optionalFieldOf("pages", List.of()).forGetter(cxi::a),
               Codec.BOOL.optionalFieldOf("resolved", false).forGetter(cxi::g)
            )
            .apply($$0, cxi::new)
   );
   public static final ys<wf, cxi> j = ys.a(arb.a(yq.b(32)), cxi::d, yq.l, cxi::e, yq.g, cxi::f, arb.a(ww.b).a(yq.a()), cxi::a, yq.b, cxi::g, cxi::new);

   public cxi(arb<String> k, String l, int m, List<arb<wu>> n, boolean o) {
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

   private static Codec<arb<wu>> b(Codec<wu> $$0) {
      return arb.a($$0);
   }

   public static Codec<List<arb<wu>>> a(Codec<wu> $$0) {
      return b($$0).listOf();
   }

   @Nullable
   public cxi b() {
      return this.m >= 2 ? null : new cxi(this.k, this.l, this.m + 1, this.n, this.o);
   }

   @Nullable
   public cxi a(eq $$0, @Nullable cmh $$1) {
      if (this.o) {
         return null;
      } else {
         Builder<arb<wu>> $$2 = ImmutableList.builderWithExpectedSize(this.n.size());

         for (arb<wu> $$3 : this.n) {
            Optional<arb<wu>> $$4 = a($$0, $$1, $$3);
            if ($$4.isEmpty()) {
               return null;
            }

            $$2.add($$4.get());
         }

         return new cxi(this.k, this.l, this.m, $$2.build(), true);
      }
   }

   public cxi c() {
      return new cxi(this.k, this.l, this.m, this.n, true);
   }

   private static Optional<arb<wu>> a(eq $$0, @Nullable cmh $$1, arb<wu> $$2) {
      return $$2.b($$2x -> {
         try {
            wu $$3 = wx.a($$0, $$2x, $$1, 0);
            return a($$3, $$0.v()) ? Optional.empty() : Optional.of($$3);
         } catch (Exception var4) {
            return Optional.of($$2x);
         }
      });
   }

   private static boolean a(wu $$0, jl.a $$1) {
      return wu.a.a($$0, $$1).length() > 32767;
   }

   public List<wu> a(boolean $$0) {
      return Lists.transform(this.n, $$1 -> (wu)$$1.a($$0));
   }

   public cxi b(List<arb<wu>> $$0) {
      return new cxi(this.k, this.l, this.m, $$0, false);
   }

   public arb<String> d() {
      return this.k;
   }

   public String e() {
      return this.l;
   }

   public int f() {
      return this.m;
   }

   @Override
   public List<arb<wu>> a() {
      return this.n;
   }

   public boolean g() {
      return this.o;
   }
}
