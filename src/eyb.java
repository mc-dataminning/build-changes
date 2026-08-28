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

public class eyb extends exv {
   public static final MapCodec<eyb> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(eyb.b.a.listOf().fieldOf("modifiers").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("replace", true).forGetter($$0x -> $$0x.c))
            )
            .apply($$0, eyb::new)
   );
   private final List<eyb.b> b;
   private final boolean c;

   eyb(List<ezr> $$0, List<eyb.b> $$1, boolean $$2) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public exx<eyb> b() {
      return exy.o;
   }

   @Override
   public Set<bbd<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cxg a(cxg $$0, ewi $$1) {
      if (this.c) {
         $$0.b(ku.o, this.a($$1, czx.a));
      } else {
         $$0.a(ku.o, czx.a, $$1x -> this.a($$1, $$1x));
      }

      return $$0;
   }

   private czx a(ewi $$0, czx $$1) {
      bac $$2 = $$0.b();

      for (eyb.b $$3 : this.b) {
         bvk $$4 = ae.a($$3.f, $$2);
         $$1 = $$1.a($$3.c, new bxd($$3.b, (double)$$3.e.b($$0), $$3.d), $$4);
      }

      return $$1;
   }

   public static eyb.c a(alp $$0, jq<bxa> $$1, bxd.a $$2, fan $$3) {
      return new eyb.c($$0, $$1, $$2, $$3);
   }

   public static eyb.a c() {
      return new eyb.a();
   }

   public static class a extends exv.a<eyb.a> {
      private final boolean a;
      private final List<eyb.b> b = Lists.newArrayList();

      public a(boolean $$0) {
         this.a = $$0;
      }

      public a() {
         this(false);
      }

      protected eyb.a a() {
         return this;
      }

      public eyb.a a(eyb.c $$0) {
         this.b.add($$0.a());
         return this;
      }

      @Override
      public exw b() {
         return new eyb(this.g(), this.b, this.a);
      }
   }

   static record b(alp b, jq<bxa> c, bxd.a d, fan e, List<bvk> f) {
      private static final Codec<List<bvk>> g = azd.a(
         Codec.either(bvk.l, bvk.l.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((bvk)$$0.getFirst()) : Either.right($$0))
      );
      public static final Codec<eyb.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alp.a.fieldOf("id").forGetter(eyb.b::a),
                  bxa.a.fieldOf("attribute").forGetter(eyb.b::b),
                  bxd.a.f.fieldOf("operation").forGetter(eyb.b::c),
                  fao.a.fieldOf("amount").forGetter(eyb.b::d),
                  g.fieldOf("slot").forGetter(eyb.b::e)
               )
               .apply($$0, eyb.b::new)
      );

      public alp a() {
         return this.b;
      }

      public jq<bxa> b() {
         return this.c;
      }

      public bxd.a c() {
         return this.d;
      }

      public fan d() {
         return this.e;
      }

      public List<bvk> e() {
         return this.f;
      }
   }

   public static class c {
      private final alp a;
      private final jq<bxa> b;
      private final bxd.a c;
      private final fan d;
      private final Set<bvk> e = EnumSet.noneOf(bvk.class);

      public c(alp $$0, jq<bxa> $$1, bxd.a $$2, fan $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public eyb.c a(bvk $$0) {
         this.e.add($$0);
         return this;
      }

      public eyb.b a() {
         return new eyb.b(this.a, this.b, this.c, this.d, List.copyOf(this.e));
      }
   }
}
