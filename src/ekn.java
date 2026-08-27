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

public class ekn extends ekh {
   public static final Codec<ekn> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(avp.a(ekn.b.a.listOf()).fieldOf("modifiers").forGetter($$0x -> $$0x.b)).apply($$0, ekn::new)
   );
   private final List<ekn.b> b;

   ekn(List<elu> $$0, List<ekn.b> $$1) {
      super($$0);
      this.b = List.copyOf($$1);
   }

   @Override
   public ekj b() {
      return ekk.k;
   }

   @Override
   public Set<eld<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public coz a(coz $$0, eiv $$1) {
      awo $$2 = $$1.b();

      for (ekn.b $$3 : this.b) {
         UUID $$4 = $$3.g.orElseGet(UUID::randomUUID);
         bnv $$5 = ac.a($$3.f, $$2);
         $$0.a($$3.c, new bpj($$4, $$3.b, (double)$$3.e.b($$1), $$3.d), $$5);
      }

      return $$0;
   }

   public static ekn.c a(String $$0, ij<bpg> $$1, bpj.a $$2, emp $$3) {
      return new ekn.c($$0, $$1, $$2, $$3);
   }

   public static ekn.a c() {
      return new ekn.a();
   }

   public static class a extends ekh.a<ekn.a> {
      private final List<ekn.b> a = Lists.newArrayList();

      protected ekn.a a() {
         return this;
      }

      public ekn.a a(ekn.c $$0) {
         this.a.add($$0.a());
         return this;
      }

      @Override
      public eki b() {
         return new ekn(this.g(), this.a);
      }
   }

   static record b(String b, ij<bpg> c, bpj.a d, emp e, List<bnv> f, Optional<UUID> g) {
      private static final Codec<List<bnv>> h = avp.a(
         Codec.either(bnv.g, bnv.g.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((bnv)$$0.get(0)) : Either.right($$0))
      );
      public static final Codec<ekn.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("name").forGetter(ekn.b::a),
                  kf.u.r().fieldOf("attribute").forGetter(ekn.b::b),
                  bpj.a.f.fieldOf("operation").forGetter(ekn.b::c),
                  emq.a.fieldOf("amount").forGetter(ekn.b::d),
                  h.fieldOf("slot").forGetter(ekn.b::e),
                  avp.a(jc.c, "id").forGetter(ekn.b::f)
               )
               .apply($$0, ekn.b::new)
      );

      public String a() {
         return this.b;
      }

      public ij<bpg> b() {
         return this.c;
      }

      public bpj.a c() {
         return this.d;
      }

      public emp d() {
         return this.e;
      }

      public List<bnv> e() {
         return this.f;
      }

      public Optional<UUID> f() {
         return this.g;
      }
   }

   public static class c {
      private final String a;
      private final ij<bpg> b;
      private final bpj.a c;
      private final emp d;
      private Optional<UUID> e = Optional.empty();
      private final Set<bnv> f = EnumSet.noneOf(bnv.class);

      public c(String $$0, ij<bpg> $$1, bpj.a $$2, emp $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public ekn.c a(bnv $$0) {
         this.f.add($$0);
         return this;
      }

      public ekn.c a(UUID $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public ekn.b a() {
         return new ekn.b(this.a, this.b, this.c, this.d, List.copyOf(this.f), this.e);
      }
   }
}
