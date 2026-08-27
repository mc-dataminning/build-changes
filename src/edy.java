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

public class edy extends eds {
   public static final Codec<edy> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(aqy.a(edy.b.a.listOf()).fieldOf("modifiers").forGetter($$0x -> $$0x.b)).apply($$0, edy::new)
   );
   private final List<edy.b> b;

   edy(List<eff> $$0, List<edy.b> $$1) {
      super($$0);
      this.b = List.copyOf($$1);
   }

   @Override
   public edu b() {
      return edv.k;
   }

   @Override
   public Set<eeo<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cix a(cix $$0, ecg $$1) {
      aru $$2 = $$1.b();

      for (edy.b $$3 : this.b) {
         UUID $$4 = $$3.g.orElseGet(UUID::randomUUID);
         bin $$5 = ac.a($$3.f, $$2);
         $$0.a($$3.c.a(), new bkc($$4, $$3.b, (double)$$3.e.b($$1), $$3.d), $$5);
      }

      return $$0;
   }

   public static edy.c a(String $$0, he<bjz> $$1, bkc.a $$2, ega $$3) {
      return new edy.c($$0, $$1, $$2, $$3);
   }

   public static edy.a c() {
      return new edy.a();
   }

   public static class a extends eds.a<edy.a> {
      private final List<edy.b> a = Lists.newArrayList();

      protected edy.a a() {
         return this;
      }

      public edy.a a(edy.c $$0) {
         this.a.add($$0.a());
         return this;
      }

      @Override
      public edt b() {
         return new edy(this.g(), this.a);
      }
   }

   static record b(String b, he<bjz> c, bkc.a d, ega e, List<bin> f, Optional<UUID> g) {
      private static final Codec<List<bin>> h = aqy.a(
         Codec.either(bin.g, bin.g.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((bin)$$0.get(0)) : Either.right($$0))
      );
      public static final Codec<edy.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("name").forGetter(edy.b::a),
                  jb.v.r().fieldOf("attribute").forGetter(edy.b::b),
                  bkc.a.d.fieldOf("operation").forGetter(edy.b::c),
                  egb.a.fieldOf("amount").forGetter(edy.b::d),
                  h.fieldOf("slot").forGetter(edy.b::e),
                  aqy.a(hy.b, "id").forGetter(edy.b::f)
               )
               .apply($$0, edy.b::new)
      );

      public String a() {
         return this.b;
      }

      public he<bjz> b() {
         return this.c;
      }

      public bkc.a c() {
         return this.d;
      }

      public ega d() {
         return this.e;
      }

      public List<bin> e() {
         return this.f;
      }

      public Optional<UUID> f() {
         return this.g;
      }
   }

   public static class c {
      private final String a;
      private final he<bjz> b;
      private final bkc.a c;
      private final ega d;
      private Optional<UUID> e = Optional.empty();
      private final Set<bin> f = EnumSet.noneOf(bin.class);

      public c(String $$0, he<bjz> $$1, bkc.a $$2, ega $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public edy.c a(bin $$0) {
         this.f.add($$0);
         return this;
      }

      public edy.c a(UUID $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public edy.b a() {
         return new edy.b(this.a, this.b, this.c, this.d, List.copyOf(this.f), this.e);
      }
   }
}
