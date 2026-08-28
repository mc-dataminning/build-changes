import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record czd(ase<String> k, String l, int m, List<ase<xh>> n, boolean o) implements cya<xh, czd> {
   public static final czd a = new czd(ase.a(""), "", 0, List.of(), true);
   public static final int b = 32767;
   public static final int c = 16;
   public static final int d = 32;
   public static final int e = 3;
   public static final int f = 2;
   public static final Codec<xh> g = xj.a(32767);
   public static final Codec<List<ase<xh>>> h = a(g);
   public static final Codec<czd> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ase.a(Codec.string(0, 32)).fieldOf("title").forGetter(czd::d),
               Codec.STRING.fieldOf("author").forGetter(czd::e),
               ays.a(0, 3).optionalFieldOf("generation", 0).forGetter(czd::f),
               h.optionalFieldOf("pages", List.of()).forGetter(czd::a),
               Codec.BOOL.optionalFieldOf("resolved", false).forGetter(czd::g)
            )
            .apply($$0, czd::new)
   );
   public static final zf<ws, czd> j = zf.a(ase.a(zd.b(32)), czd::d, zd.m, czd::e, zd.h, czd::f, ase.a(xj.b).a(zd.a()), czd::a, zd.b, czd::g, czd::new);

   public czd(ase<String> k, String l, int m, List<ase<xh>> n, boolean o) {
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

   private static Codec<ase<xh>> b(Codec<xh> $$0) {
      return ase.a($$0);
   }

   public static Codec<List<ase<xh>>> a(Codec<xh> $$0) {
      return b($$0).listOf();
   }

   @Nullable
   public czd b() {
      return this.m >= 2 ? null : new czd(this.k, this.l, this.m + 1, this.n, this.o);
   }

   @Nullable
   public czd a(ev $$0, @Nullable coh $$1) {
      if (this.o) {
         return null;
      } else {
         Builder<ase<xh>> $$2 = ImmutableList.builderWithExpectedSize(this.n.size());

         for (ase<xh> $$3 : this.n) {
            Optional<ase<xh>> $$4 = a($$0, $$1, $$3);
            if ($$4.isEmpty()) {
               return null;
            }

            $$2.add($$4.get());
         }

         return new czd(this.k, this.l, this.m, $$2.build(), true);
      }
   }

   public czd c() {
      return new czd(this.k, this.l, this.m, this.n, true);
   }

   private static Optional<ase<xh>> a(ev $$0, @Nullable coh $$1, ase<xh> $$2) {
      return $$2.b($$2x -> {
         try {
            xh $$3 = xk.a($$0, $$2x, $$1, 0);
            return a($$3, $$0.v()) ? Optional.empty() : Optional.of($$3);
         } catch (Exception var4) {
            return Optional.of($$2x);
         }
      });
   }

   private static boolean a(xh $$0, jr.a $$1) {
      return xh.a.a($$0, $$1).length() > 32767;
   }

   public List<xh> a(boolean $$0) {
      return Lists.transform(this.n, $$1 -> (xh)$$1.a($$0));
   }

   public czd b(List<ase<xh>> $$0) {
      return new czd(this.k, this.l, this.m, $$0, false);
   }

   public ase<String> d() {
      return this.k;
   }

   public String e() {
      return this.l;
   }

   public int f() {
      return this.m;
   }

   @Override
   public List<ase<xh>> a() {
      return this.n;
   }

   public boolean g() {
      return this.o;
   }
}
