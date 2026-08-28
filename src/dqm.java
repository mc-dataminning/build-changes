import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqm extends diz implements dqt {
   public static final MapCodec<dqm> a = b(dqm::new);
   public static final dxp b = dxo.D;
   public static final dxp c = dxo.J;
   public static final dxp d = dxo.f;
   protected static final fbv e = djn.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(jn.a.b);

   @Override
   public MapCodec<dqm> a() {
      return a;
   }

   public dqm(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(dgj $$0, ji $$1, dwy $$2, bum $$3) {
      if ($$0 instanceof ard $$4) {
         are $$5 = dvl.a($$3);
         if ($$5 != null) {
            $$4.a($$1, duc.M).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      if ($$1 instanceof ard $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, duc.M).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, azh $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, duc.M).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected fbv b(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return e;
   }

   @Override
   protected fbv d_(dwy $$0) {
      return e;
   }

   @Override
   protected boolean g_(dwy $$0) {
      return true;
   }

   @Nullable
   @Override
   public dua a(ji $$0, dwy $$1) {
      return new dvl($$0, $$1);
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, etb.c, etb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public dwy a(dah $$0) {
      return this.m().b(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == etb.c));
   }

   @Override
   protected eta b_(dwy $$0) {
      return $$0.c(c) ? etb.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, cwq $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, brn.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dua> dub<T> a(dgj $$0, dwy $$1, duc<T> $$2) {
      return !$$0.C ? diz.a($$2, duc.M, ($$0x, $$1x, $$2x, $$3) -> ecd.c.a($$0x, $$3.gt(), $$3.gu())) : null;
   }
}
