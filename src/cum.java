import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record cum(aqj<String> i, String j, int k, List<aqj<wg>> l, boolean m) {
   public static final int a = 32767;
   public static final int b = 100;
   public static final int c = 16;
   public static final int d = 32;
   public static final int e = 3;
   public static final int f = 2;
   private static final Codec<aqj<wg>> n = aqj.a(wi.a(32767));
   private static final Codec<List<aqj<wg>>> o = aws.a(n.listOf(), 100);
   public static final Codec<cum> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aqj.a(aws.b(0, 32)).fieldOf("title").forGetter(cum::c),
               Codec.STRING.fieldOf("author").forGetter(cum::d),
               aws.a(aws.a(0, 3), "generation", Integer.valueOf(0)).forGetter(cum::e),
               aws.a(o, "pages", List.of()).forGetter(cum::f),
               aws.a(Codec.BOOL, "resolved", false).forGetter(cum::g)
            )
            .apply($$0, cum::new)
   );
   public static final ye<vr, cum> h = ye.a(aqj.a(yc.b(32)), cum::c, yc.k, cum::d, yc.f, cum::e, aqj.a(wi.b).a(yc.c(100)), cum::f, yc.b, cum::g, cum::new);

   @Nullable
   public cum a() {
      return this.k >= 2 ? null : new cum(this.i, this.j, this.k + 1, this.l, this.m);
   }

   @Nullable
   public cum a(du $$0, @Nullable cjt $$1) {
      if (this.m) {
         return null;
      } else {
         Builder<aqj<wg>> $$2 = ImmutableList.builderWithExpectedSize(this.l.size());

         for (aqj<wg> $$3 : this.l) {
            Optional<aqj<wg>> $$4 = a($$0, $$1, $$3);
            if ($$4.isEmpty()) {
               return null;
            }

            $$2.add($$4.get());
         }

         return new cum(this.i, this.j, this.k, $$2.build(), true);
      }
   }

   public cum b() {
      return new cum(this.i, this.j, this.k, this.l, true);
   }

   private static Optional<aqj<wg>> a(du $$0, @Nullable cjt $$1, aqj<wg> $$2) {
      return $$2.b($$2x -> {
         try {
            wg $$3 = wj.a($$0, $$2x, $$1, 0);
            return a($$3, $$0.v()) ? Optional.empty() : Optional.of($$3);
         } catch (Exception var4) {
            return Optional.of($$2x);
         }
      });
   }

   private static boolean a(wg $$0, in.a $$1) {
      return wg.a.a($$0, $$1).length() > 32767;
   }

   public List<wg> a(boolean $$0) {
      return Lists.transform(this.l, $$1 -> (wg)$$1.a($$0));
   }

   public aqj<String> c() {
      return this.i;
   }

   public String d() {
      return this.j;
   }

   public int e() {
      return this.k;
   }

   public List<aqj<wg>> f() {
      return this.l;
   }

   public boolean g() {
      return this.m;
   }
}
