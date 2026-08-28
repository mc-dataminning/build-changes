import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record cxx(arv<String> k, String l, int m, List<arv<xo>> n, boolean o) implements cxa<xo, cxx> {
   public static final cxx a = new cxx(arv.a(""), "", 0, List.of(), true);
   public static final int b = 32767;
   public static final int c = 16;
   public static final int d = 32;
   public static final int e = 3;
   public static final int f = 2;
   public static final Codec<xo> g = xq.a(32767);
   public static final Codec<List<arv<xo>>> h = a(g);
   public static final Codec<cxx> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arv.a(Codec.string(0, 32)).fieldOf("title").forGetter(cxx::d),
               Codec.STRING.fieldOf("author").forGetter(cxx::e),
               ayg.a(0, 3).optionalFieldOf("generation", 0).forGetter(cxx::f),
               h.optionalFieldOf("pages", List.of()).forGetter(cxx::a),
               Codec.BOOL.optionalFieldOf("resolved", false).forGetter(cxx::g)
            )
            .apply($$0, cxx::new)
   );
   public static final zm<wz, cxx> j = zm.a(arv.a(zk.b(32)), cxx::d, zk.l, cxx::e, zk.g, cxx::f, arv.a(xq.b).a(zk.a()), cxx::a, zk.b, cxx::g, cxx::new);

   public cxx(arv<String> k, String l, int m, List<arv<xo>> n, boolean o) {
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

   private static Codec<arv<xo>> b(Codec<xo> $$0) {
      return arv.a($$0);
   }

   public static Codec<List<arv<xo>>> a(Codec<xo> $$0) {
      return b($$0).listOf();
   }

   @Nullable
   public cxx b() {
      return this.m >= 2 ? null : new cxx(this.k, this.l, this.m + 1, this.n, this.o);
   }

   @Nullable
   public cxx a(ep $$0, @Nullable cmw $$1) {
      if (this.o) {
         return null;
      } else {
         Builder<arv<xo>> $$2 = ImmutableList.builderWithExpectedSize(this.n.size());

         for (arv<xo> $$3 : this.n) {
            Optional<arv<xo>> $$4 = a($$0, $$1, $$3);
            if ($$4.isEmpty()) {
               return null;
            }

            $$2.add($$4.get());
         }

         return new cxx(this.k, this.l, this.m, $$2.build(), true);
      }
   }

   public cxx c() {
      return new cxx(this.k, this.l, this.m, this.n, true);
   }

   private static Optional<arv<xo>> a(ep $$0, @Nullable cmw $$1, arv<xo> $$2) {
      return $$2.b($$2x -> {
         try {
            xo $$3 = xr.a($$0, $$2x, $$1, 0);
            return a($$3, $$0.v()) ? Optional.empty() : Optional.of($$3);
         } catch (Exception var4) {
            return Optional.of($$2x);
         }
      });
   }

   private static boolean a(xo $$0, jk.a $$1) {
      return xo.a.a($$0, $$1).length() > 32767;
   }

   public List<xo> a(boolean $$0) {
      return Lists.transform(this.n, $$1 -> (xo)$$1.a($$0));
   }

   public cxx b(List<arv<xo>> $$0) {
      return new cxx(this.k, this.l, this.m, $$0, false);
   }

   public arv<String> d() {
      return this.k;
   }

   public String e() {
      return this.l;
   }

   public int f() {
      return this.m;
   }

   @Override
   public List<arv<xo>> a() {
      return this.n;
   }

   public boolean g() {
      return this.o;
   }
}
