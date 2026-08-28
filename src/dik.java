import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dik extends dmh {
   public static final MapCodec<dik> a = b(dik::new);
   public static final dxs<jn> b = dni.aF;
   private static final fbs c = djk.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final fbs d = djk.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final fbs e = djk.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final fbs f = djk.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final fbs g = djk.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final fbs h = djk.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final fbs i = djk.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final fbs j = fbp.a(c, d, e, f);
   private static final fbs k = fbp.a(c, g, h, i);
   private static final wo l = wo.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<dik> a() {
      return a;
   }

   public dik(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.c));
   }

   @Override
   public dwv a(dae $$0) {
      return this.m().b(b, $$0.g().h());
   }

   @Override
   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awj.aC);
      }

      return bsi.a;
   }

   @Nullable
   @Override
   protected bsk b(dwv $$0, dgg $$1, ji $$2) {
      return new bsq(($$2x, $$3, $$4) -> new csd($$2x, $$3, csn.a($$1, $$2)), l);
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      jn $$4 = $$0.c(b);
      return $$4.o() == jn.a.a ? j : k;
   }

   @Override
   protected void a(ckz $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(dgg $$0, ji $$1, dwv $$2, dwv $$3, ckz $$4) {
      if (!$$4.bb()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(dgg $$0, ji $$1, ckz $$2) {
      if (!$$2.bb()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bsz a(buj $$0) {
      return $$0.dX().b($$0);
   }

   @Nullable
   public static dwv e(dwv $$0) {
      if ($$0.a(djm.hp)) {
         return djm.hq.m().b(b, $$0.c(b));
      } else {
         return $$0.a(djm.hq) ? djm.hr.m().b(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected dwv a(dwv $$0, dqc $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      return false;
   }

   @Override
   public int b(dwv $$0, dfl $$1, ji $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
