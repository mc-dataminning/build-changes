import com.google.common.base.MoreObjects;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dtb extends dke {
   public static final MapCodec<dtb> a = b(dtb::new);
   public static final dyo<jn> b = dod.e;
   public static final dyh c = dyg.A;
   public static final dyh d = dyg.a;
   protected static final int e = 1;
   protected static final int f = 42;
   private static final int g = 10;
   private static final Map<jn, fcr> h = fco.c(dke.a(6.0, 0.0, 10.0, 10.0, 16.0));

   @Override
   public MapCodec<dtb> a() {
      return a;
   }

   public dtb(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, jn.c).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return h.get($$0.c(b));
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      jn $$3 = $$0.c(b);
      ji $$4 = $$2.a($$3.g());
      dxq $$5 = $$1.a_($$4);
      return $$3.o().d() && $$5.c($$1, $$4, $$3);
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      return $$4.g() == $$0.c(b) && !$$0.a($$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public dxq a(dax $$0) {
      dxq $$1 = this.m().b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false));
      dhc $$2 = $$0.q();
      ji $$3 = $$0.a();
      jn[] $$4 = $$0.f();

      for (jn $$5 : $$4) {
         if ($$5.o().d()) {
            jn $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public void a(dgz $$0, ji $$1, dxq $$2, bvy $$3, cxh $$4) {
      a($$0, $$1, $$2, false, false, -1, null);
   }

   public static void a(dgz $$0, ji $$1, dxq $$2, boolean $$3, boolean $$4, int $$5, @Nullable dxq $$6) {
      Optional<jn> $$7 = $$2.d(b);
      if ($$7.isPresent()) {
         jn $$8 = $$7.get();
         boolean $$9 = $$2.d(d).orElse(false);
         boolean $$10 = $$2.d(c).orElse(false);
         dke $$11 = $$2.b();
         boolean $$12 = !$$3;
         boolean $$13 = false;
         int $$14 = 0;
         dxq[] $$15 = new dxq[42];

         for (int $$16 = 1; $$16 < 42; $$16++) {
            ji $$17 = $$1.a($$8, $$16);
            dxq $$18 = $$0.a_($$17);
            if ($$18.a(dkg.gc)) {
               if ($$18.c(b) == $$8.g()) {
                  $$14 = $$16;
               }
               break;
            }

            if (!$$18.a(dkg.gd) && $$16 != $$5) {
               $$15[$$16] = null;
               $$12 = false;
            } else {
               if ($$16 == $$5) {
                  $$18 = (dxq)MoreObjects.firstNonNull($$6, $$18);
               }

               boolean $$19 = !$$18.c(dta.d);
               boolean $$20 = $$18.c(dta.b);
               $$13 |= $$19 && $$20;
               $$15[$$16] = $$18;
               if ($$16 == $$5) {
                  $$0.a($$1, $$11, 10);
                  $$12 &= $$19;
               }
            }
         }

         $$12 &= $$14 > 1;
         $$13 &= $$12;
         dxq $$21 = $$11.m().c(d, Boolean.valueOf($$12)).c(c, Boolean.valueOf($$13));
         if ($$14 > 0) {
            ji $$22 = $$1.a($$8, $$14);
            jn $$23 = $$8.g();
            $$0.a($$22, $$21.b(b, $$23), 3);
            a($$11, $$0, $$22, $$23);
            a($$0, $$22, $$12, $$13, $$9, $$10);
         }

         a($$0, $$1, $$12, $$13, $$9, $$10);
         if (!$$3) {
            $$0.a($$1, $$21.b(b, $$8), 3);
            if ($$4) {
               a($$11, $$0, $$1, $$8);
            }
         }

         if ($$9 != $$12) {
            for (int $$24 = 1; $$24 < $$14; $$24++) {
               ji $$25 = $$1.a($$8, $$24);
               dxq $$26 = $$15[$$24];
               if ($$26 != null) {
                  dxq $$27 = $$0.a_($$25);
                  if ($$27.a(dkg.gd) || $$27.a(dkg.gc)) {
                     $$0.a($$25, $$26.c(d, Boolean.valueOf($$12)), 3);
                  }
               }
            }
         }
      }
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      a($$1, $$2, $$0, false, true, -1, null);
   }

   private static void a(dgz $$0, ji $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
      if ($$3 && !$$5) {
         $$0.a(null, $$1, awa.AI, awb.e, 0.4F, 0.6F);
         $$0.a(null, ecp.a, $$1);
      } else if (!$$3 && $$5) {
         $$0.a(null, $$1, awa.AH, awb.e, 0.4F, 0.5F);
         $$0.a(null, ecp.e, $$1);
      } else if ($$2 && !$$4) {
         $$0.a(null, $$1, awa.AG, awb.e, 0.4F, 0.7F);
         $$0.a(null, ecp.b, $$1);
      } else if (!$$2 && $$4) {
         $$0.a(null, $$1, awa.AJ, awb.e, 0.4F, 1.2F / ($$0.A.i() * 0.2F + 0.9F));
         $$0.a(null, ecp.g, $$1);
      }
   }

   private static void a(dke $$0, dgz $$1, ji $$2, jn $$3) {
      jn $$4 = $$3.g();
      eve $$5 = eva.a($$1, $$4, jn.b);
      $$1.a($$2, $$0, $$5);
      $$1.a($$2.a($$4), $$0, $$5);
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, boolean $$3) {
      if (!$$3) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = $$0.c(c);
         if ($$4 || $$5) {
            a($$1, $$2, $$0, true, false, -1, null);
         }

         if ($$5) {
            a(this, $$1, $$2, $$0.c(b));
         }
      }
   }

   @Override
   protected int a(dxq $$0, dgf $$1, ji $$2, jn $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dxq $$0, dgf $$1, ji $$2, jn $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(b) == $$3 ? 15 : 0;
      }
   }

   @Override
   protected boolean f_(dxq $$0) {
      return true;
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b, c, d);
   }
}
