import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dau extends cyy implements dao, daz {
   public static final MapCodec<dau> c = b(dau::new);
   private static final dgs d = dgr.C;
   private final cyz e = new cyz(new dau.a(cyz.a));
   private final cyz f = new cyz(new dau.a(cyz.e.a));

   @Override
   public MapCodec<dau> a() {
      return c;
   }

   public dau(dga.d $$0) {
      super($$0);
      this.k(this.o().a(d, Boolean.valueOf(false)));
   }

   @Override
   public cyz c() {
      return this.e;
   }

   public cyz g() {
      return this.f;
   }

   public static boolean a(cra $$0, ht $$1, dgb $$2, Collection<hx> $$3) {
      boolean $$4 = false;
      dgb $$5 = cuc.qG.o();

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
   public void a(cra $$0, dgb $$1, ht $$2, ate $$3) {
      if ($$1.a(this)) {
         for (hx $$4 : b) {
            dgs $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(cuc.qF)) {
               $$1 = $$1.a($$5, Boolean.valueOf(false));
            }
         }

         if (!n($$1)) {
            ebe $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? cuc.a : cuc.G).o();
         }

         $$0.a($$2, $$1, 3);
         dao.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(dat.a $$0, cra $$1, ht $$2, ate $$3, dat $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? asy.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(dat $$0, cra $$1, ht $$2, ate $$3) {
      dgb $$4 = $$1.a_($$2);
      arh<cua> $$5 = $$0.c();

      for (hx $$6 : hx.a($$3)) {
         if (a($$4, $$6)) {
            ht $$7 = $$2.a($$6);
            dgb $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dgb $$9 = cuc.qF.o();
               $$1.a($$7, $$9, 3);
               cua.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, aqd.ui, aqe.e, 1.0F, 1.0F);
               this.e.a($$9, $$1, $$7, $$0.h());
               hx $$10 = $$6.g();

               for (hx $$11 : b) {
                  if ($$11 != $$10) {
                     ht $$12 = $$7.a($$11);
                     dgb $$13 = $$1.a_($$12);
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

   public static boolean a(cra $$0, dgb $$1, ht $$2) {
      if (!$$1.a(cuc.qG)) {
         return false;
      } else {
         for (hx $$3 : b) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(aqs.bL)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ebf.c, ebf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      super.a($$0);
      $$0.a(d);
   }

   @Override
   public boolean a(dgb $$0, cmr $$1) {
      return !$$1.n().a(ckm.fM) || super.a($$0, $$1);
   }

   @Override
   public ebe c_(dgb $$0) {
      return $$0.c(d) ? ebf.c.a(false) : super.c_($$0);
   }

   class a extends cyz.a {
      private final cyz.e[] c;

      public a(cyz.e... $$0) {
         super(dau.this);
         this.c = $$0;
      }

      @Override
      public boolean a(cqf $$0, ht $$1, ht $$2, hx $$3, dgb $$4) {
         dgb $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(cuc.qF) && !$$5.a(cuc.qH) && !$$5.a(cuc.bQ)) {
            if ($$1.k($$2) == 2) {
               ht $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).d($$0, $$6, $$3)) {
                  return false;
               }
            }

            ebe $$7 = $$4.u();
            if (!$$7.c() && !$$7.b(ebf.c)) {
               return false;
            } else {
               return $$4.a(aqs.aJ) ? false : $$4.r() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public cyz.e[] a() {
         return this.c;
      }

      @Override
      public boolean a(dgb $$0) {
         return !$$0.a(cuc.qG);
      }
   }
}
