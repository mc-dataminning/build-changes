import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class cvv extends cxl {
   @Deprecated
   private final dkm a;

   public cvv(dkm $$0, cxl.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public btj a(dbi $$0) {
      btj $$1 = this.a(new dbg($$0));
      return !$$1.a() && $$0.n().b(ku.x) ? super.a($$0.q(), $$0.o(), $$0.p()) : $$1;
   }

   public btj a(dbg $$0) {
      if (!this.d().a($$0.q().J())) {
         return btj.d;
      } else if (!$$0.b()) {
         return btj.d;
      } else {
         dbg $$1 = this.b($$0);
         if ($$1 == null) {
            return btj.d;
         } else {
            dxv $$2 = this.c($$1);
            if ($$2 == null) {
               return btj.d;
            } else if (!this.a($$1, $$2)) {
               return btj.d;
            } else {
               jh $$3 = $$1.a();
               dhi $$4 = $$1.q();
               cpx $$5 = $$1.o();
               cxp $$6 = $$1.n();
               dxv $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  a($$4, $$3, $$6);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof asi) {
                     ao.z.a((asi)$$5, $$3, $$6);
                  }
               }

               dsc $$8 = $$7.A();
               $$4.a($$5, $$3, this.a($$7), axg.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(ecr.i, $$3, ecr.a.a($$5, $$7));
               $$6.a(1, $$5);
               return btj.a;
            }
         }
      }
   }

   protected axe a(dxv $$0) {
      return $$0.A().e();
   }

   @Nullable
   public dbg b(dbg $$0) {
      return $$0;
   }

   private static void a(dhi $$0, jh $$1, cxp $$2) {
      dux $$3 = $$0.c_($$1);
      if ($$3 != null) {
         $$3.a($$2);
         $$3.e();
      }
   }

   protected boolean a(jh $$0, dhi $$1, @Nullable cpx $$2, cxp $$3, dxv $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dxv c(dbg $$0) {
      dxv $$1 = this.d().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dxv a(jh $$0, dhi $$1, cxp $$2, dxv $$3) {
      czr $$4 = $$2.a(ku.am, czr.a);
      if ($$4.a()) {
         return $$3;
      } else {
         dxv $$5 = $$4.a($$3);
         if ($$5 != $$3) {
            $$1.a($$0, $$5, 2);
         }

         return $$5;
      }
   }

   protected boolean b(dbg $$0, dxv $$1) {
      cpx $$2 = $$0.o();
      fcd $$3 = $$2 == null ? fcd.a() : fcd.a($$2);
      return (!this.c() || $$1.a((dhl)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean c() {
      return true;
   }

   protected boolean a(dbg $$0, dxv $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(dhi $$0, @Nullable cpx $$1, jh $$2, cxp $$3) {
      MinecraftServer $$4 = $$0.p();
      if ($$4 == null) {
         return false;
      } else {
         czy $$5 = $$3.a(ku.Y, czy.a);
         if (!$$5.b()) {
            dux $$6 = $$0.c_($$2);
            if ($$6 != null) {
               if ($$0.C || !$$6.p() || $$1 != null && $$1.gG()) {
                  return $$5.a($$6, $$0.K_());
               }

               return false;
            }
         }

         return false;
      }
   }

   @Override
   public void a(cxp $$0, cxl.b $$1, List<xv> $$2, czh $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d().a($$0, $$1, $$2, $$3);
   }

   public dkm d() {
      return this.a;
   }

   public void a(Map<dkm, cxl> $$0, cxl $$1) {
      $$0.put(this.d(), $$1);
   }

   @Override
   public boolean e() {
      return !(this.d() instanceof dro);
   }

   @Override
   public void a(cmb $$0) {
      dah $$1 = $$0.l().b(ku.al, dah.a);
      if ($$1 != null) {
         cxs.a($$0, $$1.e());
      }
   }

   public static void a(cxp $$0, duz<?> $$1, ux $$2) {
      $$2.r("id");
      if ($$2.g()) {
         $$0.c(ku.Y);
      } else {
         dux.a($$2, $$1);
         $$0.b(ku.Y, czy.a($$2));
      }
   }

   @Override
   public cst i() {
      return this.d().i();
   }
}
