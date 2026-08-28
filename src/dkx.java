import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkx extends diw implements dqq {
   public static final MapCodec<dkx> a = b(dkx::new);
   public static final dxm b = dxl.J;
   private static final int d = 3;
   protected static final fbs c = djk.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dkx> a() {
      return a;
   }

   public dkx(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b);
   }

   @Override
   public dtx a(ji $$0, dwv $$1) {
      return new duj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dtx> dty<T> a(dgg $$0, dwv $$1, dtz<T> $$2) {
      return a($$2, dtz.A, $$0.C ? duj::a : duj::b);
   }

   @Override
   protected esx b_(dwv $$0) {
      return $$0.c(b) ? esy.c.a(false) : super.b_($$0);
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, esy.c, esy.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return c;
   }

   @Nullable
   @Override
   public dwv a(dae $$0) {
      esx $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.a(awu.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      return false;
   }
}
