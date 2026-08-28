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

public class erw extends erp {
   public static final MapCodec<erw> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ayc.a(erw.b.a.listOf()).fieldOf("modifiers").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("replace", true).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, erw::new)
   );
   private final List<erw.b> b;
   private final boolean c;

   erw(List<etn> $$0, List<erw.b> $$1, boolean $$2) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public err<erw> b() {
      return ers.o;
   }

   @Override
   public Set<esw<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cuk a(cuk $$0, eqd $$1) {
      if (this.c) {
         $$0.b(km.m, this.a($$1, cxf.a));
      } else {
         $$0.a(km.m, cxf.a, $$2 -> $$2.b().isEmpty() ? this.a($$1, $$0.g().j()) : this.a($$1, $$2));
      }

      return $$0;
   }

   private cxf a(eqd $$0, cxf $$1) {
      azc $$2 = $$0.b();

      for (erw.b $$3 : this.b) {
         UUID $$4 = $$3.g.orElseGet(UUID::randomUUID);
         bsx $$5 = ac.a($$3.f, $$2);
         $$1 = $$1.a($$3.c, new buq($$4, $$3.b, (double)$$3.e.b($$0), $$3.d), $$5);
      }

      return $$1;
   }

   public static erw.c a(String $$0, ji<bun> $$1, buq.a $$2, eui $$3) {
      return new erw.c($$0, $$1, $$2, $$3);
   }

   public static erw.a c() {
      return new erw.a();
   }

   public static class a extends erp.a<erw.a> {
      private final boolean a;
      private final List<erw.b> b = Lists.newArrayList();

      public a(boolean $$0) {
         this.a = $$0;
      }

      public a() {
         this(false);
      }

      protected erw.a a() {
         return this;
      }

      public erw.a a(erw.c $$0) {
         this.b.add($$0.a());
         return this;
      }

      @Override
      public erq b() {
         return new erw(this.g(), this.b, this.a);
      }
   }

   static record b(String b, ji<bun> c, buq.a d, eui e, List<bsx> f, Optional<UUID> g) {
      private static final Codec<List<bsx>> h = ayc.a(
         Codec.either(bsx.l, bsx.l.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((bsx)$$0.getFirst()) : Either.right($$0))
      );
      public static final Codec<erw.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("name").forGetter(erw.b::a),
                  lp.u.r().fieldOf("attribute").forGetter(erw.b::b),
                  buq.a.f.fieldOf("operation").forGetter(erw.b::c),
                  euj.a.fieldOf("amount").forGetter(erw.b::d),
                  h.fieldOf("slot").forGetter(erw.b::e),
                  kc.d.optionalFieldOf("id").forGetter(erw.b::f)
               )
               .apply($$0, erw.b::new)
      );

      public String a() {
         return this.b;
      }

      public ji<bun> b() {
         return this.c;
      }

      public buq.a c() {
         return this.d;
      }

      public eui d() {
         return this.e;
      }

      public List<bsx> e() {
         return this.f;
      }

      public Optional<UUID> f() {
         return this.g;
      }
   }

   public static class c {
      private final String a;
      private final ji<bun> b;
      private final buq.a c;
      private final eui d;
      private Optional<UUID> e = Optional.empty();
      private final Set<bsx> f = EnumSet.noneOf(bsx.class);

      public c(String $$0, ji<bun> $$1, buq.a $$2, eui $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public erw.c a(bsx $$0) {
         this.f.add($$0);
         return this;
      }

      public erw.c a(UUID $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public erw.b a() {
         return new erw.b(this.a, this.b, this.c, this.d, List.copyOf(this.f), this.e);
      }
   }
}
