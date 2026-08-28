import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record das(asz<String> k, String l, int m, List<asz<xv>> n, boolean o) implements czn<xv, das> {
   public static final das a = new das(asz.a(""), "", 0, List.of(), true);
   public static final int b = 32767;
   public static final int c = 16;
   public static final int d = 32;
   public static final int e = 3;
   public static final int f = 2;
   public static final Codec<xv> g = xx.a(32767);
   public static final Codec<List<asz<xv>>> h = a(g);
   public static final Codec<das> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asz.a(Codec.string(0, 32)).fieldOf("title").forGetter(das::d),
               Codec.STRING.fieldOf("author").forGetter(das::e),
               azn.a(0, 3).optionalFieldOf("generation", 0).forGetter(das::f),
               h.optionalFieldOf("pages", List.of()).forGetter(das::a),
               Codec.BOOL.optionalFieldOf("resolved", false).forGetter(das::g)
            )
            .apply($$0, das::new)
   );
   public static final zt<xg, das> j = zt.a(asz.a(zr.b(32)), das::d, zr.o, das::e, zr.h, das::f, asz.a(xx.b).a(zr.a()), das::a, zr.b, das::g, das::new);

   public das(asz<String> k, String l, int m, List<asz<xv>> n, boolean o) {
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

   private static Codec<asz<xv>> b(Codec<xv> $$0) {
      return asz.a($$0);
   }

   public static Codec<List<asz<xv>>> a(Codec<xv> $$0) {
      return b($$0).listOf();
   }

   @Nullable
   public das b() {
      return this.m >= 2 ? null : new das(this.k, this.l, this.m + 1, this.n, this.o);
   }

   @Nullable
   public das a(ew $$0, @Nullable cps $$1) {
      if (this.o) {
         return null;
      } else {
         Builder<asz<xv>> $$2 = ImmutableList.builderWithExpectedSize(this.n.size());

         for (asz<xv> $$3 : this.n) {
            Optional<asz<xv>> $$4 = a($$0, $$1, $$3);
            if ($$4.isEmpty()) {
               return null;
            }

            $$2.add($$4.get());
         }

         return new das(this.k, this.l, this.m, $$2.build(), true);
      }
   }

   public das c() {
      return new das(this.k, this.l, this.m, this.n, true);
   }

   private static Optional<asz<xv>> a(ew $$0, @Nullable cps $$1, asz<xv> $$2) {
      return $$2.b($$2x -> {
         try {
            xv $$3 = xy.a($$0, $$2x, $$1, 0);
            return a($$3, $$0.u()) ? Optional.empty() : Optional.of($$3);
         } catch (Exception var4) {
            return Optional.of($$2x);
         }
      });
   }

   private static boolean a(xv $$0, js.a $$1) {
      return xv.a.a($$0, $$1).length() > 32767;
   }

   public List<xv> a(boolean $$0) {
      return Lists.transform(this.n, $$1 -> (xv)$$1.a($$0));
   }

   public das b(List<asz<xv>> $$0) {
      return new das(this.k, this.l, this.m, $$0, false);
   }

   public asz<String> d() {
      return this.k;
   }

   public String e() {
      return this.l;
   }

   public int f() {
      return this.m;
   }

   @Override
   public List<asz<xv>> a() {
      return this.n;
   }

   public boolean g() {
      return this.o;
   }
}
