import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dmw extends dij implements dpk {
   public static final MapCodec<dmw> a = b(dmw::new);
   public static final int b = 15;
   public static final dwn c = dwe.aP;
   public static final dwf d = dwe.C;
   public static final ToIntFunction<dvo> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<dmw> a() {
      return a;
   }

   public dmw(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(15)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      if (!$$1.C && $$3.gJ()) {
         $$1.a($$2, $$0.a(c), 2);
         return bsh.b;
      } else {
         return bsh.c;
      }
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return $$3.a(cwj.hC) ? fai.b() : fai.a();
   }

   @Override
   protected boolean e_(dvo $$0) {
      return $$0.y().c();
   }

   @Override
   protected dop a_(dvo $$0) {
      return dop.a;
   }

   @Override
   protected float c(dvo $$0, dek $$1, jh $$2) {
      return 1.0F;
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, erp.c, erp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ero b_(dvo $$0) {
      return $$0.c(d) ? erp.c.a(false) : super.b_($$0);
   }

   @Override
   public cwf a(dfi $$0, jh $$1, dvo $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(c));
   }

   public static cwf a(cwf $$0, int $$1) {
      if ($$1 != 15) {
         $$0.b(ku.am, cyh.a.a(c, $$1));
      }

      return $$0;
   }
}
