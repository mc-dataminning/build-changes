import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dcw extends ddm implements css {
   public static final dru a = drt.w;
   private final dlc.a b;

   public dcw(dlc.a $$0, drc.d $$1) {
      super($$1);
      this.b = $$0;
      this.k(this.E.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dcw> a();

   @Override
   public doi a(io $$0, drd $$1) {
      return new dpu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends doi> doj<T> a(daz $$0, drd $$1, dok<T> $$2) {
      if ($$0.B) {
         boolean $$3 = $$1.a(dec.gO) || $$1.a(dec.gP) || $$1.a(dec.gQ) || $$1.a(dec.gR);
         if ($$3) {
            return a($$2, dok.p, dpu::a);
         }
      }

      return null;
   }

   public dlc.a b() {
      return this.b;
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
      return false;
   }

   @Override
   public bsd m() {
      return bsd.f;
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(a);
   }

   @Override
   public drd a(cxb $$0) {
      return this.n().a(a, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, dea $$3, io $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.a(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
