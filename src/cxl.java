import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxl extends ddq {
   public static final MapCodec<cxl> a = b(cxl::new);
   public static final dkj b = dkf.R;

   @Override
   public MapCodec<cxl> a() {
      return a;
   }

   public cxl(djo.d $$0) {
      super($$0);
      this.k(this.o().a(b, ic.c));
   }

   @Nullable
   @Override
   public dhd a(hx $$0, djp $$1) {
      return new dhi($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dhd> dhe<T> a(ctx $$0, djp $$1, dhf<T> $$2) {
      return !$$0.B ? a($$2, dhf.J, ($$0x, $$1x, $$2x, $$3) -> doi.c.a($$0x, $$3.gh(), $$3.gi())) : null;
   }

   @Nullable
   @Override
   public djp a(cpp $$0) {
      return super.a($$0).a(b, $$0.g());
   }

   @Override
   public int a(djp $$0, ctd $$1, hx $$2, ic $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
