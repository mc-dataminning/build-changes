import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class cry extends ctv {
   @Deprecated
   private final dff a;

   public cry(dff $$0, ctv.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bqd a(cxm $$0) {
      bqd $$1 = this.a(new cxk($$0));
      if (!$$1.a() && $$0.n().b(kn.v)) {
         bqd $$2 = super.a($$0.q(), $$0.o(), $$0.p()).a();
         return $$2 == bqd.c ? bqd.d : $$2;
      } else {
         return $$1;
      }
   }

   public bqd a(cxk $$0) {
      if (!this.d().a($$0.q().J())) {
         return bqd.f;
      } else if (!$$0.b()) {
         return bqd.f;
      } else {
         cxk $$1 = this.b($$0);
         if ($$1 == null) {
            return bqd.f;
         } else {
            dsh $$2 = this.c($$1);
            if ($$2 == null) {
               return bqd.f;
            } else if (!this.a($$1, $$2)) {
               return bqd.f;
            } else {
               ja $$3 = $$1.a();
               dcd $$4 = $$1.q();
               cmh $$5 = $$1.o();
               cua $$6 = $$1.n();
               dsh $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  a($$4, $$3, $$6);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof aql) {
                     am.z.a((aql)$$5, $$3, $$6);
                  }
               }

               dms $$8 = $$7.w();
               $$4.a($$5, $$3, this.a($$7), avg.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(dxa.i, $$3, dxa.a.a($$5, $$7));
               $$6.a(1, $$5);
               return bqd.a($$4.B);
            }
         }
      }
   }

   protected ave a(dsh $$0) {
      return $$0.w().e();
   }

   @Nullable
   public cxk b(cxk $$0) {
      return $$0;
   }

   private static void a(dcd $$0, ja $$1, cua $$2) {
      dpn $$3 = $$0.c_($$1);
      if ($$3 != null) {
         $$3.a($$2);
         $$3.e();
      }
   }

   protected boolean a(ja $$0, dcd $$1, @Nullable cmh $$2, cua $$3, dsh $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dsh c(cxk $$0) {
      dsh $$1 = this.d().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dsh a(ja $$0, dcd $$1, cua $$2, dsh $$3) {
      cwk $$4 = $$2.a(kn.ab, cwk.a);
      if ($$4.a()) {
         return $$3;
      } else {
         dsh $$5 = $$4.a($$3);
         if ($$5 != $$3) {
            $$1.a($$0, $$5, 2);
         }

         return $$5;
      }
   }

   protected boolean b(cxk $$0, dsh $$1) {
      cmh $$2 = $$0.o();
      ewe $$3 = $$2 == null ? ewe.a() : ewe.a($$2);
      return (!this.c() || $$1.a((dcg)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean c() {
      return true;
   }

   protected boolean a(cxk $$0, dsh $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(dcd $$0, @Nullable cmh $$1, ja $$2, cua $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 == null) {
         return false;
      } else {
         cwo $$5 = $$3.a(kn.O, cwo.a);
         if (!$$5.b()) {
            dpn $$6 = $$0.c_($$2);
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
   public void a(cua $$0, ctv.b $$1, List<wu> $$2, cvt $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d().a($$0, $$1, $$2, $$3);
   }

   public dff d() {
      return this.a;
   }

   public void a(Map<dff, ctv> $$0, ctv $$1) {
      $$0.put(this.d(), $$1);
   }

   @Override
   public boolean an_() {
      return !(this.d() instanceof dme);
   }

   @Override
   public void a(cir $$0) {
      cwv $$1 = $$0.p().b(kn.aa, cwv.a);
      if ($$1 != null) {
         cuc.a($$0, $$1.e());
      }
   }

   public static void a(cua $$0, dpp<?> $$1, tx $$2) {
      $$2.r("id");
      if ($$2.g()) {
         $$0.c(kn.O);
      } else {
         dpn.a($$2, $$1);
         $$0.b(kn.O, cwo.a($$2));
      }
   }

   @Override
   public cov i() {
      return this.d().i();
   }
}
