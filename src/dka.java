import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dka extends dqk {
   public static final MapCodec<dka> a = b(dka::new);
   public static final dxu<jn> b = dxn.U;

   @Override
   public MapCodec<dka> a() {
      return a;
   }

   public dka(dww.d $$0) {
      super($$0);
      this.l(this.m().b(b, jn.c));
   }

   @Nullable
   @Override
   public dtz a(ji $$0, dwx $$1) {
      return new due($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dtz> dua<T> a(dgi $$0, dwx $$1, dub<T> $$2) {
      return !$$0.C ? a($$2, dub.K, ($$0x, $$1x, $$2x, $$3) -> ecc.c.a($$0x, $$3.gt(), $$3.gu())) : null;
   }

   @Nullable
   @Override
   public dwx a(dag $$0) {
      return super.a($$0).b(b, $$0.g());
   }

   @Override
   public int a(dwx $$0, dfn $$1, ji $$2, jn $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dwx a(dwx $$0, dqe $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dwx a(dwx $$0, dol $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
