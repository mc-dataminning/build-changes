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

public class eum extends eug {
   public static final MapCodec<eum> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(eum.b.a.listOf().fieldOf("modifiers").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("replace", true).forGetter($$0x -> $$0x.c))
            )
            .apply($$0, eum::new)
   );
   private final List<eum.b> b;
   private final boolean c;

   eum(List<ewe> $$0, List<eum.b> $$1, boolean $$2) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public eui<eum> b() {
      return euj.o;
   }

   @Override
   public Set<evm<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cvl a(cvl $$0, est $$1) {
      if (this.c) {
         $$0.b(kr.n, this.a($$1, cyg.a));
      } else {
         $$0.a(kr.n, cyg.a, $$2 -> $$2.b().isEmpty() ? this.a($$1, $$0.h().j()) : this.a($$1, $$2));
      }

      return $$0;
   }

   private cyg a(est $$0, cyg $$1) {
      azk $$2 = $$0.b();

      for (eum.b $$3 : this.b) {
         bts $$4 = ad.a($$3.f, $$2);
         $$1 = $$1.a($$3.c, new bvk($$3.b, (double)$$3.e.b($$0), $$3.d), $$4);
      }

      return $$1;
   }

   public static eum.c a(alb $$0, jn<bvh> $$1, bvk.a $$2, exa $$3) {
      return new eum.c($$0, $$1, $$2, $$3);
   }

   public static eum.a c() {
      return new eum.a();
   }

   public static class a extends eug.a<eum.a> {
      private final boolean a;
      private final List<eum.b> b = Lists.newArrayList();

      public a(boolean $$0) {
         this.a = $$0;
      }

      public a() {
         this(false);
      }

      protected eum.a a() {
         return this;
      }

      public eum.a a(eum.c $$0) {
         this.b.add($$0.a());
         return this;
      }

      @Override
      public euh b() {
         return new eum(this.g(), this.b, this.a);
      }
   }

   static record b(alb b, jn<bvh> c, bvk.a d, exa e, List<bts> f) {
      private static final Codec<List<bts>> g = ayl.a(
         Codec.either(bts.l, bts.l.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((bts)$$0.getFirst()) : Either.right($$0))
      );
      public static final Codec<eum.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alb.a.fieldOf("id").forGetter(eum.b::a),
                  bvh.a.fieldOf("attribute").forGetter(eum.b::b),
                  bvk.a.f.fieldOf("operation").forGetter(eum.b::c),
                  exb.a.fieldOf("amount").forGetter(eum.b::d),
                  g.fieldOf("slot").forGetter(eum.b::e)
               )
               .apply($$0, eum.b::new)
      );

      public alb a() {
         return this.b;
      }

      public jn<bvh> b() {
         return this.c;
      }

      public bvk.a c() {
         return this.d;
      }

      public exa d() {
         return this.e;
      }

      public List<bts> e() {
         return this.f;
      }
   }

   public static class c {
      private final alb a;
      private final jn<bvh> b;
      private final bvk.a c;
      private final exa d;
      private final Set<bts> e = EnumSet.noneOf(bts.class);

      public c(alb $$0, jn<bvh> $$1, bvk.a $$2, exa $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public eum.c a(bts $$0) {
         this.e.add($$0);
         return this;
      }

      public eum.b a() {
         return new eum.b(this.a, this.b, this.c, this.d, List.copyOf(this.e));
      }
   }
}
