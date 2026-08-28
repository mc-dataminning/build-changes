import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqz extends dhq {
   public static final MapCodec<dqz> a = b(dqz::new);
   public static final dwm<duw> b = dvz.bz;
   public static final dwd c = dlz.aF;
   public static final dwa d = dvz.bA;

   @Override
   public MapCodec<dqz> a() {
      return a;
   }

   public dqz(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, jm.c).b(b, duw.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   public bsd a(cwb $$0, dvj $$1, dfb $$2, jh $$3, com $$4, bsc $$5, ezj $$6) {
      if (!$$0.f() && $$1.c(b) == duw.b) {
         if ($$2 instanceof arn $$7) {
            if (!($$7.c_($$3) instanceof dur $$8)) {
               return bsd.f;
            }

            dur.b.a($$7, $$3, $$1, $$8.f(), $$8.b(), $$8.c(), $$4, $$0);
         }

         return bsd.b;
      } else {
         return bsd.f;
      }
   }

   @Nullable
   @Override
   public dsm a(jh $$0, dvj $$1) {
      return new dur($$0, $$1);
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(c, b, d);
   }

   @Nullable
   @Override
   public <T extends dsm> dsn<T> a(dfb $$0, dvj $$1, dso<T> $$2) {
      return $$0 instanceof arn $$3
         ? a($$2, dso.R, ($$1x, $$2x, $$3x, $$4) -> dur.b.a($$3, $$2x, $$3x, $$4.f(), $$4.b(), $$4.c()))
         : a($$2, dso.R, ($$0x, $$1x, $$2x, $$3x) -> dur.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public dvj a(czs $$0) {
      return this.m().b(c, $$0.g().g());
   }

   @Override
   public dvj a(dvj $$0, dor $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   public dvj a(dvj $$0, dna $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   public dok a_(dvj $$0) {
      return dok.c;
   }
}
