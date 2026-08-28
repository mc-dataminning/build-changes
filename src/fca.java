import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class fca extends fbu {
   public static final MapCodec<fca> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(fca.b.a.listOf().fieldOf("modifiers").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("replace", true).forGetter($$0x -> $$0x.c))
            )
            .apply($$0, fca::new)
   );
   private final List<fca.b> b;
   private final boolean c;

   fca(List<fdq> $$0, List<fca.b> $$1, boolean $$2) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public fbw<fca> b() {
      return fbx.o;
   }

   @Override
   public Set<baz<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public czy a(czy $$0, fah $$1) {
      if (this.c) {
         $$0.b(kk.o, this.a($$1, dcp.a));
      } else {
         $$0.a(kk.o, dcp.a, $$1x -> this.a($$1, $$1x));
      }

      return $$0;
   }

   private dcp a(fah $$0, dcp $$1) {
      azx $$2 = $$0.b();

      for (fca.b $$3 : this.b) {
         bxe $$4 = ag.a($$3.f, $$2);
         $$1 = $$1.a($$3.c, new byy($$3.b, (double)$$3.e.b($$0), $$3.d), $$4);
      }

      return $$1;
   }

   public static fca.c a(ali $$0, jf<byv> $$1, byy.a $$2, fem $$3) {
      return new fca.c($$0, $$1, $$2, $$3);
   }

   public static fca.a c() {
      return new fca.a();
   }

   public static class a extends fbu.a<fca.a> {
      private final boolean a;
      private final List<fca.b> b = Lists.newArrayList();

      public a(boolean $$0) {
         this.a = $$0;
      }

      public a() {
         this(false);
      }

      protected fca.a a() {
         return this;
      }

      public fca.a a(fca.c $$0) {
         this.b.add($$0.a());
         return this;
      }

      @Override
      public fbv b() {
         return new fca(this.g(), this.b, this.a);
      }
   }

   static record b(ali b, jf<byv> c, byy.a d, fem e, List<bxe> f) {
      private static final Codec<List<bxe>> g = ayw.b(ayw.a(bxe.m));
      public static final Codec<fca.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ali.a.fieldOf("id").forGetter(fca.b::a),
                  byv.a.fieldOf("attribute").forGetter(fca.b::b),
                  byy.a.f.fieldOf("operation").forGetter(fca.b::c),
                  fen.a.fieldOf("amount").forGetter(fca.b::d),
                  g.fieldOf("slot").forGetter(fca.b::e)
               )
               .apply($$0, fca.b::new)
      );

      public ali a() {
         return this.b;
      }

      public jf<byv> b() {
         return this.c;
      }

      public byy.a c() {
         return this.d;
      }

      public fem d() {
         return this.e;
      }

      public List<bxe> e() {
         return this.f;
      }
   }

   public static class c {
      private final ali a;
      private final jf<byv> b;
      private final byy.a c;
      private final fem d;
      private final Set<bxe> e = EnumSet.noneOf(bxe.class);

      public c(ali $$0, jf<byv> $$1, byy.a $$2, fem $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public fca.c a(bxe $$0) {
         this.e.add($$0);
         return this;
      }

      public fca.b a() {
         return new fca.b(this.a, this.b, this.c, this.d, List.copyOf(this.e));
      }
   }
}
