import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record cxz(ark<String> k, String l, int m, List<ark<wy>> n, boolean o) implements cxc<wy, cxz> {
   public static final cxz a = new cxz(ark.a(""), "", 0, List.of(), true);
   public static final int b = 32767;
   public static final int c = 16;
   public static final int d = 32;
   public static final int e = 3;
   public static final int f = 2;
   public static final Codec<wy> g = xa.a(32767);
   public static final Codec<List<ark<wy>>> h = a(g);
   public static final Codec<cxz> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ark.a(Codec.string(0, 32)).fieldOf("title").forGetter(cxz::d),
               Codec.STRING.fieldOf("author").forGetter(cxz::e),
               axv.a(0, 3).optionalFieldOf("generation", 0).forGetter(cxz::f),
               h.optionalFieldOf("pages", List.of()).forGetter(cxz::a),
               Codec.BOOL.optionalFieldOf("resolved", false).forGetter(cxz::g)
            )
            .apply($$0, cxz::new)
   );
   public static final yw<wj, cxz> j = yw.a(ark.a(yu.b(32)), cxz::d, yu.l, cxz::e, yu.g, cxz::f, ark.a(xa.b).a(yu.a()), cxz::a, yu.b, cxz::g, cxz::new);

   public cxz(ark<String> k, String l, int m, List<ark<wy>> n, boolean o) {
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

   private static Codec<ark<wy>> b(Codec<wy> $$0) {
      return ark.a($$0);
   }

   public static Codec<List<ark<wy>>> a(Codec<wy> $$0) {
      return b($$0).listOf();
   }

   @Nullable
   public cxz b() {
      return this.m >= 2 ? null : new cxz(this.k, this.l, this.m + 1, this.n, this.o);
   }

   @Nullable
   public cxz a(et $$0, @Nullable cmv $$1) {
      if (this.o) {
         return null;
      } else {
         Builder<ark<wy>> $$2 = ImmutableList.builderWithExpectedSize(this.n.size());

         for (ark<wy> $$3 : this.n) {
            Optional<ark<wy>> $$4 = a($$0, $$1, $$3);
            if ($$4.isEmpty()) {
               return null;
            }

            $$2.add($$4.get());
         }

         return new cxz(this.k, this.l, this.m, $$2.build(), true);
      }
   }

   public cxz c() {
      return new cxz(this.k, this.l, this.m, this.n, true);
   }

   private static Optional<ark<wy>> a(et $$0, @Nullable cmv $$1, ark<wy> $$2) {
      return $$2.b($$2x -> {
         try {
            wy $$3 = xb.a($$0, $$2x, $$1, 0);
            return a($$3, $$0.v()) ? Optional.empty() : Optional.of($$3);
         } catch (Exception var4) {
            return Optional.of($$2x);
         }
      });
   }

   private static boolean a(wy $$0, jo.a $$1) {
      return wy.a.a($$0, $$1).length() > 32767;
   }

   public List<wy> a(boolean $$0) {
      return Lists.transform(this.n, $$1 -> (wy)$$1.a($$0));
   }

   public cxz b(List<ark<wy>> $$0) {
      return new cxz(this.k, this.l, this.m, $$0, false);
   }

   public ark<String> d() {
      return this.k;
   }

   public String e() {
      return this.l;
   }

   public int f() {
      return this.m;
   }

   @Override
   public List<ark<wy>> a() {
      return this.n;
   }

   public boolean g() {
      return this.o;
   }
}
