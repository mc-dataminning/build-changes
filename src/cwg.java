import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record cwg(aqy<String> l, String m, int n, List<aqy<wu>> o, boolean p) implements cvj<wu, cwg> {
   public static final cwg a = new cwg(aqy.a(""), "", 0, List.of(), true);
   public static final int b = 32767;
   public static final int c = 100;
   public static final int d = 16;
   public static final int e = 32;
   public static final int f = 3;
   public static final int g = 2;
   public static final Codec<wu> h = ww.a(32767);
   public static final Codec<List<aqy<wu>>> i = a(h);
   public static final Codec<cwg> j = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aqy.a(axh.b(0, 32)).fieldOf("title").forGetter(cwg::d),
               Codec.STRING.fieldOf("author").forGetter(cwg::e),
               axh.a(axh.a(0, 3), "generation", Integer.valueOf(0)).forGetter(cwg::f),
               axh.a(i, "pages", List.of()).forGetter(cwg::a),
               axh.a(Codec.BOOL, "resolved", false).forGetter(cwg::g)
            )
            .apply($$0, cwg::new)
   );
   public static final ys<wf, cwg> k = ys.a(aqy.a(yq.b(32)), cwg::d, yq.k, cwg::e, yq.f, cwg::f, aqy.a(ww.b).a(yq.c(100)), cwg::a, yq.b, cwg::g, cwg::new);

   private static Codec<aqy<wu>> b(Codec<wu> $$0) {
      return aqy.a($$0);
   }

   public static Codec<List<aqy<wu>>> a(Codec<wu> $$0) {
      return axh.a(b($$0).listOf(), 100);
   }

   @Nullable
   public cwg b() {
      return this.n >= 2 ? null : new cwg(this.l, this.m, this.n + 1, this.o, this.p);
   }

   @Nullable
   public cwg a(ed $$0, @Nullable clh $$1) {
      if (this.p) {
         return null;
      } else {
         Builder<aqy<wu>> $$2 = ImmutableList.builderWithExpectedSize(this.o.size());

         for (aqy<wu> $$3 : this.o) {
            Optional<aqy<wu>> $$4 = a($$0, $$1, $$3);
            if ($$4.isEmpty()) {
               return null;
            }

            $$2.add($$4.get());
         }

         return new cwg(this.l, this.m, this.n, $$2.build(), true);
      }
   }

   public cwg c() {
      return new cwg(this.l, this.m, this.n, this.o, true);
   }

   private static Optional<aqy<wu>> a(ed $$0, @Nullable clh $$1, aqy<wu> $$2) {
      return $$2.b($$2x -> {
         try {
            wu $$3 = wx.a($$0, $$2x, $$1, 0);
            return a($$3, $$0.v()) ? Optional.empty() : Optional.of($$3);
         } catch (Exception var4) {
            return Optional.of($$2x);
         }
      });
   }

   private static boolean a(wu $$0, iy.a $$1) {
      return wu.a.a($$0, $$1).length() > 32767;
   }

   public List<wu> a(boolean $$0) {
      return Lists.transform(this.o, $$1 -> (wu)$$1.a($$0));
   }

   public cwg b(List<aqy<wu>> $$0) {
      return new cwg(this.l, this.m, this.n, $$0, false);
   }

   public aqy<String> d() {
      return this.l;
   }

   public String e() {
      return this.m;
   }

   public int f() {
      return this.n;
   }

   @Override
   public List<aqy<wu>> a() {
      return this.o;
   }

   public boolean g() {
      return this.p;
   }
}
