import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class csm extends cuj {
   @Deprecated
   private final dfw a;

   public csm(dfw $$0, cuj.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bqq a(cyd $$0) {
      bqq $$1 = this.a(new cyb($$0));
      if (!$$1.a() && $$0.n().b(kq.v)) {
         bqq $$2 = super.a($$0.q(), $$0.o(), $$0.p()).a();
         return $$2 == bqq.c ? bqq.d : $$2;
      } else {
         return $$1;
      }
   }

   public bqq a(cyb $$0) {
      if (!this.d().a($$0.q().J())) {
         return bqq.f;
      } else if (!$$0.b()) {
         return bqq.f;
      } else {
         cyb $$1 = this.b($$0);
         if ($$1 == null) {
            return bqq.f;
         } else {
            dta $$2 = this.c($$1);
            if ($$2 == null) {
               return bqq.f;
            } else if (!this.a($$1, $$2)) {
               return bqq.f;
            } else {
               jd $$3 = $$1.a();
               dcu $$4 = $$1.q();
               cmv $$5 = $$1.o();
               cuo $$6 = $$1.n();
               dta $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  a($$4, $$3, $$6);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof aqu) {
                     an.z.a((aqu)$$5, $$3, $$6);
                  }
               }

               dnk $$8 = $$7.w();
               $$4.a($$5, $$3, this.a($$7), avp.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(dxw.i, $$3, dxw.a.a($$5, $$7));
               $$6.a(1, $$5);
               return bqq.a($$4.B);
            }
         }
      }
   }

   protected avn a(dta $$0) {
      return $$0.w().e();
   }

   @Nullable
   public cyb b(cyb $$0) {
      return $$0;
   }

   private static void a(dcu $$0, jd $$1, cuo $$2) {
      dqf $$3 = $$0.c_($$1);
      if ($$3 != null) {
         $$3.a($$2);
         $$3.e();
      }
   }

   protected boolean a(jd $$0, dcu $$1, @Nullable cmv $$2, cuo $$3, dta $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dta c(cyb $$0) {
      dta $$1 = this.d().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dta a(jd $$0, dcu $$1, cuo $$2, dta $$3) {
      cxb $$4 = $$2.a(kq.ac, cxb.a);
      if ($$4.a()) {
         return $$3;
      } else {
         dta $$5 = $$4.a($$3);
         if ($$5 != $$3) {
            $$1.a($$0, $$5, 2);
         }

         return $$5;
      }
   }

   protected boolean b(cyb $$0, dta $$1) {
      cmv $$2 = $$0.o();
      exb $$3 = $$2 == null ? exb.a() : exb.a($$2);
      return (!this.c() || $$1.a((dcx)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean c() {
      return true;
   }

   protected boolean a(cyb $$0, dta $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(dcu $$0, @Nullable cmv $$1, jd $$2, cuo $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 == null) {
         return false;
      } else {
         cxf $$5 = $$3.a(kq.O, cxf.a);
         if (!$$5.b()) {
            dqf $$6 = $$0.c_($$2);
            if ($$6 != null) {
               if ($$0.B || !$$6.q() || $$1 != null && $$1.gw()) {
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
   public void a(cuo $$0, cuj.b $$1, List<wy> $$2, cwk $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d().a($$0, $$1, $$2, $$3);
   }

   public dfw d() {
      return this.a;
   }

   public void a(Map<dfw, cuj> $$0, cuj $$1) {
      $$0.put(this.d(), $$1);
   }

   @Override
   public boolean an_() {
      return !(this.d() instanceof dmw);
   }

   @Override
   public void a(cjf $$0) {
      cxm $$1 = $$0.p().b(kq.ab, cxm.a);
      if ($$1 != null) {
         cuq.a($$0, $$1.e());
      }
   }

   public static void a(cuo $$0, dqh<?> $$1, ua $$2) {
      $$2.r("id");
      if ($$2.g()) {
         $$0.c(kq.O);
      } else {
         dqf.a($$2, $$1);
         $$0.b(kq.O, cxf.a($$2));
      }
   }

   @Override
   public cpj i() {
      return this.d().i();
   }
}
