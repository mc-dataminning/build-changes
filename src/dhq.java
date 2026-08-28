import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhq extends dll {
   public static final MapCodec<dhq> a = b(dhq::new);
   public static final dws<jm> b = dml.aF;
   private static final fas c = diq.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final fas d = diq.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final fas e = diq.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final fas f = diq.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final fas g = diq.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final fas h = diq.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final fas i = diq.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final fas j = fap.a(c, d, e, f);
   private static final fas k = fap.a(c, g, h, i);
   private static final xj l = xj.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<dhq> a() {
      return a;
   }

   public dhq(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c));
   }

   @Override
   public dvv a(dad $$0) {
      return this.m().b(b, $$0.g().h());
   }

   @Override
   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awx.aC);
      }

      return bsk.a;
   }

   @Nullable
   @Override
   protected bsm b(dvv $$0, dfm $$1, jh $$2) {
      return new bss(($$2x, $$3, $$4) -> new csc($$2x, $$3, csm.a($$1, $$2)), l);
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      jm $$4 = $$0.c(b);
      return $$4.o() == jm.a.a ? j : k;
   }

   @Override
   protected void a(clb $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(dfm $$0, jh $$1, dvv $$2, dvv $$3, clb $$4) {
      if (!$$4.bb()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(dfm $$0, jh $$1, clb $$2) {
      if (!$$2.bb()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public btb a(bul $$0) {
      return $$0.dW().b($$0);
   }

   @Nullable
   public static dvv e(dvv $$0) {
      if ($$0.a(dis.gS)) {
         return dis.gT.m().b(b, $$0.c(b));
      } else {
         return $$0.a(dis.gT) ? dis.gU.m().b(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
      return false;
   }

   @Override
   public int b(dvv $$0, der $$1, jh $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
