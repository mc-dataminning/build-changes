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

public class emm extends emg {
   public static final Codec<emm> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(awe.a(emm.b.a.listOf()).fieldOf("modifiers").forGetter($$0x -> $$0x.b)).apply($$0, emm::new)
   );
   private final List<emm.b> b;

   emm(List<ent> $$0, List<emm.b> $$1) {
      super($$0);
      this.b = List.copyOf($$1);
   }

   @Override
   public emi b() {
      return emj.k;
   }

   @Override
   public Set<enc<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cqk a(cqk $$0, eku $$1) {
      axd $$2 = $$1.b();

      for (emm.b $$3 : this.b) {
         UUID $$4 = $$3.g.orElseGet(UUID::randomUUID);
         bpd $$5 = ac.a($$3.f, $$2);
         $$0.a($$3.c, new bqt($$4, $$3.b, (double)$$3.e.b($$1), $$3.d), $$5);
      }

      return $$0;
   }

   public static emm.c a(String $$0, il<bqq> $$1, bqt.a $$2, eoo $$3) {
      return new emm.c($$0, $$1, $$2, $$3);
   }

   public static emm.a c() {
      return new emm.a();
   }

   public static class a extends emg.a<emm.a> {
      private final List<emm.b> a = Lists.newArrayList();

      protected emm.a a() {
         return this;
      }

      public emm.a a(emm.c $$0) {
         this.a.add($$0.a());
         return this;
      }

      @Override
      public emh b() {
         return new emm(this.g(), this.a);
      }
   }

   static record b(String b, il<bqq> c, bqt.a d, eoo e, List<bpd> f, Optional<UUID> g) {
      private static final Codec<List<bpd>> h = awe.a(
         Codec.either(bpd.h, bpd.h.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((bpd)$$0.get(0)) : Either.right($$0))
      );
      public static final Codec<emm.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("name").forGetter(emm.b::a),
                  ki.u.r().fieldOf("attribute").forGetter(emm.b::b),
                  bqt.a.f.fieldOf("operation").forGetter(emm.b::c),
                  eop.a.fieldOf("amount").forGetter(emm.b::d),
                  h.fieldOf("slot").forGetter(emm.b::e),
                  awe.a(jf.d, "id").forGetter(emm.b::f)
               )
               .apply($$0, emm.b::new)
      );

      public String a() {
         return this.b;
      }

      public il<bqq> b() {
         return this.c;
      }

      public bqt.a c() {
         return this.d;
      }

      public eoo d() {
         return this.e;
      }

      public List<bpd> e() {
         return this.f;
      }

      public Optional<UUID> f() {
         return this.g;
      }
   }

   public static class c {
      private final String a;
      private final il<bqq> b;
      private final bqt.a c;
      private final eoo d;
      private Optional<UUID> e = Optional.empty();
      private final Set<bpd> f = EnumSet.noneOf(bpd.class);

      public c(String $$0, il<bqq> $$1, bqt.a $$2, eoo $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public emm.c a(bpd $$0) {
         this.f.add($$0);
         return this;
      }

      public emm.c a(UUID $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public emm.b a() {
         return new emm.b(this.a, this.b, this.c, this.d, List.copyOf(this.f), this.e);
      }
   }
}
