import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djr extends djx {
   public static final MapCodec<djr> a = b(djr::new);
   public static final dyr<jm> b = dyk.Q;
   public static final dyl c = dyk.v;

   @Override
   public MapCodec<djr> a() {
      return a;
   }

   public djr(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected bti a(dxu $$0, dhh $$1, jh $$2, cpw $$3, fbt $$4) {
      if ($$1 instanceof ash $$5 && $$1.c_($$2) instanceof dup $$6) {
         $$3.a($$6);
         $$3.a(axp.ar);
         col.a($$5, $$3, true);
      }

      return bti.a;
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      bte.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dxu $$0, ash $$1, jh $$2, bam $$3) {
      duw $$4 = $$1.c_($$2);
      if ($$4 instanceof dup) {
         ((dup)$$4).k();
      }
   }

   @Nullable
   @Override
   public duw a(jh $$0, dxu $$1) {
      return new dup($$0, $$1);
   }

   @Override
   protected dqu a_(dxu $$0) {
      return dqu.c;
   }

   @Override
   protected boolean c_(dxu $$0) {
      return true;
   }

   @Override
   protected int a(dxu $$0, dhh $$1, jh $$2) {
      return ctb.a($$1.c_($$2));
   }

   @Override
   protected dxu a(dxu $$0, drb $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxu a(dxu $$0, dpk $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dxu a(dbf $$0) {
      return this.m().b(b, $$0.d().g());
   }
}
