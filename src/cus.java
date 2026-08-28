import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class cus extends cwi {
   @Deprecated
   private final diq a;

   public cus(diq $$0, cwi.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bsk a(daf $$0) {
      bsk $$1 = this.a(new dad($$0));
      return !$$1.a() && $$0.n().b(ku.x) ? super.a($$0.q(), $$0.o(), $$0.p()) : $$1;
   }

   public bsk a(dad $$0) {
      if (!this.d().a($$0.q().J())) {
         return bsk.d;
      } else if (!$$0.b()) {
         return bsk.d;
      } else {
         dad $$1 = this.b($$0);
         if ($$1 == null) {
            return bsk.d;
         } else {
            dvv $$2 = this.c($$1);
            if ($$2 == null) {
               return bsk.d;
            } else if (!this.a($$1, $$2)) {
               return bsk.d;
            } else {
               jh $$3 = $$1.a();
               dfm $$4 = $$1.q();
               cou $$5 = $$1.o();
               cwm $$6 = $$1.n();
               dvv $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  a($$4, $$3, $$6);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof arq) {
                     ao.z.a((arq)$$5, $$3, $$6);
                  }
               }

               dqd $$8 = $$7.A();
               $$4.a($$5, $$3, this.a($$7), awo.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(ear.i, $$3, ear.a.a($$5, $$7));
               $$6.a(1, $$5);
               return bsk.a;
            }
         }
      }
   }

   protected awm a(dvv $$0) {
      return $$0.A().e();
   }

   @Nullable
   public dad b(dad $$0) {
      return $$0;
   }

   private static void a(dfm $$0, jh $$1, cwm $$2) {
      dsy $$3 = $$0.c_($$1);
      if ($$3 != null) {
         $$3.a($$2);
         $$3.e();
      }
   }

   protected boolean a(jh $$0, dfm $$1, @Nullable cou $$2, cwm $$3, dvv $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dvv c(dad $$0) {
      dvv $$1 = this.d().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dvv a(jh $$0, dfm $$1, cwm $$2, dvv $$3) {
      cyo $$4 = $$2.a(ku.am, cyo.a);
      if ($$4.a()) {
         return $$3;
      } else {
         dvv $$5 = $$4.a($$3);
         if ($$5 != $$3) {
            $$1.a($$0, $$5, 2);
         }

         return $$5;
      }
   }

   protected boolean b(dad $$0, dvv $$1) {
      cou $$2 = $$0.o();
      fad $$3 = $$2 == null ? fad.a() : fad.a($$2);
      return (!this.c() || $$1.a((dfp)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean c() {
      return true;
   }

   protected boolean a(dad $$0, dvv $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(dfm $$0, @Nullable cou $$1, jh $$2, cwm $$3) {
      MinecraftServer $$4 = $$0.p();
      if ($$4 == null) {
         return false;
      } else {
         cyv $$5 = $$3.a(ku.Y, cyv.a);
         if (!$$5.b()) {
            dsy $$6 = $$0.c_($$2);
            if ($$6 != null) {
               if ($$0.C || !$$6.p() || $$1 != null && $$1.gE()) {
                  return $$5.a($$6, $$0.J_());
               }

               return false;
            }
         }

         return false;
      }
   }

   @Override
   public void a(cwm $$0, cwi.b $$1, List<xj> $$2, cye $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d().a($$0, $$1, $$2, $$3);
   }

   public diq d() {
      return this.a;
   }

   public void a(Map<diq, cwi> $$0, cwi $$1) {
      $$0.put(this.d(), $$1);
   }

   @Override
   public boolean e() {
      return !(this.d() instanceof dpp);
   }

   @Override
   public void a(clc $$0) {
      cze $$1 = $$0.j().b(ku.al, cze.a);
      if ($$1 != null) {
         cwp.a($$0, $$1.e());
      }
   }

   public static void a(cwm $$0, dta<?> $$1, ul $$2) {
      $$2.r("id");
      if ($$2.g()) {
         $$0.c(ku.Y);
      } else {
         dsy.a($$2, $$1);
         $$0.b(ku.Y, cyv.a($$2));
      }
   }

   @Override
   public crq i() {
      return this.d().i();
   }
}
