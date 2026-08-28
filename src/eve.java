import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class eve extends euy {
   public static final MapCodec<eve> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(eve.b.a.listOf().fieldOf("modifiers").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("replace", true).forGetter($$0x -> $$0x.c))
            )
            .apply($$0, eve::new)
   );
   private final List<eve.b> b;
   private final boolean c;

   eve(List<eww> $$0, List<eve.b> $$1, boolean $$2) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public eva<eve> b() {
      return evb.o;
   }

   @Override
   public Set<ewe<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cvs a(cvs $$0, etl $$1) {
      if (this.c) {
         $$0.b(ks.n, this.a($$1, cyn.a));
      } else {
         $$0.a(ks.n, cyn.a, $$2 -> $$2.b().isEmpty() ? this.a($$1, $$0.h().h()) : this.a($$1, $$2));
      }

      return $$0;
   }

   private cyn a(etl $$0, cyn $$1) {
      azn $$2 = $$0.b();

      for (eve.b $$3 : this.b) {
         bua $$4 = ad.a($$3.f, $$2);
         $$1 = $$1.a($$3.c, new bvs($$3.b, (double)$$3.e.b($$0), $$3.d), $$4);
      }

      return $$1;
   }

   public static eve.c a(ale $$0, jo<bvp> $$1, bvs.a $$2, exs $$3) {
      return new eve.c($$0, $$1, $$2, $$3);
   }

   public static eve.a c() {
      return new eve.a();
   }

   public static class a extends euy.a<eve.a> {
      private final boolean a;
      private final List<eve.b> b = Lists.newArrayList();

      public a(boolean $$0) {
         this.a = $$0;
      }

      public a() {
         this(false);
      }

      protected eve.a a() {
         return this;
      }

      public eve.a a(eve.c $$0) {
         this.b.add($$0.a());
         return this;
      }

      @Override
      public euz b() {
         return new eve(this.g(), this.b, this.a);
      }
   }

   static record b(ale b, jo<bvp> c, bvs.a d, exs e, List<bua> f) {
      private static final Codec<List<bua>> g = ayo.a(
         Codec.either(bua.l, bua.l.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((bua)$$0.getFirst()) : Either.right($$0))
      );
      public static final Codec<eve.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ale.a.fieldOf("id").forGetter(eve.b::a),
                  bvp.a.fieldOf("attribute").forGetter(eve.b::b),
                  bvs.a.f.fieldOf("operation").forGetter(eve.b::c),
                  ext.a.fieldOf("amount").forGetter(eve.b::d),
                  g.fieldOf("slot").forGetter(eve.b::e)
               )
               .apply($$0, eve.b::new)
      );

      public ale a() {
         return this.b;
      }

      public jo<bvp> b() {
         return this.c;
      }

      public bvs.a c() {
         return this.d;
      }

      public exs d() {
         return this.e;
      }

      public List<bua> e() {
         return this.f;
      }
   }

   public static class c {
      private final ale a;
      private final jo<bvp> b;
      private final bvs.a c;
      private final exs d;
      private final Set<bua> e = EnumSet.noneOf(bua.class);

      public c(ale $$0, jo<bvp> $$1, bvs.a $$2, exs $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public eve.c a(bua $$0) {
         this.e.add($$0);
         return this;
      }

      public eve.b a() {
         return new eve.b(this.a, this.b, this.c, this.d, List.copyOf(this.e));
      }
   }
}
