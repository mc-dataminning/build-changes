import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public record cui(List<cui.b> e, boolean f) {
   public static final cui a = new cui(List.of(), true);
   private static final Codec<cui> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(cui.b.a.listOf().fieldOf("modifiers").forGetter(cui::b), awu.a(Codec.BOOL, "show_in_tooltip", true).forGetter(cui::c))
            .apply($$0, cui::new)
   );
   public static final Codec<cui> b = awu.a(g, cui.b.a.listOf(), $$0 -> new cui($$0, true));
   public static final yg<vt, cui> c = yg.a(cui.b.b.a(ye.a()), cui::b, ye.b, cui::c, cui::new);
   public static final DecimalFormat d = ac.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));

   public static cui.a a() {
      return new cui.a();
   }

   public cui a(in<brv> $$0, bry $$1, bqi $$2) {
      return new cui(ac.a(this.e, new cui.b($$0, $$1, $$2)), this.f);
   }

   public void a(bqh $$0, BiConsumer<in<brv>, bry> $$1) {
      for (cui.b $$2 : this.e) {
         if ($$2.e.a($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public double a(double $$0, bqh $$1) {
      double $$2 = $$0;

      for (cui.b $$3 : this.e) {
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

   public List<cui.b> b() {
      return this.e;
   }

   public boolean c() {
      return this.f;
   }

   public static class a {
      private final Builder<cui.b> a = ImmutableList.builder();

      a() {
      }

      public cui.a a(in<brv> $$0, bry $$1, bqi $$2) {
         this.a.add(new cui.b($$0, $$1, $$2));
         return this;
      }

      public cui a() {
         return new cui(this.a.build(), true);
      }
   }

   public static record b(in<brv> c, bry d, bqi e) {
      public static final Codec<cui.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kt.u.r().fieldOf("type").forGetter(cui.b::a), bry.a.forGetter(cui.b::b), awu.a(bqi.k, "slot", bqi.a).forGetter(cui.b::c))
               .apply($$0, cui.b::new)
      );
      public static final yg<vt, cui.b> b = yg.a(ye.b(ku.c), cui.b::a, bry.c, cui.b::b, bqi.l, cui.b::c, cui.b::new);

      public in<brv> a() {
         return this.c;
      }

      public bry b() {
         return this.d;
      }

      public bqi c() {
         return this.e;
      }
   }
}
