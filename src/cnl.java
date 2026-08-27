import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class cnl extends cpl {
   public static final String a = "BlockEntityTag";
   public static final String b = "BlockStateTag";
   @Deprecated
   private final czf c;

   public cnl(czf $$0, cpl.a $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public bml a(crz $$0) {
      bml $$1 = this.a(new crx($$0));
      if (!$$1.a() && this.v()) {
         bml $$2 = this.a($$0.q(), $$0.o(), $$0.p()).a();
         return $$2 == bml.b ? bml.c : $$2;
      } else {
         return $$1;
      }
   }

   public bml a(crx $$0) {
      if (!this.d().a($$0.q().I())) {
         return bml.e;
      } else if (!$$0.b()) {
         return bml.e;
      } else {
         crx $$1 = this.b($$0);
         if ($$1 == null) {
            return bml.e;
         } else {
            dme $$2 = this.c($$1);
            if ($$2 == null) {
               return bml.e;
            } else if (!this.a($$1, $$2)) {
               return bml.e;
            } else {
               ib $$3 = $$1.a();
               cwe $$4 = $$1.q();
               cia $$5 = $$1.o();
               cpq $$6 = $$1.n();
               dme $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof apb) {
                     am.z.a((apb)$$5, $$3, $$6);
                  }
               }

               dgr $$8 = $$7.w();
               $$4.a($$5, $$3, this.a($$7), atq.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(dqr.i, $$3, dqr.a.a($$5, $$7));
               if ($$5 == null || !$$5.fW().d) {
                  $$6.h(1);
               }

               return bml.a($$4.B);
            }
         }
      }
   }

   protected ato a(dme $$0) {
      return $$0.w().e();
   }

   @Nullable
   public crx b(crx $$0) {
      return $$0;
   }

   protected boolean a(ib $$0, cwe $$1, @Nullable cia $$2, cpq $$3, dme $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dme c(crx $$0) {
      dme $$1 = this.d().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dme a(ib $$0, cwe $$1, cpq $$2, dme $$3) {
      dme $$4 = $$3;
      sy $$5 = $$2.w();
      if ($$5 != null) {
         sy $$6 = $$5.p("BlockStateTag");
         dmf<czf, dme> $$7 = $$3.b().n();

         for (String $$8 : $$6.e()) {
            dnh<?> $$9 = $$7.a($$8);
            if ($$9 != null) {
               String $$10 = $$6.c($$8).t_();
               $$4 = a($$4, $$9, $$10);
            }
         }
      }

      if ($$4 != $$3) {
         $$1.a($$0, $$4, 2);
      }

      return $$4;
   }

   private static <T extends Comparable<T>> dme a(dme $$0, dnh<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.a($$1, $$2x)).orElse($$0);
   }

   protected boolean b(crx $$0, dme $$1) {
      cia $$2 = $$0.o();
      epa $$3 = $$2 == null ? epa.a() : epa.a($$2);
      return (!this.c() || $$1.a((cwh)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean c() {
      return true;
   }

   protected boolean a(crx $$0, dme $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(cwe $$0, @Nullable cia $$1, ib $$2, cpq $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 == null) {
         return false;
      } else {
         sy $$5 = a($$3);
         if ($$5 != null) {
            djl $$6 = $$0.c_($$2);
            if ($$6 != null) {
               if (!$$0.B && $$6.q() && ($$1 == null || !$$1.gs())) {
                  return false;
               }

               sy $$7 = $$6.d($$0.I_());
               sy $$8 = $$7.h();
               $$7.a($$5);
               if (!$$7.equals($$8)) {
                  $$6.a($$7, $$0.I_());
                  $$6.e();
                  return true;
               }
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
   public void a(cpq $$0, @Nullable cwe $$1, List<vs> $$2, crh $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d().a($$0, $$1, $$2, $$3, $$1 != null ? $$1.I_() : null);
   }

   public czf d() {
      return this.c;
   }

   public void a(Map<czf, cpl> $$0, cpl $$1) {
      $$0.put(this.d(), $$1);
   }

   @Override
   public boolean aq_() {
      return !(this.c instanceof dgd);
   }

   @Override
   public void a(cel $$0) {
      if (this.c instanceof dgd) {
         cpq $$1 = $$0.q();
         sy $$2 = a($$1);
         if ($$2 != null && $$2.b("Items", 9)) {
            te $$3 = $$2.c("Items", 10);
            cps.a($$0, $$3.stream().map(sy.class::cast).map(cpq::a));
         }
      }
   }

   @Nullable
   public static sy a(cpq $$0) {
      return $$0.c("BlockEntityTag");
   }

   public static void a(cpq $$0, djn<?> $$1, sy $$2) {
      if ($$2.g()) {
         $$0.d("BlockEntityTag");
      } else {
         djl.a($$2, $$1);
         $$0.a("BlockEntityTag", $$2);
      }
   }

   @Override
   public ckl m() {
      return this.d().m();
   }
}
