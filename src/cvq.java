import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class cvq extends cxg {
   @Deprecated
   private final dke a;

   public cvq(dke $$0, cxg.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bte a(dbd $$0) {
      bte $$1 = this.a(new dbb($$0));
      return !$$1.a() && $$0.n().b(ku.x) ? super.a($$0.q(), $$0.o(), $$0.p()) : $$1;
   }

   public bte a(dbb $$0) {
      if (!this.d().a($$0.q().J())) {
         return bte.d;
      } else if (!$$0.b()) {
         return bte.d;
      } else {
         dbb $$1 = this.b($$0);
         if ($$1 == null) {
            return bte.d;
         } else {
            dxn $$2 = this.c($$1);
            if ($$2 == null) {
               return bte.d;
            } else if (!this.a($$1, $$2)) {
               return bte.d;
            } else {
               jh $$3 = $$1.a();
               dha $$4 = $$1.q();
               cps $$5 = $$1.o();
               cxk $$6 = $$1.n();
               dxn $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  a($$4, $$3, $$6);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof asi) {
                     ao.z.a((asi)$$5, $$3, $$6);
                  }
               }

               dru $$8 = $$7.A();
               $$4.a($$5, $$3, this.a($$7), axg.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(ecj.i, $$3, ecj.a.a($$5, $$7));
               $$6.a(1, $$5);
               return bte.a;
            }
         }
      }
   }

   protected axe a(dxn $$0) {
      return $$0.A().e();
   }

   @Nullable
   public dbb b(dbb $$0) {
      return $$0;
   }

   private static void a(dha $$0, jh $$1, cxk $$2) {
      dup $$3 = $$0.c_($$1);
      if ($$3 != null) {
         $$3.a($$2);
         $$3.e();
      }
   }

   protected boolean a(jh $$0, dha $$1, @Nullable cps $$2, cxk $$3, dxn $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dxn c(dbb $$0) {
      dxn $$1 = this.d().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dxn a(jh $$0, dha $$1, cxk $$2, dxn $$3) {
      czm $$4 = $$2.a(ku.am, czm.a);
      if ($$4.a()) {
         return $$3;
      } else {
         dxn $$5 = $$4.a($$3);
         if ($$5 != $$3) {
            $$1.a($$0, $$5, 2);
         }

         return $$5;
      }
   }

   protected boolean b(dbb $$0, dxn $$1) {
      cps $$2 = $$0.o();
      fbx $$3 = $$2 == null ? fbx.a() : fbx.a($$2);
      return (!this.c() || $$1.a((dhd)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean c() {
      return true;
   }

   protected boolean a(dbb $$0, dxn $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(dha $$0, @Nullable cps $$1, jh $$2, cxk $$3) {
      MinecraftServer $$4 = $$0.p();
      if ($$4 == null) {
         return false;
      } else {
         czt $$5 = $$3.a(ku.Y, czt.a);
         if (!$$5.b()) {
            dup $$6 = $$0.c_($$2);
            if ($$6 != null) {
               if ($$0.C || !$$6.p() || $$1 != null && $$1.gE()) {
                  return $$5.a($$6, $$0.K_());
               }

               return false;
            }
         }

         return false;
      }
   }

   @Override
   public void a(cxk $$0, cxg.b $$1, List<xv> $$2, czc $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d().a($$0, $$1, $$2, $$3);
   }

   public dke d() {
      return this.a;
   }

   public void a(Map<dke, cxg> $$0, cxg $$1) {
      $$0.put(this.d(), $$1);
   }

   @Override
   public boolean e() {
      return !(this.d() instanceof drg);
   }

   @Override
   public void a(clw $$0) {
      dac $$1 = $$0.l().b(ku.al, dac.a);
      if ($$1 != null) {
         cxn.a($$0, $$1.e());
      }
   }

   public static void a(cxk $$0, dur<?> $$1, ux $$2) {
      $$2.r("id");
      if ($$2.g()) {
         $$0.c(ku.Y);
      } else {
         dup.a($$2, $$1);
         $$0.b(ku.Y, czt.a($$2));
      }
   }

   @Override
   public cso i() {
      return this.d().i();
   }
}
