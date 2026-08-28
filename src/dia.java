import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dia extends dgv {
   public static final MapCodec<dia> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lu.e.q().fieldOf("plant").forGetter($$0x -> $$0x.e), u()).apply($$0, dia::new)
   );
   public static final int b = 5;
   public static final dva c = duq.au;
   protected static final eyx d = dgv.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   private final dgv e;

   @Override
   public MapCodec<dia> a() {
      return a;
   }

   protected dia(dgv $$0, dtz.d $$1) {
      super($$1);
      this.e = $$0;
      this.l(this.E.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, azk $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean f(dua $$0) {
      return $$0.c(c) < 5;
   }

   @Override
   public eyx b_(dua $$0, dcx $$1, je $$2) {
      return d;
   }

   @Override
   protected void b(dua $$0, arg $$1, je $$2, azk $$3) {
      je $$4 = $$2.d();
      if ($$1.u($$4) && $$4.v() < $$1.an()) {
         int $$5 = $$0.c(c);
         if ($$5 < 5) {
            boolean $$6 = false;
            boolean $$7 = false;
            dua $$8 = $$1.a_($$2.e());
            if ($$8.a(dgx.fz)) {
               $$6 = true;
            } else if ($$8.a(this.e)) {
               int $$9 = 1;

               for (int $$10 = 0; $$10 < 4; $$10++) {
                  dua $$11 = $$1.a_($$2.c($$9 + 1));
                  if (!$$11.a(this.e)) {
                     if ($$11.a(dgx.fz)) {
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
               $$1.a($$2, dib.a($$1, $$2, this.e.o()), 2);
               this.a($$1, $$4, $$5);
            } else if ($$5 < 4) {
               int $$12 = $$3.a(4);
               if ($$7) {
                  $$12++;
               }

               boolean $$13 = false;

               for (int $$14 = 0; $$14 < $$12; $$14++) {
                  jj $$15 = jj.c.a.a($$3);
                  je $$16 = $$2.a($$15);
                  if ($$1.u($$16) && $$1.u($$16.e()) && b($$1, $$16, $$15.g())) {
                     this.a($$1, $$16, $$5 + 1);
                     $$13 = true;
                  }
               }

               if ($$13) {
                  $$1.a($$2, dib.a($$1, $$2, this.e.o()), 2);
               } else {
                  this.a($$1, $$2);
               }
            } else {
               this.a($$1, $$2);
            }
         }
      }
   }

   private void a(dds $$0, je $$1, int $$2) {
      $$0.a($$1, this.o().b(c, Integer.valueOf($$2)), 2);
      $$0.c(1033, $$1, 0);
   }

   private void a(dds $$0, je $$1) {
      $$0.a($$1, this.o().b(c, Integer.valueOf(5)), 2);
      $$0.c(1034, $$1, 0);
   }

   private static boolean b(ddv $$0, je $$1, @Nullable jj $$2) {
      for (jj $$3 : jj.c.a) {
         if ($$3 != $$2 && !$$0.u($$1.a($$3))) {
            return false;
         }
      }

      return true;
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$1 != jj.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      dua $$3 = $$1.a_($$2.e());
      if (!$$3.a(this.e) && !$$3.a(dgx.fz)) {
         if (!$$3.l()) {
            return false;
         } else {
            boolean $$4 = false;

            for (jj $$5 : jj.c.a) {
               dua $$6 = $$1.a_($$2.a($$5));
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
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(c);
   }

   public static void a(ddt $$0, je $$1, azk $$2, int $$3) {
      $$0.a($$1, dib.a($$0, $$1, dgx.ku.o()), 2);
      a($$0, $$1, $$2, $$1, $$3, 0);
   }

   private static void a(ddt $$0, je $$1, azk $$2, je $$3, int $$4, int $$5) {
      dgv $$6 = dgx.ku;
      int $$7 = $$2.a(4) + 1;
      if ($$5 == 0) {
         $$7++;
      }

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         je $$9 = $$1.b($$8 + 1);
         if (!b($$0, $$9, null)) {
            return;
         }

         $$0.a($$9, dib.a($$0, $$9, $$6.o()), 2);
         $$0.a($$9.e(), dib.a($$0, $$9.e(), $$6.o()), 2);
      }

      boolean $$10 = false;
      if ($$5 < 4) {
         int $$11 = $$2.a(4);
         if ($$5 == 0) {
            $$11++;
         }

         for (int $$12 = 0; $$12 < $$11; $$12++) {
            jj $$13 = jj.c.a.a($$2);
            je $$14 = $$1.b($$7).a($$13);
            if (Math.abs($$14.u() - $$3.u()) < $$4 && Math.abs($$14.w() - $$3.w()) < $$4 && $$0.u($$14) && $$0.u($$14.e()) && b($$0, $$14, $$13.g())) {
               $$10 = true;
               $$0.a($$14, dib.a($$0, $$14, $$6.o()), 2);
               $$0.a($$14.a($$13.g()), dib.a($$0, $$14.a($$13.g()), $$6.o()), 2);
               a($$0, $$14, $$2, $$3, $$4, $$5 + 1);
            }
         }
      }

      if (!$$10) {
         $$0.a($$1.b($$7), dgx.kv.o().b(c, Integer.valueOf(5)), 2);
      }
   }

   @Override
   protected void a(dds $$0, dua $$1, eya $$2, coi $$3) {
      je $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, true, $$3);
      }
   }
}
