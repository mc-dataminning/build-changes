import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czf extends dfk {
   public static final MapCodec<czf> a = b(czf::new);
   public static final dmd b = dlz.R;

   @Override
   public MapCodec<czf> a() {
      return a;
   }

   public czf(dli.d $$0) {
      super($$0);
      this.k(this.o().a(b, ie.c));
   }

   @Nullable
   @Override
   public dix a(hz $$0, dlj $$1) {
      return new djc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dix> diy<T> a(cvr $$0, dlj $$1, diz<T> $$2) {
      return !$$0.B ? a($$2, diz.J, ($$0x, $$1x, $$2x, $$3) -> dqf.c.a($$0x, $$3.gi(), $$3.gj())) : null;
   }

   @Nullable
   @Override
   public dlj a(crk $$0) {
      return super.a($$0).a(b, $$0.g());
   }

   @Override
   public int a(dlj $$0, cux $$1, hz $$2, ie $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dlj a(dlj $$0, dfe $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dlj a(dlj $$0, ddo $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
