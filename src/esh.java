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

public class esh extends esb {
   public static final MapCodec<esh> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axm.a(esh.b.a.listOf()).fieldOf("modifiers").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("replace", true).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, esh::new)
   );
   private final List<esh.b> b;
   private final boolean c;

   esh(List<etz> $$0, List<esh.b> $$1, boolean $$2) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public esd<esh> b() {
      return ese.o;
   }

   @Override
   public Set<eth<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cua a(cua $$0, eqo $$1) {
      if (this.c) {
         $$0.b(kn.n, this.a($$1, cwu.a));
      } else {
         $$0.a(kn.n, cwu.a, $$2 -> $$2.b().isEmpty() ? this.a($$1, $$0.g().j()) : this.a($$1, $$2));
      }

      return $$0;
   }

   private cwu a(eqo $$0, cwu $$1) {
      aym $$2 = $$0.b();

      for (esh.b $$3 : this.b) {
         UUID $$4 = $$3.g.orElseGet(UUID::randomUUID);
         bsl $$5 = ac.a($$3.f, $$2);
         $$1 = $$1.a($$3.c, new bue($$4, $$3.b, (double)$$3.e.b($$0), $$3.d), $$5);
      }

      return $$1;
   }

   public static esh.c a(String $$0, jj<bub> $$1, bue.a $$2, euv $$3) {
      return new esh.c($$0, $$1, $$2, $$3);
   }

   public static esh.a c() {
      return new esh.a();
   }

   public static class a extends esb.a<esh.a> {
      private final boolean a;
      private final List<esh.b> b = Lists.newArrayList();

      public a(boolean $$0) {
         this.a = $$0;
      }

      public a() {
         this(false);
      }

      protected esh.a a() {
         return this;
      }

      public esh.a a(esh.c $$0) {
         this.b.add($$0.a());
         return this;
      }

      @Override
      public esc b() {
         return new esh(this.g(), this.b, this.a);
      }
   }

   static record b(String b, jj<bub> c, bue.a d, euv e, List<bsl> f, Optional<UUID> g) {
      private static final Codec<List<bsl>> h = axm.a(
         Codec.either(bsl.l, bsl.l.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((bsl)$$0.getFirst()) : Either.right($$0))
      );
      public static final Codec<esh.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("name").forGetter(esh.b::a),
                  lq.s.s().fieldOf("attribute").forGetter(esh.b::b),
                  bue.a.f.fieldOf("operation").forGetter(esh.b::c),
                  euw.a.fieldOf("amount").forGetter(esh.b::d),
                  h.fieldOf("slot").forGetter(esh.b::e),
                  kd.d.optionalFieldOf("id").forGetter(esh.b::f)
               )
               .apply($$0, esh.b::new)
      );

      public String a() {
         return this.b;
      }

      public jj<bub> b() {
         return this.c;
      }

      public bue.a c() {
         return this.d;
      }

      public euv d() {
         return this.e;
      }

      public List<bsl> e() {
         return this.f;
      }

      public Optional<UUID> f() {
         return this.g;
      }
   }

   public static class c {
      private final String a;
      private final jj<bub> b;
      private final bue.a c;
      private final euv d;
      private Optional<UUID> e = Optional.empty();
      private final Set<bsl> f = EnumSet.noneOf(bsl.class);

      public c(String $$0, jj<bub> $$1, bue.a $$2, euv $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public esh.c a(bsl $$0) {
         this.f.add($$0);
         return this;
      }

      public esh.c a(UUID $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public esh.b a() {
         return new esh.b(this.a, this.b, this.c, this.d, List.copyOf(this.f), this.e);
      }
   }
}
