import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxd extends ddi {
   public static final MapCodec<cxd> a = b(cxd::new);
   public static final dkb b = djx.R;

   @Override
   public MapCodec<cxd> a() {
      return a;
   }

   public cxd(djg.d $$0) {
      super($$0);
      this.k(this.o().a(b, ic.c));
   }

   @Nullable
   @Override
   public dgv a(hx $$0, djh $$1) {
      return new dha($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgv> dgw<T> a(ctp $$0, djh $$1, dgx<T> $$2) {
      return !$$0.B ? a($$2, dgx.J, ($$0x, $$1x, $$2x, $$3) -> doa.c.a($$0x, $$3.gg(), $$3.gh())) : null;
   }

   @Nullable
   @Override
   public djh a(cph $$0) {
      return super.a($$0).a(b, $$0.g());
   }

   @Override
   public int a(djh $$0, csv $$1, hx $$2, ic $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public djh a(djh $$0, ddc $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djh a(djh $$0, dbm $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
