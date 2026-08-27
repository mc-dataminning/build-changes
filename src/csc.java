import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class csc extends cuc {
   @Deprecated
   private final dfc a;

   public csc(dfc $$0, cuc.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bqa a(cyf $$0) {
      bqa $$1 = this.a(new cyd($$0));
      if (!$$1.a() && $$0.n().b(ke.t)) {
         bqa $$2 = this.a($$0.q(), $$0.o(), $$0.p()).a();
         return $$2 == bqa.b ? bqa.c : $$2;
      } else {
         return $$1;
      }
   }

   public bqa a(cyd $$0) {
      if (!this.d().a($$0.q().K())) {
         return bqa.e;
      } else if (!$$0.b()) {
         return bqa.e;
      } else {
         cyd $$1 = this.b($$0);
         if ($$1 == null) {
            return bqa.e;
         } else {
            dtc $$2 = this.c($$1);
            if ($$2 == null) {
               return bqa.e;
            } else if (!this.a($$1, $$2)) {
               return bqa.e;
            } else {
               ir $$3 = $$1.a();
               dca $$4 = $$1.q();
               cly $$5 = $$1.o();
               cuh $$6 = $$1.n();
               dtc $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  a($$4, $$3, $$6);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof aqu) {
                     an.z.a((aqu)$$5, $$3, $$6);
                  }
               }

               dnd $$8 = $$7.w();
               $$4.a($$5, $$3, this.a($$7), avq.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(dxv.i, $$3, dxv.a.a($$5, $$7));
               $$6.a(1, $$5);
               return bqa.a($$4.C);
            }
         }
      }
   }

   protected avn a(dtc $$0) {
      return $$0.w().e();
   }

   @Nullable
   public cyd b(cyd $$0) {
      return $$0;
   }

   private static void a(dca $$0, ir $$1, cuh $$2) {
      dqc $$3 = $$0.c_($$1);
      if ($$3 != null) {
         $$3.a($$2.a());
      }
   }

   protected boolean a(ir $$0, dca $$1, @Nullable cly $$2, cuh $$3, dtc $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dtc c(cyd $$0) {
      dtc $$1 = this.d().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dtc a(ir $$0, dca $$1, cuh $$2, dtc $$3) {
      cxb $$4 = $$2.a(ke.aa, cxb.a);
      if ($$4.a()) {
         return $$3;
      } else {
         dtc $$5 = $$4.a($$3);
         if ($$5 != $$3) {
            $$1.a($$0, $$5, 2);
         }

         return $$5;
      }
   }

   protected boolean b(cyd $$0, dtc $$1) {
      cly $$2 = $$0.o();
      ewz $$3 = $$2 == null ? ewz.a() : ewz.a($$2);
      return (!this.c() || $$1.a((dcd)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean c() {
      return true;
   }

   protected boolean a(cyd $$0, dtc $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(dca $$0, @Nullable cly $$1, ir $$2, cuh $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 == null) {
         return false;
      } else {
         cxf $$5 = $$3.a(ke.O, cxf.a);
         if (!$$5.b()) {
            dqc $$6 = $$0.c_($$2);
            if ($$6 != null) {
               if ($$0.C || !$$6.q() || $$1 != null && $$1.gK()) {
                  return $$5.a($$6, $$0.I_());
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
   public void a(cuh $$0, @Nullable dca $$1, List<xe> $$2, cwi $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d().a($$0, $$1, $$2, $$3, $$1 != null ? $$1.I_() : null);
   }

   public dfc d() {
      return this.a;
   }

   public void a(Map<dfc, cuc> $$0, cuc $$1) {
      $$0.put(this.d(), $$1);
   }

   @Override
   public boolean am_() {
      return !(this.d() instanceof dmp);
   }

   @Override
   public void a(cig $$0) {
      cxm $$1 = $$0.p().b(ke.Z, cxm.a);
      if ($$1 != null) {
         cuj.a($$0, $$1.b());
      }
   }

   public static void a(cuh $$0, dqe<?> $$1, uk $$2) {
      $$2.r("id");
      if ($$2.g()) {
         $$0.c(ke.O);
      } else {
         dqc.a($$2, $$1);
         $$0.b(ke.O, cxf.a($$2));
      }
   }

   @Override
   public cop m() {
      return this.d().m();
   }
}
