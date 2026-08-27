import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlv extends ddy {
   public static final MapCodec<dlv> a = b(dlv::new);
   private static final wx d = wx.c("container.stonecutter");
   public static final drv b = dhu.aE;
   protected static final evd c = ddy.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<dlv> a() {
      return a;
   }

   public dlv(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, it.c));
   }

   @Override
   public drb a(cwz $$0) {
      return this.n().a(b, $$0.g().g());
   }

   @Override
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      if ($$1.B) {
         return bpu.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avr.ay);
         return bpu.b;
      }
   }

   @Nullable
   @Override
   protected bpy b(drb $$0, dax $$1, io $$2) {
      return new bqe(($$2x, $$3, $$4) -> new cqu($$2x, $$3, cpe.a($$1, $$2)), d);
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return c;
   }

   @Override
   protected boolean f_(drb $$0) {
      return true;
   }

   @Override
   protected dke a_(drb $$0) {
      return dke.c;
   }

   @Override
   protected drb a(drb $$0, dkl $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drb a(drb $$0, div $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return false;
   }
}
