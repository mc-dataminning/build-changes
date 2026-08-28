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

public class eya extends exu {
   public static final MapCodec<eya> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(eya.b.a.listOf().fieldOf("modifiers").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("replace", true).forGetter($$0x -> $$0x.c))
            )
            .apply($$0, eya::new)
   );
   private final List<eya.b> b;
   private final boolean c;

   eya(List<ezs> $$0, List<eya.b> $$1, boolean $$2) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public exw<eya> b() {
      return exx.o;
   }

   @Override
   public Set<eza<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cxk a(cxk $$0, ewh $$1) {
      if (this.c) {
         $$0.b(ku.o, this.a($$1, dab.a));
      } else {
         $$0.a(ku.o, dab.a, $$1x -> this.a($$1, $$1x));
      }

      return $$0;
   }

   private dab a(ewh $$0, dab $$1) {
      bam $$2 = $$0.b();

      for (eya.b $$3 : this.b) {
         bvo $$4 = ae.a($$3.f, $$2);
         $$1 = $$1.a($$3.c, new bxh($$3.b, (double)$$3.e.b($$0), $$3.d), $$4);
      }

      return $$1;
   }

   public static eya.c a(alz $$0, jq<bxe> $$1, bxh.a $$2, fao $$3) {
      return new eya.c($$0, $$1, $$2, $$3);
   }

   public static eya.a c() {
      return new eya.a();
   }

   public static class a extends exu.a<eya.a> {
      private final boolean a;
      private final List<eya.b> b = Lists.newArrayList();

      public a(boolean $$0) {
         this.a = $$0;
      }

      public a() {
         this(false);
      }

      protected eya.a a() {
         return this;
      }

      public eya.a a(eya.c $$0) {
         this.b.add($$0.a());
         return this;
      }

      @Override
      public exv b() {
         return new eya(this.g(), this.b, this.a);
      }
   }

   static record b(alz b, jq<bxe> c, bxh.a d, fao e, List<bvo> f) {
      private static final Codec<List<bvo>> g = azn.a(
         Codec.either(bvo.l, bvo.l.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((bvo)$$0.getFirst()) : Either.right($$0))
      );
      public static final Codec<eya.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alz.a.fieldOf("id").forGetter(eya.b::a),
                  bxe.a.fieldOf("attribute").forGetter(eya.b::b),
                  bxh.a.f.fieldOf("operation").forGetter(eya.b::c),
                  fap.a.fieldOf("amount").forGetter(eya.b::d),
                  g.fieldOf("slot").forGetter(eya.b::e)
               )
               .apply($$0, eya.b::new)
      );

      public alz a() {
         return this.b;
      }

      public jq<bxe> b() {
         return this.c;
      }

      public bxh.a c() {
         return this.d;
      }

      public fao d() {
         return this.e;
      }

      public List<bvo> e() {
         return this.f;
      }
   }

   public static class c {
      private final alz a;
      private final jq<bxe> b;
      private final bxh.a c;
      private final fao d;
      private final Set<bvo> e = EnumSet.noneOf(bvo.class);

      public c(alz $$0, jq<bxe> $$1, bxh.a $$2, fao $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public eya.c a(bvo $$0) {
         this.e.add($$0);
         return this;
      }

      public eya.b a() {
         return new eya.b(this.a, this.b, this.c, this.d, List.copyOf(this.e));
      }
   }
}
