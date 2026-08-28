import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public record cwx(List<cwx.b> e, boolean f) {
   public static final cwx a = new cwx(List.of(), true);
   private static final Codec<cwx> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(cwx.b.a.listOf().fieldOf("modifiers").forGetter(cwx::b), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cwx::c))
            .apply($$0, cwx::new)
   );
   public static final Codec<cwx> b = Codec.withAlternative(g, cwx.b.a.listOf(), $$0 -> new cwx($$0, true));
   public static final ys<wf, cwx> c = ys.a(cwx.b.b.a(yq.a()), cwx::b, yq.b, cwx::c, cwx::new);
   public static final DecimalFormat d = ac.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));

   public cwx a(boolean $$0) {
      return new cwx(this.e, $$0);
   }

   public static cwx.a a() {
      return new cwx.a();
   }

   public cwx a(jj<buf> $$0, bui $$1, bsp $$2) {
      Builder<cwx.b> $$3 = ImmutableList.builderWithExpectedSize(this.e.size() + 1);

      for (cwx.b $$4 : this.e) {
         if (!$$4.d.b().equals($$1.b())) {
            $$3.add($$4);
         }
      }

      $$3.add(new cwx.b($$0, $$1, $$2));
      return new cwx($$3.build(), this.f);
   }

   public void a(bsp $$0, BiConsumer<jj<buf>, bui> $$1) {
      for (cwx.b $$2 : this.e) {
         if ($$2.e.equals($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public void a(bso $$0, BiConsumer<jj<buf>, bui> $$1) {
      for (cwx.b $$2 : this.e) {
         if ($$2.e.b($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public double a(double $$0, bso $$1) {
      double $$2 = $$0;

      for (cwx.b $$3 : this.e) {
         if ($$3.e.b($$1)) {
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

   public List<cwx.b> b() {
      return this.e;
   }

   public boolean c() {
      return this.f;
   }

   public static class a {
      private final Builder<cwx.b> a = ImmutableList.builder();

      a() {
      }

      public cwx.a a(jj<buf> $$0, bui $$1, bsp $$2) {
         this.a.add(new cwx.b($$0, $$1, $$2));
         return this;
      }

      public cwx a() {
         return new cwx(this.a.build(), true);
      }
   }

   public static record b(jj<buf> c, bui d, bsp e) {
      public static final Codec<cwx.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(buf.a.fieldOf("type").forGetter(cwx.b::a), bui.a.forGetter(cwx.b::b), bsp.l.optionalFieldOf("slot", bsp.a).forGetter(cwx.b::c))
               .apply($$0, cwx.b::new)
      );
      public static final ys<wf, cwx.b> b = ys.a(buf.b, cwx.b::a, bui.c, cwx.b::b, bsp.m, cwx.b::c, cwx.b::new);

      public jj<buf> a() {
         return this.c;
      }

      public bui b() {
         return this.d;
      }

      public bsp c() {
         return this.e;
      }
   }
}
