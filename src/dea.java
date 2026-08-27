import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dea extends dcv {
   public static final MapCodec<dea> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lc.e.q().fieldOf("plant").forGetter($$0x -> $$0x.e), u()).apply($$0, dea::new)
   );
   public static final int b = 5;
   public static final dqy c = dqo.au;
   protected static final ety d = dcv.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   private final dcv e;

   @Override
   public MapCodec<dea> a() {
      return a;
   }

   protected dea(dcv $$0, dpx.d $$1) {
      super($$1);
      this.e = $$0;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean e_(dpy $$0) {
      return $$0.c(c) < 5;
   }

   @Override
   public ety b_(dpy $$0, cza $$1, im $$2) {
      return d;
   }

   @Override
   protected void b(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      im $$4 = $$2.c();
      if ($$1.u($$4) && $$4.v() < $$1.al()) {
         int $$5 = $$0.c(c);
         if ($$5 < 5) {
            boolean $$6 = false;
            boolean $$7 = false;
            dpy $$8 = $$1.a_($$2.d());
            if ($$8.a(dcx.fz)) {
               $$6 = true;
            } else if ($$8.a(this.e)) {
               int $$9 = 1;

               for (int $$10 = 0; $$10 < 4; $$10++) {
                  dpy $$11 = $$1.a_($$2.c($$9 + 1));
                  if (!$$11.a(this.e)) {
                     if ($$11.a(dcx.fz)) {
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
               $$1.a($$2, deb.a($$1, $$2, this.e.n()), 2);
               this.a($$1, $$4, $$5);
            } else if ($$5 < 4) {
               int $$12 = $$3.a(4);
               if ($$7) {
                  $$12++;
               }

               boolean $$13 = false;

               for (int $$14 = 0; $$14 < $$12; $$14++) {
                  ir $$15 = ir.c.a.a($$3);
                  im $$16 = $$2.a($$15);
                  if ($$1.u($$16) && $$1.u($$16.d()) && b($$1, $$16, $$15.g())) {
                     this.a($$1, $$16, $$5 + 1);
                     $$13 = true;
                  }
               }

               if ($$13) {
                  $$1.a($$2, deb.a($$1, $$2, this.e.n()), 2);
               } else {
                  this.a($$1, $$2);
               }
            } else {
               this.a($$1, $$2);
            }
         }
      }
   }

   private void a(czu $$0, im $$1, int $$2) {
      $$0.a($$1, this.n().a(c, Integer.valueOf($$2)), 2);
      $$0.c(1033, $$1, 0);
   }

   private void a(czu $$0, im $$1) {
      $$0.a($$1, this.n().a(c, Integer.valueOf(5)), 2);
      $$0.c(1034, $$1, 0);
   }

   private static boolean b(czx $$0, im $$1, @Nullable ir $$2) {
      for (ir $$3 : ir.c.a) {
         if ($$3 != $$2 && !$$0.u($$1.a($$3))) {
            return false;
         }
      }

      return true;
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$1 != ir.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      dpy $$3 = $$1.a_($$2.d());
      if (!$$3.a(this.e) && !$$3.a(dcx.fz)) {
         if (!$$3.i()) {
            return false;
         } else {
            boolean $$4 = false;

            for (ir $$5 : ir.c.a) {
               dpy $$6 = $$1.a_($$2.a($$5));
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
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(c);
   }

   public static void a(czv $$0, im $$1, ayd $$2, int $$3) {
      $$0.a($$1, deb.a($$0, $$1, dcx.ku.n()), 2);
      a($$0, $$1, $$2, $$1, $$3, 0);
   }

   private static void a(czv $$0, im $$1, ayd $$2, im $$3, int $$4, int $$5) {
      dcv $$6 = dcx.ku;
      int $$7 = $$2.a(4) + 1;
      if ($$5 == 0) {
         $$7++;
      }

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         im $$9 = $$1.b($$8 + 1);
         if (!b($$0, $$9, null)) {
            return;
         }

         $$0.a($$9, deb.a($$0, $$9, $$6.n()), 2);
         $$0.a($$9.d(), deb.a($$0, $$9.d(), $$6.n()), 2);
      }

      boolean $$10 = false;
      if ($$5 < 4) {
         int $$11 = $$2.a(4);
         if ($$5 == 0) {
            $$11++;
         }

         for (int $$12 = 0; $$12 < $$11; $$12++) {
            ir $$13 = ir.c.a.a($$2);
            im $$14 = $$1.b($$7).a($$13);
            if (Math.abs($$14.u() - $$3.u()) < $$4 && Math.abs($$14.w() - $$3.w()) < $$4 && $$0.u($$14) && $$0.u($$14.d()) && b($$0, $$14, $$13.g())) {
               $$10 = true;
               $$0.a($$14, deb.a($$0, $$14, $$6.n()), 2);
               $$0.a($$14.a($$13.g()), deb.a($$0, $$14.a($$13.g()), $$6.n()), 2);
               a($$0, $$14, $$2, $$3, $$4, $$5 + 1);
            }
         }
      }

      if (!$$10) {
         $$0.a($$1.b($$7), dcx.kv.n().a(c, Integer.valueOf(5)), 2);
      }
   }

   @Override
   protected void a(czu $$0, dpy $$1, etb $$2, cld $$3) {
      im $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, true, $$3);
      }
   }
}
