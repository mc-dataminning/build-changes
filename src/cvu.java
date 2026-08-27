import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cvu extends cyv {
   public static final MapCodec<cvu> a = b(cvu::new);
   public static final dic b = cyv.aE;
   @Nullable
   private dhn c;
   @Nullable
   private dhn d;
   @Nullable
   private dhn e;
   @Nullable
   private dhn f;
   private static final Predicate<dhi> g = $$0 -> $$0 != null && ($$0.a(cvc.ee) || $$0.a(cvc.ef));

   @Override
   public MapCodec<? extends cvu> a() {
      return a;
   }

   protected cvu(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, hx.c));
   }

   @Override
   public void b(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(csd $$0, ht $$1) {
      return this.b().a($$0, $$1) != null || this.s().a($$0, $$1) != null;
   }

   private void a(csa $$0, ht $$1) {
      dhn.b $$2 = this.g().a($$0, $$1);
      if ($$2 != null) {
         bxp $$3 = bku.aO.a($$0);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dhn.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            bxd $$5 = bku.ac.a($$0);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(csa $$0, dhn.b $$1, bkq $$2, ht $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (amf $$4 : $$0.a(amf.class, $$2.cH().g(5.0))) {
         al.n.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(csa $$0, dhn.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dhm $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), cvc.a.o(), 2);
            $$0.c(2001, $$4.d(), cva.i($$4.a()));
         }
      }
   }

   public static void b(csa $$0, dhn.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dhm $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), cvc.a);
         }
      }
   }

   @Override
   public dhi a(cnr $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b);
   }

   private dhn b() {
      if (this.c == null) {
         this.c = dho.a().a(" ", "#", "#").a('#', dhm.a(dhr.a(cvc.dP))).b();
      }

      return this.c;
   }

   private dhn g() {
      if (this.d == null) {
         this.d = dho.a().a("^", "#", "#").a('^', dhm.a(g)).a('#', dhm.a(dhr.a(cvc.dP))).b();
      }

      return this.d;
   }

   private dhn s() {
      if (this.e == null) {
         this.e = dho.a().a("~ ~", "###", "~#~").a('#', dhm.a(dhr.a(cvc.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.e;
   }

   private dhn y() {
      if (this.f == null) {
         this.f = dho.a().a("~^~", "###", "~#~").a('^', dhm.a(g)).a('#', dhm.a(dhr.a(cvc.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.f;
   }
}
