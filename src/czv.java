import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record czv(aru<String> k, String l, int m, List<aru<wo>> n, boolean o) implements cyq<wo, czv> {
   public static final czv a = new czv(aru.a(""), "", 0, List.of(), true);
   public static final int b = 32767;
   public static final int c = 16;
   public static final int d = 32;
   public static final int e = 3;
   public static final int f = 2;
   public static final Codec<wo> g = wq.a(32767);
   public static final Codec<List<aru<wo>>> h = a(g);
   public static final Codec<czv> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aru.a(Codec.string(0, 32)).fieldOf("title").forGetter(czv::d),
               Codec.STRING.fieldOf("author").forGetter(czv::e),
               ayh.a(0, 3).optionalFieldOf("generation", 0).forGetter(czv::f),
               h.optionalFieldOf("pages", List.of()).forGetter(czv::a),
               Codec.BOOL.optionalFieldOf("resolved", false).forGetter(czv::g)
            )
            .apply($$0, czv::new)
   );
   public static final ym<vz, czv> j = ym.a(aru.a(yk.b(32)), czv::d, yk.o, czv::e, yk.h, czv::f, aru.a(wq.b).a(yk.a()), czv::a, yk.b, czv::g, czv::new);

   public czv(aru<String> k, String l, int m, List<aru<wo>> n, boolean o) {
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

   private static Codec<aru<wo>> b(Codec<wo> $$0) {
      return aru.a($$0);
   }

   public static Codec<List<aru<wo>>> a(Codec<wo> $$0) {
      return b($$0).listOf();
   }

   @Nullable
   public czv b() {
      return this.m >= 2 ? null : new czv(this.k, this.l, this.m + 1, this.n, this.o);
   }

   @Nullable
   public czv a(ex $$0, @Nullable cov $$1) {
      if (this.o) {
         return null;
      } else {
         Builder<aru<wo>> $$2 = ImmutableList.builderWithExpectedSize(this.n.size());

         for (aru<wo> $$3 : this.n) {
            Optional<aru<wo>> $$4 = a($$0, $$1, $$3);
            if ($$4.isEmpty()) {
               return null;
            }

            $$2.add($$4.get());
         }

         return new czv(this.k, this.l, this.m, $$2.build(), true);
      }
   }

   public czv c() {
      return new czv(this.k, this.l, this.m, this.n, true);
   }

   private static Optional<aru<wo>> a(ex $$0, @Nullable cov $$1, aru<wo> $$2) {
      return $$2.b($$2x -> {
         try {
            wo $$3 = wr.a($$0, $$2x, $$1, 0);
            return a($$3, $$0.u()) ? Optional.empty() : Optional.of($$3);
         } catch (Exception var4) {
            return Optional.of($$2x);
         }
      });
   }

   private static boolean a(wo $$0, jt.a $$1) {
      return wo.a.a($$0, $$1).length() > 32767;
   }

   public List<wo> a(boolean $$0) {
      return Lists.transform(this.n, $$1 -> (wo)$$1.a($$0));
   }

   public czv b(List<aru<wo>> $$0) {
      return new czv(this.k, this.l, this.m, $$0, false);
   }

   public aru<String> d() {
      return this.k;
   }

   public String e() {
      return this.l;
   }

   public int f() {
      return this.m;
   }

   @Override
   public List<aru<wo>> a() {
      return this.n;
   }

   public boolean g() {
      return this.o;
   }
}
