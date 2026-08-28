import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class dpt extends dko implements dkh {
   public static final MapCodec<dpt> a = b(dpt::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final dyk<jm> d = dyd.S;
   public static final dym e = dyd.T;
   private static final BiFunction<jm, Integer, fcm> f = ae.a(
      ($$0, $$1) -> {
         fcm[] $$2 = new fcm[]{
            dke.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            dke.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            dke.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            dke.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         fcm $$3 = fcj.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = fcj.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<dpt> a() {
      return a;
   }

   protected dpt(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, jm.c).b(e, Integer.valueOf(1)));
   }

   @Override
   public dxn a(dxn $$0, dqu $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   public dxn a(dxn $$0, dpd $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(dxn $$0, dbb $$1) {
      return !$$1.h() && $$1.n().a(this.j()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public dxn a(dbb $$0) {
      dxn $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.b(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.m().b(d, $$0.g().g());
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean b(dhd $$0, jh $$1, dxn $$2) {
      return true;
   }

   @Override
   public boolean a(dha $$0, bam $$1, jh $$2, dxn $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxn $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.b(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new cxk(this));
      }
   }
}
