import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public record czh(List<czh.b> e, boolean f) {
   public static final czh a = new czh(List.of(), true);
   private static final Codec<czh> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(czh.b.a.listOf().fieldOf("modifiers").forGetter(czh::b), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(czh::c))
            .apply($$0, czh::new)
   );
   public static final Codec<czh> b = Codec.withAlternative(g, czh.b.a.listOf(), $$0 -> new czh($$0, true));
   public static final yn<wa, czh> c = yn.a(czh.b.b.a(yl.a()), czh::b, yl.b, czh::c, czh::new);
   public static final DecimalFormat d = af.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));

   public czh a(boolean $$0) {
      return new czh(this.e, $$0);
   }

   public static czh.a a() {
      return new czh.a();
   }

   public czh a(jr<bwl> $$0, bwo $$1, buv $$2) {
      Builder<czh.b> $$3 = ImmutableList.builderWithExpectedSize(this.e.size() + 1);

      for (czh.b $$4 : this.e) {
         if (!$$4.a($$0, $$1.b())) {
            $$3.add($$4);
         }
      }

      $$3.add(new czh.b($$0, $$1, $$2));
      return new czh($$3.build(), this.f);
   }

   public void a(buv $$0, BiConsumer<jr<bwl>, bwo> $$1) {
      for (czh.b $$2 : this.e) {
         if ($$2.e.equals($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public void a(buu $$0, BiConsumer<jr<bwl>, bwo> $$1) {
      for (czh.b $$2 : this.e) {
         if ($$2.e.b($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public double a(double $$0, buu $$1) {
      double $$2 = $$0;

      for (czh.b $$3 : this.e) {
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

   public List<czh.b> b() {
      return this.e;
   }

   public boolean c() {
      return this.f;
   }

   public static class a {
      private final Builder<czh.b> a = ImmutableList.builder();

      a() {
      }

      public czh.a a(jr<bwl> $$0, bwo $$1, buv $$2) {
         this.a.add(new czh.b($$0, $$1, $$2));
         return this;
      }

      public czh a() {
         return new czh(this.a.build(), true);
      }
   }

   public static record b(jr<bwl> c, bwo d, buv e) {
      public static final Codec<czh.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bwl.a.fieldOf("type").forGetter(czh.b::a), bwo.a.forGetter(czh.b::b), buv.l.optionalFieldOf("slot", buv.a).forGetter(czh.b::c))
               .apply($$0, czh.b::new)
      );
      public static final yn<wa, czh.b> b = yn.a(bwl.b, czh.b::a, bwo.c, czh.b::b, buv.m, czh.b::c, czh.b::new);

      public boolean a(jr<bwl> $$0, akv $$1) {
         return $$0.equals(this.c) && this.d.a($$1);
      }

      public jr<bwl> a() {
         return this.c;
      }

      public bwo b() {
         return this.d;
      }

      public buv c() {
         return this.e;
      }
   }
}
