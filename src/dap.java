import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dap extends dgu {
   public static final MapCodec<dap> a = b(dap::new);
   public static final dnv b = dnr.R;

   @Override
   public MapCodec<dap> a() {
      return a;
   }

   public dap(dna.d $$0) {
      super($$0);
      this.k(this.o().a(b, ih.c));
   }

   @Nullable
   @Override
   public dki a(ib $$0, dnb $$1) {
      return new dkn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dki> dkj<T> a(cxb $$0, dnb $$1, dkk<T> $$2) {
      return !$$0.B ? a($$2, dkk.J, ($$0x, $$1x, $$2x, $$3) -> dry.c.a($$0x, $$3.gp(), $$3.gq())) : null;
   }

   @Nullable
   @Override
   public dnb a(csu $$0) {
      return super.a($$0).a(b, $$0.g());
   }

   @Override
   public int a(dnb $$0, cwh $$1, ib $$2, ih $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dnb a(dnb $$0, dgo $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dnb a(dnb $$0, dey $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
