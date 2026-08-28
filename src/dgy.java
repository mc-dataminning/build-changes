import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgy extends dkt {
   public static final MapCodec<dgy> a = b(dgy::new);
   public static final dvx b = dlt.aF;
   private static final fab c = dhy.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final fab d = dhy.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final fab e = dhy.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final fab f = dhy.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final fab g = dhy.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final fab h = dhy.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final fab i = dhy.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final fab j = ezy.a(c, d, e, f);
   private static final fab k = ezy.a(c, g, h, i);
   private static final xh l = xh.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<dgy> a() {
      return a;
   }

   public dgy(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jl.c));
   }

   @Override
   public dvd a(czm $$0) {
      return this.m().b(b, $$0.g().h());
   }

   @Override
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awu.aC);
      }

      return bry.a;
   }

   @Nullable
   @Override
   protected bsa b(dvd $$0, dev $$1, jg $$2) {
      return new bsg(($$2x, $$3, $$4) -> new crm($$2x, $$3, crw.a($$1, $$2)), l);
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      jl $$4 = $$0.c(b);
      return $$4.o() == jl.a.a ? j : k;
   }

   @Override
   protected void a(ckp $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(dev $$0, jg $$1, dvd $$2, dvd $$3, ckp $$4) {
      if (!$$4.bc()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(dev $$0, jg $$1, ckp $$2) {
      if (!$$2.bc()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bsp a(btz $$0) {
      return $$0.dY().b($$0);
   }

   @Nullable
   public static dvd e(dvd $$0) {
      if ($$0.a(dia.gS)) {
         return dia.gT.m().b(b, $$0.c(b));
      } else {
         return $$0.a(dia.gT) ? dia.gU.m().b(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return false;
   }

   @Override
   public int b(dvd $$0, dea $$1, jg $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
