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

public class eku extends eko {
   public static final Codec<eku> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(avq.a(eku.b.a.listOf()).fieldOf("modifiers").forGetter($$0x -> $$0x.b)).apply($$0, eku::new)
   );
   private final List<eku.b> b;

   eku(List<emb> $$0, List<eku.b> $$1) {
      super($$0);
      this.b = List.copyOf($$1);
   }

   @Override
   public ekq b() {
      return ekr.k;
   }

   @Override
   public Set<elk<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cpd a(cpd $$0, ejc $$1) {
      awp $$2 = $$1.b();

      for (eku.b $$3 : this.b) {
         UUID $$4 = $$3.g.orElseGet(UUID::randomUUID);
         bnx $$5 = ac.a($$3.f, $$2);
         $$0.a($$3.c, new bpn($$4, $$3.b, (double)$$3.e.b($$1), $$3.d), $$5);
      }

      return $$0;
   }

   public static eku.c a(String $$0, ij<bpk> $$1, bpn.a $$2, emw $$3) {
      return new eku.c($$0, $$1, $$2, $$3);
   }

   public static eku.a c() {
      return new eku.a();
   }

   public static class a extends eko.a<eku.a> {
      private final List<eku.b> a = Lists.newArrayList();

      protected eku.a a() {
         return this;
      }

      public eku.a a(eku.c $$0) {
         this.a.add($$0.a());
         return this;
      }

      @Override
      public ekp b() {
         return new eku(this.g(), this.a);
      }
   }

   static record b(String b, ij<bpk> c, bpn.a d, emw e, List<bnx> f, Optional<UUID> g) {
      private static final Codec<List<bnx>> h = avq.a(
         Codec.either(bnx.g, bnx.g.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((bnx)$$0.get(0)) : Either.right($$0))
      );
      public static final Codec<eku.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("name").forGetter(eku.b::a),
                  kf.u.r().fieldOf("attribute").forGetter(eku.b::b),
                  bpn.a.f.fieldOf("operation").forGetter(eku.b::c),
                  emx.a.fieldOf("amount").forGetter(eku.b::d),
                  h.fieldOf("slot").forGetter(eku.b::e),
                  avq.a(jc.c, "id").forGetter(eku.b::f)
               )
               .apply($$0, eku.b::new)
      );

      public String a() {
         return this.b;
      }

      public ij<bpk> b() {
         return this.c;
      }

      public bpn.a c() {
         return this.d;
      }

      public emw d() {
         return this.e;
      }

      public List<bnx> e() {
         return this.f;
      }

      public Optional<UUID> f() {
         return this.g;
      }
   }

   public static class c {
      private final String a;
      private final ij<bpk> b;
      private final bpn.a c;
      private final emw d;
      private Optional<UUID> e = Optional.empty();
      private final Set<bnx> f = EnumSet.noneOf(bnx.class);

      public c(String $$0, ij<bpk> $$1, bpn.a $$2, emw $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public eku.c a(bnx $$0) {
         this.f.add($$0);
         return this;
      }

      public eku.c a(UUID $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public eku.b a() {
         return new eku.b(this.a, this.b, this.c, this.d, List.copyOf(this.f), this.e);
      }
   }
}
