import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class cvu extends cxk {
   @Deprecated
   private final dkl a;

   public cvu(dkl $$0, cxk.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bti a(dbh $$0) {
      bti $$1 = this.a(new dbf($$0));
      return !$$1.a() && $$0.n().b(ku.x) ? super.a($$0.q(), $$0.o(), $$0.p()) : $$1;
   }

   public bti a(dbf $$0) {
      if (!this.d().a($$0.q().J())) {
         return bti.d;
      } else if (!$$0.b()) {
         return bti.d;
      } else {
         dbf $$1 = this.b($$0);
         if ($$1 == null) {
            return bti.d;
         } else {
            dxu $$2 = this.c($$1);
            if ($$2 == null) {
               return bti.d;
            } else if (!this.a($$1, $$2)) {
               return bti.d;
            } else {
               jh $$3 = $$1.a();
               dhh $$4 = $$1.q();
               cpw $$5 = $$1.o();
               cxo $$6 = $$1.n();
               dxu $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  a($$4, $$3, $$6);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof asi) {
                     ao.z.a((asi)$$5, $$3, $$6);
                  }
               }

               dsb $$8 = $$7.A();
               $$4.a($$5, $$3, this.a($$7), axg.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(ecq.i, $$3, ecq.a.a($$5, $$7));
               $$6.a(1, $$5);
               return bti.a;
            }
         }
      }
   }

   protected axe a(dxu $$0) {
      return $$0.A().e();
   }

   @Nullable
   public dbf b(dbf $$0) {
      return $$0;
   }

   private static void a(dhh $$0, jh $$1, cxo $$2) {
      duw $$3 = $$0.c_($$1);
      if ($$3 != null) {
         $$3.a($$2);
         $$3.e();
      }
   }

   protected boolean a(jh $$0, dhh $$1, @Nullable cpw $$2, cxo $$3, dxu $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dxu c(dbf $$0) {
      dxu $$1 = this.d().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dxu a(jh $$0, dhh $$1, cxo $$2, dxu $$3) {
      czq $$4 = $$2.a(ku.am, czq.a);
      if ($$4.a()) {
         return $$3;
      } else {
         dxu $$5 = $$4.a($$3);
         if ($$5 != $$3) {
            $$1.a($$0, $$5, 2);
         }

         return $$5;
      }
   }

   protected boolean b(dbf $$0, dxu $$1) {
      cpw $$2 = $$0.o();
      fcc $$3 = $$2 == null ? fcc.a() : fcc.a($$2);
      return (!this.c() || $$1.a((dhk)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean c() {
      return true;
   }

   protected boolean a(dbf $$0, dxu $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(dhh $$0, @Nullable cpw $$1, jh $$2, cxo $$3) {
      MinecraftServer $$4 = $$0.p();
      if ($$4 == null) {
         return false;
      } else {
         czx $$5 = $$3.a(ku.Y, czx.a);
         if (!$$5.b()) {
            duw $$6 = $$0.c_($$2);
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
   public void a(cxo $$0, cxk.b $$1, List<xv> $$2, czg $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d().a($$0, $$1, $$2, $$3);
   }

   public dkl d() {
      return this.a;
   }

   public void a(Map<dkl, cxk> $$0, cxk $$1) {
      $$0.put(this.d(), $$1);
   }

   @Override
   public boolean e() {
      return !(this.d() instanceof drn);
   }

   @Override
   public void a(cma $$0) {
      dag $$1 = $$0.l().b(ku.al, dag.a);
      if ($$1 != null) {
         cxr.a($$0, $$1.e());
      }
   }

   public static void a(cxo $$0, duy<?> $$1, ux $$2) {
      $$2.r("id");
      if ($$2.g()) {
         $$0.c(ku.Y);
      } else {
         duw.a($$2, $$1);
         $$0.b(ku.Y, czx.a($$2));
      }
   }

   @Override
   public css i() {
      return this.d().i();
   }
}
