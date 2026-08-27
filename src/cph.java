import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class cph extends cre {
   @Deprecated
   private final dby a;

   public cph(dby $$0, cre.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public boa a(cuq $$0) {
      boa $$1 = this.a(new cuo($$0));
      if (!$$1.a() && this.y()) {
         boa $$2 = this.a($$0.q(), $$0.o(), $$0.p()).a();
         return $$2 == boa.b ? boa.c : $$2;
      } else {
         return $$1;
      }
   }

   public boa a(cuo $$0) {
      if (!this.d().a($$0.q().J())) {
         return boa.e;
      } else if (!$$0.b()) {
         return boa.e;
      } else {
         cuo $$1 = this.b($$0);
         if ($$1 == null) {
            return boa.e;
         } else {
            doz $$2 = this.c($$1);
            if ($$2 == null) {
               return boa.e;
            } else if (!this.a($$1, $$2)) {
               return boa.e;
            } else {
               ib $$3 = $$1.a();
               cyx $$4 = $$1.q();
               cjt $$5 = $$1.o();
               crj $$6 = $$1.n();
               doz $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  a($$4, $$3, $$6);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof apt) {
                     am.z.a((apt)$$5, $$3, $$6);
                  }
               }

               djk $$8 = $$7.w();
               $$4.a($$5, $$3, this.a($$7), aun.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(dts.i, $$3, dts.a.a($$5, $$7));
               $$6.a(1, $$5);
               return boa.a($$4.B);
            }
         }
      }
   }

   protected aul a(doz $$0) {
      return $$0.w().e();
   }

   @Nullable
   public cuo b(cuo $$0) {
      return $$0;
   }

   private static void a(cyx $$0, ib $$1, crj $$2) {
      dmf $$3 = $$0.c_($$1);
      if ($$3 != null) {
         $$3.a($$2.a());
      }
   }

   protected boolean a(ib $$0, cyx $$1, @Nullable cjt $$2, crj $$3, doz $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected doz c(cuo $$0) {
      doz $$1 = this.d().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private doz a(ib $$0, cyx $$1, crj $$2, doz $$3) {
      ctq $$4 = $$2.a(jp.R, ctq.a);
      if ($$4.a()) {
         return $$3;
      } else {
         doz $$5 = $$4.a($$3);
         if ($$5 != $$3) {
            $$1.a($$0, $$5, 2);
         }

         return $$5;
      }
   }

   protected boolean b(cuo $$0, doz $$1) {
      cjt $$2 = $$0.o();
      esf $$3 = $$2 == null ? esf.a() : esf.a($$2);
      return (!this.c() || $$1.a((cza)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean c() {
      return true;
   }

   protected boolean a(cuo $$0, doz $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(cyx $$0, @Nullable cjt $$1, ib $$2, crj $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 == null) {
         return false;
      } else {
         ctt $$5 = $$3.a(jp.F, ctt.a);
         if (!$$5.b()) {
            dmf $$6 = $$0.c_($$2);
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
   public void a(crj $$0, @Nullable cyx $$1, List<wg> $$2, csz $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d().a($$0, $$1, $$2, $$3, $$1 != null ? $$1.H_() : null);
   }

   public dby d() {
      return this.a;
   }

   public void a(Map<dby, cre> $$0, cre $$1) {
      $$0.put(this.d(), $$1);
   }

   @Override
   public boolean an_() {
      return !(this.a instanceof diw);
   }

   @Override
   public void a(cgd $$0) {
      cua $$1 = $$0.p().b(jp.Q, cua.a);
      if ($$1 != null) {
         crl.a($$0, $$1.a());
      }
   }

   public static void a(crj $$0, dmh<?> $$1, Consumer<tm> $$2) {
      ctt.a(jp.F, $$0, $$2x -> {
         $$2.accept($$2x);
         $$2x.r("id");
         if (!$$2x.g()) {
            dmf.a($$2x, $$1);
         }
      });
   }

   public static void a(crj $$0, dmh<?> $$1, tm $$2) {
      $$2.r("id");
      if ($$2.g()) {
         $$0.c(jp.F);
      } else {
         dmf.a($$2, $$1);
         $$0.b(jp.F, ctt.a($$2));
      }
   }

   @Override
   public cmg m() {
      return this.d().m();
   }
}
