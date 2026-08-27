import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record cwz(are<String> l, String m, int n, List<are<wx>> o, boolean p) implements cwc<wx, cwz> {
   public static final cwz a = new cwz(are.a(""), "", 0, List.of(), true);
   public static final int b = 32767;
   public static final int c = 100;
   public static final int d = 16;
   public static final int e = 32;
   public static final int f = 3;
   public static final int g = 2;
   public static final Codec<wx> h = wz.a(32767);
   public static final Codec<List<are<wx>>> i = a(h);
   public static final Codec<cwz> j = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               are.a(Codec.string(0, 32)).fieldOf("title").forGetter(cwz::d),
               Codec.STRING.fieldOf("author").forGetter(cwz::e),
               axn.a(0, 3).optionalFieldOf("generation", 0).forGetter(cwz::f),
               i.optionalFieldOf("pages", List.of()).forGetter(cwz::a),
               Codec.BOOL.optionalFieldOf("resolved", false).forGetter(cwz::g)
            )
            .apply($$0, cwz::new)
   );
   public static final yv<wi, cwz> k = yv.a(are.a(yt.b(32)), cwz::d, yt.k, cwz::e, yt.f, cwz::f, are.a(wz.b).a(yt.c(100)), cwz::a, yt.b, cwz::g, cwz::new);

   private static Codec<are<wx>> b(Codec<wx> $$0) {
      return are.a($$0);
   }

   public static Codec<List<are<wx>>> a(Codec<wx> $$0) {
      return b($$0).sizeLimitedListOf(100);
   }

   @Nullable
   public cwz b() {
      return this.n >= 2 ? null : new cwz(this.l, this.m, this.n + 1, this.o, this.p);
   }

   @Nullable
   public cwz a(ee $$0, @Nullable cly $$1) {
      if (this.p) {
         return null;
      } else {
         Builder<are<wx>> $$2 = ImmutableList.builderWithExpectedSize(this.o.size());

         for (are<wx> $$3 : this.o) {
            Optional<are<wx>> $$4 = a($$0, $$1, $$3);
            if ($$4.isEmpty()) {
               return null;
            }

            $$2.add($$4.get());
         }

         return new cwz(this.l, this.m, this.n, $$2.build(), true);
      }
   }

   public cwz c() {
      return new cwz(this.l, this.m, this.n, this.o, true);
   }

   private static Optional<are<wx>> a(ee $$0, @Nullable cly $$1, are<wx> $$2) {
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

   public cwz b(List<are<wx>> $$0) {
      return new cwz(this.l, this.m, this.n, $$0, false);
   }

   public are<String> d() {
      return this.l;
   }

   public String e() {
      return this.m;
   }

   public int f() {
      return this.n;
   }

   @Override
   public List<are<wx>> a() {
      return this.o;
   }

   public boolean g() {
      return this.p;
   }
}
