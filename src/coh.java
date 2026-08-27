import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class coh extends cqh {
   public static final String a = "BlockEntityTag";
   public static final String b = "BlockStateTag";
   @Deprecated
   private final dac c;

   public coh(dac $$0, cqh.a $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public bnd a(csw $$0) {
      bnd $$1 = this.a(new csu($$0));
      if (!$$1.a() && this.v()) {
         bnd $$2 = this.a($$0.q(), $$0.o(), $$0.p()).a();
         return $$2 == bnd.b ? bnd.c : $$2;
      } else {
         return $$1;
      }
   }

   public bnd a(csu $$0) {
      if (!this.d().a($$0.q().I())) {
         return bnd.e;
      } else if (!$$0.b()) {
         return bnd.e;
      } else {
         csu $$1 = this.b($$0);
         if ($$1 == null) {
            return bnd.e;
         } else {
            dnb $$2 = this.c($$1);
            if ($$2 == null) {
               return bnd.e;
            } else if (!this.a($$1, $$2)) {
               return bnd.e;
            } else {
               ib $$3 = $$1.a();
               cxb $$4 = $$1.q();
               ciu $$5 = $$1.o();
               cqm $$6 = $$1.n();
               dnb $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof apg) {
                     am.z.a((apg)$$5, $$3, $$6);
                  }
               }

               dho $$8 = $$7.w();
               $$4.a($$5, $$3, this.a($$7), atz.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(drp.i, $$3, drp.a.a($$5, $$7));
               $$6.a(1, $$5);
               return bnd.a($$4.B);
            }
         }
      }
   }

   protected atx a(dnb $$0) {
      return $$0.w().e();
   }

   @Nullable
   public csu b(csu $$0) {
      return $$0;
   }

   protected boolean a(ib $$0, cxb $$1, @Nullable ciu $$2, cqm $$3, dnb $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dnb c(csu $$0) {
      dnb $$1 = this.d().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dnb a(ib $$0, cxb $$1, cqm $$2, dnb $$3) {
      dnb $$4 = $$3;
      ta $$5 = $$2.w();
      if ($$5 != null) {
         ta $$6 = $$5.p("BlockStateTag");
         dnc<dac, dnb> $$7 = $$3.b().n();

         for (String $$8 : $$6.e()) {
            doe<?> $$9 = $$7.a($$8);
            if ($$9 != null) {
               String $$10 = $$6.c($$8).s_();
               $$4 = a($$4, $$9, $$10);
            }
         }
      }

      if ($$4 != $$3) {
         $$1.a($$0, $$4, 2);
      }

      return $$4;
   }

   private static <T extends Comparable<T>> dnb a(dnb $$0, doe<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.a($$1, $$2x)).orElse($$0);
   }

   protected boolean b(csu $$0, dnb $$1) {
      ciu $$2 = $$0.o();
      epy $$3 = $$2 == null ? epy.a() : epy.a($$2);
      return (!this.c() || $$1.a((cxe)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean c() {
      return true;
   }

   protected boolean a(csu $$0, dnb $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(cxb $$0, @Nullable ciu $$1, ib $$2, cqm $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 == null) {
         return false;
      } else {
         ta $$5 = a($$3);
         if ($$5 != null) {
            dki $$6 = $$0.c_($$2);
            if ($$6 != null) {
               if (!$$0.B && $$6.q() && ($$1 == null || !$$1.gw())) {
                  return false;
               }

               ta $$7 = $$6.d($$0.H_());
               ta $$8 = $$7.h();
               $$7.a($$5);
               if (!$$7.equals($$8)) {
                  $$6.a($$7, $$0.H_());
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
      return this.d().g();
   }

   @Override
   public void a(cqm $$0, @Nullable cxb $$1, List<vu> $$2, csd $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d().a($$0, $$1, $$2, $$3, $$1 != null ? $$1.H_() : null);
   }

   public dac d() {
      return this.c;
   }

   public void a(Map<dac, cqh> $$0, cqh $$1) {
      $$0.put(this.d(), $$1);
   }

   @Override
   public boolean ap_() {
      return !(this.c instanceof dha);
   }

   @Override
   public void a(cfe $$0) {
      if (this.c instanceof dha) {
         cqm $$1 = $$0.p();
         ta $$2 = a($$1);
         if ($$2 != null && $$2.b("Items", 9)) {
            tg $$3 = $$2.c("Items", 10);
            cqo.a($$0, $$3.stream().map(ta.class::cast).map(cqm::a));
         }
      }
   }

   @Nullable
   public static ta a(cqm $$0) {
      return $$0.c("BlockEntityTag");
   }

   public static void a(cqm $$0, dkk<?> $$1, ta $$2) {
      if ($$2.g()) {
         $$0.d("BlockEntityTag");
      } else {
         dki.a($$2, $$1);
         $$0.a("BlockEntityTag", $$2);
      }
   }

   @Override
   public clh m() {
      return this.d().m();
   }
}
