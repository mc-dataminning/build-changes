import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record cvj(aqv<String> k, String l, int m, List<aqv<ws>> n, boolean o) implements cun<ws, cvj> {
   public static final cvj a = new cvj(aqv.a(""), "", 0, List.of(), true);
   public static final int b = 32767;
   public static final int c = 100;
   public static final int d = 16;
   public static final int e = 32;
   public static final int f = 3;
   public static final int g = 2;
   private static final Codec<aqv<ws>> p = aqv.a(wu.a(32767));
   public static final Codec<List<aqv<ws>>> h = axe.a(p.listOf(), 100);
   public static final Codec<cvj> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aqv.a(axe.b(0, 32)).fieldOf("title").forGetter(cvj::d),
               Codec.STRING.fieldOf("author").forGetter(cvj::e),
               axe.a(axe.a(0, 3), "generation", Integer.valueOf(0)).forGetter(cvj::f),
               axe.a(h, "pages", List.of()).forGetter(cvj::a),
               axe.a(Codec.BOOL, "resolved", false).forGetter(cvj::g)
            )
            .apply($$0, cvj::new)
   );
   public static final yq<wd, cvj> j = yq.a(aqv.a(yo.b(32)), cvj::d, yo.k, cvj::e, yo.f, cvj::f, aqv.a(wu.b).a(yo.c(100)), cvj::a, yo.b, cvj::g, cvj::new);

   @Nullable
   public cvj b() {
      return this.m >= 2 ? null : new cvj(this.k, this.l, this.m + 1, this.n, this.o);
   }

   @Nullable
   public cvj a(ec $$0, @Nullable ckl $$1) {
      if (this.o) {
         return null;
      } else {
         Builder<aqv<ws>> $$2 = ImmutableList.builderWithExpectedSize(this.n.size());

         for (aqv<ws> $$3 : this.n) {
            Optional<aqv<ws>> $$4 = a($$0, $$1, $$3);
            if ($$4.isEmpty()) {
               return null;
            }

            $$2.add($$4.get());
         }

         return new cvj(this.k, this.l, this.m, $$2.build(), true);
      }
   }

   public cvj c() {
      return new cvj(this.k, this.l, this.m, this.n, true);
   }

   private static Optional<aqv<ws>> a(ec $$0, @Nullable ckl $$1, aqv<ws> $$2) {
      return $$2.b($$2x -> {
         try {
            ws $$3 = wv.a($$0, $$2x, $$1, 0);
            return a($$3, $$0.v()) ? Optional.empty() : Optional.of($$3);
         } catch (Exception var4) {
            return Optional.of($$2x);
         }
      });
   }

   private static boolean a(ws $$0, ix.a $$1) {
      return ws.a.a($$0, $$1).length() > 32767;
   }

   public List<ws> a(boolean $$0) {
      return Lists.transform(this.n, $$1 -> (ws)$$1.a($$0));
   }

   public cvj b(List<aqv<ws>> $$0) {
      return new cvj(this.k, this.l, this.m, $$0, false);
   }

   public aqv<String> d() {
      return this.k;
   }

   public String e() {
      return this.l;
   }

   public int f() {
      return this.m;
   }

   @Override
   public List<aqv<ws>> a() {
      return this.n;
   }

   public boolean g() {
      return this.o;
   }
}
