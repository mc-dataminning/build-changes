import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djj extends djp {
   public static final MapCodec<djj> a = b(djj::new);
   public static final dyl<jm> b = dye.S;
   public static final dyf c = dye.z;

   @Override
   public MapCodec<djj> a() {
      return a;
   }

   public djj(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      if ($$1 instanceof arx $$5 && $$1.c_($$2) instanceof duj $$6) {
         $$3.a($$6);
         $$3.a(axf.ar);
         cod.a($$5, $$3, true);
      }

      return bta.a;
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      bsw.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, bac $$3) {
      duq $$4 = $$1.c_($$2);
      if ($$4 instanceof duj) {
         ((duj)$$4).k();
      }
   }

   @Nullable
   @Override
   public duq a(jh $$0, dxo $$1) {
      return new duj($$0, $$1);
   }

   @Override
   protected dqo a_(dxo $$0) {
      return dqo.c;
   }

   @Override
   protected boolean c_(dxo $$0) {
      return true;
   }

   @Override
   protected int a(dxo $$0, dgz $$1, jh $$2) {
      return cst.a($$1.c_($$2));
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
      $$0.a(b, c);
   }

   @Override
   public dxo a(dax $$0) {
      return this.m().b(b, $$0.d().g());
   }
}
