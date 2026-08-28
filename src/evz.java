import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class evz extends evt {
   public static final MapCodec<evz> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(evz.b.a.listOf().fieldOf("modifiers").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("replace", true).forGetter($$0x -> $$0x.c))
            )
            .apply($$0, evz::new)
   );
   private final List<evz.b> b;
   private final boolean c;

   evz(List<exr> $$0, List<evz.b> $$1, boolean $$2) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public evv<evz> b() {
      return evw.o;
   }

   @Override
   public Set<ewz<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cwf a(cwf $$0, eug $$1) {
      if (this.c) {
         $$0.b(ku.o, this.a($$1, cyw.a));
      } else {
         $$0.a(ku.o, cyw.a, $$1x -> this.a($$1, $$1x));
      }

      return $$0;
   }

   private cyw a(eug $$0, cyw $$1) {
      azv $$2 = $$0.b();

      for (evz.b $$3 : this.b) {
         bur $$4 = ae.a($$3.f, $$2);
         $$1 = $$1.a($$3.c, new bwk($$3.b, (double)$$3.e.b($$0), $$3.d), $$4);
      }

      return $$1;
   }

   public static evz.c a(all $$0, jq<bwh> $$1, bwk.a $$2, eyn $$3) {
      return new evz.c($$0, $$1, $$2, $$3);
   }

   public static evz.a c() {
      return new evz.a();
   }

   public static class a extends evt.a<evz.a> {
      private final boolean a;
      private final List<evz.b> b = Lists.newArrayList();

      public a(boolean $$0) {
         this.a = $$0;
      }

      public a() {
         this(false);
      }

      protected evz.a a() {
         return this;
      }

      public evz.a a(evz.c $$0) {
         this.b.add($$0.a());
         return this;
      }

      @Override
      public evu b() {
         return new evz(this.g(), this.b, this.a);
      }
   }

   static record b(all b, jq<bwh> c, bwk.a d, eyn e, List<bur> f) {
      private static final Codec<List<bur>> g = ayw.a(
         Codec.either(bur.l, bur.l.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((bur)$$0.getFirst()) : Either.right($$0))
      );
      public static final Codec<evz.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  all.a.fieldOf("id").forGetter(evz.b::a),
                  bwh.a.fieldOf("attribute").forGetter(evz.b::b),
                  bwk.a.f.fieldOf("operation").forGetter(evz.b::c),
                  eyo.a.fieldOf("amount").forGetter(evz.b::d),
                  g.fieldOf("slot").forGetter(evz.b::e)
               )
               .apply($$0, evz.b::new)
      );

      public all a() {
         return this.b;
      }

      public jq<bwh> b() {
         return this.c;
      }

      public bwk.a c() {
         return this.d;
      }

      public eyn d() {
         return this.e;
      }

      public List<bur> e() {
         return this.f;
      }
   }

   public static class c {
      private final all a;
      private final jq<bwh> b;
      private final bwk.a c;
      private final eyn d;
      private final Set<bur> e = EnumSet.noneOf(bur.class);

      public c(all $$0, jq<bwh> $$1, bwk.a $$2, eyn $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public evz.c a(bur $$0) {
         this.e.add($$0);
         return this;
      }

      public evz.b a() {
         return new evz.b(this.a, this.b, this.c, this.d, List.copyOf(this.e));
      }
   }
}
