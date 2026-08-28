import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class djd extends dhy {
   public static final MapCodec<djd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lx.e.q().fieldOf("plant").forGetter($$0x -> $$0x.e), t()).apply($$0, djd::new)
   );
   public static final int b = 5;
   public static final dwd c = dvt.au;
   protected static final fab d = dhy.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   private final dhy e;

   @Override
   public MapCodec<djd> a() {
      return a;
   }

   protected djd(dhy $$0, dvc.d $$1) {
      super($$1);
      this.e = $$0;
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean f(dvd $$0) {
      return $$0.c(c) < 5;
   }

   @Override
   public fab b_(dvd $$0, dea $$1, jg $$2) {
      return d;
   }

   @Override
   protected void b(dvd $$0, arm $$1, jg $$2, azr $$3) {
      jg $$4 = $$2.d();
      if ($$1.u($$4) && $$4.v() <= $$1.an()) {
         int $$5 = $$0.c(c);
         if ($$5 < 5) {
            boolean $$6 = false;
            boolean $$7 = false;
            dvd $$8 = $$1.a_($$2.e());
            if ($$8.a(dia.fz)) {
               $$6 = true;
            } else if ($$8.a(this.e)) {
               int $$9 = 1;

               for (int $$10 = 0; $$10 < 4; $$10++) {
                  dvd $$11 = $$1.a_($$2.c($$9 + 1));
                  if (!$$11.a(this.e)) {
                     if ($$11.a(dia.fz)) {
                        $$7 = true;
                     }
                     break;
                  }

                  $$9++;
               }

               if ($$9 < 2 || $$9 <= $$3.a($$7 ? 5 : 4)) {
                  $$6 = true;
               }
            } else if ($$8.l()) {
               $$6 = true;
            }

            if ($$6 && b($$1, $$4, null) && $$1.u($$2.b(2))) {
               $$1.a($$2, dje.a($$1, $$2, this.e.m()), 2);
               this.a($$1, $$4, $$5);
            } else if ($$5 < 4) {
               int $$12 = $$3.a(4);
               if ($$7) {
                  $$12++;
               }

               boolean $$13 = false;

               for (int $$14 = 0; $$14 < $$12; $$14++) {
                  jl $$15 = jl.c.a.a($$3);
                  jg $$16 = $$2.a($$15);
                  if ($$1.u($$16) && $$1.u($$16.e()) && b($$1, $$16, $$15.g())) {
                     this.a($$1, $$16, $$5 + 1);
                     $$13 = true;
                  }
               }

               if ($$13) {
                  $$1.a($$2, dje.a($$1, $$2, this.e.m()), 2);
               } else {
                  this.a($$1, $$2);
               }
            } else {
               this.a($$1, $$2);
            }
         }
      }
   }

   private void a(dev $$0, jg $$1, int $$2) {
      $$0.a($$1, this.m().b(c, Integer.valueOf($$2)), 2);
      $$0.c(1033, $$1, 0);
   }

   private void a(dev $$0, jg $$1) {
      $$0.a($$1, this.m().b(c, Integer.valueOf(5)), 2);
      $$0.c(1034, $$1, 0);
   }

   private static boolean b(dey $$0, jg $$1, @Nullable jl $$2) {
      for (jl $$3 : jl.c.a) {
         if ($$3 != $$2 && !$$0.u($$1.a($$3))) {
            return false;
         }
      }

      return true;
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$1 != jl.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      dvd $$3 = $$1.a_($$2.e());
      if (!$$3.a(this.e) && !$$3.a(dia.fz)) {
         if (!$$3.l()) {
            return false;
         } else {
            boolean $$4 = false;

            for (jl $$5 : jl.c.a) {
               dvd $$6 = $$1.a_($$2.a($$5));
               if ($$6.a(this.e)) {
                  if ($$4) {
                     return false;
                  }

                  $$4 = true;
               } else if (!$$6.l()) {
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
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(c);
   }

   public static void a(dew $$0, jg $$1, azr $$2, int $$3) {
      $$0.a($$1, dje.a($$0, $$1, dia.ku.m()), 2);
      a($$0, $$1, $$2, $$1, $$3, 0);
   }

   private static void a(dew $$0, jg $$1, azr $$2, jg $$3, int $$4, int $$5) {
      dhy $$6 = dia.ku;
      int $$7 = $$2.a(4) + 1;
      if ($$5 == 0) {
         $$7++;
      }

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         jg $$9 = $$1.b($$8 + 1);
         if (!b($$0, $$9, null)) {
            return;
         }

         $$0.a($$9, dje.a($$0, $$9, $$6.m()), 2);
         $$0.a($$9.e(), dje.a($$0, $$9.e(), $$6.m()), 2);
      }

      boolean $$10 = false;
      if ($$5 < 4) {
         int $$11 = $$2.a(4);
         if ($$5 == 0) {
            $$11++;
         }

         for (int $$12 = 0; $$12 < $$11; $$12++) {
            jl $$13 = jl.c.a.a($$2);
            jg $$14 = $$1.b($$7).a($$13);
            if (Math.abs($$14.u() - $$3.u()) < $$4 && Math.abs($$14.w() - $$3.w()) < $$4 && $$0.u($$14) && $$0.u($$14.e()) && b($$0, $$14, $$13.g())) {
               $$10 = true;
               $$0.a($$14, dje.a($$0, $$14, $$6.m()), 2);
               $$0.a($$14.a($$13.g()), dje.a($$0, $$14.a($$13.g()), $$6.m()), 2);
               a($$0, $$14, $$2, $$3, $$4, $$5 + 1);
            }
         }
      }

      if (!$$10) {
         $$0.a($$1.b($$7), dia.kv.m().b(c, Integer.valueOf(5)), 2);
      }
   }

   @Override
   protected void a(dev $$0, dvd $$1, ezd $$2, cpb $$3) {
      jg $$4 = $$2.b();
      if (!$$0.C && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, true, $$3);
      }
   }
}
