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

public class etk extends ete {
   public static final MapCodec<etk> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(etk.b.a.listOf().fieldOf("modifiers").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("replace", true).forGetter($$0x -> $$0x.c))
            )
            .apply($$0, etk::new)
   );
   private final List<etk.b> b;
   private final boolean c;

   etk(List<evc> $$0, List<etk.b> $$1, boolean $$2) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public etg<etk> b() {
      return eth.o;
   }

   @Override
   public Set<euk<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cuq a(cuq $$0, err $$1) {
      if (this.c) {
         $$0.b(kq.n, this.a($$1, cxn.a));
      } else {
         $$0.a(kq.n, cxn.a, $$2 -> $$2.b().isEmpty() ? this.a($$1, $$0.g().j()) : this.a($$1, $$2));
      }

      return $$0;
   }

   private cxn a(err $$0, cxn $$1) {
      ayw $$2 = $$0.b();

      for (etk.b $$3 : this.b) {
         bsz $$4 = ad.a($$3.f, $$2);
         $$1 = $$1.a($$3.c, new buu($$3.b, (double)$$3.e.b($$0), $$3.d), $$4);
      }

      return $$1;
   }

   public static etk.c a(akr $$0, jm<bur> $$1, buu.a $$2, evy $$3) {
      return new etk.c($$0, $$1, $$2, $$3);
   }

   public static etk.a c() {
      return new etk.a();
   }

   public static class a extends ete.a<etk.a> {
      private final boolean a;
      private final List<etk.b> b = Lists.newArrayList();

      public a(boolean $$0) {
         this.a = $$0;
      }

      public a() {
         this(false);
      }

      protected etk.a a() {
         return this;
      }

      public etk.a a(etk.c $$0) {
         this.b.add($$0.a());
         return this;
      }

      @Override
      public etf b() {
         return new etk(this.g(), this.b, this.a);
      }
   }

   static record b(akr b, jm<bur> c, buu.a d, evy e, List<bsz> f) {
      private static final Codec<List<bsz>> g = axw.a(
         Codec.either(bsz.l, bsz.l.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((bsz)$$0.getFirst()) : Either.right($$0))
      );
      public static final Codec<etk.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  akr.a.fieldOf("id").forGetter(etk.b::a),
                  bur.a.fieldOf("attribute").forGetter(etk.b::b),
                  buu.a.f.fieldOf("operation").forGetter(etk.b::c),
                  evz.a.fieldOf("amount").forGetter(etk.b::d),
                  g.fieldOf("slot").forGetter(etk.b::e)
               )
               .apply($$0, etk.b::new)
      );

      public akr a() {
         return this.b;
      }

      public jm<bur> b() {
         return this.c;
      }

      public buu.a c() {
         return this.d;
      }

      public evy d() {
         return this.e;
      }

      public List<bsz> e() {
         return this.f;
      }
   }

   public static class c {
      private final akr a;
      private final jm<bur> b;
      private final buu.a c;
      private final evy d;
      private final Set<bsz> e = EnumSet.noneOf(bsz.class);

      public c(akr $$0, jm<bur> $$1, buu.a $$2, evy $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public etk.c a(bsz $$0) {
         this.e.add($$0);
         return this;
      }

      public etk.b a() {
         return new etk.b(this.a, this.b, this.c, this.d, List.copyOf(this.e));
      }
   }
}
