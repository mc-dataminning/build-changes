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

public class egp extends egj {
   public static final Codec<egp> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(asu.a(egp.b.a.listOf()).fieldOf("modifiers").forGetter($$0x -> $$0x.b)).apply($$0, egp::new)
   );
   private final List<egp.b> b;

   egp(List<ehw> $$0, List<egp.b> $$1) {
      super($$0);
      this.b = List.copyOf($$1);
   }

   @Override
   public egl b() {
      return egm.k;
   }

   @Override
   public Set<ehf<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public clj a(clj $$0, eex $$1) {
      ats $$2 = $$1.b();

      for (egp.b $$3 : this.b) {
         UUID $$4 = $$3.g.orElseGet(UUID::randomUUID);
         bkv $$5 = ac.a($$3.f, $$2);
         $$0.a($$3.c.a(), new bmk($$4, $$3.b, (double)$$3.e.b($$1), $$3.d), $$5);
      }

      return $$0;
   }

   public static egp.c a(String $$0, ib<bmh> $$1, bmk.a $$2, eir $$3) {
      return new egp.c($$0, $$1, $$2, $$3);
   }

   public static egp.a c() {
      return new egp.a();
   }

   public static class a extends egj.a<egp.a> {
      private final List<egp.b> a = Lists.newArrayList();

      protected egp.a a() {
         return this;
      }

      public egp.a a(egp.c $$0) {
         this.a.add($$0.a());
         return this;
      }

      @Override
      public egk b() {
         return new egp(this.g(), this.a);
      }
   }

   static record b(String b, ib<bmh> c, bmk.a d, eir e, List<bkv> f, Optional<UUID> g) {
      private static final Codec<List<bkv>> h = asu.a(
         Codec.either(bkv.g, bkv.g.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((bkv)$$0.get(0)) : Either.right($$0))
      );
      public static final Codec<egp.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("name").forGetter(egp.b::a),
                  jy.v.r().fieldOf("attribute").forGetter(egp.b::b),
                  bmk.a.d.fieldOf("operation").forGetter(egp.b::c),
                  eis.a.fieldOf("amount").forGetter(egp.b::d),
                  h.fieldOf("slot").forGetter(egp.b::e),
                  asu.a(iv.b, "id").forGetter(egp.b::f)
               )
               .apply($$0, egp.b::new)
      );

      public String a() {
         return this.b;
      }

      public ib<bmh> b() {
         return this.c;
      }

      public bmk.a c() {
         return this.d;
      }

      public eir d() {
         return this.e;
      }

      public List<bkv> e() {
         return this.f;
      }

      public Optional<UUID> f() {
         return this.g;
      }
   }

   public static class c {
      private final String a;
      private final ib<bmh> b;
      private final bmk.a c;
      private final eir d;
      private Optional<UUID> e = Optional.empty();
      private final Set<bkv> f = EnumSet.noneOf(bkv.class);

      public c(String $$0, ib<bmh> $$1, bmk.a $$2, eir $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public egp.c a(bkv $$0) {
         this.f.add($$0);
         return this;
      }

      public egp.c a(UUID $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public egp.b a() {
         return new egp.b(this.a, this.b, this.c, this.d, List.copyOf(this.f), this.e);
      }
   }
}
