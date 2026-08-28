import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public record dcr(List<dcr.b> e) {
   public static final dcr a = new dcr(List.of());
   public static final Codec<dcr> b = dcr.b.a.listOf().xmap(dcr::new, dcr::b);
   public static final za<wn, dcr> c = za.a(dcr.b.b.a(yy.a()), dcr::b, dcr::new);
   public static final DecimalFormat d = ag.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));

   public static dcr.a a() {
      return new dcr.a();
   }

   public dcr a(jg<byx> $$0, bza $$1, bxg $$2) {
      Builder<dcr.b> $$3 = ImmutableList.builderWithExpectedSize(this.e.size() + 1);

      for (dcr.b $$4 : this.e) {
         if (!$$4.a($$0, $$1.a())) {
            $$3.add($$4);
         }
      }

      $$3.add(new dcr.b($$0, $$1, $$2));
      return new dcr($$3.build());
   }

   public void a(bxg $$0, BiConsumer<jg<byx>, bza> $$1) {
      for (dcr.b $$2 : this.e) {
         if ($$2.e.equals($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public void a(bxf $$0, BiConsumer<jg<byx>, bza> $$1) {
      for (dcr.b $$2 : this.e) {
         if ($$2.e.b($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public double a(double $$0, bxf $$1) {
      double $$2 = $$0;

      for (dcr.b $$3 : this.e) {
         if ($$3.e.b($$1)) {
            double $$4 = $$3.d.b();

            $$2 += switch ($$3.d.c()) {
               case a -> $$4;
               case b -> $$4 * $$0;
               case c -> $$4 * $$2;
            };
         }
      }

      return $$2;
   }

   public List<dcr.b> b() {
      return this.e;
   }

   public static class a {
      private final Builder<dcr.b> a = ImmutableList.builder();

      a() {
      }

      public dcr.a a(jg<byx> $$0, bza $$1, bxg $$2) {
         this.a.add(new dcr.b($$0, $$1, $$2));
         return this;
      }

      public dcr a() {
         return new dcr(this.a.build());
      }
   }

   public static record b(jg<byx> c, bza d, bxg e) {
      public static final Codec<dcr.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(byx.a.fieldOf("type").forGetter(dcr.b::a), bza.a.forGetter(dcr.b::b), bxg.m.optionalFieldOf("slot", bxg.a).forGetter(dcr.b::c))
               .apply($$0, dcr.b::new)
      );
      public static final za<wn, dcr.b> b = za.a(byx.b, dcr.b::a, bza.c, dcr.b::b, bxg.n, dcr.b::c, dcr.b::new);

      public boolean a(jg<byx> $$0, alk $$1) {
         return $$0.equals(this.c) && this.d.a($$1);
      }

      public jg<byx> a() {
         return this.c;
      }

      public bza b() {
         return this.d;
      }

      public bxg c() {
         return this.e;
      }
   }
}
