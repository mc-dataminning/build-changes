import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public record czg(List<czg.b> e, boolean f) {
   public static final czg a = new czg(List.of(), true);
   private static final Codec<czg> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(czg.b.a.listOf().fieldOf("modifiers").forGetter(czg::b), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(czg::c))
            .apply($$0, czg::new)
   );
   public static final Codec<czg> b = Codec.withAlternative(g, czg.b.a.listOf(), $$0 -> new czg($$0, true));
   public static final ym<vz, czg> c = ym.a(czg.b.b.a(yk.a()), czg::b, yk.b, czg::c, czg::new);
   public static final DecimalFormat d = af.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));

   public czg a(boolean $$0) {
      return new czg(this.e, $$0);
   }

   public static czg.a a() {
      return new czg.a();
   }

   public czg a(jr<bwj> $$0, bwm $$1, but $$2) {
      Builder<czg.b> $$3 = ImmutableList.builderWithExpectedSize(this.e.size() + 1);

      for (czg.b $$4 : this.e) {
         if (!$$4.a($$0, $$1.b())) {
            $$3.add($$4);
         }
      }

      $$3.add(new czg.b($$0, $$1, $$2));
      return new czg($$3.build(), this.f);
   }

   public void a(but $$0, BiConsumer<jr<bwj>, bwm> $$1) {
      for (czg.b $$2 : this.e) {
         if ($$2.e.equals($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public void a(bus $$0, BiConsumer<jr<bwj>, bwm> $$1) {
      for (czg.b $$2 : this.e) {
         if ($$2.e.b($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public double a(double $$0, bus $$1) {
      double $$2 = $$0;

      for (czg.b $$3 : this.e) {
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

   public List<czg.b> b() {
      return this.e;
   }

   public boolean c() {
      return this.f;
   }

   public static class a {
      private final Builder<czg.b> a = ImmutableList.builder();

      a() {
      }

      public czg.a a(jr<bwj> $$0, bwm $$1, but $$2) {
         this.a.add(new czg.b($$0, $$1, $$2));
         return this;
      }

      public czg a() {
         return new czg(this.a.build(), true);
      }
   }

   public static record b(jr<bwj> c, bwm d, but e) {
      public static final Codec<czg.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bwj.a.fieldOf("type").forGetter(czg.b::a), bwm.a.forGetter(czg.b::b), but.l.optionalFieldOf("slot", but.a).forGetter(czg.b::c))
               .apply($$0, czg.b::new)
      );
      public static final ym<vz, czg.b> b = ym.a(bwj.b, czg.b::a, bwm.c, czg.b::b, but.m, czg.b::c, czg.b::new);

      public boolean a(jr<bwj> $$0, aku $$1) {
         return $$0.equals(this.c) && this.d.a($$1);
      }

      public jr<bwj> a() {
         return this.c;
      }

      public bwm b() {
         return this.d;
      }

      public but c() {
         return this.e;
      }
   }
}
