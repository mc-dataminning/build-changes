import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dlt extends djx implements dln, dly {
   public static final MapCodec<dlt> c = b(dlt::new);
   private static final dsr d = dsq.C;
   private final djy e = new djy(new dlt.a(djy.a));
   private final djy f = new djy(new dlt.a(djy.e.a));

   @Override
   public MapCodec<dlt> a() {
      return c;
   }

   public dlt(drz.d $$0) {
      super($$0);
      this.k(this.o().a(d, Boolean.valueOf(false)));
   }

   @Override
   public djy c() {
      return this.e;
   }

   public djy m() {
      return this.f;
   }

   public static boolean a(dbx $$0, iz $$1, dsa $$2, Collection<je> $$3) {
      boolean $$4 = false;
      dsa $$5 = dez.qT.o();

      for (je $$6 : $$3) {
         iz $$7 = $$1.a($$6);
         if (a($$0, $$6, $$7, $$0.a_($$7))) {
            $$5 = $$5.a(b($$6), Boolean.valueOf(true));
            $$4 = true;
         }
      }

      if (!$$4) {
         return false;
      } else {
         if (!$$2.u().c()) {
            $$5 = $$5.a(d, Boolean.valueOf(true));
         }

         $$0.a($$1, $$5, 3);
         return true;
      }
   }

   @Override
   public void a(dbx $$0, dsa $$1, iz $$2, azf $$3) {
      if ($$1.a(this)) {
         for (je $$4 : b) {
            dsr $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(dez.qS)) {
               $$1 = $$1.a($$5, Boolean.valueOf(false));
            }
         }

         if (!n($$1)) {
            ent $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? dez.a : dez.G).o();
         }

         $$0.a($$2, $$1, 3);
         dln.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(dls.a $$0, dbx $$1, iz $$2, azf $$3, dls $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? ayx.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(dls $$0, dbx $$1, iz $$2, azf $$3) {
      dsa $$4 = $$1.a_($$2);
      axe<dex> $$5 = $$0.c();

      for (je $$6 : je.a($$3)) {
         if (a($$4, $$6)) {
            iz $$7 = $$2.a($$6);
            dsa $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dsa $$9 = dez.qS.o();
               $$1.a($$7, $$9, 3);
               dex.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, avz.vQ, awa.e, 1.0F, 1.0F);
               this.e.a($$9, $$1, $$7, $$0.h());
               je $$10 = $$6.g();

               for (je $$11 : b) {
                  if ($$11 != $$10) {
                     iz $$12 = $$7.a($$11);
                     dsa $$13 = $$1.a_($$12);
                     if ($$13.a(this)) {
                        this.a($$1, $$13, $$12, $$3);
                     }
                  }
               }

               return true;
            }
         }
      }

      return false;
   }

   public static boolean a(dbx $$0, dsa $$1, iz $$2) {
      if (!$$1.a(dez.qT)) {
         return false;
      } else {
         for (je $$3 : b) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(awo.bS)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, enu.c, enu.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      super.a($$0);
      $$0.a(d);
   }

   @Override
   protected boolean a(dsa $$0, cxy $$1) {
      return !$$1.n().a(cuq.gi) || super.a($$0, $$1);
   }

   @Override
   protected ent b_(dsa $$0) {
      return $$0.c(d) ? enu.c.a(false) : super.b_($$0);
   }

   class a extends djy.a {
      private final djy.e[] b;

      public a(final djy.e... $$0) {
         super(dlt.this);
         this.b = $$0;
      }

      @Override
      public boolean a(dbc $$0, iz $$1, iz $$2, je $$3, dsa $$4) {
         dsa $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(dez.qS) && !$$5.a(dez.qU) && !$$5.a(dez.bQ)) {
            if ($$1.k($$2) == 2) {
               iz $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).d($$0, $$6, $$3)) {
                  return false;
               }
            }

            ent $$7 = $$4.u();
            if (!$$7.c() && !$$7.b(enu.c)) {
               return false;
            } else {
               return $$4.a(awo.aK) ? false : $$4.r() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public djy.e[] a() {
         return this.b;
      }

      @Override
      public boolean a(dsa $$0) {
         return !$$0.a(dez.qT);
      }
   }
}
