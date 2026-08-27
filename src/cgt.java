import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class cgt extends civ {
   public static final String a = "BlockEntityTag";
   public static final String b = "BlockStateTag";
   @Deprecated
   private final csq c;

   public cgt(csq $$0, civ.a $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public bgt a(clk $$0) {
      bgt $$1 = this.a(new cli($$0));
      if (!$$1.a() && this.u()) {
         bgt $$2 = this.a($$0.q(), $$0.o(), $$0.p()).a();
         return $$2 == bgt.b ? bgt.c : $$2;
      } else {
         return $$1;
      }
   }

   public bgt a(cli $$0) {
      if (!this.e().a($$0.q().G())) {
         return bgt.e;
      } else if (!$$0.b()) {
         return bgt.e;
      } else {
         cli $$1 = this.b($$0);
         if ($$1 == null) {
            return bgt.e;
         } else {
            dfe $$2 = this.c($$1);
            if ($$2 == null) {
               return bgt.e;
            } else if (!this.a($$1, $$2)) {
               return bgt.e;
            } else {
               gw $$3 = $$1.a();
               cpq $$4 = $$1.q();
               cbp $$5 = $$1.o();
               cja $$6 = $$1.n();
               dfe $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof ako) {
                     al.y.a((ako)$$5, $$3, $$6);
                  }
               }

               dad $$8 = $$7.w();
               $$4.a($$5, $$3, this.a($$7), apa.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(djo.i, $$3, djo.a.a($$5, $$7));
               if ($$5 == null || !$$5.fR().d) {
                  $$6.h(1);
               }

               return bgt.a($$4.B);
            }
         }
      }
   }

   protected aoy a(dfe $$0) {
      return $$0.w().e();
   }

   @Nullable
   public cli b(cli $$0) {
      return $$0;
   }

   protected boolean a(gw $$0, cpq $$1, @Nullable cbp $$2, cja $$3, dfe $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dfe c(cli $$0) {
      dfe $$1 = this.e().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dfe a(gw $$0, cpq $$1, cja $$2, dfe $$3) {
      dfe $$4 = $$3;
      qu $$5 = $$2.v();
      if ($$5 != null) {
         qu $$6 = $$5.p("BlockStateTag");
         dff<csq, dfe> $$7 = $$3.b().l();

         for (String $$8 : $$6.e()) {
            dgh<?> $$9 = $$7.a($$8);
            if ($$9 != null) {
               String $$10 = $$6.c($$8).m_();
               $$4 = a($$4, $$9, $$10);
            }
         }
      }

      if ($$4 != $$3) {
         $$1.a($$0, $$4, 2);
      }

      return $$4;
   }

   private static <T extends Comparable<T>> dfe a(dfe $$0, dgh<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.a($$1, $$2x)).orElse($$0);
   }

   protected boolean b(cli $$0, dfe $$1) {
      cbp $$2 = $$0.o();
      ehn $$3 = $$2 == null ? ehn.a() : ehn.a($$2);
      return (!this.d() || $$1.a((cpt)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean d() {
      return true;
   }

   protected boolean a(cli $$0, dfe $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(cpq $$0, @Nullable cbp $$1, gw $$2, cja $$3) {
      MinecraftServer $$4 = $$0.n();
      if ($$4 == null) {
         return false;
      } else {
         qu $$5 = a($$3);
         if ($$5 != null) {
            dcq $$6 = $$0.c_($$2);
            if ($$6 != null) {
               if (!$$0.B && $$6.t() && ($$1 == null || !$$1.gn())) {
                  return false;
               }

               qu $$7 = $$6.o();
               qu $$8 = $$7.h();
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
   public void a(cja $$0, @Nullable cpq $$1, List<ti> $$2, ckr $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.e().a($$0, $$1, $$2, $$3);
   }

   public csq e() {
      return this.c;
   }

   public void a(Map<csq, civ> $$0, civ $$1) {
      $$0.put(this.e(), $$1);
   }

   @Override
   public boolean ag_() {
      return !(this.c instanceof czp);
   }

   @Override
   public void a(byi $$0) {
      if (this.c instanceof czp) {
         cja $$1 = $$0.j();
         qu $$2 = a($$1);
         if ($$2 != null && $$2.b("Items", 9)) {
            ra $$3 = $$2.c("Items", 10);
            cjc.a($$0, $$3.stream().map(qu.class::cast).map(cja::a));
         }
      }
   }

   @Nullable
   public static qu a(cja $$0) {
      return $$0.b("BlockEntityTag");
   }

   public static void a(cja $$0, dcs<?> $$1, qu $$2) {
      if ($$2.g()) {
         $$0.c("BlockEntityTag");
      } else {
         dcq.a($$2, $$1);
         $$0.a("BlockEntityTag", $$2);
      }
   }

   @Override
   public cdx m() {
      return this.e().m();
   }
}
