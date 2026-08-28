import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public record dbu(List<dbu.b> e) {
   public static final dbu a = new dbu(List.of());
   public static final Codec<dbu> b = dbu.b.a.listOf().xmap(dbu::new, dbu::b);
   public static final yw<wj, dbu> c = yw.a(dbu.b.b.a(yu.a()), dbu::b, dbu::new);
   public static final DecimalFormat d = af.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));

   public static dbu.a a() {
      return new dbu.a();
   }

   public dbu a(je<byf> $$0, byi $$1, bwq $$2) {
      Builder<dbu.b> $$3 = ImmutableList.builderWithExpectedSize(this.e.size() + 1);

      for (dbu.b $$4 : this.e) {
         if (!$$4.a($$0, $$1.a())) {
            $$3.add($$4);
         }
      }

      $$3.add(new dbu.b($$0, $$1, $$2));
      return new dbu($$3.build());
   }

   public void a(bwq $$0, BiConsumer<je<byf>, byi> $$1) {
      for (dbu.b $$2 : this.e) {
         if ($$2.e.equals($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public void a(bwp $$0, BiConsumer<je<byf>, byi> $$1) {
      for (dbu.b $$2 : this.e) {
         if ($$2.e.b($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public double a(double $$0, bwp $$1) {
      double $$2 = $$0;

      for (dbu.b $$3 : this.e) {
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

   public List<dbu.b> b() {
      return this.e;
   }

   public static class a {
      private final Builder<dbu.b> a = ImmutableList.builder();

      a() {
      }

      public dbu.a a(je<byf> $$0, byi $$1, bwq $$2) {
         this.a.add(new dbu.b($$0, $$1, $$2));
         return this;
      }

      public dbu a() {
         return new dbu(this.a.build());
      }
   }

   public static record b(je<byf> c, byi d, bwq e) {
      public static final Codec<dbu.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(byf.a.fieldOf("type").forGetter(dbu.b::a), byi.a.forGetter(dbu.b::b), bwq.m.optionalFieldOf("slot", bwq.a).forGetter(dbu.b::c))
               .apply($$0, dbu.b::new)
      );
      public static final yw<wj, dbu.b> b = yw.a(byf.b, dbu.b::a, byi.c, dbu.b::b, bwq.n, dbu.b::c, dbu.b::new);

      public boolean a(je<byf> $$0, alg $$1) {
         return $$0.equals(this.c) && this.d.a($$1);
      }

      public je<byf> a() {
         return this.c;
      }

      public byi b() {
         return this.d;
      }

      public bwq c() {
         return this.e;
      }
   }
}
