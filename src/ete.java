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

public class ete extends esy {
   public static final MapCodec<ete> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(ete.b.a.listOf().fieldOf("modifiers").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("replace", true).forGetter($$0x -> $$0x.c))
            )
            .apply($$0, ete::new)
   );
   private final List<ete.b> b;
   private final boolean c;

   ete(List<euw> $$0, List<ete.b> $$1, boolean $$2) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public eta<ete> b() {
      return etb.o;
   }

   @Override
   public Set<eue<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cuo a(cuo $$0, erl $$1) {
      if (this.c) {
         $$0.b(kq.n, this.a($$1, cxl.a));
      } else {
         $$0.a(kq.n, cxl.a, $$2 -> $$2.b().isEmpty() ? this.a($$1, $$0.g().j()) : this.a($$1, $$2));
      }

      return $$0;
   }

   private cxl a(erl $$0, cxl $$1) {
      ayv $$2 = $$0.b();

      for (ete.b $$3 : this.b) {
         bsy $$4 = ad.a($$3.f, $$2);
         $$1 = $$1.a($$3.c, new bus($$3.b, (double)$$3.e.b($$0), $$3.d), $$4);
      }

      return $$1;
   }

   public static ete.c a(akq $$0, jm<bup> $$1, bus.a $$2, evs $$3) {
      return new ete.c($$0, $$1, $$2, $$3);
   }

   public static ete.a c() {
      return new ete.a();
   }

   public static class a extends esy.a<ete.a> {
      private final boolean a;
      private final List<ete.b> b = Lists.newArrayList();

      public a(boolean $$0) {
         this.a = $$0;
      }

      public a() {
         this(false);
      }

      protected ete.a a() {
         return this;
      }

      public ete.a a(ete.c $$0) {
         this.b.add($$0.a());
         return this;
      }

      @Override
      public esz b() {
         return new ete(this.g(), this.b, this.a);
      }
   }

   static record b(akq b, jm<bup> c, bus.a d, evs e, List<bsy> f) {
      private static final Codec<List<bsy>> g = axv.a(
         Codec.either(bsy.l, bsy.l.listOf())
            .xmap($$0 -> (List)$$0.map(List::of, Function.identity()), $$0 -> $$0.size() == 1 ? Either.left((bsy)$$0.getFirst()) : Either.right($$0))
      );
      public static final Codec<ete.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  akq.a.fieldOf("id").forGetter(ete.b::a),
                  bup.a.fieldOf("attribute").forGetter(ete.b::b),
                  bus.a.f.fieldOf("operation").forGetter(ete.b::c),
                  evt.a.fieldOf("amount").forGetter(ete.b::d),
                  g.fieldOf("slot").forGetter(ete.b::e)
               )
               .apply($$0, ete.b::new)
      );

      public akq a() {
         return this.b;
      }

      public jm<bup> b() {
         return this.c;
      }

      public bus.a c() {
         return this.d;
      }

      public evs d() {
         return this.e;
      }

      public List<bsy> e() {
         return this.f;
      }
   }

   public static class c {
      private final akq a;
      private final jm<bup> b;
      private final bus.a c;
      private final evs d;
      private final Set<bsy> e = EnumSet.noneOf(bsy.class);

      public c(akq $$0, jm<bup> $$1, bus.a $$2, evs $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public ete.c a(bsy $$0) {
         this.e.add($$0);
         return this;
      }

      public ete.b a() {
         return new ete.b(this.a, this.b, this.c, this.d, List.copyOf(this.e));
      }
   }
}
