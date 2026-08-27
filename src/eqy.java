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

public class eqy extends eqs {
   public static final MapCodec<eqy> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axn.a(eqy.b.a.listOf()).fieldOf("modifiers").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("replace", true).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, eqy::new)
   );
   private final List<eqy.b> b;
   private final boolean c;

   eqy(List<esn> $$0, List<eqy.b> $$1, boolean $$2) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public equ b() {
      return eqv.n;
   }

   @Override
   public Set<erw<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public ctq a(ctq $$0, eph $$1) {
      if (this.c) {
         $$0.b(kb.m, this.a($$1, cwl.a));
      } else {
         $$0.a(kb.m, cwl.a, $$2 -> $$2.b().isEmpty() ? this.a($$1, $$0.g().j()) : this.a($$1, $$2));
      }

      return $$0;
   }

   private cwl a(eph $$0, cwl $$1) {
      aym $$2 = $$0.b();

      for (eqy.b $$3 : this.b) {
         UUID $$4 = $$3.g.orElseGet(UUID::randomUUID);
         bse $$5 = ac.a($$3.f, $$2);
         $$1 = $$1.a($$3.c, new btw($$4, $$3.b, (double)$$3.e.b($$0), $$3.d), $$5);
      }

      return $$1;
   }

   public static eqy.c a(String $$0, ix<btt> $$1, btw.a $$2, eti $$3) {
      return new eqy.c($$0, $$1, $$2, $$3);
   }

   public static eqy.a c() {
      return new eqy.a();
   }

   public static class a extends eqs.a<eqy.a> {
      private final boolean a;
      private final List<eqy.b> b = Lists.newArrayList();

      public a(boolean $$0) {
         this.a = $$0;
      }

      public a() {
         this(false);
      }

      protected eqy.a a() {
         return this;
      }

      public eqy.a a(eqy.c $$0) {
         this.b.add($$0.a());
         return this;
      }

      @Override
      public eqt b() {
         return new eqy(this.g(), this.b, this.a);
      }
   }

   static record b(String b, ix<btt> c, btw.a d, eti e, List<bse> f, Optional<UUID> g) {
      private static final Codec<List<bse>> h = axn.a(
         Codec.either(bse.l, bse.l.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((bse)$$0.getFirst()) : Either.right($$0))
      );
      public static final Codec<eqy.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("name").forGetter(eqy.b::a),
                  le.u.r().fieldOf("attribute").forGetter(eqy.b::b),
                  btw.a.f.fieldOf("operation").forGetter(eqy.b::c),
                  etj.a.fieldOf("amount").forGetter(eqy.b::d),
                  h.fieldOf("slot").forGetter(eqy.b::e),
                  jr.d.optionalFieldOf("id").forGetter(eqy.b::f)
               )
               .apply($$0, eqy.b::new)
      );

      public String a() {
         return this.b;
      }

      public ix<btt> b() {
         return this.c;
      }

      public btw.a c() {
         return this.d;
      }

      public eti d() {
         return this.e;
      }

      public List<bse> e() {
         return this.f;
      }

      public Optional<UUID> f() {
         return this.g;
      }
   }

   public static class c {
      private final String a;
      private final ix<btt> b;
      private final btw.a c;
      private final eti d;
      private Optional<UUID> e = Optional.empty();
      private final Set<bse> f = EnumSet.noneOf(bse.class);

      public c(String $$0, ix<btt> $$1, btw.a $$2, eti $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public eqy.c a(bse $$0) {
         this.f.add($$0);
         return this;
      }

      public eqy.c a(UUID $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public eqy.b a() {
         return new eqy.b(this.a, this.b, this.c, this.d, List.copyOf(this.f), this.e);
      }
   }
}
