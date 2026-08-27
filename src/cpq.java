import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class cpq extends crn {
   @Deprecated
   private final dch a;

   public cpq(dch $$0, crn.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bof a(cuz $$0) {
      bof $$1 = this.a(new cux($$0));
      if (!$$1.a() && this.y()) {
         bof $$2 = this.a($$0.q(), $$0.o(), $$0.p()).a();
         return $$2 == bof.b ? bof.c : $$2;
      } else {
         return $$1;
      }
   }

   public bof a(cux $$0) {
      if (!this.d().a($$0.q().J())) {
         return bof.e;
      } else if (!$$0.b()) {
         return bof.e;
      } else {
         cux $$1 = this.b($$0);
         if ($$1 == null) {
            return bof.e;
         } else {
            dpi $$2 = this.c($$1);
            if ($$2 == null) {
               return bof.e;
            } else if (!this.a($$1, $$2)) {
               return bof.e;
            } else {
               id $$3 = $$1.a();
               czg $$4 = $$1.q();
               cka $$5 = $$1.o();
               crs $$6 = $$1.n();
               dpi $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  a($$4, $$3, $$6);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof apv) {
                     am.z.a((apv)$$5, $$3, $$6);
                  }
               }

               djt $$8 = $$7.w();
               $$4.a($$5, $$3, this.a($$7), aup.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(dub.i, $$3, dub.a.a($$5, $$7));
               $$6.a(1, $$5);
               return bof.a($$4.B);
            }
         }
      }
   }

   protected aun a(dpi $$0) {
      return $$0.w().e();
   }

   @Nullable
   public cux b(cux $$0) {
      return $$0;
   }

   private static void a(czg $$0, id $$1, crs $$2) {
      dmo $$3 = $$0.c_($$1);
      if ($$3 != null) {
         $$3.a($$2.a());
      }
   }

   protected boolean a(id $$0, czg $$1, @Nullable cka $$2, crs $$3, dpi $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dpi c(cux $$0) {
      dpi $$1 = this.d().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dpi a(id $$0, czg $$1, crs $$2, dpi $$3) {
      ctz $$4 = $$2.a(jr.R, ctz.a);
      if ($$4.a()) {
         return $$3;
      } else {
         dpi $$5 = $$4.a($$3);
         if ($$5 != $$3) {
            $$1.a($$0, $$5, 2);
         }

         return $$5;
      }
   }

   protected boolean b(cux $$0, dpi $$1) {
      cka $$2 = $$0.o();
      eso $$3 = $$2 == null ? eso.a() : eso.a($$2);
      return (!this.c() || $$1.a((czj)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean c() {
      return true;
   }

   protected boolean a(cux $$0, dpi $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(czg $$0, @Nullable cka $$1, id $$2, crs $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 == null) {
         return false;
      } else {
         cuc $$5 = $$3.a(jr.F, cuc.a);
         if (!$$5.b()) {
            dmo $$6 = $$0.c_($$2);
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
   public void a(crs $$0, @Nullable czg $$1, List<wi> $$2, cti $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d().a($$0, $$1, $$2, $$3, $$1 != null ? $$1.H_() : null);
   }

   public dch d() {
      return this.a;
   }

   public void a(Map<dch, crn> $$0, crn $$1) {
      $$0.put(this.d(), $$1);
   }

   @Override
   public boolean am_() {
      return !(this.a instanceof djf);
   }

   @Override
   public void a(cgk $$0) {
      cuj $$1 = $$0.p().b(jr.Q, cuj.a);
      if ($$1 != null) {
         cru.a($$0, $$1.b());
      }
   }

   public static void a(crs $$0, dmq<?> $$1, to $$2) {
      $$2.r("id");
      if ($$2.g()) {
         $$0.c(jr.F);
      } else {
         dmo.a($$2, $$1);
         $$0.b(jr.F, cuc.a($$2));
      }
   }

   @Override
   public cmn m() {
      return this.d().m();
   }
}
