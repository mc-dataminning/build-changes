import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public record dam(List<dam.b> e, boolean f) {
   public static final dam a = new dam(List.of(), true);
   private static final Codec<dam> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(dam.b.a.listOf().fieldOf("modifiers").forGetter(dam::b), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(dam::c))
            .apply($$0, dam::new)
   );
   public static final Codec<dam> b = Codec.withAlternative(g, dam.b.a.listOf(), $$0 -> new dam($$0, true));
   public static final yt<wg, dam> c = yt.a(dam.b.b.a(yr.a()), dam::b, yr.b, dam::c, dam::new);
   public static final DecimalFormat d = af.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));

   public dam a(boolean $$0) {
      return new dam(this.e, $$0);
   }

   public static dam.a a() {
      return new dam.a();
   }

   public dam a(js<bxs> $$0, bxv $$1, bwd $$2) {
      Builder<dam.b> $$3 = ImmutableList.builderWithExpectedSize(this.e.size() + 1);

      for (dam.b $$4 : this.e) {
         if (!$$4.a($$0, $$1.b())) {
            $$3.add($$4);
         }
      }

      $$3.add(new dam.b($$0, $$1, $$2));
      return new dam($$3.build(), this.f);
   }

   public void a(bwd $$0, BiConsumer<js<bxs>, bxv> $$1) {
      for (dam.b $$2 : this.e) {
         if ($$2.e.equals($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public void a(bwc $$0, BiConsumer<js<bxs>, bxv> $$1) {
      for (dam.b $$2 : this.e) {
         if ($$2.e.b($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public double a(double $$0, bwc $$1) {
      double $$2 = $$0;

      for (dam.b $$3 : this.e) {
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

   public List<dam.b> b() {
      return this.e;
   }

   public boolean c() {
      return this.f;
   }

   public static class a {
      private final Builder<dam.b> a = ImmutableList.builder();

      a() {
      }

      public dam.a a(js<bxs> $$0, bxv $$1, bwd $$2) {
         this.a.add(new dam.b($$0, $$1, $$2));
         return this;
      }

      public dam a() {
         return new dam(this.a.build(), true);
      }
   }

   public static record b(js<bxs> c, bxv d, bwd e) {
      public static final Codec<dam.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bxs.a.fieldOf("type").forGetter(dam.b::a), bxv.a.forGetter(dam.b::b), bwd.m.optionalFieldOf("slot", bwd.a).forGetter(dam.b::c))
               .apply($$0, dam.b::new)
      );
      public static final yt<wg, dam.b> b = yt.a(bxs.b, dam.b::a, bxv.c, dam.b::b, bwd.n, dam.b::c, dam.b::new);

      public boolean a(js<bxs> $$0, ald $$1) {
         return $$0.equals(this.c) && this.d.a($$1);
      }

      public js<bxs> a() {
         return this.c;
      }

      public bxv b() {
         return this.d;
      }

      public bwd c() {
         return this.e;
      }
   }
}
