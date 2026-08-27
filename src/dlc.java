import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlc extends dcq implements dgm {
   public static final MapCodec<dlc> a = b(dlc::new);
   public static final drf<drr> b = dqx.bj;

   @Override
   public MapCodec<dlc> a() {
      return a;
   }

   protected dlc(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, drr.b));
   }

   @Override
   public dnm a(in $$0, dqh $$1) {
      return new dpb($$0, $$1);
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      dnm $$5 = $$1.c_($$2);
      if ($$5 instanceof dpb) {
         return ((dpb)$$5).a($$3) ? bpm.a($$1.B) : bpm.d;
      } else {
         return bpm.d;
      }
   }

   @Override
   public void a(dad $$0, in $$1, dqh $$2, @Nullable bsa $$3, csz $$4) {
      if (!$$0.B) {
         if ($$3 != null) {
            dnm $$5 = $$0.c_($$1);
            if ($$5 instanceof dpb) {
               ((dpb)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected djk a_(dqh $$0) {
      return djk.c;
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dde $$3, in $$4, boolean $$5) {
      if ($$1 instanceof aqh) {
         if ($$1.c_($$2) instanceof dpb $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.C();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((aqh)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(aqh $$0, dpb $$1) {
      switch ($$1.u()) {
         case a:
            $$1.b(false);
            break;
         case b:
            $$1.c($$0);
            break;
         case c:
            $$1.A();
         case d:
      }
   }
}
