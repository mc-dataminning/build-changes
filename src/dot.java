import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dot extends dkd implements drj {
   public static final MapCodec<dot> a = b(dot::new);
   public static final int b = 15;
   public static final dyn c = dye.aS;
   public static final dyf d = dye.J;
   public static final ToIntFunction<dxo> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<dot> a() {
      return a;
   }

   public dot(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(15)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      if (!$$1.C && $$3.gG()) {
         $$1.a($$2, $$0.a(c), 2);
         return bta.b;
      } else {
         return bta.c;
      }
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return $$3.a(cxk.hZ) ? fci.b() : fci.a();
   }

   @Override
   protected boolean e_(dxo $$0) {
      return $$0.y().c();
   }

   @Override
   protected dqo a_(dxo $$0) {
      return dqo.a;
   }

   @Override
   protected float c(dxo $$0, dge $$1, jh $$2) {
      return 1.0F;
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, etr.c, etr.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etq b_(dxo $$0) {
      return $$0.c(d) ? etr.c.a(false) : super.b_($$0);
   }

   @Override
   protected cxg a(dhc $$0, jh $$1, dxo $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(c));
   }

   public static cxg a(cxg $$0, int $$1) {
      if ($$1 != 15) {
         $$0.b(ku.am, czi.a.a(c, $$1));
      }

      return $$0;
   }
}
