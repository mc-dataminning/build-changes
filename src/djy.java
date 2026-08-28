import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djy extends dqi {
   public static final MapCodec<djy> a = b(djy::new);
   public static final dxs<jn> b = dxl.U;

   @Override
   public MapCodec<djy> a() {
      return a;
   }

   public djy(dwu.d $$0) {
      super($$0);
      this.l(this.m().b(b, jn.c));
   }

   @Nullable
   @Override
   public dtx a(ji $$0, dwv $$1) {
      return new duc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dtx> dty<T> a(dgg $$0, dwv $$1, dtz<T> $$2) {
      return !$$0.C ? a($$2, dtz.K, ($$0x, $$1x, $$2x, $$3) -> eca.c.a($$0x, $$3.gq(), $$3.gr())) : null;
   }

   @Nullable
   @Override
   public dwv a(dae $$0) {
      return super.a($$0).b(b, $$0.g());
   }

   @Override
   public int a(dwv $$0, dfl $$1, ji $$2, jn $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dwv a(dwv $$0, dqc $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dwv a(dwv $$0, doj $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
