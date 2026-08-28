import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class csb extends ctx {
   @Deprecated
   private final dfh a;

   public csb(dfh $$0, ctx.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bqg a(cxo $$0) {
      bqg $$1 = this.a(new cxm($$0));
      if (!$$1.a() && $$0.n().b(kn.v)) {
         bqg $$2 = super.a($$0.q(), $$0.o(), $$0.p()).a();
         return $$2 == bqg.c ? bqg.d : $$2;
      } else {
         return $$1;
      }
   }

   public bqg a(cxm $$0) {
      if (!this.d().a($$0.q().J())) {
         return bqg.f;
      } else if (!$$0.b()) {
         return bqg.f;
      } else {
         cxm $$1 = this.b($$0);
         if ($$1 == null) {
            return bqg.f;
         } else {
            dsk $$2 = this.c($$1);
            if ($$2 == null) {
               return bqg.f;
            } else if (!this.a($$1, $$2)) {
               return bqg.f;
            } else {
               ja $$3 = $$1.a();
               dcf $$4 = $$1.q();
               cmk $$5 = $$1.o();
               cuc $$6 = $$1.n();
               dsk $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  a($$4, $$3, $$6);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof aqn) {
                     am.z.a((aqn)$$5, $$3, $$6);
                  }
               }

               dmu $$8 = $$7.w();
               $$4.a($$5, $$3, this.a($$7), avi.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(dxg.i, $$3, dxg.a.a($$5, $$7));
               $$6.a(1, $$5);
               return bqg.a($$4.B);
            }
         }
      }
   }

   protected avg a(dsk $$0) {
      return $$0.w().e();
   }

   @Nullable
   public cxm b(cxm $$0) {
      return $$0;
   }

   private static void a(dcf $$0, ja $$1, cuc $$2) {
      dpp $$3 = $$0.c_($$1);
      if ($$3 != null) {
         $$3.a($$2);
         $$3.e();
      }
   }

   protected boolean a(ja $$0, dcf $$1, @Nullable cmk $$2, cuc $$3, dsk $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dsk c(cxm $$0) {
      dsk $$1 = this.d().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dsk a(ja $$0, dcf $$1, cuc $$2, dsk $$3) {
      cwm $$4 = $$2.a(kn.ab, cwm.a);
      if ($$4.a()) {
         return $$3;
      } else {
         dsk $$5 = $$4.a($$3);
         if ($$5 != $$3) {
            $$1.a($$0, $$5, 2);
         }

         return $$5;
      }
   }

   protected boolean b(cxm $$0, dsk $$1) {
      cmk $$2 = $$0.o();
      ewk $$3 = $$2 == null ? ewk.a() : ewk.a($$2);
      return (!this.c() || $$1.a((dci)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean c() {
      return true;
   }

   protected boolean a(cxm $$0, dsk $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(dcf $$0, @Nullable cmk $$1, ja $$2, cuc $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 == null) {
         return false;
      } else {
         cwq $$5 = $$3.a(kn.O, cwq.a);
         if (!$$5.b()) {
            dpp $$6 = $$0.c_($$2);
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
   public void a(cuc $$0, ctx.b $$1, List<wu> $$2, cvv $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d().a($$0, $$1, $$2, $$3);
   }

   public dfh d() {
      return this.a;
   }

   public void a(Map<dfh, ctx> $$0, ctx $$1) {
      $$0.put(this.d(), $$1);
   }

   @Override
   public boolean an_() {
      return !(this.d() instanceof dmg);
   }

   @Override
   public void a(ciu $$0) {
      cwx $$1 = $$0.p().b(kn.aa, cwx.a);
      if ($$1 != null) {
         cue.a($$0, $$1.e());
      }
   }

   public static void a(cuc $$0, dpr<?> $$1, tx $$2) {
      $$2.r("id");
      if ($$2.g()) {
         $$0.c(kn.O);
      } else {
         dpp.a($$2, $$1);
         $$0.b(kn.O, cwq.a($$2));
      }
   }

   @Override
   public coy i() {
      return this.d().i();
   }
}
