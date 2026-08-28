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

public class eva extends euu {
   public static final MapCodec<eva> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(eva.b.a.listOf().fieldOf("modifiers").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("replace", true).forGetter($$0x -> $$0x.c))
            )
            .apply($$0, eva::new)
   );
   private final List<eva.b> b;
   private final boolean c;

   eva(List<ews> $$0, List<eva.b> $$1, boolean $$2) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public euw<eva> b() {
      return eux.o;
   }

   @Override
   public Set<ewa<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cvp a(cvp $$0, eth $$1) {
      if (this.c) {
         $$0.b(kr.n, this.a($$1, cyk.a));
      } else {
         $$0.a(kr.n, cyk.a, $$2 -> $$2.b().isEmpty() ? this.a($$1, $$0.h().h()) : this.a($$1, $$2));
      }

      return $$0;
   }

   private cyk a(eth $$0, cyk $$1) {
      azl $$2 = $$0.b();

      for (eva.b $$3 : this.b) {
         btx $$4 = ad.a($$3.f, $$2);
         $$1 = $$1.a($$3.c, new bvp($$3.b, (double)$$3.e.b($$0), $$3.d), $$4);
      }

      return $$1;
   }

   public static eva.c a(alc $$0, jn<bvm> $$1, bvp.a $$2, exo $$3) {
      return new eva.c($$0, $$1, $$2, $$3);
   }

   public static eva.a c() {
      return new eva.a();
   }

   public static class a extends euu.a<eva.a> {
      private final boolean a;
      private final List<eva.b> b = Lists.newArrayList();

      public a(boolean $$0) {
         this.a = $$0;
      }

      public a() {
         this(false);
      }

      protected eva.a a() {
         return this;
      }

      public eva.a a(eva.c $$0) {
         this.b.add($$0.a());
         return this;
      }

      @Override
      public euv b() {
         return new eva(this.g(), this.b, this.a);
      }
   }

   static record b(alc b, jn<bvm> c, bvp.a d, exo e, List<btx> f) {
      private static final Codec<List<btx>> g = aym.a(
         Codec.either(btx.l, btx.l.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((btx)$$0.getFirst()) : Either.right($$0))
      );
      public static final Codec<eva.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alc.a.fieldOf("id").forGetter(eva.b::a),
                  bvm.a.fieldOf("attribute").forGetter(eva.b::b),
                  bvp.a.f.fieldOf("operation").forGetter(eva.b::c),
                  exp.a.fieldOf("amount").forGetter(eva.b::d),
                  g.fieldOf("slot").forGetter(eva.b::e)
               )
               .apply($$0, eva.b::new)
      );

      public alc a() {
         return this.b;
      }

      public jn<bvm> b() {
         return this.c;
      }

      public bvp.a c() {
         return this.d;
      }

      public exo d() {
         return this.e;
      }

      public List<btx> e() {
         return this.f;
      }
   }

   public static class c {
      private final alc a;
      private final jn<bvm> b;
      private final bvp.a c;
      private final exo d;
      private final Set<btx> e = EnumSet.noneOf(btx.class);

      public c(alc $$0, jn<bvm> $$1, bvp.a $$2, exo $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public eva.c a(btx $$0) {
         this.e.add($$0);
         return this;
      }

      public eva.b a() {
         return new eva.b(this.a, this.b, this.c, this.d, List.copyOf(this.e));
      }
   }
}
