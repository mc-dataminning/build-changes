import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record cwx(ard<String> l, String m, int n, List<ard<wx>> o, boolean p) implements cwa<wx, cwx> {
   public static final cwx a = new cwx(ard.a(""), "", 0, List.of(), true);
   public static final int b = 32767;
   public static final int c = 100;
   public static final int d = 16;
   public static final int e = 32;
   public static final int f = 3;
   public static final int g = 2;
   public static final Codec<wx> h = wz.a(32767);
   public static final Codec<List<ard<wx>>> i = a(h);
   public static final Codec<cwx> j = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ard.a(Codec.string(0, 32)).fieldOf("title").forGetter(cwx::d),
               Codec.STRING.fieldOf("author").forGetter(cwx::e),
               axm.a(0, 3).optionalFieldOf("generation", 0).forGetter(cwx::f),
               i.optionalFieldOf("pages", List.of()).forGetter(cwx::a),
               Codec.BOOL.optionalFieldOf("resolved", false).forGetter(cwx::g)
            )
            .apply($$0, cwx::new)
   );
   public static final yv<wi, cwx> k = yv.a(ard.a(yt.b(32)), cwx::d, yt.k, cwx::e, yt.f, cwx::f, ard.a(wz.b).a(yt.c(100)), cwx::a, yt.b, cwx::g, cwx::new);

   private static Codec<ard<wx>> b(Codec<wx> $$0) {
      return ard.a($$0);
   }

   public static Codec<List<ard<wx>>> a(Codec<wx> $$0) {
      return b($$0).sizeLimitedListOf(100);
   }

   @Nullable
   public cwx b() {
      return this.n >= 2 ? null : new cwx(this.l, this.m, this.n + 1, this.o, this.p);
   }

   @Nullable
   public cwx a(ee $$0, @Nullable clw $$1) {
      if (this.p) {
         return null;
      } else {
         Builder<ard<wx>> $$2 = ImmutableList.builderWithExpectedSize(this.o.size());

         for (ard<wx> $$3 : this.o) {
            Optional<ard<wx>> $$4 = a($$0, $$1, $$3);
            if ($$4.isEmpty()) {
               return null;
            }

            $$2.add($$4.get());
         }

         return new cwx(this.l, this.m, this.n, $$2.build(), true);
      }
   }

   public cwx c() {
      return new cwx(this.l, this.m, this.n, this.o, true);
   }

   private static Optional<ard<wx>> a(ee $$0, @Nullable clw $$1, ard<wx> $$2) {
      return $$2.b($$2x -> {
         try {
            wx $$3 = xa.a($$0, $$2x, $$1, 0);
            return a($$3, $$0.v()) ? Optional.empty() : Optional.of($$3);
         } catch (Exception var4) {
            return Optional.of($$2x);
         }
      });
   }

   private static boolean a(wx $$0, iz.a $$1) {
      return wx.a.a($$0, $$1).length() > 32767;
   }

   public List<wx> a(boolean $$0) {
      return Lists.transform(this.o, $$1 -> (wx)$$1.a($$0));
   }

   public cwx b(List<ard<wx>> $$0) {
      return new cwx(this.l, this.m, this.n, $$0, false);
   }

   public ard<String> d() {
      return this.l;
   }

   public String e() {
      return this.m;
   }

   public int f() {
      return this.n;
   }

   @Override
   public List<ard<wx>> a() {
      return this.o;
   }

   public boolean g() {
      return this.p;
   }
}
