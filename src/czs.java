import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czs extends dfx {
   public static final MapCodec<czs> a = b(czs::new);
   public static final dmy b = dmu.R;

   @Override
   public MapCodec<czs> a() {
      return a;
   }

   public czs(dmd.d $$0) {
      super($$0);
      this.k(this.o().a(b, ih.c));
   }

   @Nullable
   @Override
   public djl a(ib $$0, dme $$1) {
      return new djq($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends djl> djm<T> a(cwe $$0, dme $$1, djn<T> $$2) {
      return !$$0.B ? a($$2, djn.J, ($$0x, $$1x, $$2x, $$3) -> dra.c.a($$0x, $$3.gn(), $$3.go())) : null;
   }

   @Nullable
   @Override
   public dme a(crx $$0) {
      return super.a($$0).a(b, $$0.g());
   }

   @Override
   public int a(dme $$0, cvk $$1, ib $$2, ih $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dme a(dme $$0, dfr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dme a(dme $$0, deb $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
