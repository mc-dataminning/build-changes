import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dla extends diz implements dqt {
   public static final MapCodec<dla> a = b(dla::new);
   public static final dxp b = dxo.J;
   private static final int d = 3;
   protected static final fbv c = djn.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dla> a() {
      return a;
   }

   public dla(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b);
   }

   @Override
   public dua a(ji $$0, dwy $$1) {
      return new dum($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dua> dub<T> a(dgj $$0, dwy $$1, duc<T> $$2) {
      return a($$2, duc.A, $$0.C ? dum::a : dum::b);
   }

   @Override
   protected eta b_(dwy $$0) {
      return $$0.c(b) ? etb.c.a(false) : super.b_($$0);
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, etb.c, etb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return c;
   }

   @Nullable
   @Override
   public dwy a(dah $$0) {
      eta $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.a(awv.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      return false;
   }
}
