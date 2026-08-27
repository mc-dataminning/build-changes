import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class che extends cjg {
   public static final String a = "BlockEntityTag";
   public static final String b = "BlockStateTag";
   @Deprecated
   private final ctc c;

   public che(ctc $$0, cjg.a $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public bhe a(clv $$0) {
      bhe $$1 = this.a(new clt($$0));
      if (!$$1.a() && this.u()) {
         bhe $$2 = this.a($$0.q(), $$0.o(), $$0.p()).a();
         return $$2 == bhe.b ? bhe.c : $$2;
      } else {
         return $$1;
      }
   }

   public bhe a(clt $$0) {
      if (!this.e().a($$0.q().G())) {
         return bhe.e;
      } else if (!$$0.b()) {
         return bhe.e;
      } else {
         clt $$1 = this.b($$0);
         if ($$1 == null) {
            return bhe.e;
         } else {
            dfd $$2 = this.c($$1);
            if ($$2 == null) {
               return bhe.e;
            } else if (!this.a($$1, $$2)) {
               return bhe.e;
            } else {
               gw $$3 = $$1.a();
               cqb $$4 = $$1.q();
               cca $$5 = $$1.o();
               cjl $$6 = $$1.n();
               dfd $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof aku) {
                     al.y.a((aku)$$5, $$3, $$6);
                  }
               }

               dan $$8 = $$7.w();
               $$4.a($$5, $$3, this.a($$7), aph.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(djn.i, $$3, djn.a.a($$5, $$7));
               if ($$5 == null || !$$5.fT().d) {
                  $$6.h(1);
               }

               return bhe.a($$4.B);
            }
         }
      }
   }

   protected apf a(dfd $$0) {
      return $$0.w().e();
   }

   @Nullable
   public clt b(clt $$0) {
      return $$0;
   }

   protected boolean a(gw $$0, cqb $$1, @Nullable cca $$2, cjl $$3, dfd $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dfd c(clt $$0) {
      dfd $$1 = this.e().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dfd a(gw $$0, cqb $$1, cjl $$2, dfd $$3) {
      dfd $$4 = $$3;
      qw $$5 = $$2.v();
      if ($$5 != null) {
         qw $$6 = $$5.p("BlockStateTag");
         dfe<ctc, dfd> $$7 = $$3.b().n();

         for (String $$8 : $$6.e()) {
            dgg<?> $$9 = $$7.a($$8);
            if ($$9 != null) {
               String $$10 = $$6.c($$8).r_();
               $$4 = a($$4, $$9, $$10);
            }
         }
      }

      if ($$4 != $$3) {
         $$1.a($$0, $$4, 2);
      }

      return $$4;
   }

   private static <T extends Comparable<T>> dfd a(dfd $$0, dgg<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.a($$1, $$2x)).orElse($$0);
   }

   protected boolean b(clt $$0, dfd $$1) {
      cca $$2 = $$0.o();
      ehm $$3 = $$2 == null ? ehm.a() : ehm.a($$2);
      return (!this.d() || $$1.a((cqe)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean d() {
      return true;
   }

   protected boolean a(clt $$0, dfd $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(cqb $$0, @Nullable cca $$1, gw $$2, cjl $$3) {
      MinecraftServer $$4 = $$0.n();
      if ($$4 == null) {
         return false;
      } else {
         qw $$5 = a($$3);
         if ($$5 != null) {
            dcz $$6 = $$0.c_($$2);
            if ($$6 != null) {
               if (!$$0.B && $$6.t() && ($$1 == null || !$$1.gp())) {
                  return false;
               }

               qw $$7 = $$6.o();
               qw $$8 = $$7.h();
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
   public void a(cjl $$0, @Nullable cqb $$1, List<tl> $$2, clc $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.e().a($$0, $$1, $$2, $$3);
   }

   public ctc e() {
      return this.c;
   }

   public void a(Map<ctc, cjg> $$0, cjg $$1) {
      $$0.put(this.e(), $$1);
   }

   @Override
   public boolean al_() {
      return !(this.c instanceof czz);
   }

   @Override
   public void a(byt $$0) {
      if (this.c instanceof czz) {
         cjl $$1 = $$0.q();
         qw $$2 = a($$1);
         if ($$2 != null && $$2.b("Items", 9)) {
            rc $$3 = $$2.c("Items", 10);
            cjn.a($$0, $$3.stream().map(qw.class::cast).map(cjl::a));
         }
      }
   }

   @Nullable
   public static qw a(cjl $$0) {
      return $$0.b("BlockEntityTag");
   }

   public static void a(cjl $$0, ddb<?> $$1, qw $$2) {
      if ($$2.g()) {
         $$0.c("BlockEntityTag");
      } else {
         dcz.a($$2, $$1);
         $$0.a("BlockEntityTag", $$2);
      }
   }

   @Override
   public cei m() {
      return this.e().m();
   }
}
