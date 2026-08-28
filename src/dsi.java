import com.google.common.base.MoreObjects;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dsi extends djm {
   public static final MapCodec<dsi> a = b(dsi::new);
   public static final dxu<jn> b = dnk.aF;
   public static final dxo c = dxn.B;
   public static final dxo d = dxn.b;
   protected static final int e = 1;
   protected static final int f = 42;
   private static final int l = 10;
   protected static final int g = 3;
   protected static final fbu h = djm.a(5.0, 0.0, 10.0, 11.0, 10.0, 16.0);
   protected static final fbu i = djm.a(5.0, 0.0, 0.0, 11.0, 10.0, 6.0);
   protected static final fbu j = djm.a(10.0, 0.0, 5.0, 16.0, 10.0, 11.0);
   protected static final fbu k = djm.a(0.0, 0.0, 5.0, 6.0, 10.0, 11.0);

   @Override
   public MapCodec<dsi> a() {
      return a;
   }

   public dsi(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.c).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      switch ((jn)$$0.c(b)) {
         case f:
         default:
            return k;
         case e:
            return j;
         case d:
            return i;
         case c:
            return h;
      }
   }

   @Override
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      jn $$3 = $$0.c(b);
      ji $$4 = $$2.a($$3.g());
      dwx $$5 = $$1.a_($$4);
      return $$3.o().d() && $$5.c($$1, $$4, $$3);
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      return $$4.g() == $$0.c(b) && !$$0.a($$1, $$3) ? djo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public dwx a(dag $$0) {
      dwx $$1 = this.m().b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false));
      dgl $$2 = $$0.q();
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
   public void a(dgi $$0, ji $$1, dwx $$2, bvh $$3, cwp $$4) {
      a($$0, $$1, $$2, false, false, -1, null);
   }

   public static void a(dgi $$0, ji $$1, dwx $$2, boolean $$3, boolean $$4, int $$5, @Nullable dwx $$6) {
      Optional<jn> $$7 = $$2.d(b);
      if ($$7.isPresent()) {
         jn $$8 = $$7.get();
         boolean $$9 = $$2.d(d).orElse(false);
         boolean $$10 = $$2.d(c).orElse(false);
         djm $$11 = $$2.b();
         boolean $$12 = !$$3;
         boolean $$13 = false;
         int $$14 = 0;
         dwx[] $$15 = new dwx[42];

         for (int $$16 = 1; $$16 < 42; $$16++) {
            ji $$17 = $$1.a($$8, $$16);
            dwx $$18 = $$0.a_($$17);
            if ($$18.a(djo.gc)) {
               if ($$18.c(b) == $$8.g()) {
                  $$14 = $$16;
               }
               break;
            }

            if (!$$18.a(djo.gd) && $$16 != $$5) {
               $$15[$$16] = null;
               $$12 = false;
            } else {
               if ($$16 == $$5) {
                  $$18 = (dwx)MoreObjects.firstNonNull($$6, $$18);
               }

               boolean $$19 = !$$18.c(dsh.d);
               boolean $$20 = $$18.c(dsh.b);
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
         dwx $$21 = $$11.m().c(d, Boolean.valueOf($$12)).c(c, Boolean.valueOf($$13));
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
               dwx $$26 = $$15[$$24];
               if ($$26 != null) {
                  dwx $$27 = $$0.a_($$25);
                  if ($$27.a(djo.gd) || $$27.a(djo.gc)) {
                     $$0.a($$25, $$26.c(d, Boolean.valueOf($$12)), 3);
                  }
               }
            }
         }
      }
   }

   @Override
   protected void a(dwx $$0, ard $$1, ji $$2, azh $$3) {
      a($$1, $$2, $$0, false, true, -1, null);
   }

   private static void a(dgi $$0, ji $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
      if ($$3 && !$$5) {
         $$0.a(null, $$1, awa.Ay, awb.e, 0.4F, 0.6F);
         $$0.a(null, ebt.a, $$1);
      } else if (!$$3 && $$5) {
         $$0.a(null, $$1, awa.Ax, awb.e, 0.4F, 0.5F);
         $$0.a(null, ebt.e, $$1);
      } else if ($$2 && !$$4) {
         $$0.a(null, $$1, awa.Aw, awb.e, 0.4F, 0.7F);
         $$0.a(null, ebt.b, $$1);
      } else if (!$$2 && $$4) {
         $$0.a(null, $$1, awa.Az, awb.e, 0.4F, 1.2F / ($$0.A.i() * 0.2F + 0.9F));
         $$0.a(null, ebt.g, $$1);
      }
   }

   private static void a(djm $$0, dgi $$1, ji $$2, jn $$3) {
      jn $$4 = $$3.g();
      euh $$5 = eud.a($$1, $$4, jn.b);
      $$1.a($$2, $$0, $$5);
      $$1.a($$2.a($$4), $$0, $$5);
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, dwx $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         boolean $$5 = $$0.c(d);
         boolean $$6 = $$0.c(c);
         if ($$5 || $$6) {
            a($$1, $$2, $$0, true, false, -1, null);
         }

         if ($$6) {
            a(this, $$1, $$2, $$0.c(b));
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dwx $$0, dfn $$1, ji $$2, jn $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dwx $$0, dfn $$1, ji $$2, jn $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(b) == $$3 ? 15 : 0;
      }
   }

   @Override
   protected boolean f_(dwx $$0) {
      return true;
   }

   @Override
   protected dwx a(dwx $$0, dqe $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwx a(dwx $$0, dol $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b, c, d);
   }
}
