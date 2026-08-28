import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public record cww(List<cww.b> e, boolean f) {
   public static final cww a = new cww(List.of(), true);
   private static final Codec<cww> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(cww.b.a.listOf().fieldOf("modifiers").forGetter(cww::b), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cww::c))
            .apply($$0, cww::new)
   );
   public static final Codec<cww> b = Codec.withAlternative(g, cww.b.a.listOf(), $$0 -> new cww($$0, true));
   public static final ys<wf, cww> c = ys.a(cww.b.b.a(yq.a()), cww::b, yq.b, cww::c, cww::new);
   public static final DecimalFormat d = ac.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));

   public cww a(boolean $$0) {
      return new cww(this.e, $$0);
   }

   public static cww.a a() {
      return new cww.a();
   }

   public cww a(jj<bue> $$0, buh $$1, bso $$2) {
      Builder<cww.b> $$3 = ImmutableList.builderWithExpectedSize(this.e.size() + 1);

      for (cww.b $$4 : this.e) {
         if (!$$4.d.b().equals($$1.b())) {
            $$3.add($$4);
         }
      }

      $$3.add(new cww.b($$0, $$1, $$2));
      return new cww($$3.build(), this.f);
   }

   public void a(bsn $$0, BiConsumer<jj<bue>, buh> $$1) {
      for (cww.b $$2 : this.e) {
         if ($$2.e.b($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public double a(double $$0, bsn $$1) {
      double $$2 = $$0;

      for (cww.b $$3 : this.e) {
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

   public List<cww.b> b() {
      return this.e;
   }

   public boolean c() {
      return this.f;
   }

   public static class a {
      private final Builder<cww.b> a = ImmutableList.builder();

      a() {
      }

      public cww.a a(jj<bue> $$0, buh $$1, bso $$2) {
         this.a.add(new cww.b($$0, $$1, $$2));
         return this;
      }

      public cww a() {
         return new cww(this.a.build(), true);
      }
   }

   public static record b(jj<bue> c, buh d, bso e) {
      public static final Codec<cww.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(lq.s.s().fieldOf("type").forGetter(cww.b::a), buh.a.forGetter(cww.b::b), bso.l.optionalFieldOf("slot", bso.a).forGetter(cww.b::c))
               .apply($$0, cww.b::new)
      );
      public static final ys<wf, cww.b> b = ys.a(yq.b(lr.c), cww.b::a, buh.c, cww.b::b, bso.m, cww.b::c, cww.b::new);

      public jj<bue> a() {
         return this.c;
      }

      public buh b() {
         return this.d;
      }

      public bso c() {
         return this.e;
      }
   }
}
