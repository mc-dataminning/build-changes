import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class fas extends fam {
   public static final MapCodec<fas> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(fas.b.a.listOf().fieldOf("modifiers").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("replace", true).forGetter($$0x -> $$0x.c))
            )
            .apply($$0, fas::new)
   );
   private final List<fas.b> b;
   private final boolean c;

   fas(List<fci> $$0, List<fas.b> $$1, boolean $$2) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public fao<fas> b() {
      return fap.o;
   }

   @Override
   public Set<bax<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cyy a(cyy $$0, eyz $$1) {
      if (this.c) {
         $$0.b(kj.o, this.a($$1, dbp.a));
      } else {
         $$0.a(kj.o, dbp.a, $$1x -> this.a($$1, $$1x));
      }

      return $$0;
   }

   private dbp a(eyz $$0, dbp $$1) {
      azv $$2 = $$0.b();

      for (fas.b $$3 : this.b) {
         bwo $$4 = af.a($$3.f, $$2);
         $$1 = $$1.a($$3.c, new byg($$3.b, (double)$$3.e.b($$0), $$3.d), $$4);
      }

      return $$1;
   }

   public static fas.c a(alg $$0, je<byd> $$1, byg.a $$2, fde $$3) {
      return new fas.c($$0, $$1, $$2, $$3);
   }

   public static fas.a c() {
      return new fas.a();
   }

   public static class a extends fam.a<fas.a> {
      private final boolean a;
      private final List<fas.b> b = Lists.newArrayList();

      public a(boolean $$0) {
         this.a = $$0;
      }

      public a() {
         this(false);
      }

      protected fas.a a() {
         return this;
      }

      public fas.a a(fas.c $$0) {
         this.b.add($$0.a());
         return this;
      }

      @Override
      public fan b() {
         return new fas(this.g(), this.b, this.a);
      }
   }

   static record b(alg b, je<byd> c, byg.a d, fde e, List<bwo> f) {
      private static final Codec<List<bwo>> g = ayu.b(ayu.a(bwo.m));
      public static final Codec<fas.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alg.a.fieldOf("id").forGetter(fas.b::a),
                  byd.a.fieldOf("attribute").forGetter(fas.b::b),
                  byg.a.f.fieldOf("operation").forGetter(fas.b::c),
                  fdf.a.fieldOf("amount").forGetter(fas.b::d),
                  g.fieldOf("slot").forGetter(fas.b::e)
               )
               .apply($$0, fas.b::new)
      );

      public alg a() {
         return this.b;
      }

      public je<byd> b() {
         return this.c;
      }

      public byg.a c() {
         return this.d;
      }

      public fde d() {
         return this.e;
      }

      public List<bwo> e() {
         return this.f;
      }
   }

   public static class c {
      private final alg a;
      private final je<byd> b;
      private final byg.a c;
      private final fde d;
      private final Set<bwo> e = EnumSet.noneOf(bwo.class);

      public c(alg $$0, je<byd> $$1, byg.a $$2, fde $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public fas.c a(bwo $$0) {
         this.e.add($$0);
         return this;
      }

      public fas.b a() {
         return new fas.b(this.a, this.b, this.c, this.d, List.copyOf(this.e));
      }
   }
}
