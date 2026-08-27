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

public class elq extends elk {
   public static final Codec<elq> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(avu.a(elq.b.a.listOf()).fieldOf("modifiers").forGetter($$0x -> $$0x.b)).apply($$0, elq::new)
   );
   private final List<elq.b> b;

   elq(List<emx> $$0, List<elq.b> $$1) {
      super($$0);
      this.b = List.copyOf($$1);
   }

   @Override
   public elm b() {
      return eln.k;
   }

   @Override
   public Set<emg<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cpq a(cpq $$0, ejy $$1) {
      awt $$2 = $$1.b();

      for (elq.b $$3 : this.b) {
         UUID $$4 = $$3.g.orElseGet(UUID::randomUUID);
         bom $$5 = ac.a($$3.f, $$2);
         $$0.a($$3.c, new bqc($$4, $$3.b, (double)$$3.e.b($$1), $$3.d), $$5);
      }

      return $$0;
   }

   public static elq.c a(String $$0, il<bpz> $$1, bqc.a $$2, ens $$3) {
      return new elq.c($$0, $$1, $$2, $$3);
   }

   public static elq.a c() {
      return new elq.a();
   }

   public static class a extends elk.a<elq.a> {
      private final List<elq.b> a = Lists.newArrayList();

      protected elq.a a() {
         return this;
      }

      public elq.a a(elq.c $$0) {
         this.a.add($$0.a());
         return this;
      }

      @Override
      public ell b() {
         return new elq(this.g(), this.a);
      }
   }

   static record b(String b, il<bpz> c, bqc.a d, ens e, List<bom> f, Optional<UUID> g) {
      private static final Codec<List<bom>> h = avu.a(
         Codec.either(bom.h, bom.h.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((bom)$$0.get(0)) : Either.right($$0))
      );
      public static final Codec<elq.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("name").forGetter(elq.b::a),
                  kh.u.r().fieldOf("attribute").forGetter(elq.b::b),
                  bqc.a.f.fieldOf("operation").forGetter(elq.b::c),
                  ent.a.fieldOf("amount").forGetter(elq.b::d),
                  h.fieldOf("slot").forGetter(elq.b::e),
                  avu.a(je.d, "id").forGetter(elq.b::f)
               )
               .apply($$0, elq.b::new)
      );

      public String a() {
         return this.b;
      }

      public il<bpz> b() {
         return this.c;
      }

      public bqc.a c() {
         return this.d;
      }

      public ens d() {
         return this.e;
      }

      public List<bom> e() {
         return this.f;
      }

      public Optional<UUID> f() {
         return this.g;
      }
   }

   public static class c {
      private final String a;
      private final il<bpz> b;
      private final bqc.a c;
      private final ens d;
      private Optional<UUID> e = Optional.empty();
      private final Set<bom> f = EnumSet.noneOf(bom.class);

      public c(String $$0, il<bpz> $$1, bqc.a $$2, ens $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public elq.c a(bom $$0) {
         this.f.add($$0);
         return this;
      }

      public elq.c a(UUID $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public elq.b a() {
         return new elq.b(this.a, this.b, this.c, this.d, List.copyOf(this.f), this.e);
      }
   }
}
