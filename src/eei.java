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

public class eei extends eec {
   public static final Codec<eei> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(arg.a(eei.b.a.listOf()).fieldOf("modifiers").forGetter($$0x -> $$0x.b)).apply($$0, eei::new)
   );
   private final List<eei.b> b;

   eei(List<efp> $$0, List<eei.b> $$1) {
      super($$0);
      this.b = List.copyOf($$1);
   }

   @Override
   public eee b() {
      return eef.k;
   }

   @Override
   public Set<eey<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cjf a(cjf $$0, ecq $$1) {
      asc $$2 = $$1.b();

      for (eei.b $$3 : this.b) {
         UUID $$4 = $$3.g.orElseGet(UUID::randomUUID);
         biv $$5 = ac.a($$3.f, $$2);
         $$0.a($$3.c.a(), new bkk($$4, $$3.b, (double)$$3.e.b($$1), $$3.d), $$5);
      }

      return $$0;
   }

   public static eei.c a(String $$0, hg<bkh> $$1, bkk.a $$2, egk $$3) {
      return new eei.c($$0, $$1, $$2, $$3);
   }

   public static eei.a c() {
      return new eei.a();
   }

   public static class a extends eec.a<eei.a> {
      private final List<eei.b> a = Lists.newArrayList();

      protected eei.a a() {
         return this;
      }

      public eei.a a(eei.c $$0) {
         this.a.add($$0.a());
         return this;
      }

      @Override
      public eed b() {
         return new eei(this.g(), this.a);
      }
   }

   static record b(String b, hg<bkh> c, bkk.a d, egk e, List<biv> f, Optional<UUID> g) {
      private static final Codec<List<biv>> h = arg.a(
         Codec.either(biv.g, biv.g.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((biv)$$0.get(0)) : Either.right($$0))
      );
      public static final Codec<eei.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("name").forGetter(eei.b::a),
                  jd.v.r().fieldOf("attribute").forGetter(eei.b::b),
                  bkk.a.d.fieldOf("operation").forGetter(eei.b::c),
                  egl.a.fieldOf("amount").forGetter(eei.b::d),
                  h.fieldOf("slot").forGetter(eei.b::e),
                  arg.a(ia.b, "id").forGetter(eei.b::f)
               )
               .apply($$0, eei.b::new)
      );

      public String a() {
         return this.b;
      }

      public hg<bkh> b() {
         return this.c;
      }

      public bkk.a c() {
         return this.d;
      }

      public egk d() {
         return this.e;
      }

      public List<biv> e() {
         return this.f;
      }

      public Optional<UUID> f() {
         return this.g;
      }
   }

   public static class c {
      private final String a;
      private final hg<bkh> b;
      private final bkk.a c;
      private final egk d;
      private Optional<UUID> e = Optional.empty();
      private final Set<biv> f = EnumSet.noneOf(biv.class);

      public c(String $$0, hg<bkh> $$1, bkk.a $$2, egk $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public eei.c a(biv $$0) {
         this.f.add($$0);
         return this;
      }

      public eei.c a(UUID $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public eei.b a() {
         return new eei.b(this.a, this.b, this.c, this.d, List.copyOf(this.f), this.e);
      }
   }
}
