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

public class etg extends eta {
   public static final Codec<etg> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(axu.a(etg.b.a.listOf()).fieldOf("modifiers").forGetter($$0x -> $$0x.b)).apply($$0, etg::new)
   );
   private final List<etg.b> b;

   etg(List<euu> $$0, List<etg.b> $$1) {
      super($$0);
      this.b = List.copyOf($$1);
   }

   @Override
   public etc b() {
      return etd.n;
   }

   @Override
   public Set<eud<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cuh a(cuh $$0, erp $$1) {
      $$0.a(ke.l, cxl.a, $$1x -> {
         ayt $$2 = $$1.b();

         for (etg.b $$3 : this.b) {
            UUID $$4 = $$3.g.orElseGet(UUID::randomUUID);
            bsd $$5 = ad.a($$3.f, $$2);
            $$1x = $$1x.a($$3.c, new btt($$4, $$3.b, (double)$$3.e.b($$1), $$3.d), $$5);
         }

         return $$1x;
      });
      return $$0;
   }

   public static etg.c a(String $$0, ja<btq> $$1, btt.a $$2, evq $$3) {
      return new etg.c($$0, $$1, $$2, $$3);
   }

   public static etg.a c() {
      return new etg.a();
   }

   public static class a extends eta.a<etg.a> {
      private final List<etg.b> a = Lists.newArrayList();

      protected etg.a a() {
         return this;
      }

      public etg.a a(etg.c $$0) {
         this.a.add($$0.a());
         return this;
      }

      @Override
      public etb b() {
         return new etg(this.g(), this.a);
      }
   }

   static record b(String b, ja<btq> c, btt.a d, evq e, List<bsd> f, Optional<UUID> g) {
      private static final Codec<List<bsd>> h = axu.a(
         Codec.either(bsd.k, bsd.k.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((bsd)$$0.get(0)) : Either.right($$0))
      );
      public static final Codec<etg.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("name").forGetter(etg.b::a),
                  lh.u.r().fieldOf("attribute").forGetter(etg.b::b),
                  btt.a.f.fieldOf("operation").forGetter(etg.b::c),
                  evr.a.fieldOf("amount").forGetter(etg.b::d),
                  h.fieldOf("slot").forGetter(etg.b::e),
                  axu.a(ju.d, "id").forGetter(etg.b::f)
               )
               .apply($$0, etg.b::new)
      );

      public String a() {
         return this.b;
      }

      public ja<btq> b() {
         return this.c;
      }

      public btt.a c() {
         return this.d;
      }

      public evq d() {
         return this.e;
      }

      public List<bsd> e() {
         return this.f;
      }

      public Optional<UUID> f() {
         return this.g;
      }
   }

   public static class c {
      private final String a;
      private final ja<btq> b;
      private final btt.a c;
      private final evq d;
      private Optional<UUID> e = Optional.empty();
      private final Set<bsd> f = EnumSet.noneOf(bsd.class);

      public c(String $$0, ja<btq> $$1, btt.a $$2, evq $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public etg.c a(bsd $$0) {
         this.f.add($$0);
         return this;
      }

      public etg.c a(UUID $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public etg.b a() {
         return new etg.b(this.a, this.b, this.c, this.d, List.copyOf(this.f), this.e);
      }
   }
}
