import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class cgy extends cja {
   public static final String a = "BlockEntityTag";
   public static final String b = "BlockStateTag";
   @Deprecated
   private final csv c;

   public cgy(csv $$0, cja.a $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public bgy a(clp $$0) {
      bgy $$1 = this.a(new cln($$0));
      if (!$$1.a() && this.u()) {
         bgy $$2 = this.a($$0.q(), $$0.o(), $$0.p()).a();
         return $$2 == bgy.b ? bgy.c : $$2;
      } else {
         return $$1;
      }
   }

   public bgy a(cln $$0) {
      if (!this.e().a($$0.q().G())) {
         return bgy.e;
      } else if (!$$0.b()) {
         return bgy.e;
      } else {
         cln $$1 = this.b($$0);
         if ($$1 == null) {
            return bgy.e;
         } else {
            dfj $$2 = this.c($$1);
            if ($$2 == null) {
               return bgy.e;
            } else if (!this.a($$1, $$2)) {
               return bgy.e;
            } else {
               gw $$3 = $$1.a();
               cpv $$4 = $$1.q();
               cbu $$5 = $$1.o();
               cjf $$6 = $$1.n();
               dfj $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof aks) {
                     al.y.a((aks)$$5, $$3, $$6);
                  }
               }

               dai $$8 = $$7.w();
               $$4.a($$5, $$3, this.a($$7), apf.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(djt.i, $$3, djt.a.a($$5, $$7));
               if ($$5 == null || !$$5.fS().d) {
                  $$6.h(1);
               }

               return bgy.a($$4.B);
            }
         }
      }
   }

   protected apd a(dfj $$0) {
      return $$0.w().e();
   }

   @Nullable
   public cln b(cln $$0) {
      return $$0;
   }

   protected boolean a(gw $$0, cpv $$1, @Nullable cbu $$2, cjf $$3, dfj $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dfj c(cln $$0) {
      dfj $$1 = this.e().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dfj a(gw $$0, cpv $$1, cjf $$2, dfj $$3) {
      dfj $$4 = $$3;
      qy $$5 = $$2.v();
      if ($$5 != null) {
         qy $$6 = $$5.p("BlockStateTag");
         dfk<csv, dfj> $$7 = $$3.b().l();

         for (String $$8 : $$6.e()) {
            dgm<?> $$9 = $$7.a($$8);
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

   private static <T extends Comparable<T>> dfj a(dfj $$0, dgm<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.a($$1, $$2x)).orElse($$0);
   }

   protected boolean b(cln $$0, dfj $$1) {
      cbu $$2 = $$0.o();
      ehs $$3 = $$2 == null ? ehs.a() : ehs.a($$2);
      return (!this.d() || $$1.a((cpy)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean d() {
      return true;
   }

   protected boolean a(cln $$0, dfj $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(cpv $$0, @Nullable cbu $$1, gw $$2, cjf $$3) {
      MinecraftServer $$4 = $$0.n();
      if ($$4 == null) {
         return false;
      } else {
         qy $$5 = a($$3);
         if ($$5 != null) {
            dcv $$6 = $$0.c_($$2);
            if ($$6 != null) {
               if (!$$0.B && $$6.t() && ($$1 == null || !$$1.go())) {
                  return false;
               }

               qy $$7 = $$6.o();
               qy $$8 = $$7.h();
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
      return this.e().f();
   }

   @Override
   public void a(cjf $$0, @Nullable cpv $$1, List<tm> $$2, ckw $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.e().a($$0, $$1, $$2, $$3);
   }

   public csv e() {
      return this.c;
   }

   public void a(Map<csv, cja> $$0, cja $$1) {
      $$0.put(this.e(), $$1);
   }

   @Override
   public boolean al_() {
      return !(this.c instanceof czu);
   }

   @Override
   public void a(byn $$0) {
      if (this.c instanceof czu) {
         cjf $$1 = $$0.q();
         qy $$2 = a($$1);
         if ($$2 != null && $$2.b("Items", 9)) {
            re $$3 = $$2.c("Items", 10);
            cjh.a($$0, $$3.stream().map(qy.class::cast).map(cjf::a));
         }
      }
   }

   @Nullable
   public static qy a(cjf $$0) {
      return $$0.b("BlockEntityTag");
   }

   public static void a(cjf $$0, dcx<?> $$1, qy $$2) {
      if ($$2.g()) {
         $$0.c("BlockEntityTag");
      } else {
         dcv.a($$2, $$1);
         $$0.a("BlockEntityTag", $$2);
      }
   }

   @Override
   public cec m() {
      return this.e().m();
   }
}
