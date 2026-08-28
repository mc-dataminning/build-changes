import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class csc extends cty {
   @Deprecated
   private final dfi a;

   public csc(dfi $$0, cty.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bqh a(cxp $$0) {
      bqh $$1 = this.a(new cxn($$0));
      if (!$$1.a() && $$0.n().b(kn.v)) {
         bqh $$2 = super.a($$0.q(), $$0.o(), $$0.p()).a();
         return $$2 == bqh.c ? bqh.d : $$2;
      } else {
         return $$1;
      }
   }

   public bqh a(cxn $$0) {
      if (!this.d().a($$0.q().J())) {
         return bqh.f;
      } else if (!$$0.b()) {
         return bqh.f;
      } else {
         cxn $$1 = this.b($$0);
         if ($$1 == null) {
            return bqh.f;
         } else {
            dsl $$2 = this.c($$1);
            if ($$2 == null) {
               return bqh.f;
            } else if (!this.a($$1, $$2)) {
               return bqh.f;
            } else {
               ja $$3 = $$1.a();
               dcg $$4 = $$1.q();
               cml $$5 = $$1.o();
               cud $$6 = $$1.n();
               dsl $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  a($$4, $$3, $$6);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof aqn) {
                     am.z.a((aqn)$$5, $$3, $$6);
                  }
               }

               dmv $$8 = $$7.w();
               $$4.a($$5, $$3, this.a($$7), avi.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(dxh.i, $$3, dxh.a.a($$5, $$7));
               $$6.a(1, $$5);
               return bqh.a($$4.B);
            }
         }
      }
   }

   protected avg a(dsl $$0) {
      return $$0.w().e();
   }

   @Nullable
   public cxn b(cxn $$0) {
      return $$0;
   }

   private static void a(dcg $$0, ja $$1, cud $$2) {
      dpq $$3 = $$0.c_($$1);
      if ($$3 != null) {
         $$3.a($$2);
         $$3.e();
      }
   }

   protected boolean a(ja $$0, dcg $$1, @Nullable cml $$2, cud $$3, dsl $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dsl c(cxn $$0) {
      dsl $$1 = this.d().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dsl a(ja $$0, dcg $$1, cud $$2, dsl $$3) {
      cwn $$4 = $$2.a(kn.ab, cwn.a);
      if ($$4.a()) {
         return $$3;
      } else {
         dsl $$5 = $$4.a($$3);
         if ($$5 != $$3) {
            $$1.a($$0, $$5, 2);
         }

         return $$5;
      }
   }

   protected boolean b(cxn $$0, dsl $$1) {
      cml $$2 = $$0.o();
      ewm $$3 = $$2 == null ? ewm.a() : ewm.a($$2);
      return (!this.c() || $$1.a((dcj)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean c() {
      return true;
   }

   protected boolean a(cxn $$0, dsl $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(dcg $$0, @Nullable cml $$1, ja $$2, cud $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 == null) {
         return false;
      } else {
         cwr $$5 = $$3.a(kn.O, cwr.a);
         if (!$$5.b()) {
            dpq $$6 = $$0.c_($$2);
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
   public void a(cud $$0, cty.b $$1, List<wu> $$2, cvw $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d().a($$0, $$1, $$2, $$3);
   }

   public dfi d() {
      return this.a;
   }

   public void a(Map<dfi, cty> $$0, cty $$1) {
      $$0.put(this.d(), $$1);
   }

   @Override
   public boolean an_() {
      return !(this.d() instanceof dmh);
   }

   @Override
   public void a(civ $$0) {
      cwy $$1 = $$0.p().b(kn.aa, cwy.a);
      if ($$1 != null) {
         cuf.a($$0, $$1.e());
      }
   }

   public static void a(cud $$0, dps<?> $$1, tx $$2) {
      $$2.r("id");
      if ($$2.g()) {
         $$0.c(kn.O);
      } else {
         dpq.a($$2, $$1);
         $$0.b(kn.O, cwr.a($$2));
      }
   }

   @Override
   public coz i() {
      return this.d().i();
   }
}
