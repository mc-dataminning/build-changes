import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxc extends ddh {
   public static final MapCodec<cxc> a = b(cxc::new);
   public static final dka b = djw.R;

   @Override
   public MapCodec<cxc> a() {
      return a;
   }

   public cxc(djf.d $$0) {
      super($$0);
      this.k(this.o().a(b, ic.c));
   }

   @Nullable
   @Override
   public dgu a(hx $$0, djg $$1) {
      return new dgz($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgu> dgv<T> a(cto $$0, djg $$1, dgw<T> $$2) {
      return !$$0.B ? a($$2, dgw.J, ($$0x, $$1x, $$2x, $$3) -> dnz.c.a($$0x, $$3.gg(), $$3.gh())) : null;
   }

   @Nullable
   @Override
   public djg a(cpg $$0) {
      return super.a($$0).a(b, $$0.g());
   }

   @Override
   public int a(djg $$0, csu $$1, hx $$2, ic $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public djg a(djg $$0, ddb $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djg a(djg $$0, dbl $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
