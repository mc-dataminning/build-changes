import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class fbm extends fbg {
   public static final MapCodec<fbm> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(fbm.b.a.listOf().fieldOf("modifiers").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("replace", true).forGetter($$0x -> $$0x.c))
            )
            .apply($$0, fbm::new)
   );
   private final List<fbm.b> b;
   private final boolean c;

   fbm(List<fdc> $$0, List<fbm.b> $$1, boolean $$2) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public fbi<fbm> b() {
      return fbj.o;
   }

   @Override
   public Set<bax<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public czn a(czn $$0, ezt $$1) {
      if (this.c) {
         $$0.b(kk.o, this.a($$1, dce.a));
      } else {
         $$0.a(kk.o, dce.a, $$1x -> this.a($$1, $$1x));
      }

      return $$0;
   }

   private dce a(ezt $$0, dce $$1) {
      azv $$2 = $$0.b();

      for (fbm.b $$3 : this.b) {
         bwt $$4 = ag.a($$3.f, $$2);
         $$1 = $$1.a($$3.c, new byn($$3.b, (double)$$3.e.b($$0), $$3.d), $$4);
      }

      return $$1;
   }

   public static fbm.c a(alg $$0, jf<byk> $$1, byn.a $$2, fdy $$3) {
      return new fbm.c($$0, $$1, $$2, $$3);
   }

   public static fbm.a c() {
      return new fbm.a();
   }

   public static class a extends fbg.a<fbm.a> {
      private final boolean a;
      private final List<fbm.b> b = Lists.newArrayList();

      public a(boolean $$0) {
         this.a = $$0;
      }

      public a() {
         this(false);
      }

      protected fbm.a a() {
         return this;
      }

      public fbm.a a(fbm.c $$0) {
         this.b.add($$0.a());
         return this;
      }

      @Override
      public fbh b() {
         return new fbm(this.g(), this.b, this.a);
      }
   }

   static record b(alg b, jf<byk> c, byn.a d, fdy e, List<bwt> f) {
      private static final Codec<List<bwt>> g = ayu.b(ayu.a(bwt.m));
      public static final Codec<fbm.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alg.a.fieldOf("id").forGetter(fbm.b::a),
                  byk.a.fieldOf("attribute").forGetter(fbm.b::b),
                  byn.a.f.fieldOf("operation").forGetter(fbm.b::c),
                  fdz.a.fieldOf("amount").forGetter(fbm.b::d),
                  g.fieldOf("slot").forGetter(fbm.b::e)
               )
               .apply($$0, fbm.b::new)
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

      public fdy d() {
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
      private final fdy d;
      private final Set<bwt> e = EnumSet.noneOf(bwt.class);

      public c(alg $$0, jf<byk> $$1, byn.a $$2, fdy $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public fbm.c a(bwt $$0) {
         this.e.add($$0);
         return this;
      }

      public fbm.b a() {
         return new fbm.b(this.a, this.b, this.c, this.d, List.copyOf(this.e));
      }
   }
}
