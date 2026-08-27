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

public class eio extends eii {
   public static final Codec<eio> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(atw.a(eio.b.a.listOf()).fieldOf("modifiers").forGetter($$0x -> $$0x.b)).apply($$0, eio::new)
   );
   private final List<eio.b> b;

   eio(List<ejv> $$0, List<eio.b> $$1) {
      super($$0);
      this.b = List.copyOf($$1);
   }

   @Override
   public eik b() {
      return eil.k;
   }

   @Override
   public Set<eje<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cmy a(cmy $$0, egw $$1) {
      auv $$2 = $$1.b();

      for (eio.b $$3 : this.b) {
         UUID $$4 = $$3.g.orElseGet(UUID::randomUUID);
         bma $$5 = ac.a($$3.f, $$2);
         $$0.a($$3.c.a(), new bnp($$4, $$3.b, (double)$$3.e.b($$1), $$3.d), $$5);
      }

      return $$0;
   }

   public static eio.c a(String $$0, ih<bnm> $$1, bnp.a $$2, ekq $$3) {
      return new eio.c($$0, $$1, $$2, $$3);
   }

   public static eio.a c() {
      return new eio.a();
   }

   public static class a extends eii.a<eio.a> {
      private final List<eio.b> a = Lists.newArrayList();

      protected eio.a a() {
         return this;
      }

      public eio.a a(eio.c $$0) {
         this.a.add($$0.a());
         return this;
      }

      @Override
      public eij b() {
         return new eio(this.g(), this.a);
      }
   }

   static record b(String b, ih<bnm> c, bnp.a d, ekq e, List<bma> f, Optional<UUID> g) {
      private static final Codec<List<bma>> h = atw.a(
         Codec.either(bma.g, bma.g.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((bma)$$0.get(0)) : Either.right($$0))
      );
      public static final Codec<eio.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("name").forGetter(eio.b::a),
                  kd.u.r().fieldOf("attribute").forGetter(eio.b::b),
                  bnp.a.d.fieldOf("operation").forGetter(eio.b::c),
                  ekr.a.fieldOf("amount").forGetter(eio.b::d),
                  h.fieldOf("slot").forGetter(eio.b::e),
                  atw.a(ja.c, "id").forGetter(eio.b::f)
               )
               .apply($$0, eio.b::new)
      );

      public String a() {
         return this.b;
      }

      public ih<bnm> b() {
         return this.c;
      }

      public bnp.a c() {
         return this.d;
      }

      public ekq d() {
         return this.e;
      }

      public List<bma> e() {
         return this.f;
      }

      public Optional<UUID> f() {
         return this.g;
      }
   }

   public static class c {
      private final String a;
      private final ih<bnm> b;
      private final bnp.a c;
      private final ekq d;
      private Optional<UUID> e = Optional.empty();
      private final Set<bma> f = EnumSet.noneOf(bma.class);

      public c(String $$0, ih<bnm> $$1, bnp.a $$2, ekq $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public eio.c a(bma $$0) {
         this.f.add($$0);
         return this;
      }

      public eio.c a(UUID $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public eio.b a() {
         return new eio.b(this.a, this.b, this.c, this.d, List.copyOf(this.f), this.e);
      }
   }
}
