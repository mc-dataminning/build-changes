import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ckq extends cms {
   public static final String a = "BlockEntityTag";
   public static final String b = "BlockStateTag";
   @Deprecated
   private final cwp c;

   public ckq(cwp $$0, cms.a $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public bka a(cpi $$0) {
      bka $$1 = this.a(new cpg($$0));
      if (!$$1.a() && this.u()) {
         bka $$2 = this.a($$0.q(), $$0.o(), $$0.p()).a();
         return $$2 == bka.b ? bka.c : $$2;
      } else {
         return $$1;
      }
   }

   public bka a(cpg $$0) {
      if (!this.e().a($$0.q().I())) {
         return bka.e;
      } else if (!$$0.b()) {
         return bka.e;
      } else {
         cpg $$1 = this.b($$0);
         if ($$1 == null) {
            return bka.e;
         } else {
            djg $$2 = this.c($$1);
            if ($$2 == null) {
               return bka.e;
            } else if (!this.a($$1, $$2)) {
               return bka.e;
            } else {
               hx $$3 = $$1.a();
               cto $$4 = $$1.q();
               cfh $$5 = $$1.o();
               cmx $$6 = $$1.n();
               djg $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof ane) {
                     am.z.a((ane)$$5, $$3, $$6);
                  }
               }

               deb $$8 = $$7.w();
               $$4.a($$5, $$3, this.a($$7), ars.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(dnq.i, $$3, dnq.a.a($$5, $$7));
               if ($$5 == null || !$$5.fT().d) {
                  $$6.h(1);
               }

               return bka.a($$4.B);
            }
         }
      }
   }

   protected arq a(djg $$0) {
      return $$0.w().e();
   }

   @Nullable
   public cpg b(cpg $$0) {
      return $$0;
   }

   protected boolean a(hx $$0, cto $$1, @Nullable cfh $$2, cmx $$3, djg $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected djg c(cpg $$0) {
      djg $$1 = this.e().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private djg a(hx $$0, cto $$1, cmx $$2, djg $$3) {
      djg $$4 = $$3;
      sn $$5 = $$2.v();
      if ($$5 != null) {
         sn $$6 = $$5.p("BlockStateTag");
         djh<cwp, djg> $$7 = $$3.b().n();

         for (String $$8 : $$6.e()) {
            dkj<?> $$9 = $$7.a($$8);
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

   private static <T extends Comparable<T>> djg a(djg $$0, dkj<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.a($$1, $$2x)).orElse($$0);
   }

   protected boolean b(cpg $$0, djg $$1) {
      cfh $$2 = $$0.o();
      elx $$3 = $$2 == null ? elx.a() : elx.a($$2);
      return (!this.d() || $$1.a((ctr)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean d() {
      return true;
   }

   protected boolean a(cpg $$0, djg $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(cto $$0, @Nullable cfh $$1, hx $$2, cmx $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 == null) {
         return false;
      } else {
         sn $$5 = a($$3);
         if ($$5 != null) {
            dgu $$6 = $$0.c_($$2);
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
   public void a(cmx $$0, @Nullable cto $$1, List<vf> $$2, cop $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.e().a($$0, $$1, $$2, $$3);
   }

   public cwp e() {
      return this.c;
   }

   public void a(Map<cwp, cms> $$0, cms $$1) {
      $$0.put(this.e(), $$1);
   }

   @Override
   public boolean ap_() {
      return !(this.c instanceof ddn);
   }

   @Override
   public void a(cbt $$0) {
      if (this.c instanceof ddn) {
         cmx $$1 = $$0.q();
         sn $$2 = a($$1);
         if ($$2 != null && $$2.b("Items", 9)) {
            st $$3 = $$2.c("Items", 10);
            cmz.a($$0, $$3.stream().map(sn.class::cast).map(cmx::a));
         }
      }
   }

   @Nullable
   public static sn a(cmx $$0) {
      return $$0.b("BlockEntityTag");
   }

   public static void a(cmx $$0, dgw<?> $$1, sn $$2) {
      if ($$2.g()) {
         $$0.c("BlockEntityTag");
      } else {
         dgu.a($$2, $$1);
         $$0.a("BlockEntityTag", $$2);
      }
   }

   @Override
   public chr m() {
      return this.e().m();
   }
}
