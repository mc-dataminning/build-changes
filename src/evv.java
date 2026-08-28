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

public class evv extends evp {
   public static final MapCodec<evv> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(evv.b.a.listOf().fieldOf("modifiers").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("replace", true).forGetter($$0x -> $$0x.c))
            )
            .apply($$0, evv::new)
   );
   private final List<evv.b> b;
   private final boolean c;

   evv(List<exn> $$0, List<evv.b> $$1, boolean $$2) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public evr<evv> b() {
      return evs.o;
   }

   @Override
   public Set<ewv<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cwb a(cwb $$0, euc $$1) {
      if (this.c) {
         $$0.b(ku.o, this.a($$1, cys.a));
      } else {
         $$0.a(ku.o, cys.a, $$1x -> this.a($$1, $$1x));
      }

      return $$0;
   }

   private cys a(euc $$0, cys $$1) {
      azs $$2 = $$0.b();

      for (evv.b $$3 : this.b) {
         bun $$4 = ae.a($$3.f, $$2);
         $$1 = $$1.a($$3.c, new bwg($$3.b, (double)$$3.e.b($$0), $$3.d), $$4);
      }

      return $$1;
   }

   public static evv.c a(ali $$0, jq<bwd> $$1, bwg.a $$2, eyj $$3) {
      return new evv.c($$0, $$1, $$2, $$3);
   }

   public static evv.a c() {
      return new evv.a();
   }

   public static class a extends evp.a<evv.a> {
      private final boolean a;
      private final List<evv.b> b = Lists.newArrayList();

      public a(boolean $$0) {
         this.a = $$0;
      }

      public a() {
         this(false);
      }

      protected evv.a a() {
         return this;
      }

      public evv.a a(evv.c $$0) {
         this.b.add($$0.a());
         return this;
      }

      @Override
      public evq b() {
         return new evv(this.g(), this.b, this.a);
      }
   }

   static record b(ali b, jq<bwd> c, bwg.a d, eyj e, List<bun> f) {
      private static final Codec<List<bun>> g = ayt.a(
         Codec.either(bun.l, bun.l.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((bun)$$0.getFirst()) : Either.right($$0))
      );
      public static final Codec<evv.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ali.a.fieldOf("id").forGetter(evv.b::a),
                  bwd.a.fieldOf("attribute").forGetter(evv.b::b),
                  bwg.a.f.fieldOf("operation").forGetter(evv.b::c),
                  eyk.a.fieldOf("amount").forGetter(evv.b::d),
                  g.fieldOf("slot").forGetter(evv.b::e)
               )
               .apply($$0, evv.b::new)
      );

      public ali a() {
         return this.b;
      }

      public jq<bwd> b() {
         return this.c;
      }

      public bwg.a c() {
         return this.d;
      }

      public eyj d() {
         return this.e;
      }

      public List<bun> e() {
         return this.f;
      }
   }

   public static class c {
      private final ali a;
      private final jq<bwd> b;
      private final bwg.a c;
      private final eyj d;
      private final Set<bun> e = EnumSet.noneOf(bun.class);

      public c(ali $$0, jq<bwd> $$1, bwg.a $$2, eyj $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public evv.c a(bun $$0) {
         this.e.add($$0);
         return this;
      }

      public evv.b a() {
         return new evv.b(this.a, this.b, this.c, this.d, List.copyOf(this.e));
      }
   }
}
