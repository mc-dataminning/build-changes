import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;

public class eqw extends eqq {
   public static final MapCodec<eqw> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axm.a(eqw.b.a.listOf()).fieldOf("modifiers").forGetter($$0x -> $$0x.b)).apply($$0, eqw::new)
   );
   private final List<eqw.b> b;

   eqw(List<esl> $$0, List<eqw.b> $$1) {
      super($$0);
      this.b = List.copyOf($$1);
   }

   @Override
   public eqs b() {
      return eqt.n;
   }

   @Override
   public Set<eru<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cto a(cto $$0, epf $$1) {
      $$0.a(kb.m, cwj.a, $$1x -> {
         ayk $$2 = $$1.b();

         for (eqw.b $$3 : this.b) {
            UUID $$4 = $$3.g.orElseGet(UUID::randomUUID);
            bsc $$5 = ac.a($$3.f, $$2);
            $$1x = $$1x.a($$3.c, new btu($$4, $$3.b, (double)$$3.e.b($$1), $$3.d), $$5);
         }

         return $$1x;
      });
      return $$0;
   }

   public static eqw.c a(String $$0, ix<btr> $$1, btu.a $$2, etg $$3) {
      return new eqw.c($$0, $$1, $$2, $$3);
   }

   public static eqw.a c() {
      return new eqw.a();
   }

   public static class a extends eqq.a<eqw.a> {
      private final List<eqw.b> a = Lists.newArrayList();

      protected eqw.a a() {
         return this;
      }

      public eqw.a a(eqw.c $$0) {
         this.a.add($$0.a());
         return this;
      }

      @Override
      public eqr b() {
         return new eqw(this.g(), this.a);
      }
   }

   static record b(String b, ix<btr> c, btu.a d, etg e, List<bsc> f, Optional<UUID> g) {
      private static final Codec<List<bsc>> h = axm.a(
         Codec.either(bsc.l, bsc.l.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((bsc)$$0.get(0)) : Either.right($$0))
      );
      public static final Codec<eqw.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("name").forGetter(eqw.b::a),
                  le.u.r().fieldOf("attribute").forGetter(eqw.b::b),
                  btu.a.f.fieldOf("operation").forGetter(eqw.b::c),
                  eth.a.fieldOf("amount").forGetter(eqw.b::d),
                  h.fieldOf("slot").forGetter(eqw.b::e),
                  jr.d.optionalFieldOf("id").forGetter(eqw.b::f)
               )
               .apply($$0, eqw.b::new)
      );

      public String a() {
         return this.b;
      }

      public ix<btr> b() {
         return this.c;
      }

      public btu.a c() {
         return this.d;
      }

      public etg d() {
         return this.e;
      }

      public List<bsc> e() {
         return this.f;
      }

      public Optional<UUID> f() {
         return this.g;
      }
   }

   public static class c {
      private final String a;
      private final ix<btr> b;
      private final btu.a c;
      private final etg d;
      private Optional<UUID> e = Optional.empty();
      private final Set<bsc> f = EnumSet.noneOf(bsc.class);

      public c(String $$0, ix<btr> $$1, btu.a $$2, etg $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public eqw.c a(bsc $$0) {
         this.f.add($$0);
         return this;
      }

      public eqw.c a(UUID $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public eqw.b a() {
         return new eqw.b(this.a, this.b, this.c, this.d, List.copyOf(this.f), this.e);
      }
   }
}
