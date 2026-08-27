import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ckk extends cmm {
   public static final String a = "BlockEntityTag";
   public static final String b = "BlockStateTag";
   @Deprecated
   private final cwj c;

   public ckk(cwj $$0, cmm.a $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public bjv a(cpc $$0) {
      bjv $$1 = this.a(new cpa($$0));
      if (!$$1.a() && this.u()) {
         bjv $$2 = this.a($$0.q(), $$0.o(), $$0.p()).a();
         return $$2 == bjv.b ? bjv.c : $$2;
      } else {
         return $$1;
      }
   }

   public bjv a(cpa $$0) {
      if (!this.e().a($$0.q().I())) {
         return bjv.e;
      } else if (!$$0.b()) {
         return bjv.e;
      } else {
         cpa $$1 = this.b($$0);
         if ($$1 == null) {
            return bjv.e;
         } else {
            dja $$2 = this.c($$1);
            if ($$2 == null) {
               return bjv.e;
            } else if (!this.a($$1, $$2)) {
               return bjv.e;
            } else {
               hx $$3 = $$1.a();
               cti $$4 = $$1.q();
               cfb $$5 = $$1.o();
               cmr $$6 = $$1.n();
               dja $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof ana) {
                     am.z.a((ana)$$5, $$3, $$6);
                  }
               }

               ddv $$8 = $$7.w();
               $$4.a($$5, $$3, this.a($$7), arn.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(dnk.i, $$3, dnk.a.a($$5, $$7));
               if ($$5 == null || !$$5.fT().d) {
                  $$6.h(1);
               }

               return bjv.a($$4.B);
            }
         }
      }
   }

   protected arl a(dja $$0) {
      return $$0.w().e();
   }

   @Nullable
   public cpa b(cpa $$0) {
      return $$0;
   }

   protected boolean a(hx $$0, cti $$1, @Nullable cfb $$2, cmr $$3, dja $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dja c(cpa $$0) {
      dja $$1 = this.e().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dja a(hx $$0, cti $$1, cmr $$2, dja $$3) {
      dja $$4 = $$3;
      sl $$5 = $$2.v();
      if ($$5 != null) {
         sl $$6 = $$5.p("BlockStateTag");
         djb<cwj, dja> $$7 = $$3.b().n();

         for (String $$8 : $$6.e()) {
            dkd<?> $$9 = $$7.a($$8);
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

   private static <T extends Comparable<T>> dja a(dja $$0, dkd<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.a($$1, $$2x)).orElse($$0);
   }

   protected boolean b(cpa $$0, dja $$1) {
      cfb $$2 = $$0.o();
      elr $$3 = $$2 == null ? elr.a() : elr.a($$2);
      return (!this.d() || $$1.a((ctl)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean d() {
      return true;
   }

   protected boolean a(cpa $$0, dja $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(cti $$0, @Nullable cfb $$1, hx $$2, cmr $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 == null) {
         return false;
      } else {
         sl $$5 = a($$3);
         if ($$5 != null) {
            dgo $$6 = $$0.c_($$2);
            if ($$6 != null) {
               if (!$$0.B && $$6.u() && ($$1 == null || !$$1.gp())) {
                  return false;
               }

               sl $$7 = $$6.q();
               sl $$8 = $$7.h();
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
   public void a(cmr $$0, @Nullable cti $$1, List<vd> $$2, coi $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.e().a($$0, $$1, $$2, $$3);
   }

   public cwj e() {
      return this.c;
   }

   public void a(Map<cwj, cmm> $$0, cmm $$1) {
      $$0.put(this.e(), $$1);
   }

   @Override
   public boolean ap_() {
      return !(this.c instanceof ddh);
   }

   @Override
   public void a(cbo $$0) {
      if (this.c instanceof ddh) {
         cmr $$1 = $$0.q();
         sl $$2 = a($$1);
         if ($$2 != null && $$2.b("Items", 9)) {
            sr $$3 = $$2.c("Items", 10);
            cmt.a($$0, $$3.stream().map(sl.class::cast).map(cmr::a));
         }
      }
   }

   @Nullable
   public static sl a(cmr $$0) {
      return $$0.b("BlockEntityTag");
   }

   public static void a(cmr $$0, dgq<?> $$1, sl $$2) {
      if ($$2.g()) {
         $$0.c("BlockEntityTag");
      } else {
         dgo.a($$2, $$1);
         $$0.a("BlockEntityTag", $$2);
      }
   }

   @Override
   public chl m() {
      return this.e().m();
   }
}
