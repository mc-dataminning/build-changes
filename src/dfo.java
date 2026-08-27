import com.google.common.base.MoreObjects;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dfo extends cwy {
   public static final MapCodec<dfo> a = b(dfo::new);
   public static final dkj b = dat.aE;
   public static final dkg c = dkf.w;
   public static final dkg d = dkf.a;
   protected static final int e = 1;
   protected static final int f = 42;
   private static final int l = 10;
   protected static final int g = 3;
   protected static final emv h = cwy.a(5.0, 0.0, 10.0, 11.0, 10.0, 16.0);
   protected static final emv i = cwy.a(5.0, 0.0, 0.0, 11.0, 10.0, 6.0);
   protected static final emv j = cwy.a(10.0, 0.0, 5.0, 16.0, 10.0, 11.0);
   protected static final emv k = cwy.a(0.0, 0.0, 5.0, 6.0, 10.0, 11.0);

   @Override
   public MapCodec<dfo> a() {
      return a;
   }

   public dfo(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      switch ((ic)$$0.c(b)) {
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
   public boolean a(djp $$0, cua $$1, hx $$2) {
      ic $$3 = $$0.c(b);
      hx $$4 = $$2.a($$3.g());
      djp $$5 = $$1.a_($$4);
      return $$3.o().d() && $$5.d($$1, $$4, $$3);
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? cxa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public djp a(cpp $$0) {
      djp $$1 = this.o().a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false));
      cua $$2 = $$0.q();
      hx $$3 = $$0.a();
      ic[] $$4 = $$0.f();

      for (ic $$5 : $$4) {
         if ($$5.o().d()) {
            ic $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public void a(ctx $$0, hx $$1, djp $$2, bmo $$3, cng $$4) {
      a($$0, $$1, $$2, false, false, -1, null);
   }

   public static void a(ctx $$0, hx $$1, djp $$2, boolean $$3, boolean $$4, int $$5, @Nullable djp $$6) {
      Optional<ic> $$7 = $$2.d(b);
      if ($$7.isPresent()) {
         ic $$8 = $$7.get();
         boolean $$9 = $$2.d(d).orElse(false);
         boolean $$10 = $$2.d(c).orElse(false);
         cwy $$11 = $$2.b();
         boolean $$12 = !$$3;
         boolean $$13 = false;
         int $$14 = 0;
         djp[] $$15 = new djp[42];

         for (int $$16 = 1; $$16 < 42; $$16++) {
            hx $$17 = $$1.a($$8, $$16);
            djp $$18 = $$0.a_($$17);
            if ($$18.a(cxa.fH)) {
               if ($$18.c(b) == $$8.g()) {
                  $$14 = $$16;
               }
               break;
            }

            if (!$$18.a(cxa.fI) && $$16 != $$5) {
               $$15[$$16] = null;
               $$12 = false;
            } else {
               if ($$16 == $$5) {
                  $$18 = (djp)MoreObjects.firstNonNull($$6, $$18);
               }

               boolean $$19 = !$$18.c(dfn.d);
               boolean $$20 = $$18.c(dfn.b);
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
         djp $$21 = $$11.o().b(d, Boolean.valueOf($$12)).b(c, Boolean.valueOf($$13));
         if ($$14 > 0) {
            hx $$22 = $$1.a($$8, $$14);
            ic $$23 = $$8.g();
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
               hx $$25 = $$1.a($$8, $$24);
               djp $$26 = $$15[$$24];
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
   public void a(djp $$0, ane $$1, hx $$2, auw $$3) {
      a($$1, $$2, $$0, false, true, -1, null);
   }

   private static void a(ctx $$0, hx $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
      if ($$3 && !$$5) {
         $$0.a(null, $$1, art.zc, aru.e, 0.4F, 0.6F);
         $$0.a(null, dnz.a, $$1);
      } else if (!$$3 && $$5) {
         $$0.a(null, $$1, art.zb, aru.e, 0.4F, 0.5F);
         $$0.a(null, dnz.e, $$1);
      } else if ($$2 && !$$4) {
         $$0.a(null, $$1, art.za, aru.e, 0.4F, 0.7F);
         $$0.a(null, dnz.b, $$1);
      } else if (!$$2 && $$4) {
         $$0.a(null, $$1, art.zd, aru.e, 0.4F, 1.2F / ($$0.z.i() * 0.2F + 0.9F));
         $$0.a(null, dnz.g, $$1);
      }
   }

   private static void a(cwy $$0, ctx $$1, hx $$2, ic $$3) {
      $$1.a($$2, $$0);
      $$1.a($$2.a($$3.g()), $$0);
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
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
   public int a(djp $$0, ctd $$1, hx $$2, ic $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   public int b(djp $$0, ctd $$1, hx $$2, ic $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(b) == $$3 ? 15 : 0;
      }
   }

   @Override
   public boolean f_(djp $$0) {
      return true;
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b, c, d);
   }
}
