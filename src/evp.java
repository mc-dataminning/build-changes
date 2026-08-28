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

public class evp extends evj {
   public static final MapCodec<evp> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(evp.b.a.listOf().fieldOf("modifiers").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("replace", true).forGetter($$0x -> $$0x.c))
            )
            .apply($$0, evp::new)
   );
   private final List<evp.b> b;
   private final boolean c;

   evp(List<exh> $$0, List<evp.b> $$1, boolean $$2) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public evl<evp> b() {
      return evm.o;
   }

   @Override
   public Set<ewp<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cvx a(cvx $$0, etw $$1) {
      if (this.c) {
         $$0.b(kt.o, this.a($$1, cym.a));
      } else {
         $$0.a(kt.o, cym.a, $$1x -> this.a($$1, $$1x));
      }

      return $$0;
   }

   private cym a(etw $$0, cym $$1) {
      azr $$2 = $$0.b();

      for (evp.b $$3 : this.b) {
         bui $$4 = ad.a($$3.f, $$2);
         $$1 = $$1.a($$3.c, new bwb($$3.b, (double)$$3.e.b($$0), $$3.d), $$4);
      }

      return $$1;
   }

   public static evp.c a(alh $$0, jp<bvy> $$1, bwb.a $$2, eyd $$3) {
      return new evp.c($$0, $$1, $$2, $$3);
   }

   public static evp.a c() {
      return new evp.a();
   }

   public static class a extends evj.a<evp.a> {
      private final boolean a;
      private final List<evp.b> b = Lists.newArrayList();

      public a(boolean $$0) {
         this.a = $$0;
      }

      public a() {
         this(false);
      }

      protected evp.a a() {
         return this;
      }

      public evp.a a(evp.c $$0) {
         this.b.add($$0.a());
         return this;
      }

      @Override
      public evk b() {
         return new evp(this.g(), this.b, this.a);
      }
   }

   static record b(alh b, jp<bvy> c, bwb.a d, eyd e, List<bui> f) {
      private static final Codec<List<bui>> g = ays.a(
         Codec.either(bui.l, bui.l.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((bui)$$0.getFirst()) : Either.right($$0))
      );
      public static final Codec<evp.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alh.a.fieldOf("id").forGetter(evp.b::a),
                  bvy.a.fieldOf("attribute").forGetter(evp.b::b),
                  bwb.a.f.fieldOf("operation").forGetter(evp.b::c),
                  eye.a.fieldOf("amount").forGetter(evp.b::d),
                  g.fieldOf("slot").forGetter(evp.b::e)
               )
               .apply($$0, evp.b::new)
      );

      public alh a() {
         return this.b;
      }

      public jp<bvy> b() {
         return this.c;
      }

      public bwb.a c() {
         return this.d;
      }

      public eyd d() {
         return this.e;
      }

      public List<bui> e() {
         return this.f;
      }
   }

   public static class c {
      private final alh a;
      private final jp<bvy> b;
      private final bwb.a c;
      private final eyd d;
      private final Set<bui> e = EnumSet.noneOf(bui.class);

      public c(alh $$0, jp<bvy> $$1, bwb.a $$2, eyd $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public evp.c a(bui $$0) {
         this.e.add($$0);
         return this;
      }

      public evp.b a() {
         return new evp.b(this.a, this.b, this.c, this.d, List.copyOf(this.e));
      }
   }
}
