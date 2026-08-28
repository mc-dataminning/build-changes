import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class fbh extends fbb {
   public static final MapCodec<fbh> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(fbh.b.a.listOf().fieldOf("modifiers").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("replace", true).forGetter($$0x -> $$0x.c))
            )
            .apply($$0, fbh::new)
   );
   private final List<fbh.b> b;
   private final boolean c;

   fbh(List<fcx> $$0, List<fbh.b> $$1, boolean $$2) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public fbd<fbh> b() {
      return fbe.o;
   }

   @Override
   public Set<bax<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public czk a(czk $$0, ezo $$1) {
      if (this.c) {
         $$0.b(kk.o, this.a($$1, dcb.a));
      } else {
         $$0.a(kk.o, dcb.a, $$1x -> this.a($$1, $$1x));
      }

      return $$0;
   }

   private dcb a(ezo $$0, dcb $$1) {
      azv $$2 = $$0.b();

      for (fbh.b $$3 : this.b) {
         bwt $$4 = ag.a($$3.f, $$2);
         $$1 = $$1.a($$3.c, new byn($$3.b, (double)$$3.e.b($$0), $$3.d), $$4);
      }

      return $$1;
   }

   public static fbh.c a(alg $$0, jf<byk> $$1, byn.a $$2, fdt $$3) {
      return new fbh.c($$0, $$1, $$2, $$3);
   }

   public static fbh.a c() {
      return new fbh.a();
   }

   public static class a extends fbb.a<fbh.a> {
      private final boolean a;
      private final List<fbh.b> b = Lists.newArrayList();

      public a(boolean $$0) {
         this.a = $$0;
      }

      public a() {
         this(false);
      }

      protected fbh.a a() {
         return this;
      }

      public fbh.a a(fbh.c $$0) {
         this.b.add($$0.a());
         return this;
      }

      @Override
      public fbc b() {
         return new fbh(this.g(), this.b, this.a);
      }
   }

   static record b(alg b, jf<byk> c, byn.a d, fdt e, List<bwt> f) {
      private static final Codec<List<bwt>> g = ayu.b(ayu.a(bwt.m));
      public static final Codec<fbh.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alg.a.fieldOf("id").forGetter(fbh.b::a),
                  byk.a.fieldOf("attribute").forGetter(fbh.b::b),
                  byn.a.f.fieldOf("operation").forGetter(fbh.b::c),
                  fdu.a.fieldOf("amount").forGetter(fbh.b::d),
                  g.fieldOf("slot").forGetter(fbh.b::e)
               )
               .apply($$0, fbh.b::new)
      );

      public alg a() {
         return this.b;
      }

      public jf<byk> b() {
         return this.c;
      }

      public byn.a c() {
         return this.d;
      }

      public fdt d() {
         return this.e;
      }

      public List<bwt> e() {
         return this.f;
      }
   }

   public static class c {
      private final alg a;
      private final jf<byk> b;
      private final byn.a c;
      private final fdt d;
      private final Set<bwt> e = EnumSet.noneOf(bwt.class);

      public c(alg $$0, jf<byk> $$1, byn.a $$2, fdt $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public fbh.c a(bwt $$0) {
         this.e.add($$0);
         return this;
      }

      public fbh.b a() {
         return new fbh.b(this.a, this.b, this.c, this.d, List.copyOf(this.e));
      }
   }
}
