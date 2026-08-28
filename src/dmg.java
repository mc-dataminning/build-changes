import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmg extends dhq {
   public static final MapCodec<dmg> a = b(dmg::new);
   public static final dwa b = dvz.n;

   @Override
   public MapCodec<dmg> a() {
      return a;
   }

   protected dmg(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(dfb $$0, jh $$1, dvj $$2, @Nullable bva $$3, cwb $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      cyk $$5 = $$4.a(ku.Y, cyk.a);
      if ($$5.a("RecordItem")) {
         $$0.a($$1, $$2.b(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dtp $$5) {
         $$5.t();
         return bsd.a;
      } else {
         return bsd.e;
      }
   }

   @Override
   protected bsd a(cwb $$0, dvj $$1, dfb $$2, jh $$3, com $$4, bsc $$5, ezj $$6) {
      if ($$1.c(b)) {
         return bsd.f;
      } else {
         cwb $$7 = $$4.b($$5);
         bsd $$8 = cwg.a($$2, $$3, $$7, $$4);
         return (bsd)(!$$8.a() ? bsd.f : $$8);
      }
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dtp $$5) {
            $$5.t();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dsm a(jh $$0, dvj $$1) {
      return new dtp($$0, $$1);
   }

   @Override
   public boolean f_(dvj $$0) {
      return true;
   }

   @Override
   public int a(dvj $$0, deg $$1, jh $$2, jm $$3) {
      if ($$1.c_($$2) instanceof dtp $$4 && $$4.j().a()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean c_(dvj $$0) {
      return true;
   }

   @Override
   protected int a(dvj $$0, dfb $$1, jh $$2) {
      return $$1.c_($$2) instanceof dtp $$3 ? $$3.u() : 0;
   }

   @Override
   protected dok a_(dvj $$0) {
      return dok.c;
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dsm> dsn<T> a(dfb $$0, dvj $$1, dso<T> $$2) {
      return $$1.c(b) ? a($$2, dso.e, dtp::a) : null;
   }
}
