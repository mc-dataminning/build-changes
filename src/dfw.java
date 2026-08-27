import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dfw extends djc {
   public static final MapCodec<dfw> a = b(dfw::new);
   public static final dtw b = djc.aE;
   @Nullable
   private dth c;
   @Nullable
   private dth d;
   @Nullable
   private dth e;
   @Nullable
   private dth f;
   private static final Predicate<dtc> g = $$0 -> $$0 != null && ($$0.a(dfe.eU) || $$0.a(dfe.eX));

   @Override
   public MapCodec<? extends dfw> a() {
      return a;
   }

   protected dfw(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, iw.c));
   }

   @Override
   protected void b(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(dcd $$0, ir $$1) {
      return this.b().a($$0, $$1) != null || this.s().a($$0, $$1) != null;
   }

   private void a(dca $$0, ir $$1) {
      dth.b $$2 = this.k().a($$0, $$1);
      if ($$2 != null) {
         cfc $$3 = bsb.aV.a($$0);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dth.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            ceq $$5 = bsb.ah.a($$0);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(dca $$0, dth.b $$1, brv $$2, ir $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (aqu $$4 : $$0.a(aqu.class, $$2.cP().g(5.0))) {
         an.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(dca $$0, dth.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dtg $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dfe.a.n(), 2);
            $$0.c(2001, $$4.d(), dfc.i($$4.a()));
         }
      }
   }

   public static void b(dca $$0, dth.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dtg $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), dfe.a);
         }
      }
   }

   @Override
   public dtc a(cyd $$0) {
      return this.n().a(b, $$0.g().g());
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b);
   }

   private dth b() {
      if (this.c == null) {
         this.c = dti.a().a(" ", "#", "#").a('#', dtg.a(dtl.a(dfe.eD))).b();
      }

      return this.c;
   }

   private dth k() {
      if (this.d == null) {
         this.d = dti.a().a("^", "#", "#").a('^', dtg.a(g)).a('#', dtg.a(dtl.a(dfe.eD))).b();
      }

      return this.d;
   }

   private dth s() {
      if (this.e == null) {
         this.e = dti.a().a("~ ~", "###", "~#~").a('#', dtg.a(dtl.a(dfe.cT))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.e;
   }

   private dth y() {
      if (this.f == null) {
         this.f = dti.a().a("~^~", "###", "~#~").a('^', dtg.a(g)).a('#', dtg.a(dtl.a(dfe.cT))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.f;
   }
}
