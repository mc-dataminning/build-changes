import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnw extends dfy {
   public static final MapCodec<dnw> a = b(dnw::new);
   private static final wz d = wz.c("container.stonecutter");
   public static final dtw b = dju.aE;
   protected static final exv c = dfy.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<dnw> a() {
      return a;
   }

   public dnw(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ji.c));
   }

   @Override
   public dtc a(cyd $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected bqr a(dtc $$0, dcw $$1, jd $$2, cmx $$3, ewy $$4) {
      if ($$1.B) {
         return bqr.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avz.ay);
         return bqr.c;
      }
   }

   @Nullable
   @Override
   protected bqv b(dtc $$0, dcw $$1, jd $$2) {
      return new brb(($$2x, $$3, $$4) -> new crw($$2x, $$3, cqg.a($$1, $$2)), d);
   }

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      return c;
   }

   @Override
   protected boolean f_(dtc $$0) {
      return true;
   }

   @Override
   protected dmf a_(dtc $$0) {
      return dmf.c;
   }

   @Override
   protected dtc a(dtc $$0, dmm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dtc a(dtc $$0, dkv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }
}
