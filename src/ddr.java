import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddr extends djx {
   public static final MapCodec<ddr> a = b(ddr::new);
   public static final drb b = dqx.R;

   @Override
   public MapCodec<ddr> a() {
      return a;
   }

   public ddr(dqg.d $$0) {
      super($$0);
      this.k(this.n().a(b, is.c));
   }

   @Nullable
   @Override
   public dnm a(in $$0, dqh $$1) {
      return new dnr($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dnm> dnn<T> a(dad $$0, dqh $$1, dno<T> $$2) {
      return !$$0.B ? a($$2, dno.J, ($$0x, $$1x, $$2x, $$3) -> dvj.c.a($$0x, $$3.gr(), $$3.gs())) : null;
   }

   @Nullable
   @Override
   public dqh a(cwi $$0) {
      return super.a($$0).a(b, $$0.g());
   }

   @Override
   public int a(dqh $$0, czj $$1, in $$2, is $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dqh a(dqh $$0, djr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dqh a(dqh $$0, dib $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
