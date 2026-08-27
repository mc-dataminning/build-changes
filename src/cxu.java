import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class cxu extends cwp {
   public static final MapCodec<cxu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kd.e.q().fieldOf("plant").forGetter($$0x -> $$0x.e), u()).apply($$0, cxu::new)
   );
   public static final int b = 5;
   public static final dkg c = djw.au;
   protected static final eml d = cwp.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   private final cwp e;

   @Override
   public MapCodec<cxu> a() {
      return a;
   }

   protected cxu(cwp $$0, djf.d $$1) {
      super($$1);
      this.e = $$0;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, auu $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean e_(djg $$0) {
      return $$0.c(c) < 5;
   }

   @Override
   public eml b_(djg $$0, csu $$1, hx $$2) {
      return d;
   }

   @Override
   public void b(djg $$0, and $$1, hx $$2, auu $$3) {
      hx $$4 = $$2.c();
      if ($$1.u($$4) && $$4.v() < $$1.al()) {
         int $$5 = $$0.c(c);
         if ($$5 < 5) {
            boolean $$6 = false;
            boolean $$7 = false;
            djg $$8 = $$1.a_($$2.d());
            if ($$8.a(cwr.fz)) {
               $$6 = true;
            } else if ($$8.a(this.e)) {
               int $$9 = 1;

               for (int $$10 = 0; $$10 < 4; $$10++) {
                  djg $$11 = $$1.a_($$2.c($$9 + 1));
                  if (!$$11.a(this.e)) {
                     if ($$11.a(cwr.fz)) {
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
               $$1.a($$2, cxv.a($$1, $$2, this.e.o()), 2);
               this.a($$1, $$4, $$5);
            } else if ($$5 < 4) {
               int $$12 = $$3.a(4);
               if ($$7) {
                  $$12++;
               }

               boolean $$13 = false;

               for (int $$14 = 0; $$14 < $$12; $$14++) {
                  ic $$15 = ic.c.a.a($$3);
                  hx $$16 = $$2.a($$15);
                  if ($$1.u($$16) && $$1.u($$16.d()) && b($$1, $$16, $$15.g())) {
                     this.a($$1, $$16, $$5 + 1);
                     $$13 = true;
                  }
               }

               if ($$13) {
                  $$1.a($$2, cxv.a($$1, $$2, this.e.o()), 2);
               } else {
                  this.a($$1, $$2);
               }
            } else {
               this.a($$1, $$2);
            }
         }
      }
   }

   private void a(cto $$0, hx $$1, int $$2) {
      $$0.a($$1, this.o().a(c, Integer.valueOf($$2)), 2);
      $$0.c(1033, $$1, 0);
   }

   private void a(cto $$0, hx $$1) {
      $$0.a($$1, this.o().a(c, Integer.valueOf(5)), 2);
      $$0.c(1034, $$1, 0);
   }

   private static boolean b(ctr $$0, hx $$1, @Nullable ic $$2) {
      for (ic $$3 : ic.c.a) {
         if ($$3 != $$2 && !$$0.u($$1.a($$3))) {
            return false;
         }
      }

      return true;
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$1 != ic.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      djg $$3 = $$1.a_($$2.d());
      if (!$$3.a(this.e) && !$$3.a(cwr.fz)) {
         if (!$$3.i()) {
            return false;
         } else {
            boolean $$4 = false;

            for (ic $$5 : ic.c.a) {
               djg $$6 = $$1.a_($$2.a($$5));
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
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(c);
   }

   public static void a(ctp $$0, hx $$1, auu $$2, int $$3) {
      $$0.a($$1, cxv.a($$0, $$1, cwr.ku.o()), 2);
      a($$0, $$1, $$2, $$1, $$3, 0);
   }

   private static void a(ctp $$0, hx $$1, auu $$2, hx $$3, int $$4, int $$5) {
      cwp $$6 = cwr.ku;
      int $$7 = $$2.a(4) + 1;
      if ($$5 == 0) {
         $$7++;
      }

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         hx $$9 = $$1.b($$8 + 1);
         if (!b($$0, $$9, null)) {
            return;
         }

         $$0.a($$9, cxv.a($$0, $$9, $$6.o()), 2);
         $$0.a($$9.d(), cxv.a($$0, $$9.d(), $$6.o()), 2);
      }

      boolean $$10 = false;
      if ($$5 < 4) {
         int $$11 = $$2.a(4);
         if ($$5 == 0) {
            $$11++;
         }

         for (int $$12 = 0; $$12 < $$11; $$12++) {
            ic $$13 = ic.c.a.a($$2);
            hx $$14 = $$1.b($$7).a($$13);
            if (Math.abs($$14.u() - $$3.u()) < $$4 && Math.abs($$14.w() - $$3.w()) < $$4 && $$0.u($$14) && $$0.u($$14.d()) && b($$0, $$14, $$13.g())) {
               $$10 = true;
               $$0.a($$14, cxv.a($$0, $$14, $$6.o()), 2);
               $$0.a($$14.a($$13.g()), cxv.a($$0, $$14.a($$13.g()), $$6.o()), 2);
               a($$0, $$14, $$2, $$3, $$4, $$5 + 1);
            }
         }
      }

      if (!$$10) {
         $$0.a($$1.b($$7), cwr.kv.o().a(c, Integer.valueOf(5)), 2);
      }
   }

   @Override
   public void a(cto $$0, djg $$1, elo $$2, cfz $$3) {
      hx $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, true, $$3);
      }
   }
}
