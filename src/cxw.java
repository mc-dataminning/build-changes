import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record cxw(arv<String> k, String l, int m, List<arv<xo>> n, boolean o) implements cwz<xo, cxw> {
   public static final cxw a = new cxw(arv.a(""), "", 0, List.of(), true);
   public static final int b = 32767;
   public static final int c = 16;
   public static final int d = 32;
   public static final int e = 3;
   public static final int f = 2;
   public static final Codec<xo> g = xq.a(32767);
   public static final Codec<List<arv<xo>>> h = a(g);
   public static final Codec<cxw> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arv.a(Codec.string(0, 32)).fieldOf("title").forGetter(cxw::d),
               Codec.STRING.fieldOf("author").forGetter(cxw::e),
               ayf.a(0, 3).optionalFieldOf("generation", 0).forGetter(cxw::f),
               h.optionalFieldOf("pages", List.of()).forGetter(cxw::a),
               Codec.BOOL.optionalFieldOf("resolved", false).forGetter(cxw::g)
            )
            .apply($$0, cxw::new)
   );
   public static final zm<wz, cxw> j = zm.a(arv.a(zk.b(32)), cxw::d, zk.l, cxw::e, zk.g, cxw::f, arv.a(xq.b).a(zk.a()), cxw::a, zk.b, cxw::g, cxw::new);

   public cxw(arv<String> k, String l, int m, List<arv<xo>> n, boolean o) {
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
   public cxw b() {
      return this.m >= 2 ? null : new cxw(this.k, this.l, this.m + 1, this.n, this.o);
   }

   @Nullable
   public cxw a(ep $$0, @Nullable cmv $$1) {
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

         return new cxw(this.k, this.l, this.m, $$2.build(), true);
      }
   }

   public cxw c() {
      return new cxw(this.k, this.l, this.m, this.n, true);
   }

   private static Optional<arv<xo>> a(ep $$0, @Nullable cmv $$1, arv<xo> $$2) {
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

   public cxw b(List<arv<xo>> $$0) {
      return new cxw(this.k, this.l, this.m, $$0, false);
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
