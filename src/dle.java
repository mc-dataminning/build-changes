import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dle extends dqu implements drj {
   public static final MapCodec<dle> a = b(dle::new);
   public static final dyf b = dye.J;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final fcl e = dkd.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final fcl f = dkd.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final fcl g = dkd.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<dle> a() {
      return a;
   }

   public dle(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(i, jm.a.b));
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      switch ((jm.a)$$0.c(i)) {
         case a:
         default:
            return g;
         case c:
            return f;
         case b:
            return e;
      }
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
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   protected etq b_(dxo $$0) {
      return $$0.c(b) ? etr.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      return false;
   }
}
