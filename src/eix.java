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

public class eix extends eir {
   public static final Codec<eix> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(atx.a(eix.b.a.listOf()).fieldOf("modifiers").forGetter($$0x -> $$0x.b)).apply($$0, eix::new)
   );
   private final List<eix.b> b;

   eix(List<eke> $$0, List<eix.b> $$1) {
      super($$0);
      this.b = List.copyOf($$1);
   }

   @Override
   public eit b() {
      return eiu.k;
   }

   @Override
   public Set<ejn<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cng a(cng $$0, ehf $$1) {
      auw $$2 = $$1.b();

      for (eix.b $$3 : this.b) {
         UUID $$4 = $$3.g.orElseGet(UUID::randomUUID);
         bmd $$5 = ac.a($$3.f, $$2);
         $$0.a($$3.c, new bns($$4, $$3.b, (double)$$3.e.b($$1), $$3.d), $$5);
      }

      return $$0;
   }

   public static eix.c a(String $$0, ih<bnp> $$1, bns.a $$2, ekz $$3) {
      return new eix.c($$0, $$1, $$2, $$3);
   }

   public static eix.a c() {
      return new eix.a();
   }

   public static class a extends eir.a<eix.a> {
      private final List<eix.b> a = Lists.newArrayList();

      protected eix.a a() {
         return this;
      }

      public eix.a a(eix.c $$0) {
         this.a.add($$0.a());
         return this;
      }

      @Override
      public eis b() {
         return new eix(this.g(), this.a);
      }
   }

   static record b(String b, ih<bnp> c, bns.a d, ekz e, List<bmd> f, Optional<UUID> g) {
      private static final Codec<List<bmd>> h = atx.a(
         Codec.either(bmd.g, bmd.g.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((bmd)$$0.get(0)) : Either.right($$0))
      );
      public static final Codec<eix.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("name").forGetter(eix.b::a),
                  kd.u.r().fieldOf("attribute").forGetter(eix.b::b),
                  bns.a.d.fieldOf("operation").forGetter(eix.b::c),
                  ela.a.fieldOf("amount").forGetter(eix.b::d),
                  h.fieldOf("slot").forGetter(eix.b::e),
                  atx.a(ja.c, "id").forGetter(eix.b::f)
               )
               .apply($$0, eix.b::new)
      );

      public String a() {
         return this.b;
      }

      public ih<bnp> b() {
         return this.c;
      }

      public bns.a c() {
         return this.d;
      }

      public ekz d() {
         return this.e;
      }

      public List<bmd> e() {
         return this.f;
      }

      public Optional<UUID> f() {
         return this.g;
      }
   }

   public static class c {
      private final String a;
      private final ih<bnp> b;
      private final bns.a c;
      private final ekz d;
      private Optional<UUID> e = Optional.empty();
      private final Set<bmd> f = EnumSet.noneOf(bmd.class);

      public c(String $$0, ih<bnp> $$1, bns.a $$2, ekz $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public eix.c a(bmd $$0) {
         this.f.add($$0);
         return this;
      }

      public eix.c a(UUID $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public eix.b a() {
         return new eix.b(this.a, this.b, this.c, this.d, List.copyOf(this.f), this.e);
      }
   }
}
