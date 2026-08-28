import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ctr extends cvk {
   @Deprecated
   private final dhj a;

   public ctr(dhj $$0, cvk.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public brp a(czm $$0) {
      brp $$1 = this.a(new czk($$0));
      return !$$1.a() && $$0.n().b(kr.w) ? super.a($$0.q(), $$0.o(), $$0.p()) : $$1;
   }

   public brp a(czk $$0) {
      if (!this.d().a($$0.q().J())) {
         return brp.d;
      } else if (!$$0.b()) {
         return brp.d;
      } else {
         czk $$1 = this.b($$0);
         if ($$1 == null) {
            return brp.d;
         } else {
            duo $$2 = this.c($$1);
            if ($$2 == null) {
               return brp.d;
            } else if (!this.a($$1, $$2)) {
               return brp.d;
            } else {
               je $$3 = $$1.a();
               deg $$4 = $$1.q();
               cnu $$5 = $$1.o();
               cvp $$6 = $$1.n();
               duo $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  a($$4, $$3, $$6);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof ari) {
                     an.z.a((ari)$$5, $$3, $$6);
                  }
               }

               dox $$8 = $$7.A();
               $$4.a($$5, $$3, this.a($$7), awf.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(dzl.i, $$3, dzl.a.a($$5, $$7));
               $$6.a(1, $$5);
               return brp.b;
            }
         }
      }
   }

   protected awd a(duo $$0) {
      return $$0.A().e();
   }

   @Nullable
   public czk b(czk $$0) {
      return $$0;
   }

   private static void a(deg $$0, je $$1, cvp $$2) {
      drs $$3 = $$0.c_($$1);
      if ($$3 != null) {
         $$3.a($$2);
         $$3.e();
      }
   }

   protected boolean a(je $$0, deg $$1, @Nullable cnu $$2, cvp $$3, duo $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected duo c(czk $$0) {
      duo $$1 = this.d().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private duo a(je $$0, deg $$1, cvp $$2, duo $$3) {
      cxx $$4 = $$2.a(kr.ah, cxx.a);
      if ($$4.a()) {
         return $$3;
      } else {
         duo $$5 = $$4.a($$3);
         if ($$5 != $$3) {
            $$1.a($$0, $$5, 2);
         }

         return $$5;
      }
   }

   protected boolean b(czk $$0, duo $$1) {
      cnu $$2 = $$0.o();
      eyx $$3 = $$2 == null ? eyx.a() : eyx.a($$2);
      return (!this.c() || $$1.a((dej)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean c() {
      return true;
   }

   protected boolean a(czk $$0, duo $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(deg $$0, @Nullable cnu $$1, je $$2, cvp $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 == null) {
         return false;
      } else {
         cye $$5 = $$3.a(kr.T, cye.a);
         if (!$$5.b()) {
            drs $$6 = $$0.c_($$2);
            if ($$6 != null) {
               if ($$0.B || !$$6.p() || $$1 != null && $$1.gz()) {
                  return $$5.a($$6, $$0.F_());
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
   public void a(cvp $$0, cvk.b $$1, List<xd> $$2, cxh $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d().a($$0, $$1, $$2, $$3);
   }

   public dhj d() {
      return this.a;
   }

   public void a(Map<dhj, cvk> $$0, cvk $$1) {
      $$0.put(this.d(), $$1);
   }

   @Override
   public boolean ao_() {
      return !(this.d() instanceof doj);
   }

   @Override
   public void a(cke $$0) {
      cyl $$1 = $$0.m().b(kr.ag, cyl.a);
      if ($$1 != null) {
         cvs.a($$0, $$1.e());
      }
   }

   public static void a(cvp $$0, dru<?> $$1, uf $$2) {
      $$2.r("id");
      if ($$2.g()) {
         $$0.c(kr.T);
      } else {
         drs.a($$2, $$1);
         $$0.b(kr.T, cye.a($$2));
      }
   }

   @Override
   public cqn i() {
      return this.d().i();
   }
}
