import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cwf extends cxu {
   @Deprecated
   private final dku a;

   public cwf(dku $$0, cxu.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public btq a(dbp $$0) {
      btq $$1 = this.a(new dbn($$0));
      return !$$1.a() && $$0.n().c(kx.x) ? super.a($$0.q(), $$0.o(), $$0.p()) : $$1;
   }

   public btq a(dbn $$0) {
      if (!this.d().a($$0.q().K())) {
         return btq.d;
      } else if (!$$0.b()) {
         return btq.d;
      } else {
         dbn $$1 = this.b($$0);
         if ($$1 == null) {
            return btq.d;
         } else {
            dym $$2 = this.c($$1);
            if ($$2 == null) {
               return btq.d;
            } else if (!this.a($$1, $$2)) {
               return btq.d;
            } else {
               jj $$3 = $$1.a();
               dhp $$4 = $$1.q();
               cqi $$5 = $$1.o();
               cxy $$6 = $$1.n();
               dym $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  a($$4, $$3, $$6);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof aro) {
                     ap.z.a((aro)$$5, $$3, $$6);
                  }
               }

               dsn $$8 = $$7.A();
               $$4.a($$5, $$3, this.a($$7), awl.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(edm.i, $$3, edm.a.a($$5, $$7));
               $$6.a(1, $$5);
               return btq.a;
            }
         }
      }
   }

   protected awj a(dym $$0) {
      return $$0.A().e();
   }

   @Nullable
   public dbn b(dbn $$0) {
      return $$0;
   }

   private static void a(dhp $$0, jj $$1, cxy $$2) {
      dvl $$3 = $$0.c_($$1);
      if ($$3 != null) {
         $$3.a($$2);
         $$3.e();
      }
   }

   protected boolean a(jj $$0, dhp $$1, @Nullable cqi $$2, cxy $$3, dym $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dym c(dbn $$0) {
      dym $$1 = this.d().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dym a(jj $$0, dhp $$1, cxy $$2, dym $$3) {
      czx $$4 = $$2.a(kx.ao, czx.a);
      if ($$4.a()) {
         return $$3;
      } else {
         dym $$5 = $$4.a($$3);
         if ($$5 != $$3) {
            $$1.a($$0, $$5, 2);
         }

         return $$5;
      }
   }

   protected boolean b(dbn $$0, dym $$1) {
      return (!this.c() || $$1.a((dhs)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), fcz.a());
   }

   protected boolean c() {
      return true;
   }

   protected boolean a(dbn $$0, dym $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(dhp $$0, @Nullable cqi $$1, jj $$2, cxy $$3) {
      if ($$0.C) {
         return false;
      } else {
         dae $$4 = $$3.a(kx.aa, dae.a);
         if (!$$4.c()) {
            dvn<?> $$5 = $$4.a($$0.F_(), me.h);
            if ($$5 == null) {
               return false;
            }

            dvl $$6 = $$0.c_($$2);
            if ($$6 != null) {
               dvn<?> $$7 = $$6.p();
               if ($$7 != $$5) {
                  return false;
               }

               if (!$$7.b() || $$1 != null && $$1.gF()) {
                  return $$4.a($$6, $$0.F_());
               }

               return false;
            }
         }

         return false;
      }
   }

   @Override
   public void a(cxy $$0, cxu.b $$1, List<wv> $$2, czn $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d().a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(cxy $$0, @Nullable cqi $$1) {
      if ($$1 != null && $$1.G() >= 2) {
         dae $$2 = $$0.a(kx.aa);
         if ($$2 != null) {
            dvn<?> $$3 = $$2.a($$1.dV().F_(), me.h);
            return $$3 != null && $$3.b();
         }
      }

      return false;
   }

   public dku d() {
      return this.a;
   }

   public void a(Map<dku, cxu> $$0, cxu $$1) {
      $$0.put(this.d(), $$1);
   }

   @Override
   public boolean e() {
      return !(this.d() instanceof drz);
   }

   @Override
   public void a(cmn $$0) {
      dan $$1 = $$0.f().b(kx.an, dan.a);
      if ($$1 != null) {
         cyb.a($$0, $$1.e());
      }
   }

   public static void a(cxy $$0, dvn<?> $$1, tw $$2) {
      $$2.r("id");
      if ($$2.g()) {
         $$0.e(kx.aa);
      } else {
         dvl.a($$2, $$1);
         $$0.b(kx.aa, dae.a($$2));
      }
   }

   @Override
   public cte k() {
      return this.d().k();
   }
}
