import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public record cyw(List<cyw.b> e, boolean f) {
   public static final cyw a = new cyw(List.of(), true);
   private static final Codec<cyw> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(cyw.b.a.listOf().fieldOf("modifiers").forGetter(cyw::b), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cyw::c))
            .apply($$0, cyw::new)
   );
   public static final Codec<cyw> b = Codec.withAlternative(g, cyw.b.a.listOf(), $$0 -> new cyw($$0, true));
   public static final zj<ww, cyw> c = zj.a(cyw.b.b.a(zh.a()), cyw::b, zh.b, cyw::c, cyw::new);
   public static final DecimalFormat d = ae.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));

   public cyw a(boolean $$0) {
      return new cyw(this.e, $$0);
   }

   public static cyw.a a() {
      return new cyw.a();
   }

   public cyw a(jq<bwh> $$0, bwk $$1, bur $$2) {
      Builder<cyw.b> $$3 = ImmutableList.builderWithExpectedSize(this.e.size() + 1);

      for (cyw.b $$4 : this.e) {
         if (!$$4.a($$0, $$1.b())) {
            $$3.add($$4);
         }
      }

      $$3.add(new cyw.b($$0, $$1, $$2));
      return new cyw($$3.build(), this.f);
   }

   public void a(bur $$0, BiConsumer<jq<bwh>, bwk> $$1) {
      for (cyw.b $$2 : this.e) {
         if ($$2.e.equals($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public void a(buq $$0, BiConsumer<jq<bwh>, bwk> $$1) {
      for (cyw.b $$2 : this.e) {
         if ($$2.e.b($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public double a(double $$0, buq $$1) {
      double $$2 = $$0;

      for (cyw.b $$3 : this.e) {
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

   public List<cyw.b> b() {
      return this.e;
   }

   public boolean c() {
      return this.f;
   }

   public static class a {
      private final Builder<cyw.b> a = ImmutableList.builder();

      a() {
      }

      public cyw.a a(jq<bwh> $$0, bwk $$1, bur $$2) {
         this.a.add(new cyw.b($$0, $$1, $$2));
         return this;
      }

      public cyw a() {
         return new cyw(this.a.build(), true);
      }
   }

   public static record b(jq<bwh> c, bwk d, bur e) {
      public static final Codec<cyw.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bwh.a.fieldOf("type").forGetter(cyw.b::a), bwk.a.forGetter(cyw.b::b), bur.l.optionalFieldOf("slot", bur.a).forGetter(cyw.b::c))
               .apply($$0, cyw.b::new)
      );
      public static final zj<ww, cyw.b> b = zj.a(bwh.b, cyw.b::a, bwk.c, cyw.b::b, bur.m, cyw.b::c, cyw.b::new);

      public boolean a(jq<bwh> $$0, all $$1) {
         return $$0.equals(this.c) && this.d.a($$1);
      }

      public jq<bwh> a() {
         return this.c;
      }

      public bwk b() {
         return this.d;
      }

      public bur c() {
         return this.e;
      }
   }
}
