import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class csm extends cuj {
   @Deprecated
   private final dey a;

   public csm(dey $$0, cuj.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bqt a(cyb $$0) {
      bqt $$1 = this.a(new cxz($$0));
      if (!$$1.a() && $$0.n().b(km.v)) {
         bqt $$2 = super.a($$0.q(), $$0.o(), $$0.p()).a();
         return $$2 == bqt.c ? bqt.d : $$2;
      } else {
         return $$1;
      }
   }

   public bqt a(cxz $$0) {
      if (!this.d().a($$0.q().J())) {
         return bqt.f;
      } else if (!$$0.b()) {
         return bqt.f;
      } else {
         cxz $$1 = this.b($$0);
         if ($$1 == null) {
            return bqt.f;
         } else {
            dsb $$2 = this.c($$1);
            if ($$2 == null) {
               return bqt.f;
            } else if (!this.a($$1, $$2)) {
               return bqt.f;
            } else {
               iz $$3 = $$1.a();
               dbx $$4 = $$1.q();
               cmw $$5 = $$1.o();
               cuo $$6 = $$1.n();
               dsb $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  a($$4, $$3, $$6);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof arf) {
                     am.z.a((arf)$$5, $$3, $$6);
                  }
               }

               dml $$8 = $$7.w();
               $$4.a($$5, $$3, this.a($$7), awa.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(dwu.i, $$3, dwu.a.a($$5, $$7));
               $$6.a(1, $$5);
               return bqt.a($$4.B);
            }
         }
      }
   }

   protected avy a(dsb $$0) {
      return $$0.w().e();
   }

   @Nullable
   public cxz b(cxz $$0) {
      return $$0;
   }

   private static void a(dbx $$0, iz $$1, cuo $$2) {
      dpg $$3 = $$0.c_($$1);
      if ($$3 != null) {
         $$3.a($$2);
         $$3.e();
      }
   }

   protected boolean a(iz $$0, dbx $$1, @Nullable cmw $$2, cuo $$3, dsb $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dsb c(cxz $$0) {
      dsb $$1 = this.d().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dsb a(iz $$0, dbx $$1, cuo $$2, dsb $$3) {
      cwz $$4 = $$2.a(km.ab, cwz.a);
      if ($$4.a()) {
         return $$3;
      } else {
         dsb $$5 = $$4.a($$3);
         if ($$5 != $$3) {
            $$1.a($$0, $$5, 2);
         }

         return $$5;
      }
   }

   protected boolean b(cxz $$0, dsb $$1) {
      cmw $$2 = $$0.o();
      evv $$3 = $$2 == null ? evv.a() : evv.a($$2);
      return (!this.c() || $$1.a((dca)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean c() {
      return true;
   }

   protected boolean a(cxz $$0, dsb $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(dbx $$0, @Nullable cmw $$1, iz $$2, cuo $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 == null) {
         return false;
      } else {
         cxd $$5 = $$3.a(km.O, cxd.a);
         if (!$$5.b()) {
            dpg $$6 = $$0.c_($$2);
            if ($$6 != null) {
               if ($$0.B || !$$6.q() || $$1 != null && $$1.gz()) {
                  return $$5.a($$6, $$0.H_());
               }

               return false;
            }
         }

         return false;
      }
   }

   @Override
   public String a() {
      return this.d().g();
   }

   @Override
   public void a(cuo $$0, cuj.b $$1, List<xo> $$2, cwh $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d().a($$0, $$1, $$2, $$3);
   }

   public dey d() {
      return this.a;
   }

   public void a(Map<dey, cuj> $$0, cuj $$1) {
      $$0.put(this.d(), $$1);
   }

   @Override
   public boolean am_() {
      return !(this.d() instanceof dlx);
   }

   @Override
   public void a(cjg $$0) {
      cxk $$1 = $$0.p().b(km.aa, cxk.a);
      if ($$1 != null) {
         cuq.a($$0, $$1.e());
      }
   }

   public static void a(cuo $$0, dpi<?> $$1, ur $$2) {
      $$2.r("id");
      if ($$2.g()) {
         $$0.c(km.O);
      } else {
         dpg.a($$2, $$1);
         $$0.b(km.O, cxd.a($$2));
      }
   }

   @Override
   public cpk i() {
      return this.d().i();
   }
}
