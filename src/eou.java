import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;

public class eou extends eoo {
   public static final Codec<eou> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(aws.a(eou.b.a.listOf()).fieldOf("modifiers").forGetter($$0x -> $$0x.b)).apply($$0, eou::new)
   );
   private final List<eou.b> b;

   eou(List<eqc> $$0, List<eou.b> $$1) {
      super($$0);
      this.b = List.copyOf($$1);
   }

   @Override
   public eoq b() {
      return eor.l;
   }

   @Override
   public Set<epl<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public crj a(crj $$0, enb $$1) {
      $$0.a(jp.i, ctz.a, $$1x -> {
         axr $$2 = $$1.b();

         for (eou.b $$3 : this.b) {
            UUID $$4 = $$3.g.orElseGet(UUID::randomUUID);
            bqd $$5 = ac.a($$3.f, $$2);
            $$1x = $$1x.a($$3.c, new brt($$4, $$3.b, (double)$$3.e.b($$1), $$3.d), $$5);
         }

         return $$1x;
      });
      return $$0;
   }

   public static eou.c a(String $$0, il<brq> $$1, brt.a $$2, eqx $$3) {
      return new eou.c($$0, $$1, $$2, $$3);
   }

   public static eou.a c() {
      return new eou.a();
   }

   public static class a extends eoo.a<eou.a> {
      private final List<eou.b> a = Lists.newArrayList();

      protected eou.a a() {
         return this;
      }

      public eou.a a(eou.c $$0) {
         this.a.add($$0.a());
         return this;
      }

      @Override
      public eop b() {
         return new eou(this.g(), this.a);
      }
   }

   static record b(String b, il<brq> c, brt.a d, eqx e, List<bqd> f, Optional<UUID> g) {
      private static final Codec<List<bqd>> h = aws.a(
         Codec.either(bqd.k, bqd.k.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((bqd)$$0.get(0)) : Either.right($$0))
      );
      public static final Codec<eou.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("name").forGetter(eou.b::a),
                  kr.u.r().fieldOf("attribute").forGetter(eou.b::b),
                  brt.a.f.fieldOf("operation").forGetter(eou.b::c),
                  eqy.a.fieldOf("amount").forGetter(eou.b::d),
                  h.fieldOf("slot").forGetter(eou.b::e),
                  aws.a(jf.d, "id").forGetter(eou.b::f)
               )
               .apply($$0, eou.b::new)
      );

      public String a() {
         return this.b;
      }

      public il<brq> b() {
         return this.c;
      }

      public brt.a c() {
         return this.d;
      }

      public eqx d() {
         return this.e;
      }

      public List<bqd> e() {
         return this.f;
      }

      public Optional<UUID> f() {
         return this.g;
      }
   }

   public static class c {
      private final String a;
      private final il<brq> b;
      private final brt.a c;
      private final eqx d;
      private Optional<UUID> e = Optional.empty();
      private final Set<bqd> f = EnumSet.noneOf(bqd.class);

      public c(String $$0, il<brq> $$1, brt.a $$2, eqx $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public eou.c a(bqd $$0) {
         this.f.add($$0);
         return this;
      }

      public eou.c a(UUID $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public eou.b a() {
         return new eou.b(this.a, this.b, this.c, this.d, List.copyOf(this.f), this.e);
      }
   }
}
