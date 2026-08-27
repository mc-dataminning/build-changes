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

public class egd extends efx {
   public static final Codec<egd> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(asq.a(egd.b.a.listOf()).fieldOf("modifiers").forGetter($$0x -> $$0x.b)).apply($$0, egd::new)
   );
   private final List<egd.b> b;

   egd(List<ehk> $$0, List<egd.b> $$1) {
      super($$0);
      this.b = List.copyOf($$1);
   }

   @Override
   public efz b() {
      return ega.k;
   }

   @Override
   public Set<egt<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public clb a(clb $$0, eel $$1) {
      ato $$2 = $$1.b();

      for (egd.b $$3 : this.b) {
         UUID $$4 = $$3.g.orElseGet(UUID::randomUUID);
         bkn $$5 = ac.a($$3.f, $$2);
         $$0.a($$3.c.a(), new bmc($$4, $$3.b, (double)$$3.e.b($$1), $$3.d), $$5);
      }

      return $$0;
   }

   public static egd.c a(String $$0, ib<blz> $$1, bmc.a $$2, eif $$3) {
      return new egd.c($$0, $$1, $$2, $$3);
   }

   public static egd.a c() {
      return new egd.a();
   }

   public static class a extends efx.a<egd.a> {
      private final List<egd.b> a = Lists.newArrayList();

      protected egd.a a() {
         return this;
      }

      public egd.a a(egd.c $$0) {
         this.a.add($$0.a());
         return this;
      }

      @Override
      public efy b() {
         return new egd(this.g(), this.a);
      }
   }

   static record b(String b, ib<blz> c, bmc.a d, eif e, List<bkn> f, Optional<UUID> g) {
      private static final Codec<List<bkn>> h = asq.a(
         Codec.either(bkn.g, bkn.g.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((bkn)$$0.get(0)) : Either.right($$0))
      );
      public static final Codec<egd.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("name").forGetter(egd.b::a),
                  jy.v.r().fieldOf("attribute").forGetter(egd.b::b),
                  bmc.a.d.fieldOf("operation").forGetter(egd.b::c),
                  eig.a.fieldOf("amount").forGetter(egd.b::d),
                  h.fieldOf("slot").forGetter(egd.b::e),
                  asq.a(iv.b, "id").forGetter(egd.b::f)
               )
               .apply($$0, egd.b::new)
      );

      public String a() {
         return this.b;
      }

      public ib<blz> b() {
         return this.c;
      }

      public bmc.a c() {
         return this.d;
      }

      public eif d() {
         return this.e;
      }

      public List<bkn> e() {
         return this.f;
      }

      public Optional<UUID> f() {
         return this.g;
      }
   }

   public static class c {
      private final String a;
      private final ib<blz> b;
      private final bmc.a c;
      private final eif d;
      private Optional<UUID> e = Optional.empty();
      private final Set<bkn> f = EnumSet.noneOf(bkn.class);

      public c(String $$0, ib<blz> $$1, bmc.a $$2, eif $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public egd.c a(bkn $$0) {
         this.f.add($$0);
         return this;
      }

      public egd.c a(UUID $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public egd.b a() {
         return new egd.b(this.a, this.b, this.c, this.d, List.copyOf(this.f), this.e);
      }
   }
}
