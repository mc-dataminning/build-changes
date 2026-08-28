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

public class esc extends erv {
   public static final MapCodec<esc> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ayh.a(esc.b.a.listOf()).fieldOf("modifiers").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("replace", true).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, esc::new)
   );
   private final List<esc.b> b;
   private final boolean c;

   esc(List<ett> $$0, List<esc.b> $$1, boolean $$2) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public erx<esc> b() {
      return ery.o;
   }

   @Override
   public Set<etc<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cuq a(cuq $$0, eqj $$1) {
      if (this.c) {
         $$0.b(km.n, this.a($$1, cxl.a));
      } else {
         $$0.a(km.n, cxl.a, $$2 -> $$2.b().isEmpty() ? this.a($$1, $$0.g().j()) : this.a($$1, $$2));
      }

      return $$0;
   }

   private cxl a(eqj $$0, cxl $$1) {
      azh $$2 = $$0.b();

      for (esc.b $$3 : this.b) {
         UUID $$4 = $$3.g.orElseGet(UUID::randomUUID);
         btd $$5 = ac.a($$3.f, $$2);
         $$1 = $$1.a($$3.c, new buw($$4, $$3.b, (double)$$3.e.b($$0), $$3.d), $$5);
      }

      return $$1;
   }

   public static esc.c a(String $$0, ji<but> $$1, buw.a $$2, euo $$3) {
      return new esc.c($$0, $$1, $$2, $$3);
   }

   public static esc.a c() {
      return new esc.a();
   }

   public static class a extends erv.a<esc.a> {
      private final boolean a;
      private final List<esc.b> b = Lists.newArrayList();

      public a(boolean $$0) {
         this.a = $$0;
      }

      public a() {
         this(false);
      }

      protected esc.a a() {
         return this;
      }

      public esc.a a(esc.c $$0) {
         this.b.add($$0.a());
         return this;
      }

      @Override
      public erw b() {
         return new esc(this.g(), this.b, this.a);
      }
   }

   static record b(String b, ji<but> c, buw.a d, euo e, List<btd> f, Optional<UUID> g) {
      private static final Codec<List<btd>> h = ayh.a(
         Codec.either(btd.l, btd.l.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((btd)$$0.getFirst()) : Either.right($$0))
      );
      public static final Codec<esc.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("name").forGetter(esc.b::a),
                  lp.u.r().fieldOf("attribute").forGetter(esc.b::b),
                  buw.a.f.fieldOf("operation").forGetter(esc.b::c),
                  eup.a.fieldOf("amount").forGetter(esc.b::d),
                  h.fieldOf("slot").forGetter(esc.b::e),
                  kc.d.optionalFieldOf("id").forGetter(esc.b::f)
               )
               .apply($$0, esc.b::new)
      );

      public String a() {
         return this.b;
      }

      public ji<but> b() {
         return this.c;
      }

      public buw.a c() {
         return this.d;
      }

      public euo d() {
         return this.e;
      }

      public List<btd> e() {
         return this.f;
      }

      public Optional<UUID> f() {
         return this.g;
      }
   }

   public static class c {
      private final String a;
      private final ji<but> b;
      private final buw.a c;
      private final euo d;
      private Optional<UUID> e = Optional.empty();
      private final Set<btd> f = EnumSet.noneOf(btd.class);

      public c(String $$0, ji<but> $$1, buw.a $$2, euo $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public esc.c a(btd $$0) {
         this.f.add($$0);
         return this;
      }

      public esc.c a(UUID $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public esc.b a() {
         return new esc.b(this.a, this.b, this.c, this.d, List.copyOf(this.f), this.e);
      }
   }
}
