import java.util.Map;
import javax.annotation.Nullable;

public class cxl extends cyz {
   @Deprecated
   private final dmf a;

   public cxl(dmf $$0, cyz.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bud a(dcy $$0) {
      bud $$1 = this.a(new dcw($$0));
      return !$$1.a() && $$0.n().c(kj.w) ? super.a($$0.q(), $$0.o(), $$0.p()) : $$1;
   }

   public bud a(dcw $$0) {
      if (!this.c().a($$0.q().K())) {
         return bud.d;
      } else if (!$$0.b()) {
         return bud.d;
      } else {
         dcw $$1 = this.b($$0);
         if ($$1 == null) {
            return bud.d;
         } else {
            eah $$2 = this.c($$1);
            if ($$2 == null) {
               return bud.d;
            } else if (!this.a($$1, $$2)) {
               return bud.d;
            } else {
               iu $$3 = $$1.a();
               dja $$4 = $$1.q();
               crc $$5 = $$1.o();
               czd $$6 = $$1.n();
               eah $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  a($$4, $$3, $$6);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof arr) {
                     ap.z.a((arr)$$5, $$3, $$6);
                  }
               }

               duc $$8 = $$7.A();
               $$4.a($$5, $$3, this.a($$7), awo.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(efh.i, $$3, efh.a.a($$5, $$7));
               $$6.a(1, $$5);
               return bud.a;
            }
         }
      }
   }

   protected awm a(eah $$0) {
      return $$0.A().e();
   }

   @Nullable
   public dcw b(dcw $$0) {
      return $$0;
   }

   private static void a(dja $$0, iu $$1, czd $$2) {
      dxf $$3 = $$0.c_($$1);
      if ($$3 != null) {
         $$3.a($$2);
         $$3.e();
      }
   }

   protected boolean a(iu $$0, dja $$1, @Nullable crc $$2, czd $$3, eah $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected eah c(dcw $$0) {
      eah $$1 = this.c().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private eah a(iu $$0, dja $$1, czd $$2, eah $$3) {
      dbd $$4 = $$2.a(kj.aq, dbd.a);
      if ($$4.a()) {
         return $$3;
      } else {
         eah $$5 = $$4.a($$3);
         if ($$5 != $$3) {
            $$1.a($$0, $$5, 2);
         }

         return $$5;
      }
   }

   protected boolean b(dcw $$0, eah $$1) {
      return (!this.b() || $$1.a((djd)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), fev.a());
   }

   protected boolean b() {
      return true;
   }

   protected boolean a(dcw $$0, eah $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(dja $$0, @Nullable crc $$1, iu $$2, czd $$3) {
      if ($$0.C) {
         return false;
      } else {
         dbl $$4 = $$3.a(kj.aa, dbl.a);
         if (!$$4.c()) {
            dxh<?> $$5 = $$4.a($$0.F_(), mg.e);
            if ($$5 == null) {
               return false;
            }

            dxf $$6 = $$0.c_($$2);
            if ($$6 != null) {
               dxh<?> $$7 = $$6.p();
               if ($$7 != $$5) {
                  return false;
               }

               if (!$$7.b() || $$1 != null && $$1.gG()) {
                  return $$4.a($$6, $$0.F_());
               }

               return false;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(czd $$0, @Nullable crc $$1) {
      if ($$1 != null && $$1.G() >= 2) {
         dbl $$2 = $$0.a(kj.aa);
         if ($$2 != null) {
            dxh<?> $$3 = $$2.a($$1.dV().F_(), mg.e);
            return $$3 != null && $$3.b();
         }
      }

      return false;
   }

   public dmf c() {
      return this.a;
   }

   public void a(Map<dmf, cyz> $$0, cyz $$1) {
      $$0.put(this.c(), $$1);
   }

   @Override
   public boolean d() {
      return !(this.c() instanceof dto);
   }

   @Override
   public void a(cnh $$0) {
      dbv $$1 = $$0.f().b(kj.ap, dbv.a);
      if ($$1 != null) {
         czg.a($$0, $$1.e());
      }
   }

   public static void a(czd $$0, dxh<?> $$1, tz $$2) {
      $$2.r("id");
      if ($$2.g()) {
         $$0.e(kj.aa);
      } else {
         dxf.a($$2, $$1);
         $$0.b(kj.aa, dbl.a($$2));
      }
   }

   @Override
   public cum k() {
      return this.c().k();
   }
}
