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

public class eyi extends eyc {
   public static final MapCodec<eyi> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(eyi.b.a.listOf().fieldOf("modifiers").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("replace", true).forGetter($$0x -> $$0x.c))
            )
            .apply($$0, eyi::new)
   );
   private final List<eyi.b> b;
   private final boolean c;

   eyi(List<ezy> $$0, List<eyi.b> $$1, boolean $$2) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public eye<eyi> b() {
      return eyf.o;
   }

   @Override
   public Set<bbn<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cxp a(cxp $$0, ewp $$1) {
      if (this.c) {
         $$0.b(ku.o, this.a($$1, dag.a));
      } else {
         $$0.a(ku.o, dag.a, $$1x -> this.a($$1, $$1x));
      }

      return $$0;
   }

   private dag a(ewp $$0, dag $$1) {
      bam $$2 = $$0.b();

      for (eyi.b $$3 : this.b) {
         bvt $$4 = ae.a($$3.f, $$2);
         $$1 = $$1.a($$3.c, new bxm($$3.b, (double)$$3.e.b($$0), $$3.d), $$4);
      }

      return $$1;
   }

   public static eyi.c a(alz $$0, jq<bxj> $$1, bxm.a $$2, fau $$3) {
      return new eyi.c($$0, $$1, $$2, $$3);
   }

   public static eyi.a c() {
      return new eyi.a();
   }

   public static class a extends eyc.a<eyi.a> {
      private final boolean a;
      private final List<eyi.b> b = Lists.newArrayList();

      public a(boolean $$0) {
         this.a = $$0;
      }

      public a() {
         this(false);
      }

      protected eyi.a a() {
         return this;
      }

      public eyi.a a(eyi.c $$0) {
         this.b.add($$0.a());
         return this;
      }

      @Override
      public eyd b() {
         return new eyi(this.g(), this.b, this.a);
      }
   }

   static record b(alz b, jq<bxj> c, bxm.a d, fau e, List<bvt> f) {
      private static final Codec<List<bvt>> g = azn.a(
         Codec.either(bvt.l, bvt.l.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((bvt)$$0.getFirst()) : Either.right($$0))
      );
      public static final Codec<eyi.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alz.a.fieldOf("id").forGetter(eyi.b::a),
                  bxj.a.fieldOf("attribute").forGetter(eyi.b::b),
                  bxm.a.f.fieldOf("operation").forGetter(eyi.b::c),
                  fav.a.fieldOf("amount").forGetter(eyi.b::d),
                  g.fieldOf("slot").forGetter(eyi.b::e)
               )
               .apply($$0, eyi.b::new)
      );

      public alz a() {
         return this.b;
      }

      public jq<bxj> b() {
         return this.c;
      }

      public bxm.a c() {
         return this.d;
      }

      public fau d() {
         return this.e;
      }

      public List<bvt> e() {
         return this.f;
      }
   }

   public static class c {
      private final alz a;
      private final jq<bxj> b;
      private final bxm.a c;
      private final fau d;
      private final Set<bvt> e = EnumSet.noneOf(bvt.class);

      public c(alz $$0, jq<bxj> $$1, bxm.a $$2, fau $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public eyi.c a(bvt $$0) {
         this.e.add($$0);
         return this;
      }

      public eyi.b a() {
         return new eyi.b(this.a, this.b, this.c, this.d, List.copyOf(this.e));
      }
   }
}
