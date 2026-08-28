import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record cya(arw<String> k, String l, int m, List<arw<xp>> n, boolean o) implements cxd<xp, cya> {
   public static final cya a = new cya(arw.a(""), "", 0, List.of(), true);
   public static final int b = 32767;
   public static final int c = 16;
   public static final int d = 32;
   public static final int e = 3;
   public static final int f = 2;
   public static final Codec<xp> g = xr.a(32767);
   public static final Codec<List<arw<xp>>> h = a(g);
   public static final Codec<cya> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arw.a(Codec.string(0, 32)).fieldOf("title").forGetter(cya::d),
               Codec.STRING.fieldOf("author").forGetter(cya::e),
               ayh.a(0, 3).optionalFieldOf("generation", 0).forGetter(cya::f),
               h.optionalFieldOf("pages", List.of()).forGetter(cya::a),
               Codec.BOOL.optionalFieldOf("resolved", false).forGetter(cya::g)
            )
            .apply($$0, cya::new)
   );
   public static final zn<xa, cya> j = zn.a(arw.a(zl.b(32)), cya::d, zl.l, cya::e, zl.g, cya::f, arw.a(xr.b).a(zl.a()), cya::a, zl.b, cya::g, cya::new);

   public cya(arw<String> k, String l, int m, List<arw<xp>> n, boolean o) {
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

   private static Codec<arw<xp>> b(Codec<xp> $$0) {
      return arw.a($$0);
   }

   public static Codec<List<arw<xp>>> a(Codec<xp> $$0) {
      return b($$0).listOf();
   }

   @Nullable
   public cya b() {
      return this.m >= 2 ? null : new cya(this.k, this.l, this.m + 1, this.n, this.o);
   }

   @Nullable
   public cya a(ep $$0, @Nullable cmz $$1) {
      if (this.o) {
         return null;
      } else {
         Builder<arw<xp>> $$2 = ImmutableList.builderWithExpectedSize(this.n.size());

         for (arw<xp> $$3 : this.n) {
            Optional<arw<xp>> $$4 = a($$0, $$1, $$3);
            if ($$4.isEmpty()) {
               return null;
            }

            $$2.add($$4.get());
         }

         return new cya(this.k, this.l, this.m, $$2.build(), true);
      }
   }

   public cya c() {
      return new cya(this.k, this.l, this.m, this.n, true);
   }

   private static Optional<arw<xp>> a(ep $$0, @Nullable cmz $$1, arw<xp> $$2) {
      return $$2.b($$2x -> {
         try {
            xp $$3 = xs.a($$0, $$2x, $$1, 0);
            return a($$3, $$0.v()) ? Optional.empty() : Optional.of($$3);
         } catch (Exception var4) {
            return Optional.of($$2x);
         }
      });
   }

   private static boolean a(xp $$0, jk.a $$1) {
      return xp.a.a($$0, $$1).length() > 32767;
   }

   public List<xp> a(boolean $$0) {
      return Lists.transform(this.n, $$1 -> (xp)$$1.a($$0));
   }

   public cya b(List<arw<xp>> $$0) {
      return new cya(this.k, this.l, this.m, $$0, false);
   }

   public arw<String> d() {
      return this.k;
   }

   public String e() {
      return this.l;
   }

   public int f() {
      return this.m;
   }

   @Override
   public List<arw<xp>> a() {
      return this.n;
   }

   public boolean g() {
      return this.o;
   }
}
