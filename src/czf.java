import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public record czf(List<czf.b> e, boolean f) {
   public static final czf a = new czf(List.of(), true);
   private static final Codec<czf> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(czf.b.a.listOf().fieldOf("modifiers").forGetter(czf::b), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(czf::c))
            .apply($$0, czf::new)
   );
   public static final Codec<czf> b = Codec.withAlternative(g, czf.b.a.listOf(), $$0 -> new czf($$0, true));
   public static final yn<wa, czf> c = yn.a(czf.b.b.a(yl.a()), czf::b, yl.b, czf::c, czf::new);
   public static final DecimalFormat d = af.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));

   public czf a(boolean $$0) {
      return new czf(this.e, $$0);
   }

   public static czf.a a() {
      return new czf.a();
   }

   public czf a(jr<bwj> $$0, bwm $$1, but $$2) {
      Builder<czf.b> $$3 = ImmutableList.builderWithExpectedSize(this.e.size() + 1);

      for (czf.b $$4 : this.e) {
         if (!$$4.a($$0, $$1.b())) {
            $$3.add($$4);
         }
      }

      $$3.add(new czf.b($$0, $$1, $$2));
      return new czf($$3.build(), this.f);
   }

   public void a(but $$0, BiConsumer<jr<bwj>, bwm> $$1) {
      for (czf.b $$2 : this.e) {
         if ($$2.e.equals($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public void a(bus $$0, BiConsumer<jr<bwj>, bwm> $$1) {
      for (czf.b $$2 : this.e) {
         if ($$2.e.b($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public double a(double $$0, bus $$1) {
      double $$2 = $$0;

      for (czf.b $$3 : this.e) {
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

   public List<czf.b> b() {
      return this.e;
   }

   public boolean c() {
      return this.f;
   }

   public static class a {
      private final Builder<czf.b> a = ImmutableList.builder();

      a() {
      }

      public czf.a a(jr<bwj> $$0, bwm $$1, but $$2) {
         this.a.add(new czf.b($$0, $$1, $$2));
         return this;
      }

      public czf a() {
         return new czf(this.a.build(), true);
      }
   }

   public static record b(jr<bwj> c, bwm d, but e) {
      public static final Codec<czf.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bwj.a.fieldOf("type").forGetter(czf.b::a), bwm.a.forGetter(czf.b::b), but.l.optionalFieldOf("slot", but.a).forGetter(czf.b::c))
               .apply($$0, czf.b::new)
      );
      public static final yn<wa, czf.b> b = yn.a(bwj.b, czf.b::a, bwm.c, czf.b::b, but.m, czf.b::c, czf.b::new);

      public boolean a(jr<bwj> $$0, akv $$1) {
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
