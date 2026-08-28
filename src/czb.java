import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record czb(ary<String> k, String l, int m, List<ary<xd>> n, boolean o) implements cxy<xd, czb> {
   public static final czb a = new czb(ary.a(""), "", 0, List.of(), true);
   public static final int b = 32767;
   public static final int c = 16;
   public static final int d = 32;
   public static final int e = 3;
   public static final int f = 2;
   public static final Codec<xd> g = xf.a(32767);
   public static final Codec<List<ary<xd>>> h = a(g);
   public static final Codec<czb> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ary.a(Codec.string(0, 32)).fieldOf("title").forGetter(czb::d),
               Codec.STRING.fieldOf("author").forGetter(czb::e),
               aym.a(0, 3).optionalFieldOf("generation", 0).forGetter(czb::f),
               h.optionalFieldOf("pages", List.of()).forGetter(czb::a),
               Codec.BOOL.optionalFieldOf("resolved", false).forGetter(czb::g)
            )
            .apply($$0, czb::new)
   );
   public static final zb<wo, czb> j = zb.a(ary.a(yz.b(32)), czb::d, yz.l, czb::e, yz.g, czb::f, ary.a(xf.b).a(yz.a()), czb::a, yz.b, czb::g, czb::new);

   public czb(ary<String> k, String l, int m, List<ary<xd>> n, boolean o) {
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

   private static Codec<ary<xd>> b(Codec<xd> $$0) {
      return ary.a($$0);
   }

   public static Codec<List<ary<xd>>> a(Codec<xd> $$0) {
      return b($$0).listOf();
   }

   @Nullable
   public czb b() {
      return this.m >= 2 ? null : new czb(this.k, this.l, this.m + 1, this.n, this.o);
   }

   @Nullable
   public czb a(et $$0, @Nullable cnu $$1) {
      if (this.o) {
         return null;
      } else {
         Builder<ary<xd>> $$2 = ImmutableList.builderWithExpectedSize(this.n.size());

         for (ary<xd> $$3 : this.n) {
            Optional<ary<xd>> $$4 = a($$0, $$1, $$3);
            if ($$4.isEmpty()) {
               return null;
            }

            $$2.add($$4.get());
         }

         return new czb(this.k, this.l, this.m, $$2.build(), true);
      }
   }

   public czb c() {
      return new czb(this.k, this.l, this.m, this.n, true);
   }

   private static Optional<ary<xd>> a(et $$0, @Nullable cnu $$1, ary<xd> $$2) {
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

   public czb b(List<ary<xd>> $$0) {
      return new czb(this.k, this.l, this.m, $$0, false);
   }

   public ary<String> d() {
      return this.k;
   }

   public String e() {
      return this.l;
   }

   public int f() {
      return this.m;
   }

   @Override
   public List<ary<xd>> a() {
      return this.n;
   }

   public boolean g() {
      return this.o;
   }
}
