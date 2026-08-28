import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmo extends dta {
   public static final MapCodec<dmo> a = b(dmo::new);
   public static final eax<ja> b = eap.T;

   @Override
   public MapCodec<dmo> a() {
      return a;
   }

   public dmo(dzy.d $$0) {
      super($$0);
      this.l(this.m().b(b, ja.c));
   }

   @Nullable
   @Override
   public dwx a(iu $$0, dzz $$1) {
      return new dxd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwx> dwy<T> a(div $$0, dzz $$1, dwz<T> $$2) {
      return !$$0.C ? a($$2, dwz.K, ($$0x, $$1x, $$2x, $$3) -> efi.c.a($$0x, $$3.x(), $$3.gq())) : null;
   }

   @Nullable
   @Override
   public dzz a(dcr $$0) {
      return super.a($$0).b(b, $$0.g());
   }

   @Override
   public int a(dzz $$0, dib $$1, iu $$2, ja $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dzz a(dzz $$0, dst $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dzz a(dzz $$0, drc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
