import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class daw extends ddx {
   public static final MapCodec<daw> a = b(daw::new);
   public static final dnv b = ddx.aE;
   @Nullable
   private dng c;
   @Nullable
   private dng d;
   @Nullable
   private dng e;
   @Nullable
   private dng f;
   private static final Predicate<dnb> g = $$0 -> $$0 != null && ($$0.a(dae.ee) || $$0.a(dae.ef));

   @Override
   public MapCodec<? extends daw> a() {
      return a;
   }

   protected daw(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.c));
   }

   @Override
   protected void b(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(cxe $$0, ib $$1) {
      return this.b().a($$0, $$1) != null || this.s().a($$0, $$1) != null;
   }

   private void a(cxb $$0, ib $$1) {
      dng.b $$2 = this.i().a($$0, $$1);
      if ($$2 != null) {
         ccc $$3 = bpd.aS.a($$0);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dng.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            cbq $$5 = bpd.ag.a($$0);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(cxb $$0, dng.b $$1, box $$2, ib $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (apg $$4 : $$0.a(apg.class, $$2.cH().g(5.0))) {
         am.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(cxb $$0, dng.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dnf $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dae.a.o(), 2);
            $$0.c(2001, $$4.d(), dac.i($$4.a()));
         }
      }
   }

   public static void b(cxb $$0, dng.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dnf $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), dae.a);
         }
      }
   }

   @Override
   public dnb a(csu $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b);
   }

   private dng b() {
      if (this.c == null) {
         this.c = dnh.a().a(" ", "#", "#").a('#', dnf.a(dnk.a(dae.dP))).b();
      }

      return this.c;
   }

   private dng i() {
      if (this.d == null) {
         this.d = dnh.a().a("^", "#", "#").a('^', dnf.a(g)).a('#', dnf.a(dnk.a(dae.dP))).b();
      }

      return this.d;
   }

   private dng s() {
      if (this.e == null) {
         this.e = dnh.a().a("~ ~", "###", "~#~").a('#', dnf.a(dnk.a(dae.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.e;
   }

   private dng y() {
      if (this.f == null) {
         this.f = dnh.a().a("~^~", "###", "~#~").a('^', dnf.a(g)).a('#', dnf.a(dnk.a(dae.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.f;
   }
}
