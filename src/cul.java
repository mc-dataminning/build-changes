import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class cul extends cwb {
   @Deprecated
   private final dij a;

   public cul(dij $$0, cwb.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bsh a(czy $$0) {
      bsh $$1 = this.a(new czw($$0));
      return !$$1.a() && $$0.n().b(ku.x) ? super.a($$0.q(), $$0.o(), $$0.p()) : $$1;
   }

   public bsh a(czw $$0) {
      if (!this.d().a($$0.q().J())) {
         return bsh.d;
      } else if (!$$0.b()) {
         return bsh.d;
      } else {
         czw $$1 = this.b($$0);
         if ($$1 == null) {
            return bsh.d;
         } else {
            dvo $$2 = this.c($$1);
            if ($$2 == null) {
               return bsh.d;
            } else if (!this.a($$1, $$2)) {
               return bsh.d;
            } else {
               jh $$3 = $$1.a();
               dff $$4 = $$1.q();
               cor $$5 = $$1.o();
               cwf $$6 = $$1.n();
               dvo $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  a($$4, $$3, $$6);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof arr) {
                     ao.z.a((arr)$$5, $$3, $$6);
                  }
               }

               dpw $$8 = $$7.A();
               $$4.a($$5, $$3, this.a($$7), awp.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(eak.i, $$3, eak.a.a($$5, $$7));
               $$6.a(1, $$5);
               return bsh.a;
            }
         }
      }
   }

   protected awn a(dvo $$0) {
      return $$0.A().e();
   }

   @Nullable
   public czw b(czw $$0) {
      return $$0;
   }

   private static void a(dff $$0, jh $$1, cwf $$2) {
      dsr $$3 = $$0.c_($$1);
      if ($$3 != null) {
         $$3.a($$2);
         $$3.e();
      }
   }

   protected boolean a(jh $$0, dff $$1, @Nullable cor $$2, cwf $$3, dvo $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dvo c(czw $$0) {
      dvo $$1 = this.d().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dvo a(jh $$0, dff $$1, cwf $$2, dvo $$3) {
      cyh $$4 = $$2.a(ku.am, cyh.a);
      if ($$4.a()) {
         return $$3;
      } else {
         dvo $$5 = $$4.a($$3);
         if ($$5 != $$3) {
            $$1.a($$0, $$5, 2);
         }

         return $$5;
      }
   }

   protected boolean b(czw $$0, dvo $$1) {
      cor $$2 = $$0.o();
      ezw $$3 = $$2 == null ? ezw.a() : ezw.a($$2);
      return (!this.c() || $$1.a((dfi)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean c() {
      return true;
   }

   protected boolean a(czw $$0, dvo $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(dff $$0, @Nullable cor $$1, jh $$2, cwf $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 == null) {
         return false;
      } else {
         cyo $$5 = $$3.a(ku.Y, cyo.a);
         if (!$$5.b()) {
            dsr $$6 = $$0.c_($$2);
            if ($$6 != null) {
               if ($$0.C || !$$6.p() || $$1 != null && $$1.gJ()) {
                  return $$5.a($$6, $$0.H_());
               }

               return false;
            }
         }

         return false;
      }
   }

   @Override
   public void a(cwf $$0, cwb.b $$1, List<xl> $$2, cxx $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d().a($$0, $$1, $$2, $$3);
   }

   public dij d() {
      return this.a;
   }

   public void a(Map<dij, cwb> $$0, cwb $$1) {
      $$0.put(this.d(), $$1);
   }

   @Override
   public boolean e() {
      return !(this.d() instanceof dpi);
   }

   @Override
   public void a(ckz $$0) {
      cyx $$1 = $$0.m().b(ku.al, cyx.a);
      if ($$1 != null) {
         cwi.a($$0, $$1.e());
      }
   }

   public static void a(cwf $$0, dst<?> $$1, un $$2) {
      $$2.r("id");
      if ($$2.g()) {
         $$0.c(ku.Y);
      } else {
         dsr.a($$2, $$1);
         $$0.b(ku.Y, cyo.a($$2));
      }
   }

   @Override
   public crj i() {
      return this.d().i();
   }
}
