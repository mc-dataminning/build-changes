import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public record cuw(List<cuw.b> e, boolean f) {
   public static final cuw a = new cuw(List.of(), true);
   private static final Codec<cuw> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(cuw.b.a.listOf().fieldOf("modifiers").forGetter(cuw::b), axe.a(Codec.BOOL, "show_in_tooltip", true).forGetter(cuw::c))
            .apply($$0, cuw::new)
   );
   public static final Codec<cuw> b = axe.a(g, cuw.b.a.listOf(), $$0 -> new cuw($$0, true));
   public static final yq<wd, cuw> c = yq.a(cuw.b.b.a(yo.a()), cuw::b, yo.b, cuw::c, cuw::new);
   public static final DecimalFormat d = ac.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));

   public static cuw.a a() {
      return new cuw.a();
   }

   public cuw a(iv<bsg> $$0, bsj $$1, bqt $$2) {
      return new cuw(ac.a(this.e, new cuw.b($$0, $$1, $$2)), this.f);
   }

   public void a(bqs $$0, BiConsumer<iv<bsg>, bsj> $$1) {
      for (cuw.b $$2 : this.e) {
         if ($$2.e.a($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public double a(double $$0, bqs $$1) {
      double $$2 = $$0;

      for (cuw.b $$3 : this.e) {
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

   public List<cuw.b> b() {
      return this.e;
   }

   public boolean c() {
      return this.f;
   }

   public static class a {
      private final Builder<cuw.b> a = ImmutableList.builder();

      a() {
      }

      public cuw.a a(iv<bsg> $$0, bsj $$1, bqt $$2) {
         this.a.add(new cuw.b($$0, $$1, $$2));
         return this;
      }

      public cuw a() {
         return new cuw(this.a.build(), true);
      }
   }

   public static record b(iv<bsg> c, bsj d, bqt e) {
      public static final Codec<cuw.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(lc.u.r().fieldOf("type").forGetter(cuw.b::a), bsj.a.forGetter(cuw.b::b), axe.a(bqt.k, "slot", bqt.a).forGetter(cuw.b::c))
               .apply($$0, cuw.b::new)
      );
      public static final yq<wd, cuw.b> b = yq.a(yo.b(ld.c), cuw.b::a, bsj.c, cuw.b::b, bqt.l, cuw.b::c, cuw.b::new);

      public iv<bsg> a() {
         return this.c;
      }

      public bsj b() {
         return this.d;
      }

      public bqt c() {
         return this.e;
      }
   }
}
