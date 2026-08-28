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

public class esb extends eru {
   public static final MapCodec<esb> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ayh.a(esb.b.a.listOf()).fieldOf("modifiers").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("replace", true).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, esb::new)
   );
   private final List<esb.b> b;
   private final boolean c;

   esb(List<ets> $$0, List<esb.b> $$1, boolean $$2) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public erw<esb> b() {
      return erx.o;
   }

   @Override
   public Set<etb<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cup a(cup $$0, eqi $$1) {
      if (this.c) {
         $$0.b(km.n, this.a($$1, cxk.a));
      } else {
         $$0.a(km.n, cxk.a, $$2 -> $$2.b().isEmpty() ? this.a($$1, $$0.g().j()) : this.a($$1, $$2));
      }

      return $$0;
   }

   private cxk a(eqi $$0, cxk $$1) {
      azh $$2 = $$0.b();

      for (esb.b $$3 : this.b) {
         UUID $$4 = $$3.g.orElseGet(UUID::randomUUID);
         btc $$5 = ac.a($$3.f, $$2);
         $$1 = $$1.a($$3.c, new buv($$4, $$3.b, (double)$$3.e.b($$0), $$3.d), $$5);
      }

      return $$1;
   }

   public static esb.c a(String $$0, ji<bus> $$1, buv.a $$2, eun $$3) {
      return new esb.c($$0, $$1, $$2, $$3);
   }

   public static esb.a c() {
      return new esb.a();
   }

   public static class a extends eru.a<esb.a> {
      private final boolean a;
      private final List<esb.b> b = Lists.newArrayList();

      public a(boolean $$0) {
         this.a = $$0;
      }

      public a() {
         this(false);
      }

      protected esb.a a() {
         return this;
      }

      public esb.a a(esb.c $$0) {
         this.b.add($$0.a());
         return this;
      }

      @Override
      public erv b() {
         return new esb(this.g(), this.b, this.a);
      }
   }

   static record b(String b, ji<bus> c, buv.a d, eun e, List<btc> f, Optional<UUID> g) {
      private static final Codec<List<btc>> h = ayh.a(
         Codec.either(btc.l, btc.l.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((btc)$$0.getFirst()) : Either.right($$0))
      );
      public static final Codec<esb.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("name").forGetter(esb.b::a),
                  lp.u.r().fieldOf("attribute").forGetter(esb.b::b),
                  buv.a.f.fieldOf("operation").forGetter(esb.b::c),
                  euo.a.fieldOf("amount").forGetter(esb.b::d),
                  h.fieldOf("slot").forGetter(esb.b::e),
                  kc.d.optionalFieldOf("id").forGetter(esb.b::f)
               )
               .apply($$0, esb.b::new)
      );

      public String a() {
         return this.b;
      }

      public ji<bus> b() {
         return this.c;
      }

      public buv.a c() {
         return this.d;
      }

      public eun d() {
         return this.e;
      }

      public List<btc> e() {
         return this.f;
      }

      public Optional<UUID> f() {
         return this.g;
      }
   }

   public static class c {
      private final String a;
      private final ji<bus> b;
      private final buv.a c;
      private final eun d;
      private Optional<UUID> e = Optional.empty();
      private final Set<btc> f = EnumSet.noneOf(btc.class);

      public c(String $$0, ji<bus> $$1, buv.a $$2, eun $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public esb.c a(btc $$0) {
         this.f.add($$0);
         return this;
      }

      public esb.c a(UUID $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public esb.b a() {
         return new esb.b(this.a, this.b, this.c, this.d, List.copyOf(this.f), this.e);
      }
   }
}
