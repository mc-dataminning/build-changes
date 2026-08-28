import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkb extends dql {
   public static final MapCodec<dkb> a = b(dkb::new);
   public static final dxv<jn> b = dxo.U;

   @Override
   public MapCodec<dkb> a() {
      return a;
   }

   public dkb(dwx.d $$0) {
      super($$0);
      this.l(this.m().b(b, jn.c));
   }

   @Nullable
   @Override
   public dua a(ji $$0, dwy $$1) {
      return new duf($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dua> dub<T> a(dgj $$0, dwy $$1, duc<T> $$2) {
      return !$$0.C ? a($$2, duc.K, ($$0x, $$1x, $$2x, $$3) -> ecd.c.a($$0x, $$3.gt(), $$3.gu())) : null;
   }

   @Nullable
   @Override
   public dwy a(dah $$0) {
      return super.a($$0).b(b, $$0.g());
   }

   @Override
   public int a(dwy $$0, dfo $$1, ji $$2, jn $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dwy a(dwy $$0, dqf $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dwy a(dwy $$0, dom $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
