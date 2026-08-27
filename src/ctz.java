import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public record ctz(List<ctz.b> e, boolean f) {
   public static final ctz a = new ctz(List.of(), true);
   public static final Codec<ctz> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(ctz.b.a.listOf().fieldOf("modifiers").forGetter(ctz::b), aws.a(Codec.BOOL, "show_in_tooltip", true).forGetter(ctz::c))
            .apply($$0, ctz::new)
   );
   public static final ye<vr, ctz> c = ye.a(ctz.b.b.a(yc.a()), ctz::b, yc.b, ctz::c, ctz::new);
   public static final DecimalFormat d = ac.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));

   public static ctz.a a() {
      return new ctz.a();
   }

   public ctz a(il<brq> $$0, brt $$1, bqd $$2) {
      return new ctz(ac.a(this.e, new ctz.b($$0, $$1, $$2)), this.f);
   }

   public void a(bqc $$0, BiConsumer<il<brq>, brt> $$1) {
      for (ctz.b $$2 : this.e) {
         if ($$2.e.a($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public double a(double $$0, bqc $$1) {
      double $$2 = $$0;

      for (ctz.b $$3 : this.e) {
         if ($$3.e.a($$1)) {
            double $$4 = $$3.d.c();

            $$2 += switch ($$3.d.b()) {
               case a -> $$4;
               case b -> $$4 * $$0;
               case c -> $$4 * $$2;
            };
         }
      }

      return $$2;
   }

   public List<ctz.b> b() {
      return this.e;
   }

   public boolean c() {
      return this.f;
   }

   public static class a {
      private final Builder<ctz.b> a = ImmutableList.builder();

      a() {
      }

      public ctz.a a(il<brq> $$0, brt $$1, bqd $$2) {
         this.a.add(new ctz.b($$0, $$1, $$2));
         return this;
      }

      public ctz a() {
         return new ctz(this.a.build(), true);
      }
   }

   public static record b(il<brq> c, brt d, bqd e) {
      public static final Codec<ctz.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kr.u.r().fieldOf("type").forGetter(ctz.b::a), brt.a.forGetter(ctz.b::b), aws.a(bqd.k, "slot", bqd.a).forGetter(ctz.b::c))
               .apply($$0, ctz.b::new)
      );
      public static final ye<vr, ctz.b> b = ye.a(yc.b(ks.c), ctz.b::a, brt.c, ctz.b::b, bqd.l, ctz.b::c, ctz.b::new);

      public il<brq> a() {
         return this.c;
      }

      public brt b() {
         return this.d;
      }

      public bqd c() {
         return this.e;
      }
   }
}
