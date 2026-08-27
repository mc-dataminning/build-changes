import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dkw extends dja implements dkq, dlb {
   public static final MapCodec<dkw> c = b(dkw::new);
   private static final dru d = drt.C;
   private final djb e = new djb(new dkw.a(djb.a));
   private final djb f = new djb(new dkw.a(djb.e.a));

   @Override
   public MapCodec<dkw> a() {
      return c;
   }

   public dkw(drc.d $$0) {
      super($$0);
      this.k(this.n().a(d, Boolean.valueOf(false)));
   }

   @Override
   public djb c() {
      return this.e;
   }

   public djb m() {
      return this.f;
   }

   public static boolean a(dba $$0, io $$1, drd $$2, Collection<it> $$3) {
      boolean $$4 = false;
      drd $$5 = dec.qT.n();

      for (it $$6 : $$3) {
         io $$7 = $$1.a($$6);
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
   public void a(dba $$0, drd $$1, io $$2, aym $$3) {
      if ($$1.a(this)) {
         for (it $$4 : b) {
            dru $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(dec.qS)) {
               $$1 = $$1.a($$5, Boolean.valueOf(false));
            }
         }

         if (!n($$1)) {
            emw $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? dec.a : dec.G).n();
         }

         $$0.a($$2, $$1, 3);
         dkq.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(dkv.a $$0, dba $$1, io $$2, aym $$3, dkv $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? ayf.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(dkv $$0, dba $$1, io $$2, aym $$3) {
      drd $$4 = $$1.a_($$2);
      awm<dea> $$5 = $$0.c();

      for (it $$6 : it.a($$3)) {
         if (a($$4, $$6)) {
            io $$7 = $$2.a($$6);
            drd $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               drd $$9 = dec.qS.n();
               $$1.a($$7, $$9, 3);
               dea.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, avi.vQ, avj.e, 1.0F, 1.0F);
               this.e.a($$9, $$1, $$7, $$0.h());
               it $$10 = $$6.g();

               for (it $$11 : b) {
                  if ($$11 != $$10) {
                     io $$12 = $$7.a($$11);
                     drd $$13 = $$1.a_($$12);
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

   public static boolean a(dba $$0, drd $$1, io $$2) {
      if (!$$1.a(dec.qT)) {
         return false;
      } else {
         for (it $$3 : b) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(avx.bS)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, emx.c, emx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      super.a($$0);
      $$0.a(d);
   }

   @Override
   protected boolean a(drd $$0, cxb $$1) {
      return !$$1.n().a(ctt.gi) || super.a($$0, $$1);
   }

   @Override
   protected emw b_(drd $$0) {
      return $$0.c(d) ? emx.c.a(false) : super.b_($$0);
   }

   class a extends djb.a {
      private final djb.e[] b;

      public a(djb.e... $$0) {
         super(dkw.this);
         this.b = $$0;
      }

      @Override
      public boolean a(daf $$0, io $$1, io $$2, it $$3, drd $$4) {
         drd $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(dec.qS) && !$$5.a(dec.qU) && !$$5.a(dec.bQ)) {
            if ($$1.k($$2) == 2) {
               io $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).d($$0, $$6, $$3)) {
                  return false;
               }
            }

            emw $$7 = $$4.u();
            if (!$$7.c() && !$$7.b(emx.c)) {
               return false;
            } else {
               return $$4.a(avx.aK) ? false : $$4.r() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public djb.e[] a() {
         return this.b;
      }

      @Override
      public boolean a(drd $$0) {
         return !$$0.a(dec.qT);
      }
   }
}
