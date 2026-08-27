import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ciu extends ckw {
   public static final String a = "BlockEntityTag";
   public static final String b = "BlockStateTag";
   @Deprecated
   private final cut c;

   public ciu(cut $$0, ckw.a $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public biq a(cnl $$0) {
      biq $$1 = this.a(new cnj($$0));
      if (!$$1.a() && this.u()) {
         biq $$2 = this.a($$0.q(), $$0.o(), $$0.p()).a();
         return $$2 == biq.b ? biq.c : $$2;
      } else {
         return $$1;
      }
   }

   public biq a(cnj $$0) {
      if (!this.e().a($$0.q().G())) {
         return biq.e;
      } else if (!$$0.b()) {
         return biq.e;
      } else {
         cnj $$1 = this.b($$0);
         if ($$1 == null) {
            return biq.e;
         } else {
            dgw $$2 = this.c($$1);
            if ($$2 == null) {
               return biq.e;
            } else if (!this.a($$1, $$2)) {
               return biq.e;
            } else {
               ht $$3 = $$1.a();
               crs $$4 = $$1.q();
               cdm $$5 = $$1.o();
               clb $$6 = $$1.n();
               dgw $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof amb) {
                     al.y.a((amb)$$5, $$3, $$6);
                  }
               }

               dcf $$8 = $$7.w();
               $$4.a($$5, $$3, this.a($$7), aqo.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(dlg.i, $$3, dlg.a.a($$5, $$7));
               if ($$5 == null || !$$5.fT().d) {
                  $$6.h(1);
               }

               return biq.a($$4.B);
            }
         }
      }
   }

   protected aqm a(dgw $$0) {
      return $$0.w().e();
   }

   @Nullable
   public cnj b(cnj $$0) {
      return $$0;
   }

   protected boolean a(ht $$0, crs $$1, @Nullable cdm $$2, clb $$3, dgw $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dgw c(cnj $$0) {
      dgw $$1 = this.e().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dgw a(ht $$0, crs $$1, clb $$2, dgw $$3) {
      dgw $$4 = $$3;
      rz $$5 = $$2.v();
      if ($$5 != null) {
         rz $$6 = $$5.p("BlockStateTag");
         dgx<cut, dgw> $$7 = $$3.b().n();

         for (String $$8 : $$6.e()) {
            dhz<?> $$9 = $$7.a($$8);
            if ($$9 != null) {
               String $$10 = $$6.c($$8).s_();
               $$4 = a($$4, $$9, $$10);
            }
         }
      }

      if ($$4 != $$3) {
         $$1.a($$0, $$4, 2);
      }

      return $$4;
   }

   private static <T extends Comparable<T>> dgw a(dgw $$0, dhz<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.a($$1, $$2x)).orElse($$0);
   }

   protected boolean b(cnj $$0, dgw $$1) {
      cdm $$2 = $$0.o();
      ejn $$3 = $$2 == null ? ejn.a() : ejn.a($$2);
      return (!this.d() || $$1.a((crv)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean d() {
      return true;
   }

   protected boolean a(cnj $$0, dgw $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(crs $$0, @Nullable cdm $$1, ht $$2, clb $$3) {
      MinecraftServer $$4 = $$0.n();
      if ($$4 == null) {
         return false;
      } else {
         rz $$5 = a($$3);
         if ($$5 != null) {
            der $$6 = $$0.c_($$2);
            if ($$6 != null) {
               if (!$$0.B && $$6.t() && ($$1 == null || !$$1.gp())) {
                  return false;
               }

               rz $$7 = $$6.o();
               rz $$8 = $$7.h();
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
   public void a(clb $$0, @Nullable crs $$1, List<ur> $$2, cms $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.e().a($$0, $$1, $$2, $$3);
   }

   public cut e() {
      return this.c;
   }

   public void a(Map<cut, ckw> $$0, ckw $$1) {
      $$0.put(this.e(), $$1);
   }

   @Override
   public boolean ao_() {
      return !(this.c instanceof dbr);
   }

   @Override
   public void a(caf $$0) {
      if (this.c instanceof dbr) {
         clb $$1 = $$0.q();
         rz $$2 = a($$1);
         if ($$2 != null && $$2.b("Items", 9)) {
            sf $$3 = $$2.c("Items", 10);
            cld.a($$0, $$3.stream().map(rz.class::cast).map(clb::a));
         }
      }
   }

   @Nullable
   public static rz a(clb $$0) {
      return $$0.b("BlockEntityTag");
   }

   public static void a(clb $$0, det<?> $$1, rz $$2) {
      if ($$2.g()) {
         $$0.c("BlockEntityTag");
      } else {
         der.a($$2, $$1);
         $$0.a("BlockEntityTag", $$2);
      }
   }

   @Override
   public cfv m() {
      return this.e().m();
   }
}
