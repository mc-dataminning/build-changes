import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class csi extends cuf {
   @Deprecated
   private final deu a;

   public csi(deu $$0, cuf.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bqp a(cxx $$0) {
      bqp $$1 = this.a(new cxv($$0));
      if (!$$1.a() && $$0.n().b(km.u)) {
         bqp $$2 = super.a($$0.q(), $$0.o(), $$0.p()).a();
         return $$2 == bqp.c ? bqp.d : $$2;
      } else {
         return $$1;
      }
   }

   public bqp a(cxv $$0) {
      if (!this.d().a($$0.q().J())) {
         return bqp.f;
      } else if (!$$0.b()) {
         return bqp.f;
      } else {
         cxv $$1 = this.b($$0);
         if ($$1 == null) {
            return bqp.f;
         } else {
            drx $$2 = this.c($$1);
            if ($$2 == null) {
               return bqp.f;
            } else if (!this.a($$1, $$2)) {
               return bqp.f;
            } else {
               iz $$3 = $$1.a();
               dbt $$4 = $$1.q();
               cms $$5 = $$1.o();
               cuk $$6 = $$1.n();
               drx $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  a($$4, $$3, $$6);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof arc) {
                     am.z.a((arc)$$5, $$3, $$6);
                  }
               }

               dmh $$8 = $$7.w();
               $$4.a($$5, $$3, this.a($$7), avx.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(dwq.i, $$3, dwq.a.a($$5, $$7));
               $$6.a(1, $$5);
               return bqp.a($$4.B);
            }
         }
      }
   }

   protected avv a(drx $$0) {
      return $$0.w().e();
   }

   @Nullable
   public cxv b(cxv $$0) {
      return $$0;
   }

   private static void a(dbt $$0, iz $$1, cuk $$2) {
      dpc $$3 = $$0.c_($$1);
      if ($$3 != null) {
         $$3.a($$2);
         $$3.e();
      }
   }

   protected boolean a(iz $$0, dbt $$1, @Nullable cms $$2, cuk $$3, drx $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected drx c(cxv $$0) {
      drx $$1 = this.d().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private drx a(iz $$0, dbt $$1, cuk $$2, drx $$3) {
      cwv $$4 = $$2.a(km.aa, cwv.a);
      if ($$4.a()) {
         return $$3;
      } else {
         drx $$5 = $$4.a($$3);
         if ($$5 != $$3) {
            $$1.a($$0, $$5, 2);
         }

         return $$5;
      }
   }

   protected boolean b(cxv $$0, drx $$1) {
      cms $$2 = $$0.o();
      evr $$3 = $$2 == null ? evr.a() : evr.a($$2);
      return (!this.c() || $$1.a((dbw)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean c() {
      return true;
   }

   protected boolean a(cxv $$0, drx $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(dbt $$0, @Nullable cms $$1, iz $$2, cuk $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 == null) {
         return false;
      } else {
         cwz $$5 = $$3.a(km.N, cwz.a);
         if (!$$5.b()) {
            dpc $$6 = $$0.c_($$2);
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
   public void a(cuk $$0, cuf.b $$1, List<xl> $$2, cwd $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d().a($$0, $$1, $$2, $$3);
   }

   public deu d() {
      return this.a;
   }

   public void a(Map<deu, cuf> $$0, cuf $$1) {
      $$0.put(this.d(), $$1);
   }

   @Override
   public boolean an_() {
      return !(this.d() instanceof dlt);
   }

   @Override
   public void a(cjc $$0) {
      cxg $$1 = $$0.p().b(km.Z, cxg.a);
      if ($$1 != null) {
         cum.a($$0, $$1.e());
      }
   }

   public static void a(cuk $$0, dpe<?> $$1, ur $$2) {
      $$2.r("id");
      if ($$2.g()) {
         $$0.c(km.N);
      } else {
         dpc.a($$2, $$1);
         $$0.b(km.N, cwz.a($$2));
      }
   }

   @Override
   public cpg i() {
      return this.d().i();
   }
}
