import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class cjh extends clj {
   public static final String a = "BlockEntityTag";
   public static final String b = "BlockStateTag";
   @Deprecated
   private final cvf c;

   public cjh(cvf $$0, clj.a $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public bjb a(cny $$0) {
      bjb $$1 = this.a(new cnw($$0));
      if (!$$1.a() && this.u()) {
         bjb $$2 = this.a($$0.q(), $$0.o(), $$0.p()).a();
         return $$2 == bjb.b ? bjb.c : $$2;
      } else {
         return $$1;
      }
   }

   public bjb a(cnw $$0) {
      if (!this.e().a($$0.q().H())) {
         return bjb.e;
      } else if (!$$0.b()) {
         return bjb.e;
      } else {
         cnw $$1 = this.b($$0);
         if ($$1 == null) {
            return bjb.e;
         } else {
            dhn $$2 = this.c($$1);
            if ($$2 == null) {
               return bjb.e;
            } else if (!this.a($$1, $$2)) {
               return bjb.e;
            } else {
               hx $$3 = $$1.a();
               csf $$4 = $$1.q();
               cdz $$5 = $$1.o();
               clo $$6 = $$1.n();
               dhn $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof amj) {
                     al.y.a((amj)$$5, $$3, $$6);
                  }
               }

               dcr $$8 = $$7.w();
               $$4.a($$5, $$3, this.a($$7), aqw.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(dlx.i, $$3, dlx.a.a($$5, $$7));
               if ($$5 == null || !$$5.fU().d) {
                  $$6.h(1);
               }

               return bjb.a($$4.B);
            }
         }
      }
   }

   protected aqu a(dhn $$0) {
      return $$0.w().e();
   }

   @Nullable
   public cnw b(cnw $$0) {
      return $$0;
   }

   protected boolean a(hx $$0, csf $$1, @Nullable cdz $$2, clo $$3, dhn $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dhn c(cnw $$0) {
      dhn $$1 = this.e().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dhn a(hx $$0, csf $$1, clo $$2, dhn $$3) {
      dhn $$4 = $$3;
      sd $$5 = $$2.v();
      if ($$5 != null) {
         sd $$6 = $$5.p("BlockStateTag");
         dho<cvf, dhn> $$7 = $$3.b().n();

         for (String $$8 : $$6.e()) {
            diq<?> $$9 = $$7.a($$8);
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

   private static <T extends Comparable<T>> dhn a(dhn $$0, diq<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.a($$1, $$2x)).orElse($$0);
   }

   protected boolean b(cnw $$0, dhn $$1) {
      cdz $$2 = $$0.o();
      eke $$3 = $$2 == null ? eke.a() : eke.a($$2);
      return (!this.d() || $$1.a((csi)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean d() {
      return true;
   }

   protected boolean a(cnw $$0, dhn $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(csf $$0, @Nullable cdz $$1, hx $$2, clo $$3) {
      MinecraftServer $$4 = $$0.n();
      if ($$4 == null) {
         return false;
      } else {
         sd $$5 = a($$3);
         if ($$5 != null) {
            dfi $$6 = $$0.c_($$2);
            if ($$6 != null) {
               if (!$$0.B && $$6.u() && ($$1 == null || !$$1.gq())) {
                  return false;
               }

               sd $$7 = $$6.q();
               sd $$8 = $$7.h();
               $$7.a($$5);
               if (!$$7.equals($$8)) {
                  $$6.a($$7);
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
      return this.e().h();
   }

   @Override
   public void a(clo $$0, @Nullable csf $$1, List<uv> $$2, cnf $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.e().a($$0, $$1, $$2, $$3);
   }

   public cvf e() {
      return this.c;
   }

   public void a(Map<cvf, clj> $$0, clj $$1) {
      $$0.put(this.e(), $$1);
   }

   @Override
   public boolean aq_() {
      return !(this.c instanceof dcd);
   }

   @Override
   public void a(cas $$0) {
      if (this.c instanceof dcd) {
         clo $$1 = $$0.q();
         sd $$2 = a($$1);
         if ($$2 != null && $$2.b("Items", 9)) {
            sj $$3 = $$2.c("Items", 10);
            clq.a($$0, $$3.stream().map(sd.class::cast).map(clo::a));
         }
      }
   }

   @Nullable
   public static sd a(clo $$0) {
      return $$0.b("BlockEntityTag");
   }

   public static void a(clo $$0, dfk<?> $$1, sd $$2) {
      if ($$2.g()) {
         $$0.c("BlockEntityTag");
      } else {
         dfi.a($$2, $$1);
         $$0.a("BlockEntityTag", $$2);
      }
   }

   @Override
   public cgi m() {
      return this.e().m();
   }
}
