import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public record czd(List<czd.b> e, boolean f) {
   public static final czd a = new czd(List.of(), true);
   private static final Codec<czd> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(czd.b.a.listOf().fieldOf("modifiers").forGetter(czd::b), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(czd::c))
            .apply($$0, czd::new)
   );
   public static final Codec<czd> b = Codec.withAlternative(g, czd.b.a.listOf(), $$0 -> new czd($$0, true));
   public static final zh<wu, czd> c = zh.a(czd.b.b.a(zf.a()), czd::b, zf.b, czd::c, czd::new);
   public static final DecimalFormat d = ae.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));

   public czd a(boolean $$0) {
      return new czd(this.e, $$0);
   }

   public static czd.a a() {
      return new czd.a();
   }

   public czd a(jq<bwk> $$0, bwn $$1, buu $$2) {
      Builder<czd.b> $$3 = ImmutableList.builderWithExpectedSize(this.e.size() + 1);

      for (czd.b $$4 : this.e) {
         if (!$$4.a($$0, $$1.b())) {
            $$3.add($$4);
         }
      }

      $$3.add(new czd.b($$0, $$1, $$2));
      return new czd($$3.build(), this.f);
   }

   public void a(buu $$0, BiConsumer<jq<bwk>, bwn> $$1) {
      for (czd.b $$2 : this.e) {
         if ($$2.e.equals($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public void a(but $$0, BiConsumer<jq<bwk>, bwn> $$1) {
      for (czd.b $$2 : this.e) {
         if ($$2.e.b($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public double a(double $$0, but $$1) {
      double $$2 = $$0;

      for (czd.b $$3 : this.e) {
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

   public List<czd.b> b() {
      return this.e;
   }

   public boolean c() {
      return this.f;
   }

   public static class a {
      private final Builder<czd.b> a = ImmutableList.builder();

      a() {
      }

      public czd.a a(jq<bwk> $$0, bwn $$1, buu $$2) {
         this.a.add(new czd.b($$0, $$1, $$2));
         return this;
      }

      public czd a() {
         return new czd(this.a.build(), true);
      }
   }

   public static record b(jq<bwk> c, bwn d, buu e) {
      public static final Codec<czd.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bwk.a.fieldOf("type").forGetter(czd.b::a), bwn.a.forGetter(czd.b::b), buu.l.optionalFieldOf("slot", buu.a).forGetter(czd.b::c))
               .apply($$0, czd.b::new)
      );
      public static final zh<wu, czd.b> b = zh.a(bwk.b, czd.b::a, bwn.c, czd.b::b, buu.m, czd.b::c, czd.b::new);

      public boolean a(jq<bwk> $$0, alj $$1) {
         return $$0.equals(this.c) && this.d.a($$1);
      }

      public jq<bwk> a() {
         return this.c;
      }

      public bwn b() {
         return this.d;
      }

      public buu c() {
         return this.e;
      }
   }
}
