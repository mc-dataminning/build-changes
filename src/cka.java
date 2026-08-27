import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class cka extends cmc {
   public static final String a = "BlockEntityTag";
   public static final String b = "BlockStateTag";
   @Deprecated
   private final cvz c;

   public cka(cvz $$0, cmc.a $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public bjl a(cos $$0) {
      bjl $$1 = this.a(new coq($$0));
      if (!$$1.a() && this.u()) {
         bjl $$2 = this.a($$0.q(), $$0.o(), $$0.p()).a();
         return $$2 == bjl.b ? bjl.c : $$2;
      } else {
         return $$1;
      }
   }

   public bjl a(coq $$0) {
      if (!this.e().a($$0.q().H())) {
         return bjl.e;
      } else if (!$$0.b()) {
         return bjl.e;
      } else {
         coq $$1 = this.b($$0);
         if ($$1 == null) {
            return bjl.e;
         } else {
            dip $$2 = this.c($$1);
            if ($$2 == null) {
               return bjl.e;
            } else if (!this.a($$1, $$2)) {
               return bjl.e;
            } else {
               hv $$3 = $$1.a();
               csy $$4 = $$1.q();
               cer $$5 = $$1.o();
               cmh $$6 = $$1.n();
               dip $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof amq) {
                     am.z.a((amq)$$5, $$3, $$6);
                  }
               }

               ddl $$8 = $$7.w();
               $$4.a($$5, $$3, this.a($$7), ard.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(dmz.i, $$3, dmz.a.a($$5, $$7));
               if ($$5 == null || !$$5.fT().d) {
                  $$6.h(1);
               }

               return bjl.a($$4.B);
            }
         }
      }
   }

   protected arb a(dip $$0) {
      return $$0.w().e();
   }

   @Nullable
   public coq b(coq $$0) {
      return $$0;
   }

   protected boolean a(hv $$0, csy $$1, @Nullable cer $$2, cmh $$3, dip $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dip c(coq $$0) {
      dip $$1 = this.e().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dip a(hv $$0, csy $$1, cmh $$2, dip $$3) {
      dip $$4 = $$3;
      sj $$5 = $$2.v();
      if ($$5 != null) {
         sj $$6 = $$5.p("BlockStateTag");
         diq<cvz, dip> $$7 = $$3.b().n();

         for (String $$8 : $$6.e()) {
            djs<?> $$9 = $$7.a($$8);
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

   private static <T extends Comparable<T>> dip a(dip $$0, djs<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.a($$1, $$2x)).orElse($$0);
   }

   protected boolean b(coq $$0, dip $$1) {
      cer $$2 = $$0.o();
      elg $$3 = $$2 == null ? elg.a() : elg.a($$2);
      return (!this.d() || $$1.a((ctb)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean d() {
      return true;
   }

   protected boolean a(coq $$0, dip $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(csy $$0, @Nullable cer $$1, hv $$2, cmh $$3) {
      MinecraftServer $$4 = $$0.n();
      if ($$4 == null) {
         return false;
      } else {
         sj $$5 = a($$3);
         if ($$5 != null) {
            dgd $$6 = $$0.c_($$2);
            if ($$6 != null) {
               if (!$$0.B && $$6.u() && ($$1 == null || !$$1.gp())) {
                  return false;
               }

               sj $$7 = $$6.q();
               sj $$8 = $$7.h();
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
   public void a(cmh $$0, @Nullable csy $$1, List<vb> $$2, cny $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.e().a($$0, $$1, $$2, $$3);
   }

   public cvz e() {
      return this.c;
   }

   public void a(Map<cvz, cmc> $$0, cmc $$1) {
      $$0.put(this.e(), $$1);
   }

   @Override
   public boolean ap_() {
      return !(this.c instanceof dcx);
   }

   @Override
   public void a(cbe $$0) {
      if (this.c instanceof dcx) {
         cmh $$1 = $$0.q();
         sj $$2 = a($$1);
         if ($$2 != null && $$2.b("Items", 9)) {
            sp $$3 = $$2.c("Items", 10);
            cmj.a($$0, $$3.stream().map(sj.class::cast).map(cmh::a));
         }
      }
   }

   @Nullable
   public static sj a(cmh $$0) {
      return $$0.b("BlockEntityTag");
   }

   public static void a(cmh $$0, dgf<?> $$1, sj $$2) {
      if ($$2.g()) {
         $$0.c("BlockEntityTag");
      } else {
         dgd.a($$2, $$1);
         $$0.a("BlockEntityTag", $$2);
      }
   }

   @Override
   public chb m() {
      return this.e().m();
   }
}
