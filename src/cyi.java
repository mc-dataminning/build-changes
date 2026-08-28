import java.util.Map;
import javax.annotation.Nullable;

public class cyi extends czw {
   @Deprecated
   private final dne a;

   public cyi(dne $$0, czw.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public but a(ddv $$0) {
      but $$1 = this.a(new ddt($$0));
      return !$$1.a() && $$0.n().c(kl.w) ? super.a($$0.q(), $$0.o(), $$0.p()) : $$1;
   }

   public but a(ddt $$0) {
      if (!this.c().a($$0.q().K())) {
         return but.d;
      } else if (!$$0.b()) {
         return but.d;
      } else {
         ddt $$1 = this.b($$0);
         if ($$1 == null) {
            return but.d;
         } else {
            ebg $$2 = this.c($$1);
            if ($$2 == null) {
               return but.d;
            } else if (!this.a($$1, $$2)) {
               return but.d;
            } else {
               iw $$3 = $$1.a();
               djz $$4 = $$1.q();
               crz $$5 = $$1.o();
               daa $$6 = $$1.n();
               ebg $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  a($$4, $$3, $$6);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof arv) {
                     aq.z.a((arv)$$5, $$3, $$6);
                  }
               }

               dvb $$8 = $$7.A();
               $$4.a($$5, $$3, this.a($$7), aws.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(egg.i, $$3, egg.a.a($$5, $$7));
               $$6.a(1, $$5);
               return but.a;
            }
         }
      }
   }

   protected awq a(ebg $$0) {
      return $$0.A().e();
   }

   @Nullable
   public ddt b(ddt $$0) {
      return $$0;
   }

   private static void a(djz $$0, iw $$1, daa $$2) {
      dye $$3 = $$0.c_($$1);
      if ($$3 != null) {
         $$3.a($$2);
         $$3.e();
      }
   }

   protected boolean a(iw $$0, djz $$1, @Nullable crz $$2, daa $$3, ebg $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected ebg c(ddt $$0) {
      ebg $$1 = this.c().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private ebg a(iw $$0, djz $$1, daa $$2, ebg $$3) {
      dca $$4 = $$2.a(kl.aq, dca.a);
      if ($$4.a()) {
         return $$3;
      } else {
         ebg $$5 = $$4.a($$3);
         if ($$5 != $$3) {
            $$1.a($$0, $$5, 2);
         }

         return $$5;
      }
   }

   protected boolean b(ddt $$0, ebg $$1) {
      crz $$2 = $$0.o();
      return (!this.b() || $$1.a((dkc)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), ffx.b($$2));
   }

   protected boolean b() {
      return true;
   }

   protected boolean a(ddt $$0, ebg $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(djz $$0, @Nullable crz $$1, iw $$2, daa $$3) {
      if ($$0.C) {
         return false;
      } else {
         dci $$4 = $$3.a(kl.aa, dci.a);
         if (!$$4.c()) {
            dyg<?> $$5 = $$4.a($$0.J_(), mi.e);
            if ($$5 == null) {
               return false;
            }

            dye $$6 = $$0.c_($$2);
            if ($$6 != null) {
               dyg<?> $$7 = $$6.p();
               if ($$7 != $$5) {
                  return false;
               }

               if (!$$7.b() || $$1 != null && $$1.gG()) {
                  return $$4.a($$6, $$0.J_());
               }

               return false;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(daa $$0, @Nullable crz $$1) {
      if ($$1 != null && $$1.G() >= 2) {
         dci $$2 = $$0.a(kl.aa);
         if ($$2 != null) {
            dyg<?> $$3 = $$2.a($$1.dV().J_(), mi.e);
            return $$3 != null && $$3.b();
         }
      }

      return false;
   }

   public dne c() {
      return this.a;
   }

   public void a(Map<dne, czw> $$0, czw $$1) {
      $$0.put(this.c(), $$1);
   }

   @Override
   public boolean d() {
      return !(this.c() instanceof dun);
   }

   @Override
   public void a(coe $$0) {
      dcs $$1 = $$0.f().b(kl.ap, dcs.a);
      if ($$1 != null) {
         dad.a($$0, $$1.e());
      }
   }

   public static void a(daa $$0, dyg<?> $$1, ua $$2) {
      $$2.r("id");
      if ($$2.j()) {
         $$0.e(kl.aa);
      } else {
         dye.a($$2, $$1);
         $$0.b(kl.aa, dci.a($$2));
      }
   }

   @Override
   public cvj k() {
      return this.c().k();
   }
}
