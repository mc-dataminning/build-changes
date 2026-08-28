import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpj extends dkl implements drp {
   public static final MapCodec<dpj> a = b(dpj::new);
   public static final dyl b = dyk.D;

   @Override
   public MapCodec<dpj> a() {
      return a;
   }

   protected dpj(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean b(dxu $$0, dxu $$1, jm $$2) {
      return $$1.a(dkn.ag) && $$2.o() == jm.a.b;
   }

   @Nullable
   @Override
   public dxu a(dbf $$0) {
      etw $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == etx.c;
      return super.a($$0).b(b, Boolean.valueOf($$2));
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etw b_(dxu $$0) {
      return $$0.c(b) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b);
   }
}
