import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class ddl extends dbp implements ddf, ddq {
   public static final MapCodec<ddl> c = b(ddl::new);
   private static final djy d = djx.C;
   private final dbq e = new dbq(new ddl.a(dbq.a));
   private final dbq f = new dbq(new ddl.a(dbq.e.a));

   @Override
   public MapCodec<ddl> a() {
      return c;
   }

   public ddl(djg.d $$0) {
      super($$0);
      this.k(this.o().a(d, Boolean.valueOf(false)));
   }

   @Override
   public dbq c() {
      return this.e;
   }

   public dbq g() {
      return this.f;
   }

   public static boolean a(ctq $$0, hx $$1, djh $$2, Collection<ic> $$3) {
      boolean $$4 = false;
      djh $$5 = cws.qT.o();

      for (ic $$6 : $$3) {
         hx $$7 = $$1.a($$6);
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
   public void a(ctq $$0, djh $$1, hx $$2, auv $$3) {
      if ($$1.a(this)) {
         for (ic $$4 : b) {
            djy $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(cws.qS)) {
               $$1 = $$1.a($$5, Boolean.valueOf(false));
            }
         }

         if (!n($$1)) {
            eer $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? cws.a : cws.G).o();
         }

         $$0.a($$2, $$1, 3);
         ddf.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(ddk.a $$0, ctq $$1, hx $$2, auv $$3, ddk $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? auo.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(ddk $$0, ctq $$1, hx $$2, auv $$3) {
      djh $$4 = $$1.a_($$2);
      asw<cwq> $$5 = $$0.c();

      for (ic $$6 : ic.a($$3)) {
         if (a($$4, $$6)) {
            hx $$7 = $$2.a($$6);
            djh $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               djh $$9 = cws.qS.o();
               $$1.a($$7, $$9, 3);
               cwq.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, ars.uW, art.e, 1.0F, 1.0F);
               this.e.a($$9, $$1, $$7, $$0.h());
               ic $$10 = $$6.g();

               for (ic $$11 : b) {
                  if ($$11 != $$10) {
                     hx $$12 = $$7.a($$11);
                     djh $$13 = $$1.a_($$12);
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

   public static boolean a(ctq $$0, djh $$1, hx $$2) {
      if (!$$1.a(cws.qT)) {
         return false;
      } else {
         for (ic $$3 : b) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(ash.bL)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ees.c, ees.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      super.a($$0);
      $$0.a(d);
   }

   @Override
   public boolean a(djh $$0, cph $$1) {
      return !$$1.n().a(cnb.gh) || super.a($$0, $$1);
   }

   @Override
   public eer c_(djh $$0) {
      return $$0.c(d) ? ees.c.a(false) : super.c_($$0);
   }

   class a extends dbq.a {
      private final dbq.e[] c;

      public a(dbq.e... $$0) {
         super(ddl.this);
         this.c = $$0;
      }

      @Override
      public boolean a(csv $$0, hx $$1, hx $$2, ic $$3, djh $$4) {
         djh $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(cws.qS) && !$$5.a(cws.qU) && !$$5.a(cws.bQ)) {
            if ($$1.k($$2) == 2) {
               hx $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).d($$0, $$6, $$3)) {
                  return false;
               }
            }

            eer $$7 = $$4.u();
            if (!$$7.c() && !$$7.b(ees.c)) {
               return false;
            } else {
               return $$4.a(ash.aJ) ? false : $$4.r() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public dbq.e[] a() {
         return this.c;
      }

      @Override
      public boolean a(djh $$0) {
         return !$$0.a(cws.qT);
      }
   }
}
