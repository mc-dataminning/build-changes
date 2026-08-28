import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class fcc extends fbw {
   public static final MapCodec<fcc> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(fcc.b.a.listOf().fieldOf("modifiers").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("replace", true).forGetter($$0x -> $$0x.c))
            )
            .apply($$0, fcc::new)
   );
   private final List<fcc.b> b;
   private final boolean c;

   fcc(List<fds> $$0, List<fcc.b> $$1, boolean $$2) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public fby<fcc> b() {
      return fbz.o;
   }

   @Override
   public Set<bbb<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public daa a(daa $$0, faj $$1) {
      if (this.c) {
         $$0.b(kl.o, this.a($$1, dcr.a));
      } else {
         $$0.a(kl.o, dcr.a, $$1x -> this.a($$1, $$1x));
      }

      return $$0;
   }

   private dcr a(faj $$0, dcr $$1) {
      azz $$2 = $$0.b();

      for (fcc.b $$3 : this.b) {
         bxg $$4 = ag.a($$3.f, $$2);
         $$1 = $$1.a($$3.c, new bza($$3.b, (double)$$3.e.b($$0), $$3.d), $$4);
      }

      return $$1;
   }

   public static fcc.c a(alk $$0, jg<byx> $$1, bza.a $$2, feo $$3) {
      return new fcc.c($$0, $$1, $$2, $$3);
   }

   public static fcc.a c() {
      return new fcc.a();
   }

   public static class a extends fbw.a<fcc.a> {
      private final boolean a;
      private final List<fcc.b> b = Lists.newArrayList();

      public a(boolean $$0) {
         this.a = $$0;
      }

      public a() {
         this(false);
      }

      protected fcc.a a() {
         return this;
      }

      public fcc.a a(fcc.c $$0) {
         this.b.add($$0.a());
         return this;
      }

      @Override
      public fbx b() {
         return new fcc(this.g(), this.b, this.a);
      }
   }

   static record b(alk b, jg<byx> c, bza.a d, feo e, List<bxg> f) {
      private static final Codec<List<bxg>> g = ayy.b(ayy.a(bxg.m));
      public static final Codec<fcc.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alk.a.fieldOf("id").forGetter(fcc.b::a),
                  byx.a.fieldOf("attribute").forGetter(fcc.b::b),
                  bza.a.f.fieldOf("operation").forGetter(fcc.b::c),
                  fep.a.fieldOf("amount").forGetter(fcc.b::d),
                  g.fieldOf("slot").forGetter(fcc.b::e)
               )
               .apply($$0, fcc.b::new)
      );

      public alk a() {
         return this.b;
      }

      public jg<byx> b() {
         return this.c;
      }

      public bza.a c() {
         return this.d;
      }

      public feo d() {
         return this.e;
      }

      public List<bxg> e() {
         return this.f;
      }
   }

   public static class c {
      private final alk a;
      private final jg<byx> b;
      private final bza.a c;
      private final feo d;
      private final Set<bxg> e = EnumSet.noneOf(bxg.class);

      public c(alk $$0, jg<byx> $$1, bza.a $$2, feo $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public fcc.c a(bxg $$0) {
         this.e.add($$0);
         return this;
      }

      public fcc.b a() {
         return new fcc.b(this.a, this.b, this.c, this.d, List.copyOf(this.e));
      }
   }
}
