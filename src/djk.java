import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djk extends djq {
   public static final MapCodec<djk> a = b(djk::new);
   public static final dyo<jn> b = dyg.R;
   public static final dyh c = dyg.y;

   @Override
   public MapCodec<djk> a() {
      return a;
   }

   public djk(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, jn.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      if ($$1 instanceof ard $$5 && $$1.c_($$2) instanceof dul $$6) {
         $$3.a($$6);
         $$3.a(awk.ar);
         cog.a($$5, $$3, true);
      }

      return bsy.a;
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, boolean $$3) {
      bsu.a($$0, $$1, $$2);
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      dus $$4 = $$1.c_($$2);
      if ($$4 instanceof dul) {
         ((dul)$$4).k();
      }
   }

   @Nullable
   @Override
   public dus a(ji $$0, dxq $$1) {
      return new dul($$0, $$1);
   }

   @Override
   protected boolean c_(dxq $$0) {
      return true;
   }

   @Override
   protected int a(dxq $$0, dgz $$1, ji $$2) {
      return csw.a($$1.c_($$2));
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dxq a(dax $$0) {
      return this.m().b(b, $$0.d().g());
   }
}
