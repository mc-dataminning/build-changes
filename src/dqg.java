import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqg extends dij {
   public static final MapCodec<dqg> a = b(dqg::new);
   private static final xl d = xl.c("container.stonecutter");
   public static final dwl<jm> b = dme.aF;
   protected static final fal c = dij.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<dqg> a() {
      return a;
   }

   public dqg(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c));
   }

   @Override
   public dvo a(czw $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awy.ay);
      }

      return bsh.a;
   }

   @Nullable
   @Override
   protected bsj b(dvo $$0, dff $$1, jh $$2) {
      return new bsp(($$2x, $$3, $$4) -> new ctv($$2x, $$3, csf.a($$1, $$2)), d);
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return c;
   }

   @Override
   protected boolean g_(dvo $$0) {
      return true;
   }

   @Override
   protected dop a_(dvo $$0) {
      return dop.c;
   }

   @Override
   protected dvo a(dvo $$0, dow $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvo a(dvo $$0, dnf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return false;
   }
}
