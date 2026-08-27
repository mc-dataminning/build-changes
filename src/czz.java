import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class czz extends dda {
   public static final MapCodec<czz> a = b(czz::new);
   public static final dmy b = dda.aE;
   @Nullable
   private dmj c;
   @Nullable
   private dmj d;
   @Nullable
   private dmj e;
   @Nullable
   private dmj f;
   private static final Predicate<dme> g = $$0 -> $$0 != null && ($$0.a(czh.ee) || $$0.a(czh.ef));

   @Override
   public MapCodec<? extends czz> a() {
      return a;
   }

   protected czz(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.c));
   }

   @Override
   protected void b(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(cwh $$0, ib $$1) {
      return this.b().a($$0, $$1) != null || this.s().a($$0, $$1) != null;
   }

   private void a(cwe $$0, ib $$1) {
      dmj.b $$2 = this.i().a($$0, $$1);
      if ($$2 != null) {
         cbk $$3 = bol.aQ.a($$0);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dmj.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            cay $$5 = bol.ae.a($$0);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(cwe $$0, dmj.b $$1, bof $$2, ib $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (apb $$4 : $$0.a(apb.class, $$2.cE().g(5.0))) {
         am.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(cwe $$0, dmj.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dmi $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), czh.a.o(), 2);
            $$0.c(2001, $$4.d(), czf.i($$4.a()));
         }
      }
   }

   public static void b(cwe $$0, dmj.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dmi $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), czh.a);
         }
      }
   }

   @Override
   public dme a(crx $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b);
   }

   private dmj b() {
      if (this.c == null) {
         this.c = dmk.a().a(" ", "#", "#").a('#', dmi.a(dmn.a(czh.dP))).b();
      }

      return this.c;
   }

   private dmj i() {
      if (this.d == null) {
         this.d = dmk.a().a("^", "#", "#").a('^', dmi.a(g)).a('#', dmi.a(dmn.a(czh.dP))).b();
      }

      return this.d;
   }

   private dmj s() {
      if (this.e == null) {
         this.e = dmk.a().a("~ ~", "###", "~#~").a('#', dmi.a(dmn.a(czh.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.e;
   }

   private dmj y() {
      if (this.f == null) {
         this.f = dmk.a().a("~^~", "###", "~#~").a('^', dmi.a(g)).a('#', dmi.a(dmn.a(czh.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.f;
   }
}
