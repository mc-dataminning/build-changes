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

public class epd extends eox {
   public static final Codec<epd> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(awu.a(epd.b.a.listOf()).fieldOf("modifiers").forGetter($$0x -> $$0x.b)).apply($$0, epd::new)
   );
   private final List<epd.b> b;

   epd(List<eql> $$0, List<epd.b> $$1) {
      super($$0);
      this.b = List.copyOf($$1);
   }

   @Override
   public eoz b() {
      return epa.l;
   }

   @Override
   public Set<epu<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public crs a(crs $$0, enk $$1) {
      $$0.a(jr.i, cui.a, $$1x -> {
         axt $$2 = $$1.b();

         for (epd.b $$3 : this.b) {
            UUID $$4 = $$3.g.orElseGet(UUID::randomUUID);
            bqi $$5 = ac.a($$3.f, $$2);
            $$1x = $$1x.a($$3.c, new bry($$4, $$3.b, (double)$$3.e.b($$1), $$3.d), $$5);
         }

         return $$1x;
      });
      return $$0;
   }

   public static epd.c a(String $$0, in<brv> $$1, bry.a $$2, erg $$3) {
      return new epd.c($$0, $$1, $$2, $$3);
   }

   public static epd.a c() {
      return new epd.a();
   }

   public static class a extends eox.a<epd.a> {
      private final List<epd.b> a = Lists.newArrayList();

      protected epd.a a() {
         return this;
      }

      public epd.a a(epd.c $$0) {
         this.a.add($$0.a());
         return this;
      }

      @Override
      public eoy b() {
         return new epd(this.g(), this.a);
      }
   }

   static record b(String b, in<brv> c, bry.a d, erg e, List<bqi> f, Optional<UUID> g) {
      private static final Codec<List<bqi>> h = awu.a(
         Codec.either(bqi.k, bqi.k.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((bqi)$$0.get(0)) : Either.right($$0))
      );
      public static final Codec<epd.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("name").forGetter(epd.b::a),
                  kt.u.r().fieldOf("attribute").forGetter(epd.b::b),
                  bry.a.f.fieldOf("operation").forGetter(epd.b::c),
                  erh.a.fieldOf("amount").forGetter(epd.b::d),
                  h.fieldOf("slot").forGetter(epd.b::e),
                  awu.a(jh.d, "id").forGetter(epd.b::f)
               )
               .apply($$0, epd.b::new)
      );

      public String a() {
         return this.b;
      }

      public in<brv> b() {
         return this.c;
      }

      public bry.a c() {
         return this.d;
      }

      public erg d() {
         return this.e;
      }

      public List<bqi> e() {
         return this.f;
      }

      public Optional<UUID> f() {
         return this.g;
      }
   }

   public static class c {
      private final String a;
      private final in<brv> b;
      private final bry.a c;
      private final erg d;
      private Optional<UUID> e = Optional.empty();
      private final Set<bqi> f = EnumSet.noneOf(bqi.class);

      public c(String $$0, in<brv> $$1, bry.a $$2, erg $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public epd.c a(bqi $$0) {
         this.f.add($$0);
         return this;
      }

      public epd.c a(UUID $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public epd.b a() {
         return new epd.b(this.a, this.b, this.c, this.d, List.copyOf(this.f), this.e);
      }
   }
}
