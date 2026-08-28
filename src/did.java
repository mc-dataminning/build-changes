import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class did extends dlf {
   public static final MapCodec<did> a = b(did::new);
   public static final dvi b = dlf.aF;
   @Nullable
   private dut c;
   @Nullable
   private dut d;
   @Nullable
   private dut e;
   @Nullable
   private dut f;
   private static final Predicate<duo> g = $$0 -> $$0 != null && ($$0.a(dhl.ee) || $$0.a(dhl.ef));

   @Override
   public MapCodec<? extends did> a() {
      return a;
   }

   protected did(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jj.c));
   }

   @Override
   protected void b(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(dej $$0, je $$1) {
      return this.b().a($$0, $$1) != null || this.y().a($$0, $$1) != null;
   }

   private void a(deg $$0, je $$1) {
      dut.b $$2 = this.l().a($$0, $$1);
      if ($$2 != null) {
         cgy $$3 = btv.aS.a($$0, btu.k);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dut.b $$4 = this.z().a($$0, $$1);
         if ($$4 != null) {
            cgm $$5 = btv.af.a($$0, btu.k);
            if ($$5 != null) {
               $$5.y(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(deg $$0, dut.b $$1, bto $$2, je $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (ari $$4 : $$0.a(ari.class, $$2.cO().g(5.0))) {
         an.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(deg $$0, dut.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dus $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dhl.a.o(), 2);
            $$0.c(2001, $$4.d(), dhj.j($$4.a()));
         }
      }
   }

   public static void b(deg $$0, dut.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dus $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), dhl.a);
         }
      }
   }

   @Override
   public duo a(czk $$0) {
      return this.o().b(b, $$0.g().g());
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b);
   }

   private dut b() {
      if (this.c == null) {
         this.c = duu.a().a(" ", "#", "#").a('#', dus.a(dux.a(dhl.dP))).b();
      }

      return this.c;
   }

   private dut l() {
      if (this.d == null) {
         this.d = duu.a().a("^", "#", "#").a('^', dus.a(g)).a('#', dus.a(dux.a(dhl.dP))).b();
      }

      return this.d;
   }

   private dut y() {
      if (this.e == null) {
         this.e = duu.a().a("~ ~", "###", "~#~").a('#', dus.a(dux.a(dhl.ci))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.e;
   }

   private dut z() {
      if (this.f == null) {
         this.f = duu.a().a("~^~", "###", "~#~").a('^', dus.a(g)).a('#', dus.a(dux.a(dhl.ci))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.f;
   }
}
