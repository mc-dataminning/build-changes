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

public class eyh extends eyb {
   public static final MapCodec<eyh> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(eyh.b.a.listOf().fieldOf("modifiers").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("replace", true).forGetter($$0x -> $$0x.c))
            )
            .apply($$0, eyh::new)
   );
   private final List<eyh.b> b;
   private final boolean c;

   eyh(List<ezx> $$0, List<eyh.b> $$1, boolean $$2) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public eyd<eyh> b() {
      return eye.o;
   }

   @Override
   public Set<bbn<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cxo a(cxo $$0, ewo $$1) {
      if (this.c) {
         $$0.b(ku.o, this.a($$1, daf.a));
      } else {
         $$0.a(ku.o, daf.a, $$1x -> this.a($$1, $$1x));
      }

      return $$0;
   }

   private daf a(ewo $$0, daf $$1) {
      bam $$2 = $$0.b();

      for (eyh.b $$3 : this.b) {
         bvs $$4 = ae.a($$3.f, $$2);
         $$1 = $$1.a($$3.c, new bxl($$3.b, (double)$$3.e.b($$0), $$3.d), $$4);
      }

      return $$1;
   }

   public static eyh.c a(alz $$0, jq<bxi> $$1, bxl.a $$2, fat $$3) {
      return new eyh.c($$0, $$1, $$2, $$3);
   }

   public static eyh.a c() {
      return new eyh.a();
   }

   public static class a extends eyb.a<eyh.a> {
      private final boolean a;
      private final List<eyh.b> b = Lists.newArrayList();

      public a(boolean $$0) {
         this.a = $$0;
      }

      public a() {
         this(false);
      }

      protected eyh.a a() {
         return this;
      }

      public eyh.a a(eyh.c $$0) {
         this.b.add($$0.a());
         return this;
      }

      @Override
      public eyc b() {
         return new eyh(this.g(), this.b, this.a);
      }
   }

   static record b(alz b, jq<bxi> c, bxl.a d, fat e, List<bvs> f) {
      private static final Codec<List<bvs>> g = azn.a(
         Codec.either(bvs.l, bvs.l.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((bvs)$$0.getFirst()) : Either.right($$0))
      );
      public static final Codec<eyh.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alz.a.fieldOf("id").forGetter(eyh.b::a),
                  bxi.a.fieldOf("attribute").forGetter(eyh.b::b),
                  bxl.a.f.fieldOf("operation").forGetter(eyh.b::c),
                  fau.a.fieldOf("amount").forGetter(eyh.b::d),
                  g.fieldOf("slot").forGetter(eyh.b::e)
               )
               .apply($$0, eyh.b::new)
      );

      public alz a() {
         return this.b;
      }

      public jq<bxi> b() {
         return this.c;
      }

      public bxl.a c() {
         return this.d;
      }

      public fat d() {
         return this.e;
      }

      public List<bvs> e() {
         return this.f;
      }
   }

   public static class c {
      private final alz a;
      private final jq<bxi> b;
      private final bxl.a c;
      private final fat d;
      private final Set<bvs> e = EnumSet.noneOf(bvs.class);

      public c(alz $$0, jq<bxi> $$1, bxl.a $$2, fat $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public eyh.c a(bvs $$0) {
         this.e.add($$0);
         return this;
      }

      public eyh.b a() {
         return new eyh.b(this.a, this.b, this.c, this.d, List.copyOf(this.e));
      }
   }
}
