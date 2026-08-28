import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record dao(asp<String> k, String l, int m, List<asp<xk>> n, boolean o) implements czj<xk, dao> {
   public static final dao a = new dao(asp.a(""), "", 0, List.of(), true);
   public static final int b = 32767;
   public static final int c = 16;
   public static final int d = 32;
   public static final int e = 3;
   public static final int f = 2;
   public static final Codec<xk> g = xm.a(32767);
   public static final Codec<List<asp<xk>>> h = a(g);
   public static final Codec<dao> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asp.a(Codec.string(0, 32)).fieldOf("title").forGetter(dao::d),
               Codec.STRING.fieldOf("author").forGetter(dao::e),
               azd.a(0, 3).optionalFieldOf("generation", 0).forGetter(dao::f),
               h.optionalFieldOf("pages", List.of()).forGetter(dao::a),
               Codec.BOOL.optionalFieldOf("resolved", false).forGetter(dao::g)
            )
            .apply($$0, dao::new)
   );
   public static final zi<wv, dao> j = zi.a(asp.a(zg.b(32)), dao::d, zg.o, dao::e, zg.h, dao::f, asp.a(xm.b).a(zg.a()), dao::a, zg.b, dao::g, dao::new);

   public dao(asp<String> k, String l, int m, List<asp<xk>> n, boolean o) {
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

   private static Codec<asp<xk>> b(Codec<xk> $$0) {
      return asp.a($$0);
   }

   public static Codec<List<asp<xk>>> a(Codec<xk> $$0) {
      return b($$0).listOf();
   }

   @Nullable
   public dao b() {
      return this.m >= 2 ? null : new dao(this.k, this.l, this.m + 1, this.n, this.o);
   }

   @Nullable
   public dao a(ew $$0, @Nullable cpo $$1) {
      if (this.o) {
         return null;
      } else {
         Builder<asp<xk>> $$2 = ImmutableList.builderWithExpectedSize(this.n.size());

         for (asp<xk> $$3 : this.n) {
            Optional<asp<xk>> $$4 = a($$0, $$1, $$3);
            if ($$4.isEmpty()) {
               return null;
            }

            $$2.add($$4.get());
         }

         return new dao(this.k, this.l, this.m, $$2.build(), true);
      }
   }

   public dao c() {
      return new dao(this.k, this.l, this.m, this.n, true);
   }

   private static Optional<asp<xk>> a(ew $$0, @Nullable cpo $$1, asp<xk> $$2) {
      return $$2.b($$2x -> {
         try {
            xk $$3 = xn.a($$0, $$2x, $$1, 0);
            return a($$3, $$0.u()) ? Optional.empty() : Optional.of($$3);
         } catch (Exception var4) {
            return Optional.of($$2x);
         }
      });
   }

   private static boolean a(xk $$0, js.a $$1) {
      return xk.a.a($$0, $$1).length() > 32767;
   }

   public List<xk> a(boolean $$0) {
      return Lists.transform(this.n, $$1 -> (xk)$$1.a($$0));
   }

   public dao b(List<asp<xk>> $$0) {
      return new dao(this.k, this.l, this.m, $$0, false);
   }

   public asp<String> d() {
      return this.k;
   }

   public String e() {
      return this.l;
   }

   public int f() {
      return this.m;
   }

   @Override
   public List<asp<xk>> a() {
      return this.n;
   }

   public boolean g() {
      return this.o;
   }
}
