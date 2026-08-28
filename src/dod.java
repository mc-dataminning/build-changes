import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dod extends dup {
   public static final MapCodec<dod> a = b(dod::new);
   public static final eco<jc> b = ecg.T;

   @Override
   public MapCodec<dod> a() {
      return a;
   }

   public dod(ebp.d $$0) {
      super($$0);
      this.l(this.m().b(b, jc.c));
   }

   @Nullable
   @Override
   public dyo a(iw $$0, ebq $$1) {
      return new dyu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyo> dyp<T> a(dkj $$0, ebq $$1, dyq<T> $$2) {
      return !$$0.C ? a($$2, dyq.K, ($$0x, $$1x, $$2x, $$3) -> egz.c.a($$0x, $$3.x(), $$3.gu())) : null;
   }

   @Nullable
   @Override
   public ebq a(ded $$0) {
      return super.a($$0).b(b, $$0.g());
   }

   @Override
   public int a(ebq $$0, djn $$1, iw $$2, jc $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public ebq a(ebq $$0, dui $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public ebq a(ebq $$0, dsr $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
