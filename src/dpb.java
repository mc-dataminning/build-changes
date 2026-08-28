import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dpb extends dkl implements drp {
   public static final MapCodec<dpb> a = b(dpb::new);
   public static final int b = 15;
   public static final dyt c = dyk.aQ;
   public static final dyl d = dyk.D;
   public static final ToIntFunction<dxu> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<dpb> a() {
      return a;
   }

   public dpb(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(15)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected bti a(dxu $$0, dhh $$1, jh $$2, cpw $$3, fbt $$4) {
      if (!$$1.C && $$3.gE()) {
         $$1.a($$2, $$0.a(c), 2);
         return bti.b;
      } else {
         return bti.c;
      }
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return $$3.a(cxs.hQ) ? fco.b() : fco.a();
   }

   @Override
   protected boolean e_(dxu $$0) {
      return $$0.y().c();
   }

   @Override
   protected dqu a_(dxu $$0) {
      return dqu.a;
   }

   @Override
   protected float c(dxu $$0, dgm $$1, jh $$2) {
      return 1.0F;
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etw b_(dxu $$0) {
      return $$0.c(d) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   public cxo a(dhk $$0, jh $$1, dxu $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(c));
   }

   public static cxo a(cxo $$0, int $$1) {
      if ($$1 != 15) {
         $$0.b(ku.am, czq.a.a(c, $$1));
      }

      return $$0;
   }
}
