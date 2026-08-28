import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmu extends dtg {
   public static final MapCodec<dmu> a = b(dmu::new);
   public static final ebf<ja> b = eax.T;

   @Override
   public MapCodec<dmu> a() {
      return a;
   }

   public dmu(eag.d $$0) {
      super($$0);
      this.l(this.m().b(b, ja.c));
   }

   @Nullable
   @Override
   public dxf a(iu $$0, eah $$1) {
      return new dxl($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxf> dxg<T> a(dja $$0, eah $$1, dxh<T> $$2) {
      return !$$0.C ? a($$2, dxh.K, ($$0x, $$1x, $$2x, $$3) -> efq.c.a($$0x, $$3.x(), $$3.gr())) : null;
   }

   @Nullable
   @Override
   public eah a(dcw $$0) {
      return super.a($$0).b(b, $$0.g());
   }

   @Override
   public int a(eah $$0, dig $$1, iu $$2, ja $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public eah a(eah $$0, dsz $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public eah a(eah $$0, dri $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
