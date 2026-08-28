import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dla extends dri {
   public static final MapCodec<dla> a = b(dla::new);
   public static final dys<jm> b = dyl.S;

   @Override
   public MapCodec<dla> a() {
      return a;
   }

   public dla(dxu.d $$0) {
      super($$0);
      this.l(this.m().b(b, jm.c));
   }

   @Nullable
   @Override
   public dux a(jh $$0, dxv $$1) {
      return new dvc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dux> duy<T> a(dhi $$0, dxv $$1, duz<T> $$2) {
      return !$$0.C ? a($$2, duz.K, ($$0x, $$1x, $$2x, $$3) -> eda.c.a($$0x, $$3.gp(), $$3.gq())) : null;
   }

   @Nullable
   @Override
   public dxv a(dbg $$0) {
      return super.a($$0).b(b, $$0.g());
   }

   @Override
   public int a(dxv $$0, dgn $$1, jh $$2, jm $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dxv a(dxv $$0, drc $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dxv a(dxv $$0, dpl $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
