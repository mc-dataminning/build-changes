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

public class erz extends ers {
   public static final MapCodec<erz> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ayf.a(erz.b.a.listOf()).fieldOf("modifiers").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("replace", true).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, erz::new)
   );
   private final List<erz.b> b;
   private final boolean c;

   erz(List<etq> $$0, List<erz.b> $$1, boolean $$2) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public eru<erz> b() {
      return erv.o;
   }

   @Override
   public Set<esz<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cun a(cun $$0, eqg $$1) {
      if (this.c) {
         $$0.b(km.m, this.a($$1, cxi.a));
      } else {
         $$0.a(km.m, cxi.a, $$2 -> $$2.b().isEmpty() ? this.a($$1, $$0.g().j()) : this.a($$1, $$2));
      }

      return $$0;
   }

   private cxi a(eqg $$0, cxi $$1) {
      azf $$2 = $$0.b();

      for (erz.b $$3 : this.b) {
         UUID $$4 = $$3.g.orElseGet(UUID::randomUUID);
         bta $$5 = ac.a($$3.f, $$2);
         $$1 = $$1.a($$3.c, new but($$4, $$3.b, (double)$$3.e.b($$0), $$3.d), $$5);
      }

      return $$1;
   }

   public static erz.c a(String $$0, ji<buq> $$1, but.a $$2, eul $$3) {
      return new erz.c($$0, $$1, $$2, $$3);
   }

   public static erz.a c() {
      return new erz.a();
   }

   public static class a extends ers.a<erz.a> {
      private final boolean a;
      private final List<erz.b> b = Lists.newArrayList();

      public a(boolean $$0) {
         this.a = $$0;
      }

      public a() {
         this(false);
      }

      protected erz.a a() {
         return this;
      }

      public erz.a a(erz.c $$0) {
         this.b.add($$0.a());
         return this;
      }

      @Override
      public ert b() {
         return new erz(this.g(), this.b, this.a);
      }
   }

   static record b(String b, ji<buq> c, but.a d, eul e, List<bta> f, Optional<UUID> g) {
      private static final Codec<List<bta>> h = ayf.a(
         Codec.either(bta.l, bta.l.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((bta)$$0.getFirst()) : Either.right($$0))
      );
      public static final Codec<erz.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("name").forGetter(erz.b::a),
                  lp.u.r().fieldOf("attribute").forGetter(erz.b::b),
                  but.a.f.fieldOf("operation").forGetter(erz.b::c),
                  eum.a.fieldOf("amount").forGetter(erz.b::d),
                  h.fieldOf("slot").forGetter(erz.b::e),
                  kc.d.optionalFieldOf("id").forGetter(erz.b::f)
               )
               .apply($$0, erz.b::new)
      );

      public String a() {
         return this.b;
      }

      public ji<buq> b() {
         return this.c;
      }

      public but.a c() {
         return this.d;
      }

      public eul d() {
         return this.e;
      }

      public List<bta> e() {
         return this.f;
      }

      public Optional<UUID> f() {
         return this.g;
      }
   }

   public static class c {
      private final String a;
      private final ji<buq> b;
      private final but.a c;
      private final eul d;
      private Optional<UUID> e = Optional.empty();
      private final Set<bta> f = EnumSet.noneOf(bta.class);

      public c(String $$0, ji<buq> $$1, but.a $$2, eul $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public erz.c a(bta $$0) {
         this.f.add($$0);
         return this;
      }

      public erz.c a(UUID $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public erz.b a() {
         return new erz.b(this.a, this.b, this.c, this.d, List.copyOf(this.f), this.e);
      }
   }
}
