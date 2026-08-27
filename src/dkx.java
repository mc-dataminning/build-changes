import com.google.common.base.MoreObjects;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dkx extends dch {
   public static final MapCodec<dkx> a = b(dkx::new);
   public static final dqc b = dgc.aE;
   public static final dpz c = dpy.w;
   public static final dpz d = dpy.a;
   protected static final int e = 1;
   protected static final int f = 42;
   private static final int l = 10;
   protected static final int g = 3;
   protected static final etc h = dch.a(5.0, 0.0, 10.0, 11.0, 10.0, 16.0);
   protected static final etc i = dch.a(5.0, 0.0, 0.0, 11.0, 10.0, 6.0);
   protected static final etc j = dch.a(10.0, 0.0, 5.0, 16.0, 10.0, 11.0);
   protected static final etc k = dch.a(0.0, 0.0, 5.0, 6.0, 10.0, 11.0);

   @Override
   public MapCodec<dkx> a() {
      return a;
   }

   public dkx(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ij.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      switch ((ij)$$0.c(b)) {
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
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      ij $$3 = $$0.c(b);
      id $$4 = $$2.a($$3.g());
      dpi $$5 = $$1.a_($$4);
      return $$3.o().d() && $$5.d($$1, $$4, $$3);
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? dcj.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dpi a(cux $$0) {
      dpi $$1 = this.n().a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false));
      czj $$2 = $$0.q();
      id $$3 = $$0.a();
      ij[] $$4 = $$0.f();

      for (ij $$5 : $$4) {
         if ($$5.o().d()) {
            ij $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public void a(czg $$0, id $$1, dpi $$2, bqt $$3, crs $$4) {
      a($$0, $$1, $$2, false, false, -1, null);
   }

   public static void a(czg $$0, id $$1, dpi $$2, boolean $$3, boolean $$4, int $$5, @Nullable dpi $$6) {
      Optional<ij> $$7 = $$2.d(b);
      if ($$7.isPresent()) {
         ij $$8 = $$7.get();
         boolean $$9 = $$2.d(d).orElse(false);
         boolean $$10 = $$2.d(c).orElse(false);
         dch $$11 = $$2.b();
         boolean $$12 = !$$3;
         boolean $$13 = false;
         int $$14 = 0;
         dpi[] $$15 = new dpi[42];

         for (int $$16 = 1; $$16 < 42; $$16++) {
            id $$17 = $$1.a($$8, $$16);
            dpi $$18 = $$0.a_($$17);
            if ($$18.a(dcj.fH)) {
               if ($$18.c(b) == $$8.g()) {
                  $$14 = $$16;
               }
               break;
            }

            if (!$$18.a(dcj.fI) && $$16 != $$5) {
               $$15[$$16] = null;
               $$12 = false;
            } else {
               if ($$16 == $$5) {
                  $$18 = (dpi)MoreObjects.firstNonNull($$6, $$18);
               }

               boolean $$19 = !$$18.c(dkw.d);
               boolean $$20 = $$18.c(dkw.b);
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
         dpi $$21 = $$11.n().b(d, Boolean.valueOf($$12)).b(c, Boolean.valueOf($$13));
         if ($$14 > 0) {
            id $$22 = $$1.a($$8, $$14);
            ij $$23 = $$8.g();
            $$0.a($$22, $$21.a(b, $$23), 3);
            a($$11, $$0, $$22, $$23);
            a($$0, $$22, $$12, $$13, $$9, $$10);
         }

         a($$0, $$1, $$12, $$13, $$9, $$10);
         if (!$$3) {
            $$0.a($$1, $$21.a(b, $$8), 3);
            if ($$4) {
               a($$11, $$0, $$1, $$8);
            }
         }

         if ($$9 != $$12) {
            for (int $$24 = 1; $$24 < $$14; $$24++) {
               id $$25 = $$1.a($$8, $$24);
               dpi $$26 = $$15[$$24];
               if ($$26 != null) {
                  $$0.a($$25, $$26.b(d, Boolean.valueOf($$12)), 3);
                  if (!$$0.a_($$25).i()) {
                  }
               }
            }
         }
      }
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      a($$1, $$2, $$0, false, true, -1, null);
   }

   private static void a(czg $$0, id $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
      if ($$3 && !$$5) {
         $$0.a(null, $$1, auo.zo, aup.e, 0.4F, 0.6F);
         $$0.a(null, dub.a, $$1);
      } else if (!$$3 && $$5) {
         $$0.a(null, $$1, auo.zn, aup.e, 0.4F, 0.5F);
         $$0.a(null, dub.e, $$1);
      } else if ($$2 && !$$4) {
         $$0.a(null, $$1, auo.zm, aup.e, 0.4F, 0.7F);
         $$0.a(null, dub.b, $$1);
      } else if (!$$2 && $$4) {
         $$0.a(null, $$1, auo.zp, aup.e, 0.4F, 1.2F / ($$0.z.i() * 0.2F + 0.9F));
         $$0.a(null, dub.g, $$1);
      }
   }

   private static void a(dch $$0, czg $$1, id $$2, ij $$3) {
      $$1.a($$2, $$0);
      $$1.a($$2.a($$3.g()), $$0);
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         boolean $$5 = $$0.c(d);
         boolean $$6 = $$0.c(c);
         if ($$5 || $$6) {
            a($$1, $$2, $$0, true, false, -1, null);
         }

         if ($$6) {
            $$1.a($$2, this);
            $$1.a($$2.a($$0.c(b).g()), this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dpi $$0, cym $$1, id $$2, ij $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dpi $$0, cym $$1, id $$2, ij $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(b) == $$3 ? 15 : 0;
      }
   }

   @Override
   protected boolean f_(dpi $$0) {
      return true;
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dpi a(dpi $$0, dhd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b, c, d);
   }
}
