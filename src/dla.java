import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dla extends dox {
   public static final MapCodec<dla> a = b(dla::new);
   public static final eax<ja> b = dqa.e;
   private static final Map<ja.a, ffc> c = fez.a(
      fez.a(dma.b(12.0, 0.0, 4.0), dma.a(8.0, 10.0, 4.0, 5.0), dma.a(4.0, 8.0, 5.0, 10.0), dma.a(10.0, 16.0, 10.0, 16.0))
   );
   private static final wy d = wy.c("container.repair");
   private static final float e = 2.0F;
   private static final int f = 40;

   @Override
   public MapCodec<dla> a() {
      return a;
   }

   public dla(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, ja.c));
   }

   @Override
   public dzz a(dcr $$0) {
      return this.m().b(b, $$0.g().h());
   }

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awx.aC);
      }

      return bub.a;
   }

   @Nullable
   @Override
   protected bud b(dzz $$0, div $$1, iu $$2) {
      return new buj(($$2x, $$3, $$4) -> new cut($$2x, $$3, cvd.a($$1, $$2)), d);
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return c.get($$0.c(b).o());
   }

   @Override
   protected void a(cnc $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(div $$0, iu $$1, dzz $$2, dzz $$3, cnc $$4) {
      if (!$$4.bb()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(div $$0, iu $$1, cnc $$2) {
      if (!$$2.bb()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bus a(bwd $$0) {
      return $$0.dW().b($$0);
   }

   @Nullable
   public static dzz e(dzz $$0) {
      if ($$0.a(dmc.hq)) {
         return dmc.hr.m().b(b, $$0.c(b));
      } else {
         return $$0.a(dmc.hr) ? dmc.hs.m().b(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return false;
   }

   @Override
   public int b(dzz $$0, dib $$1, iu $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
