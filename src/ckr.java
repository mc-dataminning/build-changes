import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ckr extends cmt {
   public static final String a = "BlockEntityTag";
   public static final String b = "BlockStateTag";
   @Deprecated
   private final cwq c;

   public ckr(cwq $$0, cmt.a $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public bkb a(cpj $$0) {
      bkb $$1 = this.a(new cph($$0));
      if (!$$1.a() && this.u()) {
         bkb $$2 = this.a($$0.q(), $$0.o(), $$0.p()).a();
         return $$2 == bkb.b ? bkb.c : $$2;
      } else {
         return $$1;
      }
   }

   public bkb a(cph $$0) {
      if (!this.e().a($$0.q().I())) {
         return bkb.e;
      } else if (!$$0.b()) {
         return bkb.e;
      } else {
         cph $$1 = this.b($$0);
         if ($$1 == null) {
            return bkb.e;
         } else {
            djh $$2 = this.c($$1);
            if ($$2 == null) {
               return bkb.e;
            } else if (!this.a($$1, $$2)) {
               return bkb.e;
            } else {
               hx $$3 = $$1.a();
               ctp $$4 = $$1.q();
               cfi $$5 = $$1.o();
               cmy $$6 = $$1.n();
               djh $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof ane) {
                     am.z.a((ane)$$5, $$3, $$6);
                  }
               }

               dec $$8 = $$7.w();
               $$4.a($$5, $$3, this.a($$7), art.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(dnr.i, $$3, dnr.a.a($$5, $$7));
               if ($$5 == null || !$$5.fT().d) {
                  $$6.h(1);
               }

               return bkb.a($$4.B);
            }
         }
      }
   }

   protected arr a(djh $$0) {
      return $$0.w().e();
   }

   @Nullable
   public cph b(cph $$0) {
      return $$0;
   }

   protected boolean a(hx $$0, ctp $$1, @Nullable cfi $$2, cmy $$3, djh $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected djh c(cph $$0) {
      djh $$1 = this.e().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private djh a(hx $$0, ctp $$1, cmy $$2, djh $$3) {
      djh $$4 = $$3;
      sn $$5 = $$2.v();
      if ($$5 != null) {
         sn $$6 = $$5.p("BlockStateTag");
         dji<cwq, djh> $$7 = $$3.b().n();

         for (String $$8 : $$6.e()) {
            dkk<?> $$9 = $$7.a($$8);
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

   private static <T extends Comparable<T>> djh a(djh $$0, dkk<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.a($$1, $$2x)).orElse($$0);
   }

   protected boolean b(cph $$0, djh $$1) {
      cfi $$2 = $$0.o();
      ely $$3 = $$2 == null ? ely.a() : ely.a($$2);
      return (!this.d() || $$1.a((cts)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean d() {
      return true;
   }

   protected boolean a(cph $$0, djh $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(ctp $$0, @Nullable cfi $$1, hx $$2, cmy $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 == null) {
         return false;
      } else {
         sn $$5 = a($$3);
         if ($$5 != null) {
            dgv $$6 = $$0.c_($$2);
            if ($$6 != null) {
               if (!$$0.B && $$6.u() && ($$1 == null || !$$1.gp())) {
                  return false;
               }

               sn $$7 = $$6.q();
               sn $$8 = $$7.h();
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
   public void a(cmy $$0, @Nullable ctp $$1, List<vf> $$2, coq $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.e().a($$0, $$1, $$2, $$3);
   }

   public cwq e() {
      return this.c;
   }

   public void a(Map<cwq, cmt> $$0, cmt $$1) {
      $$0.put(this.e(), $$1);
   }

   @Override
   public boolean ap_() {
      return !(this.c instanceof ddo);
   }

   @Override
   public void a(cbu $$0) {
      if (this.c instanceof ddo) {
         cmy $$1 = $$0.q();
         sn $$2 = a($$1);
         if ($$2 != null && $$2.b("Items", 9)) {
            st $$3 = $$2.c("Items", 10);
            cna.a($$0, $$3.stream().map(sn.class::cast).map(cmy::a));
         }
      }
   }

   @Nullable
   public static sn a(cmy $$0) {
      return $$0.b("BlockEntityTag");
   }

   public static void a(cmy $$0, dgx<?> $$1, sn $$2) {
      if ($$2.g()) {
         $$0.c("BlockEntityTag");
      } else {
         dgv.a($$2, $$1);
         $$0.a("BlockEntityTag", $$2);
      }
   }

   @Override
   public chs m() {
      return this.e().m();
   }
}
