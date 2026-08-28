import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class dor extends dko implements dri {
   public static final MapCodec<dor> a = b(dor::new);
   public static final dyo<jn> b = dyg.T;
   private final Function<dxq, fcr> c;

   public dor(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, jn.c).b(this.c(), Integer.valueOf(1)));
      this.c = this.q();
   }

   private Function<dxq, fcr> q() {
      return this.a(this.a(b, this.c()));
   }

   @Override
   protected MapCodec<dor> a() {
      return a;
   }

   @Override
   public dxq a(dxq $$0, dqw $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dxq a(dxq $$0, dpf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public boolean a(dxq $$0, dax $$1) {
      return this.a($$0, $$1, this.c()) ? true : super.a($$0, $$1);
   }

   @Override
   public fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return this.c.apply($$0);
   }

   @Override
   public dxq a(dax $$0) {
      return this.a($$0, this, this.c(), b);
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b, this.c());
   }
}
