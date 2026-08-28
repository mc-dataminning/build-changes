import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class dpc extends djv implements djo {
   public static final MapCodec<dpc> a = b(dpc::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final dxt<jn> d = dxm.U;
   public static final dxv e = dxm.V;
   private static final BiFunction<jn, Integer, fbt> f = af.a(
      ($$0, $$1) -> {
         fbt[] $$2 = new fbt[]{
            djl.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            djl.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            djl.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            djl.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         fbt $$3 = fbq.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = fbq.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<dpc> a() {
      return a;
   }

   protected dpc(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, jn.c).b(e, Integer.valueOf(1)));
   }

   @Override
   public dww a(dww $$0, dqd $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   public dww a(dww $$0, dok $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(dww $$0, daf $$1) {
      return !$$1.h() && $$1.n().a(this.j()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public dww a(daf $$0) {
      dww $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.b(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.m().b(d, $$0.g().g());
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean a(dgk $$0, ji $$1, dww $$2) {
      return true;
   }

   @Override
   public boolean a(dgh $$0, azh $$1, ji $$2, dww $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dww $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.b(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new cwo(this));
      }
   }
}
