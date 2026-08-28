import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public record cwu(List<cwu.b> e, boolean f) {
   public static final cwu a = new cwu(List.of(), true);
   private static final Codec<cwu> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(cwu.b.a.listOf().fieldOf("modifiers").forGetter(cwu::b), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cwu::c))
            .apply($$0, cwu::new)
   );
   public static final Codec<cwu> b = Codec.withAlternative(g, cwu.b.a.listOf(), $$0 -> new cwu($$0, true));
   public static final ys<wf, cwu> c = ys.a(cwu.b.b.a(yq.a()), cwu::b, yq.b, cwu::c, cwu::new);
   public static final DecimalFormat d = ac.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));

   public cwu a(boolean $$0) {
      return new cwu(this.e, $$0);
   }

   public static cwu.a a() {
      return new cwu.a();
   }

   public cwu a(jj<bub> $$0, bue $$1, bsl $$2) {
      Builder<cwu.b> $$3 = ImmutableList.builderWithExpectedSize(this.e.size() + 1);

      for (cwu.b $$4 : this.e) {
         if (!$$4.d.b().equals($$1.b())) {
            $$3.add($$4);
         }
      }

      $$3.add(new cwu.b($$0, $$1, $$2));
      return new cwu($$3.build(), this.f);
   }

   public void a(bsk $$0, BiConsumer<jj<bub>, bue> $$1) {
      for (cwu.b $$2 : this.e) {
         if ($$2.e.b($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public double a(double $$0, bsk $$1) {
      double $$2 = $$0;

      for (cwu.b $$3 : this.e) {
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

   public List<cwu.b> b() {
      return this.e;
   }

   public boolean c() {
      return this.f;
   }

   public static class a {
      private final Builder<cwu.b> a = ImmutableList.builder();

      a() {
      }

      public cwu.a a(jj<bub> $$0, bue $$1, bsl $$2) {
         this.a.add(new cwu.b($$0, $$1, $$2));
         return this;
      }

      public cwu a() {
         return new cwu(this.a.build(), true);
      }
   }

   public static record b(jj<bub> c, bue d, bsl e) {
      public static final Codec<cwu.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(lq.s.s().fieldOf("type").forGetter(cwu.b::a), bue.a.forGetter(cwu.b::b), bsl.l.optionalFieldOf("slot", bsl.a).forGetter(cwu.b::c))
               .apply($$0, cwu.b::new)
      );
      public static final ys<wf, cwu.b> b = ys.a(yq.b(lr.c), cwu.b::a, bue.c, cwu.b::b, bsl.m, cwu.b::c, cwu.b::new);

      public jj<bub> a() {
         return this.c;
      }

      public bue b() {
         return this.d;
      }

      public bsl c() {
         return this.e;
      }
   }
}
