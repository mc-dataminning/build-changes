import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class cgq extends cis {
   public static final String a = "BlockEntityTag";
   public static final String b = "BlockStateTag";
   @Deprecated
   private final csl c;

   public cgq(csl $$0, cis.a $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public bgq a(clh $$0) {
      bgq $$1 = this.a(new clf($$0));
      if (!$$1.a() && this.u()) {
         bgq $$2 = this.a($$0.q(), $$0.o(), $$0.p()).a();
         return $$2 == bgq.b ? bgq.c : $$2;
      } else {
         return $$1;
      }
   }

   public bgq a(clf $$0) {
      if (!this.e().a($$0.q().G())) {
         return bgq.e;
      } else if (!$$0.b()) {
         return bgq.e;
      } else {
         clf $$1 = this.b($$0);
         if ($$1 == null) {
            return bgq.e;
         } else {
            dez $$2 = this.c($$1);
            if ($$2 == null) {
               return bgq.e;
            } else if (!this.a($$1, $$2)) {
               return bgq.e;
            } else {
               gu $$3 = $$1.a();
               cpl $$4 = $$1.q();
               cbm $$5 = $$1.o();
               cix $$6 = $$1.n();
               dez $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof akl) {
                     ai.y.a((akl)$$5, $$3, $$6);
                  }
               }

               czy $$8 = $$7.w();
               $$4.a($$5, $$3, this.a($$7), aox.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(djj.i, $$3, djj.a.a($$5, $$7));
               if ($$5 == null || !$$5.fR().d) {
                  $$6.h(1);
               }

               return bgq.a($$4.B);
            }
         }
      }
   }

   protected aov a(dez $$0) {
      return $$0.w().e();
   }

   @Nullable
   public clf b(clf $$0) {
      return $$0;
   }

   protected boolean a(gu $$0, cpl $$1, @Nullable cbm $$2, cix $$3, dez $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dez c(clf $$0) {
      dez $$1 = this.e().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dez a(gu $$0, cpl $$1, cix $$2, dez $$3) {
      dez $$4 = $$3;
      qr $$5 = $$2.v();
      if ($$5 != null) {
         qr $$6 = $$5.p("BlockStateTag");
         dfa<csl, dez> $$7 = $$3.b().l();

         for (String $$8 : $$6.e()) {
            dgc<?> $$9 = $$7.a($$8);
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

   private static <T extends Comparable<T>> dez a(dez $$0, dgc<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.a($$1, $$2x)).orElse($$0);
   }

   protected boolean b(clf $$0, dez $$1) {
      cbm $$2 = $$0.o();
      ehi $$3 = $$2 == null ? ehi.a() : ehi.a($$2);
      return (!this.d() || $$1.a((cpo)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean d() {
      return true;
   }

   protected boolean a(clf $$0, dez $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(cpl $$0, @Nullable cbm $$1, gu $$2, cix $$3) {
      MinecraftServer $$4 = $$0.n();
      if ($$4 == null) {
         return false;
      } else {
         qr $$5 = a($$3);
         if ($$5 != null) {
            dcl $$6 = $$0.c_($$2);
            if ($$6 != null) {
               if (!$$0.B && $$6.t() && ($$1 == null || !$$1.gn())) {
                  return false;
               }

               qr $$7 = $$6.o();
               qr $$8 = $$7.h();
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
   public void a(cix $$0, @Nullable cpl $$1, List<tf> $$2, cko $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.e().a($$0, $$1, $$2, $$3);
   }

   public csl e() {
      return this.c;
   }

   public void a(Map<csl, cis> $$0, cis $$1) {
      $$0.put(this.e(), $$1);
   }

   @Override
   public boolean ag_() {
      return !(this.c instanceof czk);
   }

   @Override
   public void a(byf $$0) {
      if (this.c instanceof czk) {
         cix $$1 = $$0.j();
         qr $$2 = a($$1);
         if ($$2 != null && $$2.b("Items", 9)) {
            qx $$3 = $$2.c("Items", 10);
            ciz.a($$0, $$3.stream().map(qr.class::cast).map(cix::a));
         }
      }
   }

   @Nullable
   public static qr a(cix $$0) {
      return $$0.b("BlockEntityTag");
   }

   public static void a(cix $$0, dcn<?> $$1, qr $$2) {
      if ($$2.g()) {
         $$0.c("BlockEntityTag");
      } else {
         dcl.a($$2, $$1);
         $$0.a("BlockEntityTag", $$2);
      }
   }

   @Override
   public cdu m() {
      return this.e().m();
   }
}
