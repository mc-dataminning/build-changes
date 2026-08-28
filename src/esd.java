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

public class esd extends erw {
   public static final MapCodec<esd> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ayh.a(esd.b.a.listOf()).fieldOf("modifiers").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("replace", true).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, esd::new)
   );
   private final List<esd.b> b;
   private final boolean c;

   esd(List<etu> $$0, List<esd.b> $$1, boolean $$2) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public ery<esd> b() {
      return erz.o;
   }

   @Override
   public Set<etd<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cur a(cur $$0, eqk $$1) {
      if (this.c) {
         $$0.b(km.n, this.a($$1, cxm.a));
      } else {
         $$0.a(km.n, cxm.a, $$2 -> $$2.b().isEmpty() ? this.a($$1, $$0.g().j()) : this.a($$1, $$2));
      }

      return $$0;
   }

   private cxm a(eqk $$0, cxm $$1) {
      azh $$2 = $$0.b();

      for (esd.b $$3 : this.b) {
         UUID $$4 = $$3.g.orElseGet(UUID::randomUUID);
         bte $$5 = ac.a($$3.f, $$2);
         $$1 = $$1.a($$3.c, new bux($$4, $$3.b, (double)$$3.e.b($$0), $$3.d), $$5);
      }

      return $$1;
   }

   public static esd.c a(String $$0, ji<buu> $$1, bux.a $$2, eup $$3) {
      return new esd.c($$0, $$1, $$2, $$3);
   }

   public static esd.a c() {
      return new esd.a();
   }

   public static class a extends erw.a<esd.a> {
      private final boolean a;
      private final List<esd.b> b = Lists.newArrayList();

      public a(boolean $$0) {
         this.a = $$0;
      }

      public a() {
         this(false);
      }

      protected esd.a a() {
         return this;
      }

      public esd.a a(esd.c $$0) {
         this.b.add($$0.a());
         return this;
      }

      @Override
      public erx b() {
         return new esd(this.g(), this.b, this.a);
      }
   }

   static record b(String b, ji<buu> c, bux.a d, eup e, List<bte> f, Optional<UUID> g) {
      private static final Codec<List<bte>> h = ayh.a(
         Codec.either(bte.l, bte.l.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((bte)$$0.getFirst()) : Either.right($$0))
      );
      public static final Codec<esd.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("name").forGetter(esd.b::a),
                  lp.u.r().fieldOf("attribute").forGetter(esd.b::b),
                  bux.a.f.fieldOf("operation").forGetter(esd.b::c),
                  euq.a.fieldOf("amount").forGetter(esd.b::d),
                  h.fieldOf("slot").forGetter(esd.b::e),
                  kc.d.optionalFieldOf("id").forGetter(esd.b::f)
               )
               .apply($$0, esd.b::new)
      );

      public String a() {
         return this.b;
      }

      public ji<buu> b() {
         return this.c;
      }

      public bux.a c() {
         return this.d;
      }

      public eup d() {
         return this.e;
      }

      public List<bte> e() {
         return this.f;
      }

      public Optional<UUID> f() {
         return this.g;
      }
   }

   public static class c {
      private final String a;
      private final ji<buu> b;
      private final bux.a c;
      private final eup d;
      private Optional<UUID> e = Optional.empty();
      private final Set<bte> f = EnumSet.noneOf(bte.class);

      public c(String $$0, ji<buu> $$1, bux.a $$2, eup $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public esd.c a(bte $$0) {
         this.f.add($$0);
         return this;
      }

      public esd.c a(UUID $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public esd.b a() {
         return new esd.b(this.a, this.b, this.c, this.d, List.copyOf(this.f), this.e);
      }
   }
}
