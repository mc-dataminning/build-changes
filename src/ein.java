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

public class ein extends eih {
   public static final Codec<ein> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(atv.a(ein.b.a.listOf()).fieldOf("modifiers").forGetter($$0x -> $$0x.b)).apply($$0, ein::new)
   );
   private final List<ein.b> b;

   ein(List<eju> $$0, List<ein.b> $$1) {
      super($$0);
      this.b = List.copyOf($$1);
   }

   @Override
   public eij b() {
      return eik.k;
   }

   @Override
   public Set<ejd<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cmx a(cmx $$0, egv $$1) {
      auu $$2 = $$1.b();

      for (ein.b $$3 : this.b) {
         UUID $$4 = $$3.g.orElseGet(UUID::randomUUID);
         blz $$5 = ac.a($$3.f, $$2);
         $$0.a($$3.c.a(), new bno($$4, $$3.b, (double)$$3.e.b($$1), $$3.d), $$5);
      }

      return $$0;
   }

   public static ein.c a(String $$0, ih<bnl> $$1, bno.a $$2, ekp $$3) {
      return new ein.c($$0, $$1, $$2, $$3);
   }

   public static ein.a c() {
      return new ein.a();
   }

   public static class a extends eih.a<ein.a> {
      private final List<ein.b> a = Lists.newArrayList();

      protected ein.a a() {
         return this;
      }

      public ein.a a(ein.c $$0) {
         this.a.add($$0.a());
         return this;
      }

      @Override
      public eii b() {
         return new ein(this.g(), this.a);
      }
   }

   static record b(String b, ih<bnl> c, bno.a d, ekp e, List<blz> f, Optional<UUID> g) {
      private static final Codec<List<blz>> h = atv.a(
         Codec.either(blz.g, blz.g.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((blz)$$0.get(0)) : Either.right($$0))
      );
      public static final Codec<ein.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("name").forGetter(ein.b::a),
                  kd.u.r().fieldOf("attribute").forGetter(ein.b::b),
                  bno.a.d.fieldOf("operation").forGetter(ein.b::c),
                  ekq.a.fieldOf("amount").forGetter(ein.b::d),
                  h.fieldOf("slot").forGetter(ein.b::e),
                  atv.a(ja.c, "id").forGetter(ein.b::f)
               )
               .apply($$0, ein.b::new)
      );

      public String a() {
         return this.b;
      }

      public ih<bnl> b() {
         return this.c;
      }

      public bno.a c() {
         return this.d;
      }

      public ekp d() {
         return this.e;
      }

      public List<blz> e() {
         return this.f;
      }

      public Optional<UUID> f() {
         return this.g;
      }
   }

   public static class c {
      private final String a;
      private final ih<bnl> b;
      private final bno.a c;
      private final ekp d;
      private Optional<UUID> e = Optional.empty();
      private final Set<blz> f = EnumSet.noneOf(blz.class);

      public c(String $$0, ih<bnl> $$1, bno.a $$2, ekp $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public ein.c a(blz $$0) {
         this.f.add($$0);
         return this;
      }

      public ein.c a(UUID $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public ein.b a() {
         return new ein.b(this.a, this.b, this.c, this.d, List.copyOf(this.f), this.e);
      }
   }
}
