import java.util.function.IntConsumer;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class aww implements auy {
   private static final int[] a = new int[]{
      -1,
      -1,
      0,
      Integer.MIN_VALUE,
      0,
      0,
      1431655765,
      1431655765,
      0,
      Integer.MIN_VALUE,
      0,
      1,
      858993459,
      858993459,
      0,
      715827882,
      715827882,
      0,
      613566756,
      613566756,
      0,
      Integer.MIN_VALUE,
      0,
      2,
      477218588,
      477218588,
      0,
      429496729,
      429496729,
      0,
      390451572,
      390451572,
      0,
      357913941,
      357913941,
      0,
      330382099,
      330382099,
      0,
      306783378,
      306783378,
      0,
      286331153,
      286331153,
      0,
      Integer.MIN_VALUE,
      0,
      3,
      252645135,
      252645135,
      0,
      238609294,
      238609294,
      0,
      226050910,
      226050910,
      0,
      214748364,
      214748364,
      0,
      204522252,
      204522252,
      0,
      195225786,
      195225786,
      0,
      186737708,
      186737708,
      0,
      178956970,
      178956970,
      0,
      171798691,
      171798691,
      0,
      165191049,
      165191049,
      0,
      159072862,
      159072862,
      0,
      153391689,
      153391689,
      0,
      148102320,
      148102320,
      0,
      143165576,
      143165576,
      0,
      138547332,
      138547332,
      0,
      Integer.MIN_VALUE,
      0,
      4,
      130150524,
      130150524,
      0,
      126322567,
      126322567,
      0,
      122713351,
      122713351,
      0,
      119304647,
      119304647,
      0,
      116080197,
      116080197,
      0,
      113025455,
      113025455,
      0,
      110127366,
      110127366,
      0,
      107374182,
      107374182,
      0,
      104755299,
      104755299,
      0,
      102261126,
      102261126,
      0,
      99882960,
      99882960,
      0,
      97612893,
      97612893,
      0,
      95443717,
      95443717,
      0,
      93368854,
      93368854,
      0,
      91382282,
      91382282,
      0,
      89478485,
      89478485,
      0,
      87652393,
      87652393,
      0,
      85899345,
      85899345,
      0,
      84215045,
      84215045,
      0,
      82595524,
      82595524,
      0,
      81037118,
      81037118,
      0,
      79536431,
      79536431,
      0,
      78090314,
      78090314,
      0,
      76695844,
      76695844,
      0,
      75350303,
      75350303,
      0,
      74051160,
      74051160,
      0,
      72796055,
      72796055,
      0,
      71582788,
      71582788,
      0,
      70409299,
      70409299,
      0,
      69273666,
      69273666,
      0,
      68174084,
      68174084,
      0,
      Integer.MIN_VALUE,
      0,
      5
   };
   private final long[] b;
   private final int c;
   private final long d;
   private final int e;
   private final int f;
   private final int g;
   private final int h;
   private final int i;

   public aww(int $$0, int $$1, int[] $$2) {
      this($$0, $$1);
      int $$3 = 0;

      int $$4;
      for ($$4 = 0; $$4 <= $$1 - this.f; $$4 += this.f) {
         long $$5 = 0L;

         for (int $$6 = this.f - 1; $$6 >= 0; $$6--) {
            $$5 <<= $$0;
            $$5 |= (long)$$2[$$4 + $$6] & this.d;
         }

         this.b[$$3++] = $$5;
      }

      int $$7 = $$1 - $$4;
      if ($$7 > 0) {
         long $$8 = 0L;

         for (int $$9 = $$7 - 1; $$9 >= 0; $$9--) {
            $$8 <<= $$0;
            $$8 |= (long)$$2[$$4 + $$9] & this.d;
         }

         this.b[$$3] = $$8;
      }
   }

   public aww(int $$0, int $$1) {
      this($$0, $$1, (long[])null);
   }

   public aww(int $$0, int $$1, @Nullable long[] $$2) {
      Validate.inclusiveBetween(1L, 32L, (long)$$0);
      this.e = $$1;
      this.c = $$0;
      this.d = (1L << $$0) - 1L;
      this.f = (char)(64 / $$0);
      int $$3 = 3 * (this.f - 1);
      this.g = a[$$3 + 0];
      this.h = a[$$3 + 1];
      this.i = a[$$3 + 2];
      int $$4 = ($$1 + this.f - 1) / this.f;
      if ($$2 != null) {
         if ($$2.length != $$4) {
            throw new aww.a("Invalid length given for storage, got: " + $$2.length + " but expected: " + $$4);
         }

         this.b = $$2;
      } else {
         this.b = new long[$$4];
      }
   }

   private int b(int $$0) {
      long $$1 = Integer.toUnsignedLong(this.g);
      long $$2 = Integer.toUnsignedLong(this.h);
      return (int)((long)$$0 * $$1 + $$2 >> 32 >> this.i);
   }

   @Override
   public int a(int $$0, int $$1) {
      Validate.inclusiveBetween(0L, (long)(this.e - 1), (long)$$0);
      Validate.inclusiveBetween(0L, this.d, (long)$$1);
      int $$2 = this.b($$0);
      long $$3 = this.b[$$2];
      int $$4 = ($$0 - $$2 * this.f) * this.c;
      int $$5 = (int)($$3 >> $$4 & this.d);
      this.b[$$2] = $$3 & ~(this.d << $$4) | ((long)$$1 & this.d) << $$4;
      return $$5;
   }

   @Override
   public void b(int $$0, int $$1) {
      Validate.inclusiveBetween(0L, (long)(this.e - 1), (long)$$0);
      Validate.inclusiveBetween(0L, this.d, (long)$$1);
      int $$2 = this.b($$0);
      long $$3 = this.b[$$2];
      int $$4 = ($$0 - $$2 * this.f) * this.c;
      this.b[$$2] = $$3 & ~(this.d << $$4) | ((long)$$1 & this.d) << $$4;
   }

   @Override
   public int a(int $$0) {
      Validate.inclusiveBetween(0L, (long)(this.e - 1), (long)$$0);
      int $$1 = this.b($$0);
      long $$2 = this.b[$$1];
      int $$3 = ($$0 - $$1 * this.f) * this.c;
      return (int)($$2 >> $$3 & this.d);
   }

   @Override
   public long[] a() {
      return this.b;
   }

   @Override
   public int b() {
      return this.e;
   }

   @Override
   public int c() {
      return this.c;
   }

   @Override
   public void a(IntConsumer $$0) {
      int $$1 = 0;

      for (long $$2 : this.b) {
         for (int $$3 = 0; $$3 < this.f; $$3++) {
            $$0.accept((int)($$2 & this.d));
            $$2 >>= this.c;
            if (++$$1 >= this.e) {
               return;
            }
         }
      }
   }

   @Override
   public void a(int[] $$0) {
      int $$1 = this.b.length;
      int $$2 = 0;

      for (int $$3 = 0; $$3 < $$1 - 1; $$3++) {
         long $$4 = this.b[$$3];

         for (int $$5 = 0; $$5 < this.f; $$5++) {
            $$0[$$2 + $$5] = (int)($$4 & this.d);
            $$4 >>= this.c;
         }

         $$2 += this.f;
      }

      int $$6 = this.e - $$2;
      if ($$6 > 0) {
         long $$7 = this.b[$$1 - 1];

         for (int $$8 = 0; $$8 < $$6; $$8++) {
            $$0[$$2 + $$8] = (int)($$7 & this.d);
            $$7 >>= this.c;
         }
      }
   }

   @Override
   public auy d() {
      return new aww(this.c, this.e, (long[])this.b.clone());
   }

   public static class a extends RuntimeException {
      a(String $$0) {
         super($$0);
      }
   }
}
