import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class cjc extends cle {
   public static final String a = "BlockEntityTag";
   public static final String b = "BlockStateTag";
   @Deprecated
   private final cva c;

   public cjc(cva $$0, cle.a $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public bix a(cnt $$0) {
      bix $$1 = this.a(new cnr($$0));
      if (!$$1.a() && this.u()) {
         bix $$2 = this.a($$0.q(), $$0.o(), $$0.p()).a();
         return $$2 == bix.b ? bix.c : $$2;
      } else {
         return $$1;
      }
   }

   public bix a(cnr $$0) {
      if (!this.e().a($$0.q().H())) {
         return bix.e;
      } else if (!$$0.b()) {
         return bix.e;
      } else {
         cnr $$1 = this.b($$0);
         if ($$1 == null) {
            return bix.e;
         } else {
            dhi $$2 = this.c($$1);
            if ($$2 == null) {
               return bix.e;
            } else if (!this.a($$1, $$2)) {
               return bix.e;
            } else {
               ht $$3 = $$1.a();
               csa $$4 = $$1.q();
               cdu $$5 = $$1.o();
               clj $$6 = $$1.n();
               dhi $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof amf) {
                     al.y.a((amf)$$5, $$3, $$6);
                  }
               }

               dcm $$8 = $$7.w();
               $$4.a($$5, $$3, this.a($$7), aqs.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(dls.i, $$3, dls.a.a($$5, $$7));
               if ($$5 == null || !$$5.fU().d) {
                  $$6.h(1);
               }

               return bix.a($$4.B);
            }
         }
      }
   }

   protected aqq a(dhi $$0) {
      return $$0.w().e();
   }

   @Nullable
   public cnr b(cnr $$0) {
      return $$0;
   }

   protected boolean a(ht $$0, csa $$1, @Nullable cdu $$2, clj $$3, dhi $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dhi c(cnr $$0) {
      dhi $$1 = this.e().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dhi a(ht $$0, csa $$1, clj $$2, dhi $$3) {
      dhi $$4 = $$3;
      rz $$5 = $$2.v();
      if ($$5 != null) {
         rz $$6 = $$5.p("BlockStateTag");
         dhj<cva, dhi> $$7 = $$3.b().n();

         for (String $$8 : $$6.e()) {
            dil<?> $$9 = $$7.a($$8);
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

   private static <T extends Comparable<T>> dhi a(dhi $$0, dil<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.a($$1, $$2x)).orElse($$0);
   }

   protected boolean b(cnr $$0, dhi $$1) {
      cdu $$2 = $$0.o();
      ejz $$3 = $$2 == null ? ejz.a() : ejz.a($$2);
      return (!this.d() || $$1.a((csd)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean d() {
      return true;
   }

   protected boolean a(cnr $$0, dhi $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(csa $$0, @Nullable cdu $$1, ht $$2, clj $$3) {
      MinecraftServer $$4 = $$0.n();
      if ($$4 == null) {
         return false;
      } else {
         rz $$5 = a($$3);
         if ($$5 != null) {
            dfd $$6 = $$0.c_($$2);
            if ($$6 != null) {
               if (!$$0.B && $$6.t() && ($$1 == null || !$$1.gq())) {
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
   public void a(clj $$0, @Nullable csa $$1, List<ur> $$2, cna $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.e().a($$0, $$1, $$2, $$3);
   }

   public cva e() {
      return this.c;
   }

   public void a(Map<cva, cle> $$0, cle $$1) {
      $$0.put(this.e(), $$1);
   }

   @Override
   public boolean ao_() {
      return !(this.c instanceof dby);
   }

   @Override
   public void a(can $$0) {
      if (this.c instanceof dby) {
         clj $$1 = $$0.q();
         rz $$2 = a($$1);
         if ($$2 != null && $$2.b("Items", 9)) {
            sf $$3 = $$2.c("Items", 10);
            cll.a($$0, $$3.stream().map(rz.class::cast).map(clj::a));
         }
      }
   }

   @Nullable
   public static rz a(clj $$0) {
      return $$0.b("BlockEntityTag");
   }

   public static void a(clj $$0, dff<?> $$1, rz $$2) {
      if ($$2.g()) {
         $$0.c("BlockEntityTag");
      } else {
         dfd.a($$2, $$1);
         $$0.a("BlockEntityTag", $$2);
      }
   }

   @Override
   public cgd m() {
      return this.e().m();
   }
}
