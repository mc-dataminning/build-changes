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

public class esn extends esh {
   public static final MapCodec<esn> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(esn.b.a.listOf().fieldOf("modifiers").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("replace", true).forGetter($$0x -> $$0x.c))
            )
            .apply($$0, esn::new)
   );
   private final List<esn.b> b;
   private final boolean c;

   esn(List<euf> $$0, List<esn.b> $$1, boolean $$2) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public esj<esn> b() {
      return esk.o;
   }

   @Override
   public Set<etn<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cuc a(cuc $$0, equ $$1) {
      if (this.c) {
         $$0.b(kn.n, this.a($$1, cww.a));
      } else {
         $$0.a(kn.n, cww.a, $$2 -> $$2.b().isEmpty() ? this.a($$1, $$0.g().j()) : this.a($$1, $$2));
      }

      return $$0;
   }

   private cww a(equ $$0, cww $$1) {
      ayo $$2 = $$0.b();

      for (esn.b $$3 : this.b) {
         UUID $$4 = $$3.g.orElseGet(UUID::randomUUID);
         bso $$5 = ac.a($$3.f, $$2);
         $$1 = $$1.a($$3.c, new buh($$4, $$3.b, (double)$$3.e.b($$0), $$3.d), $$5);
      }

      return $$1;
   }

   public static esn.c a(String $$0, jj<bue> $$1, buh.a $$2, evb $$3) {
      return new esn.c($$0, $$1, $$2, $$3);
   }

   public static esn.a c() {
      return new esn.a();
   }

   public static class a extends esh.a<esn.a> {
      private final boolean a;
      private final List<esn.b> b = Lists.newArrayList();

      public a(boolean $$0) {
         this.a = $$0;
      }

      public a() {
         this(false);
      }

      protected esn.a a() {
         return this;
      }

      public esn.a a(esn.c $$0) {
         this.b.add($$0.a());
         return this;
      }

      @Override
      public esi b() {
         return new esn(this.g(), this.b, this.a);
      }
   }

   static record b(String b, jj<bue> c, buh.a d, evb e, List<bso> f, Optional<UUID> g) {
      private static final Codec<List<bso>> h = axo.a(
         Codec.either(bso.l, bso.l.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((bso)$$0.getFirst()) : Either.right($$0))
      );
      public static final Codec<esn.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("name").forGetter(esn.b::a),
                  lq.s.s().fieldOf("attribute").forGetter(esn.b::b),
                  buh.a.f.fieldOf("operation").forGetter(esn.b::c),
                  evc.a.fieldOf("amount").forGetter(esn.b::d),
                  h.fieldOf("slot").forGetter(esn.b::e),
                  kd.d.optionalFieldOf("id").forGetter(esn.b::f)
               )
               .apply($$0, esn.b::new)
      );

      public String a() {
         return this.b;
      }

      public jj<bue> b() {
         return this.c;
      }

      public buh.a c() {
         return this.d;
      }

      public evb d() {
         return this.e;
      }

      public List<bso> e() {
         return this.f;
      }

      public Optional<UUID> f() {
         return this.g;
      }
   }

   public static class c {
      private final String a;
      private final jj<bue> b;
      private final buh.a c;
      private final evb d;
      private Optional<UUID> e = Optional.empty();
      private final Set<bso> f = EnumSet.noneOf(bso.class);

      public c(String $$0, jj<bue> $$1, buh.a $$2, evb $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public esn.c a(bso $$0) {
         this.f.add($$0);
         return this;
      }

      public esn.c a(UUID $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public esn.b a() {
         return new esn.b(this.a, this.b, this.c, this.d, List.copyOf(this.f), this.e);
      }
   }
}
