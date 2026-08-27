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

public class eec extends edw {
   public static final Codec<eec> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(arj.a(eec.b.a.listOf()).fieldOf("modifiers").forGetter($$0x -> $$0x.b)).apply($$0, eec::new)
   );
   private final List<eec.b> b;

   eec(List<efj> $$0, List<eec.b> $$1) {
      super($$0);
      this.b = List.copyOf($$1);
   }

   @Override
   public edy b() {
      return edz.k;
   }

   @Override
   public Set<ees<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cjl a(cjl $$0, eck $$1) {
      ash $$2 = $$1.b();

      for (eec.b $$3 : this.b) {
         UUID $$4 = $$3.g.orElseGet(UUID::randomUUID);
         bjb $$5 = ac.a($$3.f, $$2);
         $$0.a($$3.c.a(), new bkq($$4, $$3.b, (double)$$3.e.b($$1), $$3.d), $$5);
      }

      return $$0;
   }

   public static eec.c a(String $$0, he<bkn> $$1, bkq.a $$2, ege $$3) {
      return new eec.c($$0, $$1, $$2, $$3);
   }

   public static eec.a c() {
      return new eec.a();
   }

   public static class a extends edw.a<eec.a> {
      private final List<eec.b> a = Lists.newArrayList();

      protected eec.a a() {
         return this;
      }

      public eec.a a(eec.c $$0) {
         this.a.add($$0.a());
         return this;
      }

      @Override
      public edx b() {
         return new eec(this.g(), this.a);
      }
   }

   static record b(String b, he<bkn> c, bkq.a d, ege e, List<bjb> f, Optional<UUID> g) {
      private static final Codec<List<bjb>> h = arj.a(
         Codec.either(bjb.g, bjb.g.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((bjb)$$0.get(0)) : Either.right($$0))
      );
      public static final Codec<eec.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("name").forGetter(eec.b::a),
                  jb.v.r().fieldOf("attribute").forGetter(eec.b::b),
                  bkq.a.d.fieldOf("operation").forGetter(eec.b::c),
                  egf.a.fieldOf("amount").forGetter(eec.b::d),
                  h.fieldOf("slot").forGetter(eec.b::e),
                  arj.a(hx.b, "id").forGetter(eec.b::f)
               )
               .apply($$0, eec.b::new)
      );

      public String a() {
         return this.b;
      }

      public he<bkn> b() {
         return this.c;
      }

      public bkq.a c() {
         return this.d;
      }

      public ege d() {
         return this.e;
      }

      public List<bjb> e() {
         return this.f;
      }

      public Optional<UUID> f() {
         return this.g;
      }
   }

   public static class c {
      private final String a;
      private final he<bkn> b;
      private final bkq.a c;
      private final ege d;
      private Optional<UUID> e = Optional.empty();
      private final Set<bjb> f = EnumSet.noneOf(bjb.class);

      public c(String $$0, he<bkn> $$1, bkq.a $$2, ege $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public eec.c a(bjb $$0) {
         this.f.add($$0);
         return this;
      }

      public eec.c a(UUID $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public eec.b a() {
         return new eec.b(this.a, this.b, this.c, this.d, List.copyOf(this.f), this.e);
      }
   }
}
