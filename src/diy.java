import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class diy extends dlz {
   public static final MapCodec<diy> a = b(diy::new);
   public static final dwd b = dlz.aF;
   @Nullable
   private dvo c;
   @Nullable
   private dvo d;
   @Nullable
   private dvo e;
   @Nullable
   private dvo f;
   private static final Predicate<dvj> g = $$0 -> $$0 != null && ($$0.a(dig.ee) || $$0.a(dig.ef));

   @Override
   public MapCodec<? extends diy> a() {
      return a;
   }

   protected diy(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c));
   }

   @Override
   protected void b(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(dfe $$0, jh $$1) {
      return this.b().a($$0, $$1) != null || this.r().a($$0, $$1) != null;
   }

   private void a(dfb $$0, jh $$1) {
      dvo.b $$2 = this.q().a($$0, $$1);
      if ($$2 != null) {
         chp $$3 = bul.aS.a($$0, buk.k);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dvo.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            chd $$5 = bul.af.a($$0, buk.k);
            if ($$5 != null) {
               $$5.y(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(dfb $$0, dvo.b $$1, bue $$2, jh $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (aro $$4 : $$0.a(aro.class, $$2.cS().g(5.0))) {
         ao.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(dfb $$0, dvo.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dvn $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dig.a.m(), 2);
            $$0.c(2001, $$4.d(), die.j($$4.a()));
         }
      }
   }

   public static void b(dfb $$0, dvo.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dvn $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), dig.a);
         }
      }
   }

   @Override
   public dvj a(czs $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b);
   }

   private dvo b() {
      if (this.c == null) {
         this.c = dvp.a().a(" ", "#", "#").a('#', dvn.a(dvs.a(dig.dP))).b();
      }

      return this.c;
   }

   private dvo q() {
      if (this.d == null) {
         this.d = dvp.a().a("^", "#", "#").a('^', dvn.a(g)).a('#', dvn.a(dvs.a(dig.dP))).b();
      }

      return this.d;
   }

   private dvo r() {
      if (this.e == null) {
         this.e = dvp.a().a("~ ~", "###", "~#~").a('#', dvn.a(dvs.a(dig.ci))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.e;
   }

   private dvo y() {
      if (this.f == null) {
         this.f = dvp.a().a("~^~", "###", "~#~").a('^', dvn.a(g)).a('#', dvn.a(dvs.a(dig.ci))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.f;
   }
}
