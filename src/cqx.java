import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class cqx extends csu {
   @Deprecated
   private final dde a;

   public cqx(dde $$0, csu.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bpm a(cwk $$0) {
      bpm $$1 = this.a(new cwi($$0));
      if (!$$1.a() && $$0.n().b(ka.t)) {
         bpm $$2 = this.a($$0.q(), $$0.o(), $$0.p()).a();
         return $$2 == bpm.b ? bpm.c : $$2;
      } else {
         return $$1;
      }
   }

   public bpm a(cwi $$0) {
      if (!this.d().a($$0.q().J())) {
         return bpm.e;
      } else if (!$$0.b()) {
         return bpm.e;
      } else {
         cwi $$1 = this.b($$0);
         if ($$1 == null) {
            return bpm.e;
         } else {
            dqh $$2 = this.c($$1);
            if ($$2 == null) {
               return bpm.e;
            } else if (!this.a($$1, $$2)) {
               return bpm.e;
            } else {
               in $$3 = $$1.a();
               dad $$4 = $$1.q();
               clh $$5 = $$1.o();
               csz $$6 = $$1.n();
               dqh $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  a($$4, $$3, $$6);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof aqi) {
                     am.z.a((aqi)$$5, $$3, $$6);
                  }
               }

               dkr $$8 = $$7.w();
               $$4.a($$5, $$3, this.a($$7), avd.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(dva.i, $$3, dva.a.a($$5, $$7));
               $$6.a(1, $$5);
               return bpm.a($$4.B);
            }
         }
      }
   }

   protected avb a(dqh $$0) {
      return $$0.w().e();
   }

   @Nullable
   public cwi b(cwi $$0) {
      return $$0;
   }

   private static void a(dad $$0, in $$1, csz $$2) {
      dnm $$3 = $$0.c_($$1);
      if ($$3 != null) {
         $$3.a($$2.a());
      }
   }

   protected boolean a(in $$0, dad $$1, @Nullable clh $$2, csz $$3, dqh $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dqh c(cwi $$0) {
      dqh $$1 = this.d().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dqh a(in $$0, dad $$1, csz $$2, dqh $$3) {
      cvi $$4 = $$2.a(ka.Y, cvi.a);
      if ($$4.a()) {
         return $$3;
      } else {
         dqh $$5 = $$4.a($$3);
         if ($$5 != $$3) {
            $$1.a($$0, $$5, 2);
         }

         return $$5;
      }
   }

   protected boolean b(cwi $$0, dqh $$1) {
      clh $$2 = $$0.o();
      etu $$3 = $$2 == null ? etu.a() : etu.a($$2);
      return (!this.c() || $$1.a((dag)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean c() {
      return true;
   }

   protected boolean a(cwi $$0, dqh $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(dad $$0, @Nullable clh $$1, in $$2, csz $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 == null) {
         return false;
      } else {
         cvm $$5 = $$3.a(ka.M, cvm.a);
         if (!$$5.b()) {
            dnm $$6 = $$0.c_($$2);
            if ($$6 != null) {
               if ($$0.B || !$$6.q() || $$1 != null && $$1.gx()) {
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
   public void a(csz $$0, @Nullable dad $$1, List<wu> $$2, cuq $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d().a($$0, $$1, $$2, $$3, $$1 != null ? $$1.H_() : null);
   }

   public dde d() {
      return this.a;
   }

   public void a(Map<dde, csu> $$0, csu $$1) {
      $$0.put(this.d(), $$1);
   }

   @Override
   public boolean am_() {
      return !(this.d() instanceof dkd);
   }

   @Override
   public void a(chr $$0) {
      cvt $$1 = $$0.p().b(ka.X, cvt.a);
      if ($$1 != null) {
         ctb.a($$0, $$1.b());
      }
   }

   public static void a(csz $$0, dno<?> $$1, ua $$2) {
      $$2.r("id");
      if ($$2.g()) {
         $$0.c(ka.M);
      } else {
         dnm.a($$2, $$1);
         $$0.b(ka.M, cvm.a($$2));
      }
   }

   @Override
   public cnu m() {
      return this.d().m();
   }
}
