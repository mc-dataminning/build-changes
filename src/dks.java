import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dks extends drc {
   public static final MapCodec<dks> a = b(dks::new);
   public static final dyo<jn> b = dyg.T;

   @Override
   public MapCodec<dks> a() {
      return a;
   }

   public dks(dxp.d $$0) {
      super($$0);
      this.l(this.m().b(b, jn.c));
   }

   @Nullable
   @Override
   public dus a(ji $$0, dxq $$1) {
      return new dux($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dus> dut<T> a(dgz $$0, dxq $$1, duu<T> $$2) {
      return !$$0.C ? a($$2, duu.K, ($$0x, $$1x, $$2x, $$3) -> ecy.c.a($$0x, $$3.x(), $$3.gs())) : null;
   }

   @Nullable
   @Override
   public dxq a(dax $$0) {
      return super.a($$0).b(b, $$0.g());
   }

   @Override
   public int a(dxq $$0, dgf $$1, ji $$2, jn $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      super.a($$0);
      $$0.a(b);
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
   public int c() {
      return 10;
   }
}
