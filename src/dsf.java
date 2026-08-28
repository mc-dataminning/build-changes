import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsf extends dkd {
   public static final MapCodec<dsf> a = b(dsf::new);
   private static final xk d = xk.c("container.stonecutter");
   public static final dyl<jm> b = dob.aF;
   protected static final fcl c = dkd.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<dsf> a() {
      return a;
   }

   public dsf(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c));
   }

   @Override
   public dxo a(dax $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(axf.ay);
      }

      return bta.a;
   }

   @Nullable
   @Override
   protected btc b(dxo $$0, dgz $$1, jh $$2) {
      return new bti(($$2x, $$3, $$4) -> new cuw($$2x, $$3, ctg.a($$1, $$2)), d);
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return c;
   }

   @Override
   protected boolean g_(dxo $$0) {
      return true;
   }

   @Override
   protected dqo a_(dxo $$0) {
      return dqo.c;
   }

   @Override
   protected dxo a(dxo $$0, dqv $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxo a(dxo $$0, dpc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      return false;
   }
}
