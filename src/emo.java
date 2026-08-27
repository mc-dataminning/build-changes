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

public class emo extends emi {
   public static final Codec<emo> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(awe.a(emo.b.a.listOf()).fieldOf("modifiers").forGetter($$0x -> $$0x.b)).apply($$0, emo::new)
   );
   private final List<emo.b> b;

   emo(List<env> $$0, List<emo.b> $$1) {
      super($$0);
      this.b = List.copyOf($$1);
   }

   @Override
   public emk b() {
      return eml.k;
   }

   @Override
   public Set<ene<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cqm a(cqm $$0, ekw $$1) {
      axd $$2 = $$1.b();

      for (emo.b $$3 : this.b) {
         UUID $$4 = $$3.g.orElseGet(UUID::randomUUID);
         bpe $$5 = ac.a($$3.f, $$2);
         $$0.a($$3.c, new bqu($$4, $$3.b, (double)$$3.e.b($$1), $$3.d), $$5);
      }

      return $$0;
   }

   public static emo.c a(String $$0, il<bqr> $$1, bqu.a $$2, eoq $$3) {
      return new emo.c($$0, $$1, $$2, $$3);
   }

   public static emo.a c() {
      return new emo.a();
   }

   public static class a extends emi.a<emo.a> {
      private final List<emo.b> a = Lists.newArrayList();

      protected emo.a a() {
         return this;
      }

      public emo.a a(emo.c $$0) {
         this.a.add($$0.a());
         return this;
      }

      @Override
      public emj b() {
         return new emo(this.g(), this.a);
      }
   }

   static record b(String b, il<bqr> c, bqu.a d, eoq e, List<bpe> f, Optional<UUID> g) {
      private static final Codec<List<bpe>> h = awe.a(
         Codec.either(bpe.h, bpe.h.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((bpe)$$0.get(0)) : Either.right($$0))
      );
      public static final Codec<emo.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("name").forGetter(emo.b::a),
                  ki.u.r().fieldOf("attribute").forGetter(emo.b::b),
                  bqu.a.f.fieldOf("operation").forGetter(emo.b::c),
                  eor.a.fieldOf("amount").forGetter(emo.b::d),
                  h.fieldOf("slot").forGetter(emo.b::e),
                  awe.a(jf.d, "id").forGetter(emo.b::f)
               )
               .apply($$0, emo.b::new)
      );

      public String a() {
         return this.b;
      }

      public il<bqr> b() {
         return this.c;
      }

      public bqu.a c() {
         return this.d;
      }

      public eoq d() {
         return this.e;
      }

      public List<bpe> e() {
         return this.f;
      }

      public Optional<UUID> f() {
         return this.g;
      }
   }

   public static class c {
      private final String a;
      private final il<bqr> b;
      private final bqu.a c;
      private final eoq d;
      private Optional<UUID> e = Optional.empty();
      private final Set<bpe> f = EnumSet.noneOf(bpe.class);

      public c(String $$0, il<bqr> $$1, bqu.a $$2, eoq $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public emo.c a(bpe $$0) {
         this.f.add($$0);
         return this;
      }

      public emo.c a(UUID $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public emo.b a() {
         return new emo.b(this.a, this.b, this.c, this.d, List.copyOf(this.f), this.e);
      }
   }
}
