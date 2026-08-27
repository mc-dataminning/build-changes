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

public class egu extends ego {
   public static final Codec<egu> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(asy.a(egu.b.a.listOf()).fieldOf("modifiers").forGetter($$0x -> $$0x.b)).apply($$0, egu::new)
   );
   private final List<egu.b> b;

   egu(List<eib> $$0, List<egu.b> $$1) {
      super($$0);
      this.b = List.copyOf($$1);
   }

   @Override
   public egq b() {
      return egr.k;
   }

   @Override
   public Set<ehk<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public clo a(clo $$0, efc $$1) {
      atw $$2 = $$1.b();

      for (egu.b $$3 : this.b) {
         UUID $$4 = $$3.g.orElseGet(UUID::randomUUID);
         bla $$5 = ac.a($$3.f, $$2);
         $$0.a($$3.c.a(), new bmp($$4, $$3.b, (double)$$3.e.b($$1), $$3.d), $$5);
      }

      return $$0;
   }

   public static egu.c a(String $$0, ig<bmm> $$1, bmp.a $$2, eiw $$3) {
      return new egu.c($$0, $$1, $$2, $$3);
   }

   public static egu.a c() {
      return new egu.a();
   }

   public static class a extends ego.a<egu.a> {
      private final List<egu.b> a = Lists.newArrayList();

      protected egu.a a() {
         return this;
      }

      public egu.a a(egu.c $$0) {
         this.a.add($$0.a());
         return this;
      }

      @Override
      public egp b() {
         return new egu(this.g(), this.a);
      }
   }

   static record b(String b, ig<bmm> c, bmp.a d, eiw e, List<bla> f, Optional<UUID> g) {
      private static final Codec<List<bla>> h = asy.a(
         Codec.either(bla.g, bla.g.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((bla)$$0.get(0)) : Either.right($$0))
      );
      public static final Codec<egu.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("name").forGetter(egu.b::a),
                  kc.v.r().fieldOf("attribute").forGetter(egu.b::b),
                  bmp.a.d.fieldOf("operation").forGetter(egu.b::c),
                  eix.a.fieldOf("amount").forGetter(egu.b::d),
                  h.fieldOf("slot").forGetter(egu.b::e),
                  asy.a(iz.b, "id").forGetter(egu.b::f)
               )
               .apply($$0, egu.b::new)
      );

      public String a() {
         return this.b;
      }

      public ig<bmm> b() {
         return this.c;
      }

      public bmp.a c() {
         return this.d;
      }

      public eiw d() {
         return this.e;
      }

      public List<bla> e() {
         return this.f;
      }

      public Optional<UUID> f() {
         return this.g;
      }
   }

   public static class c {
      private final String a;
      private final ig<bmm> b;
      private final bmp.a c;
      private final eiw d;
      private Optional<UUID> e = Optional.empty();
      private final Set<bla> f = EnumSet.noneOf(bla.class);

      public c(String $$0, ig<bmm> $$1, bmp.a $$2, eiw $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public egu.c a(bla $$0) {
         this.f.add($$0);
         return this;
      }

      public egu.c a(UUID $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public egu.b a() {
         return new egu.b(this.a, this.b, this.c, this.d, List.copyOf(this.f), this.e);
      }
   }
}
