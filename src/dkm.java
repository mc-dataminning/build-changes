import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkm extends din {
   public static final MapCodec<dkm> a = b(dkm::new);
   public static final dwh<dwf> b = dvz.ae;

   @Override
   public MapCodec<? extends dkm> a() {
      return a;
   }

   public dkm(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dwf.b));
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      dwf $$6 = $$0.c(b);
      if ($$1.o() != jm.a.b || $$6 == dwf.b != ($$1 == jm.b) || $$2.a(this) && $$2.c(b) != $$6) {
         return $$6 == dwf.b && $$1 == jm.a && !$$0.a($$3, $$4) ? dig.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return dig.a.m();
      }
   }

   @Nullable
   @Override
   public dvj a(czs $$0) {
      jh $$1 = $$0.a();
      dfb $$2 = $$0.q();
      return $$1.v() < $$2.al() && $$2.a_($$1.d()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(dfb $$0, jh $$1, dvj $$2, bva $$3, cwb $$4) {
      jh $$5 = $$1.d();
      $$0.a($$5, c($$0, $$5, this.m().b(b, dwf.a)), 3);
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      if ($$0.c(b) != dwf.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dvj $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(b) == dwf.b;
      }
   }

   public static void a(dfc $$0, dvj $$1, jh $$2, int $$3) {
      jh $$4 = $$2.d();
      $$0.a($$2, c($$0, $$2, $$1.b(b, dwf.b)), $$3);
      $$0.a($$4, c($$0, $$4, $$1.b(b, dwf.a)), $$3);
   }

   public static dvj c(dfe $$0, jh $$1, dvj $$2) {
      return $$2.b(dvz.C) ? $$2.b(dvz.C, Boolean.valueOf($$0.z($$1))) : $$2;
   }

   @Override
   public dvj a(dfb $$0, jh $$1, dvj $$2, com $$3) {
      if (!$$0.C) {
         if ($$3.f()) {
            b($$0, $$1, $$2, $$3);
         } else {
            a($$2, $$0, $$1, null, $$3, $$3.fb());
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dfb $$0, com $$1, jh $$2, dvj $$3, @Nullable dsm $$4, cwb $$5) {
      super.a($$0, $$1, $$2, dig.a.m(), $$4, $$5);
   }

   protected static void b(dfb $$0, jh $$1, dvj $$2, com $$3) {
      dwf $$4 = $$2.c(b);
      if ($$4 == dwf.a) {
         jh $$5 = $$1.e();
         dvj $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == dwf.b) {
            dvj $$7 = $$6.y().b(erl.c) ? dig.G.m() : dig.a.m();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, die.j($$6));
         }
      }
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(dvj $$0, jh $$1) {
      return azk.b($$1.u(), $$1.c($$0.c(b) == dwf.b ? 0 : 1).v(), $$1.w());
   }
}
