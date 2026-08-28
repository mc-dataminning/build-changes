import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record czy(arv<String> k, String l, int m, List<arv<wp>> n, boolean o) implements cyt<wp, czy> {
   public static final czy a = new czy(arv.a(""), "", 0, List.of(), true);
   public static final int b = 32767;
   public static final int c = 16;
   public static final int d = 32;
   public static final int e = 3;
   public static final int f = 2;
   public static final Codec<wp> g = wr.a(32767);
   public static final Codec<List<arv<wp>>> h = a(g);
   public static final Codec<czy> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arv.a(Codec.string(0, 32)).fieldOf("title").forGetter(czy::d),
               Codec.STRING.fieldOf("author").forGetter(czy::e),
               ayi.a(0, 3).optionalFieldOf("generation", 0).forGetter(czy::f),
               h.optionalFieldOf("pages", List.of()).forGetter(czy::a),
               Codec.BOOL.optionalFieldOf("resolved", false).forGetter(czy::g)
            )
            .apply($$0, czy::new)
   );
   public static final yn<wa, czy> j = yn.a(arv.a(yl.b(32)), czy::d, yl.o, czy::e, yl.h, czy::f, arv.a(wr.b).a(yl.a()), czy::a, yl.b, czy::g, czy::new);

   public czy(arv<String> k, String l, int m, List<arv<wp>> n, boolean o) {
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

   private static Codec<arv<wp>> b(Codec<wp> $$0) {
      return arv.a($$0);
   }

   public static Codec<List<arv<wp>>> a(Codec<wp> $$0) {
      return b($$0).listOf();
   }

   @Nullable
   public czy b() {
      return this.m >= 2 ? null : new czy(this.k, this.l, this.m + 1, this.n, this.o);
   }

   @Nullable
   public czy a(ex $$0, @Nullable coy $$1) {
      if (this.o) {
         return null;
      } else {
         Builder<arv<wp>> $$2 = ImmutableList.builderWithExpectedSize(this.n.size());

         for (arv<wp> $$3 : this.n) {
            Optional<arv<wp>> $$4 = a($$0, $$1, $$3);
            if ($$4.isEmpty()) {
               return null;
            }

            $$2.add($$4.get());
         }

         return new czy(this.k, this.l, this.m, $$2.build(), true);
      }
   }

   public czy c() {
      return new czy(this.k, this.l, this.m, this.n, true);
   }

   private static Optional<arv<wp>> a(ex $$0, @Nullable coy $$1, arv<wp> $$2) {
      return $$2.b($$2x -> {
         try {
            wp $$3 = ws.a($$0, $$2x, $$1, 0);
            return a($$3, $$0.u()) ? Optional.empty() : Optional.of($$3);
         } catch (Exception var4) {
            return Optional.of($$2x);
         }
      });
   }

   private static boolean a(wp $$0, jt.a $$1) {
      return wp.a.a($$0, $$1).length() > 32767;
   }

   public List<wp> a(boolean $$0) {
      return Lists.transform(this.n, $$1 -> (wp)$$1.a($$0));
   }

   public czy b(List<arv<wp>> $$0) {
      return new czy(this.k, this.l, this.m, $$0, false);
   }

   public arv<String> d() {
      return this.k;
   }

   public String e() {
      return this.l;
   }

   public int f() {
      return this.m;
   }

   @Override
   public List<arv<wp>> a() {
      return this.n;
   }

   public boolean g() {
      return this.o;
   }
}
