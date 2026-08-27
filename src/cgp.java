import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class cgp extends cir {
   public static final String a = "BlockEntityTag";
   public static final String b = "BlockStateTag";
   @Deprecated
   private final csk c;

   public cgp(csk $$0, cir.a $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public bgo a(clg $$0) {
      bgo $$1 = this.a(new cle($$0));
      if (!$$1.a() && this.u()) {
         bgo $$2 = this.a($$0.q(), $$0.o(), $$0.p()).a();
         return $$2 == bgo.b ? bgo.c : $$2;
      } else {
         return $$1;
      }
   }

   public bgo a(cle $$0) {
      if (!this.e().a($$0.q().G())) {
         return bgo.e;
      } else if (!$$0.b()) {
         return bgo.e;
      } else {
         cle $$1 = this.b($$0);
         if ($$1 == null) {
            return bgo.e;
         } else {
            dey $$2 = this.c($$1);
            if ($$2 == null) {
               return bgo.e;
            } else if (!this.a($$1, $$2)) {
               return bgo.e;
            } else {
               gv $$3 = $$1.a();
               cpk $$4 = $$1.q();
               cbl $$5 = $$1.o();
               ciw $$6 = $$1.n();
               dey $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof akj) {
                     ai.y.a((akj)$$5, $$3, $$6);
                  }
               }

               czx $$8 = $$7.w();
               $$4.a($$5, $$3, this.a($$7), aov.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(dji.i, $$3, dji.a.a($$5, $$7));
               if ($$5 == null || !$$5.fR().d) {
                  $$6.h(1);
               }

               return bgo.a($$4.B);
            }
         }
      }
   }

   protected aot a(dey $$0) {
      return $$0.w().e();
   }

   @Nullable
   public cle b(cle $$0) {
      return $$0;
   }

   protected boolean a(gv $$0, cpk $$1, @Nullable cbl $$2, ciw $$3, dey $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dey c(cle $$0) {
      dey $$1 = this.e().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dey a(gv $$0, cpk $$1, ciw $$2, dey $$3) {
      dey $$4 = $$3;
      qs $$5 = $$2.v();
      if ($$5 != null) {
         qs $$6 = $$5.p("BlockStateTag");
         dez<csk, dey> $$7 = $$3.b().l();

         for (String $$8 : $$6.e()) {
            dgb<?> $$9 = $$7.a($$8);
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

   private static <T extends Comparable<T>> dey a(dey $$0, dgb<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.a($$1, $$2x)).orElse($$0);
   }

   protected boolean b(cle $$0, dey $$1) {
      cbl $$2 = $$0.o();
      ehk $$3 = $$2 == null ? ehk.a() : ehk.a($$2);
      return (!this.d() || $$1.a((cpn)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean d() {
      return true;
   }

   protected boolean a(cle $$0, dey $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(cpk $$0, @Nullable cbl $$1, gv $$2, ciw $$3) {
      MinecraftServer $$4 = $$0.n();
      if ($$4 == null) {
         return false;
      } else {
         qs $$5 = a($$3);
         if ($$5 != null) {
            dck $$6 = $$0.c_($$2);
            if ($$6 != null) {
               if (!$$0.B && $$6.t() && ($$1 == null || !$$1.gn())) {
                  return false;
               }

               qs $$7 = $$6.o();
               qs $$8 = $$7.h();
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
   public void a(ciw $$0, @Nullable cpk $$1, List<te> $$2, ckn $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.e().a($$0, $$1, $$2, $$3);
   }

   public csk e() {
      return this.c;
   }

   public void a(Map<csk, cir> $$0, cir $$1) {
      $$0.put(this.e(), $$1);
   }

   @Override
   public boolean ah_() {
      return !(this.c instanceof czj);
   }

   @Override
   public void a(bye $$0) {
      if (this.c instanceof czj) {
         ciw $$1 = $$0.j();
         qs $$2 = a($$1);
         if ($$2 != null && $$2.b("Items", 9)) {
            qy $$3 = $$2.c("Items", 10);
            ciy.a($$0, $$3.stream().map(qs.class::cast).map(ciw::a));
         }
      }
   }

   @Nullable
   public static qs a(ciw $$0) {
      return $$0.b("BlockEntityTag");
   }

   public static void a(ciw $$0, dcm<?> $$1, qs $$2) {
      if ($$2.g()) {
         $$0.c("BlockEntityTag");
      } else {
         dck.a($$2, $$1);
         $$0.a("BlockEntityTag", $$2);
      }
   }

   @Override
   public cdt m() {
      return this.e().m();
   }
}
