import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;

public class efa extends eff {
   public static final MapCodec<efa> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, efa::new));
   private static final double b = 0.618;
   private static final double h = 1.382;
   private static final double i = 0.381;
   private static final double j = 0.328;

   public efa(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected efg<?> a() {
      return efg.f;
   }

   @Override
   public List<edn.a> a(dbd $$0, BiConsumer<io, drb> $$1, ayk $$2, int $$3, io $$4, ecx $$5) {
      int $$6 = 5;
      int $$7 = $$3 + 2;
      int $$8 = ayd.a((double)$$7 * 0.618);
      a($$0, $$1, $$2, $$4.d(), $$5);
      double $$9 = 1.0;
      int $$10 = Math.min(1, ayd.a(1.382 + Math.pow(1.0 * (double)$$7 / 13.0, 2.0)));
      int $$11 = $$4.v() + $$8;
      int $$12 = $$7 - 5;
      List<efa.a> $$13 = Lists.newArrayList();
      $$13.add(new efa.a($$4.b($$12), $$11));

      for (; $$12 >= 0; $$12--) {
         float $$14 = b($$7, $$12);
         if (!($$14 < 0.0F)) {
            for (int $$15 = 0; $$15 < $$10; $$15++) {
               double $$16 = 1.0;
               double $$17 = 1.0 * (double)$$14 * ((double)$$2.i() + 0.328);
               double $$18 = (double)($$2.i() * 2.0F) * Math.PI;
               double $$19 = $$17 * Math.sin($$18) + 0.5;
               double $$20 = $$17 * Math.cos($$18) + 0.5;
               io $$21 = $$4.b(ayd.a($$19), $$12 - 1, ayd.a($$20));
               io $$22 = $$21.b(5);
               if (this.a($$0, $$1, $$2, $$21, $$22, false, $$5)) {
                  int $$23 = $$4.u() - $$21.u();
                  int $$24 = $$4.w() - $$21.w();
                  double $$25 = (double)$$21.v() - Math.sqrt((double)($$23 * $$23 + $$24 * $$24)) * 0.381;
                  int $$26 = $$25 > (double)$$11 ? $$11 : (int)$$25;
                  io $$27 = new io($$4.u(), $$26, $$4.w());
                  if (this.a($$0, $$1, $$2, $$27, $$21, false, $$5)) {
                     $$13.add(new efa.a($$21, $$27.v()));
                  }
               }
            }
         }
      }

      this.a($$0, $$1, $$2, $$4, $$4.b($$8), true, $$5);
      this.a($$0, $$1, $$2, $$7, $$4, $$13, $$5);
      List<edn.a> $$28 = Lists.newArrayList();

      for (efa.a $$29 : $$13) {
         if (this.a($$7, $$29.a() - $$4.v())) {
            $$28.add($$29.a);
         }
      }

      return $$28;
   }

   private boolean a(dbd $$0, BiConsumer<io, drb> $$1, ayk $$2, io $$3, io $$4, boolean $$5, ecx $$6) {
      if (!$$5 && Objects.equals($$3, $$4)) {
         return true;
      } else {
         io $$7 = $$4.b(-$$3.u(), -$$3.v(), -$$3.w());
         int $$8 = this.a($$7);
         float $$9 = (float)$$7.u() / (float)$$8;
         float $$10 = (float)$$7.v() / (float)$$8;
         float $$11 = (float)$$7.w() / (float)$$8;

         for (int $$12 = 0; $$12 <= $$8; $$12++) {
            io $$13 = $$3.b(ayd.d(0.5F + (float)$$12 * $$9), ayd.d(0.5F + (float)$$12 * $$10), ayd.d(0.5F + (float)$$12 * $$11));
            if ($$5) {
               this.a($$0, $$1, $$2, $$13, $$6, $$2x -> $$2x.b(dkk.i, this.a($$3, $$13)));
            } else if (!this.b($$0, $$13)) {
               return false;
            }
         }

         return true;
      }
   }

   private int a(io $$0) {
      int $$1 = ayd.a($$0.u());
      int $$2 = ayd.a($$0.v());
      int $$3 = ayd.a($$0.w());
      return Math.max($$1, Math.max($$2, $$3));
   }

   private it.a a(io $$0, io $$1) {
      it.a $$2 = it.a.b;
      int $$3 = Math.abs($$1.u() - $$0.u());
      int $$4 = Math.abs($$1.w() - $$0.w());
      int $$5 = Math.max($$3, $$4);
      if ($$5 > 0) {
         if ($$3 == $$5) {
            $$2 = it.a.a;
         } else {
            $$2 = it.a.c;
         }
      }

      return $$2;
   }

   private boolean a(int $$0, int $$1) {
      return (double)$$1 >= (double)$$0 * 0.2;
   }

   private void a(dbd $$0, BiConsumer<io, drb> $$1, ayk $$2, int $$3, io $$4, List<efa.a> $$5, ecx $$6) {
      for (efa.a $$7 : $$5) {
         int $$8 = $$7.a();
         io $$9 = new io($$4.u(), $$8, $$4.w());
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
         float $$4 = ayd.c($$2 * $$2 - $$3 * $$3);
         if ($$3 == 0.0F) {
            $$4 = $$2;
         } else if (Math.abs($$3) >= $$2) {
            return 0.0F;
         }

         return $$4 * 0.5F;
      }
   }

   static class a {
      final edn.a a;
      private final int b;

      public a(io $$0, int $$1) {
         this.a = new edn.a($$0, 0, false);
         this.b = $$1;
      }

      public int a() {
         return this.b;
      }
   }
}
