import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmi extends dss {
   public static final MapCodec<dmi> a = b(dmi::new);
   public static final eam<ja> b = eae.T;

   @Override
   public MapCodec<dmi> a() {
      return a;
   }

   public dmi(dzn.d $$0) {
      super($$0);
      this.l(this.m().b(b, ja.c));
   }

   @Nullable
   @Override
   public dwn a(iu $$0, dzo $$1) {
      return new dwt($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwn> dwo<T> a(dip $$0, dzo $$1, dwp<T> $$2) {
      return !$$0.C ? a($$2, dwp.K, ($$0x, $$1x, $$2x, $$3) -> eex.c.a($$0x, $$3.x(), $$3.gq())) : null;
   }

   @Nullable
   @Override
   public dzo a(dcl $$0) {
      return super.a($$0).b(b, $$0.g());
   }

   @Override
   public int a(dzo $$0, dhv $$1, iu $$2, ja $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dzo a(dzo $$0, dsm $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dzo a(dzo $$0, dqv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
