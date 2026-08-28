import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpb extends dkd implements drj {
   public static final MapCodec<dpb> a = b(dpb::new);
   public static final dyf b = dye.J;

   @Override
   public MapCodec<dpb> a() {
      return a;
   }

   protected dpb(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean b(dxo $$0, dxo $$1, jm $$2) {
      return $$1.a(dkf.ag) && $$2.o() == jm.a.b;
   }

   @Nullable
   @Override
   public dxo a(dax $$0) {
      etq $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == etr.c;
      return super.a($$0).b(b, Boolean.valueOf($$2));
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, etr.c, etr.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etq b_(dxo $$0) {
      return $$0.c(b) ? etr.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b);
   }
}
