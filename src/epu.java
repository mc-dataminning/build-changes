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

public class epu extends epo {
   public static final Codec<epu> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(axe.a(epu.b.a.listOf()).fieldOf("modifiers").forGetter($$0x -> $$0x.b)).apply($$0, epu::new)
   );
   private final List<epu.b> b;

   epu(List<erh> $$0, List<epu.b> $$1) {
      super($$0);
      this.b = List.copyOf($$1);
   }

   @Override
   public epq b() {
      return epr.l;
   }

   @Override
   public Set<eqq<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public csd a(csd $$0, eoa $$1) {
      $$0.a(jz.i, cuw.a, $$1x -> {
         ayd $$2 = $$1.b();

         for (epu.b $$3 : this.b) {
            UUID $$4 = $$3.g.orElseGet(UUID::randomUUID);
            bqt $$5 = ac.a($$3.f, $$2);
            $$1x = $$1x.a($$3.c, new bsj($$4, $$3.b, (double)$$3.e.b($$1), $$3.d), $$5);
         }

         return $$1x;
      });
      return $$0;
   }

   public static epu.c a(String $$0, iv<bsg> $$1, bsj.a $$2, esc $$3) {
      return new epu.c($$0, $$1, $$2, $$3);
   }

   public static epu.a c() {
      return new epu.a();
   }

   public static class a extends epo.a<epu.a> {
      private final List<epu.b> a = Lists.newArrayList();

      protected epu.a a() {
         return this;
      }

      public epu.a a(epu.c $$0) {
         this.a.add($$0.a());
         return this;
      }

      @Override
      public epp b() {
         return new epu(this.g(), this.a);
      }
   }

   static record b(String b, iv<bsg> c, bsj.a d, esc e, List<bqt> f, Optional<UUID> g) {
      private static final Codec<List<bqt>> h = axe.a(
         Codec.either(bqt.k, bqt.k.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((bqt)$$0.get(0)) : Either.right($$0))
      );
      public static final Codec<epu.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("name").forGetter(epu.b::a),
                  lc.u.r().fieldOf("attribute").forGetter(epu.b::b),
                  bsj.a.f.fieldOf("operation").forGetter(epu.b::c),
                  esd.a.fieldOf("amount").forGetter(epu.b::d),
                  h.fieldOf("slot").forGetter(epu.b::e),
                  axe.a(jp.d, "id").forGetter(epu.b::f)
               )
               .apply($$0, epu.b::new)
      );

      public String a() {
         return this.b;
      }

      public iv<bsg> b() {
         return this.c;
      }

      public bsj.a c() {
         return this.d;
      }

      public esc d() {
         return this.e;
      }

      public List<bqt> e() {
         return this.f;
      }

      public Optional<UUID> f() {
         return this.g;
      }
   }

   public static class c {
      private final String a;
      private final iv<bsg> b;
      private final bsj.a c;
      private final esc d;
      private Optional<UUID> e = Optional.empty();
      private final Set<bqt> f = EnumSet.noneOf(bqt.class);

      public c(String $$0, iv<bsg> $$1, bsj.a $$2, esc $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public epu.c a(bqt $$0) {
         this.f.add($$0);
         return this;
      }

      public epu.c a(UUID $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public epu.b a() {
         return new epu.b(this.a, this.b, this.c, this.d, List.copyOf(this.f), this.e);
      }
   }
}
