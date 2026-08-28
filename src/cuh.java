import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class cuh extends cvx {
   @Deprecated
   private final die a;

   public cuh(die $$0, cvx.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bsd a(czu $$0) {
      bsd $$1 = this.a(new czs($$0));
      return !$$1.a() && $$0.n().b(ku.x) ? super.a($$0.q(), $$0.o(), $$0.p()) : $$1;
   }

   public bsd a(czs $$0) {
      if (!this.d().a($$0.q().J())) {
         return bsd.d;
      } else if (!$$0.b()) {
         return bsd.d;
      } else {
         czs $$1 = this.b($$0);
         if ($$1 == null) {
            return bsd.d;
         } else {
            dvj $$2 = this.c($$1);
            if ($$2 == null) {
               return bsd.d;
            } else if (!this.a($$1, $$2)) {
               return bsd.d;
            } else {
               jh $$3 = $$1.a();
               dfb $$4 = $$1.q();
               com $$5 = $$1.o();
               cwb $$6 = $$1.n();
               dvj $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  a($$4, $$3, $$6);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof aro) {
                     ao.z.a((aro)$$5, $$3, $$6);
                  }
               }

               dpr $$8 = $$7.A();
               $$4.a($$5, $$3, this.a($$7), awm.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(eag.i, $$3, eag.a.a($$5, $$7));
               $$6.a(1, $$5);
               return bsd.a;
            }
         }
      }
   }

   protected awk a(dvj $$0) {
      return $$0.A().e();
   }

   @Nullable
   public czs b(czs $$0) {
      return $$0;
   }

   private static void a(dfb $$0, jh $$1, cwb $$2) {
      dsm $$3 = $$0.c_($$1);
      if ($$3 != null) {
         $$3.a($$2);
         $$3.e();
      }
   }

   protected boolean a(jh $$0, dfb $$1, @Nullable com $$2, cwb $$3, dvj $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dvj c(czs $$0) {
      dvj $$1 = this.d().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dvj a(jh $$0, dfb $$1, cwb $$2, dvj $$3) {
      cyd $$4 = $$2.a(ku.am, cyd.a);
      if ($$4.a()) {
         return $$3;
      } else {
         dvj $$5 = $$4.a($$3);
         if ($$5 != $$3) {
            $$1.a($$0, $$5, 2);
         }

         return $$5;
      }
   }

   protected boolean b(czs $$0, dvj $$1) {
      com $$2 = $$0.o();
      ezs $$3 = $$2 == null ? ezs.a() : ezs.a($$2);
      return (!this.c() || $$1.a((dfe)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean c() {
      return true;
   }

   protected boolean a(czs $$0, dvj $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(dfb $$0, @Nullable com $$1, jh $$2, cwb $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 == null) {
         return false;
      } else {
         cyk $$5 = $$3.a(ku.Y, cyk.a);
         if (!$$5.b()) {
            dsm $$6 = $$0.c_($$2);
            if ($$6 != null) {
               if ($$0.C || !$$6.p() || $$1 != null && $$1.gH()) {
                  return $$5.a($$6, $$0.H_());
               }

               return false;
            }
         }

         return false;
      }
   }

   @Override
   public void a(cwb $$0, cvx.b $$1, List<xi> $$2, cxt $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d().a($$0, $$1, $$2, $$3);
   }

   public die d() {
      return this.a;
   }

   public void a(Map<die, cvx> $$0, cvx $$1) {
      $$0.put(this.d(), $$1);
   }

   @Override
   public boolean e() {
      return !(this.d() instanceof dpd);
   }

   @Override
   public void a(ckv $$0) {
      cyt $$1 = $$0.m().b(ku.al, cyt.a);
      if ($$1 != null) {
         cwe.a($$0, $$1.e());
      }
   }

   public static void a(cwb $$0, dso<?> $$1, uk $$2) {
      $$2.r("id");
      if ($$2.g()) {
         $$0.c(ku.Y);
      } else {
         dsm.a($$2, $$1);
         $$0.b(ku.Y, cyk.a($$2));
      }
   }

   @Override
   public crf i() {
      return this.d().i();
   }
}
