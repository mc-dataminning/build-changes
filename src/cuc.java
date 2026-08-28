import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class cuc extends cvt {
   @Deprecated
   private final dhy a;

   public cuc(dhy $$0, cvt.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bry a(czo $$0) {
      bry $$1 = this.a(new czm($$0));
      return !$$1.a() && $$0.n().b(kt.x) ? super.a($$0.q(), $$0.o(), $$0.p()) : $$1;
   }

   public bry a(czm $$0) {
      if (!this.d().a($$0.q().J())) {
         return bry.d;
      } else if (!$$0.b()) {
         return bry.d;
      } else {
         czm $$1 = this.b($$0);
         if ($$1 == null) {
            return bry.d;
         } else {
            dvd $$2 = this.c($$1);
            if ($$2 == null) {
               return bry.d;
            } else if (!this.a($$1, $$2)) {
               return bry.d;
            } else {
               jg $$3 = $$1.a();
               dev $$4 = $$1.q();
               coh $$5 = $$1.o();
               cvx $$6 = $$1.n();
               dvd $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  a($$4, $$3, $$6);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof arn) {
                     an.z.a((arn)$$5, $$3, $$6);
                  }
               }

               dpl $$8 = $$7.A();
               $$4.a($$5, $$3, this.a($$7), awl.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(eaa.i, $$3, eaa.a.a($$5, $$7));
               $$6.a(1, $$5);
               return bry.b;
            }
         }
      }
   }

   protected awj a(dvd $$0) {
      return $$0.A().e();
   }

   @Nullable
   public czm b(czm $$0) {
      return $$0;
   }

   private static void a(dev $$0, jg $$1, cvx $$2) {
      dsg $$3 = $$0.c_($$1);
      if ($$3 != null) {
         $$3.a($$2);
         $$3.e();
      }
   }

   protected boolean a(jg $$0, dev $$1, @Nullable coh $$2, cvx $$3, dvd $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dvd c(czm $$0) {
      dvd $$1 = this.d().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dvd a(jg $$0, dev $$1, cvx $$2, dvd $$3) {
      cxz $$4 = $$2.a(kt.al, cxz.a);
      if ($$4.a()) {
         return $$3;
      } else {
         dvd $$5 = $$4.a($$3);
         if ($$5 != $$3) {
            $$1.a($$0, $$5, 2);
         }

         return $$5;
      }
   }

   protected boolean b(czm $$0, dvd $$1) {
      coh $$2 = $$0.o();
      ezm $$3 = $$2 == null ? ezm.a() : ezm.a($$2);
      return (!this.c() || $$1.a((dey)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean c() {
      return true;
   }

   protected boolean a(czm $$0, dvd $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(dev $$0, @Nullable coh $$1, jg $$2, cvx $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 == null) {
         return false;
      } else {
         cyg $$5 = $$3.a(kt.X, cyg.a);
         if (!$$5.b()) {
            dsg $$6 = $$0.c_($$2);
            if ($$6 != null) {
               if ($$0.C || !$$6.p() || $$1 != null && $$1.gH()) {
                  return $$5.a($$6, $$0.H_());
               }

               return false;
            }
         }

         return false;
      }
   }

   @Override
   public void a(cvx $$0, cvt.b $$1, List<xh> $$2, cxp $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d().a($$0, $$1, $$2, $$3);
   }

   public dhy d() {
      return this.a;
   }

   public void a(Map<dhy, cvt> $$0, cvt $$1) {
      $$0.put(this.d(), $$1);
   }

   @Override
   public boolean e() {
      return !(this.d() instanceof dox);
   }

   @Override
   public void a(ckq $$0) {
      cyn $$1 = $$0.m().b(kt.ak, cyn.a);
      if ($$1 != null) {
         cwa.a($$0, $$1.e());
      }
   }

   public static void a(cvx $$0, dsi<?> $$1, uj $$2) {
      $$2.r("id");
      if ($$2.g()) {
         $$0.c(kt.X);
      } else {
         dsg.a($$2, $$1);
         $$0.b(kt.X, cyg.a($$2));
      }
   }

   @Override
   public cra i() {
      return this.d().i();
   }
}
