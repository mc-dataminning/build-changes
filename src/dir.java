import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dir extends dhm {
   public static final MapCodec<dir> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lv.e.q().fieldOf("plant").forGetter($$0x -> $$0x.e), t()).apply($$0, dir::new)
   );
   public static final int b = 5;
   public static final dvs c = dvi.au;
   protected static final ezq d = dhm.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   private final dhm e;

   @Override
   public MapCodec<dir> a() {
      return a;
   }

   protected dir(dhm $$0, dur.d $$1) {
      super($$1);
      this.e = $$0;
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean f(dus $$0) {
      return $$0.c(c) < 5;
   }

   @Override
   public ezq b_(dus $$0, ddo $$1, jf $$2) {
      return d;
   }

   @Override
   protected void b(dus $$0, arj $$1, jf $$2, azn $$3) {
      jf $$4 = $$2.d();
      if ($$1.u($$4) && $$4.v() <= $$1.an()) {
         int $$5 = $$0.c(c);
         if ($$5 < 5) {
            boolean $$6 = false;
            boolean $$7 = false;
            dus $$8 = $$1.a_($$2.e());
            if ($$8.a(dho.fz)) {
               $$6 = true;
            } else if ($$8.a(this.e)) {
               int $$9 = 1;

               for (int $$10 = 0; $$10 < 4; $$10++) {
                  dus $$11 = $$1.a_($$2.c($$9 + 1));
                  if (!$$11.a(this.e)) {
                     if ($$11.a(dho.fz)) {
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
               $$1.a($$2, dis.a($$1, $$2, this.e.n()), 2);
               this.a($$1, $$4, $$5);
            } else if ($$5 < 4) {
               int $$12 = $$3.a(4);
               if ($$7) {
                  $$12++;
               }

               boolean $$13 = false;

               for (int $$14 = 0; $$14 < $$12; $$14++) {
                  jk $$15 = jk.c.a.a($$3);
                  jf $$16 = $$2.a($$15);
                  if ($$1.u($$16) && $$1.u($$16.e()) && b($$1, $$16, $$15.g())) {
                     this.a($$1, $$16, $$5 + 1);
                     $$13 = true;
                  }
               }

               if ($$13) {
                  $$1.a($$2, dis.a($$1, $$2, this.e.n()), 2);
               } else {
                  this.a($$1, $$2);
               }
            } else {
               this.a($$1, $$2);
            }
         }
      }
   }

   private void a(dej $$0, jf $$1, int $$2) {
      $$0.a($$1, this.n().b(c, Integer.valueOf($$2)), 2);
      $$0.c(1033, $$1, 0);
   }

   private void a(dej $$0, jf $$1) {
      $$0.a($$1, this.n().b(c, Integer.valueOf(5)), 2);
      $$0.c(1034, $$1, 0);
   }

   private static boolean b(dem $$0, jf $$1, @Nullable jk $$2) {
      for (jk $$3 : jk.c.a) {
         if ($$3 != $$2 && !$$0.u($$1.a($$3))) {
            return false;
         }
      }

      return true;
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$1 != jk.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      dus $$3 = $$1.a_($$2.e());
      if (!$$3.a(this.e) && !$$3.a(dho.fz)) {
         if (!$$3.l()) {
            return false;
         } else {
            boolean $$4 = false;

            for (jk $$5 : jk.c.a) {
               dus $$6 = $$1.a_($$2.a($$5));
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
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(c);
   }

   public static void a(dek $$0, jf $$1, azn $$2, int $$3) {
      $$0.a($$1, dis.a($$0, $$1, dho.ku.n()), 2);
      a($$0, $$1, $$2, $$1, $$3, 0);
   }

   private static void a(dek $$0, jf $$1, azn $$2, jf $$3, int $$4, int $$5) {
      dhm $$6 = dho.ku;
      int $$7 = $$2.a(4) + 1;
      if ($$5 == 0) {
         $$7++;
      }

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         jf $$9 = $$1.b($$8 + 1);
         if (!b($$0, $$9, null)) {
            return;
         }

         $$0.a($$9, dis.a($$0, $$9, $$6.n()), 2);
         $$0.a($$9.e(), dis.a($$0, $$9.e(), $$6.n()), 2);
      }

      boolean $$10 = false;
      if ($$5 < 4) {
         int $$11 = $$2.a(4);
         if ($$5 == 0) {
            $$11++;
         }

         for (int $$12 = 0; $$12 < $$11; $$12++) {
            jk $$13 = jk.c.a.a($$2);
            jf $$14 = $$1.b($$7).a($$13);
            if (Math.abs($$14.u() - $$3.u()) < $$4 && Math.abs($$14.w() - $$3.w()) < $$4 && $$0.u($$14) && $$0.u($$14.e()) && b($$0, $$14, $$13.g())) {
               $$10 = true;
               $$0.a($$14, dis.a($$0, $$14, $$6.n()), 2);
               $$0.a($$14.a($$13.g()), dis.a($$0, $$14.a($$13.g()), $$6.n()), 2);
               a($$0, $$14, $$2, $$3, $$4, $$5 + 1);
            }
         }
      }

      if (!$$10) {
         $$0.a($$1.b($$7), dho.kv.n().b(c, Integer.valueOf(5)), 2);
      }
   }

   @Override
   protected void a(dej $$0, dus $$1, eys $$2, cor $$3) {
      jf $$4 = $$2.b();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, true, $$3);
      }
   }
}
