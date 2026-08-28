import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class drd extends dpg implements dqx, dri {
   public static final MapCodec<drd> c = b(drd::new);
   private static final dye d = dyd.D;
   private final dph e = new dph(new drd.a(dph.a));
   private final dph f = new dph(new drd.a(dph.e.a));

   @Override
   public MapCodec<drd> a() {
      return c;
   }

   public drd(dxm.d $$0) {
      super($$0);
      this.l(this.m().b(d, Boolean.valueOf(false)));
   }

   @Override
   public dph c() {
      return this.e;
   }

   public dph q() {
      return this.f;
   }

   public static boolean a(dhb $$0, jh $$1, dxn $$2, Collection<jm> $$3) {
      boolean $$4 = false;
      dxn $$5 = dkg.ro.m();

      for (jm $$6 : $$3) {
         jh $$7 = $$1.a($$6);
         if (a($$0, $$6, $$7, $$0.a_($$7))) {
            $$5 = $$5.b(b($$6), Boolean.valueOf(true));
            $$4 = true;
         }
      }

      if (!$$4) {
         return false;
      } else {
         if (!$$2.y().c()) {
            $$5 = $$5.b(d, Boolean.valueOf(true));
         }

         $$0.a($$1, $$5, 3);
         return true;
      }
   }

   @Override
   public void a(dhb $$0, dxn $$1, jh $$2, bam $$3) {
      if ($$1.a(this)) {
         for (jm $$4 : b) {
            dye $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(dkg.rn)) {
               $$1 = $$1.b($$5, Boolean.valueOf(false));
            }
         }

         if (!q($$1)) {
            etp $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? dkg.a : dkg.J).m();
         }

         $$0.a($$2, $$1, 3);
         dqx.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(drc.a $$0, dhb $$1, jh $$2, bam $$3, drc $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? bae.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(drc $$0, dhb $$1, jh $$2, bam $$3) {
      dxn $$4 = $$1.a_($$2);
      ayk<dke> $$5 = $$0.c();

      for (jm $$6 : jm.a($$3)) {
         if (a($$4, $$6)) {
            jh $$7 = $$2.a($$6);
            dxn $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dxn $$9 = dkg.rn.m();
               $$1.a($$7, $$9, 3);
               dke.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, axf.wm, axg.e, 1.0F, 1.0F);
               this.e.a($$9, $$1, $$7, $$0.h());
               jm $$10 = $$6.g();

               for (jm $$11 : b) {
                  if ($$11 != $$10) {
                     jh $$12 = $$7.a($$11);
                     dxn $$13 = $$1.a_($$12);
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

   public static boolean a(dhb $$0, dxn $$1, jh $$2) {
      if (!$$1.a(dkg.ro)) {
         return false;
      } else {
         for (jm $$3 : b) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(axu.bU)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, etq.c, etq.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      super.a($$0);
      $$0.a(d);
   }

   @Override
   protected boolean a(dxn $$0, dbb $$1) {
      return !$$1.n().a(cxo.gv) || super.a($$0, $$1);
   }

   @Override
   protected etp b_(dxn $$0) {
      return $$0.c(d) ? etq.c.a(false) : super.b_($$0);
   }

   class a extends dph.a {
      private final dph.e[] b;

      public a(final dph.e... $$0) {
         super(drd.this);
         this.b = $$0;
      }

      @Override
      public boolean a(dgf $$0, jh $$1, jh $$2, jm $$3, dxn $$4) {
         dxn $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(dkg.rn) && !$$5.a(dkg.rp) && !$$5.a(dkg.bX)) {
            if ($$1.k($$2) == 2) {
               jh $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).c($$0, $$6, $$3)) {
                  return false;
               }
            }

            etp $$7 = $$4.y();
            if (!$$7.c() && !$$7.b(etq.c)) {
               return false;
            } else {
               return $$4.a(axu.aN) ? false : $$4.v() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public dph.e[] a() {
         return this.b;
      }

      @Override
      public boolean a(dxn $$0) {
         return !$$0.a(dkg.ro);
      }
   }
}
