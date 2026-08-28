import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record cyu(arx<String> k, String l, int m, List<arx<xd>> n, boolean o) implements cxx<xd, cyu> {
   public static final cyu a = new cyu(arx.a(""), "", 0, List.of(), true);
   public static final int b = 32767;
   public static final int c = 16;
   public static final int d = 32;
   public static final int e = 3;
   public static final int f = 2;
   public static final Codec<xd> g = xf.a(32767);
   public static final Codec<List<arx<xd>>> h = a(g);
   public static final Codec<cyu> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arx.a(Codec.string(0, 32)).fieldOf("title").forGetter(cyu::d),
               Codec.STRING.fieldOf("author").forGetter(cyu::e),
               ayl.a(0, 3).optionalFieldOf("generation", 0).forGetter(cyu::f),
               h.optionalFieldOf("pages", List.of()).forGetter(cyu::a),
               Codec.BOOL.optionalFieldOf("resolved", false).forGetter(cyu::g)
            )
            .apply($$0, cyu::new)
   );
   public static final zb<wo, cyu> j = zb.a(arx.a(yz.b(32)), cyu::d, yz.l, cyu::e, yz.g, cyu::f, arx.a(xf.b).a(yz.a()), cyu::a, yz.b, cyu::g, cyu::new);

   public cyu(arx<String> k, String l, int m, List<arx<xd>> n, boolean o) {
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

   private static Codec<arx<xd>> b(Codec<xd> $$0) {
      return arx.a($$0);
   }

   public static Codec<List<arx<xd>>> a(Codec<xd> $$0) {
      return b($$0).listOf();
   }

   @Nullable
   public cyu b() {
      return this.m >= 2 ? null : new cyu(this.k, this.l, this.m + 1, this.n, this.o);
   }

   @Nullable
   public cyu a(et $$0, @Nullable cnp $$1) {
      if (this.o) {
         return null;
      } else {
         Builder<arx<xd>> $$2 = ImmutableList.builderWithExpectedSize(this.n.size());

         for (arx<xd> $$3 : this.n) {
            Optional<arx<xd>> $$4 = a($$0, $$1, $$3);
            if ($$4.isEmpty()) {
               return null;
            }

            $$2.add($$4.get());
         }

         return new cyu(this.k, this.l, this.m, $$2.build(), true);
      }
   }

   public cyu c() {
      return new cyu(this.k, this.l, this.m, this.n, true);
   }

   private static Optional<arx<xd>> a(et $$0, @Nullable cnp $$1, arx<xd> $$2) {
      return $$2.b($$2x -> {
         try {
            xd $$3 = xg.a($$0, $$2x, $$1, 0);
            return a($$3, $$0.v()) ? Optional.empty() : Optional.of($$3);
         } catch (Exception var4) {
            return Optional.of($$2x);
         }
      });
   }

   private static boolean a(xd $$0, jp.a $$1) {
      return xd.a.a($$0, $$1).length() > 32767;
   }

   public List<xd> a(boolean $$0) {
      return Lists.transform(this.n, $$1 -> (xd)$$1.a($$0));
   }

   public cyu b(List<arx<xd>> $$0) {
      return new cyu(this.k, this.l, this.m, $$0, false);
   }

   public arx<String> d() {
      return this.k;
   }

   public String e() {
      return this.l;
   }

   public int f() {
      return this.m;
   }

   @Override
   public List<arx<xd>> a() {
      return this.n;
   }

   public boolean g() {
      return this.o;
   }
}
