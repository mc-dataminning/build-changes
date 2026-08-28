import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class csp extends cum {
   @Deprecated
   private final dfb a;

   public csp(dfb $$0, cum.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bqw a(cye $$0) {
      bqw $$1 = this.a(new cyc($$0));
      if (!$$1.a() && $$0.n().b(km.v)) {
         bqw $$2 = super.a($$0.q(), $$0.o(), $$0.p()).a();
         return $$2 == bqw.c ? bqw.d : $$2;
      } else {
         return $$1;
      }
   }

   public bqw a(cyc $$0) {
      if (!this.d().a($$0.q().J())) {
         return bqw.f;
      } else if (!$$0.b()) {
         return bqw.f;
      } else {
         cyc $$1 = this.b($$0);
         if ($$1 == null) {
            return bqw.f;
         } else {
            dse $$2 = this.c($$1);
            if ($$2 == null) {
               return bqw.f;
            } else if (!this.a($$1, $$2)) {
               return bqw.f;
            } else {
               iz $$3 = $$1.a();
               dca $$4 = $$1.q();
               cmz $$5 = $$1.o();
               cur $$6 = $$1.n();
               dse $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  a($$4, $$3, $$6);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof arg) {
                     am.z.a((arg)$$5, $$3, $$6);
                  }
               }

               dmo $$8 = $$7.w();
               $$4.a($$5, $$3, this.a($$7), awb.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(dwx.i, $$3, dwx.a.a($$5, $$7));
               $$6.a(1, $$5);
               return bqw.a($$4.B);
            }
         }
      }
   }

   protected avz a(dse $$0) {
      return $$0.w().e();
   }

   @Nullable
   public cyc b(cyc $$0) {
      return $$0;
   }

   private static void a(dca $$0, iz $$1, cur $$2) {
      dpj $$3 = $$0.c_($$1);
      if ($$3 != null) {
         $$3.a($$2);
         $$3.e();
      }
   }

   protected boolean a(iz $$0, dca $$1, @Nullable cmz $$2, cur $$3, dse $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dse c(cyc $$0) {
      dse $$1 = this.d().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dse a(iz $$0, dca $$1, cur $$2, dse $$3) {
      cxc $$4 = $$2.a(km.ab, cxc.a);
      if ($$4.a()) {
         return $$3;
      } else {
         dse $$5 = $$4.a($$3);
         if ($$5 != $$3) {
            $$1.a($$0, $$5, 2);
         }

         return $$5;
      }
   }

   protected boolean b(cyc $$0, dse $$1) {
      cmz $$2 = $$0.o();
      evy $$3 = $$2 == null ? evy.a() : evy.a($$2);
      return (!this.c() || $$1.a((dcd)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean c() {
      return true;
   }

   protected boolean a(cyc $$0, dse $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(dca $$0, @Nullable cmz $$1, iz $$2, cur $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 == null) {
         return false;
      } else {
         cxg $$5 = $$3.a(km.O, cxg.a);
         if (!$$5.b()) {
            dpj $$6 = $$0.c_($$2);
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
   public void a(cur $$0, cum.b $$1, List<xp> $$2, cwk $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d().a($$0, $$1, $$2, $$3);
   }

   public dfb d() {
      return this.a;
   }

   public void a(Map<dfb, cum> $$0, cum $$1) {
      $$0.put(this.d(), $$1);
   }

   @Override
   public boolean am_() {
      return !(this.d() instanceof dma);
   }

   @Override
   public void a(cjj $$0) {
      cxn $$1 = $$0.p().b(km.aa, cxn.a);
      if ($$1 != null) {
         cut.a($$0, $$1.e());
      }
   }

   public static void a(cur $$0, dpl<?> $$1, us $$2) {
      $$2.r("id");
      if ($$2.g()) {
         $$0.c(km.O);
      } else {
         dpj.a($$2, $$1);
         $$0.b(km.O, cxg.a($$2));
      }
   }

   @Override
   public cpn i() {
      return this.d().i();
   }
}
