import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cut extends cwj {
   public static final List<wo> a = List.of(
      wo.c("item.op_block_warning.line1").a(n.m, n.r), wo.c("item.op_block_warning.line2").a(n.m), wo.c("item.op_block_warning.line3").a(n.m)
   );
   @Deprecated
   private final djk b;

   public cut(djk $$0, cwj.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bsi a(dag $$0) {
      bsi $$1 = this.a(new dae($$0));
      return !$$1.a() && $$0.n().b(kv.x) ? super.a($$0.q(), $$0.o(), $$0.p()) : $$1;
   }

   public bsi a(dae $$0) {
      if (!this.d().a($$0.q().K())) {
         return bsi.d;
      } else if (!$$0.b()) {
         return bsi.d;
      } else {
         dae $$1 = this.b($$0);
         if ($$1 == null) {
            return bsi.d;
         } else {
            dwv $$2 = this.c($$1);
            if ($$2 == null) {
               return bsi.d;
            } else if (!this.a($$1, $$2)) {
               return bsi.d;
            } else {
               ji $$3 = $$1.a();
               dgg $$4 = $$1.q();
               cov $$5 = $$1.o();
               cwn $$6 = $$1.n();
               dwv $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  a($$4, $$3, $$6);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof ard) {
                     ap.z.a((ard)$$5, $$3, $$6);
                  }
               }

               drc $$8 = $$7.A();
               $$4.a($$5, $$3, this.a($$7), awa.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(ebr.i, $$3, ebr.a.a($$5, $$7));
               $$6.a(1, $$5);
               return bsi.a;
            }
         }
      }
   }

   protected avy a(dwv $$0) {
      return $$0.A().e();
   }

   @Nullable
   public dae b(dae $$0) {
      return $$0;
   }

   private static void a(dgg $$0, ji $$1, cwn $$2) {
      dtx $$3 = $$0.c_($$1);
      if ($$3 != null) {
         $$3.a($$2);
         $$3.e();
      }
   }

   protected boolean a(ji $$0, dgg $$1, @Nullable cov $$2, cwn $$3, dwv $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dwv c(dae $$0) {
      dwv $$1 = this.d().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dwv a(ji $$0, dgg $$1, cwn $$2, dwv $$3) {
      cyp $$4 = $$2.a(kv.am, cyp.a);
      if ($$4.a()) {
         return $$3;
      } else {
         dwv $$5 = $$4.a($$3);
         if ($$5 != $$3) {
            $$1.a($$0, $$5, 2);
         }

         return $$5;
      }
   }

   protected boolean b(dae $$0, dwv $$1) {
      cov $$2 = $$0.o();
      fbd $$3 = $$2 == null ? fbd.a() : fbd.a($$2);
      return (!this.c() || $$1.a((dgj)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean c() {
      return true;
   }

   protected boolean a(dae $$0, dwv $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(dgg $$0, @Nullable cov $$1, ji $$2, cwn $$3) {
      if ($$0.C) {
         return false;
      } else {
         cyw $$4 = $$3.a(kv.Y, cyw.a);
         if (!$$4.c()) {
            dtz<?> $$5 = a($$0.K_(), $$4);
            if ($$5 == null) {
               return false;
            }

            dtx $$6 = $$0.c_($$2);
            if ($$6 != null) {
               dtz<?> $$7 = $$6.p();
               if ($$7 != $$5) {
                  return false;
               }

               if (!$$7.b() || $$1 != null && $$1.gG()) {
                  return $$4.a($$6, $$0.K_());
               }

               return false;
            }
         }

         return false;
      }
   }

   @Nullable
   private static dtz<?> a(jt.a $$0, cyw $$1) {
      aku $$2 = $$1.a();
      return $$2 == null ? null : $$0.a(mc.h).flatMap($$1x -> $$1x.a(akt.a(mc.h, $$2))).map(jr::a).orElse(null);
   }

   @Override
   public void a(cwn $$0, cwj.b $$1, List<wo> $$2, cyf $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d().a($$0, $$1, $$2, $$3);
   }

   public static boolean a(cwn $$0, @Nullable cov $$1) {
      if ($$1 != null && $$1.G() >= 2) {
         cyw $$2 = $$0.a(kv.Y);
         if ($$2 != null) {
            dtz<?> $$3 = a($$1.dW().K_(), $$2);
            return $$3 != null && $$3.b();
         }
      }

      return false;
   }

   public djk d() {
      return this.b;
   }

   public void a(Map<djk, cwj> $$0, cwj $$1) {
      $$0.put(this.d(), $$1);
   }

   @Override
   public boolean e() {
      return !(this.d() instanceof dqo);
   }

   @Override
   public void a(cla $$0) {
      czf $$1 = $$0.l().b(kv.al, czf.a);
      if ($$1 != null) {
         cwq.a($$0, $$1.e());
      }
   }

   public static void a(cwn $$0, dtz<?> $$1, tq $$2) {
      $$2.r("id");
      if ($$2.g()) {
         $$0.d(kv.Y);
      } else {
         dtx.a($$2, $$1);
         $$0.b(kv.Y, cyw.a($$2));
      }
   }

   @Override
   public crr i() {
      return this.d().i();
   }
}
