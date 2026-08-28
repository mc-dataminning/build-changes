import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dis extends dlt {
   public static final MapCodec<dis> a = b(dis::new);
   public static final dvx b = dlt.aF;
   @Nullable
   private dvi c;
   @Nullable
   private dvi d;
   @Nullable
   private dvi e;
   @Nullable
   private dvi f;
   private static final Predicate<dvd> g = $$0 -> $$0 != null && ($$0.a(dia.ee) || $$0.a(dia.ef));

   @Override
   public MapCodec<? extends dis> a() {
      return a;
   }

   protected dis(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jl.c));
   }

   @Override
   protected void b(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(dey $$0, jg $$1) {
      return this.b().a($$0, $$1) != null || this.r().a($$0, $$1) != null;
   }

   private void a(dev $$0, jg $$1) {
      dvi.b $$2 = this.q().a($$0, $$1);
      if ($$2 != null) {
         chk $$3 = bug.aS.a($$0, buf.k);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dvi.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            cgy $$5 = bug.af.a($$0, buf.k);
            if ($$5 != null) {
               $$5.y(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(dev $$0, dvi.b $$1, btz $$2, jg $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (arn $$4 : $$0.a(arn.class, $$2.cS().g(5.0))) {
         an.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(dev $$0, dvi.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dvh $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dia.a.m(), 2);
            $$0.c(2001, $$4.d(), dhy.j($$4.a()));
         }
      }
   }

   public static void b(dev $$0, dvi.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dvh $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), dia.a);
         }
      }
   }

   @Override
   public dvd a(czm $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b);
   }

   private dvi b() {
      if (this.c == null) {
         this.c = dvj.a().a(" ", "#", "#").a('#', dvh.a(dvm.a(dia.dP))).b();
      }

      return this.c;
   }

   private dvi q() {
      if (this.d == null) {
         this.d = dvj.a().a("^", "#", "#").a('^', dvh.a(g)).a('#', dvh.a(dvm.a(dia.dP))).b();
      }

      return this.d;
   }

   private dvi r() {
      if (this.e == null) {
         this.e = dvj.a().a("~ ~", "###", "~#~").a('#', dvh.a(dvm.a(dia.ci))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.e;
   }

   private dvi y() {
      if (this.f == null) {
         this.f = dvj.a().a("~^~", "###", "~#~").a('^', dvh.a(g)).a('#', dvh.a(dvm.a(dia.ci))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.f;
   }
}
