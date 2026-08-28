import java.util.Map;
import javax.annotation.Nullable;

public class cxa extends cyo {
   @Deprecated
   private final dlu a;

   public cxa(dlu $$0, cyo.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bty a(dcn $$0) {
      bty $$1 = this.a(new dcl($$0));
      return !$$1.a() && $$0.n().c(kj.w) ? super.a($$0.q(), $$0.o(), $$0.p()) : $$1;
   }

   public bty a(dcl $$0) {
      if (!this.c().a($$0.q().K())) {
         return bty.d;
      } else if (!$$0.b()) {
         return bty.d;
      } else {
         dcl $$1 = this.b($$0);
         if ($$1 == null) {
            return bty.d;
         } else {
            dzo $$2 = this.c($$1);
            if ($$2 == null) {
               return bty.d;
            } else if (!this.a($$1, $$2)) {
               return bty.d;
            } else {
               iu $$3 = $$1.a();
               dip $$4 = $$1.q();
               cqs $$5 = $$1.o();
               cys $$6 = $$1.n();
               dzo $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  a($$4, $$3, $$6);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof arp) {
                     ap.z.a((arp)$$5, $$3, $$6);
                  }
               }

               dtn $$8 = $$7.A();
               $$4.a($$5, $$3, this.a($$7), awm.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(eeo.i, $$3, eeo.a.a($$5, $$7));
               $$6.a(1, $$5);
               return bty.a;
            }
         }
      }
   }

   protected awk a(dzo $$0) {
      return $$0.A().e();
   }

   @Nullable
   public dcl b(dcl $$0) {
      return $$0;
   }

   private static void a(dip $$0, iu $$1, cys $$2) {
      dwn $$3 = $$0.c_($$1);
      if ($$3 != null) {
         $$3.a($$2);
         $$3.e();
      }
   }

   protected boolean a(iu $$0, dip $$1, @Nullable cqs $$2, cys $$3, dzo $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dzo c(dcl $$0) {
      dzo $$1 = this.c().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dzo a(iu $$0, dip $$1, cys $$2, dzo $$3) {
      das $$4 = $$2.a(kj.aq, das.a);
      if ($$4.a()) {
         return $$3;
      } else {
         dzo $$5 = $$4.a($$3);
         if ($$5 != $$3) {
            $$1.a($$0, $$5, 2);
         }

         return $$5;
      }
   }

   protected boolean b(dcl $$0, dzo $$1) {
      return (!this.b() || $$1.a((dis)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), feb.a());
   }

   protected boolean b() {
      return true;
   }

   protected boolean a(dcl $$0, dzo $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(dip $$0, @Nullable cqs $$1, iu $$2, cys $$3) {
      if ($$0.C) {
         return false;
      } else {
         dba $$4 = $$3.a(kj.aa, dba.a);
         if (!$$4.c()) {
            dwp<?> $$5 = $$4.a($$0.F_(), mg.e);
            if ($$5 == null) {
               return false;
            }

            dwn $$6 = $$0.c_($$2);
            if ($$6 != null) {
               dwp<?> $$7 = $$6.p();
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
   public boolean a(cys $$0, @Nullable cqs $$1) {
      if ($$1 != null && $$1.G() >= 2) {
         dba $$2 = $$0.a(kj.aa);
         if ($$2 != null) {
            dwp<?> $$3 = $$2.a($$1.dV().F_(), mg.e);
            return $$3 != null && $$3.b();
         }
      }

      return false;
   }

   public dlu c() {
      return this.a;
   }

   public void a(Map<dlu, cyo> $$0, cyo $$1) {
      $$0.put(this.c(), $$1);
   }

   @Override
   public boolean d() {
      return !(this.c() instanceof dsz);
   }

   @Override
   public void a(cmx $$0) {
      dbk $$1 = $$0.f().b(kj.ap, dbk.a);
      if ($$1 != null) {
         cyv.a($$0, $$1.e());
      }
   }

   public static void a(cys $$0, dwp<?> $$1, tx $$2) {
      $$2.r("id");
      if ($$2.g()) {
         $$0.e(kj.aa);
      } else {
         dwn.a($$2, $$1);
         $$0.b(kj.aa, dba.a($$2));
      }
   }

   @Override
   public cub k() {
      return this.c().k();
   }
}
