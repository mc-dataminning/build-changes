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

public class eek extends eee {
   public static final Codec<eek> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(arh.a(eek.b.a.listOf()).fieldOf("modifiers").forGetter($$0x -> $$0x.b)).apply($$0, eek::new)
   );
   private final List<eek.b> b;

   eek(List<efr> $$0, List<eek.b> $$1) {
      super($$0);
      this.b = List.copyOf($$1);
   }

   @Override
   public eeg b() {
      return eeh.k;
   }

   @Override
   public Set<efa<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cjh a(cjh $$0, ecs $$1) {
      ase $$2 = $$1.b();

      for (eek.b $$3 : this.b) {
         UUID $$4 = $$3.g.orElseGet(UUID::randomUUID);
         bix $$5 = ac.a($$3.f, $$2);
         $$0.a($$3.c.a(), new bkm($$4, $$3.b, (double)$$3.e.b($$1), $$3.d), $$5);
      }

      return $$0;
   }

   public static eek.c a(String $$0, hg<bkj> $$1, bkm.a $$2, egm $$3) {
      return new eek.c($$0, $$1, $$2, $$3);
   }

   public static eek.a c() {
      return new eek.a();
   }

   public static class a extends eee.a<eek.a> {
      private final List<eek.b> a = Lists.newArrayList();

      protected eek.a a() {
         return this;
      }

      public eek.a a(eek.c $$0) {
         this.a.add($$0.a());
         return this;
      }

      @Override
      public eef b() {
         return new eek(this.g(), this.a);
      }
   }

   static record b(String b, hg<bkj> c, bkm.a d, egm e, List<bix> f, Optional<UUID> g) {
      private static final Codec<List<bix>> h = arh.a(
         Codec.either(bix.g, bix.g.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((bix)$$0.get(0)) : Either.right($$0))
      );
      public static final Codec<eek.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("name").forGetter(eek.b::a),
                  jd.v.r().fieldOf("attribute").forGetter(eek.b::b),
                  bkm.a.d.fieldOf("operation").forGetter(eek.b::c),
                  egn.a.fieldOf("amount").forGetter(eek.b::d),
                  h.fieldOf("slot").forGetter(eek.b::e),
                  arh.a(ia.b, "id").forGetter(eek.b::f)
               )
               .apply($$0, eek.b::new)
      );

      public String a() {
         return this.b;
      }

      public hg<bkj> b() {
         return this.c;
      }

      public bkm.a c() {
         return this.d;
      }

      public egm d() {
         return this.e;
      }

      public List<bix> e() {
         return this.f;
      }

      public Optional<UUID> f() {
         return this.g;
      }
   }

   public static class c {
      private final String a;
      private final hg<bkj> b;
      private final bkm.a c;
      private final egm d;
      private Optional<UUID> e = Optional.empty();
      private final Set<bix> f = EnumSet.noneOf(bix.class);

      public c(String $$0, hg<bkj> $$1, bkm.a $$2, egm $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public eek.c a(bix $$0) {
         this.f.add($$0);
         return this;
      }

      public eek.c a(UUID $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public eek.b a() {
         return new eek.b(this.a, this.b, this.c, this.d, List.copyOf(this.f), this.e);
      }
   }
}
