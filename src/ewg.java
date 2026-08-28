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

public class ewg extends ewa {
   public static final MapCodec<ewg> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(ewg.b.a.listOf().fieldOf("modifiers").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("replace", true).forGetter($$0x -> $$0x.c))
            )
            .apply($$0, ewg::new)
   );
   private final List<ewg.b> b;
   private final boolean c;

   ewg(List<exy> $$0, List<ewg.b> $$1, boolean $$2) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public ewc<ewg> b() {
      return ewd.o;
   }

   @Override
   public Set<exg<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cwm a(cwm $$0, eun $$1) {
      if (this.c) {
         $$0.b(ku.o, this.a($$1, czd.a));
      } else {
         $$0.a(ku.o, czd.a, $$1x -> this.a($$1, $$1x));
      }

      return $$0;
   }

   private czd a(eun $$0, czd $$1) {
      azu $$2 = $$0.b();

      for (ewg.b $$3 : this.b) {
         buu $$4 = ae.a($$3.f, $$2);
         $$1 = $$1.a($$3.c, new bwn($$3.b, (double)$$3.e.b($$0), $$3.d), $$4);
      }

      return $$1;
   }

   public static ewg.c a(alj $$0, jq<bwk> $$1, bwn.a $$2, eyu $$3) {
      return new ewg.c($$0, $$1, $$2, $$3);
   }

   public static ewg.a c() {
      return new ewg.a();
   }

   public static class a extends ewa.a<ewg.a> {
      private final boolean a;
      private final List<ewg.b> b = Lists.newArrayList();

      public a(boolean $$0) {
         this.a = $$0;
      }

      public a() {
         this(false);
      }

      protected ewg.a a() {
         return this;
      }

      public ewg.a a(ewg.c $$0) {
         this.b.add($$0.a());
         return this;
      }

      @Override
      public ewb b() {
         return new ewg(this.g(), this.b, this.a);
      }
   }

   static record b(alj b, jq<bwk> c, bwn.a d, eyu e, List<buu> f) {
      private static final Codec<List<buu>> g = ayv.a(
         Codec.either(buu.l, buu.l.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((buu)$$0.getFirst()) : Either.right($$0))
      );
      public static final Codec<ewg.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alj.a.fieldOf("id").forGetter(ewg.b::a),
                  bwk.a.fieldOf("attribute").forGetter(ewg.b::b),
                  bwn.a.f.fieldOf("operation").forGetter(ewg.b::c),
                  eyv.a.fieldOf("amount").forGetter(ewg.b::d),
                  g.fieldOf("slot").forGetter(ewg.b::e)
               )
               .apply($$0, ewg.b::new)
      );

      public alj a() {
         return this.b;
      }

      public jq<bwk> b() {
         return this.c;
      }

      public bwn.a c() {
         return this.d;
      }

      public eyu d() {
         return this.e;
      }

      public List<buu> e() {
         return this.f;
      }
   }

   public static class c {
      private final alj a;
      private final jq<bwk> b;
      private final bwn.a c;
      private final eyu d;
      private final Set<buu> e = EnumSet.noneOf(buu.class);

      public c(alj $$0, jq<bwk> $$1, bwn.a $$2, eyu $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public ewg.c a(buu $$0) {
         this.e.add($$0);
         return this;
      }

      public ewg.b a() {
         return new ewg.b(this.a, this.b, this.c, this.d, List.copyOf(this.e));
      }
   }
}
