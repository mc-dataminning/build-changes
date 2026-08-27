import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class cla extends cnb {
   public static final String a = "BlockEntityTag";
   public static final String b = "BlockStateTag";
   @Deprecated
   private final cwy c;

   public cla(cwy $$0, cnb.a $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public bkc a(cpr $$0) {
      bkc $$1 = this.a(new cpp($$0));
      if (!$$1.a() && this.t()) {
         bkc $$2 = this.a($$0.q(), $$0.o(), $$0.p()).a();
         return $$2 == bkc.b ? bkc.c : $$2;
      } else {
         return $$1;
      }
   }

   public bkc a(cpp $$0) {
      if (!this.e().a($$0.q().I())) {
         return bkc.e;
      } else if (!$$0.b()) {
         return bkc.e;
      } else {
         cpp $$1 = this.b($$0);
         if ($$1 == null) {
            return bkc.e;
         } else {
            djp $$2 = this.c($$1);
            if ($$2 == null) {
               return bkc.e;
            } else if (!this.a($$1, $$2)) {
               return bkc.e;
            } else {
               hx $$3 = $$1.a();
               ctx $$4 = $$1.q();
               cfq $$5 = $$1.o();
               cng $$6 = $$1.n();
               djp $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof anf) {
                     am.z.a((anf)$$5, $$3, $$6);
                  }
               }

               dek $$8 = $$7.w();
               $$4.a($$5, $$3, this.a($$7), aru.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(dnz.i, $$3, dnz.a.a($$5, $$7));
               if ($$5 == null || !$$5.fT().d) {
                  $$6.h(1);
               }

               return bkc.a($$4.B);
            }
         }
      }
   }

   protected ars a(djp $$0) {
      return $$0.w().e();
   }

   @Nullable
   public cpp b(cpp $$0) {
      return $$0;
   }

   protected boolean a(hx $$0, ctx $$1, @Nullable cfq $$2, cng $$3, djp $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected djp c(cpp $$0) {
      djp $$1 = this.e().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private djp a(hx $$0, ctx $$1, cng $$2, djp $$3) {
      djp $$4 = $$3;
      so $$5 = $$2.v();
      if ($$5 != null) {
         so $$6 = $$5.p("BlockStateTag");
         djq<cwy, djp> $$7 = $$3.b().n();

         for (String $$8 : $$6.e()) {
            dks<?> $$9 = $$7.a($$8);
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

   private static <T extends Comparable<T>> djp a(djp $$0, dks<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.a($$1, $$2x)).orElse($$0);
   }

   protected boolean b(cpp $$0, djp $$1) {
      cfq $$2 = $$0.o();
      emh $$3 = $$2 == null ? emh.a() : emh.a($$2);
      return (!this.d() || $$1.a((cua)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean d() {
      return true;
   }

   protected boolean a(cpp $$0, djp $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(ctx $$0, @Nullable cfq $$1, hx $$2, cng $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 == null) {
         return false;
      } else {
         so $$5 = a($$3);
         if ($$5 != null) {
            dhd $$6 = $$0.c_($$2);
            if ($$6 != null) {
               if (!$$0.B && $$6.u() && ($$1 == null || !$$1.gp())) {
                  return false;
               }

               so $$7 = $$6.q();
               so $$8 = $$7.h();
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
   public void a(cng $$0, @Nullable ctx $$1, List<vg> $$2, coy $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.e().a($$0, $$1, $$2, $$3);
   }

   public cwy e() {
      return this.c;
   }

   public void a(Map<cwy, cnb> $$0, cnb $$1) {
      $$0.put(this.e(), $$1);
   }

   @Override
   public boolean ar_() {
      return !(this.c instanceof ddw);
   }

   @Override
   public void a(ccb $$0) {
      if (this.c instanceof ddw) {
         cng $$1 = $$0.q();
         so $$2 = a($$1);
         if ($$2 != null && $$2.b("Items", 9)) {
            su $$3 = $$2.c("Items", 10);
            cni.a($$0, $$3.stream().map(so.class::cast).map(cng::a));
         }
      }
   }

   @Nullable
   public static so a(cng $$0) {
      return $$0.b("BlockEntityTag");
   }

   public static void a(cng $$0, dhf<?> $$1, so $$2) {
      if ($$2.g()) {
         $$0.c("BlockEntityTag");
      } else {
         dhd.a($$2, $$1);
         $$0.a("BlockEntityTag", $$2);
      }
   }

   @Override
   public cia m() {
      return this.e().m();
   }
}
