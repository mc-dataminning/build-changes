import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class cso extends cul {
   @Deprecated
   private final dfa a;

   public cso(dfa $$0, cul.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bqv a(cyd $$0) {
      bqv $$1 = this.a(new cyb($$0));
      if (!$$1.a() && $$0.n().b(km.v)) {
         bqv $$2 = super.a($$0.q(), $$0.o(), $$0.p()).a();
         return $$2 == bqv.c ? bqv.d : $$2;
      } else {
         return $$1;
      }
   }

   public bqv a(cyb $$0) {
      if (!this.d().a($$0.q().J())) {
         return bqv.f;
      } else if (!$$0.b()) {
         return bqv.f;
      } else {
         cyb $$1 = this.b($$0);
         if ($$1 == null) {
            return bqv.f;
         } else {
            dsd $$2 = this.c($$1);
            if ($$2 == null) {
               return bqv.f;
            } else if (!this.a($$1, $$2)) {
               return bqv.f;
            } else {
               iz $$3 = $$1.a();
               dbz $$4 = $$1.q();
               cmy $$5 = $$1.o();
               cuq $$6 = $$1.n();
               dsd $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  a($$4, $$3, $$6);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof arg) {
                     am.z.a((arg)$$5, $$3, $$6);
                  }
               }

               dmn $$8 = $$7.w();
               $$4.a($$5, $$3, this.a($$7), awb.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(dww.i, $$3, dww.a.a($$5, $$7));
               $$6.a(1, $$5);
               return bqv.a($$4.B);
            }
         }
      }
   }

   protected avz a(dsd $$0) {
      return $$0.w().e();
   }

   @Nullable
   public cyb b(cyb $$0) {
      return $$0;
   }

   private static void a(dbz $$0, iz $$1, cuq $$2) {
      dpi $$3 = $$0.c_($$1);
      if ($$3 != null) {
         $$3.a($$2);
         $$3.e();
      }
   }

   protected boolean a(iz $$0, dbz $$1, @Nullable cmy $$2, cuq $$3, dsd $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dsd c(cyb $$0) {
      dsd $$1 = this.d().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dsd a(iz $$0, dbz $$1, cuq $$2, dsd $$3) {
      cxb $$4 = $$2.a(km.ab, cxb.a);
      if ($$4.a()) {
         return $$3;
      } else {
         dsd $$5 = $$4.a($$3);
         if ($$5 != $$3) {
            $$1.a($$0, $$5, 2);
         }

         return $$5;
      }
   }

   protected boolean b(cyb $$0, dsd $$1) {
      cmy $$2 = $$0.o();
      evx $$3 = $$2 == null ? evx.a() : evx.a($$2);
      return (!this.c() || $$1.a((dcc)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean c() {
      return true;
   }

   protected boolean a(cyb $$0, dsd $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(dbz $$0, @Nullable cmy $$1, iz $$2, cuq $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 == null) {
         return false;
      } else {
         cxf $$5 = $$3.a(km.O, cxf.a);
         if (!$$5.b()) {
            dpi $$6 = $$0.c_($$2);
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
   public void a(cuq $$0, cul.b $$1, List<xp> $$2, cwj $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d().a($$0, $$1, $$2, $$3);
   }

   public dfa d() {
      return this.a;
   }

   public void a(Map<dfa, cul> $$0, cul $$1) {
      $$0.put(this.d(), $$1);
   }

   @Override
   public boolean am_() {
      return !(this.d() instanceof dlz);
   }

   @Override
   public void a(cji $$0) {
      cxm $$1 = $$0.p().b(km.aa, cxm.a);
      if ($$1 != null) {
         cus.a($$0, $$1.e());
      }
   }

   public static void a(cuq $$0, dpk<?> $$1, us $$2) {
      $$2.r("id");
      if ($$2.g()) {
         $$0.c(km.O);
      } else {
         dpi.a($$2, $$1);
         $$0.b(km.O, cxf.a($$2));
      }
   }

   @Override
   public cpm i() {
      return this.d().i();
   }
}
