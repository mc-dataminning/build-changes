import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcy extends dgu {
   public static final MapCodec<dcy> a = b(dcy::new);
   public static final drv b = dhu.aE;
   private static final evd c = ddy.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final evd d = ddy.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final evd e = ddy.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final evd f = ddy.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final evd g = ddy.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final evd h = ddy.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final evd i = ddy.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final evd j = eva.a(c, d, e, f);
   private static final evd k = eva.a(c, g, h, i);
   private static final wx l = wx.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<dcy> a() {
      return a;
   }

   public dcy(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, it.c));
   }

   @Override
   public drb a(cwz $$0) {
      return this.n().a(b, $$0.g().h());
   }

   @Override
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      if ($$1.B) {
         return bpu.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avr.aC);
         return bpu.b;
      }
   }

   @Nullable
   @Override
   protected bpy b(drb $$0, dax $$1, io $$2) {
      return new bqe(($$2x, $$3, $$4) -> new cov($$2x, $$3, cpe.a($$1, $$2)), l);
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      it $$4 = $$0.c(b);
      return $$4.o() == it.a.a ? j : k;
   }

   @Override
   protected void a(cif $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(dax $$0, io $$1, drb $$2, drb $$3, cif $$4) {
      if (!$$4.aW()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(dax $$0, io $$1, cif $$2) {
      if (!$$2.aW()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bqn a(bru $$0) {
      return $$0.dQ().b($$0);
   }

   @Nullable
   public static drb e(drb $$0) {
      if ($$0.a(dea.gS)) {
         return dea.gT.n().a(b, $$0.c(b));
      } else {
         return $$0.a(dea.gT) ? dea.gU.n().a(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected drb a(drb $$0, dkl $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return false;
   }

   @Override
   public int b(drb $$0, dad $$1, io $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
