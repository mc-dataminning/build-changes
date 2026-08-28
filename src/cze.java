import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public record cze(List<cze.b> e, boolean f) {
   public static final cze a = new cze(List.of(), true);
   private static final Codec<cze> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(cze.b.a.listOf().fieldOf("modifiers").forGetter(cze::b), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cze::c))
            .apply($$0, cze::new)
   );
   public static final Codec<cze> b = Codec.withAlternative(g, cze.b.a.listOf(), $$0 -> new cze($$0, true));
   public static final ym<vz, cze> c = ym.a(cze.b.b.a(yk.a()), cze::b, yk.b, cze::c, cze::new);
   public static final DecimalFormat d = af.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));

   public cze a(boolean $$0) {
      return new cze(this.e, $$0);
   }

   public static cze.a a() {
      return new cze.a();
   }

   public cze a(jr<bwi> $$0, bwl $$1, bus $$2) {
      Builder<cze.b> $$3 = ImmutableList.builderWithExpectedSize(this.e.size() + 1);

      for (cze.b $$4 : this.e) {
         if (!$$4.a($$0, $$1.b())) {
            $$3.add($$4);
         }
      }

      $$3.add(new cze.b($$0, $$1, $$2));
      return new cze($$3.build(), this.f);
   }

   public void a(bus $$0, BiConsumer<jr<bwi>, bwl> $$1) {
      for (cze.b $$2 : this.e) {
         if ($$2.e.equals($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public void a(bur $$0, BiConsumer<jr<bwi>, bwl> $$1) {
      for (cze.b $$2 : this.e) {
         if ($$2.e.b($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public double a(double $$0, bur $$1) {
      double $$2 = $$0;

      for (cze.b $$3 : this.e) {
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

   public List<cze.b> b() {
      return this.e;
   }

   public boolean c() {
      return this.f;
   }

   public static class a {
      private final Builder<cze.b> a = ImmutableList.builder();

      a() {
      }

      public cze.a a(jr<bwi> $$0, bwl $$1, bus $$2) {
         this.a.add(new cze.b($$0, $$1, $$2));
         return this;
      }

      public cze a() {
         return new cze(this.a.build(), true);
      }
   }

   public static record b(jr<bwi> c, bwl d, bus e) {
      public static final Codec<cze.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bwi.a.fieldOf("type").forGetter(cze.b::a), bwl.a.forGetter(cze.b::b), bus.l.optionalFieldOf("slot", bus.a).forGetter(cze.b::c))
               .apply($$0, cze.b::new)
      );
      public static final ym<vz, cze.b> b = ym.a(bwi.b, cze.b::a, bwl.c, cze.b::b, bus.m, cze.b::c, cze.b::new);

      public boolean a(jr<bwi> $$0, aku $$1) {
         return $$0.equals(this.c) && this.d.a($$1);
      }

      public jr<bwi> a() {
         return this.c;
      }

      public bwl b() {
         return this.d;
      }

      public bus c() {
         return this.e;
      }
   }
}
