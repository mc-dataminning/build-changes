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

public class eih extends eib {
   public static final Codec<eih> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(atq.a(eih.b.a.listOf()).fieldOf("modifiers").forGetter($$0x -> $$0x.b)).apply($$0, eih::new)
   );
   private final List<eih.b> b;

   eih(List<ejo> $$0, List<eih.b> $$1) {
      super($$0);
      this.b = List.copyOf($$1);
   }

   @Override
   public eid b() {
      return eie.k;
   }

   @Override
   public Set<eix<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cmr a(cmr $$0, egp $$1) {
      aup $$2 = $$1.b();

      for (eih.b $$3 : this.b) {
         UUID $$4 = $$3.g.orElseGet(UUID::randomUUID);
         blu $$5 = ac.a($$3.f, $$2);
         $$0.a($$3.c.a(), new bnj($$4, $$3.b, (double)$$3.e.b($$1), $$3.d), $$5);
      }

      return $$0;
   }

   public static eih.c a(String $$0, ih<bng> $$1, bnj.a $$2, ekj $$3) {
      return new eih.c($$0, $$1, $$2, $$3);
   }

   public static eih.a c() {
      return new eih.a();
   }

   public static class a extends eib.a<eih.a> {
      private final List<eih.b> a = Lists.newArrayList();

      protected eih.a a() {
         return this;
      }

      public eih.a a(eih.c $$0) {
         this.a.add($$0.a());
         return this;
      }

      @Override
      public eic b() {
         return new eih(this.g(), this.a);
      }
   }

   static record b(String b, ih<bng> c, bnj.a d, ekj e, List<blu> f, Optional<UUID> g) {
      private static final Codec<List<blu>> h = atq.a(
         Codec.either(blu.g, blu.g.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((blu)$$0.get(0)) : Either.right($$0))
      );
      public static final Codec<eih.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("name").forGetter(eih.b::a),
                  kd.u.r().fieldOf("attribute").forGetter(eih.b::b),
                  bnj.a.d.fieldOf("operation").forGetter(eih.b::c),
                  ekk.a.fieldOf("amount").forGetter(eih.b::d),
                  h.fieldOf("slot").forGetter(eih.b::e),
                  atq.a(ja.c, "id").forGetter(eih.b::f)
               )
               .apply($$0, eih.b::new)
      );

      public String a() {
         return this.b;
      }

      public ih<bng> b() {
         return this.c;
      }

      public bnj.a c() {
         return this.d;
      }

      public ekj d() {
         return this.e;
      }

      public List<blu> e() {
         return this.f;
      }

      public Optional<UUID> f() {
         return this.g;
      }
   }

   public static class c {
      private final String a;
      private final ih<bng> b;
      private final bnj.a c;
      private final ekj d;
      private Optional<UUID> e = Optional.empty();
      private final Set<blu> f = EnumSet.noneOf(blu.class);

      public c(String $$0, ih<bng> $$1, bnj.a $$2, ekj $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public eih.c a(blu $$0) {
         this.f.add($$0);
         return this;
      }

      public eih.c a(UUID $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public eih.b a() {
         return new eih.b(this.a, this.b, this.c, this.d, List.copyOf(this.f), this.e);
      }
   }
}
