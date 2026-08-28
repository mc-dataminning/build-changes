import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public record cyg(List<cyg.b> e, boolean f) {
   public static final cyg a = new cyg(List.of(), true);
   private static final Codec<cyg> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(cyg.b.a.listOf().fieldOf("modifiers").forGetter(cyg::b), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cyg::c))
            .apply($$0, cyg::new)
   );
   public static final Codec<cyg> b = Codec.withAlternative(g, cyg.b.a.listOf(), $$0 -> new cyg($$0, true));
   public static final zb<wo, cyg> c = zb.a(cyg.b.b.a(yz.a()), cyg::b, yz.b, cyg::c, cyg::new);
   public static final DecimalFormat d = ad.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));

   public cyg a(boolean $$0) {
      return new cyg(this.e, $$0);
   }

   public static cyg.a a() {
      return new cyg.a();
   }

   public cyg a(jn<bvh> $$0, bvk $$1, bts $$2) {
      Builder<cyg.b> $$3 = ImmutableList.builderWithExpectedSize(this.e.size() + 1);

      for (cyg.b $$4 : this.e) {
         if (!$$4.a($$0, $$1.b())) {
            $$3.add($$4);
         }
      }

      $$3.add(new cyg.b($$0, $$1, $$2));
      return new cyg($$3.build(), this.f);
   }

   public void a(bts $$0, BiConsumer<jn<bvh>, bvk> $$1) {
      for (cyg.b $$2 : this.e) {
         if ($$2.e.equals($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public void a(btr $$0, BiConsumer<jn<bvh>, bvk> $$1) {
      for (cyg.b $$2 : this.e) {
         if ($$2.e.b($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public double a(double $$0, btr $$1) {
      double $$2 = $$0;

      for (cyg.b $$3 : this.e) {
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

   public List<cyg.b> b() {
      return this.e;
   }

   public boolean c() {
      return this.f;
   }

   public static class a {
      private final Builder<cyg.b> a = ImmutableList.builder();

      a() {
      }

      public cyg.a a(jn<bvh> $$0, bvk $$1, bts $$2) {
         this.a.add(new cyg.b($$0, $$1, $$2));
         return this;
      }

      public cyg a() {
         return new cyg(this.a.build(), true);
      }
   }

   public static record b(jn<bvh> c, bvk d, bts e) {
      public static final Codec<cyg.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bvh.a.fieldOf("type").forGetter(cyg.b::a), bvk.a.forGetter(cyg.b::b), bts.l.optionalFieldOf("slot", bts.a).forGetter(cyg.b::c))
               .apply($$0, cyg.b::new)
      );
      public static final zb<wo, cyg.b> b = zb.a(bvh.b, cyg.b::a, bvk.c, cyg.b::b, bts.m, cyg.b::c, cyg.b::new);

      public boolean a(jn<bvh> $$0, alb $$1) {
         return $$0.equals(this.c) && this.d.a($$1);
      }

      public jn<bvh> a() {
         return this.c;
      }

      public bvk b() {
         return this.d;
      }

      public bts c() {
         return this.e;
      }
   }
}
