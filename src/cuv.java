import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record cuv(aql<String> i, String j, int k, List<aql<wi>> l, boolean m) {
   public static final int a = 32767;
   public static final int b = 100;
   public static final int c = 16;
   public static final int d = 32;
   public static final int e = 3;
   public static final int f = 2;
   private static final Codec<aql<wi>> n = aql.a(wk.a(32767));
   private static final Codec<List<aql<wi>>> o = awu.a(n.listOf(), 100);
   public static final Codec<cuv> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aql.a(awu.b(0, 32)).fieldOf("title").forGetter(cuv::c),
               Codec.STRING.fieldOf("author").forGetter(cuv::d),
               awu.a(awu.a(0, 3), "generation", Integer.valueOf(0)).forGetter(cuv::e),
               awu.a(o, "pages", List.of()).forGetter(cuv::f),
               awu.a(Codec.BOOL, "resolved", false).forGetter(cuv::g)
            )
            .apply($$0, cuv::new)
   );
   public static final yg<vt, cuv> h = yg.a(aql.a(ye.b(32)), cuv::c, ye.k, cuv::d, ye.f, cuv::e, aql.a(wk.b).a(ye.c(100)), cuv::f, ye.b, cuv::g, cuv::new);

   @Nullable
   public cuv a() {
      return this.k >= 2 ? null : new cuv(this.i, this.j, this.k + 1, this.l, this.m);
   }

   @Nullable
   public cuv a(dv $$0, @Nullable cka $$1) {
      if (this.m) {
         return null;
      } else {
         Builder<aql<wi>> $$2 = ImmutableList.builderWithExpectedSize(this.l.size());

         for (aql<wi> $$3 : this.l) {
            Optional<aql<wi>> $$4 = a($$0, $$1, $$3);
            if ($$4.isEmpty()) {
               return null;
            }

            $$2.add($$4.get());
         }

         return new cuv(this.i, this.j, this.k, $$2.build(), true);
      }
   }

   public cuv b() {
      return new cuv(this.i, this.j, this.k, this.l, true);
   }

   private static Optional<aql<wi>> a(dv $$0, @Nullable cka $$1, aql<wi> $$2) {
      return $$2.b($$2x -> {
         try {
            wi $$3 = wl.a($$0, $$2x, $$1, 0);
            return a($$3, $$0.v()) ? Optional.empty() : Optional.of($$3);
         } catch (Exception var4) {
            return Optional.of($$2x);
         }
      });
   }

   private static boolean a(wi $$0, ip.a $$1) {
      return wi.a.a($$0, $$1).length() > 32767;
   }

   public List<wi> a(boolean $$0) {
      return Lists.transform(this.l, $$1 -> (wi)$$1.a($$0));
   }

   public aql<String> c() {
      return this.i;
   }

   public String d() {
      return this.j;
   }

   public int e() {
      return this.k;
   }

   public List<aql<wi>> f() {
      return this.l;
   }

   public boolean g() {
      return this.m;
   }
}
