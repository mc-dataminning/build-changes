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

public class eed extends edx {
   public static final Codec<eed> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(arb.a(eed.b.a.listOf()).fieldOf("modifiers").forGetter($$0x -> $$0x.b)).apply($$0, eed::new)
   );
   private final List<eed.b> b;

   eed(List<efk> $$0, List<eed.b> $$1) {
      super($$0);
      this.b = List.copyOf($$1);
   }

   @Override
   public edz b() {
      return eea.k;
   }

   @Override
   public Set<eet<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cja a(cja $$0, ecl $$1) {
      arx $$2 = $$1.b();

      for (eed.b $$3 : this.b) {
         UUID $$4 = $$3.g.orElseGet(UUID::randomUUID);
         biq $$5 = ac.a($$3.f, $$2);
         $$0.a($$3.c.a(), new bkf($$4, $$3.b, (double)$$3.e.b($$1), $$3.d), $$5);
      }

      return $$0;
   }

   public static eed.c a(String $$0, hg<bkc> $$1, bkf.a $$2, egf $$3) {
      return new eed.c($$0, $$1, $$2, $$3);
   }

   public static eed.a c() {
      return new eed.a();
   }

   public static class a extends edx.a<eed.a> {
      private final List<eed.b> a = Lists.newArrayList();

      protected eed.a a() {
         return this;
      }

      public eed.a a(eed.c $$0) {
         this.a.add($$0.a());
         return this;
      }

      @Override
      public edy b() {
         return new eed(this.g(), this.a);
      }
   }

   static record b(String b, hg<bkc> c, bkf.a d, egf e, List<biq> f, Optional<UUID> g) {
      private static final Codec<List<biq>> h = arb.a(
         Codec.either(biq.g, biq.g.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((biq)$$0.get(0)) : Either.right($$0))
      );
      public static final Codec<eed.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("name").forGetter(eed.b::a),
                  jd.v.r().fieldOf("attribute").forGetter(eed.b::b),
                  bkf.a.d.fieldOf("operation").forGetter(eed.b::c),
                  egg.a.fieldOf("amount").forGetter(eed.b::d),
                  h.fieldOf("slot").forGetter(eed.b::e),
                  arb.a(ia.b, "id").forGetter(eed.b::f)
               )
               .apply($$0, eed.b::new)
      );

      public String a() {
         return this.b;
      }

      public hg<bkc> b() {
         return this.c;
      }

      public bkf.a c() {
         return this.d;
      }

      public egf d() {
         return this.e;
      }

      public List<biq> e() {
         return this.f;
      }

      public Optional<UUID> f() {
         return this.g;
      }
   }

   public static class c {
      private final String a;
      private final hg<bkc> b;
      private final bkf.a c;
      private final egf d;
      private Optional<UUID> e = Optional.empty();
      private final Set<biq> f = EnumSet.noneOf(biq.class);

      public c(String $$0, hg<bkc> $$1, bkf.a $$2, egf $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public eed.c a(biq $$0) {
         this.f.add($$0);
         return this;
      }

      public eed.c a(UUID $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public eed.b a() {
         return new eed.b(this.a, this.b, this.c, this.d, List.copyOf(this.f), this.e);
      }
   }
}
