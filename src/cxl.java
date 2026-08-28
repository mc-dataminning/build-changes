import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record cxl(ard<String> k, String l, int m, List<ard<wu>> n, boolean o) implements cwo<wu, cxl> {
   public static final cxl a = new cxl(ard.a(""), "", 0, List.of(), true);
   public static final int b = 32767;
   public static final int c = 16;
   public static final int d = 32;
   public static final int e = 3;
   public static final int f = 2;
   public static final Codec<wu> g = ww.a(32767);
   public static final Codec<List<ard<wu>>> h = a(g);
   public static final Codec<cxl> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ard.a(Codec.string(0, 32)).fieldOf("title").forGetter(cxl::d),
               Codec.STRING.fieldOf("author").forGetter(cxl::e),
               axo.a(0, 3).optionalFieldOf("generation", 0).forGetter(cxl::f),
               h.optionalFieldOf("pages", List.of()).forGetter(cxl::a),
               Codec.BOOL.optionalFieldOf("resolved", false).forGetter(cxl::g)
            )
            .apply($$0, cxl::new)
   );
   public static final ys<wf, cxl> j = ys.a(ard.a(yq.b(32)), cxl::d, yq.l, cxl::e, yq.g, cxl::f, ard.a(ww.b).a(yq.a()), cxl::a, yq.b, cxl::g, cxl::new);

   public cxl(ard<String> k, String l, int m, List<ard<wu>> n, boolean o) {
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

   private static Codec<ard<wu>> b(Codec<wu> $$0) {
      return ard.a($$0);
   }

   public static Codec<List<ard<wu>>> a(Codec<wu> $$0) {
      return b($$0).listOf();
   }

   @Nullable
   public cxl b() {
      return this.m >= 2 ? null : new cxl(this.k, this.l, this.m + 1, this.n, this.o);
   }

   @Nullable
   public cxl a(eq $$0, @Nullable cml $$1) {
      if (this.o) {
         return null;
      } else {
         Builder<ard<wu>> $$2 = ImmutableList.builderWithExpectedSize(this.n.size());

         for (ard<wu> $$3 : this.n) {
            Optional<ard<wu>> $$4 = a($$0, $$1, $$3);
            if ($$4.isEmpty()) {
               return null;
            }

            $$2.add($$4.get());
         }

         return new cxl(this.k, this.l, this.m, $$2.build(), true);
      }
   }

   public cxl c() {
      return new cxl(this.k, this.l, this.m, this.n, true);
   }

   private static Optional<ard<wu>> a(eq $$0, @Nullable cml $$1, ard<wu> $$2) {
      return $$2.b($$2x -> {
         try {
            wu $$3 = wx.a($$0, $$2x, $$1, 0);
            return a($$3, $$0.v()) ? Optional.empty() : Optional.of($$3);
         } catch (Exception var4) {
            return Optional.of($$2x);
         }
      });
   }

   private static boolean a(wu $$0, jl.a $$1) {
      return wu.a.a($$0, $$1).length() > 32767;
   }

   public List<wu> a(boolean $$0) {
      return Lists.transform(this.n, $$1 -> (wu)$$1.a($$0));
   }

   public cxl b(List<ard<wu>> $$0) {
      return new cxl(this.k, this.l, this.m, $$0, false);
   }

   public ard<String> d() {
      return this.k;
   }

   public String e() {
      return this.l;
   }

   public int f() {
      return this.m;
   }

   @Override
   public List<ard<wu>> a() {
      return this.n;
   }

   public boolean g() {
      return this.o;
   }
}
