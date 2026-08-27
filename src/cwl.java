import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public record cwl(List<cwl.b> e, boolean f) {
   public static final cwl a = new cwl(List.of(), true);
   private static final Codec<cwl> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(cwl.b.a.listOf().fieldOf("modifiers").forGetter(cwl::b), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cwl::c))
            .apply($$0, cwl::new)
   );
   public static final Codec<cwl> b = Codec.withAlternative(g, cwl.b.a.listOf(), $$0 -> new cwl($$0, true));
   public static final yv<wi, cwl> c = yv.a(cwl.b.b.a(yt.a()), cwl::b, yt.b, cwl::c, cwl::new);
   public static final DecimalFormat d = ac.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));

   public cwl a(boolean $$0) {
      return new cwl(this.e, $$0);
   }

   public static cwl.a a() {
      return new cwl.a();
   }

   public cwl a(ix<btt> $$0, btw $$1, bse $$2) {
      Builder<cwl.b> $$3 = ImmutableList.builderWithExpectedSize(this.e.size() + 1);

      for (cwl.b $$4 : this.e) {
         if (!$$4.d.b().equals($$1.b())) {
            $$3.add($$4);
         }
      }

      $$3.add(new cwl.b($$0, $$1, $$2));
      return new cwl($$3.build(), this.f);
   }

   public void a(bsd $$0, BiConsumer<ix<btt>, btw> $$1) {
      for (cwl.b $$2 : this.e) {
         if ($$2.e.b($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public double a(double $$0, bsd $$1) {
      double $$2 = $$0;

      for (cwl.b $$3 : this.e) {
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

   public List<cwl.b> b() {
      return this.e;
   }

   public boolean c() {
      return this.f;
   }

   public static class a {
      private final Builder<cwl.b> a = ImmutableList.builder();

      a() {
      }

      public cwl.a a(ix<btt> $$0, btw $$1, bse $$2) {
         this.a.add(new cwl.b($$0, $$1, $$2));
         return this;
      }

      public cwl a() {
         return new cwl(this.a.build(), true);
      }
   }

   public static record b(ix<btt> c, btw d, bse e) {
      public static final Codec<cwl.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(le.u.r().fieldOf("type").forGetter(cwl.b::a), btw.a.forGetter(cwl.b::b), bse.l.optionalFieldOf("slot", bse.a).forGetter(cwl.b::c))
               .apply($$0, cwl.b::new)
      );
      public static final yv<wi, cwl.b> b = yv.a(yt.b(lf.c), cwl.b::a, btw.c, cwl.b::b, bse.m, cwl.b::c, cwl.b::new);

      public ix<btt> a() {
         return this.c;
      }

      public btw b() {
         return this.d;
      }

      public bse c() {
         return this.e;
      }
   }
}
