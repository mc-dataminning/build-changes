import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class cha extends cjc {
   public static final String a = "BlockEntityTag";
   public static final String b = "BlockStateTag";
   @Deprecated
   private final csx c;

   public cha(csx $$0, cjc.a $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public bha a(clr $$0) {
      bha $$1 = this.a(new clp($$0));
      if (!$$1.a() && this.u()) {
         bha $$2 = this.a($$0.q(), $$0.o(), $$0.p()).a();
         return $$2 == bha.b ? bha.c : $$2;
      } else {
         return $$1;
      }
   }

   public bha a(clp $$0) {
      if (!this.e().a($$0.q().G())) {
         return bha.e;
      } else if (!$$0.b()) {
         return bha.e;
      } else {
         clp $$1 = this.b($$0);
         if ($$1 == null) {
            return bha.e;
         } else {
            dfl $$2 = this.c($$1);
            if ($$2 == null) {
               return bha.e;
            } else if (!this.a($$1, $$2)) {
               return bha.e;
            } else {
               gw $$3 = $$1.a();
               cpx $$4 = $$1.q();
               cbw $$5 = $$1.o();
               cjh $$6 = $$1.n();
               dfl $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof akt) {
                     al.y.a((akt)$$5, $$3, $$6);
                  }
               }

               dak $$8 = $$7.w();
               $$4.a($$5, $$3, this.a($$7), apg.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(djv.i, $$3, djv.a.a($$5, $$7));
               if ($$5 == null || !$$5.fS().d) {
                  $$6.h(1);
               }

               return bha.a($$4.B);
            }
         }
      }
   }

   protected ape a(dfl $$0) {
      return $$0.w().e();
   }

   @Nullable
   public clp b(clp $$0) {
      return $$0;
   }

   protected boolean a(gw $$0, cpx $$1, @Nullable cbw $$2, cjh $$3, dfl $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dfl c(clp $$0) {
      dfl $$1 = this.e().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dfl a(gw $$0, cpx $$1, cjh $$2, dfl $$3) {
      dfl $$4 = $$3;
      qy $$5 = $$2.v();
      if ($$5 != null) {
         qy $$6 = $$5.p("BlockStateTag");
         dfm<csx, dfl> $$7 = $$3.b().l();

         for (String $$8 : $$6.e()) {
            dgo<?> $$9 = $$7.a($$8);
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

   private static <T extends Comparable<T>> dfl a(dfl $$0, dgo<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.a($$1, $$2x)).orElse($$0);
   }

   protected boolean b(clp $$0, dfl $$1) {
      cbw $$2 = $$0.o();
      ehu $$3 = $$2 == null ? ehu.a() : ehu.a($$2);
      return (!this.d() || $$1.a((cqa)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean d() {
      return true;
   }

   protected boolean a(clp $$0, dfl $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(cpx $$0, @Nullable cbw $$1, gw $$2, cjh $$3) {
      MinecraftServer $$4 = $$0.n();
      if ($$4 == null) {
         return false;
      } else {
         qy $$5 = a($$3);
         if ($$5 != null) {
            dcx $$6 = $$0.c_($$2);
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
   public void a(cjh $$0, @Nullable cpx $$1, List<tn> $$2, cky $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.e().a($$0, $$1, $$2, $$3);
   }

   public csx e() {
      return this.c;
   }

   public void a(Map<csx, cjc> $$0, cjc $$1) {
      $$0.put(this.e(), $$1);
   }

   @Override
   public boolean al_() {
      return !(this.c instanceof czw);
   }

   @Override
   public void a(byp $$0) {
      if (this.c instanceof czw) {
         cjh $$1 = $$0.q();
         qy $$2 = a($$1);
         if ($$2 != null && $$2.b("Items", 9)) {
            re $$3 = $$2.c("Items", 10);
            cjj.a($$0, $$3.stream().map(qy.class::cast).map(cjh::a));
         }
      }
   }

   @Nullable
   public static qy a(cjh $$0) {
      return $$0.b("BlockEntityTag");
   }

   public static void a(cjh $$0, dcz<?> $$1, qy $$2) {
      if ($$2.g()) {
         $$0.c("BlockEntityTag");
      } else {
         dcx.a($$2, $$1);
         $$0.a("BlockEntityTag", $$2);
      }
   }

   @Override
   public cee m() {
      return this.e().m();
   }
}
