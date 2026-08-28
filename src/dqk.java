import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqk extends dix implements dqr {
   public static final MapCodec<dqk> a = b(dqk::new);
   public static final dxn b = dxm.D;
   public static final dxn c = dxm.J;
   public static final dxn d = dxm.f;
   protected static final fbt e = djl.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(jn.a.b);

   @Override
   public MapCodec<dqk> a() {
      return a;
   }

   public dqk(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(dgh $$0, ji $$1, dww $$2, buk $$3) {
      if ($$0 instanceof ard $$4) {
         are $$5 = dvj.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dua.M).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, dww $$3, boolean $$4) {
      if ($$1 instanceof ard $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, dua.M).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dww $$0, ard $$1, ji $$2, azh $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dua.M).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected fbt b(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return e;
   }

   @Override
   protected fbt d_(dww $$0) {
      return e;
   }

   @Override
   protected boolean g_(dww $$0) {
      return true;
   }

   @Nullable
   @Override
   public dty a(ji $$0, dww $$1) {
      return new dvj($$0, $$1);
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, esz.c, esz.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public dww a(daf $$0) {
      return this.m().b(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == esz.c));
   }

   @Override
   protected esy b_(dww $$0) {
      return $$0.c(c) ? esz.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dww $$0, ard $$1, ji $$2, cwo $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, brl.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dty> dtz<T> a(dgh $$0, dww $$1, dua<T> $$2) {
      return !$$0.C ? dix.a($$2, dua.M, ($$0x, $$1x, $$2x, $$3) -> ecb.c.a($$0x, $$3.gt(), $$3.gu())) : null;
   }
}
