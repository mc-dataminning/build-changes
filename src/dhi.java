import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhi extends dnp {
   public static final MapCodec<dhi> a = b(dhi::new);
   public static final duu b = duq.R;

   @Override
   public MapCodec<dhi> a() {
      return a;
   }

   public dhi(dtz.d $$0) {
      super($$0);
      this.l(this.o().b(b, jj.c));
   }

   @Nullable
   @Override
   public dre a(je $$0, dua $$1) {
      return new drj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dre> drf<T> a(dds $$0, dua $$1, drg<T> $$2) {
      return !$$0.B ? a($$2, drg.J, ($$0x, $$1x, $$2x, $$3) -> dzg.c.a($$0x, $$3.gq(), $$3.gr())) : null;
   }

   @Nullable
   @Override
   public dua a(cyw $$0) {
      return super.a($$0).b(b, $$0.g());
   }

   @Override
   public int a(dua $$0, dcx $$1, je $$2, jj $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dua a(dua $$0, dnj $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dua a(dua $$0, dls $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
