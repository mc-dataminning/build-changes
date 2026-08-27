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

public class ehw extends ehq {
   public static final Codec<ehw> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(atg.a(ehw.b.a.listOf()).fieldOf("modifiers").forGetter($$0x -> $$0x.b)).apply($$0, ehw::new)
   );
   private final List<ehw.b> b;

   ehw(List<ejd> $$0, List<ehw.b> $$1) {
      super($$0);
      this.b = List.copyOf($$1);
   }

   @Override
   public ehs b() {
      return eht.k;
   }

   @Override
   public Set<eim<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cmh a(cmh $$0, ege $$1) {
      auf $$2 = $$1.b();

      for (ehw.b $$3 : this.b) {
         UUID $$4 = $$3.g.orElseGet(UUID::randomUUID);
         blk $$5 = ac.a($$3.f, $$2);
         $$0.a($$3.c.a(), new bmz($$4, $$3.b, (double)$$3.e.b($$1), $$3.d), $$5);
      }

      return $$0;
   }

   public static ehw.c a(String $$0, ie<bmw> $$1, bmz.a $$2, ejy $$3) {
      return new ehw.c($$0, $$1, $$2, $$3);
   }

   public static ehw.a c() {
      return new ehw.a();
   }

   public static class a extends ehq.a<ehw.a> {
      private final List<ehw.b> a = Lists.newArrayList();

      protected ehw.a a() {
         return this;
      }

      public ehw.a a(ehw.c $$0) {
         this.a.add($$0.a());
         return this;
      }

      @Override
      public ehr b() {
         return new ehw(this.g(), this.a);
      }
   }

   static record b(String b, ie<bmw> c, bmz.a d, ejy e, List<blk> f, Optional<UUID> g) {
      private static final Codec<List<blk>> h = atg.a(
         Codec.either(blk.g, blk.g.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((blk)$$0.get(0)) : Either.right($$0))
      );
      public static final Codec<ehw.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("name").forGetter(ehw.b::a),
                  kb.u.r().fieldOf("attribute").forGetter(ehw.b::b),
                  bmz.a.d.fieldOf("operation").forGetter(ehw.b::c),
                  ejz.a.fieldOf("amount").forGetter(ehw.b::d),
                  h.fieldOf("slot").forGetter(ehw.b::e),
                  atg.a(iy.c, "id").forGetter(ehw.b::f)
               )
               .apply($$0, ehw.b::new)
      );

      public String a() {
         return this.b;
      }

      public ie<bmw> b() {
         return this.c;
      }

      public bmz.a c() {
         return this.d;
      }

      public ejy d() {
         return this.e;
      }

      public List<blk> e() {
         return this.f;
      }

      public Optional<UUID> f() {
         return this.g;
      }
   }

   public static class c {
      private final String a;
      private final ie<bmw> b;
      private final bmz.a c;
      private final ejy d;
      private Optional<UUID> e = Optional.empty();
      private final Set<blk> f = EnumSet.noneOf(blk.class);

      public c(String $$0, ie<bmw> $$1, bmz.a $$2, ejy $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public ehw.c a(blk $$0) {
         this.f.add($$0);
         return this;
      }

      public ehw.c a(UUID $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public ehw.b a() {
         return new ehw.b(this.a, this.b, this.c, this.d, List.copyOf(this.f), this.e);
      }
   }
}
