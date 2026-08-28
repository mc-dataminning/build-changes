import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record czu(ash<String> k, String l, int m, List<ash<xj>> n, boolean o) implements cyp<xj, czu> {
   public static final czu a = new czu(ash.a(""), "", 0, List.of(), true);
   public static final int b = 32767;
   public static final int c = 16;
   public static final int d = 32;
   public static final int e = 3;
   public static final int f = 2;
   public static final Codec<xj> g = xl.a(32767);
   public static final Codec<List<ash<xj>>> h = a(g);
   public static final Codec<czu> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ash.a(Codec.string(0, 32)).fieldOf("title").forGetter(czu::d),
               Codec.STRING.fieldOf("author").forGetter(czu::e),
               ayv.a(0, 3).optionalFieldOf("generation", 0).forGetter(czu::f),
               h.optionalFieldOf("pages", List.of()).forGetter(czu::a),
               Codec.BOOL.optionalFieldOf("resolved", false).forGetter(czu::g)
            )
            .apply($$0, czu::new)
   );
   public static final zh<wu, czu> j = zh.a(ash.a(zf.b(32)), czu::d, zf.n, czu::e, zf.h, czu::f, ash.a(xl.b).a(zf.a()), czu::a, zf.b, czu::g, czu::new);

   public czu(ash<String> k, String l, int m, List<ash<xj>> n, boolean o) {
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

   private static Codec<ash<xj>> b(Codec<xj> $$0) {
      return ash.a($$0);
   }

   public static Codec<List<ash<xj>>> a(Codec<xj> $$0) {
      return b($$0).listOf();
   }

   @Nullable
   public czu b() {
      return this.m >= 2 ? null : new czu(this.k, this.l, this.m + 1, this.n, this.o);
   }

   @Nullable
   public czu a(ew $$0, @Nullable cou $$1) {
      if (this.o) {
         return null;
      } else {
         Builder<ash<xj>> $$2 = ImmutableList.builderWithExpectedSize(this.n.size());

         for (ash<xj> $$3 : this.n) {
            Optional<ash<xj>> $$4 = a($$0, $$1, $$3);
            if ($$4.isEmpty()) {
               return null;
            }

            $$2.add($$4.get());
         }

         return new czu(this.k, this.l, this.m, $$2.build(), true);
      }
   }

   public czu c() {
      return new czu(this.k, this.l, this.m, this.n, true);
   }

   private static Optional<ash<xj>> a(ew $$0, @Nullable cou $$1, ash<xj> $$2) {
      return $$2.b($$2x -> {
         try {
            xj $$3 = xm.a($$0, $$2x, $$1, 0);
            return a($$3, $$0.v()) ? Optional.empty() : Optional.of($$3);
         } catch (Exception var4) {
            return Optional.of($$2x);
         }
      });
   }

   private static boolean a(xj $$0, js.a $$1) {
      return xj.a.a($$0, $$1).length() > 32767;
   }

   public List<xj> a(boolean $$0) {
      return Lists.transform(this.n, $$1 -> (xj)$$1.a($$0));
   }

   public czu b(List<ash<xj>> $$0) {
      return new czu(this.k, this.l, this.m, $$0, false);
   }

   public ash<String> d() {
      return this.k;
   }

   public String e() {
      return this.l;
   }

   public int f() {
      return this.m;
   }

   @Override
   public List<ash<xj>> a() {
      return this.n;
   }

   public boolean g() {
      return this.o;
   }
}
