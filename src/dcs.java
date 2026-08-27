import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dcs extends dft {
   public static final MapCodec<dcs> a = b(dcs::new);
   public static final dpt b = dft.aE;
   @Nullable
   private dpe c;
   @Nullable
   private dpe d;
   @Nullable
   private dpe e;
   @Nullable
   private dpe f;
   private static final Predicate<doz> g = $$0 -> $$0 != null && ($$0.a(dca.ee) || $$0.a(dca.ef));

   @Override
   public MapCodec<? extends dcs> a() {
      return a;
   }

   protected dcs(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.c));
   }

   @Override
   protected void b(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(cza $$0, ib $$1) {
      return this.b().a($$0, $$1) != null || this.s().a($$0, $$1) != null;
   }

   private void a(cyx $$0, ib $$1) {
      dpe.b $$2 = this.k().a($$0, $$1);
      if ($$2 != null) {
         cdb $$3 = bqb.aR.a($$0);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dpe.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            ccp $$5 = bqb.af.a($$0);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(cyx $$0, dpe.b $$1, bpv $$2, ib $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (apt $$4 : $$0.a(apt.class, $$2.cH().g(5.0))) {
         am.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(cyx $$0, dpe.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dpd $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dca.a.n(), 2);
            $$0.c(2001, $$4.d(), dby.i($$4.a()));
         }
      }
   }

   public static void b(cyx $$0, dpe.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dpd $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), dca.a);
         }
      }
   }

   @Override
   public doz a(cuo $$0) {
      return this.n().a(b, $$0.g().g());
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b);
   }

   private dpe b() {
      if (this.c == null) {
         this.c = dpf.a().a(" ", "#", "#").a('#', dpd.a(dpi.a(dca.dP))).b();
      }

      return this.c;
   }

   private dpe k() {
      if (this.d == null) {
         this.d = dpf.a().a("^", "#", "#").a('^', dpd.a(g)).a('#', dpd.a(dpi.a(dca.dP))).b();
      }

      return this.d;
   }

   private dpe s() {
      if (this.e == null) {
         this.e = dpf.a().a("~ ~", "###", "~#~").a('#', dpd.a(dpi.a(dca.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.e;
   }

   private dpe y() {
      if (this.f == null) {
         this.f = dpf.a().a("~^~", "###", "~#~").a('^', dpd.a(g)).a('#', dpd.a(dpi.a(dca.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.f;
   }
}
