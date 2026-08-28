import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class fag extends faa {
   public static final MapCodec<fag> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(fag.b.a.listOf().fieldOf("modifiers").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("replace", true).forGetter($$0x -> $$0x.c))
            )
            .apply($$0, fag::new)
   );
   private final List<fag.b> b;
   private final boolean c;

   fag(List<fbw> $$0, List<fag.b> $$1, boolean $$2) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public fac<fag> b() {
      return fad.o;
   }

   @Override
   public Set<bav<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cys a(cys $$0, eyn $$1) {
      if (this.c) {
         $$0.b(kj.o, this.a($$1, dbj.a));
      } else {
         $$0.a(kj.o, dbj.a, $$1x -> this.a($$1, $$1x));
      }

      return $$0;
   }

   private dbj a(eyn $$0, dbj $$1) {
      azt $$2 = $$0.b();

      for (fag.b $$3 : this.b) {
         bwl $$4 = af.a($$3.f, $$2);
         $$1 = $$1.a($$3.c, new byd($$3.b, (double)$$3.e.b($$0), $$3.d), $$4);
      }

      return $$1;
   }

   public static fag.c a(ale $$0, je<bya> $$1, byd.a $$2, fcs $$3) {
      return new fag.c($$0, $$1, $$2, $$3);
   }

   public static fag.a c() {
      return new fag.a();
   }

   public static class a extends faa.a<fag.a> {
      private final boolean a;
      private final List<fag.b> b = Lists.newArrayList();

      public a(boolean $$0) {
         this.a = $$0;
      }

      public a() {
         this(false);
      }

      protected fag.a a() {
         return this;
      }

      public fag.a a(fag.c $$0) {
         this.b.add($$0.a());
         return this;
      }

      @Override
      public fab b() {
         return new fag(this.g(), this.b, this.a);
      }
   }

   static record b(ale b, je<bya> c, byd.a d, fcs e, List<bwl> f) {
      private static final Codec<List<bwl>> g = ays.b(ays.a(bwl.m));
      public static final Codec<fag.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ale.a.fieldOf("id").forGetter(fag.b::a),
                  bya.a.fieldOf("attribute").forGetter(fag.b::b),
                  byd.a.f.fieldOf("operation").forGetter(fag.b::c),
                  fct.a.fieldOf("amount").forGetter(fag.b::d),
                  g.fieldOf("slot").forGetter(fag.b::e)
               )
               .apply($$0, fag.b::new)
      );

      public ale a() {
         return this.b;
      }

      public je<bya> b() {
         return this.c;
      }

      public byd.a c() {
         return this.d;
      }

      public fcs d() {
         return this.e;
      }

      public List<bwl> e() {
         return this.f;
      }
   }

   public static class c {
      private final ale a;
      private final je<bya> b;
      private final byd.a c;
      private final fcs d;
      private final Set<bwl> e = EnumSet.noneOf(bwl.class);

      public c(ale $$0, je<bya> $$1, byd.a $$2, fcs $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public fag.c a(bwl $$0) {
         this.e.add($$0);
         return this;
      }

      public fag.b a() {
         return new fag.b(this.a, this.b, this.c, this.d, List.copyOf(this.e));
      }
   }
}
