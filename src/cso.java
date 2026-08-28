import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class cso extends cul {
   @Deprecated
   private final dfy a;

   public cso(dfy $$0, cul.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bqr a(cyf $$0) {
      bqr $$1 = this.a(new cyd($$0));
      if (!$$1.a() && $$0.n().b(kq.v)) {
         bqr $$2 = super.a($$0.q(), $$0.o(), $$0.p()).a();
         return $$2 == bqr.c ? bqr.d : $$2;
      } else {
         return $$1;
      }
   }

   public bqr a(cyd $$0) {
      if (!this.d().a($$0.q().J())) {
         return bqr.f;
      } else if (!$$0.b()) {
         return bqr.f;
      } else {
         cyd $$1 = this.b($$0);
         if ($$1 == null) {
            return bqr.f;
         } else {
            dtc $$2 = this.c($$1);
            if ($$2 == null) {
               return bqr.f;
            } else if (!this.a($$1, $$2)) {
               return bqr.f;
            } else {
               jd $$3 = $$1.a();
               dcw $$4 = $$1.q();
               cmx $$5 = $$1.o();
               cuq $$6 = $$1.n();
               dtc $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  a($$4, $$3, $$6);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof aqv) {
                     an.z.a((aqv)$$5, $$3, $$6);
                  }
               }

               dnm $$8 = $$7.w();
               $$4.a($$5, $$3, this.a($$7), avq.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(dxz.i, $$3, dxz.a.a($$5, $$7));
               $$6.a(1, $$5);
               return bqr.a($$4.B);
            }
         }
      }
   }

   protected avo a(dtc $$0) {
      return $$0.w().e();
   }

   @Nullable
   public cyd b(cyd $$0) {
      return $$0;
   }

   private static void a(dcw $$0, jd $$1, cuq $$2) {
      dqh $$3 = $$0.c_($$1);
      if ($$3 != null) {
         $$3.a($$2);
         $$3.e();
      }
   }

   protected boolean a(jd $$0, dcw $$1, @Nullable cmx $$2, cuq $$3, dtc $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dtc c(cyd $$0) {
      dtc $$1 = this.d().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dtc a(jd $$0, dcw $$1, cuq $$2, dtc $$3) {
      cxd $$4 = $$2.a(kq.ac, cxd.a);
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
      cmx $$2 = $$0.o();
      exh $$3 = $$2 == null ? exh.a() : exh.a($$2);
      return (!this.c() || $$1.a((dcz)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean c() {
      return true;
   }

   protected boolean a(cyd $$0, dtc $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(dcw $$0, @Nullable cmx $$1, jd $$2, cuq $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 == null) {
         return false;
      } else {
         cxh $$5 = $$3.a(kq.O, cxh.a);
         if (!$$5.b()) {
            dqh $$6 = $$0.c_($$2);
            if ($$6 != null) {
               if ($$0.B || !$$6.q() || $$1 != null && $$1.gv()) {
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
   public void a(cuq $$0, cul.b $$1, List<wz> $$2, cwm $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d().a($$0, $$1, $$2, $$3);
   }

   public dfy d() {
      return this.a;
   }

   public void a(Map<dfy, cul> $$0, cul $$1) {
      $$0.put(this.d(), $$1);
   }

   @Override
   public boolean ar_() {
      return !(this.d() instanceof dmy);
   }

   @Override
   public void a(cjh $$0) {
      cxo $$1 = $$0.p().b(kq.ab, cxo.a);
      if ($$1 != null) {
         cus.a($$0, $$1.e());
      }
   }

   public static void a(cuq $$0, dqj<?> $$1, ub $$2) {
      $$2.r("id");
      if ($$2.g()) {
         $$0.c(kq.O);
      } else {
         dqh.a($$2, $$1);
         $$0.b(kq.O, cxh.a($$2));
      }
   }

   @Override
   public cpl i() {
      return this.d().i();
   }
}
