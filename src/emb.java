import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;

public class emb extends emg {
   public static final MapCodec<emb> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, emb::new));
   private static final double b = 0.618;
   private static final double h = 1.382;
   private static final double i = 0.381;
   private static final double j = 0.328;

   public emb(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected emh<?> a() {
      return emh.f;
   }

   @Override
   public List<ekm.a> a(dho $$0, BiConsumer<jh, dxv> $$1, bam $$2, int $$3, jh $$4, ejw $$5) {
      int $$6 = 5;
      int $$7 = $$3 + 2;
      int $$8 = bae.a((double)$$7 * 0.618);
      a($$0, $$1, $$2, $$4.e(), $$5);
      double $$9 = 1.0;
      int $$10 = Math.min(1, bae.a(1.382 + Math.pow(1.0 * (double)$$7 / 13.0, 2.0)));
      int $$11 = $$4.v() + $$8;
      int $$12 = $$7 - 5;
      List<emb.a> $$13 = Lists.newArrayList();
      $$13.add(new emb.a($$4.b($$12), $$11));

      for (; $$12 >= 0; $$12--) {
         float $$14 = b($$7, $$12);
         if (!($$14 < 0.0F)) {
            for (int $$15 = 0; $$15 < $$10; $$15++) {
               double $$16 = 1.0;
               double $$17 = 1.0 * (double)$$14 * ((double)$$2.i() + 0.328);
               double $$18 = (double)($$2.i() * 2.0F) * Math.PI;
               double $$19 = $$17 * Math.sin($$18) + 0.5;
               double $$20 = $$17 * Math.cos($$18) + 0.5;
               jh $$21 = $$4.b(bae.a($$19), $$12 - 1, bae.a($$20));
               jh $$22 = $$21.b(5);
               if (this.a($$0, $$1, $$2, $$21, $$22, false, $$5)) {
                  int $$23 = $$4.u() - $$21.u();
                  int $$24 = $$4.w() - $$21.w();
                  double $$25 = (double)$$21.v() - Math.sqrt((double)($$23 * $$23 + $$24 * $$24)) * 0.381;
                  int $$26 = $$25 > (double)$$11 ? $$11 : (int)$$25;
                  jh $$27 = new jh($$4.u(), $$26, $$4.w());
                  if (this.a($$0, $$1, $$2, $$27, $$21, false, $$5)) {
                     $$13.add(new emb.a($$21, $$27.v()));
                  }
               }
            }
         }
      }

      this.a($$0, $$1, $$2, $$4, $$4.b($$8), true, $$5);
      this.a($$0, $$1, $$2, $$7, $$4, $$13, $$5);
      List<ekm.a> $$28 = Lists.newArrayList();

      for (emb.a $$29 : $$13) {
         if (this.a($$7, $$29.a() - $$4.v())) {
            $$28.add($$29.a);
         }
      }

      return $$28;
   }

   private boolean a(dho $$0, BiConsumer<jh, dxv> $$1, bam $$2, jh $$3, jh $$4, boolean $$5, ejw $$6) {
      if (!$$5 && Objects.equals($$3, $$4)) {
         return true;
      } else {
         jh $$7 = $$4.b(-$$3.u(), -$$3.v(), -$$3.w());
         int $$8 = this.a($$7);
         float $$9 = (float)$$7.u() / (float)$$8;
         float $$10 = (float)$$7.v() / (float)$$8;
         float $$11 = (float)$$7.w() / (float)$$8;

         for (int $$12 = 0; $$12 <= $$8; $$12++) {
            jh $$13 = $$3.b(bae.d(0.5F + (float)$$12 * $$9), bae.d(0.5F + (float)$$12 * $$10), bae.d(0.5F + (float)$$12 * $$11));
            if ($$5) {
               this.a($$0, $$1, $$2, $$13, $$6, $$2x -> $$2x.c(drb.i, this.a($$3, $$13)));
            } else if (!this.b($$0, $$13)) {
               return false;
            }
         }

         return true;
      }
   }

   private int a(jh $$0) {
      int $$1 = bae.a($$0.u());
      int $$2 = bae.a($$0.v());
      int $$3 = bae.a($$0.w());
      return Math.max($$1, Math.max($$2, $$3));
   }

   private jm.a a(jh $$0, jh $$1) {
      jm.a $$2 = jm.a.b;
      int $$3 = Math.abs($$1.u() - $$0.u());
      int $$4 = Math.abs($$1.w() - $$0.w());
      int $$5 = Math.max($$3, $$4);
      if ($$5 > 0) {
         if ($$3 == $$5) {
            $$2 = jm.a.a;
         } else {
            $$2 = jm.a.c;
         }
      }

      return $$2;
   }

   private boolean a(int $$0, int $$1) {
      return (double)$$1 >= (double)$$0 * 0.2;
   }

   private void a(dho $$0, BiConsumer<jh, dxv> $$1, bam $$2, int $$3, jh $$4, List<emb.a> $$5, ejw $$6) {
      for (emb.a $$7 : $$5) {
         int $$8 = $$7.a();
         jh $$9 = new jh($$4.u(), $$8, $$4.w());
         if (!$$9.equals($$7.a.a()) && this.a($$3, $$8 - $$4.v())) {
            this.a($$0, $$1, $$2, $$9, $$7.a.a(), true, $$6);
         }
      }
   }

   private static float b(int $$0, int $$1) {
      if ((float)$$1 < (float)$$0 * 0.3F) {
         return -1.0F;
      } else {
         float $$2 = (float)$$0 / 2.0F;
         float $$3 = $$2 - (float)$$1;
         float $$4 = bae.c($$2 * $$2 - $$3 * $$3);
         if ($$3 == 0.0F) {
            $$4 = $$2;
         } else if (Math.abs($$3) >= $$2) {
            return 0.0F;
         }

         return $$4 * 0.5F;
      }
   }

   static class a {
      final ekm.a a;
      private final int b;

      public a(jh $$0, int $$1) {
         this.a = new ekm.a($$0, 0, false);
         this.b = $$1;
      }

      public int a() {
         return this.b;
      }
   }
}
