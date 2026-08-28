import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgj extends dmq {
   public static final MapCodec<dgj> a = b(dgj::new);
   public static final dtu b = dtq.R;

   @Override
   public MapCodec<dgj> a() {
      return a;
   }

   public dgj(dsz.d $$0) {
      super($$0);
      this.k(this.o().a(b, ji.c));
   }

   @Nullable
   @Override
   public dqf a(jd $$0, dta $$1) {
      return new dqk($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqf> dqg<T> a(dcu $$0, dta $$1, dqh<T> $$2) {
      return !$$0.B ? a($$2, dqh.J, ($$0x, $$1x, $$2x, $$3) -> dyf.c.a($$0x, $$3.go(), $$3.gp())) : null;
   }

   @Nullable
   @Override
   public dta a(cyb $$0) {
      return super.a($$0).a(b, $$0.g());
   }

   @Override
   public int a(dta $$0, dca $$1, jd $$2, ji $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dta a(dta $$0, dmk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dta a(dta $$0, dkt $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
