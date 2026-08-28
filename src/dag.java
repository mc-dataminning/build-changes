import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public record dag(List<dag.b> e, boolean f) {
   public static final dag a = new dag(List.of(), true);
   private static final Codec<dag> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(dag.b.a.listOf().fieldOf("modifiers").forGetter(dag::b), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(dag::c))
            .apply($$0, dag::new)
   );
   public static final Codec<dag> b = Codec.withAlternative(g, dag.b.a.listOf(), $$0 -> new dag($$0, true));
   public static final zt<xg, dag> c = zt.a(dag.b.b.a(zr.a()), dag::b, zr.b, dag::c, dag::new);
   public static final DecimalFormat d = ae.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));

   public dag a(boolean $$0) {
      return new dag(this.e, $$0);
   }

   public static dag.a a() {
      return new dag.a();
   }

   public dag a(jq<bxj> $$0, bxm $$1, bvt $$2) {
      Builder<dag.b> $$3 = ImmutableList.builderWithExpectedSize(this.e.size() + 1);

      for (dag.b $$4 : this.e) {
         if (!$$4.a($$0, $$1.b())) {
            $$3.add($$4);
         }
      }

      $$3.add(new dag.b($$0, $$1, $$2));
      return new dag($$3.build(), this.f);
   }

   public void a(bvt $$0, BiConsumer<jq<bxj>, bxm> $$1) {
      for (dag.b $$2 : this.e) {
         if ($$2.e.equals($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public void a(bvs $$0, BiConsumer<jq<bxj>, bxm> $$1) {
      for (dag.b $$2 : this.e) {
         if ($$2.e.b($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public double a(double $$0, bvs $$1) {
      double $$2 = $$0;

      for (dag.b $$3 : this.e) {
         if ($$3.e.b($$1)) {
            double $$4 = $$3.d.c();

            $$2 += switch ($$3.d.d()) {
               case a -> $$4;
               case b -> $$4 * $$0;
               case c -> $$4 * $$2;
            };
         }
      }

      return $$2;
   }

   public List<dag.b> b() {
      return this.e;
   }

   public boolean c() {
      return this.f;
   }

   public static class a {
      private final Builder<dag.b> a = ImmutableList.builder();

      a() {
      }

      public dag.a a(jq<bxj> $$0, bxm $$1, bvt $$2) {
         this.a.add(new dag.b($$0, $$1, $$2));
         return this;
      }

      public dag a() {
         return new dag(this.a.build(), true);
      }
   }

   public static record b(jq<bxj> c, bxm d, bvt e) {
      public static final Codec<dag.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bxj.a.fieldOf("type").forGetter(dag.b::a), bxm.a.forGetter(dag.b::b), bvt.l.optionalFieldOf("slot", bvt.a).forGetter(dag.b::c))
               .apply($$0, dag.b::new)
      );
      public static final zt<xg, dag.b> b = zt.a(bxj.b, dag.b::a, bxm.c, dag.b::b, bvt.m, dag.b::c, dag.b::new);

      public boolean a(jq<bxj> $$0, alz $$1) {
         return $$0.equals(this.c) && this.d.a($$1);
      }

      public jq<bxj> a() {
         return this.c;
      }

      public bxm b() {
         return this.d;
      }

      public bvt c() {
         return this.e;
      }
   }
}
