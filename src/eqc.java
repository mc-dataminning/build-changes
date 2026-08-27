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

public class eqc extends epw {
   public static final Codec<eqc> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(axh.a(eqc.b.a.listOf()).fieldOf("modifiers").forGetter($$0x -> $$0x.b)).apply($$0, eqc::new)
   );
   private final List<eqc.b> b;

   eqc(List<erq> $$0, List<eqc.b> $$1) {
      super($$0);
      this.b = List.copyOf($$1);
   }

   @Override
   public epy b() {
      return epz.n;
   }

   @Override
   public Set<eqz<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public csz a(csz $$0, eol $$1) {
      $$0.a(ka.l, cvs.a, $$1x -> {
         ayg $$2 = $$1.b();

         for (eqc.b $$3 : this.b) {
            UUID $$4 = $$3.g.orElseGet(UUID::randomUUID);
            brp $$5 = ac.a($$3.f, $$2);
            $$1x = $$1x.a($$3.c, new btf($$4, $$3.b, (double)$$3.e.b($$1), $$3.d), $$5);
         }

         return $$1x;
      });
      return $$0;
   }

   public static eqc.c a(String $$0, iw<btc> $$1, btf.a $$2, esl $$3) {
      return new eqc.c($$0, $$1, $$2, $$3);
   }

   public static eqc.a c() {
      return new eqc.a();
   }

   public static class a extends epw.a<eqc.a> {
      private final List<eqc.b> a = Lists.newArrayList();

      protected eqc.a a() {
         return this;
      }

      public eqc.a a(eqc.c $$0) {
         this.a.add($$0.a());
         return this;
      }

      @Override
      public epx b() {
         return new eqc(this.g(), this.a);
      }
   }

   static record b(String b, iw<btc> c, btf.a d, esl e, List<brp> f, Optional<UUID> g) {
      private static final Codec<List<brp>> h = axh.a(
         Codec.either(brp.k, brp.k.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((brp)$$0.get(0)) : Either.right($$0))
      );
      public static final Codec<eqc.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("name").forGetter(eqc.b::a),
                  ld.u.r().fieldOf("attribute").forGetter(eqc.b::b),
                  btf.a.f.fieldOf("operation").forGetter(eqc.b::c),
                  esm.a.fieldOf("amount").forGetter(eqc.b::d),
                  h.fieldOf("slot").forGetter(eqc.b::e),
                  axh.a(jq.d, "id").forGetter(eqc.b::f)
               )
               .apply($$0, eqc.b::new)
      );

      public String a() {
         return this.b;
      }

      public iw<btc> b() {
         return this.c;
      }

      public btf.a c() {
         return this.d;
      }

      public esl d() {
         return this.e;
      }

      public List<brp> e() {
         return this.f;
      }

      public Optional<UUID> f() {
         return this.g;
      }
   }

   public static class c {
      private final String a;
      private final iw<btc> b;
      private final btf.a c;
      private final esl d;
      private Optional<UUID> e = Optional.empty();
      private final Set<brp> f = EnumSet.noneOf(brp.class);

      public c(String $$0, iw<btc> $$1, btf.a $$2, esl $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public eqc.c a(brp $$0) {
         this.f.add($$0);
         return this;
      }

      public eqc.c a(UUID $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public eqc.b a() {
         return new eqc.b(this.a, this.b, this.c, this.d, List.copyOf(this.f), this.e);
      }
   }
}
