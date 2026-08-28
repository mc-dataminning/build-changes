import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class exi extends exc {
   public static final MapCodec<exi> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(exi.b.a.listOf().fieldOf("modifiers").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("replace", true).forGetter($$0x -> $$0x.c))
            )
            .apply($$0, exi::new)
   );
   private final List<exi.b> b;
   private final boolean c;

   exi(List<eyy> $$0, List<exi.b> $$1, boolean $$2) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public exe<exi> b() {
      return exf.o;
   }

   @Override
   public Set<bah<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cwn a(cwn $$0, evp $$1) {
      if (this.c) {
         $$0.b(kv.o, this.a($$1, cze.a));
      } else {
         $$0.a(kv.o, cze.a, $$1x -> this.a($$1, $$1x));
      }

      return $$0;
   }

   private cze a(evp $$0, cze $$1) {
      azg $$2 = $$0.b();

      for (exi.b $$3 : this.b) {
         bus $$4 = af.a($$3.f, $$2);
         $$1 = $$1.a($$3.c, new bwl($$3.b, (double)$$3.e.b($$0), $$3.d), $$4);
      }

      return $$1;
   }

   public static exi.c a(aku $$0, jr<bwi> $$1, bwl.a $$2, ezu $$3) {
      return new exi.c($$0, $$1, $$2, $$3);
   }

   public static exi.a c() {
      return new exi.a();
   }

   public static class a extends exc.a<exi.a> {
      private final boolean a;
      private final List<exi.b> b = Lists.newArrayList();

      public a(boolean $$0) {
         this.a = $$0;
      }

      public a() {
         this(false);
      }

      protected exi.a a() {
         return this;
      }

      public exi.a a(exi.c $$0) {
         this.b.add($$0.a());
         return this;
      }

      @Override
      public exd b() {
         return new exi(this.g(), this.b, this.a);
      }
   }

   static record b(aku b, jr<bwi> c, bwl.a d, ezu e, List<bus> f) {
      private static final Codec<List<bus>> g = ayh.b(ayh.a(bus.l));
      public static final Codec<exi.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aku.a.fieldOf("id").forGetter(exi.b::a),
                  bwi.a.fieldOf("attribute").forGetter(exi.b::b),
                  bwl.a.f.fieldOf("operation").forGetter(exi.b::c),
                  ezv.a.fieldOf("amount").forGetter(exi.b::d),
                  g.fieldOf("slot").forGetter(exi.b::e)
               )
               .apply($$0, exi.b::new)
      );

      public aku a() {
         return this.b;
      }

      public jr<bwi> b() {
         return this.c;
      }

      public bwl.a c() {
         return this.d;
      }

      public ezu d() {
         return this.e;
      }

      public List<bus> e() {
         return this.f;
      }
   }

   public static class c {
      private final aku a;
      private final jr<bwi> b;
      private final bwl.a c;
      private final ezu d;
      private final Set<bus> e = EnumSet.noneOf(bus.class);

      public c(aku $$0, jr<bwi> $$1, bwl.a $$2, ezu $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public exi.c a(bus $$0) {
         this.e.add($$0);
         return this;
      }

      public exi.b a() {
         return new exi.b(this.a, this.b, this.c, this.d, List.copyOf(this.e));
      }
   }
}
