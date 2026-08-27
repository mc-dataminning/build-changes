import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import it.unimi.dsi.fastutil.doubles.DoubleListIterator;
import java.util.List;

public class efz {
   private static final double a = 1.0181268882175227;
   private static final double b = 0.3333333333333333;
   private final double c;
   private final ega d;
   private final ega e;
   private final double f;
   private final efz.a g;

   @Deprecated
   public static efz a(awp $$0, efz.a $$1) {
      return new efz($$0, $$1, false);
   }

   public static efz a(awp $$0, int $$1, double... $$2) {
      return b($$0, new efz.a($$1, new DoubleArrayList($$2)));
   }

   public static efz b(awp $$0, efz.a $$1) {
      return new efz($$0, $$1, true);
   }

   private efz(awp $$0, efz.a $$1, boolean $$2) {
      int $$3 = $$1.c;
      DoubleList $$4 = $$1.d;
      this.g = $$1;
      if ($$2) {
         this.d = ega.b($$0, $$3, $$4);
         this.e = ega.b($$0, $$3, $$4);
      } else {
         this.d = ega.a($$0, $$3, $$4);
         this.e = ega.a($$0, $$3, $$4);
      }

      int $$5 = Integer.MAX_VALUE;
      int $$6 = Integer.MIN_VALUE;
      DoubleListIterator $$7 = $$4.iterator();

      while ($$7.hasNext()) {
         int $$8 = $$7.nextIndex();
         double $$9 = $$7.nextDouble();
         if ($$9 != 0.0) {
            $$5 = Math.min($$5, $$8);
            $$6 = Math.max($$6, $$8);
         }
      }

      this.c = 0.16666666666666666 / a($$6 - $$5);
      this.f = (this.d.a() + this.e.a()) * this.c;
   }

   public double a() {
      return this.f;
   }

   private static double a(int $$0) {
      return 0.1 * (1.0 + 1.0 / (double)($$0 + 1));
   }

   public double a(double $$0, double $$1, double $$2) {
      double $$3 = $$0 * 1.0181268882175227;
      double $$4 = $$1 * 1.0181268882175227;
      double $$5 = $$2 * 1.0181268882175227;
      return (this.d.a($$0, $$1, $$2) + this.e.a($$3, $$4, $$5)) * this.c;
   }

   public efz.a b() {
      return this.g;
   }

   @VisibleForTesting
   public void a(StringBuilder $$0) {
      $$0.append("NormalNoise {");
      $$0.append("first: ");
      this.d.a($$0);
      $$0.append(", second: ");
      this.e.a($$0);
      $$0.append("}");
   }

   public static record a(int c, DoubleList d) {
      public static final Codec<efz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("firstOctave").forGetter(efz.a::a), Codec.DOUBLE.listOf().fieldOf("amplitudes").forGetter(efz.a::b))
               .apply($$0, efz.a::new)
      );
      public static final Codec<ij<efz.a>> b = aiu.a(kg.aB, a);

      public a(int $$0, List<Double> $$1) {
         this($$0, new DoubleArrayList($$1));
      }

      public a(int $$0, double $$1, double... $$2) {
         this($$0, ac.a(new DoubleArrayList($$2), $$1x -> $$1x.add(0, $$1)));
      }

      public int a() {
         return this.c;
      }

      public DoubleList b() {
         return this.d;
      }
   }
}
