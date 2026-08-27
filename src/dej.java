import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dej extends dde {
   public static final MapCodec<dej> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ld.e.q().fieldOf("plant").forGetter($$0x -> $$0x.e), u()).apply($$0, dej::new)
   );
   public static final int b = 5;
   public static final drh c = dqx.au;
   protected static final eui d = dde.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   private final dde e;

   @Override
   public MapCodec<dej> a() {
      return a;
   }

   protected dej(dde $$0, dqg.d $$1) {
      super($$1);
      this.e = $$0;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean d_(dqh $$0) {
      return $$0.c(c) < 5;
   }

   @Override
   public eui b_(dqh $$0, czj $$1, in $$2) {
      return d;
   }

   @Override
   protected void b(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      in $$4 = $$2.c();
      if ($$1.u($$4) && $$4.v() < $$1.al()) {
         int $$5 = $$0.c(c);
         if ($$5 < 5) {
            boolean $$6 = false;
            boolean $$7 = false;
            dqh $$8 = $$1.a_($$2.d());
            if ($$8.a(ddg.fz)) {
               $$6 = true;
            } else if ($$8.a(this.e)) {
               int $$9 = 1;

               for (int $$10 = 0; $$10 < 4; $$10++) {
                  dqh $$11 = $$1.a_($$2.c($$9 + 1));
                  if (!$$11.a(this.e)) {
                     if ($$11.a(ddg.fz)) {
                        $$7 = true;
                     }
                     break;
                  }

                  $$9++;
               }

               if ($$9 < 2 || $$9 <= $$3.a($$7 ? 5 : 4)) {
                  $$6 = true;
               }
            } else if ($$8.i()) {
               $$6 = true;
            }

            if ($$6 && b($$1, $$4, null) && $$1.u($$2.b(2))) {
               $$1.a($$2, dek.a($$1, $$2, this.e.n()), 2);
               this.a($$1, $$4, $$5);
            } else if ($$5 < 4) {
               int $$12 = $$3.a(4);
               if ($$7) {
                  $$12++;
               }

               boolean $$13 = false;

               for (int $$14 = 0; $$14 < $$12; $$14++) {
                  is $$15 = is.c.a.a($$3);
                  in $$16 = $$2.a($$15);
                  if ($$1.u($$16) && $$1.u($$16.d()) && b($$1, $$16, $$15.g())) {
                     this.a($$1, $$16, $$5 + 1);
                     $$13 = true;
                  }
               }

               if ($$13) {
                  $$1.a($$2, dek.a($$1, $$2, this.e.n()), 2);
               } else {
                  this.a($$1, $$2);
               }
            } else {
               this.a($$1, $$2);
            }
         }
      }
   }

   private void a(dad $$0, in $$1, int $$2) {
      $$0.a($$1, this.n().a(c, Integer.valueOf($$2)), 2);
      $$0.c(1033, $$1, 0);
   }

   private void a(dad $$0, in $$1) {
      $$0.a($$1, this.n().a(c, Integer.valueOf(5)), 2);
      $$0.c(1034, $$1, 0);
   }

   private static boolean b(dag $$0, in $$1, @Nullable is $$2) {
      for (is $$3 : is.c.a) {
         if ($$3 != $$2 && !$$0.u($$1.a($$3))) {
            return false;
         }
      }

      return true;
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$1 != is.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      dqh $$3 = $$1.a_($$2.d());
      if (!$$3.a(this.e) && !$$3.a(ddg.fz)) {
         if (!$$3.i()) {
            return false;
         } else {
            boolean $$4 = false;

            for (is $$5 : is.c.a) {
               dqh $$6 = $$1.a_($$2.a($$5));
               if ($$6.a(this.e)) {
                  if ($$4) {
                     return false;
                  }

                  $$4 = true;
               } else if (!$$6.i()) {
                  return false;
               }
            }

            return $$4;
         }
      } else {
         return true;
      }
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(c);
   }

   public static void a(dae $$0, in $$1, ayg $$2, int $$3) {
      $$0.a($$1, dek.a($$0, $$1, ddg.ku.n()), 2);
      a($$0, $$1, $$2, $$1, $$3, 0);
   }

   private static void a(dae $$0, in $$1, ayg $$2, in $$3, int $$4, int $$5) {
      dde $$6 = ddg.ku;
      int $$7 = $$2.a(4) + 1;
      if ($$5 == 0) {
         $$7++;
      }

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         in $$9 = $$1.b($$8 + 1);
         if (!b($$0, $$9, null)) {
            return;
         }

         $$0.a($$9, dek.a($$0, $$9, $$6.n()), 2);
         $$0.a($$9.d(), dek.a($$0, $$9.d(), $$6.n()), 2);
      }

      boolean $$10 = false;
      if ($$5 < 4) {
         int $$11 = $$2.a(4);
         if ($$5 == 0) {
            $$11++;
         }

         for (int $$12 = 0; $$12 < $$11; $$12++) {
            is $$13 = is.c.a.a($$2);
            in $$14 = $$1.b($$7).a($$13);
            if (Math.abs($$14.u() - $$3.u()) < $$4 && Math.abs($$14.w() - $$3.w()) < $$4 && $$0.u($$14) && $$0.u($$14.d()) && b($$0, $$14, $$13.g())) {
               $$10 = true;
               $$0.a($$14, dek.a($$0, $$14, $$6.n()), 2);
               $$0.a($$14.a($$13.g()), dek.a($$0, $$14.a($$13.g()), $$6.n()), 2);
               a($$0, $$14, $$2, $$3, $$4, $$5 + 1);
            }
         }
      }

      if (!$$10) {
         $$0.a($$1.b($$7), ddg.kv.n().a(c, Integer.valueOf(5)), 2);
      }
   }

   @Override
   protected void a(dad $$0, dqh $$1, etl $$2, clz $$3) {
      in $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, true, $$3);
      }
   }
}
