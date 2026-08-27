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

public class edz extends edt {
   public static final Codec<edz> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(aqy.a(edz.b.a.listOf()).fieldOf("modifiers").forGetter($$0x -> $$0x.b)).apply($$0, edz::new)
   );
   private final List<edz.b> b;

   edz(List<efg> $$0, List<edz.b> $$1) {
      super($$0);
      this.b = List.copyOf($$1);
   }

   @Override
   public edv b() {
      return edw.k;
   }

   @Override
   public Set<eep<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public ciy a(ciy $$0, ech $$1) {
      aru $$2 = $$1.b();

      for (edz.b $$3 : this.b) {
         UUID $$4 = $$3.g.orElseGet(UUID::randomUUID);
         bin $$5 = ac.a($$3.f, $$2);
         $$0.a($$3.c.a(), new bkd($$4, $$3.b, (double)$$3.e.b($$1), $$3.d), $$5);
      }

      return $$0;
   }

   public static edz.c a(String $$0, he<bka> $$1, bkd.a $$2, egb $$3) {
      return new edz.c($$0, $$1, $$2, $$3);
   }

   public static edz.a c() {
      return new edz.a();
   }

   public static class a extends edt.a<edz.a> {
      private final List<edz.b> a = Lists.newArrayList();

      protected edz.a a() {
         return this;
      }

      public edz.a a(edz.c $$0) {
         this.a.add($$0.a());
         return this;
      }

      @Override
      public edu b() {
         return new edz(this.g(), this.a);
      }
   }

   static record b(String b, he<bka> c, bkd.a d, egb e, List<bin> f, Optional<UUID> g) {
      private static final Codec<List<bin>> h = aqy.a(
         Codec.either(bin.g, bin.g.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((bin)$$0.get(0)) : Either.right($$0))
      );
      public static final Codec<edz.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("name").forGetter(edz.b::a),
                  jb.v.r().fieldOf("attribute").forGetter(edz.b::b),
                  bkd.a.d.fieldOf("operation").forGetter(edz.b::c),
                  egc.a.fieldOf("amount").forGetter(edz.b::d),
                  h.fieldOf("slot").forGetter(edz.b::e),
                  aqy.a(hy.b, "id").forGetter(edz.b::f)
               )
               .apply($$0, edz.b::new)
      );

      public String a() {
         return this.b;
      }

      public he<bka> b() {
         return this.c;
      }

      public bkd.a c() {
         return this.d;
      }

      public egb d() {
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
      private final he<bka> b;
      private final bkd.a c;
      private final egb d;
      private Optional<UUID> e = Optional.empty();
      private final Set<bin> f = EnumSet.noneOf(bin.class);

      public c(String $$0, he<bka> $$1, bkd.a $$2, egb $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public edz.c a(bin $$0) {
         this.f.add($$0);
         return this;
      }

      public edz.c a(UUID $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public edz.b a() {
         return new edz.b(this.a, this.b, this.c, this.d, List.copyOf(this.f), this.e);
      }
   }
}
