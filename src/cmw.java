import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class cmw extends coy {
   public static final String a = "BlockEntityTag";
   public static final String b = "BlockStateTag";
   @Deprecated
   private final cys c;

   public cmw(cys $$0, coy.a $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public blw a(crm $$0) {
      blw $$1 = this.a(new crk($$0));
      if (!$$1.a() && this.t()) {
         blw $$2 = this.a($$0.q(), $$0.o(), $$0.p()).a();
         return $$2 == blw.b ? blw.c : $$2;
      } else {
         return $$1;
      }
   }

   public blw a(crk $$0) {
      if (!this.e().a($$0.q().I())) {
         return blw.e;
      } else if (!$$0.b()) {
         return blw.e;
      } else {
         crk $$1 = this.b($$0);
         if ($$1 == null) {
            return blw.e;
         } else {
            dlj $$2 = this.c($$1);
            if ($$2 == null) {
               return blw.e;
            } else if (!this.a($$1, $$2)) {
               return blw.e;
            } else {
               hz $$3 = $$1.a();
               cvr $$4 = $$1.q();
               chl $$5 = $$1.o();
               cpd $$6 = $$1.n();
               dlj $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof aox) {
                     am.z.a((aox)$$5, $$3, $$6);
                  }
               }

               dge $$8 = $$7.w();
               $$4.a($$5, $$3, this.a($$7), atm.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(dpw.i, $$3, dpw.a.a($$5, $$7));
               if ($$5 == null || !$$5.fU().d) {
                  $$6.h(1);
               }

               return blw.a($$4.B);
            }
         }
      }
   }

   protected atk a(dlj $$0) {
      return $$0.w().e();
   }

   @Nullable
   public crk b(crk $$0) {
      return $$0;
   }

   protected boolean a(hz $$0, cvr $$1, @Nullable chl $$2, cpd $$3, dlj $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dlj c(crk $$0) {
      dlj $$1 = this.e().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dlj a(hz $$0, cvr $$1, cpd $$2, dlj $$3) {
      dlj $$4 = $$3;
      sw $$5 = $$2.w();
      if ($$5 != null) {
         sw $$6 = $$5.p("BlockStateTag");
         dlk<cys, dlj> $$7 = $$3.b().n();

         for (String $$8 : $$6.e()) {
            dmm<?> $$9 = $$7.a($$8);
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

   private static <T extends Comparable<T>> dlj a(dlj $$0, dmm<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.a($$1, $$2x)).orElse($$0);
   }

   protected boolean b(crk $$0, dlj $$1) {
      chl $$2 = $$0.o();
      eoe $$3 = $$2 == null ? eoe.a() : eoe.a($$2);
      return (!this.d() || $$1.a((cvu)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean d() {
      return true;
   }

   protected boolean a(crk $$0, dlj $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(cvr $$0, @Nullable chl $$1, hz $$2, cpd $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 == null) {
         return false;
      } else {
         sw $$5 = a($$3);
         if ($$5 != null) {
            dix $$6 = $$0.c_($$2);
            if ($$6 != null) {
               if (!$$0.B && $$6.u() && ($$1 == null || !$$1.gq())) {
                  return false;
               }

               sw $$7 = $$6.q();
               sw $$8 = $$7.h();
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
   public void a(cpd $$0, @Nullable cvr $$1, List<vq> $$2, cqu $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.e().a($$0, $$1, $$2, $$3);
   }

   public cys e() {
      return this.c;
   }

   public void a(Map<cys, coy> $$0, coy $$1) {
      $$0.put(this.e(), $$1);
   }

   @Override
   public boolean ar_() {
      return !(this.c instanceof dfq);
   }

   @Override
   public void a(cdw $$0) {
      if (this.c instanceof dfq) {
         cpd $$1 = $$0.q();
         sw $$2 = a($$1);
         if ($$2 != null && $$2.b("Items", 9)) {
            tc $$3 = $$2.c("Items", 10);
            cpf.a($$0, $$3.stream().map(sw.class::cast).map(cpd::a));
         }
      }
   }

   @Nullable
   public static sw a(cpd $$0) {
      return $$0.b("BlockEntityTag");
   }

   public static void a(cpd $$0, diz<?> $$1, sw $$2) {
      if ($$2.g()) {
         $$0.c("BlockEntityTag");
      } else {
         dix.a($$2, $$1);
         $$0.a("BlockEntityTag", $$2);
      }
   }

   @Override
   public cjw m() {
      return this.e().m();
   }
}
