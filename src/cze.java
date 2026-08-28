import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record cze(asa<String> k, String l, int m, List<asa<xe>> n, boolean o) implements cyb<xe, cze> {
   public static final cze a = new cze(asa.a(""), "", 0, List.of(), true);
   public static final int b = 32767;
   public static final int c = 16;
   public static final int d = 32;
   public static final int e = 3;
   public static final int f = 2;
   public static final Codec<xe> g = xg.a(32767);
   public static final Codec<List<asa<xe>>> h = a(g);
   public static final Codec<cze> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asa.a(Codec.string(0, 32)).fieldOf("title").forGetter(cze::d),
               Codec.STRING.fieldOf("author").forGetter(cze::e),
               ayo.a(0, 3).optionalFieldOf("generation", 0).forGetter(cze::f),
               h.optionalFieldOf("pages", List.of()).forGetter(cze::a),
               Codec.BOOL.optionalFieldOf("resolved", false).forGetter(cze::g)
            )
            .apply($$0, cze::new)
   );
   public static final zc<wp, cze> j = zc.a(asa.a(za.b(32)), cze::d, za.m, cze::e, za.h, cze::f, asa.a(xg.b).a(za.a()), cze::a, za.b, cze::g, cze::new);

   public cze(asa<String> k, String l, int m, List<asa<xe>> n, boolean o) {
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

   private static Codec<asa<xe>> b(Codec<xe> $$0) {
      return asa.a($$0);
   }

   public static Codec<List<asa<xe>>> a(Codec<xe> $$0) {
      return b($$0).listOf();
   }

   @Nullable
   public cze b() {
      return this.m >= 2 ? null : new cze(this.k, this.l, this.m + 1, this.n, this.o);
   }

   @Nullable
   public cze a(eu $$0, @Nullable cnx $$1) {
      if (this.o) {
         return null;
      } else {
         Builder<asa<xe>> $$2 = ImmutableList.builderWithExpectedSize(this.n.size());

         for (asa<xe> $$3 : this.n) {
            Optional<asa<xe>> $$4 = a($$0, $$1, $$3);
            if ($$4.isEmpty()) {
               return null;
            }

            $$2.add($$4.get());
         }

         return new cze(this.k, this.l, this.m, $$2.build(), true);
      }
   }

   public cze c() {
      return new cze(this.k, this.l, this.m, this.n, true);
   }

   private static Optional<asa<xe>> a(eu $$0, @Nullable cnx $$1, asa<xe> $$2) {
      return $$2.b($$2x -> {
         try {
            xe $$3 = xh.a($$0, $$2x, $$1, 0);
            return a($$3, $$0.v()) ? Optional.empty() : Optional.of($$3);
         } catch (Exception var4) {
            return Optional.of($$2x);
         }
      });
   }

   private static boolean a(xe $$0, jq.a $$1) {
      return xe.a.a($$0, $$1).length() > 32767;
   }

   public List<xe> a(boolean $$0) {
      return Lists.transform(this.n, $$1 -> (xe)$$1.a($$0));
   }

   public cze b(List<asa<xe>> $$0) {
      return new cze(this.k, this.l, this.m, $$0, false);
   }

   public asa<String> d() {
      return this.k;
   }

   public String e() {
      return this.l;
   }

   public int f() {
      return this.m;
   }

   @Override
   public List<asa<xe>> a() {
      return this.n;
   }

   public boolean g() {
      return this.o;
   }
}
