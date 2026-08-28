import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class djp extends dkg {
   public static final dzk<jo> a = dot.e;
   public static final dzd b = dzc.u;

   protected djp(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(a, jo.c).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends djp> a();

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      if (!$$1.C) {
         this.a($$1, $$2, $$3);
      }

      return btq.a;
   }

   protected abstract void a(dhp var1, jj var2, cqi var3);

   @Override
   public dym a(dbn $$0) {
      return this.m().b(a, $$0.g().g());
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, boolean $$3) {
      btm.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(dym $$0) {
      return true;
   }

   @Override
   protected int a(dym $$0, dhp $$1, jj $$2) {
      return ctn.a($$1.c_($$2));
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dym a(dym $$0, dpv $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dvl> dvm<T> a(dhp $$0, dvn<T> $$1, dvn<? extends duy> $$2) {
      return $$0 instanceof arn $$3 ? a($$1, $$2, ($$1x, $$2x, $$3x, $$4) -> duy.a($$3, $$2x, $$3x, $$4)) : null;
   }
}
