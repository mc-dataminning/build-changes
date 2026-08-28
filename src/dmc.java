import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dmc extends dqa {
   public static final MapCodec<dmc> a = b(dmc::new);
   public static final ecc<jb> b = drd.e;
   private static final Map<jb.a, fgk> c = fgh.a(
      fgh.a(dnc.b(12.0, 0.0, 4.0), dnc.a(8.0, 10.0, 4.0, 5.0), dnc.a(4.0, 8.0, 5.0, 10.0), dnc.a(10.0, 16.0, 10.0, 16.0))
   );
   private static final xa d = xa.c("container.repair");
   private static final float e = 2.0F;
   private static final int f = 40;

   @Override
   public MapCodec<dmc> a() {
      return a;
   }

   public dmc(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.c));
   }

   @Override
   public ebe a(ddr $$0) {
      return this.m().b(b, $$0.g().h());
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awz.aC);
      }

      return bur.a;
   }

   @Nullable
   @Override
   protected but b(ebe $$0, djx $$1, iv $$2) {
      return new buz(($$2x, $$3, $$4) -> new cvt($$2x, $$3, cwd.a($$1, $$2)), d);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return c.get($$0.c(b).o());
   }

   @Override
   protected void a(cob $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(djx $$0, iv $$1, ebe $$2, ebe $$3, cob $$4) {
      if (!$$4.ba()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(djx $$0, iv $$1, cob $$2) {
      if (!$$2.ba()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bvi a(bwt $$0) {
      return $$0.dW().b($$0);
   }

   @Nullable
   public static ebe e(ebe $$0) {
      if ($$0.a(dne.ht)) {
         return dne.hu.m().b(b, $$0.c(b));
      } else {
         return $$0.a(dne.hu) ? dne.hv.m().b(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }

   @Override
   public int b(ebe $$0, djb $$1, iv $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
