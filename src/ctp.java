import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ctp extends czt {
   public static final MapCodec<ctp> a = b(ctp::new);
   public static final dfx b = dft.R;

   @Override
   public MapCodec<ctp> a() {
      return a;
   }

   public ctp(dfc.d $$0) {
      super($$0);
      this.k(this.o().a(b, ha.c));
   }

   @Nullable
   @Override
   public dcz a(gw $$0, dfd $$1) {
      return new dde($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcz> dda<T> a(cqb $$0, dfd $$1, ddb<T> $$2) {
      return !$$0.B ? a($$2, ddb.J, ($$0x, $$1x, $$2x, $$3) -> djw.c.a($$0x, $$3.gg(), $$3.gh())) : null;
   }

   @Nullable
   @Override
   public dfd a(clt $$0) {
      return super.a($$0).a(b, $$0.g());
   }

   @Override
   public int a(dfd $$0, cph $$1, gw $$2, ha $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dfd a(dfd $$0, cxx $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
