import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record czj(asf<String> k, String l, int m, List<asf<xi>> n, boolean o) implements cye<xi, czj> {
   public static final czj a = new czj(asf.a(""), "", 0, List.of(), true);
   public static final int b = 32767;
   public static final int c = 16;
   public static final int d = 32;
   public static final int e = 3;
   public static final int f = 2;
   public static final Codec<xi> g = xk.a(32767);
   public static final Codec<List<asf<xi>>> h = a(g);
   public static final Codec<czj> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asf.a(Codec.string(0, 32)).fieldOf("title").forGetter(czj::d),
               Codec.STRING.fieldOf("author").forGetter(czj::e),
               ayt.a(0, 3).optionalFieldOf("generation", 0).forGetter(czj::f),
               h.optionalFieldOf("pages", List.of()).forGetter(czj::a),
               Codec.BOOL.optionalFieldOf("resolved", false).forGetter(czj::g)
            )
            .apply($$0, czj::new)
   );
   public static final zg<wt, czj> j = zg.a(asf.a(ze.b(32)), czj::d, ze.m, czj::e, ze.h, czj::f, asf.a(xk.b).a(ze.a()), czj::a, ze.b, czj::g, czj::new);

   public czj(asf<String> k, String l, int m, List<asf<xi>> n, boolean o) {
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

   private static Codec<asf<xi>> b(Codec<xi> $$0) {
      return asf.a($$0);
   }

   public static Codec<List<asf<xi>>> a(Codec<xi> $$0) {
      return b($$0).listOf();
   }

   @Nullable
   public czj b() {
      return this.m >= 2 ? null : new czj(this.k, this.l, this.m + 1, this.n, this.o);
   }

   @Nullable
   public czj a(ew $$0, @Nullable com $$1) {
      if (this.o) {
         return null;
      } else {
         Builder<asf<xi>> $$2 = ImmutableList.builderWithExpectedSize(this.n.size());

         for (asf<xi> $$3 : this.n) {
            Optional<asf<xi>> $$4 = a($$0, $$1, $$3);
            if ($$4.isEmpty()) {
               return null;
            }

            $$2.add($$4.get());
         }

         return new czj(this.k, this.l, this.m, $$2.build(), true);
      }
   }

   public czj c() {
      return new czj(this.k, this.l, this.m, this.n, true);
   }

   private static Optional<asf<xi>> a(ew $$0, @Nullable com $$1, asf<xi> $$2) {
      return $$2.b($$2x -> {
         try {
            xi $$3 = xl.a($$0, $$2x, $$1, 0);
            return a($$3, $$0.v()) ? Optional.empty() : Optional.of($$3);
         } catch (Exception var4) {
            return Optional.of($$2x);
         }
      });
   }

   private static boolean a(xi $$0, js.a $$1) {
      return xi.a.a($$0, $$1).length() > 32767;
   }

   public List<xi> a(boolean $$0) {
      return Lists.transform(this.n, $$1 -> (xi)$$1.a($$0));
   }

   public czj b(List<asf<xi>> $$0) {
      return new czj(this.k, this.l, this.m, $$0, false);
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
   public List<asf<xi>> a() {
      return this.n;
   }

   public boolean g() {
      return this.o;
   }
}
