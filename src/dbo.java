import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dbo extends czs implements dbi, dbt {
   public static final MapCodec<dbo> c = b(dbo::new);
   private static final dhn d = dhm.C;
   private final czt e = new czt(new dbo.a(czt.a));
   private final czt f = new czt(new dbo.a(czt.e.a));

   @Override
   public MapCodec<dbo> a() {
      return c;
   }

   public dbo(dgv.d $$0) {
      super($$0);
      this.k(this.o().a(d, Boolean.valueOf(false)));
   }

   @Override
   public czt c() {
      return this.e;
   }

   public czt g() {
      return this.f;
   }

   public static boolean a(crt $$0, ht $$1, dgw $$2, Collection<hx> $$3) {
      boolean $$4 = false;
      dgw $$5 = cuv.qG.o();

      for (hx $$6 : $$3) {
         ht $$7 = $$1.a($$6);
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
   public void a(crt $$0, dgw $$1, ht $$2, ato $$3) {
      if ($$1.a(this)) {
         for (hx $$4 : b) {
            dhn $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(cuv.qF)) {
               $$1 = $$1.a($$5, Boolean.valueOf(false));
            }
         }

         if (!n($$1)) {
            ecg $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? cuv.a : cuv.G).o();
         }

         $$0.a($$2, $$1, 3);
         dbi.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(dbn.a $$0, crt $$1, ht $$2, ato $$3, dbn $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? ati.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(dbn $$0, crt $$1, ht $$2, ato $$3) {
      dgw $$4 = $$1.a_($$2);
      arr<cut> $$5 = $$0.c();

      for (hx $$6 : hx.a($$3)) {
         if (a($$4, $$6)) {
            ht $$7 = $$2.a($$6);
            dgw $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dgw $$9 = cuv.qF.o();
               $$1.a($$7, $$9, 3);
               cut.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, aqn.uk, aqo.e, 1.0F, 1.0F);
               this.e.a($$9, $$1, $$7, $$0.h());
               hx $$10 = $$6.g();

               for (hx $$11 : b) {
                  if ($$11 != $$10) {
                     ht $$12 = $$7.a($$11);
                     dgw $$13 = $$1.a_($$12);
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

   public static boolean a(crt $$0, dgw $$1, ht $$2) {
      if (!$$1.a(cuv.qG)) {
         return false;
      } else {
         for (hx $$3 : b) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(arc.bL)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ech.c, ech.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      super.a($$0);
      $$0.a(d);
   }

   @Override
   public boolean a(dgw $$0, cnj $$1) {
      return !$$1.n().a(cle.fM) || super.a($$0, $$1);
   }

   @Override
   public ecg c_(dgw $$0) {
      return $$0.c(d) ? ech.c.a(false) : super.c_($$0);
   }

   class a extends czt.a {
      private final czt.e[] c;

      public a(czt.e... $$0) {
         super(dbo.this);
         this.c = $$0;
      }

      @Override
      public boolean a(cqy $$0, ht $$1, ht $$2, hx $$3, dgw $$4) {
         dgw $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(cuv.qF) && !$$5.a(cuv.qH) && !$$5.a(cuv.bQ)) {
            if ($$1.k($$2) == 2) {
               ht $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).d($$0, $$6, $$3)) {
                  return false;
               }
            }

            ecg $$7 = $$4.u();
            if (!$$7.c() && !$$7.b(ech.c)) {
               return false;
            } else {
               return $$4.a(arc.aJ) ? false : $$4.r() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public czt.e[] a() {
         return this.c;
      }

      @Override
      public boolean a(dgw $$0) {
         return !$$0.a(cuv.qG);
      }
   }
}
