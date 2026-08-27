import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public record cwj(List<cwj.b> e, boolean f) {
   public static final cwj a = new cwj(List.of(), true);
   private static final Codec<cwj> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(cwj.b.a.listOf().fieldOf("modifiers").forGetter(cwj::b), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cwj::c))
            .apply($$0, cwj::new)
   );
   public static final Codec<cwj> b = Codec.withAlternative(g, cwj.b.a.listOf(), $$0 -> new cwj($$0, true));
   public static final yv<wi, cwj> c = yv.a(cwj.b.b.a(yt.a()), cwj::b, yt.b, cwj::c, cwj::new);
   public static final DecimalFormat d = ac.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));

   public cwj a(boolean $$0) {
      return new cwj(this.e, $$0);
   }

   public static cwj.a a() {
      return new cwj.a();
   }

   public cwj a(ix<btr> $$0, btu $$1, bsc $$2) {
      return new cwj(ac.a(this.e, new cwj.b($$0, $$1, $$2)), this.f);
   }

   public void a(bsb $$0, BiConsumer<ix<btr>, btu> $$1) {
      for (cwj.b $$2 : this.e) {
         if ($$2.e.a($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public double a(double $$0, bsb $$1) {
      double $$2 = $$0;

      for (cwj.b $$3 : this.e) {
         if ($$3.e.a($$1)) {
            double $$4 = $$3.d.d();

            $$2 += switch ($$3.d.e()) {
               case a -> $$4;
               case b -> $$4 * $$0;
               case c -> $$4 * $$2;
            };
         }
      }

      return $$2;
   }

   public List<cwj.b> b() {
      return this.e;
   }

   public boolean c() {
      return this.f;
   }

   public static class a {
      private final Builder<cwj.b> a = ImmutableList.builder();

      a() {
      }

      public cwj.a a(ix<btr> $$0, btu $$1, bsc $$2) {
         this.a.add(new cwj.b($$0, $$1, $$2));
         return this;
      }

      public cwj a() {
         return new cwj(this.a.build(), true);
      }
   }

   public static record b(ix<btr> c, btu d, bsc e) {
      public static final Codec<cwj.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(le.u.r().fieldOf("type").forGetter(cwj.b::a), btu.a.forGetter(cwj.b::b), bsc.l.optionalFieldOf("slot", bsc.a).forGetter(cwj.b::c))
               .apply($$0, cwj.b::new)
      );
      public static final yv<wi, cwj.b> b = yv.a(yt.b(lf.c), cwj.b::a, btu.c, cwj.b::b, bsc.m, cwj.b::c, cwj.b::new);

      public ix<btr> a() {
         return this.c;
      }

      public btu b() {
         return this.d;
      }

      public bsc c() {
         return this.e;
      }
   }
}
